package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p166m3.C7083e;
import p205p3.C7676d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.l */
public class C2520l extends C2506h {

    /* renamed from: b */
    private static final byte[] f7965b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(C7083e.f21042a);

    /* renamed from: b */
    public void mo7845b(MessageDigest messageDigest) {
        messageDigest.update(f7965b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Bitmap mo8005c(C7676d dVar, Bitmap bitmap, int i, int i2) {
        return C2512j0.m9714b(dVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C2520l;
    }

    public int hashCode() {
        return -599754482;
    }
}
