import java.util.Scanner;
class Square extends Expression{
   private Expression expression;
   public Square(Expression x){
	  expression = x;
   }
   public String toString(){
	  return expression.toString()+"^2";
   }
   public int evaluate(){
	  return expression.evaluate()*expression.evaluate();
   }
}