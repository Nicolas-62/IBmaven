package org.exemple.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log2 {

    private static final Logger logger = LogManager.getLogger(App.class);

    public static void go( )
    {
        logger.error("tu t'es trompé dans Log2!");
        logger.debug("tu t'es trompé dans Log2!");
        System.out.println( "Hello World!" );
    }
}
