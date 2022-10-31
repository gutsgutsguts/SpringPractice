package com.example.ex00.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// 프라이머리 디폴트값
@Qualifier("laptop") @Primary
public class Laptop implements Computer{
    @Override
    public int getScreenWidth() {
        return 1980;
    }
}
