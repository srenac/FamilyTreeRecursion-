
public class Person 
{
	String name;
	Person dad;
	Person mom;
	
	public Person(String n)
	{
		name = n;
		dad = null;
		mom = null;
	}
	
	public Person(String n, Person d, Person m)
	{
		name = n;
		dad = d;
		mom = m;
	}
	
	boolean isRelated(Person p)
	{
		return(this.isParent(p) || p.isParent(this) || this.isSiblings(p));
	}
	
	boolean isParent(Person p)
	{
		boolean temp = false;
		if(p.dad == this || p.mom == this)
			return true;
		if(p.dad != null)
			temp = this.isParent(p.dad);
		
		if(p.mom != null)
			temp = temp || this.isParent(p.mom);
		return temp;
	}
	
	boolean isSiblings(Person p)
	{
		if((p.dad == dad) && (p.mom == mom))
			return true;
		return false;
	}
	
	void print()
	{
		System.out.println("The person : " + name);
		//System.out.println(name);
		
		if(dad != null)
			System.out.println("has a father named " + dad.name);
			
		if(mom != null)
			System.out.println("has a mother named " + mom.name);
		
		if(dad != null)
			dad.print();
		if(mom != null)
			mom.print();
		
	}

}
