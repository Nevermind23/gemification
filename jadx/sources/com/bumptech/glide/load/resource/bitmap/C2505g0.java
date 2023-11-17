package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import p166m3.C7088h;
import p166m3.C7090j;
import p192o3.C7430c;
import p205p3.C7676d;
import p296w3.C8763m;

/* renamed from: com.bumptech.glide.load.resource.bitmap.g0 */
public class C2505g0 implements C7090j {

    /* renamed from: a */
    private final C8763m f7944a;

    /* renamed from: b */
    private final C7676d f7945b;

    public C2505g0(C8763m mVar, C7676d dVar) {
        this.f7944a = mVar;
        this.f7945b = dVar;
    }

    /* renamed from: c */
    public C7430c mo7972b(Uri uri, int i, int i2, C7088h hVar) {
        C7430c c = this.f7944a.mo7972b(uri, i, i2, hVar);
        if (c == null) {
            return null;
        }
        return C2551v.m9835a(this.f7945b, (Drawable) c.get(), i, i2);
    }

    /* renamed from: d */
    public boolean mo7971a(Uri uri, C7088h hVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
