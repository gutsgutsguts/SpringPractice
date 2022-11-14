package com.example.ex01.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TimeMapper {
    public String getTime();


    // 쿼리 짧을때 이렇게 해놓기
    @Select("SELECT SYSDATE FROM DUAL")
    public String getTimeQuick();
}
