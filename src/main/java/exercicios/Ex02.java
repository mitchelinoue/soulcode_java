import java.util.Scanner;

/*Faça um programa que:
        - Leia a cotação do dólar
        - Leia um valor em dólares
        - Converta esse valor para Real
        - Mostre o resultado*/

public class Ex02 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o valor da cotação de um dólar em reais?");
        double cotacao = entrada.nextDouble();

        System.out.println("Qual a quantidade de dólares que gostaria de converter?");
        double valor = entrada.nextDouble();

        double conversao = cotacao * valor;

        System.out.println("O valor em reais de $" + valor + " dólares é de: R$" + conversao + ".");

    }
}
