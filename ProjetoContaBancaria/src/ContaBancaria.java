import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

//Atributo	Tipo	Exemplo
//* Numero	Inteiro	1021
//* Agencia	Texto	067-8
//* Nome Cliente	Texto	MARIO ANDRADE
//* Saldo	Decimal	237.48

/*Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
Programa: "Por favor, digite o número da Agência !"
Usuário: 1021 (depois ENTER para o próximo campo)
Revise sobre concatenação e classe String com método concat
Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
*/

        Scanner scanner = new Scanner(System.in);


        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta= scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor digite o nome e sobrenome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor digite o saldo: ");
        Double saldoConta = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldoConta + " já está disponível para saque!");


    }
}