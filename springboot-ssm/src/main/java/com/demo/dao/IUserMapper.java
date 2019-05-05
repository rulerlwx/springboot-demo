package com.demo.dao;

import com.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by lwx on 2019/5/5.
 */
@Mapper //要求Mybatis版本3.3及以上
public interface IUserMapper {
    @Select("select * from user where username like '%${value}%'")
    public List<User> findUserByName(String name);
}
