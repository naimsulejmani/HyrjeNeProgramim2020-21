package cacttus.education.com.arrays;

public class CardDeck {

    public static void main(String[] args) {
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
}
