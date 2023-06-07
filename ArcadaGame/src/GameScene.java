import java.util.ArrayList;
import java.util.List;

/**
 * Ігрова сцена
 */
public class GameScene {

    public final String level;  // Складність гри

    private final List<Shooter> shooters = new ArrayList<>();

    public GameScene(String level) {
        this.level = level;
    }

    /**
     * Додати монстра на ігровий рівень
     * @param type - тип монстра
     */
    public void addMonster(MonsterType type) {
        Shooter shooter = MonsterFactory.createMonster(type, level);
        shooters.add(shooter);
    }

    /**
     * Запустити рівень
     */
    public void start() {
        for (Shooter shooter : shooters) {
            shooter.shoot();
        }
    }

}
