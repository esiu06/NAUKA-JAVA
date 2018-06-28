package adapter;

public class Note {

    private String title;
    private String note;
    private String recipient;

    public Note(String title, String note){
        this.title = title;
        this.note = note;
    }
    public Note(String title, String note, String recipient){
        this(title, note);
        this.recipient = recipient;
    }

    public String getTitle() {
        return title;
    }

    public String getNote() {
        return note;
    }

    public String getRecipient() {
        return recipient;
    }
}
