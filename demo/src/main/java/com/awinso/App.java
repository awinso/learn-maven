package com.awinso;

import com.awinso.common.Utils;
import com.awinso.core.Hello;
import com.baidu.fsg.uid.utils.DateUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Utils utils = new Utils();
        utils.sayHello();

        Hello hello = new Hello();
        System.out.printf("", hello.say());

        DateUtils cc = new DateUtils() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
    }
}
