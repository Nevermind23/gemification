package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10785e0;

/* renamed from: com.medallia.digital.mobilesdk.e7 */
class C10797e7 extends C10785e0 {

    /* renamed from: c */
    private static final int f30915c = 31;

    /* renamed from: a */
    private String f30916a;

    /* renamed from: b */
    private String f30917b;

    protected C10797e7(String str, String str2) {
        this.f30917b = str;
        this.f30916a = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo28263a() {
        return this.f30917b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo28265b() {
        return this.f30916a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C10797e7 e7Var = (C10797e7) obj;
        String str = this.f30916a;
        if (str == null ? e7Var.f30916a != null : !str.equals(e7Var.f30916a)) {
            return false;
        }
        String str2 = this.f30917b;
        String str3 = e7Var.f30917b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    /* access modifiers changed from: protected */
    public C10785e0.C10786a getDataTableObjectType() {
        return C10785e0.C10786a.Template;
    }

    public int hashCode() {
        String str = this.f30916a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f30917b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28264a(String str) {
        this.f30917b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28266b(String str) {
        this.f30916a = str;
    }
}
