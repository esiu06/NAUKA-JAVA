package adapter;

public class SomeSystem {

    public static void main(String[] args) {

        NotebookAdapter notebookAdapter = new NotebookAdapter();
        notebookAdapter.createNote("Tytuł 1", "Pierwsza nota");
        notebookAdapter.createNote("Tytuł 2", "Druga nota");
        notebookAdapter.createNote("Tytuł 3", "Trzecia nota");

        System.out.println(notebookAdapter.notesCatalog());
        System.out.println("Notatka 2: " + notebookAdapter.getNote("Tytuł 2") + "\n");
        notebookAdapter.removeNote("Tytuł 3");


        notebookAdapter.createNote("Tytuł 4", "Nowa notatka z odbiorcą", "Frodo");
        System.out.println(notebookAdapter.notesCatalog());
    }
}
