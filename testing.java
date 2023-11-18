package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class testing {
    public static void main(String[] args) {
        String URL = "https://trade.spjainsec.com/";
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/fieldset[1]/input[1]")).sendKeys("TEST7");
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/fieldset[1]/input[1]")).sendKeys("Abcd@12345");
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/button[1]")).click();
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]")).sendKeys("1");
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[2]")).sendKeys("1");
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[3]")).sendKeys("1");
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[4]")).sendKeys("1");
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[5]")).sendKeys("1");
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[6]")).sendKeys("1");
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[3]/button[1]")).click();
        driver.findElement(By.xpath("//body/div[1]/div[19]/div[1]/div[1]/div[3]/button[1]")).click();

    }
}
