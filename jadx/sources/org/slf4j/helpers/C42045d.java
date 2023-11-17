package org.slf4j.helpers;

import java.io.Serializable;
import vh1.C43168a;
import vh1.C43169b;

/* renamed from: org.slf4j.helpers.d */
abstract class C42045d implements C43168a, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;

    C42045d() {
    }

    public abstract String getName();

    /* access modifiers changed from: protected */
    public Object readResolve() {
        return C43169b.m123833j(getName());
    }
}
