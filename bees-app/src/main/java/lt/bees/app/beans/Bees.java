package lt.bees.app.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by Ala on 3/7/2016.
 */
@ManagedBean
@SessionScoped
public class Bees {
    private String firstName;
    private String lastName;
    private String mainContent = "content/bees-form.xhtml";


    public Bees(){

    }


    public String getMainContent() {
        return mainContent;
    }

    public void setMainContent(String mainContent) {
        this.mainContent = mainContent;
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
