package com.facebook;

public class FacebookDialogException extends FacebookException {
    static final long serialVersionUID = 1;

    /* renamed from: d */
    private int f8115d;

    /* renamed from: e */
    private String f8116e;

    public FacebookDialogException(String str, int i, String str2) {
        super(str);
        this.f8115d = i;
        this.f8116e = str2;
    }

    /* renamed from: a */
    public int mo8156a() {
        return this.f8115d;
    }

    /* renamed from: b */
    public String mo8157b() {
        return this.f8116e;
    }

    public final String toString() {
        return "{FacebookDialogException: " + "errorCode: " + mo8156a() + ", message: " + getMessage() + ", url: " + mo8157b() + "}";
    }
}
