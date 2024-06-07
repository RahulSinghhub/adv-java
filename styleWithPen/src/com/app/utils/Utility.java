package com.app.utils;

import java.time.LocalDate;
import java.util.Map;

import com.app.entities.Brand;
import com.app.entities.Material;
import com.app.entities.Pen;
import com.app.exception.Custom_exception;

/*cjjcb
 * Brand brand;
	private String color;
	private String inkColor;
	private Material material;
	private long stock;
	private LocalDate updateDdate;
	private LocalDate listDate;
	private long price;
	private float discount;
 * 
 * *///in.next(),in.next(),in.next(),in.next(),in.nextLong(),in.next(),in.nextLong(),in.nextFloat()

public class Utility {
	public static Pen validateInput(String brand, String color, String inkColor,String material, long stock,
			String listDate, long price, float discount) {
		//validate brand , materials  
		     Brand validBrand = Brand.valueOf(brand.toUpperCase());
		     Material validMaterial = Material.valueOf(material.toUpperCase());
		     LocalDate validListDate = LocalDate.parse(listDate);		
			return new Pen(validBrand,color,inkColor,validMaterial,stock,validListDate,price,discount);
		
	}
	
	public static void updateByIdAndUpdateStocks(int id,long stock,Map<Integer,Pen> penList) throws Custom_exception{
		// validate id and then find stock using id from penlist then set stock by id 
		//cello red pink plastic 200 2024-05-01 3333 22
		System.out.println("now updating stock value");
		Pen p = penList.get(id);
		if(p==null) {
			throw new Custom_exception("id doesot exist");
		}
		p.setStock(stock);
		System.out.println("the stock has been set");
		
		}
	
	public static Map<Integer, Pen> populateMap(Map<Integer,Pen> penList) {
		
		penList.put(1,validateInput("cello", "red", "violet", "plastic" ,100 ,"2024-05-01", 555 ,2));
		penList.put(2,validateInput("REYNOLDS", "blue", "indigo", "METAL" ,200 ,"2023-05-01", 5 ,2));
		penList.put(3,validateInput("PARKER", "green", "orange", "STEEL" ,300 ,"2022-05-01", 4444 ,2));
		penList.put(4,validateInput("cello", "yellow", "baby_pink", "ALLOY" ,400 ,"2021-05-01", 444 ,2));
		penList.put(5,validateInput("REYNOLDS", "pink", "pink", "plastic" ,500 ,"2020-05-01", 44 ,2));
		penList.put(6,validateInput("PARKER", "maroon", "purple", "METAL" ,600 ,"2019-05-01", 4 ,2));
		penList.put(7,validateInput("cello", "white", "magenta", "STEEL" ,700 ,"2018-05-01", 33333 ,2));
		penList.put(8,validateInput("REYNOLDS", "black", "grey", "ALLOY" ,800 ,"2017-05-01", 3333 ,2));
		penList.put(9,validateInput("PARKER", "brown", "silver", "METAL" ,900 ,"2012-05-01", 333 ,2));
		penList.put(10,validateInput("cello", "safroon", "cyan", "STEEL" ,1000 ,"2004-05-01", 3 ,2));
		penList.forEach((t, u) ->System.out.println(u) );
		return penList;
		
	}
	
		        
		
		
	}
	

