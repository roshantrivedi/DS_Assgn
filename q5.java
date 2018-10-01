import java.util.*;
class sumOfDig{
static int sum(int n)
    { 
        if (n == 0)
            return 0;
        return (n % 10 + sum(n / 10));
    }
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.print("Enter the Number : ");
String str =s.next();
int y=Integer.parseInt(str);
int SUM=sum(y);
System.out.print("Sum of Digit is : " + SUM);
}
}