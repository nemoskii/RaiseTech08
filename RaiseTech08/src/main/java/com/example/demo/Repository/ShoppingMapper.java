package com.example.demo.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.ShoppingList;

@Mapper
public interface ShoppingMapper {
	
	List<ShoppingList> selectAll();

}
