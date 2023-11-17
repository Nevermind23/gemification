package com.apollographql.apollo.exception;

import of1.C41880d0;

public final class ApolloHttpException extends ApolloException {

    /* renamed from: d */
    private final int f7509d;

    /* renamed from: e */
    private final String f7510e;

    /* renamed from: f */
    private final transient C41880d0 f7511f;

    public ApolloHttpException(C41880d0 d0Var) {
        super(m9160b(d0Var));
        int i;
        String str;
        if (d0Var != null) {
            i = d0Var.mo96747q();
        } else {
            i = 0;
        }
        this.f7509d = i;
        if (d0Var != null) {
            str = d0Var.mo96754x();
        } else {
            str = "";
        }
        this.f7510e = str;
        this.f7511f = d0Var;
    }

    /* renamed from: b */
    private static String m9160b(C41880d0 d0Var) {
        if (d0Var == null) {
            return "Empty HTTP response";
        }
        return "HTTP " + d0Var.mo96747q() + " " + d0Var.mo96754x();
    }

    /* renamed from: a */
    public int mo7647a() {
        return this.f7509d;
    }

    /* renamed from: c */
    public C41880d0 mo7648c() {
        return this.f7511f;
    }
}
