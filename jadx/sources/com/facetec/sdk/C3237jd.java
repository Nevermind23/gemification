package com.facetec.sdk;

import com.facetec.sdk.C3274jx;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.facetec.sdk.jd */
public final class C3237jd {

    /* renamed from: a */
    public final Proxy f10544a;

    /* renamed from: b */
    public final List<C3252jm> f10545b;

    /* renamed from: c */
    public SocketFactory f10546c;

    /* renamed from: d */
    private C3274jx f10547d;

    /* renamed from: e */
    final SSLSocketFactory f10548e;

    /* renamed from: f */
    private ProxySelector f10549f;

    /* renamed from: g */
    private List<C3271jv> f10550g;

    /* renamed from: h */
    private C3257jp f10551h;

    /* renamed from: i */
    private C3238je f10552i;

    /* renamed from: j */
    private HostnameVerifier f10553j;

    /* renamed from: k */
    private C3244jh f10554k;

    public C3237jd(String str, int i, C3257jp jpVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C3244jh jhVar, C3238je jeVar, Proxy proxy, List<C3271jv> list, List<C3252jm> list2, ProxySelector proxySelector) {
        String str2 = str;
        int i2 = i;
        C3257jp jpVar2 = jpVar;
        SocketFactory socketFactory2 = socketFactory;
        SSLSocketFactory sSLSocketFactory2 = sSLSocketFactory;
        C3238je jeVar2 = jeVar;
        ProxySelector proxySelector2 = proxySelector;
        C3274jx.C3275c cVar = new C3274jx.C3275c();
        String str3 = sSLSocketFactory2 != null ? "https" : "http";
        if (str3.equalsIgnoreCase("http")) {
            cVar.f10741b = "http";
        } else if (str3.equalsIgnoreCase("https")) {
            cVar.f10741b = "https";
        } else {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str3));
        }
        if (str2 != null) {
            String b = C3274jx.C3275c.m13134b(str, 0, str.length());
            if (b != null) {
                cVar.f10744e = b;
                if (i2 <= 0 || i2 > 65535) {
                    throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(i)));
                }
                cVar.f10740a = i2;
                this.f10547d = cVar.mo9556a();
                if (jpVar2 != null) {
                    this.f10551h = jpVar2;
                    if (socketFactory2 != null) {
                        this.f10546c = socketFactory2;
                        if (jeVar2 != null) {
                            this.f10552i = jeVar2;
                            if (list != null) {
                                this.f10550g = C3303ki.m13264d(list);
                                if (list2 != null) {
                                    this.f10545b = C3303ki.m13264d(list2);
                                    if (proxySelector2 != null) {
                                        this.f10549f = proxySelector2;
                                        this.f10544a = proxy;
                                        this.f10548e = sSLSocketFactory2;
                                        this.f10553j = hostnameVerifier;
                                        this.f10554k = jhVar;
                                        return;
                                    }
                                    throw new NullPointerException("proxySelector == null");
                                }
                                throw new NullPointerException("connectionSpecs == null");
                            }
                            throw new NullPointerException("protocols == null");
                        }
                        throw new NullPointerException("proxyAuthenticator == null");
                    }
                    throw new NullPointerException("socketFactory == null");
                }
                throw new NullPointerException("dns == null");
            }
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        throw new NullPointerException("host == null");
    }

    /* renamed from: a */
    public final C3257jp mo9427a() {
        return this.f10551h;
    }

    /* renamed from: b */
    public final List<C3271jv> mo9428b() {
        return this.f10550g;
    }

    /* renamed from: c */
    public final ProxySelector mo9430c() {
        return this.f10549f;
    }

    /* renamed from: d */
    public final C3274jx mo9431d() {
        return this.f10547d;
    }

    /* renamed from: e */
    public final C3238je mo9432e() {
        return this.f10552i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3237jd)) {
            return false;
        }
        C3237jd jdVar = (C3237jd) obj;
        if (!this.f10547d.equals(jdVar.f10547d) || !mo9429b(jdVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final HostnameVerifier mo9434f() {
        return this.f10553j;
    }

    /* renamed from: g */
    public final C3244jh mo9435g() {
        return this.f10554k;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (((((((((((this.f10547d.hashCode() + 527) * 31) + this.f10551h.hashCode()) * 31) + this.f10552i.hashCode()) * 31) + this.f10550g.hashCode()) * 31) + this.f10545b.hashCode()) * 31) + this.f10549f.hashCode()) * 31;
        Proxy proxy = this.f10544a;
        int i4 = 0;
        if (proxy != null) {
            i = proxy.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 31;
        SSLSocketFactory sSLSocketFactory = this.f10548e;
        if (sSLSocketFactory != null) {
            i2 = sSLSocketFactory.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        HostnameVerifier hostnameVerifier = this.f10553j;
        if (hostnameVerifier != null) {
            i3 = hostnameVerifier.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        C3244jh jhVar = this.f10554k;
        if (jhVar != null) {
            i4 = jhVar.hashCode();
        }
        return i7 + i4;
    }

    /* renamed from: i */
    public final SSLSocketFactory mo9437i() {
        return this.f10548e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.f10547d.mo9551h());
        sb.append(":");
        sb.append(this.f10547d.mo9550g());
        if (this.f10544a != null) {
            sb.append(", proxy=");
            sb.append(this.f10544a);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f10549f);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo9429b(C3237jd jdVar) {
        return this.f10551h.equals(jdVar.f10551h) && this.f10552i.equals(jdVar.f10552i) && this.f10550g.equals(jdVar.f10550g) && this.f10545b.equals(jdVar.f10545b) && this.f10549f.equals(jdVar.f10549f) && C3303ki.m13274e((Object) this.f10544a, (Object) jdVar.f10544a) && C3303ki.m13274e((Object) this.f10548e, (Object) jdVar.f10548e) && C3303ki.m13274e((Object) this.f10553j, (Object) jdVar.f10553j) && C3303ki.m13274e((Object) this.f10554k, (Object) jdVar.f10554k) && mo9431d().mo9550g() == jdVar.mo9431d().mo9550g();
    }
}
