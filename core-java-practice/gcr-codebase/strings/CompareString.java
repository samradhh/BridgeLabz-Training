import java.util.Scanner;

public class CompareString
{
	  public static void main(String[] args) 
	  {
		Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();

    boolean isEqual = true;
    if (a.length() != b.length())
	 {
      isEqual = false;
    }
	 else
	  {
      for (int i = 0; i < a.length(); i++) 
	  {
        if (a.charAt(i) != b.charAt(i))
		 {
          isEqual = false;
          break;
        }
      }
    }
    if (isEqual) {
      System.out.println("The given string are equal");
    } else {
      System.out.println("The given string are not equal");
    }
  }
}

 