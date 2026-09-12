import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {

    }

    public static int findBooked(Map<Character, Integer> roomTypeCapabilities, String[] reservationsList) {
        int totalRoomsBooked = 0;
        int maxS = roomTypeCapabilities.get('S');
        int maxD = roomTypeCapabilities.get('D');
        int maxP = roomTypeCapabilities.get('P');

        int s = 0;
        int p = 0;
        int d = 0;

        Set<String> reservations = new HashSet<>();

        for (String item : reservationsList) {

            if (item.charAt(0) == '-') {
                if (item.charAt(3) == 'S' && totalRoomsBooked > 0 && s > 0
                        && reservations.contains(item.substring(1))) {
                    totalRoomsBooked--;
                    s--;
                    reservations.remove(item.substring(1));
                } else if (item.charAt(3) == 'D' && totalRoomsBooked > 0 && d > 0
                        && reservations.contains(item.substring(1))) {
                    totalRoomsBooked--;
                    d--;
                    reservations.remove(item.substring(1));
                } else if (item.charAt(3) == 'P' && totalRoomsBooked > 0 && p > 0
                        && reservations.contains(item.substring(1))) {
                    totalRoomsBooked--;
                    p--;
                    reservations.remove(item.substring(1));
                }
            }

            else if (item.charAt(0) == '+') {

                if (item.charAt(3) == 'S' && maxS > 0 && s < maxS && !reservations.contains(item.substring(1))) {
                    totalRoomsBooked++;
                    s++;
                    reservations.add(item.substring(1));
                } else if (item.charAt(3) == 'D' && maxD > 0 && d < maxD && !reservations.contains(item.substring(1))) {
                    totalRoomsBooked++;
                    d++;
                    reservations.add(item.substring(1));
                } else if (item.charAt(3) == 'P' && maxP > 0 && p < maxP && !reservations.contains(item.substring(1))) {
                    totalRoomsBooked++;
                    p++;
                    reservations.add(item.substring(1));
                }
            }

        }

        return totalRoomsBooked;

    }

}