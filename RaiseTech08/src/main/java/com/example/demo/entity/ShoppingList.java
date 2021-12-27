package com.example.demo.entity;
import lombok.Data;

@Data
public class ShoppingList {
	private int id;
	private String ItemName;
	private Integer ItemCount;
	private String ItemPrice;	
	private String ItemMemo;
}
