package mk0;

import kotlin.jvm.internal.C41536l;

/* renamed from: mk0.b */
public final class C26244b {

    /* renamed from: a */
    private final C26243a f66440a;

    /* renamed from: b */
    private final String f66441b;

    /* renamed from: c */
    private final String f66442c;

    /* renamed from: d */
    private final C26245c f66443d;

    /* renamed from: e */
    private final C26246d f66444e;

    public C26244b(C26243a aVar, String str, String str2, C26245c cVar, C26246d dVar) {
        C41536l.m120489i(aVar, "cardNetwork");
        C41536l.m120489i(str, "lastDigits");
        C41536l.m120489i(str2, "opcBase64");
        C41536l.m120489i(cVar, "tokenProvider");
        C41536l.m120489i(dVar, "userAddress");
        this.f66440a = aVar;
        this.f66441b = str;
        this.f66442c = str2;
        this.f66443d = cVar;
        this.f66444e = dVar;
    }

    /* renamed from: a */
    public final C26243a mo65247a() {
        return this.f66440a;
    }

    /* renamed from: b */
    public final String mo65248b() {
        return this.f66441b;
    }

    /* renamed from: c */
    public final String mo65249c() {
        return this.f66442c;
    }

    /* renamed from: d */
    public final C26245c mo65250d() {
        return this.f66443d;
    }

    /* renamed from: e */
    public final C26246d mo65251e() {
        return this.f66444e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26244b)) {
            return false;
        }
        C26244b bVar = (C26244b) obj;
        return this.f66440a == bVar.f66440a && C41536l.m120484d(this.f66441b, bVar.f66441b) && C41536l.m120484d(this.f66442c, bVar.f66442c) && this.f66443d == bVar.f66443d && C41536l.m120484d(this.f66444e, bVar.f66444e);
    }

    public int hashCode() {
        return (((((((this.f66440a.hashCode() * 31) + this.f66441b.hashCode()) * 31) + this.f66442c.hashCode()) * 31) + this.f66443d.hashCode()) * 31) + this.f66444e.hashCode();
    }

    public String toString() {
        C26243a aVar = this.f66440a;
        String str = this.f66441b;
        String str2 = this.f66442c;
        C26245c cVar = this.f66443d;
        C26246d dVar = this.f66444e;
        return "PushTokenizeUiModel(cardNetwork=" + aVar + ", lastDigits=" + str + ", opcBase64=" + str2 + ", tokenProvider=" + cVar + ", userAddress=" + dVar + ")";
    }
}
