package com.example;

import com.example.dao.mapper.MidpOrderSaleMapper;
import com.example.dao.model.MidpOrderSale;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MidpOrderSaleMapperTest {

    @Autowired
    private MidpOrderSaleMapper mapper;

    @Test
    public void testSelect() {
        int count = mapper.selectCount(new MidpOrderSale());
        System.out.println(count);
    }

}
