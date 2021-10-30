import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Events: tasks that start at a specific time and ends at a specific time e.g., team project meeting on 2/10/2019 2-4pm
 */
public class Event extends Task{

    protected LocalDate at;

    public Event(String description, LocalDate at) {
        super(description);
        this.at = at;
    }

    @Override
    public String toString() {

        return "[E]" + super.toString() + " (at: " + at.format(DateTimeFormatter.ofPattern("MMM d yyyy")) + ")";
    }
}
