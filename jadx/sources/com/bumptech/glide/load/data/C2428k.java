package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.C2417e;
import com.bumptech.glide.load.resource.bitmap.C2502f0;
import java.io.InputStream;
import p205p3.C7674b;

/* renamed from: com.bumptech.glide.load.data.k */
public final class C2428k implements C2417e {

    /* renamed from: a */
    private final C2502f0 f7665a;

    /* renamed from: com.bumptech.glide.load.data.k$a */
    public static final class C2429a implements C2417e.C2418a {

        /* renamed from: a */
        private final C7674b f7666a;

        public C2429a(C7674b bVar) {
            this.f7666a = bVar;
        }

        /* renamed from: a */
        public Class mo7778a() {
            return InputStream.class;
        }

        /* renamed from: c */
        public C2417e mo7779b(InputStream inputStream) {
            return new C2428k(inputStream, this.f7666a);
        }
    }

    public C2428k(InputStream inputStream, C7674b bVar) {
        C2502f0 f0Var = new C2502f0(inputStream, bVar);
        this.f7665a = f0Var;
        f0Var.mark(5242880);
    }

    /* renamed from: b */
    public void mo7775b() {
        this.f7665a.mo7996n();
    }

    /* renamed from: c */
    public void mo7812c() {
        this.f7665a.mo7993k();
    }

    /* renamed from: d */
    public InputStream mo7774a() {
        this.f7665a.reset();
        return this.f7665a;
    }
}
