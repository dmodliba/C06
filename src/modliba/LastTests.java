package modliba;

import org.junit.*;

import weiser.GewichtException;
import weiser.LKW;

public class LastTests {

	LKW lkw;

	@Before
	public void start() {
		lkw = new LKW("W 3520T", 12000, 3000, 3);
	}

	@Test(expected = GewichtException.class)
	public void zuVielAufladen() {
		lkw.aufladen(13000);
	}

	@Test(expected = GewichtException.class)
	public void zuVielEntladen(){
		lkw.entladen(13000);
	}

	@After
	public void end() {
		System.out.println("Test done!");
	}

}
