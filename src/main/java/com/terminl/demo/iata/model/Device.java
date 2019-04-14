
package com.terminl.demo.iata.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Device {

    @SerializedName("type")
    private String mType;

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

}
