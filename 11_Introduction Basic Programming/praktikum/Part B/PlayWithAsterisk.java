public class PlayWithAsterisk {

    private static void playWithAsterisk(int n){
        //your code here
        for (int a = 1; a <= n; a++){
            for( int d = a; d <= n-1; d++){
                System.out.print(' ');
            }
            for (int b = a; b >= a; b--) {
                System.out.print(' ');
            }
            for (int c = 1; c <= a; c++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        playWithAsterisk(5);
    }
}
