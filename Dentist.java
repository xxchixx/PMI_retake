import java.util.ArrayList;

public class Dentist {
    private ArrayList<Patient> patientArrayList;

    public Dentist(){
        patientArrayList = new ArrayList<>();
    }

    public void newAppointment(String patientName){
        if(!existsPatient(patientName)){
            Patient patient = new Patient(patientName);
            patientArrayList.add(patient);
        }
    }

    public void resign(String patientName){
        if(existsPatient(patientName)){
            int index = getIndexOfPatient(patientName);
            patientArrayList.remove(index);
        }
    }

    public String getAppointments(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<patientArrayList.size(); i++){
            Patient patient = patientArrayList.get(i);
            stringBuilder.append(patient.getPatientName()).append(" ").append(patient.getAppointment());

            if(i < patientArrayList.size() - 1){
                stringBuilder.append("\r\n");
            }
        }

        return stringBuilder.toString();
    }

    public int getIndexOfPatient(String patientName){
        for (int i = 0; i<patientArrayList.size(); i++){
            if(patientArrayList.get(i).getPatientName().equals(patientName)){
                return i;
            }
        }
        return -1;
    }

    public boolean existsPatient(String patientName){
        for (Patient u : patientArrayList){
            if(u.getPatientName().equals(patientName)){
                return true;
            }
        }
        return false;
    }

    public ArrayList<Patient> getPatientArrayList() {
        return patientArrayList;
    }

    public void setPatientArrayList(ArrayList<Patient> patientArrayList) {
        this.patientArrayList = patientArrayList;
    }
}
