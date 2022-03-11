package com.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.genericLib.BaseTest;

public class EnterTimeTrackPage {

	@FindBy(xpath = "//div[text()='Tasks']") private WebElement tasksTab;
	@FindBy(xpath = "//div[text()='Reports']") private WebElement reportsTab;
	@FindBy(xpath ="//a[text()='View Time-Track']") private WebElement viewtimetracklink;
	@FindBy(xpath ="//a[text()='Lock Time-Track']") private WebElement locktimetracklink;
	@FindBy(xpath ="//a[text()='Approve Time-Track']") private WebElement approvetimetracklink;
	
	public EnterTimeTrackPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getTasksTab() {
		return tasksTab;
	}

	public WebElement getReportsTab() {
		return reportsTab;
	}
	public WebElement getviewtimetracklink() {
		return viewtimetracklink;
	}
	public WebElement getlocktimetracklink() {
		return locktimetracklink;
	}
	public WebElement getapprovetimetracklink() {
		return approvetimetracklink;
	}
	
	public void clickTasksTab()
	{
		tasksTab.click();
	}
	
	public void clickReportsTab()
	{
		reportsTab.click();
	}
	public void clickviewtimetracklink() {
		viewtimetracklink.click();
	}
	public void clicklocktimetracklink() {
		locktimetracklink.click();
	}
	public void clickapprovetimetracklink() {
		approvetimetracklink.click();
	}
}










