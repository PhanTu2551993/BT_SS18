import java.io.*;

public class Bt_2 {

    public static void copyFile(String sourcePath, String destPath) {
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try (InputStream inputStream = new FileInputStream(sourceFile);
             OutputStream outputStream = new FileOutputStream(destFile)) {

            byte[] buffer = new byte[1024];
            int length;
            int totalBytesCopied = 0;

            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
                totalBytesCopied += length;
            }
            System.out.println("File copied successfully.");
            System.out.println("Number of bytes copied: " + totalBytesCopied);

        } catch (FileNotFoundException e) {
            System.err.println("Source file not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error occurred while copying the file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        String sourcePath = "source.txt";
        String destPath = "destination.txt";

        copyFile(sourcePath, destPath);
    }
}


