package aula06;
public class Comparacoes {
    public static void main(String[] args) {
    /* 
    Comparadores:
    ==	Igual a	x == y	
    !=	Diferente	x != y	
    >	Maior que	x > y	
    <	Menor que	x < y	
    >=	Maior ou igual a    x >= y	
    <=	Menor ou igual a	x <= y
    */

        int age = 18;

        System.out.println(age >= 18); // true
        System.out.println(age < 18);  // false

    /*
    && Retorna true se ambas afirmações forem verdadeiras, uso: x < 5 &&  x < 10	
    || Retorna true se uma das afirmações forem verdadeiras, uso:	x < 5 || x < 4	
    !  Inverte o resultado da afirmação, se for true será false, se for false será true	!(x < 5 && x < 10) 
    */
    
        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("Regular user: " + (isLoggedIn && !isAdmin)); //Neste caso, ao usar && espera que ambos sejam true, porém ao usar ! antes de isAdmin, voce inverte o valor esperado para false
        System.out.println("Has access: " + (isLoggedIn || isAdmin));
        System.out.println("Not logged in: " + (!isLoggedIn));

    /*
    If e Else:
    Condicionais que traduzidos seriam Se / Senão, onde a estrutura seria:
    if (comparação){*atividade realizada se a comparacao for verdadeira;}
      else {*atividade realizada se a comparacao for falsa}
    
    EXEMPLOS:
     */
        boolean isRaining = true;

        if (isRaining) {
            System.out.println("Bring an umbrella!");
        }
        else {
            System.out.println("Not bring an umbrella!");
        }
    }
}