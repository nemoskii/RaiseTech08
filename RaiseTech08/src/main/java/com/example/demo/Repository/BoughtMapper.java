package com.example.demo.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Form.BoughtListForm;

@Mapper
public interface BoughtMapper {
	
	List<BoughtListForm> selectAll();

}
