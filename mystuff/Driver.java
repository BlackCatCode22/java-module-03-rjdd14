package mystuff;

public class Driver {
    public static void main(String[] args) {
        
        MyStuff game1 = new MyStuff();
        game1.title = "The Legend of Zelda: Breath of the Wild";
        game1.platform = "Nintendo Switch";
        game1.developer = "Nintendo";
        game1.genre = "Action-Adventure";
        game1.price = 59.99;
        game1.releaseYear = 2017;

        MyStuff game2 = new MyStuff();
        game2.title = "God of War";
        game2.platform = "PlayStation 4";
        game2.developer = "Santa Monica Studio";
        game2.genre = "Action-Adventure";
        game2.price = 39.99;
        game2.releaseYear = 2018;

        MyStuff game3 = new MyStuff();
        game3.title = "The Last of Us";
        game3.platform = "PlayStation 3";
        game3.developer = "Naughty Dog";
        game3.genre = "Survival Horror";
        game3.price = 49.99;
        game3.releaseYear = 2013;

         System.out.println(game1.title);
    }
}