public class CacoDemon implements Shooter {
    private final String level;

    public CacoDemon(String level) {
        this.level = level;
    }

    @Override
    public void shoot() {
        System.out.printf("Creature: %s, level %s, action: shoots\n", "CacoDemon", level);
    }
}