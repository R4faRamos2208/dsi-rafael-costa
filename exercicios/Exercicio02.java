package exercicios;
import java.util.Scanner;
public class Exercicio02 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean generoValido = false;

        System.out.println("Digite seu código de funcionário: ");
        int codigo = input.nextInt();

        while (!generoValido){
        System.out.println("Qual seu gênero?\nDigite '1' para 'Masculino'\nDigite '2' para 'Feminino'");
        int genero = input.nextInt();
        switch(genero) {
            case 1:
                generoValido = true;
                break;
            case 2:
                generoValido = true;1
                break;
            default:
               System.out.println("Tente novamente, número inválido");
        }
        }
        
     }
}
