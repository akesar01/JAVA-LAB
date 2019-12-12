class complex<T,V>
{
T obj1;
V obj2;
complex(T a,V b)
{
obj1=a;
obj2=b;
}
public void print(int h,int u)
{
System.out.println("result is"+h+"+ i " +u);
}
}
class Main
{
public static void main(String args[])
{
int z,u;
complex<Integer,Integer> t1=new complex<Integer,Integer>(10,20);
complex<Integer,Integer> t2=new complex<Integer,Integer>(23,67);
z=t1.obj1+t2.obj1;
u=t2.obj2+t1.obj2;
t1.print(z,u);
}
}