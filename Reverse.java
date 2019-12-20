class Reverse 
{
public static void main(String[] args)
{
int a=12345;
int s=0,r;
while(a!=0) 
{
r=a%10;
s=(s*10)+r;
a=a/10;
}
System.out.println(s);
}
}
