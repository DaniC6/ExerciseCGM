package it.daniele.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("canarino")
@Scope("prototype")
public class Canarino implements isAnimali{

    @Value ( "canarino" )
    private String tipo;

    @Override
    public void verso() {
        System.out.println ("cip");
    }

    @Override
    public void genere() {
        System.out.println ("Sono un " + tipo);
    }
}
