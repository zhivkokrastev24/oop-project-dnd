public class Hero {
    private Race race;
    private int strength;
    private int mana;
    private int health;
    private int level;
    private Weapon weapon;
    private Armor armor;
    private Spell spell;

    public Hero(Race race, int strength, int mana, int health, int level) {
        this.race = race;
        this.strength = strength;
        this.mana = mana;
        this.health = health;
        this.level = level;
        this.weapon = new Weapon("Default sword", 20);
        this.armor = new Armor("No Armor", 0);
        this.spell = new Spell("Fireball", 20, 10);
    }
}