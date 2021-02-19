package com.mulesoft.aeggenschwiler.sleepdemo;

import java.io.IOException;
import java.io.InputStream;

public class Sleeper {
	public static String process(InputStream is) throws InterruptedException, IOException
	{
		long streamLen = 0;
		int chunk = 0;
			byte[] buffer = new byte[1024];
			while ((chunk = is.read(buffer)) != -1) {
				streamLen += chunk;
//				if ((Math.random() * 10) < 1) {
//					Thread.sleep(1);
//				}		
			}	
		return(String.format("%d",streamLen));
	}
}
 