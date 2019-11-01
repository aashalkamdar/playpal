/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MAHE
 */
//package com.instanceofjava.openwebpage;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
//import javax.servlet;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.concurrent.*;
public class Scrape extends Thread {

 /**
  * @website: www.instanceofjava.com
  * @category: how to open a webpage in browser using java code
  */
 
  
    	public static void main (String args[]){
		print("running...");
		Document document;
                
		try {
			//Get Document object after parsing the html from given url.
			document = Jsoup.connect("https://www.bing.com/search?q=my+current+location&form=PRINEN&httpsmsn=1&msnews=1&refig=bdf67719eb104b84a4a9267e79fd54ff&sp=-1&pq=my+current+location&sc=8-19&qs=n&sk=&cvid=bdf67719eb104b84a4a9267e79fd54ff").get();
//                        window.setTimeout(2000);
                        Element link = document.select("h2").first();
                        String title = document.location(); //Get title
                        
                            print(link.text());
                       
			 //Print title.
                        print("  Title: " + title);
                        print(" maybe "+ link);

		} catch (IOException e) {
			e.printStackTrace();
		}
		print("done");
	}

	public static void print(String string) {
		System.out.println(string);
	}
     
//  try {
//   
//   URI uri= new URI("https://www.google.com/maps");
//   
//   java.awt.Desktop.getDesktop().browse(uri);
//    System.out.println("Web page opened in browser");
// 
//  } catch (Exception e) {
//   
//   e.printStackTrace();
//  }
 }

 

