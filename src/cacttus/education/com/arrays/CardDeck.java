package cacttus.education.com.arrays;

public class CardDeck {

    public static void main(String[] args) {
        slideExample();
        //viktorCardDeck();
    }

    public static void slideExample() {
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suit = {"♣", "♦", "♥", "♠"};
        String[] deck = new String[52];//0..51

        for (int suitIndex = 0; suitIndex < suit.length; suitIndex++) {
            //System.out.println(suit[suitIndex]);

            for (int rankIndex = 0; rankIndex < rank.length; rankIndex++) {
                //System.out.printf("%3s", rank[rankIndex]);
                deck[suitIndex * rank.length + rankIndex] = rank[rankIndex] + suit[suitIndex];
            }
            // System.out.println();
        }

        System.out.println("----------------------------------------------");
        for (int i = 0; i < deck.length; i++) {
            System.out.printf("%4s", deck[i]);
        }
        System.out.println("\n----------------------------------------------");
    }

    public static void viktorCardDeck() {
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suit = {"♣", "♦", "♥", "♠"};
        String[] deck = new String[52];

        int counter = 0;
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < 4; j++) {
                deck[counter++] = rank[i] + suit[j];
            }
        }

        System.out.println("----------------------------------------------");
        for (int i = 0; i < deck.length; i++) {
            System.out.printf("%4s", deck[i]);
        }
        System.out.println("\n----------------------------------------------");
    }
}
