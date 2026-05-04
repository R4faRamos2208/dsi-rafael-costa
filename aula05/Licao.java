package aula05;

public class Licao {
    public static void main(String[] args) {
       //Operador =
       int a = 10; //Serve para atribuir um valor a uma variável
       System.out.println(a); //Deve exibir 10

       //Operador +=
       int b = 10;
       b += 2; //Serve para somar um valor ao da variável, uma forma de encurtar b = b + 2;
       System.out.println(b); //Deve exibir 12

       //Operador -=
       int c = 10;
       c -= 2; //Serve para subtrair um valor ao da variável, uma forma de encurtar c = c - 2;
       System.out.println(c); //Deve exibir 8

       //Operador *=
       int d = 10;
       d *= 2; //Serve para multiplicar um valor ao da variável, uma forma de encurtar d = d * 2;
       System.out.println(d); //Deve exibir 20

       //Operador /=
       int e = 10;
       e /= 2; //Serve para dividir um valor ao da variável, uma forma de encurtar e = e / 2;
       System.out.println(e); //Deve exibir 5

       //Operador %=
       int f = 10;
       f %= 2; //Serve para dividir um valor ao da variável e exibir o resto da divisão, uma forma de encurtar f = f % 2;
       System.err.println(f); //Deve exibir 0

       //Operador &=
       int g = 12;
       g &= 10; /*Serve para comparar os valores nivel bit a bit. Ele compara cada bit dos dois operandos.
       O bit resultante é 1 apenas se ambos os bits correspondentes forem 1. (Bitwise AND)
       Caso contrário, o resultado é 0. Em binario, 12 = 1100; 10=1010; Comparando-os, o resultado seria 1000, equivalente a 8 em binário */
       System.out.println(g); //Deve exibir 8

       //Operador |=
       int h = 5;
       h |= 3; /*Serve para comparar os valores nivel bit a bit. Ele compara cada bit dos dois operandos.
       O bit resultante será 1 se o bit do operando esquerdo ou o bit do operando direito for 1. Ou seja, se qualquer bit for 1 = 1 (Bitwise OR)
       Se ambos forem 0, o resultado é 0. Em binario, 5 = 0101; 3=0011; Comparando-os, o resultado seria 0111, equivalente a 7 em binário*/
       System.out.println(h); //Deve exibir 7

       //Operador ^=
       int i = 5;
       i ^= 3; /*Compara cada bit dos números (ou booleanos).
       Se os bits forem diferentes, o resultado é 1; se forem iguais, é 0 (operação XOR (OU Exclusivo))
       Em binario, 5 = 0101; 3=0011; Comparando-os, o resultado seria 0110, equivalente a 6 em binário*/
       System.out.println(i); //Deve exibir 6

       //Operador >>=
       int j = 16;
       j >>= 2; /*Ele desloca os bits de uma variável para a direita um número específico de vezes
       e atribui o resultado de volta à mesma variável preservando o bit de sinal (sign-propagating right shift assignment)
       Em binario, 16 = 00010000. Ao deslocar 2 posições para a direita, ficaria 00000100 em binários, equivalente a 4 em decimal*/
       System.out.println(j); //Deve exibir 4

       //Operador <<=
       int k = 5;
       k <<= 2; /*Ele desloca os bits de uma variável para a esquerda um número específico de vezes
       e atribui o resultado de volta à mesma variável preservando o bit de sinal (left shift assignment)
       Em binario, 5 = 00000101. Ao deslocar 2 posições para a esquerda, ficaria 00010100 em binários, equivalente a 20 em decimal*/
       System.out.println(k); //Deve exibir 20
    }
}
