package OPEspecializadas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteExample {
    public static void main(String[] args) {
        List<String> data = List.of("Java Streams", "File Operations", "Efficient Processing");

        try{
            Files.write(Paths.get("output.txt"), data);
            System.out.println("File written successfully");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
