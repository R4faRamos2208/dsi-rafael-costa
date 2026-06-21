package exercicios;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        //Declaração Scanner
        Scanner input = new Scanner(System.in);

        //Declaração Variaveis
        double ir = 0;
        double adicional = 0; //Tive que inicializa senão não rodava :(

        //Inserindo nome do funcionário
        System.out.println("Insira o nome do funcionário: ");
        String nomeFunc = input.nextLine();

        //Inserindo quantidade de horas trabalhadas
        System.out.println("Insira a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = input.nextInt();

        //Inserindo valor recebido por hora
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
        double salarioBruto = horasTrabalhadas * valorPorHora;
        System.out.println("Seu salário bruto é: " + salarioBruto);

        //Calculando salário família
        double salarioFamilia = quantFilhos * salarioPorFilho;
        System.out.println("Seu salário família é: " + salarioFamilia);

        //Calculando desconto do INPS (8,5% do salário bruto)
        double descontoInps = salarioBruto * 0.085;
        System.out.println("Seu desconto do INPS é: " + descontoInps);

        //Calculando Imposto de Renda (com base no salário bruto)
        if (salarioBruto > 1500) {
            ir = salarioBruto * 0.15;
        }
        if (salarioBruto > 500 && salarioBruto <= 1500) {
            ir = salarioBruto * 0.08;
        }
        System.out.println("Seu desconto de IR é: " + ir);

        //Calcular Adicionais

        //Adicional de idade
        if (idade > 40) {
            adicional += salarioBruto * 0.02;
        }

        //Adicional tempo de serviço
        if (tempoContribuicao > 15) {
            adicional += salarioBruto * 0.035;
        }
        if (tempoContribuicao <= 15 && tempoContribuicao > 5 && idade > 30) {
            adicional += salarioBruto * 0.015;
        }

        //Total de descontos
        double totalDescontos = descontoInps + ir;

        //Salário líquido
        double salarioLiquido = salarioBruto - totalDescontos + adicional + salarioFamilia;

        //Resultados
        System.out.println("Informações:");
        System.out.println("Funcionário: " + nomeFunc);
        System.out.println("Salário bruto: " + salarioBruto);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Adicionais: " + adicional);
        System.out.println("Salário líquido: " + salarioLiquido);

         input.close();
   }

}