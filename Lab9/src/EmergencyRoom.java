import java.time.LocalTime;
import java.util.Comparator;
public class EmergencyRoom {
    private final Heap<Patient> patients;
    public EmergencyRoom(Comparator<Patient> comparator) {
        this.patients = new Heap<>(comparator);
    }
    public void checkIn(Patient patient, Severity severity) {
        patient.setSeverity(severity);
        patient.setArrivalTime(LocalTime.now());
        patients.add(patient);
    }
    public Patient admit() {
        return patients.remove();
    }
}
