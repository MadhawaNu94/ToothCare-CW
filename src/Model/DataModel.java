/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Model.Appointment;


// Singleton class for managing user and appointment data
public class DataModel {
    private static DataModel instance; //ststic variable use for implementation of singleton design pattern
    private List<Appointment> appointments; //hold a list of objects of the appointment class.provides a dynamic array to store objects
    private Map<String, Double> treatments; //treatment variable initialize with HashMap.It allows to to store objects of 2 datatypes

    //Declaring Constructor using class name
    private DataModel() {
        appointments = new ArrayList<>(); // Initialize the appointments list with an ArrayList
        treatments = new HashMap<>(); // Initialize the treatments map with an HashMap
        treatments.put("Cleaning", 12000.00);
        treatments.put("Whitening", 10000.00);
        treatments.put("Filling", 5000.00);
        treatments.put("Nerve Filling", 15000.00);
        treatments.put("Root Canal Therapy", 25000.00);
    }

    // implementation of singleton design pattern
    public static DataModel getInstance() {
        if (instance == null) {
            instance = new DataModel();
        }
        return instance;
    }

    // method for creating an appointment
    public void makeAppointment(int appointmentId, String patientName, String patientAddress, 
            String date, String patientPhone, String timeSlot) {
        Appointment newAppointment = new Appointment(appointmentId, patientName,
                patientAddress, patientPhone, date, timeSlot, true);
        appointments.add(newAppointment);
    }

    //method for searching appointment Id
    public Appointment getAppointmentsByAppointmentId(int appNum, String date) {
        Appointment result = null;
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentId() == appNum && appointment.getDate().equals(date)) {
                result = appointment;
            }
        }
        return result;
    }
    //This method takes date as a parameter and returns a list of Appointment objects scheduled for that date
    public List<Appointment> getAppointmentsByDate(String date) {
        List<Appointment> userAppointments = new ArrayList<>();
        for (Appointment appointment : appointments) {
            if (appointment.getDate().equals(date)) {
                userAppointments.add(appointment);
            }
        }
        return userAppointments;
    }
    //This method takes a list of Appointment objects as a parameter
    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
    //This method returns a list of Appointment objects
    public List<Appointment> getAppointments() {
        return appointments;
    }
    //This method returns a map of Treatments objects
    public Map<String, Double> getTreatments() {
        return treatments;
    }
    
}

