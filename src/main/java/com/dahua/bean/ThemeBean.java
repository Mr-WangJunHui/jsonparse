package com.dahua.bean;

public class ThemeBean {
    /**
     * 主键
     */
    private String Key;
    /**
     * 数值
     */
    private String Value;
    /**
     * poiId
     */
    private String PoiId;
    /**
     * 是否跳起
     */
    private Boolean IsJump;

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    public String getPoiId() {
        return PoiId;
    }

    public void setPoiId(String poiId) {
        PoiId = poiId;
    }

    public Boolean getJump() {
        return IsJump;
    }

    public void setJump(Boolean jump) {
        IsJump = jump;
    }
}
