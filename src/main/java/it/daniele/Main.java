package it.daniele;

import it.daniele.config.ConfigApp;
import it.daniele.model.Canarino;
import it.daniele.model.Cane;
import it.daniele.model.Gatto;
import it.daniele.model.Proprietari;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext apx = new AnnotationConfigApplicationContext ( ConfigApp.class );

        System.out.println ("----- a) recupera dal context tre oggetti di tipo cane,gatto e canarino\n" + "b)ritorna per ogni oggetto il verso corretto -------");
        System.out.println ();
        Cane cane = apx.getBean ( "cane",Cane.class );
        System.out.println ("verso del Cane: " );
        cane.verso ();

        Canarino canarino = apx.getBean ( "canarino", Canarino.class );
        System.out.println ("verso del Canarino: " );
        canarino.verso ();

        Gatto gatto = apx.getBean ( "gatto", Gatto.class );
        System.out.println ("verso del Gatto: " );
        gatto.verso ();

        System.out.println ("------ c) setta un proprietario su un animale\n" + "d) richiama il metodo possiede sul proprietari -----");
        System.out.println ();

        Proprietari proprietari = apx.getBean ( "proprietari", Proprietari.class );
        proprietari.setCognome ( "Gidi" );
        proprietari.possiede ();



    }
}
