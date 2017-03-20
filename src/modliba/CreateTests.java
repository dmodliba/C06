package modliba;

import static org.junit.Assert.*;

import org.junit.*;

import weiser.LKW;

public class CreateTests {

	LKW lkw;
	
	@Before
	public void start(){
		lkw = new LKW("W 3520T", 12000, 3000, 3);	
	}
	
	@Test(expected = Exception.class)
	public void mehrEigengewicht(){
		lkw = new LKW("W 3520T", 3500, 4000, 3);
	}
	
	@Test(expected = Exception.class)
	public void illegalMaxPersonenCreate(){
		lkw = new LKW("W 3520T", 12000, 3000, 0);
	}
	
	@Test
	public void testPrint(){
		String lkwS = "LKW W 3520T\n";
		lkwS += "Höchstzulässiges Gesamtgewicht: 12000\n";
		lkwS += "Eigengewicht: 3000\n";
		lkwS += "Maximale Zahl von Personen im LKW: 3\n";
		lkwS += "Aktuelles Gesamtgewicht: 3000\n";
		lkwS += "Personen im LKW: 0";
		assertEquals(lkwS, lkw.toString());
	}
	
	@After
	public void end(){
		System.out.println("Test done!");
	}
	
}
