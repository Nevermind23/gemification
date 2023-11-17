package hn0;

import kotlin.jvm.internal.C41536l;

/* renamed from: hn0.k */
public final class C15546k {

    /* renamed from: a */
    private final C15536a f44127a;

    /* renamed from: b */
    private final C15536a f44128b;

    /* renamed from: c */
    private final C15538c f44129c;

    /* renamed from: d */
    private final C15538c f44130d;

    /* renamed from: e */
    private final boolean f44131e;

    public C15546k(C15536a aVar, C15536a aVar2, C15538c cVar, C15538c cVar2, boolean z) {
        this.f44127a = aVar;
        this.f44128b = aVar2;
        this.f44129c = cVar;
        this.f44130d = cVar2;
        this.f44131e = z;
    }

    /* renamed from: a */
    public final C15536a mo42713a() {
        return this.f44127a;
    }

    /* renamed from: b */
    public final C15538c mo42714b() {
        return this.f44129c;
    }

    /* renamed from: c */
    public final C15538c mo42715c() {
        return this.f44130d;
    }

    /* renamed from: d */
    public final C15536a mo42716d() {
        return this.f44128b;
    }

    /* renamed from: e */
    public final boolean mo42717e() {
        return this.f44131e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15546k)) {
            return false;
        }
        C15546k kVar = (C15546k) obj;
        return C41536l.m120484d(this.f44127a, kVar.f44127a) && C41536l.m120484d(this.f44128b, kVar.f44128b) && C41536l.m120484d(this.f44129c, kVar.f44129c) && C41536l.m120484d(this.f44130d, kVar.f44130d) && this.f44131e == kVar.f44131e;
    }

    public int hashCode() {
        C15536a aVar = this.f44127a;
        int i = 0;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        C15536a aVar2 = this.f44128b;
        int hashCode2 = (hashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        C15538c cVar = this.f44129c;
        int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        C15538c cVar2 = this.f44130d;
        if (cVar2 != null) {
            i = cVar2.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.f44131e;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        C15536a aVar = this.f44127a;
        C15536a aVar2 = this.f44128b;
        C15538c cVar = this.f44129c;
        C15538c cVar2 = this.f44130d;
        boolean z = this.f44131e;
        return "UserIdentityData(actualAddress=" + aVar + ", legalAddress=" + aVar2 + ", country=" + cVar + ", country2=" + cVar2 + ", isResident=" + z + ")";
    }
}
