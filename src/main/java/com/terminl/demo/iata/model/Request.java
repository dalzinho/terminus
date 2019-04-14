
package com.terminl.demo.iata.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Request {

    @SerializedName("client")
    private Client mClient;
    @SerializedName("currency")
    private String mCurrency;
    @SerializedName("host")
    private String mHost;
    @SerializedName("id")
    private Long mId;
    @SerializedName("key")
    private Key mKey;
    @SerializedName("lang")
    private String mLang;
    @SerializedName("method")
    private String mMethod;
    @SerializedName("params")
    private Params mParams;
    @SerializedName("pid")
    private Long mPid;
    @SerializedName("server")
    private String mServer;
    @SerializedName("time")
    private Long mTime;
    @SerializedName("version")
    private Long mVersion;

    public Client getClient() {
        return mClient;
    }

    public void setClient(Client client) {
        mClient = client;
    }

    public String getCurrency() {
        return mCurrency;
    }

    public void setCurrency(String currency) {
        mCurrency = currency;
    }

    public String getHost() {
        return mHost;
    }

    public void setHost(String host) {
        mHost = host;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Key getKey() {
        return mKey;
    }

    public void setKey(Key key) {
        mKey = key;
    }

    public String getLang() {
        return mLang;
    }

    public void setLang(String lang) {
        mLang = lang;
    }

    public String getMethod() {
        return mMethod;
    }

    public void setMethod(String method) {
        mMethod = method;
    }

    public Params getParams() {
        return mParams;
    }

    public void setParams(Params params) {
        mParams = params;
    }

    public Long getPid() {
        return mPid;
    }

    public void setPid(Long pid) {
        mPid = pid;
    }

    public String getServer() {
        return mServer;
    }

    public void setServer(String server) {
        mServer = server;
    }

    public Long getTime() {
        return mTime;
    }

    public void setTime(Long time) {
        mTime = time;
    }

    public Long getVersion() {
        return mVersion;
    }

    public void setVersion(Long version) {
        mVersion = version;
    }

}
