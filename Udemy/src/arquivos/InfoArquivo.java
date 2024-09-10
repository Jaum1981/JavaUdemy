package arquivos;

import java.io.File;
import java.util.Scanner;

public class InfoArquivo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("Get Name: " + path.getName());//nome 
        System.out.println("Get Parent" + path.getParent());//caminho
        System.out.println("Get Path" + path.getPath());//caminho completo

        sc.close();
    }
}
