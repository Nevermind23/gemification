package p652we;

import hd1.C41205b;
import kotlin.jvm.internal.C41536l;

/* renamed from: we.g */
public final class C18548g {

    /* renamed from: a */
    private final C18561l f52052a;

    /* renamed from: b */
    private final C41205b f52053b;

    public C18548g(C18561l lVar, C41205b bVar) {
        C41536l.m120490j(lVar, "webSocket");
        C41536l.m120490j(bVar, "webSocketDisposable");
        this.f52052a = lVar;
        this.f52053b = bVar;
    }

    /* renamed from: a */
    public final C18561l mo46363a() {
        return this.f52052a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18548g)) {
            return false;
        }
        C18548g gVar = (C18548g) obj;
        return C41536l.m120484d(this.f52052a, gVar.f52052a) && C41536l.m120484d(this.f52053b, gVar.f52053b);
    }

    public int hashCode() {
        C18561l lVar = this.f52052a;
        int i = 0;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        C41205b bVar = this.f52053b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "Session(webSocket=" + this.f52052a + ", webSocketDisposable=" + this.f52053b + ")";
    }
}
