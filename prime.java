public class main {
public static void main(String[] args) {
int num = 27;
boolean flag = false;
for (int i=2;i<=num/2;++i) {
//condition for non-prime number
if (num%i==0) { //if num is divisible flag set to true and break out of the loop.this determines num is not a prime number

flag=true;
break;
}
}
if (!flag) //if num is not divisible by any number flag is false and number is prime number
System.out.println(num +  "is a prime number");//prints the statement
else
System.out.println(num +  "is not a prime number");//prints the statement
}
}
