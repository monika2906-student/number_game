import java. util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int inputnumber;
    public int noofGuesses;

    public int getNoofGuesses() {
        return noofGuesses;
    }

    public void setNoofGuesses(int noofGuesses) {
        this.noofGuesses = noofGuesses;
    }

    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);

    }

    void takeUserInput() {
        System.out.println(" Guess the number");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();


    }

    boolean isCorrectNumber() {
        if (inputnumber == number) {
            return true;
        } else if (inputnumber < number) {
            System.out.println("too less...");
        } else if (inputnumber > number) {
            System.out.println("too high...");
        }
        return false;
    }

    public static class Numbergame {
        public static void main(String[] args) {
            Game g = new Game();
            boolean b = false;
            while (!b) {
                g.takeUserInput();
                b = g.isCorrectNumber();
                System.out.println(b);
            }
        }
    }
}

