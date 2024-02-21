package org.spotify.oauth2.tests;

import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public class BaseTest {

    @BeforeMethod
    public void beforeMethod(Method method){
        System.out.println("STARTING METHOD: "+ method.getName() + " " + "THREAD ID:" + Thread.currentThread().getId());
    }
}
