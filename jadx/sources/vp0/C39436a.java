package vp0;

import j31.C36725a;
import kotlin.jvm.internal.C41536l;

/* renamed from: vp0.a */
public final class C39436a {

    /* renamed from: a */
    private final String f93644a;

    /* renamed from: b */
    private final String f93645b;

    /* renamed from: c */
    private final Long f93646c;

    /* renamed from: d */
    private final String f93647d;

    /* renamed from: e */
    private final String f93648e;

    /* renamed from: f */
    private final C36725a f93649f;

    /* renamed from: g */
    private final C36725a f93650g;

    public C39436a(String str, String str2, Long l, String str3, String str4, C36725a aVar, C36725a aVar2) {
        this.f93644a = str;
        this.f93645b = str2;
        this.f93646c = l;
        this.f93647d = str3;
        this.f93648e = str4;
        this.f93649f = aVar;
        this.f93650g = aVar2;
    }

    /* renamed from: a */
    public final Long mo93054a() {
        return this.f93646c;
    }

    /* renamed from: b */
    public final String mo93055b() {
        return this.f93648e;
    }

    /* renamed from: c */
    public final C36725a mo93056c() {
        return this.f93650g;
    }

    /* renamed from: d */
    public final C36725a mo93057d() {
        return this.f93649f;
    }

    /* renamed from: e */
    public final String mo93058e() {
        return this.f93647d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39436a)) {
            return false;
        }
        C39436a aVar = (C39436a) obj;
        return C41536l.m120484d(this.f93644a, aVar.f93644a) && C41536l.m120484d(this.f93645b, aVar.f93645b) && C41536l.m120484d(this.f93646c, aVar.f93646c) && C41536l.m120484d(this.f93647d, aVar.f93647d) && C41536l.m120484d(this.f93648e, aVar.f93648e) && C41536l.m120484d(this.f93649f, aVar.f93649f) && C41536l.m120484d(this.f93650g, aVar.f93650g);
    }

    /* renamed from: f */
    public final String mo93060f() {
        return this.f93644a;
    }

    public int hashCode() {
        String str = this.f93644a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f93645b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f93646c;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.f93647d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f93648e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C36725a aVar = this.f93649f;
        int hashCode6 = (hashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C36725a aVar2 = this.f93650g;
        if (aVar2 != null) {
            i = aVar2.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        String str = this.f93644a;
        String str2 = this.f93645b;
        Long l = this.f93646c;
        String str3 = this.f93647d;
        String str4 = this.f93648e;
        C36725a aVar = this.f93649f;
        C36725a aVar2 = this.f93650g;
        return "LoanAccount(productDictionaryKey=" + str + ", lastFour=" + str2 + ", acctKey=" + l + ", cardPan=" + str3 + ", acctNo=" + str4 + ", cardIcon=" + aVar + ", cardBackground=" + aVar2 + ")";
    }
}
