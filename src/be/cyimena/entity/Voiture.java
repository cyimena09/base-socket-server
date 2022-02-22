package be.cyimena.entity;

import java.io.Serializable;

public class Voiture implements Serializable {
    private static final long serialVersionUID = 6529685098267757690L;
    public String marque;
    public Integer carburant;

    public Voiture(String marque, Integer carburant) {
        this.marque = marque;
        this.carburant = carburant;
    }

}
