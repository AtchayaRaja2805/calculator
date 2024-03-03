import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        while(true)
        {
            System.out.print("Enter an operator :");
            char ch=sc.next().charAt(0);
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%')
            {
                System.out.println("Enter a number :");
                int num1=sc.nextInt();
                System.out.println("Enter a number :");
                int num2=sc.nextInt();
                if(ch=='+')
                ans=num1+num2;
                if(ch=='-')
                ans=num1-num2;
                if(ch=='*')
                ans=num1*num2;
                if(ch=='/')
                if(num2!=0)
                ans=num1/num2;
                if(ch=='%')
                ans=num1*num2;
            }
            else if(ch=='x'||ch=='X')
            break;
            else
            {
                System.out.print("Enter a valid operator");
                break;
            }
            System.out.println(ans);
        }
    }
}