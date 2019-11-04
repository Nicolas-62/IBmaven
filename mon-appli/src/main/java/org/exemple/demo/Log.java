package org.exemple.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {


    private static final Logger logger = LogManager.getLogger(App.class);

    public static void go( )
    {
        logger.error("tu t'es trompé dans Log !");
        logger.debug("tu t'es trompé dans Log !");
        System.out.println( "Hello World!" );
    }
}
