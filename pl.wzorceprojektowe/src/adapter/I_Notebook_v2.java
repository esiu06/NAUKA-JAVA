package adapter;

public interface I_Notebook_v2 {

    void createNote(String title, String note, String recipient);

    String getNote (String title);
    String removeNote(String title);
    String notesList();
}
