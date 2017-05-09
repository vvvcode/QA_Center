package model;

/**
 * Created by risan on 17/5/8.
 */
public class GlobalUser {
    private String uid;
    private String mobilePrefix;
    private String accountType;
    private String sourceMarketing;
    private String createdAt;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getMobilePrefix() {
        return mobilePrefix;
    }

    public void setMobilePrefix(String mobilePrefix) {
        this.mobilePrefix = mobilePrefix;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getSourceMarketing() {
        return sourceMarketing;
    }

    public void setSourceMarketing(String sourceMarketing) {
        this.sourceMarketing = sourceMarketing;
    }
}
