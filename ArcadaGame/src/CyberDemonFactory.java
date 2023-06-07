public class CyberDemonFactory implements ShooterFactory {
    @Override
    public Shooter createMonster(String level) {
        return new CyberDemon(level);
    }
}