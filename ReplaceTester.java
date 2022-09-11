public class ReplaceTester {
    //برنامج رقم 3
    public static void main(String[] args) {
        String asmaa="Mississippi";
        asmaa=asmaa.replace("i","!");
        asmaa=asmaa.replace("s","$");
        System.out.println("expected result: M!$$!$$!pp! ");
        System.out.println("actual result: "+asmaa);

    }
}
