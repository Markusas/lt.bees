package lt.bees.domain.service.impl;

import lt.bees.domain.entity.ContactEntity;
import lt.bees.domain.service.BeesService;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ala on 3/18/2016.
 */
public class BeesServiceImpl implements BeesService {

    private List<ContactEntity> contacts = new ArrayList<ContactEntity>();

    public List<ContactEntity> retriveContacts(){
        return contacts;
    }

    public void addContact(ContactEntity contact){
        contacts.add(contact);
    }

    public void removeContact(ContactEntity contact){
        if(contacts.contains(contact)) {
            contacts.remove(contact);
        } else throw new IllegalArgumentException("There is no such contact in database");
    }

    /*private ContactEntity createContact(String firstName, String lastName){
        ContactEntity contactEntity = new ContactEntity();
        contactEntity.setFirstName(firstName);
        contactEntity.setLastName(lastName);
        return contactEntity;
    }*/
}
