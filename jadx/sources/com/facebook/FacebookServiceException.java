package com.facebook;

public class FacebookServiceException extends FacebookException {
    private static final long serialVersionUID = 1;

    /* renamed from: d */
    private final FacebookRequestError f8141d;

    public FacebookServiceException(FacebookRequestError facebookRequestError, String str) {
        super(str);
        this.f8141d = facebookRequestError;
    }

    /* renamed from: a */
    public final FacebookRequestError mo8174a() {
        return this.f8141d;
    }

    public final String toString() {
        return "{FacebookServiceException: " + "httpResponseCode: " + this.f8141d.mo8165h() + ", facebookErrorCode: " + this.f8141d.mo8160d() + ", facebookErrorType: " + this.f8141d.mo8163f() + ", message: " + this.f8141d.mo8162e() + "}";
    }
}
