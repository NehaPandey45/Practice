

import java.io.*;
import java.util.List;

public class TestSerializable {

    private final static String FILE_NAME = "serialize.txt";

    public static void main(String ... args) {
        PrototypeMessage prototypeObject = new PrototypeMessage(1, "test", null);

        try (FileOutputStream fileOutput= new FileOutputStream(FILE_NAME);
             ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
             FileInputStream fileInput = new FileInputStream(FILE_NAME);
             ObjectInputStream objectInput = new ObjectInputStream(fileInput);){

            objectOutput.writeObject(prototypeObject);
            PrototypeMessage outObject = (PrototypeMessage) objectInput.readObject();
            System.out.println(outObject);
        } catch (IOException | ClassNotFoundException e) {}
    }
}