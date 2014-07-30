import java.util.Scanner;
class Numeral implements Expression{
   private int value;
   public Numeral(int x){
	  value = x;
   }
   public Numeral(){
	  value = 0;
   }
   public String toString(){
	  return value+"";
   }
   public int evaluate(){
	  return value;
   }
}