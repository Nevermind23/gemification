package com.auth0.android.jwt;

public class DecodeException extends RuntimeException {
    DecodeException(String str) {
        super(str);
    }

    DecodeException(String str, Throwable th) {
        super(str, th);
    }
}
