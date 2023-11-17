package p941xp;

import kotlin.jvm.internal.C41536l;

/* renamed from: xp.b */
public final class C29822b {

    /* renamed from: a */
    private final C29821a f75513a;

    /* renamed from: b */
    private final String f75514b;

    public C29822b(C29821a aVar, String str) {
        C41536l.m120489i(aVar, "appType");
        C41536l.m120489i(str, "dictionaryKey");
        this.f75513a = aVar;
        this.f75514b = str;
    }

    /* renamed from: a */
    public final C29821a mo70081a() {
        return this.f75513a;
    }

    /* renamed from: b */
    public final String mo70082b() {
        return this.f75514b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29822b)) {
            return false;
        }
        C29822b bVar = (C29822b) obj;
        return this.f75513a == bVar.f75513a && C41536l.m120484d(this.f75514b, bVar.f75514b);
    }

    public int hashCode() {
        return (this.f75513a.hashCode() * 31) + this.f75514b.hashCode();
    }

    public String toString() {
        C29821a aVar = this.f75513a;
        String str = this.f75514b;
        return "ApplicationType(appType=" + aVar + ", dictionaryKey=" + str + ")";
    }
}
