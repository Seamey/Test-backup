import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        String folderPath = "backup"; // Replace with the actual folder path

        try {
//            listAllFilesInFolder(folderPath);
            File file = new File(folderPath);
            File [] files = file.listFiles();
            for(int i=0; i<files.length; i++){

                System.out.println((i+1)+"." + files[i].getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static void listAllFilesInFolder(String folderPath) throws IOException {
//        File file = new File(folderPath);
//        File [] files = file.listFiles();
//        for(int i=0; i<files.length; i++){
//
//            System.out.println((i+1)+"." + files[i].getName());
//        }
//
//    }

}
