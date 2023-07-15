
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Comparator;
public class Patient {
    private final String name;
    private final LocalDate dob;
    private Severity severity;
    private LocalTime arrivalTime;

    public Patient(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return name + "\n DOB=" + dob + "\n severity=" + severity + "\n arrivalTime=" + arrivalTime + " admitted";
    }
}



