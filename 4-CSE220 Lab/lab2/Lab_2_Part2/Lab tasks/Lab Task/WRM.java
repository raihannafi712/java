// NO NEED THIS SUBMIT THIS CLASS

import org.w3c.dom.Node;

public class WRM {
    Patient dh;

    //The constructor is already created for you
    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    //Check notes for visualization code by code

    //a
    public void registerPatient(int id, String name, int age, String bloodgroup) {

        Patient last_p = dh.prev;
        Patient p1 = new Patient(id, name, age, bloodgroup, dh, last_p);                /* Newly added patient's next node will always be dh */

        last_p.next = p1;
        dh.prev = p1;

        //These 2 connections are made in the method call (constructor takes next and prev)
        // p1.prev = last_p;
        // p1.next = dh;

    }






    //b
    public void servePatient() {

        if (canDoctorGoHome() == true) {        //No patient
            System.out.println("No patients waiting.");
            return ;            
        }

        if (dh.next.next == null) {             //1 patient
            dh.next = dh;
            dh.prev = dh;
            return ;
        }

        //More than 1 patient
        Patient curr = dh.next;
        Patient next = dh.next.next;

        dh.next = next;
        next.prev = dh;

        //removing the first patient
        System.out.println("Serving Patient ID: " + curr.id + " (" + curr.name + ")");

        curr.next = null;
        curr.prev = null;

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


        if (canDoctorGoHome() == true) {                        //case1
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

        if (canDoctorGoHome() == true) {                        //case 1    (no patient)
            System.out.println("No patients waiting.");
            return;
        }

        if (dh.next.next == null) {                             //case 2    (1 patient)
            System.out.println("Only 1 patient in line");
        }

        
        // Get the tail
        Patient tail = dh;
        while (tail.next != dh) {
            tail = tail.next;
        }

        // Save the old first data Patient (it will become the new tail)
        Patient oldFirst = dh.next;

        // Temporarily break the circle to make it a linear list
        tail.next = null;
        dh.prev = null;

        //disconn the dh
        dh.next = null;
        oldFirst.prev = null;

        Patient curr = oldFirst;
        Patient prev = null;
        
        
        while (curr != null) {
            Patient next = curr.next;

            curr.next = prev;              //curr points at prev and stops pointing at next
            curr.prev = next;

            prev = curr;                   //prev becomes curr
            curr = next;                   //Then curr becomes next(that Patient can be accessed by next and also curr. When loop runs again, b will be the next one)
        }
        Patient reversedHead = prev;

        //Connect dh and make circular again
        dh.next = reversedHead;
        reversedHead.prev = dh;

        //circular
        dh.prev = oldFirst;
        oldFirst.next = dh;


       
        //OR

        // Patient curr = dh;
        // boolean first = true;

        // while (first || curr != dh) {
        //     first = false;
        //     Patient temp = curr.next;
        //     curr.next = curr.prev;
        //     curr.prev = temp;

        //     curr = temp;
        // }

    }

}
