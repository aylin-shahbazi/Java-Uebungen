public class Fuenfd {
    public static void main(String[] args) {
        System.out.println(istVokal('q'));
        System.out.println(istVokal('e'));
        
    }
    public static boolean istVokal(char c) { 
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');

    }
}