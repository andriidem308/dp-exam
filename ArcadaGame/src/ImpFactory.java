public class ImpFactory implements ShooterFactory {
    @Override
    public Shooter createMonster(String level) {
        return new Imp(level);
    }
}