package oop_skill;
import java.util.Scanner;
public class Alphabet {
  public static void main(String args[]) {
    char ch;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a char");
    ch = sc.next().charAt(0);
    if (( ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
      System.out.println(ch + " is a alphabet");
    }else {
      System.out.println(ch + " is not a alphabet");
  }
}
}
