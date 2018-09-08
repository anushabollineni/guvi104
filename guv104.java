import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
Scanner sc=new Scanner(System.in);
int base,exp;
 base=sc.nextInt();
exp=sc.nextInt();
long result=1;
while(exp!=0)
{
result*=base;
--exp;
}
System.out.println(result);
	}
}
