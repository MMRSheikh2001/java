package feb9class;

import feb9class.mobile.FeaturePhone;
import feb9class.mobile.Mobile;

/**
 *
 * @author Admin
 */
public class Feb9Class {

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.setCall("This is call");
        m.setCamera("This is camera");
        m.setGallery("this is Gallery");
        m.setGames("Diamond Rush");
        m.setMessage("This is message");
        System.out.println("This is mobile output \n"+ m.toString());
        
        FeaturePhone fp= new FeaturePhone();
        fp.setButton("this button was clicked");
        fp.setRadio("This is radio Bangla");
        fp.setSnakeGame("This is Snake xianxia 3");
        
        System.out.println("This is FP output "+ fp.toString());
    }

}
