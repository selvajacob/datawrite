package com.hello;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@RestController

public class Datawrite {
	@RequestMapping("/datawriteservice")
	 public String data(){
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		 String f=null;
		 System.out.println("Enter the file name to be created");
		 f=s.nextLine();
		 File FILENAME=new File(f);
	         BufferedReader br = null;
	 	BufferedWriter bw= null;
	 	FileWriter fw = null;
	       String input=null;
	     br = new BufferedReader(new InputStreamReader(System.in));
	     

	                 
	                    
	 		try 
	                 {
	 			System.out.print("Enter something : ");
	             input = br.readLine();
	            
	                         
	                fw = new FileWriter(FILENAME);
	 			bw = new BufferedWriter(fw);
	 			bw.write(input);
	 			
	             
	 			

	 		} catch (IOException e) {

	 			e.printStackTrace();

	 		} finally {

	 			try {
	 				if (br != null)
	                    br.close();
	 				
	 				if (bw != null)
	 					bw.close();

	 				if (fw != null)
	 					fw.close();

	 			} catch (IOException ex) {

	 				ex.printStackTrace();

	 			}

	 		}
	 		System.out.println("you have entered:"+ input);
	 		return"you have entered:"+ input;
	 }
	public static void main(String args[])
	{
  
		   SpringApplication.run(Datawrite.class, args);
    	   
	} 		
	 }
