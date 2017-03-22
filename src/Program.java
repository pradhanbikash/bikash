

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {

        int lineCount = 0;

        // Get BufferedReader.
        BufferedReader reader =
            new BufferedReader(new FileReader("D:\\ggg.txt"));

        // Call readLine to count lines.
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            lineCount++;
        }
        reader.close();

        // Display the line count.
        System.out.println("Line count: " + lineCount);
    }
}
