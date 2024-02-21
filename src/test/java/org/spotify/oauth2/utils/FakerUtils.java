package org.spotify.oauth2.utils;

import com.github.javafaker.Faker;

public class FakerUtils {

    public static String generateName(String name){
        Faker faker = new Faker();
        return name +" "+ faker.regexify("[A-Za-z0-9 ,_-]{10}");
    }

    public static String generateDescription(String desc){
        Faker faker = new Faker();
        return desc +" "+ faker.regexify("[A-Za-z0-9 ,_-@./#&+]{20}");
    }
}
