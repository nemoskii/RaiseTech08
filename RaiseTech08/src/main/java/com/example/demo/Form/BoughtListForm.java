package com.example.demo.Form;
import lombok.Data;

@Data
public class BoughtListForm {
	private int id;
	private String ItemName;
	private Integer ItemCount;
	private String ItemPrice;	
	private String ItemMemo;
}
