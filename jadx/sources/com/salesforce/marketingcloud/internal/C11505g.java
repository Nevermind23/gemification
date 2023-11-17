package com.salesforce.marketingcloud.internal;

import java.util.Locale;

/* renamed from: com.salesforce.marketingcloud.internal.g */
public abstract class C11505g implements Runnable {

    /* renamed from: a */
    public final String f33424a;

    public C11505g(String str, Object... objArr) {
        this.f33424a = "mcsdk_" + String.format(Locale.US, str, objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo29760a();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f33424a);
        try {
            mo29760a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
