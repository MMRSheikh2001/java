package feb9class.mobile;

/**
 *
 * @author Admin
 */
public class Android extends Mobile {

    private String os, brouser, playstore, google;

    public Android() {
    }

    public Android(String call, String message, String games, String camera, String gallery) {
        super(call, message, games, camera, gallery);
    }

    public Android(String os, String brouser, String playstore, String google) {
        this.os = os;
        this.brouser = brouser;
        this.playstore = playstore;
        this.google = google;
    }

    public Android(String os, String brouser, String playstore, String google, String call, String message, String games, String camera, String gallery) {
        super(call, message, games, camera, gallery);
        this.os = os;
        this.brouser = brouser;
        this.playstore = playstore;
        this.google = google;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBrouser() {
        return brouser;
    }

    public void setBrouser(String brouser) {
        this.brouser = brouser;
    }

    public String getPlaystore() {
        return playstore;
    }

    public void setPlaystore(String playstore) {
        this.playstore = playstore;
    }

    public String getGoogle() {
        return google;
    }

    public void setGoogle(String google) {
        this.google = google;
    }

    @Override
    public String toString() {
        return "Android{" + "os=" + os + ", brouser=" + brouser + ", playstore=" + playstore + ", google=" + google + '}';
    }
    
    
}
