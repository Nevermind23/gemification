package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import p089g4.C6223k;
import p166m3.C7088h;
import p166m3.C7090j;
import p192o3.C7430c;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a */
public class C2488a implements C7090j {

    /* renamed from: a */
    private final C7090j f7904a;

    /* renamed from: b */
    private final Resources f7905b;

    public C2488a(Resources resources, C7090j jVar) {
        this.f7905b = (Resources) C6223k.m24730d(resources);
        this.f7904a = (C7090j) C6223k.m24730d(jVar);
    }

    /* renamed from: a */
    public boolean mo7971a(Object obj, C7088h hVar) {
        return this.f7904a.mo7971a(obj, hVar);
    }

    /* renamed from: b */
    public C7430c mo7972b(Object obj, int i, int i2, C7088h hVar) {
        return C2498d0.m9670e(this.f7905b, this.f7904a.mo7972b(obj, i, i2, hVar));
    }
}
