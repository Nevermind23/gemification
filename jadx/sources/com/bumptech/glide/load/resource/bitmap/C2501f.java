package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import p166m3.C7088h;
import p166m3.C7090j;
import p192o3.C7430c;
import p205p3.C7676d;
import p205p3.C7677e;
import p270u3.C8563l;

/* renamed from: com.bumptech.glide.load.resource.bitmap.f */
public final class C2501f implements C7090j {

    /* renamed from: a */
    private final C7676d f7935a = new C7677e();

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo7971a(Object obj, C7088h hVar) {
        return mo7990d(C2497d.m9669a(obj), hVar);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ C7430c mo7972b(Object obj, int i, int i2, C7088h hVar) {
        return mo7989c(C2497d.m9669a(obj), i, i2, hVar);
    }

    /* renamed from: c */
    public C7430c mo7989c(ImageDecoder.Source source, int i, int i2, C7088h hVar) {
        Bitmap a = ImageDecoder.decodeBitmap(source, new C8563l(i, i2, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + a.getWidth() + "x" + a.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new C2504g(a, this.f7935a);
    }

    /* renamed from: d */
    public boolean mo7990d(ImageDecoder.Source source, C7088h hVar) {
        return true;
    }
}
