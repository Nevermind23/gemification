package com.facetec.sdk;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: com.facetec.sdk.kh */
public final class C3302kh {

    /* renamed from: b */
    private C3237jd f10836b;

    /* renamed from: c */
    private InetSocketAddress f10837c;

    /* renamed from: d */
    private Proxy f10838d;

    public C3302kh(C3237jd jdVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (jdVar == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.f10836b = jdVar;
            this.f10838d = proxy;
            this.f10837c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    /* renamed from: a */
    public final C3237jd mo9632a() {
        return this.f10836b;
    }

    /* renamed from: c */
    public final boolean mo9633c() {
        return this.f10836b.f10548e != null && this.f10838d.type() == Proxy.Type.HTTP;
    }

    /* renamed from: d */
    public final Proxy mo9634d() {
        return this.f10838d;
    }

    /* renamed from: e */
    public final InetSocketAddress mo9635e() {
        return this.f10837c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3302kh)) {
            return false;
        }
        C3302kh khVar = (C3302kh) obj;
        if (!khVar.f10836b.equals(this.f10836b) || !khVar.f10838d.equals(this.f10838d) || !khVar.f10837c.equals(this.f10837c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f10836b.hashCode() + 527) * 31) + this.f10838d.hashCode()) * 31) + this.f10837c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Route{");
        sb.append(this.f10837c);
        sb.append("}");
        return sb.toString();
    }
}
