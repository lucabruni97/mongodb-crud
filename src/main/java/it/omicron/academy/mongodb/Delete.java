package it.omicron.academy.mongodb;

import com.mongodb.client.MongoCollection;
import it.omicron.academy.mongodb.utils.Constants;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Delete {

    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(Delete.class);

    public static void main(String[] args) {
        String MONGODB_URI = System.getProperty("URI", Constants.DEFAULT_MONGODB_URI);
        LOG.info("Mongo URI: {}", MONGODB_URI);
    }

    private static void cancellaPerId(MongoCollection<Document> collectionUtenti, ObjectId id) {
        LOG.info("Cancellazione documento con _id: {}", id);
    }

    private static void cancellaPerNoteEdEta(MongoCollection<Document> collectionUtenti) {
        LOG.info("Cancellazione documenti con il campo note ed età maggiore uguale a 18");
    }
}
