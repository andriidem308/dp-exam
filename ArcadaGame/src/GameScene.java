import java.util.ArrayList;
import java.util.List;

/**
 * Ігрова сцена
 */
public class GameScene {

    public final String level;  // Складність гри
    private final List<ShooterFactory> shooterFactories = new ArrayList<>();

    public GameScene(String level) {
        this.level = level;
    }

    /**
     * Додати монстра на ігровий рівень
     * @param type - тип монстра
     */
    public void addMonster(MonsterType type) {
        ShooterFactory factory;

        switch (type) {
            case ZOMBIE:
                factory = new ZombieFactory();
                break;
            case IMP:
                factory = new ImpFactory();
                break;
            case DEMON:
                factory = new DemonFactory();
                break;
            case CACODEMON:
                factory = new CacoDemonFactory();
                break;
            case CYBERDEMON:
                factory = new CyberDemonFactory();
                break;
            default:
                throw new IllegalStateException("Unexpected type: " + type);
        }

        shooterFactories.add(factory);
    }

    /**
     * Запустити рівень
     */
    public void start() {
        for (ShooterFactory factory : shooterFactories) {
            Shooter shooter = factory.createMonster(level);
            shooter.shoot();
        }
    }

}
