package methods;

import model.Product;

import java.util.List;
import java.util.Scanner;

public interface CRUD {
    List<Product> readProductsFromFile(String fileName);
    void randomRecord(List<Product> productList);
    void createProduct(List<Product> productList);
    void deleteProduct(List<Product> productList);
    void readProduct(List<Product> productList);
    void updateProduct(List<Product> productList);
    int displayAllProduct(List<Product> productList, int pageNumber, int pageSize);
    void searchProductByName(List<Product> productList);
    int setNewRow();
    void setPageSize(Scanner scanner);
    int savePageSize(int pageSize);

}
