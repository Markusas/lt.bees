package lt.bees.app.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UserInfo {

    @ManagedProperty(value = "#{bees}")
    public Bees bees;

    public Bees getBees() {
        return bees;
    }

    public void setBees(Bees bees) {
        this.bees = bees;
    }

    public void backToStartPage(){
        bees.setMainContent("content/bees-form.xhtml");
    }

    public void captureStudentInfo(){
        bees.setMainContent("content/bees-response.xhtml");
    }



}
