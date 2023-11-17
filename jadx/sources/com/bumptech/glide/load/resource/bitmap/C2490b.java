package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import p166m3.C7081c;
import p166m3.C7088h;
import p166m3.C7091k;
import p192o3.C7430c;
import p205p3.C7676d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b */
public class C2490b implements C7091k {

    /* renamed from: a */
    private final C7676d f7917a;

    /* renamed from: b */
    private final C7091k f7918b;

    public C2490b(C7676d dVar, C7091k kVar) {
        this.f7917a = dVar;
        this.f7918b = kVar;
    }

    /* renamed from: b */
    public C7081c mo7976b(C7088h hVar) {
        return this.f7918b.mo7976b(hVar);
    }

    /* renamed from: c */
    public boolean mo7975a(C7430c cVar, File file, C7088h hVar) {
        return this.f7918b.mo7975a(new C2504g(((BitmapDrawable) cVar.get()).getBitmap(), this.f7917a), file, hVar);
    }
}
