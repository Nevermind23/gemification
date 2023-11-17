package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10785e0;

/* renamed from: com.medallia.digital.mobilesdk.g2 */
class C10826g2 extends C10785e0 {

    /* renamed from: g */
    private static final int f30992g = 31;

    /* renamed from: a */
    private String f30993a;

    /* renamed from: b */
    private final String f30994b;

    /* renamed from: c */
    private final String f30995c;

    /* renamed from: d */
    private final FormTriggerType f30996d;

    /* renamed from: e */
    private final long f30997e;

    /* renamed from: f */
    private int f30998f;

    C10826g2(String str, String str2, String str3, FormTriggerType formTriggerType, long j, int i) {
        this.f30993a = str;
        this.f30994b = str2;
        this.f30995c = str3;
        this.f30996d = formTriggerType;
        this.f30997e = j;
        this.f30998f = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo28331a() {
        return this.f30993a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo28333b() {
        return this.f30994b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public FormTriggerType mo28334c() {
        return this.f30996d;
    }

    /* renamed from: d */
    public int mo28335d() {
        return this.f30998f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public long mo28336e() {
        return this.f30997e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C10826g2 g2Var = (C10826g2) obj;
        String str = this.f30993a;
        if (str == null ? g2Var.f30993a != null : !str.equals(g2Var.f30993a)) {
            return false;
        }
        String str2 = this.f30994b;
        if (str2 == null ? g2Var.f30994b != null : !str2.equals(g2Var.f30994b)) {
            return false;
        }
        String str3 = this.f30995c;
        if (str3 == null ? g2Var.f30995c != null : !str3.equals(g2Var.f30995c)) {
            return false;
        }
        if (this.f30997e == g2Var.f30997e && this.f30998f == g2Var.f30998f) {
            return this.f30996d.ordinal() == g2Var.f30996d.ordinal();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo28338f() {
        this.f30998f++;
    }

    /* access modifiers changed from: protected */
    public C10785e0.C10786a getDataTableObjectType() {
        return C10785e0.C10786a.Feedback;
    }

    /* access modifiers changed from: protected */
    public String getFormId() {
        return this.f30995c;
    }

    public int hashCode() {
        String str = this.f30995c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f30993a;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f30994b;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f30995c;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.f30996d.hashCode();
    }

    /* renamed from: a */
    public void mo28332a(String str) {
        this.f30993a = str;
    }
}
