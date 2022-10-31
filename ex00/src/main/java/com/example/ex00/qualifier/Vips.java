package com.example.ex00.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("vips")
public class Vips implements Resaturant {
    @Override
    public int getSteak() {
        return 15000;
    }

    @Override
    public String selfBar() {
        return "YES";
    }
}
