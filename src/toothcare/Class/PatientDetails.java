/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toothcare.Class;

/**
 *
 * @author DELL
 */
public class PatientDetails {
    public int patID;
    public String patName;
    public String patPhone;
    public String patAddrss;
    public String patDOB;
    public String patGendr;
    public String PatAge;

    public PatientDetails(int patID, String patName, String patPhone, String patAddrss, String patDOB, String patGendr, String PatAge) {
        this.patID = patID;
        this.patName = patName;
        this.patPhone = patPhone;
        this.patAddrss = patAddrss;
        this.patDOB = patDOB;
        this.patGendr = patGendr;
        this.PatAge = PatAge;
    }
}
