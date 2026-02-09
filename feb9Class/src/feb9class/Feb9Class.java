package feb9class;

import feb9class.mobile.FeaturePhone;
import feb9class.mobile.Mobile;

/**
 *
 * @author Admin
 */
public class Feb9Class {

    public static void main(String[] args) {
        //  Mobile m = new Mobile();

        // System.out.println("This is mobile output \n"+ m.toString());
        FeaturePhone fp = new FeaturePhone();
        fp.setButton("this button was clicked");
        fp.setRadio("This is radio Bangla");
        fp.setSnakeGame("This is Snake xianxia 3");
        fp.setCall("This is call");
        fp.setCamera("This is camera");
        fp.setGallery("this is Gallery");
        fp.setGames("Diamond Rush");
        fp.setMessage("This is message");
        System.out.println("This is FP output " + fp);
    }

}
