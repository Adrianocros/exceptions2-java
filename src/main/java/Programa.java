import Model.Entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta ");
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();
        System.out.print("Limite Saque: ");
        double limiteSaque = sc.nextDouble();

        Conta conta = new Conta(numero,titular,saldo,limiteSaque );
        System.out.println();
        System.out.print("Informe uma quantida para saque R$ ");
        double quantidade = sc.nextDouble();


        String error = conta.validacaoSaque(quantidade);

        if(error != null){
            System.out.println(error);
        } else {
            conta.saque(quantidade);
            System.out.printf("Novo saldo %.2f%n", conta.getSaldo());
        }
    }
}
