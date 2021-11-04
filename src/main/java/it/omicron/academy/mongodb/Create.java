package it.omicron.academy.mongodb;

import com.mongodb.client.MongoCollection;
import it.omicron.academy.mongodb.utils.Constants;
import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Create {

    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(Create.class);

    public static void main(String[] args) {
        String MONGODB_URI = System.getProperty("URI", Constants.DEFAULT_MONGODB_URI);
        LOG.info("Mongo URI: {}", MONGODB_URI);
    }

    public static void inserisciUno(MongoCollection<Document> collectionUtenti) {
        LOG.info("Creazione di un documento");
    }

    public static void inserireMolti(MongoCollection<Document> collectionUtenti) {
        LOG.info("Creazione di molti documenti");
    }
}
