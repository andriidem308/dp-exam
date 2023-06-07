public class Client {
    public static void main(String[] args) {
        GameScene gameScene = new GameScene("Easy");

        gameScene.addMonster(MonsterType.IMP);
        gameScene.addMonster(MonsterType.ZOMBIE);
        gameScene.addMonster(MonsterType.IMP);
        gameScene.addMonster(MonsterType.DEMON);
        gameScene.addMonster(MonsterType.DEMON);
        gameScene.addMonster(MonsterType.ZOMBIE);
        gameScene.addMonster(MonsterType.CACODEMON);
        gameScene.addMonster(MonsterType.CYBERDEMON);
        gameScene.addMonster(MonsterType.CACODEMON);

        gameScene.start();
    }
}
