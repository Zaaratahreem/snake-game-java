import javax.swing.*; //gui classes
import java.awt.*;// gui component
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List; //for array and arraylists

//FIELDS
public class MainApp extends JFrame {
    private List<JournalEntry> entries;
    private JList<JournalEntry> entryList;    //entrylist is a swing component that displays list of journal entries
    private DefaultListModel<JournalEntry> listModel;  //listmodel is a model that holds the data for entrylist
    private JTextArea textArea; //textarea is where the content of the journal list is entered and edited

    // CONSTRUCTOR
    public MainApp() {
        entries = FileManager.loadEntries(); //loads existing journal entries from a file
        listModel = new DefaultListModel<>(); //initialises the list model
        entries.forEach(listModel::addElement); //adds all loaded entries to the list model

        setTitle("Journal Diary");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //these sets the window title size and close operation

        JPanel panel = new JPanel(); //creates a main panel with boarder layout
        panel.setLayout(new BorderLayout());

        entryList = new JList<>(listModel);//creates list to display journal entries
        entryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane listScrollPane = new JScrollPane(entryList);//adds the scroll pane to the list

        textArea = new JTextArea(); //creates a text area for creating entries
        JScrollPane textScrollPane = new JScrollPane(textArea);//adds scroll pane to the text area
        JButton addButton = new JButton("Add Entry");  //creates buttons to add  entries
        JButton deleteButton = new JButton("Delete Entry");// button to delete entry

        addButton.addActionListener(e -> addEntry());//adding action listener to the buttons
        deleteButton.addActionListener(e -> deleteEntry());// adding action listener to the delete button

        JPanel buttonPanel = new JPanel();//creates panel for button
        buttonPanel.add(addButton);//adding button to the button panel
        buttonPanel.add(deleteButton);

        panel.add(listScrollPane, BorderLayout.WEST);
        panel.add(textScrollPane, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);       //these all adds component to the main panel
        add(panel);         //adds main panel to the frame
    }

    private void addEntry() {
        String title = JOptionPane.showInputDialog(this, "Enter title:");    //prompts the user to enter new journal enrty
        if (title != null && !title.isEmpty()) {
            JournalEntry entry = new JournalEntry(title, textArea.getText());//If the title is not empty, creates a new JournalEntry with the title and the current text in textArea.
            entries.add(entry);                     //add the entry to entries
            listModel.addElement(entry);           // add the entry to list model
            FileManager.saveEntries(entries);     //saves the updated list
        }
    }

    private void deleteEntry() {
        int selectedIndex = entryList.getSelectedIndex();//get the index of selected entry in entry list
        if (selectedIndex != -1) {
            entries.remove(selectedIndex);//if enrty is selected, removes it from the entries and list model
            listModel.remove(selectedIndex);
            FileManager.saveEntries(entries);//saves the updated list
        }
    }

    public static void main(String[] args) {   //main method runs the application
        SwingUtilities.invokeLater(() -> {    // Ensures that the GUI is created on the Event Dispatch Thread.
            MainApp app = new MainApp();      //creates an instance of main app to make it visible
            app.setVisible(true);
        });
    }
}

