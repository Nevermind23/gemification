package com.salesforce.marketingcloud.media;

import com.salesforce.marketingcloud.util.C11811f;
import com.salesforce.marketingcloud.util.C11818g;
import com.salesforce.marketingcloud.util.C11824l;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.salesforce.marketingcloud.media.r */
public class C11586r {

    /* renamed from: d */
    private static final int f33623d = 20971520;

    /* renamed from: a */
    private final File f33624a;

    /* renamed from: b */
    private final Object f33625b = new Object();

    /* renamed from: c */
    private C11811f f33626c;

    C11586r(File file) {
        this.f33624a = file;
    }

    /* renamed from: b */
    private void m42285b() {
        synchronized (this.f33625b) {
            if (this.f33626c == null) {
                this.f33626c = C11811f.m43216a(this.f33624a, 0, 1, 20971520);
                this.f33625b.notifyAll();
            }
        }
    }

    /* renamed from: c */
    private static String m42286c(String str) {
        return C11824l.m43298e(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public InputStream mo30241a(String str) {
        InputStream a;
        m42285b();
        String c = m42286c(str);
        synchronized (this.f33625b) {
            C11811f.C11817e b = this.f33626c.mo31650b(c);
            a = b != null ? b.mo31681a(0) : null;
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30242a() {
        m42285b();
        this.f33626c.mo31652c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo30244b(String str) {
        m42285b();
        this.f33626c.mo31655d(m42286c(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30243a(String str, InputStream inputStream) {
        m42285b();
        String c = m42286c(str);
        synchronized (this.f33625b) {
            C11811f.C11814c a = this.f33626c.mo31646a(c);
            try {
                C11818g.m43262a(inputStream, a.mo31670c(0));
                a.mo31671c();
            } finally {
                C11818g.m43258a((Closeable) inputStream);
            }
        }
    }
}
