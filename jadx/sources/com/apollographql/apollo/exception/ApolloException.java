package com.apollographql.apollo.exception;

import kotlin.jvm.internal.C41536l;

public class ApolloException extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApolloException(String str) {
        super(str);
        C41536l.m120490j(str, "message");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApolloException(String str, Throwable th) {
        super(str, th);
        C41536l.m120490j(str, "message");
        C41536l.m120490j(th, "cause");
    }
}
