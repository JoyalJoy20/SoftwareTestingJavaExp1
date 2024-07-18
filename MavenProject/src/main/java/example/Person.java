package example;
import java.io.IOException;

public class Person {

	private String name;
	private int age;
	
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age) 
	{
		if(age>=0)
		{
			this.age=age;
		}else
		{
			 throw new  IllegalArgumentException ("error");
		}
		
	}
	public int getAge()
	{
		if(age<=0)
		{
			return 0;
		}
		return age;
	}
	
}
