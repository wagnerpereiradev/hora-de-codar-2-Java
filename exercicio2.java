//5. Faça um programa que leia dois valores informados pelo usuário e exiba uma das três mensagens a seguir: ‘Números iguais’, caso os números sejam iguais ‘Primeiro é maior’, caso o primeiro seja maior que o segundo; ‘Segundo maior’, caso o segundo seja maior que o primeiro.
import java.util.Scanner;

public class exercicio2{
    public static void main(String[] args){
        System.out.println("Digite um número");
        Scanner num1In = new Scanner(System.in);
        double num1 = num1In.nextDouble();

        System.out.println("Digite outro número");
        Scanner num2In = new Scanner(System.in);
        double num2 = num2In.nextDouble();

        if(num1 > num2){
            System.out.println("O primeiro é maior");
        } else if(num1 < num2) {
            System.out.println("O segundo é maior");
        } else {
            System.out.println("Os números são iguais");
        }
    }
}