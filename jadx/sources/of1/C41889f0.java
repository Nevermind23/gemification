package of1;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.C41536l;

/* renamed from: of1.f0 */
public final class C41889f0 {

    /* renamed from: a */
    private final C41863a f98345a;

    /* renamed from: b */
    private final Proxy f98346b;

    /* renamed from: c */
    private final InetSocketAddress f98347c;

    public C41889f0(C41863a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        C41536l.m120489i(aVar, "address");
        C41536l.m120489i(proxy, "proxy");
        C41536l.m120489i(inetSocketAddress, "socketAddress");
        this.f98345a = aVar;
        this.f98346b = proxy;
        this.f98347c = inetSocketAddress;
    }

    /* renamed from: a */
    public final C41863a mo96800a() {
        return this.f98345a;
    }

    /* renamed from: b */
    public final Proxy mo96801b() {
        return this.f98346b;
    }

    /* renamed from: c */
    public final boolean mo96802c() {
        return this.f98345a.mo96667k() != null && this.f98346b.type() == Proxy.Type.HTTP;
    }

    /* renamed from: d */
    public final InetSocketAddress mo96803d() {
        return this.f98347c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C41889f0) {
            C41889f0 f0Var = (C41889f0) obj;
            if (!C41536l.m120484d(f0Var.f98345a, this.f98345a) || !C41536l.m120484d(f0Var.f98346b, this.f98346b) || !C41536l.m120484d(f0Var.f98347c, this.f98347c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f98345a.hashCode()) * 31) + this.f98346b.hashCode()) * 31) + this.f98347c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f98347c + '}';
    }
}
