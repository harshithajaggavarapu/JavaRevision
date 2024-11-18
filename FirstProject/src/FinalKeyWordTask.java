public class FinalKeyWordTask {
    final int num;
    final String name;

    public FinalKeyWordTask(int num, String name){
        this.num = num;
        this.name = name;
    }

    public static void main(String[] args) {
        FinalKeyWordTask f = new FinalKeyWordTask(4,"hello");
//        System.out.println(f.toString());
    }
}
