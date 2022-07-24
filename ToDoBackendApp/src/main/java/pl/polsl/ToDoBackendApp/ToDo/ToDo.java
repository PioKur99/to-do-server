package pl.polsl.ToDoBackendApp.ToDo;

public class ToDo {
    private Long id;
    private String text;

    public ToDo() {

    }

    public ToDo(String text) {
        this.text = text;
    }

    public ToDo(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
