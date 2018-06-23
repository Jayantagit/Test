package com.mercury.test;

import java.awt.AWTException;
import java.io.IOException;

import org.sikuli.script.FindFailed;

public class Driver {

	public static void main(String[] args) throws InterruptedException, AWTException, FindFailed, IOException
	{
		MethodRepository  mercuryAppLaunch=new MethodRepository();
	
		mercuryAppLaunch.mercuryAppLaunch();
		
		mercuryAppLaunch.Login();
		
		//mercuryAppLaunch.selectdropdown();
		//mercuryAppLaunch.closeApplication();
		//mercuryAppLaunch.PhotoUploadLaunch();
		
		
		
		
	}

}
