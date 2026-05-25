package exercicios;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        //Declaração Scanner
        Scanner input = new Scanner(System.in);

        //Declaração Variaveis
        double salarioPosIR;

        //Inserindo nome do funcionário
        System.out.println("Insira o nome do funcionário: ");
        String nomeFunc = input.nextLine();

        //Inserindo quantidade de horas trabalhadas
        System.out.println("Insira a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = input.nextInt();

        //Inserindo valor rexebido por hora
        System.out.println("Insira o valor recebido por HORA: ");
        double valorPorHora = input.nextDouble();

        //Inserindo quantidade de filhos com idade inferior a 14 anos
        System.out.println("Insira a quantidade de filhos com idade inferior a 14 anos: ");
        int quantFilhos = input.nextInt();

        //Inserindo Idade do cabra bom
        System.out.println("Insira sua idade: ");
        int idade = input.nextInt();

        //Inserindo tempo de serviço do funcionário
        System.out.println("Insira seu tempo de serviço (em anos): ");
        double tempoContribuicao = input.nextDouble();

        //Inserindo salário familia por filho
        System.out.println("Insira o valor recebido pelo salário familia por filho: ");
        double salarioPorFilho = input.nextDouble();

        //Calculando salário bruto
        double salarioBruto =  (horasTrabalhadas * valorPorHora) + (quantFilhos * salarioPorFilho);
        System.out.println("Seu salário bruto é: " + salarioBruto);

        //Calculando desconto do INPS
        double salarioDescontoInps = salarioBruto - (8.5/100);
        System.out.println("Seu salário após desconto do INPS é : " + salarioDescontoInps);

        //Calculando Imposto de Renda
        if (salarioDescontoInps > 1500) {
            salarioPosIR = salarioDescontoInps - salarioDescontoInps * (15/100);
        }
        else if (salarioDescontoInps > 500) {
            salarioPosIR = salarioDescontoInps - salarioDescontoInps * (8/100);
        }
        else {
            salarioPosIR = salarioDescontoInps;
        }

        System.out.println("Seu salário após descontos do IR é: " + salarioPosIR);
        
        //Calcular Adicionais

        //Adicional de idade
        if (idade>40){
            salarioPosIR += salarioBruto * (2/100);
        }

        //Adicional tempo de serviço
        if (tempoContribuicao > 15) {
            salarioPosIR += salarioBruto * (3.5/100);
        } 
        else if (tempoContribuicao > 5 || idade > 30) {
            salarioPosIR += salarioBruto * (1.5/100);
        }
        

   }    
    
}
