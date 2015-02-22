package imult;
/*
 * Class StudentCode: class for students to implement 
 * the specific methods required by the assignment:
 * add()
 * sub()
 * koMul()
 * (See coursework handout for full method documentation)
 */

public class StudentCode {
  public static BigInt add(BigInt A, BigInt B) {
    // student needs to implement
	  
	  int size = Math.max( A.length(),B.length());
	  for(int i=0;i<size;i++){
		  Unsigned carry = null;
		  Unsigned digit =null;
		  DigitCarry current = Arithmetic.addDigits(A.getDigit(i),B.getDigit(i),carry);
		  carry = current.carry();
		  digit = current.digit();
		  
		  }
	  
	  
  }
  public static BigInt sub(BigInt A, BigInt B) {
    // student needs to implement
  }
  public static BigInt koMul(BigInt A, BigInt B) {
    // student needs to implement
  }
  public static BigInt koMulOpt(BigInt A, BigInt B) {
    // student needs to implement
  }
  public static void main(String argv[]) {

  }
} //end StudentCode class
