package com.example.springannotations;

import org.springframework.stereotype.Component;

@Component
public class Category {
    private int categoryId = 101;
    private String categoryName = "Electronics";

    public int getCategoryId() {
		// TODO Auto-generated method stub
		return categoryId;
	}

	public String getCategoryName() {
		// TODO Auto-generated method stub
		return categoryName;
	}

	
	
}
