package com.facebook;

import com.facebook.C2640g;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Map;

/* renamed from: com.facebook.o */
class C2683o extends FilterOutputStream implements C2684p {

    /* renamed from: d */
    private final Map f8408d;

    /* renamed from: e */
    private final C2640g f8409e;

    /* renamed from: f */
    private final long f8410f = C2626d.m10148s();

    /* renamed from: g */
    private long f8411g;

    /* renamed from: h */
    private long f8412h;

    /* renamed from: i */
    private long f8413i;

    /* renamed from: j */
    private C2685q f8414j;

    C2683o(OutputStream outputStream, C2640g gVar, Map map, long j) {
        super(outputStream);
        this.f8409e = gVar;
        this.f8408d = map;
        this.f8413i = j;
    }

    /* renamed from: c */
    private void m10424c(long j) {
        C2685q qVar = this.f8414j;
        if (qVar != null) {
            qVar.mo8466a(j);
        }
        long j2 = this.f8411g + j;
        this.f8411g = j2;
        if (j2 >= this.f8412h + this.f8410f || j2 >= this.f8413i) {
            m10425k();
        }
    }

    /* renamed from: k */
    private void m10425k() {
        if (this.f8411g > this.f8412h) {
            for (C2640g.C2641a aVar : this.f8409e.mo8275v()) {
            }
            this.f8412h = this.f8411g;
        }
    }

    /* renamed from: a */
    public void mo8455a(GraphRequest graphRequest) {
        this.f8414j = graphRequest != null ? (C2685q) this.f8408d.get(graphRequest) : null;
    }

    public void close() {
        super.close();
        for (C2685q c : this.f8408d.values()) {
            c.mo8468c();
        }
        m10425k();
    }

    public void write(byte[] bArr) {
        this.out.write(bArr);
        m10424c((long) bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        m10424c((long) i2);
    }

    public void write(int i) {
        this.out.write(i);
        m10424c(1);
    }
}
