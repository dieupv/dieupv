import java.util.Scanner;
class Division extends BinaryExpression{
   private Expression left;
   private Expression right;
   public Division (Expression l, Expression r){
	  left = l;
	  right = r;
   }
   public String toString(){
	  return "("+left.toString()+ "/" +right.toString()+")";
   }
   public int evaluate(){
	  if(right.evaluate()!= 0)
	     return (left.evaluate()/right.evaluate());
      else return 0;
      }
}