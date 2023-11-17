package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p089g4.C6223k;
import p089g4.C6224l;
import p166m3.C7083e;
import p205p3.C7676d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.h0 */
public final class C2507h0 extends C2506h {

    /* renamed from: c */
    private static final byte[] f7946c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(C7083e.f21042a);

    /* renamed from: b */
    private final int f7947b;

    public C2507h0(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C6223k.m24727a(z, "roundingRadius must be greater than 0.");
        this.f7947b = i;
    }

    /* renamed from: b */
    public void mo7845b(MessageDigest messageDigest) {
        messageDigest.update(f7946c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f7947b).array());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Bitmap mo8005c(C7676d dVar, Bitmap bitmap, int i, int i2) {
        return C2512j0.m9728p(dVar, bitmap, this.f7947b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2507h0) || this.f7947b != ((C2507h0) obj).f7947b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C6224l.m24746o(-569625254, C6224l.m24745n(this.f7947b));
    }
}
