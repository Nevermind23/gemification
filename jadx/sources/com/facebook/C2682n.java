package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.n */
class C2682n extends OutputStream implements C2684p {

    /* renamed from: d */
    private final Map f8403d = new HashMap();

    /* renamed from: e */
    private final Handler f8404e;

    /* renamed from: f */
    private GraphRequest f8405f;

    /* renamed from: g */
    private C2685q f8406g;

    /* renamed from: h */
    private int f8407h;

    C2682n(Handler handler) {
        this.f8404e = handler;
    }

    /* renamed from: a */
    public void mo8455a(GraphRequest graphRequest) {
        C2685q qVar;
        this.f8405f = graphRequest;
        if (graphRequest != null) {
            qVar = (C2685q) this.f8403d.get(graphRequest);
        } else {
            qVar = null;
        }
        this.f8406g = qVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo8456c(long j) {
        if (this.f8406g == null) {
            C2685q qVar = new C2685q(this.f8404e, this.f8405f);
            this.f8406g = qVar;
            this.f8403d.put(this.f8405f, qVar);
        }
        this.f8406g.mo8467b(j);
        this.f8407h = (int) (((long) this.f8407h) + j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo8457k() {
        return this.f8407h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public Map mo8458n() {
        return this.f8403d;
    }

    public void write(byte[] bArr) {
        mo8456c((long) bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        mo8456c((long) i2);
    }

    public void write(int i) {
        mo8456c(1);
    }
}
