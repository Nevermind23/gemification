package com.bumptech.glide.load.resource.bitmap;

import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;
import p166m3.C7088h;
import p166m3.C7090j;
import p192o3.C7430c;

/* renamed from: com.bumptech.glide.load.resource.bitmap.k */
public final class C2517k implements C7090j {

    /* renamed from: a */
    private final C2501f f7963a = new C2501f();

    /* renamed from: c */
    public C7430c mo7972b(ByteBuffer byteBuffer, int i, int i2, C7088h hVar) {
        return this.f7963a.mo7989c(ImageDecoder.createSource(byteBuffer), i, i2, hVar);
    }

    /* renamed from: d */
    public boolean mo7971a(ByteBuffer byteBuffer, C7088h hVar) {
        return true;
    }
}
