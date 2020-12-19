package com.itgaoshu.springboot1.UserMapper;

import com.itgaoshu.springboot1.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//实现Mapper接口
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User>{
  /*  @Select("select * from test2")
    public List<User> selectAll();*/

}
