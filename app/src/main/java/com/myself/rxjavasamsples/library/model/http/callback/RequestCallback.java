package com.myself.rxjavasamsples.library.model.http.callback;

import java.io.IOException;

import okhttp3.Callback;
import okhttp3.Response;

/**
 * 请求回调
 * Created by guchenkai on 2016/1/25.
 */
public abstract class RequestCallback implements Callback {

    /**
     * 开始请求
     */
    public void onStart() {

    }

    /**
     * 完成请求
     *
     * @param url       url
     * @param isSuccess 请求是否成功
     * @param msg       请求完成的消息
     */
    public void onFinish(String url, boolean isSuccess, String msg) {

    }

    public abstract void onCacheResponse(Response response) throws IOException;
}
