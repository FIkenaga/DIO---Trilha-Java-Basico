// Contador.java
import java.util.Scanner;

/**
 *
 * @author Ikenaga
 */


public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {


           // lógica para comparar os 2 parametros.     
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {

            // Imprimindo caso o segundo numero seja maior
            System.out.println(exception.getMessage());
        } finally {
            terminal.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        
        
        // validação 2 parametros
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        // Imprimindo os parametros
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
