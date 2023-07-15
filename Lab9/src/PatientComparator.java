import java.util.Comparator;

class PatientComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient p1, Patient p2) {
        if (p1.getSeverity() != p2.getSeverity()) {
            return p2.getSeverity().compareTo(p1.getSeverity());
        } else if (!p1.getDob().equals(p2.getDob())) {
            return p1.getDob().compareTo(p2.getDob());
        } else {
            return p1.getArrivalTime().compareTo(p2.getArrivalTime());
        }
    }
}