package TestNG;

import org.testng.TestNG;

public class TestExecutor {

	static TestNG abc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        abc = new TestNG();
        abc.setTestClasses(new Class[] {ProjTestNG.class});
        abc.run();
		
	}

}
