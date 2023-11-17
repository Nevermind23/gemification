package com.bumptech.glide.load;

import java.io.IOException;

public final class HttpException extends IOException {
    private static final long serialVersionUID = 1;

    /* renamed from: d */
    private final int f7628d;

    public HttpException(int i) {
        this("Http request failed", i);
    }

    public HttpException(String str, int i) {
        this(str, i, (Throwable) null);
    }

    public HttpException(String str, int i, Throwable th) {
        super(str + ", status code: " + i, th);
        this.f7628d = i;
    }
}
