public class Main {

    public static void main(String[] args) {
        Cipher cipher = new Cipher();
        String text = "Ala ma kota";

        cipher.Cipher(15243);

        String enc = cipher.encript(text);
        String dec = cipher.decript(enc);

        System.out.println(Cipher.isValid(text));
        System.out.println("Tekst jawny: " + text);
        System.out.println("Tekst zaszyfrowany: " + enc);
        System.out.println("Teskt odszyfrowany: " + dec);
    }
}
