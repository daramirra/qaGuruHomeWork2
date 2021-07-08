package guru.qa;

import java.time.LocalDate;
import java.util.Date;

public class Task {
    private int id;
    private LocalDate creationDate;
    private String title;
    private String description;
    private boolean resolved;

    public Task(int id, String title) {
        this.id = id;
        this.creationDate = LocalDate.now();
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setResolved(boolean resolved){
        this.resolved = resolved;
    }

    public int getId() {
        return id;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isResolved() {
        return resolved;
    }
}
