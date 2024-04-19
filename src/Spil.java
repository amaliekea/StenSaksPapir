public class Spil {
    private Menneskespiller player1;
    private Computerspiller player2;

    public Spil(Menneskespiller m, Computerspiller c) {
        player1 = m;
        player2 = c;
    }

    public void start() {
        int antalRunder = 3;
        while (antalRunder > 0) {

            System.out.println("velkommen til spillet!, vi har " + antalRunder + " tilbage");
            System.out.println(player1.getNavn() + " har " + player1.getPoint() + " points.");
            System.out.println(player2.getNavn() + " har " + player2.getPoint() + " points.");

            Haandtegn h1 = player1.chooseHaandtegn();
            Haandtegn h2 = player2.chooseHaandtegn();

            if (h1.equals(h2)) {
                System.out.println("Uafgjort! Prøv igen.");
            }
            if (h1.equals(Haandtegn.STEN)) {
                if (h2.equals(Haandtegn.SAKS)) {
                    player1.incrementPlayerPoints();
                    System.out.println(player1.getNavn() + " vinder");
                    antalRunder--;
                }
                if (h2.equals(Haandtegn.PAPIR)) {
                    player2.incrementPlayerPoints();
                    System.out.println(player2.getNavn() + " vinder");
                    antalRunder--;
                }
            }
            if (h1.equals(Haandtegn.SAKS)) {
                if (h2.equals(Haandtegn.STEN)) {
                    player2.incrementPlayerPoints();
                    System.out.println(player2.getNavn() + " vinder");
                    antalRunder--;
                }
                if (h2.equals(Haandtegn.PAPIR)) {
                    player1.incrementPlayerPoints();
                    System.out.println(player1.getNavn() + " vinder");
                    antalRunder--;
                }
            }
            if (h1.equals(Haandtegn.PAPIR)) {
                if (h2.equals(Haandtegn.SAKS)) {
                    player2.incrementPlayerPoints();
                    System.out.println(player2.getNavn() + " vinder!");
                    antalRunder--;
                }
                if (h2.equals(Haandtegn.STEN)) {
                    player1.incrementPlayerPoints();
                    System.out.println(player1.getNavn() + " vinder!");
                    antalRunder--;
                }
            }
        }
        if (player1.getPoint() > player2.getPoint()) {
            System.out.println("vinderen er..." + player1.getNavn());
        } if (player1.getPoint() < player2.getPoint()) {
            System.out.println("vinderen er..." + player2.getNavn());
        } else {
            System.out.println("uafgjort");
        }
    }
}


