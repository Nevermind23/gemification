package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import p089g4.C6224l;
import p166m3.C7088h;
import p166m3.C7090j;
import p192o3.C7430c;

/* renamed from: com.bumptech.glide.load.resource.bitmap.k0 */
public final class C2518k0 implements C7090j {

    /* renamed from: com.bumptech.glide.load.resource.bitmap.k0$a */
    private static final class C2519a implements C7430c {

        /* renamed from: d */
        private final Bitmap f7964d;

        C2519a(Bitmap bitmap) {
            this.f7964d = bitmap;
        }

        /* renamed from: a */
        public int mo7941a() {
            return C6224l.m24739h(this.f7964d);
        }

        /* renamed from: b */
        public Bitmap get() {
            return this.f7964d;
        }

        /* renamed from: d */
        public Class mo7944d() {
            return Bitmap.class;
        }

        public void recycle() {
        }
    }

    /* renamed from: c */
    public C7430c mo7972b(Bitmap bitmap, int i, int i2, C7088h hVar) {
        return new C2519a(bitmap);
    }

    /* renamed from: d */
    public boolean mo7971a(Bitmap bitmap, C7088h hVar) {
        return true;
    }
}
