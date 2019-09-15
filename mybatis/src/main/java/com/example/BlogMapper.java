package com.example;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * mybatis通过SqlSession反射获取Mapper的完全限定类名，匹配xml中相同的命名空间，
 * 根据方法名映射sqlId找到要执行的SQL语句
 */
public interface BlogMapper {

    Blog selectBlog(int id);

    @Select("SELECT * FROM Blog WHERE TITLE = #{title}")
    Blog selectByTitle(String title);

    @Select("SELECT * FROM Blog WHERE ID = #{id} AND TITLE = #{title}")
    Blog selectByIdAndTitle(@Param("id") int id, @Param("title") String title);
}
