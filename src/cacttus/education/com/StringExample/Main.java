package cacttus.education.com.StringExample;

public class Main {
    public static void main(String[] args) {
        String name = "Naim Sulejmani"; // literl string
        //name eshte objekt i klases String

        System.out.printf("Karakteri i 3-te i tekstit  \"%s\": %s ", name, name.charAt(2));
        System.out.printf("%nTeksti %s ka gjithsej %d karaktere", name, name.length());
        String formattedString = String.format("%nTeksti %s ka gjithsej %d karaktere", name, name.length());
        System.out.println(formattedString);
        int gjatesia = name.length();
        System.out.println(String.format("%nTeksti %s ka gjithsej %d karaktere", name, name.length()));
        String variablaX = name.substring(2);
        System.out.printf("%nParaqite tekstin %s nga karakteri i 3-te deri ne fund: %s", name, name.substring(2));
        System.out.printf("%nParaqite tekstin %s nga karakteri i 3-te deri ne te 7-tin: %s", name, name.substring(2, 6));

        System.out.printf("%nTeksit aim a gjendet ne tekstin %s: %b", name, name.contains("aim"));
        System.out.printf("%nTeksit naim a gjendet ne tekstin %s: %b", name, name.contains("naim"));

        String emri = "Mirlinde";
        String mbiemri = "Xhelili";
        String emriPlote = String.join(" ose ", emri, mbiemri, name, "xyz");

        System.out.println("\nEmri plote: " + emriPlote);

        String vlera = " ";
        System.out.println("A eshte emri i zbrazet (pa space karaktere): " + vlera.isEmpty());
        System.out.println("A eshte emri i zbrazet(me space karaktere): " + vlera.isBlank());

        System.out.println("Concat: " + emri.concat(mbiemri).concat("Filan").concat("pakufi"));
        System.out.println("concat simple: " + emri + mbiemri);

        String teksti = "Neswr do tw bwhet mw mirw!";
        System.out.println("Teksti pa replace: "+teksti);
        teksti = teksti.replace('w','ë');
        System.out.println("Teksti me replace: "+teksti);
        System.out.println(teksti.replace("më mirë","më keq"));
    }
}
