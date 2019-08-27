import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int a= sc.nextInt();
      switch(a)
      {
        case 1:
          //Scanner s1=new Scanner(System.in);
            int b= sc.nextInt();
          System.out.println(b*b);
          break;
          case 2:
          //Scanner s2=new Scanner(System.in);
            int c= sc.nextInt();
            int g= sc.nextInt();
          System.out.println(c*g);
          break;
        case 3:
          //Scanner s=new Scanner(System.in);
            int d= sc.nextInt();
            int e= sc.nextInt();
          System.out.println(d*e/2);
          break;
      case 4:
          //Scanner s3=new Scanner(System.in);
            float f= sc.nextInt();
          System.out.println((3.14*f*f));
          break;
      default:
        System.out.print("invalid option");
      }
    }
}