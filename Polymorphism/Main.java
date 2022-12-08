package Polymorphism;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "A shark eats people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Independence day");
    }

    @Override
    public String plot() {
        return "blah vlah";
    }
}

class Cars extends Movie {
    public Cars() {
        super("Cars");
    }

    @Override
    public String plot() {
        return "vrrom";
    }
}

    class Forgettable extends Movie{
        public Forgettable(){
            super("Forgetable");
        }
    }

public class Main {

    public static void main(String[] args) {
        for(int i =1; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ": "+movie.getName()+ "\n"+"Plot: "+movie.plot()+"\n");

        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("random no is: "+ randomNumber);
        switch (randomNumber){
            case 1:
            return new Jaws();
            case 2:
            return  new IndependenceDay();
            case 3:
            return new MazeRunner();
            case 4:
            return new Cars();
            case 5:
            return new Forgettable();

        }
        return null;
    }

}
