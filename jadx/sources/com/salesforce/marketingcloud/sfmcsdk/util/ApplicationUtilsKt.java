package com.salesforce.marketingcloud.sfmcsdk.util;

import kotlin.jvm.internal.C41536l;
import ue1.C43064a;

public final class ApplicationUtilsKt {
    public static final <R> R orElse(R r, C43064a aVar) {
        C41536l.m120489i(aVar, "block");
        if (r == null) {
            return aVar.invoke();
        }
        return r;
    }
}
