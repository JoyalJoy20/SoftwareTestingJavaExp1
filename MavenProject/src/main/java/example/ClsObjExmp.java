package example;

public class ClsObjExmp {
	private String name;
	private int age;
	public ClsObjExmp(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public int  getAge()
	{
		return age;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClsObjExmp obj=new ClsObjExmp("joyal",30);
		ClsObjExmp obj1=new ClsObjExmp("joy",60);
		System.out.println(obj.getName()+"  is "+obj.getAge()+" years old");
		System.out.println(obj1.getName()+"  is "+obj1.getAge()+" years old");
		
	}

}
