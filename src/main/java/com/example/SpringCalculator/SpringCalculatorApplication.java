package com.example.SpringCalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCalculatorApplication {
	public int add(int num1, int num2){
		return num1+num2;
	}
	public int subtract(int num1, int num2){
		return num1-num2;
	}
	public int multiply(int num1, int num2){
		return num1 * num2;
	}
	public int divide(int num1, int num2){
		return num1/num2;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCalculatorApplication.class, args);
		SpringCalculatorApplication scp=new SpringCalculatorApplication();
		int sum=scp.add(10,20);
		System.out.println("The addition element are: "+sum);
		int sub= scp.subtract(20,10);
		System.out.println("The Subtrsct Element are: "+sub);
		int mul= scp.multiply(5,4);
		System.out.println("The Multiply Element are: "+mul);
		int div=scp.divide(10,5);
		System.out.println("The Divide element are: "+ div);

	}

}
