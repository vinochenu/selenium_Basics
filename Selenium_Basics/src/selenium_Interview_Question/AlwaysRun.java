package selenium_Interview_Question;

import org.testng.annotations.Test;

public class AlwaysRun {
	
	@Test(timeOut=2000)
	public void keyON() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Key ON");
		}
		
	@Test(dependsOnMethods="keyON",alwaysRun=true) //dependsonMethods- it will fail if depends methods got failed or skipped but when we give alwaysRUN it will skip that depends condition
		public void engineON() {
			System.out.println("ENGINE ON");
		}
	

}
