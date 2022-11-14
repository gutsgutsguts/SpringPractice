package com.example.ex02.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TimeMapper {
    public String getTime();


    // 쿼리 짧을때 이렇게 해놓기
    @Select("SELECT CURRENT_DATE FROM DUAL")
    public String getTimeQuick();
}
