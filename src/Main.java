import methods.CRUDImpl;
import model.Product;

import javax.management.InstanceNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.CountDownLatch;

public class Main {
    static CRUDImpl crud = new CRUDImpl();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        do {
            int pageNumber = 1;
            int pageSize = crud.setNewRow();
            List<Product> productList = new ArrayList<>();
            System.out.println("""
                    #######################################################################
                    (Dis)play (Ra)ndom (C)reate (R)ead (D)elete (U)pdate (S)earch Bac(k)up
                    #######################################################################""");
            System.out.print("Please choose options : ");
            String op = scanner.nextLine();
            switch (op) {
                case "dis" -> {
                    productList = crud.readProductsFromFile("product.bak");
                    crud.displayAllProduct(productList, pageNumber, pageSize);
                }
                case "o" -> crud.setPageSize(scanner);
                case "ra" -> crud.randomRecord(productList);
                case "c" -> crud.createProduct(productList);
                case "r" -> crud.readProduct(productList);
                case "d" -> crud.deleteProduct(productList);
                case "u" -> crud.updateProduct(productList);
                case "s" -> crud.searchProductByName(productList);
                case "k" -> {
                    String sourceFilePaths = "product.bak";
                    String backupDirectory = "backup/";
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
                    String timestamp = dateFormat.format(new Date());
                    String backupFileName = "backupfile_" + timestamp + ".bak";
                    String backupFilePath = backupDirectory + backupFileName;

                    System.out.print("Are you sure to Backup [Y/N]: ");
                    String ch = scanner.nextLine();
                    try {
                        if (ch.equalsIgnoreCase("y")) {
                            Duration backUpDuration = crud.timeOperation(() -> {
                                crud.backupProductListToFile(sourceFilePaths,backupFilePath);
                            });
                            System.out.println("Time taken to backup the data to file: " + backUpDuration.toMillis() + " milliseconds");
                        }

                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        } while (true);
    }
}