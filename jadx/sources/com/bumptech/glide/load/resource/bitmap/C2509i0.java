package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C2548u;
import java.io.IOException;
import java.io.InputStream;
import p089g4.C6211d;
import p089g4.C6221i;
import p166m3.C7088h;
import p166m3.C7090j;
import p192o3.C7430c;
import p205p3.C7674b;
import p205p3.C7676d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.i0 */
public class C2509i0 implements C7090j {

    /* renamed from: a */
    private final C2548u f7949a;

    /* renamed from: b */
    private final C7674b f7950b;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.i0$a */
    static class C2510a implements C2548u.C2550b {

        /* renamed from: a */
        private final C2502f0 f7951a;

        /* renamed from: b */
        private final C6211d f7952b;

        C2510a(C2502f0 f0Var, C6211d dVar) {
            this.f7951a = f0Var;
            this.f7952b = dVar;
        }

        /* renamed from: a */
        public void mo8010a(C7676d dVar, Bitmap bitmap) {
            IOException a = this.f7952b.mo19801a();
            if (a != null) {
                if (bitmap != null) {
                    dVar.mo8047c(bitmap);
                }
                throw a;
            }
        }

        /* renamed from: b */
        public void mo8011b() {
            this.f7951a.mo7993k();
        }
    }

    public C2509i0(C2548u uVar, C7674b bVar) {
        this.f7949a = uVar;
        this.f7950b = bVar;
    }

    /* renamed from: c */
    public C7430c mo7972b(InputStream inputStream, int i, int i2, C7088h hVar) {
        C2502f0 f0Var;
        boolean z;
        if (inputStream instanceof C2502f0) {
            f0Var = (C2502f0) inputStream;
            z = false;
        } else {
            z = true;
            f0Var = new C2502f0(inputStream, this.f7950b);
        }
        C6211d c = C6211d.m24706c(f0Var);
        try {
            return this.f7949a.mo8042f(new C6221i(c), i, i2, hVar, new C2510a(f0Var, c));
        } finally {
            c.mo19804k();
            if (z) {
                f0Var.mo7996n();
            }
        }
    }

    /* renamed from: d */
    public boolean mo7971a(InputStream inputStream, C7088h hVar) {
        return this.f7949a.mo8045p(inputStream);
    }
}
