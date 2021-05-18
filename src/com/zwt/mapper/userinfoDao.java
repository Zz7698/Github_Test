package com.zwt.mapper;

import com.zwt.pojo.userInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface userinfoDao {
    List<userInfo> selectAll();
    int insertUserinfo(userInfo userInfo);
}
