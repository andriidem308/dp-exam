public class CacoDemonFactory implements ShooterFactory {
    @Override
    public Shooter createMonster(String level) {
        return new CacoDemon(level);
    }
}