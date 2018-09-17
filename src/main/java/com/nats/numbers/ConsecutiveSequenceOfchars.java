package com.nats.numbers;

import java.util.ArrayList;

public class ConsecutiveSequenceOfchars {
	public static void main(String[] args) 
	{
		String values[]={"google","yahoo","egg","huawei","ebay","apple"};
		ArrayList<String> list=new ArrayList<String>();
		for (int i=0;i<values.length;i++)
		{
			char[] charArray = values[i].toCharArray();
			for(int j=0;j<charArray.length-1;j++)
			{
				if(charArray[j]==charArray[j+1])
				{
					list.add(values[i]);
					break;
				}
				else
					continue;
			}
		}
		System.out.println(list.toString());
		}
}
