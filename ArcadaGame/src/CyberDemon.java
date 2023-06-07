public class CyberDemon implements Shooter {
    private final String level;

    public CyberDemon(String level) {
        this.level = level;
    }

    @Override
    public void shoot() {
        System.out.printf("Creature: %s, level %s, action: shoots\n", "CyberDemon", level);
    }
}
