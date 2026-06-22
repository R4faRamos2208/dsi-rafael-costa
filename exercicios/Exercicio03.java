package exercicios;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        //Declarações
        Scanner input = new Scanner(System.in);
        boolean identificadoAngulo = false; //"Trava" pra validar a parte dos angulos
        boolean identificadoLado = false;//"Trava" pra validar a parte dos Lados
        
        //Coleta os três lados
        System.out.println("Digite o comprimento do lado A: ");
        double a = input.nextDouble();
        System.out.println("Digite o comprimento do lado B: ");
        double b = input.nextDouble();
        System.out.println("Digite o comprimento do lado C: ");
        double c = input.nextDouble();

        //Ordena em ordem decrescente usando variável "temp" (de temporaria) como suporte
        double temp;
        if (a < b) { temp = a; a = b; b = temp; }
        if (a < c) { temp = a; a = c; c = temp; }
        if (b < c) { temp = b; b = c; c = temp; }

        System.out.println("Lados ordenados (decrescente): " + a + ", " + b + ", " + c);

        //Verifica se NÃO forma triângulo — encerra aqui se for o caso
        if (a >= b + c) {
            System.out.println("Esses lados não formam triângulo algum.");
            input.close(); //Tive que colocar o input.close() aqui também porque nos casos que o triangulo não existe, o scanner não era fechado
            return; //Apremdi que esse "return" serve pra encerrar o código main() porque antes, mesmo após printar que o triângulo não existia, o código continuava rodando
        }

        //Classificação pelo ÂNGULO
        if (!identificadoAngulo && a * a == b * b + c * c) {
            System.out.println("Classificação pelo ângulo: triângulo retângulo.");
            identificadoAngulo = true;
        }
        if (!identificadoAngulo && a * a > b * b + c * c) {
            System.out.println("Classificação pelo ângulo: triângulo obtusângulo.");
            identificadoAngulo = true;
        }
        if (!identificadoAngulo) {
            System.out.println("Classificação pelo ângulo: triângulo acutângulo.");
        }

        //Classificação pelo LADO

        if (!identificadoLado && a == b && b == c) {
            System.out.println("Classificação pelo lado: triângulo equilátero.");
            identificadoLado = true;
        }
        if (!identificadoLado && (a == b || b == c || a == c)) {
            System.out.println("Classificação pelo lado: triângulo isósceles.");
            identificadoLado = true;
        }
        if (!identificadoLado) {
            System.out.println("Classificação pelo lado: triângulo escaleno."); //Classificaçao bonus que não foi solicitado, se todos os lados forem diferntes, ele é escaleno
        }

        input.close();
    }
}