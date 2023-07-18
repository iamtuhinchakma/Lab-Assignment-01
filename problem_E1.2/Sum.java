public class Sum {
    private int sum;
    public Sum(){
        sum = 0;
    }
    public int sumOfTen(){
        for ( int loopcount = 1; loopcount < 10; loopcount++ ){
            sum += loopcount;
        }
        return sum;
    }
}
