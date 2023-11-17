package ca0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ca0.i */
public final class C19677i {

    /* renamed from: a */
    private final long f54012a;

    /* renamed from: b */
    private final Double f54013b;

    /* renamed from: c */
    private final String f54014c;

    /* renamed from: d */
    private final String f54015d;

    /* renamed from: e */
    private final String f54016e;

    /* renamed from: f */
    private final String f54017f;

    /* renamed from: g */
    private final String f54018g;

    public C19677i(long j, Double d, String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "ccy");
        this.f54012a = j;
        this.f54013b = d;
        this.f54014c = str;
        this.f54015d = str2;
        this.f54016e = str3;
        this.f54017f = str4;
        this.f54018g = str5;
    }

    /* renamed from: a */
    public final Double mo47872a() {
        return this.f54013b;
    }

    /* renamed from: b */
    public final String mo47873b() {
        return this.f54014c;
    }

    /* renamed from: c */
    public final long mo47874c() {
        return this.f54012a;
    }

    /* renamed from: d */
    public final String mo47875d() {
        return this.f54018g;
    }

    /* renamed from: e */
    public final String mo47876e() {
        return this.f54016e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19677i)) {
            return false;
        }
        C19677i iVar = (C19677i) obj;
        return this.f54012a == iVar.f54012a && C41536l.m120484d(this.f54013b, iVar.f54013b) && C41536l.m120484d(this.f54014c, iVar.f54014c) && C41536l.m120484d(this.f54015d, iVar.f54015d) && C41536l.m120484d(this.f54016e, iVar.f54016e) && C41536l.m120484d(this.f54017f, iVar.f54017f) && C41536l.m120484d(this.f54018g, iVar.f54018g);
    }

    /* renamed from: f */
    public final String mo47878f() {
        return this.f54015d;
    }

    /* renamed from: g */
    public final String mo47879g() {
        return this.f54017f;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f54012a) * 31;
        Double d = this.f54013b;
        int i = 0;
        int hashCode = (((a + (d == null ? 0 : d.hashCode())) * 31) + this.f54014c.hashCode()) * 31;
        String str = this.f54015d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f54016e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f54017f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f54018g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        long j = this.f54012a;
        Double d = this.f54013b;
        String str = this.f54014c;
        String str2 = this.f54015d;
        String str3 = this.f54016e;
        String str4 = this.f54017f;
        String str5 = this.f54018g;
        return "DdStoIntroUiModel(id=" + j + ", amount=" + d + ", ccy=" + str + ", leftTopText=" + str2 + ", leftBotText=" + str3 + ", rightBotText=" + str4 + ", imageUrl=" + str5 + ")";
    }
}
