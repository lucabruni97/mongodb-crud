package it.omicron.academy.mongodb;

import it.omicron.academy.mongodb.utils.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Connect {

    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(Connect.class);

    public static void main(String[] args) {
        String MONGODB_URI = System.getProperty("mongodb.uri", Constants.DEFAULT_MONGODB_URI);
        LOG.info("Mongo URI: {}", MONGODB_URI);
    }
}
