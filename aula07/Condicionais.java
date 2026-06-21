package aula07;

public class Condicionais {
    public static void main(String[] args) {
    //As Condicionais são estruturas que apenas permitem algo ser realizado SE uma condição for verdadeira (TRUE)
    
    // IF: o IF é uma estrutura condicional que sua tradução seria "SE", ele é um bloco onde faz uma comparação e SE for verdadeira, executa algo. Exemplo:
        boolean isRaining = true;

        if (isRaining) {
            System.out.println("Bring an umbrella!"); //Nesse caso, se a condição "IsRaining" for verdadeira, exibirá a frase "Bring an umbrella!"
        }

    // Else: o Else é uma estrutura condicional que sua tradução seria "SENÃO", ele vem sempre acompanhado do IF e serve para executar algo se a condição não for verdadeira. Exemplo:
        boolean temJogoDoBrasil = false;

        if (temJogoDoBrasil) {
            System.out.println("TEMMM! Vai Brasil");
        } else {
            System.out.println("Não tem jogo hoje :("); //Nesse caso, como a condição é falsa, ela passará do IF e cairá no Else e exibirá "Não tem jogo hoje :("
        }

    //Else IF: o Else IF é uma estrutura condicional que sua tradução seria "SENÃO SE", ele vem sempre acompanhado de IF e ELSE e serve para colocar uma segunda condicional. Exemplo:
        float notaAluno = 6;

        if (notaAluno > 7) {
            System.out.println("Aprovado");
        } else if (notaAluno > 5){
            System.err.println("Recuperação"); //Nesse caso, como a nota é 6, ela entra no "meio termo", ou seja, aparecerá "Recuperação"
        } else {
            System.out.println("Reprovado");
        }
    
    
    //SWITCH CASE: o Switch Case é uma estrutura condicional usada pra evitar vários "else", porém ela é usada quando a entrada é algo específico. Exemplo:
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
}
    //Ira exibir o dia que aparece no case 4 porque a entrada é 4, ou seja, "Thursday"
    
    }
  }
