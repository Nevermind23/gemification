package ml0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ml0.c */
public final class C26249c {

    /* renamed from: a */
    private final Long f66466a;

    /* renamed from: b */
    private final String f66467b;

    /* renamed from: c */
    private final C26250d f66468c;

    /* renamed from: d */
    private final String f66469d;

    /* renamed from: e */
    private final String f66470e;

    /* renamed from: f */
    private final C26253f f66471f;

    public C26249c(Long l, String str, C26250d dVar, String str2, String str3, C26253f fVar) {
        this.f66466a = l;
        this.f66467b = str;
        this.f66468c = dVar;
        this.f66469d = str2;
        this.f66470e = str3;
        this.f66471f = fVar;
    }

    /* renamed from: a */
    public final String mo65276a() {
        return this.f66470e;
    }

    /* renamed from: b */
    public final String mo65277b() {
        return this.f66469d;
    }

    /* renamed from: c */
    public final C26250d mo65278c() {
        return this.f66468c;
    }

    /* renamed from: d */
    public final C26253f mo65279d() {
        return this.f66471f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26249c)) {
            return false;
        }
        C26249c cVar = (C26249c) obj;
        return C41536l.m120484d(this.f66466a, cVar.f66466a) && C41536l.m120484d(this.f66467b, cVar.f66467b) && this.f66468c == cVar.f66468c && C41536l.m120484d(this.f66469d, cVar.f66469d) && C41536l.m120484d(this.f66470e, cVar.f66470e) && C41536l.m120484d(this.f66471f, cVar.f66471f);
    }

    public int hashCode() {
        Long l = this.f66466a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.f66467b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C26250d dVar = this.f66468c;
        int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str2 = this.f66469d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f66470e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C26253f fVar = this.f66471f;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        Long l = this.f66466a;
        String str = this.f66467b;
        C26250d dVar = this.f66468c;
        String str2 = this.f66469d;
        String str3 = this.f66470e;
        C26253f fVar = this.f66471f;
        return "InsuranceProduct(id=" + l + ", lookupName=" + str + ", lookupValue=" + dVar + ", headerTextDKey=" + str2 + ", detailsTextDKey=" + str3 + ", productLogo=" + fVar + ")";
    }
}
