/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Appointment {
    // variable Declaration
    private int appointmentId;
    private String patientname;
    private String patientAddress;
    private String patientPhoneNumber;
    private String date;
    private String timeSlot;
    private boolean registrationFeePaid;
    private String treatment;
    private double treatmentFee;

    //Defining the Constructor
    public Appointment(int appointmentId, String patientname, String patientAddress, 
            String patientPhoneNumber, String date, String timeSlot, boolean registrationFeePaid) {
        this.appointmentId = appointmentId;
        this.patientname = patientname;
        this.patientAddress = patientAddress;
        this.patientPhoneNumber = patientPhoneNumber;
        this.date = date;
        this.timeSlot = timeSlot;
        this.registrationFeePaid = registrationFeePaid;
    }
    //Implementing getter & setter
    /*allows other classes to retrieve the value of appointmentId 
    without directly accessing the variable*/
    public int getAppointmentId() { 
        return appointmentId;
    }
    //allows other classes to set the value of appointmentId variable
    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientPhoneNumber() {
        return patientPhoneNumber;
    }

    public void setPatientPhoneNumber(String patientPhoneNumber) {
        this.patientPhoneNumber = patientPhoneNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public boolean isRegistrationFeePaid() {
        return registrationFeePaid;
    }

    public void setRegistrationFeePaid(boolean registrationFeePaid) {
        this.registrationFeePaid = registrationFeePaid;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public double getTreatmentFee() {
        return treatmentFee;
    }

    public void setTreatmentFee(double treatmentFee) {
        this.treatmentFee = treatmentFee;
    }

}

