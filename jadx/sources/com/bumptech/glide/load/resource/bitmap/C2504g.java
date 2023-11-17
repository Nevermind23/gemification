package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import p089g4.C6223k;
import p089g4.C6224l;
import p192o3.C7429b;
import p192o3.C7430c;
import p205p3.C7676d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.g */
public class C2504g implements C7430c, C7429b {

    /* renamed from: d */
    private final Bitmap f7942d;

    /* renamed from: e */
    private final C7676d f7943e;

    public C2504g(Bitmap bitmap, C7676d dVar) {
        this.f7942d = (Bitmap) C6223k.m24731e(bitmap, "Bitmap must not be null");
        this.f7943e = (C7676d) C6223k.m24731e(dVar, "BitmapPool must not be null");
    }

    /* renamed from: e */
    public static C2504g m9689e(Bitmap bitmap, C7676d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new C2504g(bitmap, dVar);
    }

    /* renamed from: a */
    public int mo7941a() {
        return C6224l.m24739h(this.f7942d);
    }

    /* renamed from: b */
    public void mo7985b() {
        this.f7942d.prepareToDraw();
    }

    /* renamed from: c */
    public Bitmap get() {
        return this.f7942d;
    }

    /* renamed from: d */
    public Class mo7944d() {
        return Bitmap.class;
    }

    public void recycle() {
        this.f7943e.mo8047c(this.f7942d);
    }
}
