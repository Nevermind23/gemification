package org.koin.core.error;

import kotlin.jvm.internal.C41536l;

public final class InstanceCreationException extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstanceCreationException(String str, Exception exc) {
        super(str, exc);
        C41536l.m120489i(str, "msg");
        C41536l.m120489i(exc, "parent");
    }
}
