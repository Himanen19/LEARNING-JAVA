package learn.himanen;

public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public static Movie getMovie(String type, String movieName) {

        return switch (type.toLowerCase().charAt(0)) {
            case 'a' -> new Adventurer(movieName);
            case 'h' -> new Horror(movieName);
            default -> new Movie(movieName);
        };
    }

    public void watchMovie() {
        System.out.println(title + "is a " + this.getClass().getSimpleName() + " film");
    }
}

class Adventurer extends Movie {
    public Adventurer(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Something adventuring is happenning... \n Now something very adventureeing......");
    }
}


class Horror extends Movie {
    public Horror(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Something horror is happenning... \n Now something very horrring......");
    }
}