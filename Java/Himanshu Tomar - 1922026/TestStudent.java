class Student
{
	int rollno;
	String name;
	Student(int rollno,String name)
	{	
		this.rollno=rollno;
		this.name=name;
	}
	void show()
	{
		System.out.println("enter  roll no -- "+rollno);
		System.out.println("enter name-- "+name);
	}
	
}
class TestStudent
{
	public static void main(String []args)
	{
		Student st1=new Student(1922026,"HIMANSHU TOMAR");
		st1.show();
		
	}
}