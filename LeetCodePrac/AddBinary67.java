import java.math.BigInteger;

public class AddBinary67 {

    public static void main(String[] args) {

    }
}

class Solution {
    public String addBinary(String a, String b) {
        BigInteger numa = new BigInteger(a, 2);

        BigInteger numb = new BigInteger(b, 2);

        

        return (numa.add(numb)).toString(2);

    }
}