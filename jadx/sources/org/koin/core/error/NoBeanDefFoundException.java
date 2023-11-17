package org.koin.core.error;

import kotlin.jvm.internal.C41536l;

public final class NoBeanDefFoundException extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoBeanDefFoundException(String str) {
        super(str);
        C41536l.m120489i(str, "msg");
    }
}
