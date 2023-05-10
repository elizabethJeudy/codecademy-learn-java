
/*
 * n this project, you will become a mathemagician and write a small program 
 * that performs a mathematical magic trick! It will involve performing arithmetic 
 * operations on an integer that you choose
 */




public class MathMagic {
  public static void main(String[] args) {
    int myNumber = 1000;
// variable will now be referred to as original number
int stepOne = myNumber * myNumber;
int stepTwo = stepOne + myNumber;	
int stepThree =stepTwo / myNumber;	
int stepFour = stepThree + 17;
int stepFive = stepFour - myNumber;
int stepSix = stepFive / 6;
System.out.println(stepSix);
  }
}


// results are the same no matter what the nyNumber value is. Its math magic!!