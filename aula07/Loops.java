package aula07;

public class Loops {
    public static void main(String[] args) {
      
    //Loops são estruturas de repetição que serverm para repetir bloco de códigos várias vezes

    //While: O While é uma estrutura de repetição que executa um bloco de código ENQUANTO uma condição for verdadeira. Exemplo:`
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        } //Vai executa esse bloco de código até a variável i ter valor 5

        System.out.println("--------------------------------------------------");

    //Do While: O Do While é uma estrutura de repetição que nada mais é que uma variante do WHILE, exercendo a mesma função. Exemplo:
        int j = 0;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 5); //Vai executa até a variável j ter valor 6 (MUITO IMPORTANTE LEMBRAR DE COLOCA PONTO E VIRGULA APÓS O WHIILE)

        System.out.println("--------------------------------------------------");

    //For: O For é a estrutura de repetição onde você sabe exatamente quantas vezes quer "rodar" aquele bloco de código, porque ele é mais preciso para controlar. Exemplo:
        for (int k = 0; k < 5; k++) {
            System.out.println(k);
        }
    //Sua sintaxe é simples de entender:
    // for (statement 1; statement 2; statement 3) { bloco de código }
    // statment 1 = é executada uma vez após rodar a estrutura e serve para declarar a variável
    // statment 2 = define a condição
    // statment 3 = é executado toda vez que volta o loop e ele atualiza o valor da variável
    }
  }