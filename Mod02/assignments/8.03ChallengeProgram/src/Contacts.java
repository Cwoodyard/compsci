/**
 * @purpose: Class to take in and process data for ContactsBook
 *
 * @author   Cole Woodyard
 * 
 * @version  04/1/2021
 */
public class Contacts {
    String n;
    String phone;
    String birth;
    String mail;
    String relation;

    public Contacts(String name, String relationship, String phoneNumber, String birthday, String email) {
        n = name;
        relation = relationship;
        phone = phoneNumber;
        birth = birthday;
        mail = email;
    }

    public String getName() {
        return n;
    }

    public void setName(String name) {
        n = name;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relationship) {
        relation = relationship;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phoneNum) {
        phone = phoneNum;
    }

    public String getBirthday() {
        return birth;
    }

    public void setBirthday(String birthday) {
        birth = birthday;
    }

    public String getEmail() {
        return mail;
    }

    public void setEmail(String email) {
        mail = email;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-15s %-17s %-15s %-25s", n, relation, phone, birth, mail);
    }

}
