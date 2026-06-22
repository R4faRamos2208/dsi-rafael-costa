package exercicios;
import java.util.Scanner;
public class Exercicio02 {
     public static void main(String[] args) {
        //Declarações
        Scanner input = new Scanner(System.in);
        boolean generoValido = false;
        float bonus = 100.00f;
        int genero = 0;
        //Coleta codigo do funcionario
        System.out.println("Digite seu código de funcionário: ");
        int codigo = input.nextInt();

        //Loop pra pega o genero da pessoa e garantir que seja um valor válido
        while (!generoValido){
            System.out.println("Qual seu gênero?\nDigite '1' para 'Masculino'\nDigite '2' para 'Feminino'");
            genero = input.nextInt();
            switch(genero) {
                case 1:
                    generoValido = true;
                    break;
                case 2:
                    generoValido = true;
                    break;
                default:
                    System.out.println("Tente novamente, número inválido");
            }
        }
        //Pega o tempo de trabalho
        System.out.println("Digite seu tempo de trabalho, em anos: ");
        int tempoTrabalho = input.nextInt();

        //Pega o salário
        System.out.println("Digite seu salário: ");
        float salarioAtual = input.nextFloat();

        //Operacoes com o bonus
        
        //Para homens com tempo de trabalho superior a 15 anos
        if (genero == 1 && tempoTrabalho > 15) {
            bonus = salarioAtual * 0.2f; //Curiosidade bizarra que fica de apredizagem, tava dando erro pq não tinha o f do lado e por padrão tava reconhecendo como double
        }

        //Para mulheres com tempo de trabalho superior a 10 anos
        if (genero == 2 && tempoTrabalho > 10) {
            bonus = salarioAtual * 0.25f;
        }
        //Por padrão o bonus esta como 100, então não preciso fazer outro if pra quem não entra nesses dois casos acima
        float salarioFinal = salarioAtual + bonus;
        System.out.println("Olá funcionário do código: " + codigo + ", Segue abaixo suas informações:\nSalário: " + salarioAtual + "\nBonus: " + bonus + "\nSalário junto ao bonus: " + salarioFinal);
        input.close();
     }
}
