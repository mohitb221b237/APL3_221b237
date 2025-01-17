public class le0 {
	int age;
	String name;
	void setAge(int age) {
		this.age=age;
	}
	void setName(String name)
	{
		this.name=name;
	}
	int getAge(){
	    return this.age;
	}
	String getName(){
	    return this.name;
	}
	public static void main(String[] args) {
	    Main m1=new Main();
	    m1.setName("mohit");
	    m1.setAge(21);
		System.out.println(m1.getName()+" "+m1.getAge());

	}

}