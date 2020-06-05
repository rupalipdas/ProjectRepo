package pom.HRMCommonMethods;

import java.io.IOException;

public class HrmCallMethods {

	public static void main(String[] args) throws IOException{
		HrmAllMethods am = new HrmAllMethods();
		am.insertapp("https://opensource-demo.orangehrmlive.com/");
		am.enterbyid("textUsername", "Admin");
		am.enterbyid("txtPassword", "admin123");

	}

}
