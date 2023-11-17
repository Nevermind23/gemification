package z10;

import kotlin.jvm.internal.C41536l;
import ld0.C25950a;

/* renamed from: z10.d */
public final class C30137d {

    /* renamed from: a */
    private final C25950a f75996a;

    /* renamed from: b */
    private final String f75997b;

    public C30137d(C25950a aVar, String str) {
        C41536l.m120489i(aVar, "result");
        C41536l.m120489i(str, "title");
        this.f75996a = aVar;
        this.f75997b = str;
    }

    /* renamed from: a */
    public final C25950a mo70475a() {
        return this.f75996a;
    }

    /* renamed from: b */
    public final String mo70476b() {
        return this.f75997b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30137d)) {
            return false;
        }
        C30137d dVar = (C30137d) obj;
        return C41536l.m120484d(this.f75996a, dVar.f75996a) && C41536l.m120484d(this.f75997b, dVar.f75997b);
    }

    public int hashCode() {
        return (this.f75996a.hashCode() * 31) + this.f75997b.hashCode();
    }

    public String toString() {
        C25950a aVar = this.f75996a;
        String str = this.f75997b;
        return "CreditPreContract(result=" + aVar + ", title=" + str + ")";
    }
}
