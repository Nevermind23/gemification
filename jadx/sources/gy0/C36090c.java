package gy0;

import kotlin.jvm.internal.C41536l;

/* renamed from: gy0.c */
public final class C36090c {

    /* renamed from: a */
    private final String f87248a;

    /* renamed from: b */
    private final String f87249b;

    /* renamed from: c */
    private final String f87250c;

    /* renamed from: d */
    private final String f87251d;

    public C36090c(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "imageUrl");
        C41536l.m120489i(str2, "serviceName");
        C41536l.m120489i(str3, "customer");
        C41536l.m120489i(str4, "amount");
        this.f87248a = str;
        this.f87249b = str2;
        this.f87250c = str3;
        this.f87251d = str4;
    }

    /* renamed from: a */
    public final String mo88843a() {
        return this.f87251d;
    }

    /* renamed from: b */
    public final String mo88844b() {
        return this.f87250c;
    }

    /* renamed from: c */
    public final String mo88845c() {
        return this.f87248a;
    }

    /* renamed from: d */
    public final String mo88846d() {
        return this.f87249b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36090c)) {
            return false;
        }
        C36090c cVar = (C36090c) obj;
        return C41536l.m120484d(this.f87248a, cVar.f87248a) && C41536l.m120484d(this.f87249b, cVar.f87249b) && C41536l.m120484d(this.f87250c, cVar.f87250c) && C41536l.m120484d(this.f87251d, cVar.f87251d);
    }

    public int hashCode() {
        return (((((this.f87248a.hashCode() * 31) + this.f87249b.hashCode()) * 31) + this.f87250c.hashCode()) * 31) + this.f87251d.hashCode();
    }

    public String toString() {
        String str = this.f87248a;
        String str2 = this.f87249b;
        String str3 = this.f87250c;
        String str4 = this.f87251d;
        return "PaymentServiceUiModel(imageUrl=" + str + ", serviceName=" + str2 + ", customer=" + str3 + ", amount=" + str4 + ")";
    }
}
