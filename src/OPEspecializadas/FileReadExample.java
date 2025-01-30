package OPEspecializadas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReadExample {
    public static void main(String[] args) {
        String filePath = "output.txt";

        try(Stream<String> lines = Files.lines(Paths.get(filePath))) {
            lines.filter(line -> !line.isBlank())  //ignora as linhas vazias
                    .map(String::toUpperCase)       //converte para caixa alta
                    .forEach(System.out::println); //
        } catch(IOException e){
            e.printStackTrace();
        }

    }
}
