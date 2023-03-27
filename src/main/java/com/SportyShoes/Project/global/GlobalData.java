package com.SportyShoes.Project.global;

import java.util.ArrayList;
import java.util.List;

import com.SportyShoes.Project.model.Product;

public class GlobalData {

	
	public static List<Product> cart;
	static {
		cart =new ArrayList<Product>();
	}
}
