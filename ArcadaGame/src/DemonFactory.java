public class DemonFactory implements ShooterFactory {
    @Override
    public Shooter createMonster(String level) {
        return new Demon(level);
    }
}