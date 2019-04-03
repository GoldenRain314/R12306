package com.vcode.ticket;

import java.io.IOException;

import com.vcode.ticket.utils.HttpRequester;
import com.vcode.ticket.utils.HttpRespons;

public class test {
public static void main(String[] args) {
	 HttpRequester request = new HttpRequester();  
     request.setDefaultContentEncoding("utf-8");  
     HttpRespons hr = null;
	try {
		hr = request.sendGet("https://kyfw.12306.cn/passport/captcha/captcha-image64?login_site=E&module=login&rand=sjrand&" +Math.random());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}       
 
     System.out.println(hr.getUrlString());       
     System.out.println(hr.getProtocol());       
     System.out.println(hr.getHost());       
     System.out.println(hr.getPort());       
     System.out.println(hr.getContentEncoding());       
     System.out.println(hr.getMethod());       
            
     System.out.println(hr.getContent());  
}
}
