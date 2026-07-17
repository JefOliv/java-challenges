import java.util.Scanner;

public class ExercicioBancoAlura {
    public static void main(String[] args) {
        //Dados inicias do Cliente
        String nomeDoCliente = "Jeferson Torresx";
        String tipoDeConta = "Conta Corrente";
        double saldoDaConta = 2500;

        System.out.printf("""
                ***********************************************************
                
                Dados do Cliente:
                
                Nome: %s.
                Tipo da conta: %s
                Saldo em conta: %.2f
                
                ***********************************************************
                """,nomeDoCliente, tipoDeConta, saldoDaConta);

        //menu inicial
        int opcaoMenu = 0;


        String menu = """
                    Escolha uma das opções a baixo:
                    1- Consultar saldo.
                    2- Depositar valor.
                    3- Transferir valor.
                    4- Finalizar operaão.
                    """;

        Scanner escolha = new Scanner(System.in);

        while (opcaoMenu != 4){
            System.out.println(menu);
            opcaoMenu = escolha.nextInt();

            if (opcaoMenu == 1) {
                System.out.println("O saldo da conta é de " + saldoDaConta);
            } else if (opcaoMenu == 2) {
                System.out.println("Digite o valor que deseja depoisitar: ");
                double valorDeposito = escolha.nextDouble();
                saldoDaConta += valorDeposito;
                System.out.printf("O saldo da conta agora é de R$ %.2f\n", saldoDaConta);
            } else if ( opcaoMenu == 3) {
                System.out.println("Digite o valor que deseja transferir: ");
                double valorParaTransferencia = escolha.nextDouble();
                if (valorParaTransferencia > saldoDaConta) {
                    System.out.println("Operação invalida! Saldo insuficiente.\n");
                }else {
                    saldoDaConta -= valorParaTransferencia;
                    System.out.printf("O saldo da conta agora é de R$ %.2f\n", saldoDaConta);
                }
            } else if (opcaoMenu == 4) {
                break;
            }else{
                System.out.println("Digite uma opção valida!");
            }
        }
    }
}
