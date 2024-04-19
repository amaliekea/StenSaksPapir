//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Menneskespiller player1 = new Menneskespiller("MenneskeSpiller");
        Computerspiller player2 = new Computerspiller("ComputerSPiller");
        Spil game = new Spil(player1, player2);
        game.start();
    }
}