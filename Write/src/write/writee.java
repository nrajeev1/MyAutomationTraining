package write;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class writee 
{
	 public static void main(String[] args) throws IOException 
	 {
		 FileWriter file = new FileWriter("C:\\\\Users\\\\rajeev.n.IQZAD\\\\Eclipse_New\\\\readfile.txt", true);
		 file.write("Welcome!!!");
		 file.write("\n");
		 file.write("I just created my very first file using Java");
		 file.close();
		 System.out.println("File creation successful");
	 }
}

