package com.facetec.sdk;

import com.facetec.sdk.C3364ln;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: com.facetec.sdk.ks */
public final class C3319ks extends C3364ln.C3371b {

    /* renamed from: a */
    Socket f10905a;

    /* renamed from: b */
    final C3302kh f10906b;

    /* renamed from: c */
    C3259jq f10907c;

    /* renamed from: d */
    final C3249jk f10908d;

    /* renamed from: e */
    Socket f10909e;

    /* renamed from: f */
    C3271jv f10910f;

    /* renamed from: g */
    C3434mp f10911g;

    /* renamed from: h */
    C3432mn f10912h;

    /* renamed from: i */
    C3364ln f10913i;

    /* renamed from: j */
    public boolean f10914j;

    /* renamed from: k */
    public long f10915k = Long.MAX_VALUE;

    /* renamed from: m */
    public int f10916m = 1;

    /* renamed from: n */
    public int f10917n;

    /* renamed from: o */
    public final List<Reference<C3325kw>> f10918o = new ArrayList();

    public C3319ks(C3249jk jkVar, C3302kh khVar) {
        this.f10908d = jkVar;
        this.f10906b = khVar;
    }

    /* renamed from: a */
    public final Socket mo9655a() {
        return this.f10905a;
    }

    /* renamed from: b */
    public final void mo9657b() {
        C3303ki.m13267d(this.f10909e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo9659c(int i, int i2) {
        Socket socket;
        Proxy d = this.f10906b.mo9634d();
        C3237jd a = this.f10906b.mo9632a();
        if (d.type() == Proxy.Type.DIRECT || d.type() == Proxy.Type.HTTP) {
            socket = a.f10546c.createSocket();
        } else {
            socket = new Socket(d);
        }
        this.f10909e = socket;
        this.f10906b.mo9635e();
        this.f10909e.setSoTimeout(i2);
        try {
            C3422mg.m13612c().mo9801a(this.f10909e, this.f10906b.mo9635e(), i);
            try {
                this.f10912h = C3442mx.m13804a(C3442mx.m13810d(this.f10909e));
                this.f10911g = C3442mx.m13809d(C3442mx.m13806b(this.f10909e));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            StringBuilder sb = new StringBuilder("Failed to connect to ");
            sb.append(this.f10906b.mo9635e());
            ConnectException connectException = new ConnectException(sb.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* renamed from: d */
    public final boolean mo9662d() {
        return this.f10913i != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo9664e(int i) {
        this.f10905a.setSoTimeout(0);
        C3364ln.C3377d dVar = new C3364ln.C3377d();
        Socket socket = this.f10905a;
        String h = this.f10906b.mo9632a().mo9431d().mo9551h();
        C3432mn mnVar = this.f10912h;
        C3434mp mpVar = this.f10911g;
        dVar.f11114b = socket;
        dVar.f11116d = h;
        dVar.f11115c = mnVar;
        dVar.f11117e = mpVar;
        dVar.f11113a = this;
        dVar.f11120j = i;
        C3364ln lnVar = new C3364ln(dVar);
        this.f10913i = lnVar;
        lnVar.f11075l.mo9767a();
        lnVar.f11075l.mo9769a(lnVar.f11076m);
        int b = lnVar.f11076m.mo9762b();
        if (b != 65535) {
            lnVar.f11075l.mo9768a(0, (long) (b - 65535));
        }
        new Thread(lnVar.f11078o).start();
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.f10906b.mo9632a().mo9431d().mo9551h());
        sb.append(":");
        sb.append(this.f10906b.mo9632a().mo9431d().mo9550g());
        sb.append(", proxy=");
        sb.append(this.f10906b.mo9634d());
        sb.append(" hostAddress=");
        sb.append(this.f10906b.mo9635e());
        sb.append(" cipherSuite=");
        C3259jq jqVar = this.f10907c;
        if (jqVar != null) {
            obj = jqVar.f10652d;
        } else {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f10910f);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo9656a(C3384lq lqVar) {
        lqVar.mo9746a(C3361ll.REFUSED_STREAM);
    }

    /* renamed from: e */
    public final boolean mo9665e(C3237jd jdVar, C3302kh khVar) {
        if (this.f10918o.size() >= this.f10916m || this.f10914j || !C3300kf.f10832d.mo9529d(this.f10906b.mo9632a(), jdVar)) {
            return false;
        }
        if (jdVar.mo9431d().mo9551h().equals(mo9663e().mo9632a().mo9431d().mo9551h())) {
            return true;
        }
        if (this.f10913i == null || khVar == null || khVar.mo9634d().type() != Proxy.Type.DIRECT || this.f10906b.mo9634d().type() != Proxy.Type.DIRECT || !this.f10906b.mo9635e().equals(khVar.mo9635e()) || khVar.mo9632a().mo9434f() != C3425mj.f11248e || !mo9666e(jdVar.mo9431d())) {
            return false;
        }
        try {
            jdVar.mo9435g().mo9453c(jdVar.mo9431d().mo9551h(), mo9658c().mo9484d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo9661c(boolean z) {
        int soTimeout;
        if (this.f10905a.isClosed() || this.f10905a.isInputShutdown() || this.f10905a.isOutputShutdown()) {
            return false;
        }
        C3364ln lnVar = this.f10913i;
        if (lnVar == null) {
            if (z) {
                try {
                    soTimeout = this.f10905a.getSoTimeout();
                    this.f10905a.setSoTimeout(1);
                    if (this.f10912h.mo9864e()) {
                        this.f10905a.setSoTimeout(soTimeout);
                        return false;
                    }
                    this.f10905a.setSoTimeout(soTimeout);
                    return true;
                } catch (SocketTimeoutException unused) {
                } catch (IOException unused2) {
                    return false;
                } catch (Throwable th) {
                    this.f10905a.setSoTimeout(soTimeout);
                    throw th;
                }
            }
            return true;
        } else if (!lnVar.mo9735e()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public final void mo9660c(C3364ln lnVar) {
        synchronized (this.f10908d) {
            this.f10916m = lnVar.mo9724b();
        }
    }

    /* renamed from: e */
    public final boolean mo9666e(C3274jx jxVar) {
        if (jxVar.mo9550g() != this.f10906b.mo9632a().mo9431d().mo9550g()) {
            return false;
        }
        if (jxVar.mo9551h().equals(this.f10906b.mo9632a().mo9431d().mo9551h())) {
            return true;
        }
        if (this.f10907c != null) {
            C3425mj mjVar = C3425mj.f11248e;
            if (C3425mj.m13632b(jxVar.mo9551h(), (X509Certificate) this.f10907c.mo9484d().get(0))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final C3259jq mo9658c() {
        return this.f10907c;
    }

    /* renamed from: e */
    public final C3302kh mo9663e() {
        return this.f10906b;
    }
}
