import Model.Entities.Conta;
import Model.Exceptions.BusinessExceptions;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta ");
        System.out.print("Titular: ");
        String titular = sc.nextLine();
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();
        System.out.print("Limite Saque: ");
        double limiteSaque = sc.nextDouble();

        Conta conta = new Conta(numero,titular,saldo,limiteSaque );
        System.out.println();
        System.out.print("Informe uma quantida para saque R$ ");
        double quantidade = sc.nextDouble();

        //Exceção
        try {
            conta.saque(quantidade);
            System.out.printf("Novo saldo %.2f%n", conta.getSaldo());
        }catch (BusinessExceptions e){
            System.out.println(e.getMessage());
        }
    }
}
