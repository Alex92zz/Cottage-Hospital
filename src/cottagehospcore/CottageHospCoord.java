package cottagehospcore;

import java.util.*;
import m256date.*;

/**
 * The coordinating class for the Cottage Hospital core system.
 */
public class CottageHospCoord
{
    //links

    /**
     * a collection of all Ward objects
     */
    private Collection<Ward> wards;


    //constructor

    /**
     * Initialises a new CottageHospCoord object with the default wards and patients.
     */
    public CottageHospCoord()
    {
        wards = new HashSet<Ward>();
        Ward ward1 = new Ward("Nightingale");
        Ward ward2 = new Ward("Swallow");
        Ward ward3 = new Ward("Heron");
        Ward ward4 = new Ward("Lark");
        wards.add(ward1);
        wards.add(ward2);
        wards.add(ward3);
        wards.add(ward4);
        try // in case the dates are badly formatted
        {
            // Populate the cottage hospital
            admit("Angela Brown", new M256Date("23/4/67"), ward1);
            admit("Brenda Clark", new M256Date("2/7/69"), ward1);
            admit("Cecilia Davidson", new M256Date("17/11/72"), ward1);

            admit("David Edwards", new M256Date("13/12/56"), ward2);
            admit("Edward Fox", new M256Date("7/6/68"), ward2);

            admit("Fred Goldsmith", new M256Date("7/7/77"), ward3);
            admit("George Harrison", new M256Date("6/7/89"), ward3);
            admit("Herbert Irving", new M256Date("8/7/65"), ward3);

            admit("Julia King", new M256Date("12/12/89"), ward4);
            admit("Katy Lang", new M256Date("14/3/67"), ward4);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    //public protocol

    /**
     * Returns all the wards in the hospital.
     *
     * @return a collection of all the Ward objects
     */
    public Collection<Ward> getWards()
    {
        return wards;
    }


    /**
     * Returns the patients that are on the ward.
     *
     * @param aWard a ward
     *
     * @return a collection of all the Patient objects linked to aWard
     */
    public Collection<Patient> getPatients(Ward aWard)
    {
        return aWard.getPatients();
    }


    /**
     * Records the admission of a patient with the given attributes to the ward.
     *
     * @param aName  the name of the patient.
     * @param aDate the date of birth of the patient
     * @param aWard a ward
     */
    public void admit(String aName, M256Date aDate, Ward aWard)
    {
        Patient aPatient = new Patient(aName, aDate);
        aWard.add(aPatient);
    }
}