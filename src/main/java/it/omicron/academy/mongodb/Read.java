package it.omicron.academy.mongodb;

import com.mongodb.client.MongoCollection;
import it.omicron.academy.mongodb.utils.Constants;
import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Read {

    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(Read.class);

    public static void main(String[] args) {
        String MONGODB_URI = System.getProperty("URI", Constants.DEFAULT_MONGODB_URI);
        LOG.info("Mongo URI: {}", MONGODB_URI);
    }

    public static void cercaTutti(MongoCollection<Document> collectionUtenti) {
        LOG.info("# tutti i documenti");
    }

    public static void cercaPerEtaMaggioreUgualeOMinore(MongoCollection<Document> collectionUtenti, int minimo, int massimo) {
        LOG.info("# documenti che hanno eta maggiore o uguale a 18 ed inferiore a 35");
    }

    public static void cercaPerNomeUgualeEdEtaMaggiore(MongoCollection<Document> collectionUtenti, String nome, int eta) {
        LOG.info("# documenti che hanno nome uguale ad un nome a scelta e che abbiano eta maggiore di 22");
    }

    public static void cercaPerEtaPari(MongoCollection<Document> collectionUtenti) {
        LOG.info("# documenti che hanno come eta un numero pari");
    }
}
