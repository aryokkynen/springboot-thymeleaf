package com.hello.thymeleaf.service;

import java.util.ArrayList;

import com.hello.thymeleaf.domain.Friend;

public class FriendRepository {
	
	
public static ArrayList<Friend> findAll(){
		
		ArrayList<Friend> list = new ArrayList<Friend>();
		
		Friend a = new Friend("Aku ankka");
		Friend b = new Friend("Hannu Hanhi");
		Friend c = new Friend("Teppo Tulppu");
		
		list.add(a);
		list.add(b);
		list.add(c);
		
		return list;
	}

}
