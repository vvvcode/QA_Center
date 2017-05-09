package model;

/**
 * Created by risan on 17/5/8.
 */
public class IntlAccount {
    private String uid;
    private GlobalUser globalUser;
    private int done;
    private String email;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public int getDone() {
        return done;
    }

    public void setDone(int done) {
        this.done = done;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GlobalUser getGlobalUser() {
        return globalUser;
    }

    public void setGlobalUser(GlobalUser globalUser) {
        this.globalUser = globalUser;
    }
}
