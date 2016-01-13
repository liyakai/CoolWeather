package cn.liyakai.coolweather;

import android.hardware.SensorManager;

/**
 * Created by Windows User on 2016/1/12.
 */
public class Province {
    private int id;
    private String provinceName;
    private String provinceCode;

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceCode(){
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
}
