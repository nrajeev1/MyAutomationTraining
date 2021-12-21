package packagee_demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class read 
{
	public static void main(String[] args) throws IOException
	{
		FileReader file = new FileReader("C:\\\\Users\\\\rajeev.n.IQZAD\\\\Eclipse_New\\\\readfile.txt");
		BufferedReader read = new BufferedReader(file);
		String text;
		while((text=read.readLine())!=null) 
		{
			System.out.println(text);
		}
		read.close();
	}
}

