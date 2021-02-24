// 2.a Look at the file TaskTwoA and fill out the missing line, using the happy boolean. 
// 2.b Write a function that receives two integers as parameters and returns the sum of them.
// 2.c Write a function that receives a string and returns it as uppercase. (Hint: ".toUpperCase()". Further hint: https://www.w3schools.com/jsref/jsref_toUpperCase.asp )
// 2.d Write a function that receives a string and returns true if the first letter of the string is uppercase. (Hints: ".charAt(0)" and "Character.isUpperCase('a');" )
import java.lang.*;


class Main{
  public static boolean happy = true;
  public static int first = 10;
  public static int second = 20; 

  public static void main(String [] args) {
     if (iAmHappy())
     {
       System.out.println("I clap my hands");
     }
     else
     {
       System.out.println("I don't clap my hands"); 
     }

     System.out.println(returnSum(first, second));

     System.out.println(upperCased("sodavand"));

    System.out.println(isItUpperCased("Sodavand"));     

  }


  public static boolean iAmHappy()
  {
    
    
    return happy;     // 2.a Changed true to happy
  }

  public static int returnSum(int a, int b) {
    int sum = a + b;
    return sum;
  }

  public static String upperCased(String word) {
    String result = word.toUpperCase();
    return result;
  }

  public static boolean isItUpperCased(String word) {
    char a = word.charAt(0);
    if (Character.isUpperCase(a)) {
      return true;
    } else {
      return false;
    }
  
  }
}



