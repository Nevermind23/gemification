package com.facetec.sdk;

import java.io.Closeable;
import java.io.Flushable;

/* renamed from: com.facetec.sdk.jb */
public final class C3235jb implements Closeable, Flushable {

    /* renamed from: c */
    final C3317kq f10541c;

    /* renamed from: d */
    private C3306kj f10542d;

    public final void close() {
        this.f10542d.close();
    }

    public final void flush() {
        this.f10542d.flush();
    }
}
