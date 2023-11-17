package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p166m3.C7083e;
import p205p3.C7676d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.n */
public class C2524n extends C2506h {

    /* renamed from: b */
    private static final byte[] f7967b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(C7083e.f21042a);

    /* renamed from: b */
    public void mo7845b(MessageDigest messageDigest) {
        messageDigest.update(f7967b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Bitmap mo8005c(C7676d dVar, Bitmap bitmap, int i, int i2) {
        return C2512j0.m9716d(dVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C2524n;
    }

    public int hashCode() {
        return 1101716364;
    }
}
