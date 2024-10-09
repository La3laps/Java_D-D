package Potionspkg;

import Cases.Case;
import Personnages.Personnage;

public abstract class Potion implements Case {
    private int hpRestore;

    public Potion() {

    }

    public void setHpRestore(int restore) {
        this.hpRestore = restore;
    }

    public int getHpRestore() {
        return this.hpRestore;
    }

    @Override
    public void interact(Personnage personnage) {
        personnage.setNiveauDeVie(personnage.getNiveauDeVie() + hpRestore);
    }

    @Override
    public String toString() {
        String msg = "Cette case contient une potion redonnant " + this.hpRestore + "PDV";
        return msg;
    }
}