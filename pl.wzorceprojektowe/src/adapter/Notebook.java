package adapter;

import java.util.ArrayList;

public class Notebook implements I_Notebook {

    private ArrayList<Note> notesList = new ArrayList<Note>();

    @Override
    public void createNote(String title, String note) {
        notesList.add(new Note(title, note));
    }

    @Override
    public String getNote(String title) {
        for (int i = 0; i < notesList.size(); i++) {
            if (notesList.get(i).getTitle().equals(title)){
                return notesList.get(i).getNote();
            }
        }
        return null;
    }

    @Override
    public String removeNote(String title) {
        for (int i = 0; i < notesList.size(); i++) {
            if (notesList.get(i).getTitle().equals(title)){
                String note = notesList.get(i).getNote();
                notesList.remove(i);
                return note;
            }
        }
        return null;
    }

    @Override
    public String notesCatalog() {

        StringBuffer catalog = new StringBuffer();

        for (int i = 0; i < notesList.size(); i++) {
            catalog.append("- " + notesList.get(i).getTitle() + "\n");
        }
        return catalog.toString();
    }
}
