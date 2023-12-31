package com.facetec.sdk;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facetec.sdk.me */
public final class C3420me extends ProxySelector {
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    public final List<Proxy> select(URI uri) {
        if (uri != null) {
            return Collections.singletonList(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }
}
