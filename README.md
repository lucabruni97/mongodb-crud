## Esercitazione MongoDB

---

### Prerequisiti

Avere a disposizione un server MongoDB a cui potersi connettere. Qualora non fosse disponibile, è possibile ottenerne
uno in pochi semplici passaggi:

1. aprire il terminale/prompt dei comandi e andare nella cartella principale di questo progetto;
2. eseguire il comando che farà download e avvio di MongoDB in un container docker
   ```shell
   docker-compose up -d
   ```
3. per collegarsi alla shell di MongoDB eseguire il comando
   ```shell
   docker exec -ti mongodb mongosh
   ```
4. per uscire dalla shell di MongoDB eseguire il comando `exit`
5. per stoppare il container eseguire il comando
    ```shell
    docker-compose down
    ```

---

Implementare le operazioni `CRUD` (*C*reate, *R*ead, *U*pdate, *D*elete) utilizzando il `MongoDB Java driver`. Prima di
fare queste operazioni, è necessario implementare la connessione al DB.

Di seguito i dettagli per ogni operazione da eseguire.

### Connessione

Nella classe `Connect` stabilire una connessione con il `MongoDB Server` installato in locale. Stampare i nomi di tutti
i `DB` presenti.

Successivamente, connettersi ad un DB (se è una nuova installazione mai utilizzata, sfruttare il db `admin` già
presente) e scrivere in console i nomi di tutte le sue **collection**.

Per testare ciò che è stato fatto è possibile:

- sfruttare l'IDE che si sta utilizzando, avendo cura di settare la proprietà `mongodb.uri`(oppure modificare quella di
  DEFAULT settata nella classe `Constants`)
- eseguire nel terminale, dalla cartella principale di questo progetto, il comando
  ```shell
  mvn compile exec:java -Dexec.mainClass="it.omicron.academy.mongodb.Create" -Dmongodb.uri="IL_TUO_URI_MONGODB"
  ```

### Creazione

Nella classe `Create` implementare l'inserimento di documenti nella collection `utenti` nel db `esercizi`.

Completare i metodi `inserisciUno` e `inserireMolti` per eseguire rispettivamente l'inserimento di uno e più(*almeno 5*)
utenti nella collection.

I documenti da inserire dovranno avere i seguenti campi:

* **nome**: Stringa
* **cognome** - Stringa
* **eta** - Numero

Esempio:

```json
{
  "nome": "Luca",
  "cognome": "Bruni",
  "eta": 24
}
```

Per testare ciò che è stato fatto è possibile:

- sfruttare l'IDE che si sta utilizzando, avendo cura di settare la proprietà `mongodb.uri`(oppure modificare quella di
  DEFAULT settata nella classe `Constants`)
- eseguire nel terminale, dalla cartella principale di questo progetto, il comando
  ```shell
  mvn compile exec:java -Dexec.mainClass="it.omicron.academy.mongodb.Create" -Dmongodb.uri="IL_TUO_URI_MONGODB"
  ```

### Lettura

Nella classe `Read` implementare la ricerca di documenti nella collection `utenti` nel db `esercizi`. Implementare i
metodi che permettano di:

1. cercare *tutti* i documenti
1. cercare i documenti che hanno ***eta*** `maggiore o uguale` a 18 ed `inferiore` a 35
1. cercare i documenti che hanno ***nome*** `uguale` ad un nome a scelta e che abbiano ***eta*** `maggiore` di 22
1. cercare i documenti che hanno come ***eta*** un `numero pari`. Per questi documenti *selezionare* tutti i campi
   tranne `_id` ed *ordinare* i risultati per `eta crescente`

Per ognuna delle ricerche, stampare in console i documenti in formato JSON.

Per testare ciò che è stato fatto è possibile:

- sfruttare l'IDE che si sta utilizzando, avendo cura di settare la proprietà `mongodb.uri`(oppure modificare quella di
  DEFAULT settata nella classe `Constants`)
- eseguire nel terminale, dalla cartella principale di questo progetto, il comando
  ```shell
  mvn compile exec:java -Dexec.mainClass="it.omicron.academy.mongodb.Read" -Dmongodb.uri="IL_TUO_URI_MONGODB"
  ```

### Aggiornamento

Nella classe `Update` implementare la `modifica` di un documento nella collection `utenti` nel db `esercizi`.

Scegliere un `_id` dalla collection e modificarlo aggiungendo un campo/valore al documento a piacere(ad esempio il
campo `note` e come valore `"aggiornato"`).

Dopo questa operazione implementare l'`aggiornamento` di un documento che `non esiste`. Eseguire l'aggiornamento
applicando come *filtro* un `nome` ed un `cognome` che non sono stati inseriti. Nell'operazione di aggiornamento di
questo documento settare il campo `note` usando come valore `"Test aggiornamento documento non esistente"`

Per testare ciò che è stato fatto è possibile:

- sfruttare l'IDE che si sta utilizzando, avendo cura di settare la proprietà `mongodb.uri`(oppure modificare quella di
  DEFAULT settata nella classe `Constants`)
- eseguire nel terminale, dalla cartella principale di questo progetto, il comando
  ```shell
  mvn compile exec:java -Dexec.mainClass="it.omicron.academy.mongodb.Update" -Dmongodb.uri="IL_TUO_URI_MONGODB"
  ```

### Cancellazione

Nella classe `Delete` implementare la `cancellazione`, nella collection `utenti` nel db `esercizi`, di:

1. un documento per `_id`
2. tutti i documenti che hanno il campo `note` ed `eta` maggiore o uguale a 18

Per testare ciò che è stato fatto è possibile:

- sfruttare l'IDE che si sta utilizzando, avendo cura di settare la proprietà `mongodb.uri`(oppure modificare quella di
  DEFAULT settata nella classe `Constants`)
- eseguire nel terminale, dalla cartella principale di questo progetto, il comando
  ```shell
  mvn compile exec:java -Dexec.mainClass="it.omicron.academy.mongodb.Delete" -Dmongodb.uri="IL_TUO_URI_MONGODB"
  ```

### Suggerimenti

Eseguendo le varie classi, tra i LOG visualizzati in console, saranno presenti anche quelli prodotti dalle classi
di `mongo-java-driver`. È possibile disattivarli cambiando un valore nel file `src/main/resources/logback.xml` alla
*riga 11*, cambiando il **level** da `debug` ad `info`

```xml
<root level="info">
    <appender-ref ref="CONSOLE"/>
</root>
```
N.B.: Cambiare il livello ad `info` solo dopo aver verificato che si riesca a connettersi al DB, altrimenti non si avrà evidenza dei motivi per cui la connessione non viene stabilita.
In tal caso reimpostare il livello a `debug` e rieseguire la classe desiderata.