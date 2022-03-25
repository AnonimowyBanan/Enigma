public class Cipher {
    private int key = 1;
    public void Cipher(){
    }

    public void Cipher(int key){
        this.key = key;
    }

    public String encript(String text){
        StringBuilder out = new StringBuilder();
        for(int i=0; i<text.length(); ++i){
            int c = text.charAt(i);
            c = c + key;
            out.append((char) c);
        }
        return out.toString();
    }
    public String decript(String text){
        StringBuilder out = new StringBuilder();
        for(int i=0; i<text.length(); ++i){
            int c = text.charAt(i);
            c = c - key;
            out.append((char) c);
        }
        return out.toString();
    }

    public static boolean isValid(String text){
        return (text != null) && text.matches("^[A-Z ]+$");
    }
}
