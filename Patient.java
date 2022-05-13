public class Patient {
    private String patientName;
    private int appointment;

    public Patient(String patientName) {
        this.patientName = patientName;
        this.appointment = 0;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAppointment() {
        return appointment;
    }

    public void setAppointment(int appointment) {
        this.appointment = appointment;
    }

    public void addAppointment(int amount){
        this.appointment = this.appointment + amount;
    }
}
