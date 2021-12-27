package com.example.demo.Repository;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.example.demo.entity.ShoppingList;

@SpringBootTest
@TestPropertySource(locations = "classpath:test.properties")
class ShoppingMapperTest {
	
	@Autowired
	ShoppingMapper target;
	
	@Test
	void 全件検索_2件あることを確認() {
	
		List<ShoppingList> actual = target.selectAll();
		
		assertThat(actual.size()).isEqualTo(2);
	}

}
