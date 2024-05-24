class array
{
public static void  main (String args[])
{
int a[]={4,9,1,3,5,7};
int l= a[1];
for(int i=0;i<6;i++)
{
if(a[i] > l)
{    //[i,i+1]
l=a[i];
a[i+1]=l;
a[i]= l;
}
}
for(int i=0;i<6;i++)
System.out.print(a[i]);
}
}
