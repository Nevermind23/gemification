package p674xm;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: xm.o */
public final class C18813o {

    /* renamed from: a */
    private final C18814p f52564a;

    /* renamed from: b */
    private final String f52565b;

    /* renamed from: c */
    private final boolean f52566c;

    public C18813o(C18814p pVar, String str, boolean z) {
        C41536l.m120489i(pVar, "state");
        C41536l.m120489i(str, "text");
        this.f52564a = pVar;
        this.f52565b = str;
        this.f52566c = z;
    }

    /* renamed from: a */
    public final boolean mo46663a() {
        return this.f52566c;
    }

    /* renamed from: b */
    public final C18814p mo46664b() {
        return this.f52564a;
    }

    /* renamed from: c */
    public final String mo46665c() {
        return this.f52565b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18813o)) {
            return false;
        }
        C18813o oVar = (C18813o) obj;
        return this.f52564a == oVar.f52564a && C41536l.m120484d(this.f52565b, oVar.f52565b) && this.f52566c == oVar.f52566c;
    }

    public int hashCode() {
        int hashCode = ((this.f52564a.hashCode() * 31) + this.f52565b.hashCode()) * 31;
        boolean z = this.f52566c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        C18814p pVar = this.f52564a;
        String str = this.f52565b;
        boolean z = this.f52566c;
        return "NextButtonData(state=" + pVar + ", text=" + str + ", checkboxVisible=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18813o(C18814p pVar, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, str, (i & 4) != 0 ? false : z);
    }
}
