package cn.liyakai.coolweather;

/**
 * Created by Windows User on 2016/1/14.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
