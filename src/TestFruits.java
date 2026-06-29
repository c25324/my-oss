public class TestFruit {
    public static void main(String[] args){
        Fruit fruits[3];

        fruits[0] = new Fruit("Apple", 10);
        fruits[1] = new Fruit("Peach", 7);
        fruits[2] = new Fruit("Grape", 5);

        for(Fruit f : fruits) {
            System.out.println(f);  //名前と重さを表示する
        }
    }
}