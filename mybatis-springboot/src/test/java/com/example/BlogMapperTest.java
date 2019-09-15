package com.example;

import com.alibaba.fastjson.JSON;
import com.example.dao.mapper.BlogMapper;
import com.example.dao.model.Blog;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogMapperTest {

    @Autowired
    private BlogMapper mapper;

    @Test
    public void testSelect(){
        Example example = new Example(Blog.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id", 101);
        List<Blog> list = mapper.selectByExample(example);
        Assert.assertNotNull(list);
    }

    @Test
    public void testPageSelect(){
        Example example = new Example(Blog.class);
        Example.Criteria criteria = example.createCriteria();

        PageHelper.startPage(2,5);
        List<Blog> list = mapper.selectByExample(example);

        PageInfo<Blog> pageInfo = new PageInfo<>(list);
        System.out.println("List:" + JSON.toJSONString(pageInfo.getList()));
        System.out.println("Page Size:" + pageInfo.getPageSize());
        System.out.println("Page Num:" + pageInfo.getPageNum());
        System.out.println("Total:" + pageInfo.getTotal());
        System.out.println("getNavigateFirstPage:" + pageInfo.getNavigateFirstPage());//第一页是1号页
        System.out.println("getNavigateLastPage:" + pageInfo.getNavigateLastPage());//最后一页是5号页
        System.out.println("getNavigatepageNums:" + JSON.toJSONString(pageInfo.getNavigatepageNums()));//[1,2,3,4,5]
        System.out.println("getNavigatePages:" + pageInfo.getNavigatePages());
        System.out.println("getNextPage:" + pageInfo.getNextPage());//下一页页号（从1开始）
        System.out.println("getPrePage:" + pageInfo.getPrePage());//上一页页号
        System.out.println("getStartRow:" + pageInfo.getStartRow());//开始行号，当前是第二页所以从6开始
        System.out.println("getEndRow:" + pageInfo.getEndRow());//结束行号，当前是第二页所以到10结束
    }
}
