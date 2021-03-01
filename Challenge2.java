public class Challenge2 {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        int x = o.nextInt();
        int y = o.nextInt();
        while(y != 0){
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        System.out.println(x);
        o.close();
    }
}
