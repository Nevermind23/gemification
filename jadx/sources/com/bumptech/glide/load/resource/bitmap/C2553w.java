package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.C2379b;
import java.security.MessageDigest;
import p166m3.C7092l;
import p192o3.C7430c;
import p205p3.C7676d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.w */
public class C2553w implements C7092l {

    /* renamed from: b */
    private final C7092l f8006b;

    /* renamed from: c */
    private final boolean f8007c;

    public C2553w(C7092l lVar, boolean z) {
        this.f8006b = lVar;
        this.f8007c = z;
    }

    /* renamed from: d */
    private C7430c m9838d(Context context, C7430c cVar) {
        return C2498d0.m9670e(context.getResources(), cVar);
    }

    /* renamed from: a */
    public C7430c mo8004a(Context context, C7430c cVar, int i, int i2) {
        C7676d f = C2379b.m9204c(context).mo7685f();
        Drawable drawable = (Drawable) cVar.get();
        C7430c a = C2551v.m9835a(f, drawable, i, i2);
        if (a != null) {
            C7430c a2 = this.f8006b.mo8004a(context, a, i, i2);
            if (!a2.equals(a)) {
                return m9838d(context, a2);
            }
            a2.recycle();
            return cVar;
        } else if (!this.f8007c) {
            return cVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    /* renamed from: b */
    public void mo7845b(MessageDigest messageDigest) {
        this.f8006b.mo7845b(messageDigest);
    }

    /* renamed from: c */
    public C7092l mo8048c() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2553w) {
            return this.f8006b.equals(((C2553w) obj).f8006b);
        }
        return false;
    }

    public int hashCode() {
        return this.f8006b.hashCode();
    }
}
