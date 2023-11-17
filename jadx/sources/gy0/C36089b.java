package gy0;

import kotlin.jvm.internal.C41536l;

/* renamed from: gy0.b */
public final class C36089b {

    /* renamed from: a */
    private final String f87243a;

    /* renamed from: b */
    private final String f87244b;

    /* renamed from: c */
    private final String f87245c;

    /* renamed from: d */
    private final String f87246d;

    /* renamed from: e */
    private final String f87247e;

    public C36089b(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "amount");
        C41536l.m120489i(str2, "commission");
        C41536l.m120489i(str3, "paymentDate");
        C41536l.m120489i(str4, "cardText");
        C41536l.m120489i(str5, "cardImage");
        this.f87243a = str;
        this.f87244b = str2;
        this.f87245c = str3;
        this.f87246d = str4;
        this.f87247e = str5;
    }

    /* renamed from: a */
    public final String mo88835a() {
        return this.f87243a;
    }

    /* renamed from: b */
    public final String mo88836b() {
        return this.f87247e;
    }

    /* renamed from: c */
    public final String mo88837c() {
        return this.f87246d;
    }

    /* renamed from: d */
    public final String mo88838d() {
        return this.f87244b;
    }

    /* renamed from: e */
    public final String mo88839e() {
        return this.f87245c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36089b)) {
            return false;
        }
        C36089b bVar = (C36089b) obj;
        return C41536l.m120484d(this.f87243a, bVar.f87243a) && C41536l.m120484d(this.f87244b, bVar.f87244b) && C41536l.m120484d(this.f87245c, bVar.f87245c) && C41536l.m120484d(this.f87246d, bVar.f87246d) && C41536l.m120484d(this.f87247e, bVar.f87247e);
    }

    public int hashCode() {
        return (((((((this.f87243a.hashCode() * 31) + this.f87244b.hashCode()) * 31) + this.f87245c.hashCode()) * 31) + this.f87246d.hashCode()) * 31) + this.f87247e.hashCode();
    }

    public String toString() {
        String str = this.f87243a;
        String str2 = this.f87244b;
        String str3 = this.f87245c;
        String str4 = this.f87246d;
        String str5 = this.f87247e;
        return "PaymentDetailsUiModel(amount=" + str + ", commission=" + str2 + ", paymentDate=" + str3 + ", cardText=" + str4 + ", cardImage=" + str5 + ")";
    }
}
