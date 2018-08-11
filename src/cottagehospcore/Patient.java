package cottagehospcore;

import m256date.*;

/**
 * Patient objects represent the patients currently admitted to the cottage hospital.
 */
public class Patient 
{
    //attributes
    
    /**
     * the name of the patient
     */
    private String name; 
    
    /**
     * the date of birth of the patient
     */
    private M256Date dateOfBirth; 
   
   
    //constructor
   
    /**
     * Initialises a new Patient object with the given name
     * and date of birth.
     *
     * @param aName the name of the patient
     * @param aDate the date of birth of the person
     */
    Patient(String aName, M256Date aDate)
    {
        name = aName;
        dateOfBirth = aDate;
    }
   
   
    //public protocol
   
    /**
     * Returns the name of this patient.
     *
     * @return name
     */
    public String getName()
    {
        return name;
    }
   
    
    /**
     * Returns the age of this person.
     *
     * @return age
     */
    public int getAge()
    {
        return dateOfBirth.getAge();
    }
   
    
    /**
     * Returns a string representation of this patient's name and date of birth. 
     *
     * @return a string object containing information about the receiver
     */
    public String toString()
    {
        return name + " " + dateOfBirth;
    }
}