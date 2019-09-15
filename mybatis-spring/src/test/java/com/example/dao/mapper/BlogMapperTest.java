package com.example.dao.mapper;

import com.example.dao.model.Blog;
import com.example.dao.model.BlogExample;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BlogMapperTest {

    @Autowired
    private BlogMapper blogMapper;

    @Test
    public void testSelect(){
        BlogExample example = new BlogExample();
        BlogExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(101);
        List<Blog> list = blogMapper.selectByExample(example);
        Assert.assertNotNull(list);
        Assert.assertEquals(1, list.size());
    }
}
