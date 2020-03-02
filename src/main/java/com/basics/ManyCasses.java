package com.basics;

/**
 * Метод принимает на вход url адрес сайта и возвращает полный адрес вместе с "http://"
 */
public class ManyCasses {
    public String addHttp(String url){
        String prefix = "http://";
        StringBuilder sb = new StringBuilder(prefix);
        sb.append(url);
        String result = sb.toString();
        return result;
    }
}
