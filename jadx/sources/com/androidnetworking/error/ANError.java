package com.androidnetworking.error;

import of1.C41880d0;

public class ANError extends Exception {

    /* renamed from: d */
    private String f7505d;

    /* renamed from: e */
    private int f7506e = 0;

    /* renamed from: f */
    private String f7507f;

    /* renamed from: g */
    private C41880d0 f7508g;

    public ANError() {
    }

    /* renamed from: a */
    public String mo7641a() {
        return this.f7507f;
    }

    /* renamed from: b */
    public C41880d0 mo7642b() {
        return this.f7508g;
    }

    /* renamed from: c */
    public void mo7643c() {
        this.f7507f = "requestCancelledError";
    }

    /* renamed from: d */
    public void mo7644d(String str) {
        this.f7505d = str;
    }

    /* renamed from: e */
    public void mo7645e(int i) {
        this.f7506e = i;
    }

    /* renamed from: f */
    public void mo7646f(String str) {
        this.f7507f = str;
    }

    public ANError(C41880d0 d0Var) {
        this.f7508g = d0Var;
    }

    public ANError(Throwable th) {
        super(th);
    }
}
