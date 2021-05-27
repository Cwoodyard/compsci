
/**
 * @purpose Main working class for Contacts.java
 *
 * @author  Cole Woodyard
 * 
 * @version 04/1/2021
 */
import java.util.ArrayList;

public class ContactsBook {
    // Output
    public static void output(ArrayList<Contacts> contact) {
        System.out.println();
        System.out.printf("%-20s %-15s %-17s %-15s %-25s", "Name", "Relation", "Phone Number", "Birthday", "Email");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------");
        for (int i = 0; i < contact.size(); i++) System.out.println(contact.get(i));
        System.out.println();
    }

    public static void output(ArrayList<Contacts> contact, Boolean[] pos) {
        System.out.println();
        System.out.printf("%-20s %-15s %-17s %-15s %-25s", "Name", "Relation", "Phone Number", "Birthday", "Email");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------");
        for (int i = 0; i < pos.length; i++) {
            try {
//                System.out.println("Debug: " + pos[i]);
//                System.out.println("Debug: " + contact.get(i));
                if (pos[i].equals(true)) {
                    System.out.println(contact.get(i));
                }
            } catch (NullPointerException e) {

            }

        }
        System.out.println();
    }

    // Modified sorting Process From 8.02 assignment - Replacement Method
    public static void nameSort(ArrayList<Contacts> contact) {
        System.out.println("Sorting by Name Initialized: ");
        int i;
        int k;
        int posMax;
        Contacts temp;
        i = 0;
        k = 0;
        for (i = contact.size() - 1; i > 0; i--) {
            posMax = 0;

            for (k = 1; k <= i; k++) {
                if (contact.get(k).getName().compareTo(contact.get(posMax).getName()) > 0) posMax = k;
            }

            temp = contact.get(i);
            contact.set(i, contact.get(posMax));
            contact.set(posMax, temp);

        }
        System.out.println("Done Sorting by Name!");
        output(contact);
    }

    public static void relationSort(ArrayList<Contacts> contact) {
        System.out.println("Sorting by Relationship Initialized: ");
        int i;
        int k;
        int posMax;
        Contacts temp;
        i = 0;
        k = 0;
        for (i = contact.size() - 1; i > 0; i--) {
            posMax = 0;

            for (k = 1; k <= i; k++) {
                if (contact.get(k).getRelation().compareTo(contact.get(posMax).getRelation()) > 0) posMax = k;
            }

            temp = contact.get(i);
            contact.set(i, contact.get(posMax));
            contact.set(posMax, temp);

        }
        System.out.println("Done Sorting by Relationship!");
        output(contact);
    }

    public static void contactSort(ArrayList<Contacts> contact) {
        System.out.println("Sorting by Phone Initialized: ");
        int i;
        int k;
        int posMax;
        Contacts temp;
        i = 0;
        k = 0;
        for (i = contact.size() - 1; i > 0; i--) {
            posMax = 0;

            for (k = 1; k <= i; k++) {
                try {
                    if (contact.get(k).getPhone().compareTo(contact.get(posMax).getPhone()) > 0) posMax = k;

                } catch (NullPointerException e) {
                    if (contact.get(k).getPhone() == null) {
                        contact.get(k).setPhone("N/A");
                    }
                }

            }

            temp = contact.get(i);
            contact.set(i, contact.get(posMax));
            contact.set(posMax, temp);

        }
        System.out.println("Done Sorting by Phone!");
        output(contact);
    }

    public static void birthdaySort(ArrayList<Contacts> contact) {
        System.out.println("Sorting by Birthday Initialized: ");
        int i;
        int k;
        int posMax;
        Contacts temp;
        i = 0;
        k = 0;
        for (i = contact.size() - 1; i > 0; i--) {
            posMax = 0;

            for (k = 1; k <= i; k++) {
                if (contact.get(k).getBirthday().compareTo(contact.get(posMax).getBirthday()) > 0) posMax = k;
            }

            temp = contact.get(i);
            contact.set(i, contact.get(posMax));
            contact.set(posMax, temp);

        }
        System.out.println("Done Sorting by Birthday!");
        output(contact);
    }

    public static void emailSort(ArrayList<Contacts> contact) {
        System.out.println("Sorting by Email Initialized: ");
        int i;
        int k;
        int posMax;
        Contacts temp;
        i = 0;
        k = 0;
        for (i = contact.size() - 1; i > 0; i--) {
            posMax = 0;

            for (k = 1; k <= i; k++) {
                if (contact.get(k).getEmail().compareTo(contact.get(posMax).getEmail()) > 0) posMax = k;
            }

            temp = contact.get(i);
            contact.set(i, contact.get(posMax));
            contact.set(posMax, temp);

        }
        System.out.println("Done Sorting by Email!");
        output(contact);
    }

    // Finders - binary
    public static void findName(ArrayList<Contacts> contact, String c) {
        System.out.println();
        nameSort(contact);
        System.out.println();
        System.out.println("Searching the list for contact by " + c);
        Boolean found = false;
        Boolean fullFound = false;
        Boolean[] pos = new Boolean[contact.size()];
        int high = contact.size();
        int low = -1;
        int probe;

        while (high - low > 1) {

            probe = (high + low) / 2;
            if (contact.get(probe).getName().compareTo(c) > 0)
                high = probe;
            else low = probe;
//            System.out.println("Debug: Probe " + probe);
//            System.out.println("Debug: Low " + low);
        }

        if ((low >= 0) && (contact.get(low).getName().compareTo(c) == 0)) {
            if (pos[low] == null) {
//                System.out.println("Debug: pos[low] was found true");
                pos[low] = true;
                found = true;
            }
            try {
                if (pos[low] = true) {
                    fullFound = true;
                    found = false;
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }
        }

        if (fullFound = true) {  // we have found the person
            System.out.println("We found " + c + " in the Contacts list: ");

            output(contact, pos);

        } else System.out.println(c + " is not in the Contacts list.");

    }

    public static void findRelation(ArrayList<Contacts> contact, String r) {
        System.out.println();
        relationSort(contact);
        System.out.println();
        System.out.println("Searching the list for relation of: " + r);
        Boolean found = false;
        Boolean fullFound = false;
        Boolean[] pos = new Boolean[contact.size()];
        int high = contact.size();
        int low = -1;
        int probe;

        while (high - low > 1) {

            probe = (high + low) / 2;
            if (contact.get(probe).getRelation().compareTo(r) > 0) {
                high = probe;
            } else {
                low = probe;
            }
//            System.out.println("Debug: Probe " + probe);
//            System.out.println("Debug: Low " + low);
            if ((low >= 0) && (contact.get(low).getRelation().compareTo(r) == 0)) {
                if (pos[low] == null) {
//                    System.out.println("Debug: pos[low] was found true");
                    pos[low] = true;
                    found = true;
                }
                try {
                    if (pos[low] = true) {
//                        System.out.println("Debug: pos[low] was found true");
                        fullFound = true;
                        found = false;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {

                }
            }
        }
        if (fullFound = true) {  // we have found the person
            System.out.println("We found " + r + " in the Contacts list: ");

            output(contact, pos);

        } else System.out.println(r + " is not in the Contacts list");

    }

    // Finders - sequential
    public static void findBirthday(ArrayList<Contacts> contact, String b) {
        System.out.println();
        birthdaySort(contact);
        System.out.println();
        System.out.println("Searching the list for Birthdays on the month of " + b);
        Boolean found = false;
        Boolean fullFound = false;
        Boolean[] pos = new Boolean[contact.size()];
        int i = 0;
        int t = 0;

        for (t = 0; t < contact.size(); t++) {
            for (i = 0; i < contact.size(); i++) {
                if (contact.get(i).getBirthday().contains(b)) {
                    if (pos[i] == null) {
                        found = true;
                        pos[i] = true;
                        break;   // terminates the for loop
                    }
                }
            }
            try {
                if (pos[i] = true) {  // we have found the person
                    fullFound = true;
                    found = false;
                }
            } catch (ArrayIndexOutOfBoundsException er) {

            }

        }
        if (fullFound = true) {  // we have found the person
            System.out.println("We found " + b + " in the Library: ");

            output(contact, pos);

        } else System.out.println(b + " is not in the Library");

    }

    public static void findPhone(ArrayList<Contacts> contact, String p) {
        System.out.println();
        contactSort(contact);
        System.out.println();
        System.out.println("Searching the list for the phone number containing " + p);
        Boolean found = false;
        Boolean fullFound = false;
        Boolean[] pos = new Boolean[contact.size()];
        int i = 0;
        int t = 0;

        for (t = 0; t < contact.size(); t++) {
            for (i = 0; i < contact.size(); i++) {

                try {
                    if (contact.get(i).getPhone().contains(p)) {
                        if (contact.get(i).getPhone().contains(p)) {
                            if (pos[i] == null) {
                                found = true;
                                pos[i] = true;
                                break;   // terminates the for loop
                            }
                        }
                    }
                } catch (NullPointerException er) {

                }

            }
        }
        try {
            if (pos[i] = true) {  // we have found the person
                fullFound = true;
                found = false;
            }
        } catch (ArrayIndexOutOfBoundsException er) {

        }

        if (fullFound = true)

        {  // we have found the person
            System.out.println("We found " + p + " under: ");

            output(contact, pos);

        } else System.out.println(p + " is not in the Contacts list.");

    }

    public static void findEmail(ArrayList<Contacts> contact, String e) {
        System.out.println();
        emailSort(contact);
        System.out.println();
        System.out.println("Searching the list for Emails containing " + e);
        Boolean found = false;
        Boolean fullFound = false;
        Boolean[] pos = new Boolean[contact.size()];
        int i = 0;
        int t = 0;

        for (t = 0; t < contact.size(); t++) {
            for (i = 0; i < contact.size(); i++) {
                if (contact.get(i).getEmail().contains(e)) {
                    if (pos[i] == null) {
                        found = true;
                        pos[i] = true;
                        break;   // terminates the for loop
                    }
                }
            }
            try {
                if (pos[i] = true) {  // we have found the person
                    fullFound = true;
                    found = false;
                }
            } catch (ArrayIndexOutOfBoundsException er) {

            }

        }
        if (fullFound = true) {  // we have found the person
            System.out.println("We found " + e + " as part of the emails: ");

            output(contact, pos);

        } else System.out.println(e + " is not found.");

    }

    // Main Execution
    public static void main(String[] args) {
//        ArrayList<Contacts> contact = new ArrayList<Contacts>();
//        contact.add(new Contacts("Becky Anderson", "Aunt", "515-222-2222", "Oct 31", "beckyHorselover@gmail.com"));
//        contact.add(new Contacts("Juan Rameres", "Friend", "Messenger Pigeon", "Jan 22", "asdwd@alpine.com"));
//        contact.add(new Contacts("August Winters", "Son", null, "Jan 23", "ceo@Winters.com"));
//        contact.add(new Contacts("Jaremy Spike", "Neighbor", "515-000-1234", "Feb 22", "dorkTreehugger@hotmail.com"));
//        contact.add(new Contacts("Nathaniel Jackson", "Friend", "563-222-1344", "May 3", "songIntruder@reecees.org"));
//        contact.add(new Contacts("Micheal Anderson", "Uncle", "515-222-2222", "May 5", "MichaelMyresLover1@mail.com"));
//        contact.add(new Contacts("Drew Harvey", "Friend", "312-333-3333", "Mar 31", "harvey.drew@gmail.com"));
//        contact.add(new Contacts("Kingsman Michael", "Uncle", null, "Dec 31", "Michael@kingsman.onion"));
//        contact.add(new Contacts("Nemo Jaremy", "Grandfather", "999-999-9919", "Jun 2", "nemoHater@gboy.com"));
//        contact.add(new Contacts("Narni Cycle", "Grandmother", "999-999-9919", "Aug 3", "NarniaReader@narnia.com"));
//        output(contact);
//        findName(contact, "Jackson");
//        findRelation(contact, "Uncle");
//        findBirthday(contact, "May");
//        findPhone(contact, "9");
//        findEmail(contact, "gmail.com");
        int row = 1;
        int seats = 10;
        for (int i = 1; i != 15; i++) {
            seats = seats + 4;
            row = row + seats;

            System.out.println(seats);
        }
        System.out.println(row);

    }
}
