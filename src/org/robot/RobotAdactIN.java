package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotAdactIN {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Aswin Prabu\\eclipse-workspace\\SeleniumRobot\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	
	Robot robot = new Robot();
	for (int i = 1; i <= 3; i++) {
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}
	
	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);
	robot.keyPress(KeyEvent.VK_S);
	robot.keyRelease(KeyEvent.VK_S);
	robot.keyPress(KeyEvent.VK_W);
	robot.keyRelease(KeyEvent.VK_W);
	robot.keyPress(KeyEvent.VK_I);
	robot.keyRelease(KeyEvent.VK_I);
	robot.keyPress(KeyEvent.VK_N);
	robot.keyRelease(KeyEvent.VK_N);
	robot.keyPress(KeyEvent.VK_P);
	robot.keyRelease(KeyEvent.VK_P);
	robot.keyPress(KeyEvent.VK_R);
	robot.keyRelease(KeyEvent.VK_R);
	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);
	robot.keyPress(KeyEvent.VK_B);
	robot.keyRelease(KeyEvent.VK_B);
	robot.keyPress(KeyEvent.VK_U);
	robot.keyRelease(KeyEvent.VK_U);
	
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	
	robot.keyPress(KeyEvent.VK_U);
	robot.keyRelease(KeyEvent.VK_U);
	robot.keyPress(KeyEvent.VK_B);
	robot.keyRelease(KeyEvent.VK_B);
	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);
	robot.keyPress(KeyEvent.VK_R);
	robot.keyRelease(KeyEvent.VK_R);
	robot.keyPress(KeyEvent.VK_P);
	robot.keyRelease(KeyEvent.VK_P);
	robot.keyPress(KeyEvent.VK_N);
	robot.keyRelease(KeyEvent.VK_N);
	robot.keyPress(KeyEvent.VK_I);
	robot.keyRelease(KeyEvent.VK_I);
	robot.keyPress(KeyEvent.VK_W);
	robot.keyRelease(KeyEvent.VK_W);
	robot.keyPress(KeyEvent.VK_S);
	robot.keyRelease(KeyEvent.VK_S);
	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);
	
}
}
