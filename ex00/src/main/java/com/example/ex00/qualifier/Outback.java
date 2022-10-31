package com.example.ex00.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("outback") @Primary
public class Outback implements Resaturant {
    @Override
    public int getSteak() {
        return 30000;
    }

    @Override
    public String selfBar() {
        return "NO";
    }
}
