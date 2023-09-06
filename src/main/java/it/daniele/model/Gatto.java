package it.daniele.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("gatto")
@Scope("prototype")
public class Gatto implements isAnimali{

    @Value ( "gatto" )
    private String tipo;



    @Override
    public void verso() {
        System.out.println ("Mew");
    }

    @Override
    public void genere() {
        System.out.println ("Sono un " + tipo);
    }
}
