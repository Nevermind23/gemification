package com.salesforce.marketingcloud.events.predicates;

/* renamed from: com.salesforce.marketingcloud.events.predicates.a */
public class C11443a extends C11451f {

    /* renamed from: e */
    private final C11451f[] f33291e;

    public C11443a(C11451f... fVarArr) {
        this.f33291e = fVarArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo29944a() {
        for (C11451f b : this.f33291e) {
            if (!b.mo29954b()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo29945c() {
        return "And";
    }
}
