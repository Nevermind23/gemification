package com.facetec.sdk;

import com.facetec.sdk.C3260jr;
import com.facetec.sdk.C3295kc;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facetec.sdk.lj */
public final class C3351lj implements C3344lc {

    /* renamed from: a */
    final C3268ju f10993a;

    /* renamed from: b */
    final C3432mn f10994b;

    /* renamed from: c */
    final C3434mp f10995c;

    /* renamed from: d */
    final C3325kw f10996d;

    /* renamed from: e */
    int f10997e = 0;

    /* renamed from: h */
    private long f10998h = 262144;

    /* renamed from: com.facetec.sdk.lj$a */
    final class C3352a implements C3461nc {

        /* renamed from: b */
        private final C3436mr f10999b = new C3436mr(C3351lj.this.f10995c.mo9707c());

        /* renamed from: c */
        private boolean f11000c;

        /* renamed from: d */
        private long f11001d;

        C3352a(long j) {
            this.f11001d = j;
        }

        /* renamed from: b */
        public final void mo9671b(C3431mm mmVar, long j) {
            if (!this.f11000c) {
                C3303ki.m13265d(mmVar.mo9835a(), j);
                if (j <= this.f11001d) {
                    C3351lj.this.f10995c.mo9671b(mmVar, j);
                    this.f11001d -= j;
                    return;
                }
                StringBuilder sb = new StringBuilder("expected ");
                sb.append(this.f11001d);
                sb.append(" bytes but received ");
                sb.append(j);
                throw new ProtocolException(sb.toString());
            }
            throw new IllegalStateException("closed");
        }

        /* renamed from: c */
        public final C3463ne mo9707c() {
            return this.f10999b;
        }

        public final void close() {
            if (!this.f11000c) {
                this.f11000c = true;
                if (this.f11001d <= 0) {
                    C3351lj.m13381d(this.f10999b);
                    C3351lj.this.f10997e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public final void flush() {
            if (!this.f11000c) {
                C3351lj.this.f10995c.flush();
            }
        }
    }

    /* renamed from: com.facetec.sdk.lj$b */
    final class C3353b implements C3461nc {

        /* renamed from: c */
        private boolean f11004c;

        /* renamed from: e */
        private final C3436mr f11005e = new C3436mr(C3351lj.this.f10995c.mo9707c());

        C3353b() {
        }

        /* renamed from: b */
        public final void mo9671b(C3431mm mmVar, long j) {
            if (this.f11004c) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                C3351lj.this.f10995c.mo9868f(j);
                C3351lj.this.f10995c.mo9860e("\r\n");
                C3351lj.this.f10995c.mo9671b(mmVar, j);
                C3351lj.this.f10995c.mo9860e("\r\n");
            }
        }

        /* renamed from: c */
        public final C3463ne mo9707c() {
            return this.f11005e;
        }

        public final synchronized void close() {
            if (!this.f11004c) {
                this.f11004c = true;
                C3351lj.this.f10995c.mo9860e("0\r\n\r\n");
                C3351lj.m13381d(this.f11005e);
                C3351lj.this.f10997e = 3;
            }
        }

        public final synchronized void flush() {
            if (!this.f11004c) {
                C3351lj.this.f10995c.flush();
            }
        }
    }

    /* renamed from: com.facetec.sdk.lj$c */
    class C3354c extends C3356e {

        /* renamed from: b */
        private boolean f11006b = true;

        /* renamed from: c */
        private long f11007c = -1;

        /* renamed from: d */
        private final C3274jx f11008d;

        C3354c(C3274jx jxVar) {
            super(C3351lj.this, (byte) 0);
            this.f11008d = jxVar;
        }

        /* renamed from: c */
        public final long mo9643c(C3431mm mmVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            } else if (this.f11012a) {
                throw new IllegalStateException("closed");
            } else if (!this.f11006b) {
                return -1;
            } else {
                long j2 = this.f11007c;
                if (j2 == 0 || j2 == -1) {
                    if (j2 != -1) {
                        C3351lj.this.f10994b.mo9883m();
                    }
                    try {
                        this.f11007c = C3351lj.this.f10994b.mo9882l();
                        String trim = C3351lj.this.f10994b.mo9883m().trim();
                        if (this.f11007c < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                            StringBuilder sb = new StringBuilder("expected chunk size and optional extensions but was \"");
                            sb.append(this.f11007c);
                            sb.append(trim);
                            sb.append("\"");
                            throw new ProtocolException(sb.toString());
                        }
                        if (this.f11007c == 0) {
                            this.f11006b = false;
                            C3328ky.m13338e(C3351lj.this.f10993a.mo9506a(), this.f11008d, C3351lj.this.mo9704c());
                            mo9710d(true, (IOException) null);
                        }
                        if (!this.f11006b) {
                            return -1;
                        }
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long c = super.mo9643c(mmVar, Math.min(j, this.f11007c));
                if (c != -1) {
                    this.f11007c -= c;
                    return c;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo9710d(false, protocolException);
                throw protocolException;
            }
        }

        public final void close() {
            if (!this.f11012a) {
                if (this.f11006b && !C3303ki.m13244a(this, TimeUnit.MILLISECONDS)) {
                    mo9710d(false, (IOException) null);
                }
                this.f11012a = true;
            }
        }
    }

    /* renamed from: com.facetec.sdk.lj$d */
    class C3355d extends C3356e {

        /* renamed from: d */
        private long f11010d;

        C3355d(long j) {
            super(C3351lj.this, (byte) 0);
            this.f11010d = j;
            if (j == 0) {
                mo9710d(true, (IOException) null);
            }
        }

        /* renamed from: c */
        public final long mo9643c(C3431mm mmVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            } else if (!this.f11012a) {
                long j2 = this.f11010d;
                if (j2 == 0) {
                    return -1;
                }
                long c = super.mo9643c(mmVar, Math.min(j2, j));
                if (c != -1) {
                    long j3 = this.f11010d - c;
                    this.f11010d = j3;
                    if (j3 == 0) {
                        mo9710d(true, (IOException) null);
                    }
                    return c;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo9710d(false, protocolException);
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public final void close() {
            if (!this.f11012a) {
                if (this.f11010d != 0 && !C3303ki.m13244a(this, TimeUnit.MILLISECONDS)) {
                    mo9710d(false, (IOException) null);
                }
                this.f11012a = true;
            }
        }
    }

    /* renamed from: com.facetec.sdk.lj$e */
    abstract class C3356e implements C3465nf {

        /* renamed from: a */
        protected boolean f11012a;

        /* renamed from: c */
        private C3436mr f11014c;

        /* renamed from: e */
        private long f11015e;

        private C3356e() {
            this.f11014c = new C3436mr(C3351lj.this.f10994b.mo9644c());
            this.f11015e = 0;
        }

        /* renamed from: c */
        public final C3463ne mo9644c() {
            return this.f11014c;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public final void mo9710d(boolean z, IOException iOException) {
            int i = C3351lj.this.f10997e;
            if (i != 6) {
                if (i == 5) {
                    C3351lj.m13381d(this.f11014c);
                    C3351lj ljVar = C3351lj.this;
                    ljVar.f10997e = 6;
                    C3325kw kwVar = ljVar.f10996d;
                    if (kwVar != null) {
                        kwVar.mo9675c(!z, (C3344lc) ljVar, iOException);
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder("state: ");
                sb.append(C3351lj.this.f10997e);
                throw new IllegalStateException(sb.toString());
            }
        }

        /* renamed from: c */
        public long mo9643c(C3431mm mmVar, long j) {
            try {
                long c = C3351lj.this.f10994b.mo9643c(mmVar, j);
                if (c > 0) {
                    this.f11015e += c;
                }
                return c;
            } catch (IOException e) {
                mo9710d(false, e);
                throw e;
            }
        }

        /* synthetic */ C3356e(C3351lj ljVar, byte b) {
            this();
        }
    }

    /* renamed from: com.facetec.sdk.lj$h */
    class C3357h extends C3356e {

        /* renamed from: b */
        private boolean f11016b;

        C3357h() {
            super(C3351lj.this, (byte) 0);
        }

        /* renamed from: c */
        public final long mo9643c(C3431mm mmVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            } else if (this.f11012a) {
                throw new IllegalStateException("closed");
            } else if (this.f11016b) {
                return -1;
            } else {
                long c = super.mo9643c(mmVar, j);
                if (c != -1) {
                    return c;
                }
                this.f11016b = true;
                mo9710d(true, (IOException) null);
                return -1;
            }
        }

        public final void close() {
            if (!this.f11012a) {
                if (!this.f11016b) {
                    mo9710d(false, (IOException) null);
                }
                this.f11012a = true;
            }
        }
    }

    public C3351lj(C3268ju juVar, C3325kw kwVar, C3432mn mnVar, C3434mp mpVar) {
        this.f10993a = juVar;
        this.f10996d = kwVar;
        this.f10994b = mnVar;
        this.f10995c = mpVar;
    }

    /* renamed from: a */
    public final void mo9695a() {
        this.f10995c.flush();
    }

    /* renamed from: b */
    public final C3461nc mo9697b(C3293kb kbVar, long j) {
        if ("chunked".equalsIgnoreCase(kbVar.mo9591c("Transfer-Encoding"))) {
            if (this.f10997e == 1) {
                this.f10997e = 2;
                return new C3353b();
            }
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.f10997e);
            throw new IllegalStateException(sb.toString());
        } else if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.f10997e == 1) {
            this.f10997e = 2;
            return new C3352a(j);
        } else {
            StringBuilder sb2 = new StringBuilder("state: ");
            sb2.append(this.f10997e);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: c */
    public final C3260jr mo9704c() {
        C3260jr.C3261d dVar = new C3260jr.C3261d();
        while (true) {
            String d = m13380d();
            if (d.length() == 0) {
                return dVar.mo9498c();
            }
            C3300kf.f10832d.mo9532e(dVar, d);
        }
    }

    /* renamed from: d */
    public final C3291ka mo9699d(C3295kc kcVar) {
        C3325kw kwVar = this.f10996d;
        C3264jt jtVar = kwVar.f10934a;
        C3247ji jiVar = kwVar.f10937d;
        String e = kcVar.mo9611e("Content-Type");
        if (!C3328ky.m13339e(kcVar)) {
            return new C3345ld(e, 0, C3442mx.m13804a(mo9706e(0)));
        }
        if ("chunked".equalsIgnoreCase(kcVar.mo9611e("Transfer-Encoding"))) {
            C3274jx a = kcVar.mo9609d().mo9588a();
            if (this.f10997e == 4) {
                this.f10997e = 5;
                return new C3345ld(e, -1, C3442mx.m13804a((C3465nf) new C3354c(a)));
            }
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.f10997e);
            throw new IllegalStateException(sb.toString());
        }
        long c = C3328ky.m13335c(kcVar);
        if (c != -1) {
            return new C3345ld(e, c, C3442mx.m13804a(mo9706e(c)));
        }
        if (this.f10997e == 4) {
            C3325kw kwVar2 = this.f10996d;
            if (kwVar2 != null) {
                this.f10997e = 5;
                kwVar2.mo9679e();
                return new C3345ld(e, -1, C3442mx.m13804a((C3465nf) new C3357h()));
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        StringBuilder sb2 = new StringBuilder("state: ");
        sb2.append(this.f10997e);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: e */
    public final void mo9701e(C3293kb kbVar) {
        Proxy.Type type = this.f10996d.mo9677d().mo9663e().mo9634d().type();
        StringBuilder sb = new StringBuilder();
        sb.append(kbVar.mo9589b());
        sb.append(' ');
        if (C3347lf.m13372d(kbVar, type)) {
            sb.append(kbVar.mo9588a());
        } else {
            sb.append(C3347lf.m13371b(kbVar.mo9588a()));
        }
        sb.append(" HTTP/1.1");
        mo9705d(kbVar.mo9590c(), sb.toString());
    }

    /* renamed from: b */
    public final void mo9698b() {
        C3319ks d = this.f10996d.mo9677d();
        if (d != null) {
            d.mo9657b();
        }
    }

    /* renamed from: e */
    public final void mo9700e() {
        this.f10995c.flush();
    }

    /* renamed from: b */
    public final C3295kc.C3296d mo9696b(boolean z) {
        int i = this.f10997e;
        if (i == 1 || i == 3) {
            try {
                C3346le e = C3346le.m13370e(m13380d());
                C3295kc.C3296d b = new C3295kc.C3296d().mo9624d(e.f10985a).mo9627e(e.f10986c).mo9630e(e.f10987e).mo9622b(mo9704c());
                if (z && e.f10986c == 100) {
                    return null;
                }
                if (e.f10986c == 100) {
                    this.f10997e = 3;
                    return b;
                }
                this.f10997e = 4;
                return b;
            } catch (EOFException e2) {
                StringBuilder sb = new StringBuilder("unexpected end of stream on ");
                sb.append(this.f10996d);
                IOException iOException = new IOException(sb.toString());
                iOException.initCause(e2);
                throw iOException;
            }
        } else {
            StringBuilder sb2 = new StringBuilder("state: ");
            sb2.append(this.f10997e);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: e */
    public final C3465nf mo9706e(long j) {
        if (this.f10997e == 4) {
            this.f10997e = 5;
            return new C3355d(j);
        }
        StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.f10997e);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: d */
    public final void mo9705d(C3260jr jrVar, String str) {
        if (this.f10997e == 0) {
            this.f10995c.mo9860e(str).mo9860e("\r\n");
            int a = jrVar.mo9487a();
            for (int i = 0; i < a; i++) {
                this.f10995c.mo9860e(jrVar.mo9489b(i)).mo9860e(": ").mo9860e(jrVar.mo9490c(i)).mo9860e("\r\n");
            }
            this.f10995c.mo9860e("\r\n");
            this.f10997e = 1;
            return;
        }
        StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.f10997e);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: d */
    private String m13380d() {
        String b = this.f10994b.mo9841b(this.f10998h);
        this.f10998h -= (long) b.length();
        return b;
    }

    /* renamed from: d */
    static void m13381d(C3436mr mrVar) {
        C3463ne neVar = mrVar.f11268a;
        C3463ne neVar2 = C3463ne.f11315b;
        if (neVar2 != null) {
            mrVar.f11268a = neVar2;
            neVar.mo9916d_();
            neVar.mo9915c_();
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}
