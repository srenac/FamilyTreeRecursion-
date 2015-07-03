
public class FamilyTree 
{
	public static void main(String args[])
	{
		Person Grandpapa = new Person("Smith");
		Person Grandmama = new Person ("Yang");
		Person Papa = new Person ("Bob", Grandpapa, Grandmama);
		Person Auntie = new Person("Linda", Grandpapa, Grandmama);
		Person Auntie2 = new Person("Sarah", Grandpapa, Grandmama);
		Person Uncle = new Person("Patrick", Grandpapa, Grandmama);
		
		Person Mama = new Person("Mao");
		Person Myself = new Person("Sally", Papa, Mama);
		Person Husband = new Person("Rob");
		Person Daughter = new Person("Sophia", Myself, Husband);
		
		System.out.println("Is Grandpa related to Sohpia?: ");
		System.out.println(Grandpapa.isRelated(Daughter));
		System.out.println("Is Papa related to Auntie?: ");
		System.out.println(Papa.isRelated(Auntie));
		System.out.println("Am I related to Patrick?: ");
		System.out.println(Myself.isRelated(Uncle));
		System.out.println("Is Sophia related to Linda?: ");
		System.out.println(Daughter.isRelated(Auntie2));
		
		Daughter.print();
		//Myself.print();
	}

}
