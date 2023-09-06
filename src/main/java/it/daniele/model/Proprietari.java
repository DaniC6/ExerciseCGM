package it.daniele.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("proprietari")
@Scope("prototype")
public class Proprietari {

    private String cognome;
    private isAnimali petFriend;

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public isAnimali getPetFriend() {
        return petFriend;
    }

    @Autowired
    @Qualifier(value = "cane")
    public void setPetFriend(isAnimali petFriend) {
        this.petFriend = petFriend;
    }

    public void possiede(){
        System.out.println ("Cognome: " + this.cognome );
        petFriend.genere () ;
        System.out.println ("Il mio padrone è " + this.cognome);

    }
}
