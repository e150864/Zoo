import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AnimalTest {
	private String nameAnimal= "Scoth";
	private String typesAnimal="Chien Carnivor";

	@Before
	
	/*public void before() {
		nomAnimal = "Not set";
		typeAnimal = "Not set";
		message = "" + nomAnimal + "est un animal de type" + typeAnimal;
		System.out.println(message);
	}*/
	

	@Test
	public void testSetTypeAnimal() {
		Animal monAnimal= new Animal();
		monAnimal.setNomAnimal(nameAnimal);
		monAnimal.setTypeAnimal(typesAnimal);
		System.out.println(monAnimal);

	}

}
