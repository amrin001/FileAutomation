package automation;

import java.io.File;

public class test {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		File file = new File("\\\\\\\\SVRSG001RPS01.asia.corp.anz.com\\\\binanana$\\\\Desktop/06. Jun 22/");
		if (!file.exists())
			System.out.println("This file doesn't exist");
		else
			System.out.println("This file exists");
	}

}
