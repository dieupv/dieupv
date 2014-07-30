import java.util.Scanner;
class Addition implements BinaryExpression{
   private Expression left;
   private Expression right;
   public Addition (Expression l,Expression r){
	  left = l;
	  right = r;
   }
   public String toString(){
	  return "("+left.toString()+ "+" +right.toString()+")";
   }
   public int evaluate() {
	  return left.evaluate()+right.evaluate();
   }
}