package arquivos;

import java.io.File;
import java.util.Scanner;

public class ManipulacaoDePastas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String pathLine = sc.nextLine();

        File path = new File(pathLine);

        File[] folders = path.listFiles(File::isDirectory); //lista so diretorios
        System.out.println("Folders: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("Files: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(pathLine + "subdir").mkdir(); //cria um subdiretorio(pasta)
        System.out.println(success);

        sc.close();
    }
}
