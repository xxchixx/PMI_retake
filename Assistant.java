public class Assistant extends Dentist{
    public void refreshAppointment(String patientName, Integer amount){
        if(super.existsPatient(patientName)){
            int index = super.getIndexOfPatient(patientName);
            super.getPatientArrayList().get(index).addAppointment(amount);
        }
    }
}
