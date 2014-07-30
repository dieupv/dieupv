import java.util.Scanner;

public class TestExpression{
   public static void main (String [] args){
	  Numeral num1 = new Numeral(7);
	  Expression squ1 = new Square(num1);
	  Expression add = new Addition(squ1, new Numeral(2));
	  Expression add1 = new Square(add);
	  System.out.println(add1+"="+add1.evaluate());
		
	  Numeral num2 = new Numeral(7);
	  Expression squ2 = new Square(num2);
	  Expression sub = new Subtraction(squ2, new Numeral(2));
	  Expression sub1 = new Square(sub);
	  System.out.println(sub1+"="+sub1.evaluate());
		
	  Numeral num3 = new Numeral(7);
	  Expression squ3 = new Square(num3);
	  Expression mul = new Multiplication(squ3, new Numeral(2));
	  Expression mul1 = new Square(mul);
	  System.out.println(mul1+"="+mul1.evaluate());
		
      Numeral num4 = new Numeral(7);
	  Expression squ4 = new Square(num4);
	  Expression div = new Division(squ4, new Numeral(2));
	  Expression div1 = new Square(div);
	  System.out.println(div1+"="+div1.evaluate());
   }

}