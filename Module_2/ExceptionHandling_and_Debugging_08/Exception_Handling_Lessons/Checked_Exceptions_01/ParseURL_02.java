package com.Udemy.Module_2.ExceptionHandling_and_Debugging_08.Exception_Handling_Lessons.Checked_Exceptions_01;

import java.net.MalformedURLException;
import java.net.URL;

public class ParseURL_02 {
    public static void main(String[] args) {
        try {
            parseURL("https://www.google.com/images");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }    
    }
    public static void parseURL(String link) throws MalformedURLException{
            URL url = new URL(link);
            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getPath());
    }    
}
