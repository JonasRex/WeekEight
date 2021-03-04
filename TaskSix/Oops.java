/*
 *
 * Hvis du kompilerer programmet får du 7 fejl.
 * Kan du fixe programmet så det kan køre og
 * outputtet bliver:
 * "7 is the smallest!"
 *
 * 
 */

class Oops {

  public static void main(String[] args) {
    int a = 7, b = 42;
    char x = minimum(a,b);
    if (x == 'a') {
      System.out.println("a is the smallest!");

    } else {
      System.out.println("b is the smallest!");
    }
  }
  
  public static char minimum(int a, int b) {
    char smaller; 
    if (a < b) {
      smaller = 'a';
    } else {
      smaller = 'b';
    }
    return smaller;
  }
}





/*
Liste over fejl:
-----------------
1: Fjernet public fra class Oops.
2: ændrede smaller til minimum i if statementet
3: Ændrede minimum klassen til char i stedet for void.
4: a / b er ikke et int, men et char
5: ændrede minimum(a, b); til char x = minimum(a, b)
6: Ændrede til ingen argumenter i et else statement.
7: Ændrede tuborg klummer til paranteser.
8: Tilføjet også et println til alternativ b + ændrede if statementet til 'a'.
*/