import java.util.*;

class EmployeeTest
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);

Employee emp[]=new Employee[5];
for(Employee obj:emp)
{
obj=new Employee();
obj.setName(scan.next());
obj.setAge(scan.nextByte());
}

for(Employee obj:emp)
{
System.out.println(obj.getName()+" "+obj.getAge());

}

}
}



D:\Nidhi\Day2\Emp1>java EmployeeTest
h
2
sd
2
df
2
sdf
2
dw
23
Exception in thread "main" java.lang.NullPointerException
        at EmployeeTest.main(EmployeeTest.java:19)