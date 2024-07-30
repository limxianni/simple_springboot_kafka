## Setting up Kafka in your local environment

To set up Kafka, follow these steps:

1. Download Kafka: Visit the official Apache Kafka website (https://kafka.apache.org/downloads) and download the latest stable version of Kafka.

2. Extract the downloaded file: Once the download is complete, extract the contents of the downloaded file to a directory of your choice.

3. Start ZooKeeper: Kafka relies on ZooKeeper for coordination. Open a terminal or command prompt and navigate to the Kafka directory. Start ZooKeeper by running the following command:
    
    Windows:
    ```
    bin\windows\zookeeper-server-start.bat config\zookeeper.properties
    ```

    MacOS:
    ```
    bin/zookeeper-server-start.sh config/zookeeper.properties
    ```

4. Start Kafka server: In a new terminal or command prompt, navigate to the Kafka directory and start the Kafka server by running the following command:
    
    Windows:
    ```
    bin\windows\kafka-server-start.bat config\server.properties
    ```

    MacOS:
    ```
    bin/kafka-server-start.sh config/server.properties
    ```

7. After running the API below, you can check Consumer message using command line:

    Windows:
    ```
    .\bin\windows\kafka-console-consumer.bat --topic demo_json --from-beginning --bootstrap-server localhost:9092
    ```

    MacOS:
    ```
    bin/kafka-server-start.sh --topic demo_json --from-beginning --bootstrap-server localhost:9092
    ```

8. DO TAKE NOTE: Always start Zookeeper first, followed by Kafka.

## API for Producer to send Message
POST:
```
http://localhost:8082/api/json/kafka/publish
```

Json Body example:
```
{
  "id": 1,
  "name": "ExampleDemo",
  "age": 30
}
```