import java.util.*;
class RomanToInteger
{
  // Global Variables
  int I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;
  
  /**
   * Converts from roman to int.
   * @param s Roman number provided by user.
   * @return
   */
  public int romanToInt(String s) {
    int sum = 0;
    for( int i = 0; i< s.length(); i++) {
      if(i != s.length()-1)
      {
        if (getInt(s.charAt(i))>=getInt(s.charAt(i+1))) {
            sum+= getInt(s.charAt(i));
        } else {
            sum+= -getInt(s.charAt(i));
        }
      } 

      else if (i == s.length()-1) {
        sum+= getInt(s.charAt(i));
      }
    }
    System.out.println(sum);
    return sum;
  }

  /**
   * Gets integer representation of Roman Number.
   * @param ch character passed at the specified index to convert to integer.
   * @return integer representation of that specified character.
   */
  public int getInt(char ch) {
    switch(ch) {
        case 'I':
            return this.I;
        case 'V':
            return this.V;
        case 'X':
            return this.X;
        case 'L':
            return this.L;
        case 'C':
            return this.C;
        case 'D':
            return this.D;
        case 'M':
            return this.M;
        default:
            System.out.println("Something wrong in provided input");
            return 0;
    }
  }

  public static void main(String [] args)
  {
    RomanToInteger obj = new RomanToInteger();
    System.out.println("Please enter a number in Roman format that needs to be converted to Integer");
    Scanner sc = new Scanner (System.in);
    String s = sc.next();
    int num = obj.romanToInt(s);

    // Displaying the number.
    System.out.println("Here's the number " + s + " in Integer Representation -> " + num);
  }
}

