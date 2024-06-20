package com.app.validation;

import java.util.List;
import java.util.Map;
import java.util.Locale.Category;

import com.app.core.Pet;
import com.app.core.User;
import com.app.core.UserAuth;
import com.app.custom_exception.AuthenticationException;

public class CustomValidations {
	
	public static String validateEmailAndPassword(String email,String password,List<User> user) throws AuthenticationException{
		//em=
		//pa
		 User em = user.stream().filter(e->e.getEmail().equals(email)).findFirst()
		 .orElseThrow(()->new AuthenticationException("email not found"));
		 
		 if(!em.getPassword().equals(password))
			 throw new AuthenticationException("password not found");
		 
		 if(em.getUser()==UserAuth.ADMIN) {
			 return "ADMIN";
		 }else {
			 return "CUSTOMER";
		 }	
	}
	
	
	/*
	 * public static Map<Integer,Pet> validatePet(int petId, String name, String
	 * category, double unitPrice, int stocks,Map<Integer,Pet> petMap){ Category
	 * categ = Category.valueOf(category);
	 * 
	 * return petMap; }
	 */

}
