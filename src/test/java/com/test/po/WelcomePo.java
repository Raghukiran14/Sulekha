package com.test.po;

import io.appium.java_client.android.AndroidDriver;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePo {
	AndroidDriver driver = null;
	public Logger qrLog = Logger.getLogger(this.getClass());
	public WelcomePo(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="JOIN SULEKHA")
	private WebElement eleJoinSulekhaBtn;
	
	public WebElement getEleJoinSulekhaBtn()
	{
		return eleJoinSulekhaBtn;
	}
	@FindBy(name="SKIP")
	private WebElement eleSkipBtn;
	
	public WebElement getEleSkipBtn()
	{
		return eleSkipBtn;
	}
	@FindBy(name="Log in")
	private WebElement eleLoginLnk;
	
	public WebElement getEleLoginLnk()
	{
		return eleLoginLnk;
	}
	@FindBy(name="Skip")
	private WebElement eleSkipLnk;
	
	public WebElement getEleSkipLnk()
	{
		return eleSkipLnk;
	}
	@FindBy(name="Mobile number")
	private WebElement eleMblnumTxtBox;
	
	public WebElement getEleMblnumTxtBox()
	{
		return eleMblnumTxtBox;
	}
	@FindBy(name="JOIN NOW")
	private WebElement eleJoinNwBtn;
	
	public WebElement getEleJoinNwBtn()
	{
		return eleJoinNwBtn;
	}
	@FindBy(name="Welcome!")
	private WebElement eleWelcomeTxt;
	
	public WebElement getEleWelcomeTxt()
	{
		return eleWelcomeTxt;
	}
	@FindBy(id="sulekha.yellowpages.lcf:id/iv_mobileno_edit")
	private WebElement eleEditInc;
	
	public WebElement getEleEditInc()
	{
		return eleEditInc;
	}
	@FindBy(name="Verification code")
	private WebElement eleVerifctnCodeTxtBox;
	
	public WebElement getEleVerifctnCodeTxtBox()
	{
		return eleVerifctnCodeTxtBox;
	}
	@FindBy(name="RESEND CODE")
	private WebElement eleResendCodeBtn;
	
	public WebElement getEleResendCodeBtn()
	{
		return eleResendCodeBtn;
	}
	@FindBy(name="*T&C apply")
	private WebElement eleTandCLnk;
	
	public WebElement getEleTandCLnk()
	{
		return eleTandCLnk;
	}
	@FindBy(id="sulekha.yellowpages.lcf:id/wv_termsandconditions")
	private WebElement eleTandCLayout;
	
	public WebElement getEleTandCLayout()
	{
		return eleTandCLayout;
	}
	public void joinnow(String sPhonenum){
		try{
				getEleJoinSulekhaBtn().click();
				getEleMblnumTxtBox().click();
				getEleMblnumTxtBox().sendKeys(sPhonenum);
				getEleJoinNwBtn().click();
	}catch(Exception e){
		//Assert.fail();
	}
	}

}
