package com.scripts.ActiTIME;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.ActiTIME.BaseTest;
import com.pages.ActiTIME.POMActitimeLoginPage;

public class TESTActitimeLogin extends BaseTest
{
 
	@Test
	public void login() throws IOException
	{
		POMActitimeLoginPage login=new POMActitimeLoginPage(driver);
		login.loginMethod();
	}
	
}
