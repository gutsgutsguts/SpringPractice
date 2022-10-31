package com.example.ex00.dependency;

import com.example.ex00.qualifier.Computer;
import com.example.ex00.qualifier.Resaturant;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class QualifierTest {
    @Autowired @Qualifier("desktop")
    private Computer desktop;
    @Autowired @Qualifier("laptop")
    private Computer laptop;
    @Autowired
    private Computer computer;

//    @Test
//    public void qualifierTEst(){
//        log.info(desktop +"");
//        log.info(computer +"");
//        log.info(laptop +"");
//    }

    @Autowired @Qualifier("vips")
    private Resaturant vips;
    @Autowired
    private Resaturant resaturant;

    @Test
    public void qualifierTest(){
        log.info(vips +"");
        log.info(String.valueOf(vips.getSteak()));
        log.info(vips.selfBar());

        log.info(resaturant +"");
        log.info(String.valueOf(resaturant.getSteak()));
        log.info(resaturant.selfBar());
    }

}
