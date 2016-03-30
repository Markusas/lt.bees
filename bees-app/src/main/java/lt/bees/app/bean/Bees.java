package lt.bees.app.bean;

import lt.bees.domain.entity.ContactEntity;
import lt.bees.domain.service.impl.BeesServiceImpl;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ala on 3/26/2016.
 */
@ManagedBean
@SessionScoped
public class Bees {
    private String firstName;
    private String lastName;


    private BeesServiceImpl beesService = new BeesServiceImpl();
    private List<ContactEntity> contactsList;



    private void resetField(){
        firstName = null;
        lastName = null;
        contactsList = null;
    }

    public void addContact(){
        ContactEntity contact = new ContactEntity();
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        beesService.addContact(contact);
        resetField();
      }

    public void removeContact(ActionEvent event) {
        ContactEntity contact = (ContactEntity) event.getComponent().getAttributes().get("contact");
        beesService.removeContact(contact);
        resetField();
    }

    public List<ContactEntity> getContactsList() {
        if (contactsList == null){
            contactsList = new ArrayList<ContactEntity>(beesService.retriveContacts());
        }
        return contactsList;
    }

    public void setContactsList(List<ContactEntity> contactsList) {
        this.contactsList = contactsList;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
