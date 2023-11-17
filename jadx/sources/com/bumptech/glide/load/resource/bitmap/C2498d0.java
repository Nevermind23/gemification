package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p089g4.C6223k;
import p192o3.C7429b;
import p192o3.C7430c;

/* renamed from: com.bumptech.glide.load.resource.bitmap.d0 */
public final class C2498d0 implements C7430c, C7429b {

    /* renamed from: d */
    private final Resources f7932d;

    /* renamed from: e */
    private final C7430c f7933e;

    private C2498d0(Resources resources, C7430c cVar) {
        this.f7932d = (Resources) C6223k.m24730d(resources);
        this.f7933e = (C7430c) C6223k.m24730d(cVar);
    }

    /* renamed from: e */
    public static C7430c m9670e(Resources resources, C7430c cVar) {
        if (cVar == null) {
            return null;
        }
        return new C2498d0(resources, cVar);
    }

    /* renamed from: a */
    public int mo7941a() {
        return this.f7933e.mo7941a();
    }

    /* renamed from: b */
    public void mo7985b() {
        C7430c cVar = this.f7933e;
        if (cVar instanceof C7429b) {
            ((C7429b) cVar).mo7985b();
        }
    }

    /* renamed from: c */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f7932d, (Bitmap) this.f7933e.get());
    }

    /* renamed from: d */
    public Class mo7944d() {
        return BitmapDrawable.class;
    }

    public void recycle() {
        this.f7933e.recycle();
    }
}
