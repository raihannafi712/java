// NO NEED THIS SUBMIT THIS CLASS
public class WRM {
    Patient dh;

    //The constructor is already created for you
    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }


    //a
    public void registerPatient(int id, String name, int age, String bloodgroup) {

        Patient last_p = dh.prev;
        
        Patient p1 = new Patient(id, name, age, bloodgroup, dh, last_p);           /* Newly added patients next node will always be dh */    

        last_p.next = p1;
        // p1.next = dh;                                     /* p1's next and previous patients are given in the constructor */
        dh.prev = p1;
    }






    //b
    public void servePatient() {

        if (canDoctorGoHome() == true) {
            System.out.println("No patients waiting.");
            return;
        }
        
        Patient first_p = dh.next;
        Patient second_p = first_p.next;

        //connecting the dh and 2nd patient
        dh.next = second_p;
        second_p.prev = dh;

        //removing the first patient
        System.out.println("Serving Patient ID: " + first_p.id + " (" + first_p.name + ")");

        first_p.next = null;
        first_p.prev = null;

    }






    //c
    public void cancelAll(){
        dh.next = dh;
        dh.prev = dh;
    }






    //d
    public Boolean canDoctorGoHome() {

        if (dh.next == dh) {                /* doctor can go if next node is dh which means no patient */
            return true;
        } else {
            return false;
        }
    }






    //e
    public void showAllPatient() {

        if (canDoctorGoHome() == true) {
            System.out.println("No patients waiting.");
            return;
        }

        Patient temp = dh.next;                 /* From patient 1 */

        while (temp != dh) {                    /* temp will check if it has gone back in circle and back to dh. null would mean it has gone to no Node  */

            System.out.print(temp.name);
            if (temp.next != dh) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }






    //f
    public void reverseTheLine() {

        Patient curr = dh;
        boolean first = true;

        while (first || curr != dh) {
            first = false;
            Patient temp = curr.next;
            curr.next = curr.prev;
            curr.prev = temp;

            curr = temp;
        }

    }

}
