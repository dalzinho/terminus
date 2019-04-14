
package com.terminl.demo.iata.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Key {

    @SerializedName("api_key")
    private String mApiKey;
    @SerializedName("demo_methods")
    private List<Object> mDemoMethods;
    @SerializedName("expired")
    private Object mExpired;
    @SerializedName("id")
    private Long mId;
    @SerializedName("limits_by_hour")
    private Long mLimitsByHour;
    @SerializedName("limits_by_minute")
    private Long mLimitsByMinute;
    @SerializedName("registered")
    private String mRegistered;
    @SerializedName("trial_price")
    private Object mTrialPrice;
    @SerializedName("type")
    private String mType;
    @SerializedName("usage_by_hour")
    private Long mUsageByHour;
    @SerializedName("usage_by_minute")
    private Long mUsageByMinute;

    public String getApiKey() {
        return mApiKey;
    }

    public void setApiKey(String apiKey) {
        mApiKey = apiKey;
    }

    public List<Object> getDemoMethods() {
        return mDemoMethods;
    }

    public void setDemoMethods(List<Object> demoMethods) {
        mDemoMethods = demoMethods;
    }

    public Object getExpired() {
        return mExpired;
    }

    public void setExpired(Object expired) {
        mExpired = expired;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Long getLimitsByHour() {
        return mLimitsByHour;
    }

    public void setLimitsByHour(Long limitsByHour) {
        mLimitsByHour = limitsByHour;
    }

    public Long getLimitsByMinute() {
        return mLimitsByMinute;
    }

    public void setLimitsByMinute(Long limitsByMinute) {
        mLimitsByMinute = limitsByMinute;
    }

    public String getRegistered() {
        return mRegistered;
    }

    public void setRegistered(String registered) {
        mRegistered = registered;
    }

    public Object getTrialPrice() {
        return mTrialPrice;
    }

    public void setTrialPrice(Object trialPrice) {
        mTrialPrice = trialPrice;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public Long getUsageByHour() {
        return mUsageByHour;
    }

    public void setUsageByHour(Long usageByHour) {
        mUsageByHour = usageByHour;
    }

    public Long getUsageByMinute() {
        return mUsageByMinute;
    }

    public void setUsageByMinute(Long usageByMinute) {
        mUsageByMinute = usageByMinute;
    }

}
