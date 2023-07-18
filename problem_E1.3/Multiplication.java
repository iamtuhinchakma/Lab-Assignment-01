public class Multiplication {
    private int result;
    public Multiplication(){
        result = 1;
    }
    public long multiPlication(){
        for( long loopcount = 1; loopcount < 10; loopcount++ ){
            result *= loopcount;
        }
        return result;
    }
}
