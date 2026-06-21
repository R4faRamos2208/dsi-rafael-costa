package aula07;

public class BreakAndContinue {
    public static void main(String[] args) {
    //Break and Continue são o que podemos chamar de "comando de desvios"

    //Break: O Break serve para PARAR o loop e sair dele. Exemplo:
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        } // Esse loop iria até i ser igual a 10 porém é interrompido ao chegar em 4 com o break
        
        System.out.println("--------------------------------------------------");

    //Continue: O Continue serve para pular a interação atual porém seguir o Loop. Exemplo:
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        } // Esse loop após o continue vai continuar, mas vai pular a interção de quando i == 4
    }
}