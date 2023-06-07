public class MonsterFactory {
    public static Shooter createMonster(MonsterType type, String level) {
        switch (type) {
            case ZOMBIE:
                return new Zombie(level);
            case IMP:
                return new Imp(level);
            case DEMON:
                return new Demon(level);
            case CACODEMON:
                return new CacoDemon(level);
            case CYBERDEMON:
                return new CyberDemon(level);
            default:
                throw new IllegalStateException("Unexpected type: " + type);
        }
    }
}