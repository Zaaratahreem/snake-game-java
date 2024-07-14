import java.io.Serializable; //this imports the serializable interface from the java io.
import java.time.LocalDateTime; //imports the local date time class from java time package

public class JournalEntry implements Serializable { // this means object of this class can be converted to a byte stream and saved to a file.
    private String title;//stores the title of the journal entry
    private String content; // stores content of the journal entry
    private LocalDateTime dateTime; //stores date and time when the journal was created

    public JournalEntry(String title, String content) { //constructor that initialises new journalenrty object with title and content
        this.title = title;  //sets the title field to the value passed to the constructor
        this.content = content;
        this.dateTime = LocalDateTime.now();
    }

    public String getTitle() {  //returns the title of the journal entry
        return title;
    }

    public String getContent() {  //returns the content of the journal entry
        return content;
    }

    public LocalDateTime getDateTime() {  //returns the date and time of the journal entry
        return dateTime;
    }

    @Override
    public String toString() {  //this method returns the string represetation of the journal entry
        return dateTime + " - " + title;  //combines date time and title and returns it as string
    }
}


