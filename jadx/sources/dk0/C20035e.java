package dk0;

import kotlin.jvm.internal.C41536l;

/* renamed from: dk0.e */
public final class C20035e {

    /* renamed from: a */
    private final C20031a f54637a;

    /* renamed from: b */
    private final String f54638b;

    /* renamed from: c */
    private final String f54639c;

    /* renamed from: d */
    private final C20036f f54640d;

    /* renamed from: e */
    private final C20037g f54641e;

    public C20035e(C20031a aVar, String str, String str2, C20036f fVar, C20037g gVar) {
        C41536l.m120489i(aVar, "cardNetwork");
        C41536l.m120489i(str, "lastDigits");
        C41536l.m120489i(str2, "opcBase64");
        C41536l.m120489i(fVar, "tokenProvider");
        C41536l.m120489i(gVar, "userAddress");
        this.f54637a = aVar;
        this.f54638b = str;
        this.f54639c = str2;
        this.f54640d = fVar;
        this.f54641e = gVar;
    }

    /* renamed from: a */
    public final C20031a mo48420a() {
        return this.f54637a;
    }

    /* renamed from: b */
    public final String mo48421b() {
        return this.f54638b;
    }

    /* renamed from: c */
    public final String mo48422c() {
        return this.f54639c;
    }

    /* renamed from: d */
    public final C20036f mo48423d() {
        return this.f54640d;
    }

    /* renamed from: e */
    public final C20037g mo48424e() {
        return this.f54641e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20035e)) {
            return false;
        }
        C20035e eVar = (C20035e) obj;
        return this.f54637a == eVar.f54637a && C41536l.m120484d(this.f54638b, eVar.f54638b) && C41536l.m120484d(this.f54639c, eVar.f54639c) && this.f54640d == eVar.f54640d && C41536l.m120484d(this.f54641e, eVar.f54641e);
    }

    public int hashCode() {
        return (((((((this.f54637a.hashCode() * 31) + this.f54638b.hashCode()) * 31) + this.f54639c.hashCode()) * 31) + this.f54640d.hashCode()) * 31) + this.f54641e.hashCode();
    }

    public String toString() {
        C20031a aVar = this.f54637a;
        String str = this.f54638b;
        String str2 = this.f54639c;
        C20036f fVar = this.f54640d;
        C20037g gVar = this.f54641e;
        return "PushTokenize(cardNetwork=" + aVar + ", lastDigits=" + str + ", opcBase64=" + str2 + ", tokenProvider=" + fVar + ", userAddress=" + gVar + ")";
    }
}
