package oopHW;

public class HW2_main {

	public static void main(String[] args) {
		Instructer instructer1 = new Instructer("Engin", "Demiroð", "Java & React");

		Instructer instructer2 = new Instructer("Engin", "Demiroð", "Angular & C#");

		Instructer[] instructers = { instructer1, instructer2 };

		for (Instructer instructer : instructers) {
			System.out.println(instructer1.name + "" + instructer1.surname + "" + instructer1.lessons);
			System.out.println(instructer2.name + "" + instructer2.surname + "" + instructer2.lessons);
		}
		System.out.println(instructers.length);

		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Java & React Yazýlým Geliþtirici Kampý";

		Category category2 = new Category();
		category2.id = 2;
		category2.name = "C# + ANGULAR Yazýlým Geliþtirici Yetiþtirme Kampý";

		InstructerManager instructerManager = new InstructerManager();
		instructerManager.addnewInstructer(instructer1);
		instructerManager.updateInstructer(instructer2);
	}
}
