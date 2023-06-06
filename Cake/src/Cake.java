public class Cake {
    public  String recipe() {
        return "Cake";
    }

    @Override
    public String toString() {
        return "Cake: " + recipe();
    }
}
