public class Concatenate {
    String s1;
    String s2;

    public static void main(String[] args) {
        Concatenate c = new Concatenate();
        c.s1 = "hi";
        c.s2 = "hello";
//        String ans = c.s1+ " "+ c.s2;
//        System.out.printf("%S", ans);
        String ans= c.s1.concat(" ").concat(c.s2);
        //System.out.printf("%S", ans);
        System.out.println(ans.toUpperCase());
    }
}
