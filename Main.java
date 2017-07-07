# inba
import java.io.*;
import java.util.*;
public class Main
{
  
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int a,b,c,d=0;
    System.out.println("Enter an integer");
    a=Integer.parseInt(br.readLine());
    b=a;
    while(a>0)
    {
      c=a%10;
      a=a/10;
      d=(d+(c*c*c));
      }
      if(b==d)
      {
        System.out.println("armstrong number");
        }
        else
        {
          System.out.println("no armstrong number");
        }
        }
          }
    
