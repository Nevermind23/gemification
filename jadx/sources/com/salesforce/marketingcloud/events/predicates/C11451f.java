package com.salesforce.marketingcloud.events.predicates;

import com.salesforce.marketingcloud.C11461g;

/* renamed from: com.salesforce.marketingcloud.events.predicates.f */
public abstract class C11451f {

    /* renamed from: b */
    public static final C11451f f33296b = new C11452a();

    /* renamed from: c */
    public static final C11451f f33297c = new C11453b();

    /* renamed from: d */
    private static final String f33298d = C11461g.m41875a("Predicate");

    /* renamed from: a */
    private Boolean f33299a;

    /* renamed from: com.salesforce.marketingcloud.events.predicates.f$a */
    class C11452a extends C11451f {
        C11452a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo29944a() {
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo29945c() {
            return "true";
        }
    }

    /* renamed from: com.salesforce.marketingcloud.events.predicates.f$b */
    class C11453b extends C11451f {
        C11453b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo29944a() {
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo29945c() {
            return "false";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo29944a();

    /* renamed from: b */
    public final boolean mo29954b() {
        if (this.f33299a == null) {
            this.f33299a = Boolean.valueOf(mo29944a());
        }
        String str = f33298d;
        Object[] objArr = new Object[2];
        objArr[0] = mo29945c();
        objArr[1] = this.f33299a.booleanValue() ? "passed" : "failed";
        C11461g.m41891d(str, "%s %s", objArr);
        return this.f33299a.booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo29945c();
}
