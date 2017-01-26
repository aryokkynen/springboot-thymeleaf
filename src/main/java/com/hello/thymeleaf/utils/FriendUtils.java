package com.hello.thymeleaf.utils;

import java.util.ArrayList;
import java.util.List;

import com.hello.thymeleaf.domain.*;

public class FriendUtils {
	
	
	
 private static List<Friend> friends = new ArrayList<Friend>();

	public static List<Friend> buildFriends() {
		if (friends.isEmpty()) {
			
			Friend a = new Friend("Aku ankka");
			Friend b = new Friend("Hannu Hanhi");
			Friend c = new Friend("Teppo Tulppu");
			
			friends.add(a);
			friends.add(b);
			friends.add(c);

        }

        return friends;
}

}
