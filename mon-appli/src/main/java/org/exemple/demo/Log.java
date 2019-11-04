package org.exemple.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {


    private static final Logger logger = LogManager.getLogger(App.class);

    public static void go( )
    {
        for(int i=0; i<1000; i++) {
            logger.error("tu t'es trompé dans Log !");
            logger.debug("tu t'es trompé dans Log !");
        }
        System.out.println( "Hello World!" );
    }
}
