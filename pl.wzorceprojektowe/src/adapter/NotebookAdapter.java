package adapter;

public class NotebookAdapter implements I_Notebook, I_Notebook_v2 {

    Notebook_v2 notebook = new Notebook_v2();

    @Override
    public void createNote(String title, String note) {
        notebook.createNote(title, note, null);
    }

    @Override
    public void createNote(String title, String note, String recipient) {
        notebook.createNote(title, note, recipient);
    }

    @Override
    public String getNote(String title) {
        return notebook.getNote(title);
    }

    @Override
    public String removeNote(String title) {
        return notebook.removeNote(title);
    }

    @Override
    public String notesList() {
        return notebook.notesList();
    }

    @Override
    public String notesCatalog() {
        return notebook.notesList();
    }
}
