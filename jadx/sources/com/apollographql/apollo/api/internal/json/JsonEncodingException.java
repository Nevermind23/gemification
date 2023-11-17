package com.apollographql.apollo.api.internal.json;

import java.io.IOException;
import kotlin.jvm.internal.C41536l;

public final class JsonEncodingException extends IOException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonEncodingException(String str) {
        super(str);
        C41536l.m120490j(str, "message");
    }
}
