public class palindrome {
public static void main(String[] args) {
int num=252,reversedInteger=0,remainder,originalInteger;
originalInteger=num;//num value is stored in the originalInteger
//reversed integer is stored in the variable
while(num!=0)//on each iteration last digit of number is stored in the remainder
{
remainder=num%10;
reversedInteger=reversedInteger*10+remainder;//remainder is added to reversedInteger such that it  is added to next place value (multiplication by 10)
num/=10;//last digit is removed from num after divison by 10
}
//palindrome if originalInteger and reversedInteger are equal
if (originalInteger == reversedIntegers)
System.out.println(originalInteger + "is a palindrome");
else
System.out.println(originalInteger + "is not a palindrome");
}
} 
