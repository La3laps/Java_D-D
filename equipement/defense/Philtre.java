package equipement.defense;

public class Philtre extends EquipementDefensif {
    public Philtre() {
        this("Philtre mineur", 0);
    }

    public Philtre(String name, int defense) {
        super(name, "Philtre", defense);
    }
}