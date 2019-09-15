package com.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;

/**
 * 原生MyBatis
 * 通过加载配置文件构建SqlSessionFactory,再根据Factory构建SqlSession,
 * 从SqlSession中获取Mapper，通过Mapper映射XML/Java注解进行SQL操作
 */
public class Main {

    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        String resource = "config/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        try (SqlSession session = sqlSessionFactory.openSession()) {
            BlogMapper mapper = session.getMapper(BlogMapper.class);
            Blog blog = mapper.selectBlog(101);
            log.info("查到blog信息：{}", blog.getTitle());

            Blog blog2 = mapper.selectByTitle("lesson1");
            log.info("查到blog2信息：{}", blog2.getTitle());

            Blog blog3 = mapper.selectByIdAndTitle(102, "lesson1");
            log.info("查到blog3信息：{}", blog3.getTitle());
        }
    }
}
