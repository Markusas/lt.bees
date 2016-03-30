package lt.bees.domain.service;

import lt.bees.domain.entity.ContactEntity;

import java.util.List;

/**
 * Created by Ala on 3/22/2016.
 */
public interface BeesService {

    List<ContactEntity> retriveContacts();
    void addContact(ContactEntity contact);
    void removeContact(ContactEntity contact);

}
