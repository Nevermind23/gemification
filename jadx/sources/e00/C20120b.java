package e00;

import kotlin.jvm.internal.C41536l;

/* renamed from: e00.b */
public final class C20120b {

    /* renamed from: a */
    private final String f54778a;

    /* renamed from: b */
    private final C20119a f54779b;

    public C20120b(String str, C20119a aVar) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(aVar, "type");
        this.f54778a = str;
        this.f54779b = aVar;
    }

    /* renamed from: a */
    public final String mo48545a() {
        return this.f54778a;
    }

    /* renamed from: b */
    public final C20119a mo48546b() {
        return this.f54779b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20120b)) {
            return false;
        }
        C20120b bVar = (C20120b) obj;
        return C41536l.m120484d(this.f54778a, bVar.f54778a) && this.f54779b == bVar.f54779b;
    }

    public int hashCode() {
        return (this.f54778a.hashCode() * 31) + this.f54779b.hashCode();
    }

    public String toString() {
        String str = this.f54778a;
        C20119a aVar = this.f54779b;
        return "ProductTypeItem(title=" + str + ", type=" + aVar + ")";
    }
}
