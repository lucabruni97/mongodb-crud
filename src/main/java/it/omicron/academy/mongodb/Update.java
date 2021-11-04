package it.omicron.academy.mongodb;

import com.mongodb.client.MongoCollection;
import it.omicron.academy.mongodb.utils.Constants;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Update {

    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(Update.class);

    public static void main(String[] args) {
        String MONGODB_URI = System.getProperty("URI", Constants.DEFAULT_MONGODB_URI);
        LOG.info("Mongo URI: {}", MONGODB_URI);
    }

    private static void aggiornaPerID(MongoCollection<Document> collectionUtenti, ObjectId id) {
        LOG.info("Aggiornamento documento con _id: {}", id);
    }

    private static void aggiornaOInserisci(MongoCollection<Document> collectionUtenti) {
        LOG.info("Aggiornamento documento che non esiste");
    }
}
