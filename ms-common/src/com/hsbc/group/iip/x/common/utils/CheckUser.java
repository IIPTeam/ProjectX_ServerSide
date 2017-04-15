package com.hsbc.group.iip.x.common.utils;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.hsbc.group.iip.x.common.model.User;

@Component
public class CheckUser {
	public static boolean checkUser(String userData){
		
		return true;
	}

	public static String genVCode(int size, String source) {
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		for(;size>0;size--){
			sb.append(source.charAt(random.nextInt(source.length())));
		}
		return sb.toString();
	}

	public static boolean checkUser(User user) {
		// TODO Auto-generated method stub
		return true;
	}
}
