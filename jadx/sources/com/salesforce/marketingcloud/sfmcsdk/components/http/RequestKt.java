package com.salesforce.marketingcloud.sfmcsdk.components.http;

import java.nio.charset.Charset;
import kotlin.jvm.internal.C41536l;

public final class RequestKt {
    private static final Charset UTF_8;

    static {
        Charset forName = Charset.forName("UTF-8");
        C41536l.m120488h(forName, "<clinit>");
        UTF_8 = forName;
    }

    public static final Charset getUTF_8() {
        return UTF_8;
    }
}
