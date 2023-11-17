package com.salesforce.marketingcloud.events.predicates;

import kotlin.jvm.internal.C41536l;

/* renamed from: com.salesforce.marketingcloud.events.predicates.e */
public final class C11450e extends C11451f {

    /* renamed from: e */
    private C11451f[] f33295e;

    public C11450e(C11451f... fVarArr) {
        C41536l.m120489i(fVarArr, "predicates");
        this.f33295e = fVarArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo29944a() {
        for (C11451f b : this.f33295e) {
            if (b.mo29954b()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo29945c() {
        return "Or";
    }
}
