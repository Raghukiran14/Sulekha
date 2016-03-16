package com.test.scripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.test.baselib.GenericLib;
import com.test.baselib.BaseLib;
import com.test.po.WelcomePo;

public class WelcomeTest extends BaseLib {
	public String sData[]=null;
	public String sTestCaseID=null;
	WelcomePo welcomepo;
	public Logger qrLog = Logger.getLogger(this.getClass());
	@Test(priority=1,enabled=true)
	public void testWelcome()
	{
		sTestCaseID="Newuser_01";
		sData= GenericLib.toReadExcelData(sTestCaseID);
		welcomepo=new WelcomePo(driver);
		try{
				welcomepo.joinnow(sData[1]);
		}catch(Exception e){
			
		}

}
}
