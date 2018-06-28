package adapter;

public interface I_Notebook {
    void createNote(String title, String note);

    String getNote(String title);
    String removeNote(String title);
    String notesCatalog();
}
