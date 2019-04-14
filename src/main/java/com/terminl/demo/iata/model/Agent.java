
package com.terminl.demo.iata.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Agent {

    @SerializedName("browser")
    private String mBrowser;
    @SerializedName("os")
    private String mOs;
    @SerializedName("platform")
    private String mPlatform;
    @SerializedName("version")
    private String mVersion;

    public String getBrowser() {
        return mBrowser;
    }

    public void setBrowser(String browser) {
        mBrowser = browser;
    }

    public String getOs() {
        return mOs;
    }

    public void setOs(String os) {
        mOs = os;
    }

    public String getPlatform() {
        return mPlatform;
    }

    public void setPlatform(String platform) {
        mPlatform = platform;
    }

    public String getVersion() {
        return mVersion;
    }

    public void setVersion(String version) {
        mVersion = version;
    }

}
