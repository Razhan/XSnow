package com.vise.xsnow.net.callback;

/**
 * @Description: 请求接口回调
 * @author: <a href="http://www.xiaoyaoyou1212.com">DAWI</a>
 * @date: 17/5/15 10:54.
 */
public interface ACallback<T> {
    void onSuccess(T data);
    void onFail(int errCode, String errMsg);
}