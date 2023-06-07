public class ZombieFactory implements ShooterFactory {
    @Override
    public Shooter createMonster(String level) {
        return new Zombie(level);
    }
}