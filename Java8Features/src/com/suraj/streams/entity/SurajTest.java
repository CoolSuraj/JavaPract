package com.dcb.entity;

public class SurajTest {

    private SurajTest(){

    }
    //Singleton
    public  static SurajTest getSurajTest(){
        return new SurajTest();
    }
}
