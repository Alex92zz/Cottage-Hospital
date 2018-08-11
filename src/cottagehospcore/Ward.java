package cottagehospcore;

import java.util.*;

/**
 * Ward objects represent the wards in the cottage hospital.
 */
public class Ward
{
    //attributes
    
    /**
     * the name of the ward
     */
    private String name; 
    
    /**
     * all the linked Patient objects
     */
    private Collection<Patient> patients; 
   
   
    //constructor
    
   /**
    * Initialises a new Ward object with the given name.
    *
    * @param aName the name of the ward
    */
   Ward(String aName)
   {
      name = aName;
      patients = new HashSet<Patient>();
   }
   
    
    //public protocol
   
    /**
     * Returns the name of this ward.
     *
     * @return name
     */
    public String getName()
    {
        return name;
    }
   
    
    /**
     * Returns a string representation of this ward's name.
     *
     * @return a String object representing the receiver
     */
    public String toString()
    {
        return name;
    }
    
   
    //package protocol
   
    /**
      * Returns all the patients on this ward.
      *
      * @return a collection of all the linked Patient objects
      */
    Collection<Patient> getPatients()
    {
        return patients;
    }
   
   
    /**
     * Adds the patient to those on this ward. 
     * A reference to aPatient is recorded.
     *
     * @param aPatient a patient
     */
    void add(Patient aPatient)
    {
        patients.add(aPatient);
    }
}