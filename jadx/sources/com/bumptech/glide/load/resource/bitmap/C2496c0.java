package com.bumptech.glide.load.resource.bitmap;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import p089g4.C6206a;
import p166m3.C7088h;
import p166m3.C7090j;
import p192o3.C7430c;

/* renamed from: com.bumptech.glide.load.resource.bitmap.c0 */
public final class C2496c0 implements C7090j {

    /* renamed from: a */
    private final C2501f f7931a = new C2501f();

    /* renamed from: c */
    public C7430c mo7972b(InputStream inputStream, int i, int i2, C7088h hVar) {
        return this.f7931a.mo7989c(ImageDecoder.createSource(C6206a.m24698b(inputStream)), i, i2, hVar);
    }

    /* renamed from: d */
    public boolean mo7971a(InputStream inputStream, C7088h hVar) {
        return true;
    }
}
