package adapter;

import java.util.ArrayList;

public class Notebook_v2 implements I_Notebook_v2{

    private ArrayList<Note> notesList = new ArrayList<>();

    @Override
    public void createNote(String title, String note, String recipient) {
        notesList.add(new Note(title, note, recipient));
    }

    @Override
    public String getNote(String title) {
        for (int i = 0; i < notesList.size(); i++) {
            if (notesList.get(i).getTitle().equals(title)) {
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
    public String notesList() {

        StringBuffer catalog = new StringBuffer();

        for (int i = 0; i < notesList.size(); i++) {
            catalog.append("- " + notesList.get(i).getTitle() + "\n");
        }
        return catalog.toString();
    }
}
