package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p089g4.C6224l;
import p166m3.C7083e;
import p205p3.C7676d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.z */
public final class C2556z extends C2506h {

    /* renamed from: f */
    private static final byte[] f8009f = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners".getBytes(C7083e.f21042a);

    /* renamed from: b */
    private final float f8010b;

    /* renamed from: c */
    private final float f8011c;

    /* renamed from: d */
    private final float f8012d;

    /* renamed from: e */
    private final float f8013e;

    public C2556z(float f, float f2, float f3, float f4) {
        this.f8010b = f;
        this.f8011c = f2;
        this.f8012d = f3;
        this.f8013e = f4;
    }

    /* renamed from: b */
    public void mo7845b(MessageDigest messageDigest) {
        messageDigest.update(f8009f);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.f8010b).putFloat(this.f8011c).putFloat(this.f8012d).putFloat(this.f8013e).array());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Bitmap mo8005c(C7676d dVar, Bitmap bitmap, int i, int i2) {
        return C2512j0.m9727o(dVar, bitmap, this.f8010b, this.f8011c, this.f8012d, this.f8013e);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2556z)) {
            return false;
        }
        C2556z zVar = (C2556z) obj;
        if (this.f8010b == zVar.f8010b && this.f8011c == zVar.f8011c && this.f8012d == zVar.f8012d && this.f8013e == zVar.f8013e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C6224l.m24744m(this.f8013e, C6224l.m24744m(this.f8012d, C6224l.m24744m(this.f8011c, C6224l.m24746o(-2013597734, C6224l.m24743l(this.f8010b)))));
    }
}
