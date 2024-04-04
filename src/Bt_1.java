import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Bt_1 {
        public static void main(String[] args) {
            //Tạo đường dẫn tới file text
            String filePath = "sample.txt";

            try {
                //Đọc nội dung từ file
                String content = readFile(filePath);
                //Chia nội dung thành các từ
                String[] words = content.split("\\s+");
                //In ra số lượng từ
                System.out.println("Số lượng từ trong file: " + words.length);
            } catch (IOException e) {
                System.err.println("Đã xảy ra lỗi khi đọc file: " + e.getMessage());
            }
        }

        // Hàm đọc nội dung từ file và trả về dưới dạng String
        public static String readFile(String filePath) throws IOException {
            StringBuilder content = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
            }
            return content.toString();
        }
}
