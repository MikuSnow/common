package com.mengcraft.util.http;

/**
 * Created on 16-12-5.
 */
public interface HTTPCallback {

    void done(Exception e, HTTPResponse response);

}
