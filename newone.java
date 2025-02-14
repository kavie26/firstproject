import java.util.Scanner;
class newone{
    int gcd(int a, int b){
        while(a!=0){
            int temp = a;
            a =b%a;
            b = temp;
        }
        return b;
    }
    public static void main(String args[]){
        newone obj = new newone();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(obj.gcd(a,b));
    }
}