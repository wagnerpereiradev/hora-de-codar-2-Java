//7. Faça um programa que receba quatro valores informados pelo usuário, mas informe somente o primeiro, o último e o maior de todos eles (considere que todos os números informados serão diferentes)
import java.util.Scanner;
import java.util.Arrays;

public class exercicio4{
    public static void main(String[] args){
        int[] nums = new int[4];
        int maior = 0;

        for(int i = 0; i < 4; i++){
            System.out.println("Digite um número");
            Scanner in = new Scanner(System.in);
            nums[i] = in.nextInt();

            if(i == 0){
                maior = nums[i];
            }
            
            if(nums[i] > maior){
                maior = nums[i];
            }
        }

        System.out.println("O primeiro número é: " + nums[0]);
        System.out.println("O último número é: " + nums[3]);
        System.out.println("O maior número é: " + maior);
    }
}