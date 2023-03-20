import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numFuncionarios = 3; // Atribuindo valor
        double somaSalario = 0;

        for (int i = 1; i<= numFuncionarios; i++) {
            System.out.print("Informe o salário do funcionário " + i + ": ");
            double salario = scanner.nextDouble();
                //  'i++' é utilizado para atribuir o valor da variável 'i' na função do loop for
                // permite que o loop visualize todos os funcioários e obtenha os dados informados

            somaSalario += salario;
        }

        double mediaSalarial = somaSalario / numFuncionarios;

        System.out.println("A média salarial da empresa é: " + mediaSalarial);

        scanner.close();

    }
}