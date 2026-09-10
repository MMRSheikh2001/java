public class GuessNumber374 {
    public static void main(String[] args) {

    }
}

/**
 * Forward declaration of guess API.
 * 
 * @param num your guess
 * @return -1 if num is higher than the picked number
 *         1 if num is lower than the picked number
 *         otherwise return 0
 *         int guess(int num);
 */

class Solution extends GuessGame {
    public int guessNumber(int n) {
        int begin = 1;
        int guessNum = (int)(begin + n) / 2;
         int result = guess(guessNum);
       

        while (result !=0) {
           if(result ==-1){
            begin=guessNum+1;
           }else if(result ==-1){
            n=guessNum-1;
           }

           guessNum = (int)(begin + n) / 2;
           result = guess(guessNum);

        }

        return guessNum;
    }
}