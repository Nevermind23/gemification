package com.facetec.sdk;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facetec.sdk.jp */
public interface C3257jp {

    /* renamed from: e */
    public static final C3257jp f10649e = new C3257jp() {
        /* renamed from: a */
        public final List<InetAddress> mo9483a(String str) {
            if (str != null) {
                try {
                    return Arrays.asList(InetAddress.getAllByName(str));
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            } else {
                throw new UnknownHostException("hostname == null");
            }
        }
    };

    /* renamed from: a */
    List<InetAddress> mo9483a(String str);
}
