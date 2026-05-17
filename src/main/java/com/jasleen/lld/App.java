package com.jasleen.lld;

import com.jasleen.lld.beginner.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        callSingleton();

    }

    private static void callSingleton() {
        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();

        System.out.println(logger1 == logger2);
    }
}
