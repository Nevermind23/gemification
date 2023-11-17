package zf1;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* renamed from: zf1.a */
public final class C43430a extends ProxySelector {

    /* renamed from: a */
    public static final C43430a f101294a = new C43430a();

    private C43430a() {
    }

    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    public List select(URI uri) {
        if (uri != null) {
            return C41339p.m119900e(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
