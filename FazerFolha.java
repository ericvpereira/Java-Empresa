import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Locale; // adicione esta linha

public class FazerFolha {
    
    public static void main(String[] args) throws IOException {

        File arquivo = new File("c:/Users/WINDOWS/Documents/Java-Aulas/Java-Empresa/Empresa/Empregados.txt");
        System.out.println("Arquivo existe? " + arquivo.exists());
        Scanner diskScanner = new Scanner(arquivo);
        diskScanner.useLocale(Locale.US); // adicione esta linha

        for (int empNum = 1; empNum <= 3; empNum++) {
            pagarUmEmpregado(diskScanner);
        }
    }

    static void pagarUmEmpregado(Scanner aScanner) {
        Empregado umEmpregado = new Empregado();

        umEmpregado.setNome(aScanner.nextLine());
        umEmpregado.setCargo(aScanner.nextLine());
        if (aScanner.hasNextDouble()) {
            umEmpregado.preencherCheque(aScanner.nextDouble());
            if (aScanner.hasNextLine()) { // Consome o resto da linha, se existir
                aScanner.nextLine();
            }
        } else {
            System.out.println("Erro ao ler o salário do empregado.");
        }
    }
}
