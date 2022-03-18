class Encaptest1
{
private int accountnum;
private String name;
private int age;

public int getAge()
{
return age;
}
public String getName()
{
return name;
}
public int getAccountnum()
{
return accountnum;
}
public void setName(String newName)
{
name = newName;
}
public void setAge(int newAge)
{
age = newAge;
}
public void setAccountnum(int newAccountnum)
{
accountnum = newAccountnum;
}
}
public class RunEncap1
{
public static void main(String[] args)
{
Encaptest1 encap1 = new Encaptest1();
encap1.setName("George");
encap1.setAge(25);
encap1.setAccountnum(58528039);
System.out.println("Name:"+encap1.getName()+"Age:"+encap1.getAge()+"Accountnum:"+encap1.getAccountnum());
}
}