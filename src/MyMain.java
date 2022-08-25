import java.util.Scanner;

public class MyMain  {
    public int num1;
    public int num2;
    public int sum(int num1,int num2) throws MyFirstException{
        int sum=num1+num2;
        if(sum<150){
            throw new MyFirstException("Customer Exception Occur");
        }

        return sum;
    }

    public static void main(String[] args) {
        MyMain myMain=new MyMain();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        try{
            
            int result=myMain.sum(num1, num2);
            System.out.println("result = " + result);
        }catch (MyFirstException e){
            System.out.println("e = " + e);
        }
    }
}
