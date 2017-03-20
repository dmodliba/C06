package modliba;

import org.junit.*;

import weiser.LKW;
import weiser.PersonenException;

public class PersonenTests {

	LKW lkw;

	@Before
	public void start() {
		lkw = new LKW("W 3520T", 12000, 3000, 3);
	}

	@Test(expected = PersonenException.class)
	public void zuVieleAussteigen() {
		int pers = lkw.getPersonenZahl();
		for (int i = 0; i <= pers; i++) {
			lkw.aussteigen();
		}
	}

	@Test(expected = PersonenException.class)
	public void zuVieleEinsteigen() {
		for(int i = 0; i < 4; i++){
			lkw.einsteigen();
		}
	}
	
	
	
	@After
	public void end() {
		System.out.println("Test done!");
	}

}
