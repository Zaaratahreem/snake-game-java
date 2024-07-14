//this class is responsible for saving and loading journal entry objects to and from a file
import java.io.*; //used for input output operations
import java.util.ArrayList;
import java.util.List; //imports arryalist and list

public class FileManager {
    private static final String FILE_NAME = "journalEntries.ser"; // it is a constant tht holds the file name where the journal entry will be saved and loaded from.
      // the ".ser" means that the file is serialized object file in java.


    public  static void saveEntries(List<JournalEntry> entries) { //save entries is a method that takes list of journal entry objects and saves it to a file.
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) { //file output stream is linked to the file and is specified by a file name it will be used to save the data.
            oos.writeObject(entries); //this line serializes the list of entries and writes it to the file
        } catch (IOException e) {
            e.printStackTrace();//this helps in debugging where th exception is held
        }
    }

    public static List<JournalEntry> loadEntries() { // method used to deserialize or read the lists of object from file.
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) { //file input stream object is linked to file name and is used to read data
            // object input stream is capable of reading obejcts from the input stream
            return (List<JournalEntry>) ois.readObject(); // ois.readObject this deserializes the data from the file and returns it as an object
            // lis<journalEntry> this cast converts the returned object to a list<journalEntry>
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}

