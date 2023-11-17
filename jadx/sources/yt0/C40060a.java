package yt0;

import kotlin.jvm.internal.C41536l;

/* renamed from: yt0.a */
public final class C40060a {

    /* renamed from: a */
    private final String f95196a;

    /* renamed from: b */
    private final String f95197b;

    /* renamed from: c */
    private final String f95198c;

    /* renamed from: d */
    private final String f95199d;

    /* renamed from: e */
    private final String f95200e;

    /* renamed from: f */
    private final String f95201f;

    /* renamed from: g */
    private final String f95202g;

    public C40060a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C41536l.m120489i(str, "clientKey");
        C41536l.m120489i(str2, "labelType");
        C41536l.m120489i(str3, "labelDesc");
        C41536l.m120489i(str4, "benefitValue");
        C41536l.m120489i(str5, "benefitStatus");
        C41536l.m120489i(str6, "orderValue");
        C41536l.m120489i(str7, "benefitDesc");
        this.f95196a = str;
        this.f95197b = str2;
        this.f95198c = str3;
        this.f95199d = str4;
        this.f95200e = str5;
        this.f95201f = str6;
        this.f95202g = str7;
    }

    /* renamed from: a */
    public final String mo93945a() {
        return this.f95202g;
    }

    /* renamed from: b */
    public final String mo93946b() {
        return this.f95200e;
    }

    /* renamed from: c */
    public final String mo93947c() {
        return this.f95199d;
    }

    /* renamed from: d */
    public final String mo93948d() {
        return this.f95196a;
    }

    /* renamed from: e */
    public final String mo93949e() {
        return this.f95198c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40060a)) {
            return false;
        }
        C40060a aVar = (C40060a) obj;
        return C41536l.m120484d(this.f95196a, aVar.f95196a) && C41536l.m120484d(this.f95197b, aVar.f95197b) && C41536l.m120484d(this.f95198c, aVar.f95198c) && C41536l.m120484d(this.f95199d, aVar.f95199d) && C41536l.m120484d(this.f95200e, aVar.f95200e) && C41536l.m120484d(this.f95201f, aVar.f95201f) && C41536l.m120484d(this.f95202g, aVar.f95202g);
    }

    /* renamed from: f */
    public final String mo93951f() {
        return this.f95197b;
    }

    /* renamed from: g */
    public final String mo93952g() {
        return this.f95201f;
    }

    public int hashCode() {
        return (((((((((((this.f95196a.hashCode() * 31) + this.f95197b.hashCode()) * 31) + this.f95198c.hashCode()) * 31) + this.f95199d.hashCode()) * 31) + this.f95200e.hashCode()) * 31) + this.f95201f.hashCode()) * 31) + this.f95202g.hashCode();
    }

    public String toString() {
        String str = this.f95196a;
        String str2 = this.f95197b;
        String str3 = this.f95198c;
        String str4 = this.f95199d;
        String str5 = this.f95200e;
        String str6 = this.f95201f;
        String str7 = this.f95202g;
        return "Benefit(clientKey=" + str + ", labelType=" + str2 + ", labelDesc=" + str3 + ", benefitValue=" + str4 + ", benefitStatus=" + str5 + ", orderValue=" + str6 + ", benefitDesc=" + str7 + ")";
    }
}
