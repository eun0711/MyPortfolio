package com.myportfolio.web.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class PageHandlerTest {

    @Test
    public void test(){
        PageHandler ph = new PageHandler(235,25);

        ph.print();
        System.out.println(ph);

        assertTrue(ph.getBeginPage() == 2);
    }

}