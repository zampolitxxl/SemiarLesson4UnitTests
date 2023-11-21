package Seminar5;

import java.util.ArrayList;

public class TextBook {

    ArrayList<Contact> data = new ArrayList<>();

    public TextBook(Contact contact) {
        data.add(contact);
    }

    public void addContact(Contact contact) {
        data.add(contact);
    }

    public void removeContact(Contact contact) {
        data.remove(contact);
    }


    public Contact getContact(Contact contact) {
        Contact getContact;
        for (Contact cont : this.data) {
            if (cont == contact) {
                return cont;

            }
        }
        return null;

    }


        public void changeContact (String oldName, String newName, String phone){


            for (Contact cont : this.data) {

                if (cont.getName() == oldName) {
                    cont.changeContactNamePhone(newName, phone);

                }

            }

        }
    }

