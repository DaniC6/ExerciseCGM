package it.daniele.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("cane")
@Scope("prototype")
public class Cane implements isAnimali{

    @Value ( "cane" )
    private String tipo;

    @Override
    public void verso() {
        System.out.println ("Bau");
    }

    @Override
    public void genere() {
        System.out.println ("Sono un "+tipo);
    }
}
