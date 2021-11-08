import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;




// ENUNCIADO:

//Control de temperatura:

/*  Ens han demanat d'una petita estació metereològica un petit programa que donades una sèrie de temperatures ens tregui la màxima i la mínima. El programa llegeix un nombre N que seran el total de temperatures a entrar, tot seguit llegirà les N temperatures i al finalitzar de llegir-les s'imprimeix la màxima i la mínima.

Pista: per la inicialització inicial podeu usar:

int max = Integer.MIN_VALUE;
int min = Integer.MAX_VALUE;
Input Format

Introduïm un enter N: nombre total de temperatures a introduir. Introduïm N nombres enters que són les temperatures a analitzar.

Constraints

No n'hi ha.

Output Format

En la primera línia s'imprimeix la temperatura màxima i en la segona la temperatura mínima.

Sample Input 0

5
-4 3 -10 0 5
Sample Output 0

5
-10

 */






public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (count > 0)
        {
            int var = sc.nextInt();

            if (var < min)
            {
                min = var;
            }

            if (var > max)
            {
                max = var;
            }

            count--;
        }

        System.out.println(max);
        System.out.println(min);


    }
}
