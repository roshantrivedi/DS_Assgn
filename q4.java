import java.util.*;
class xPowery
{
  static int power(int x, int y){
        if (y != 0)
            return (x * power(x,y- 1));
        else
            return 1;
    }
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int x=s.nextInt();
    int y=s.nextInt();      
    int result = power(x,y);
    System.out.printf("%d^%d = %d", x, y, result);
    }
}