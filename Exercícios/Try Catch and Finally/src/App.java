import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        File file = new File("c:\\temp\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
        finally {
            if(sc != null) {
                System.out.println("O bloco if foi acionado");
                sc.close();
            }
            System.out.println("Finalizando o finally");
        }
    }
}
