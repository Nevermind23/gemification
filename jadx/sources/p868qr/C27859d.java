package p868qr;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: qr.d */
public final class C27859d extends C27860e {

    /* renamed from: a */
    private final String f70987a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27859d(String str) {
        super((DefaultConstructorMarker) null);
        C41536l.m120489i(str, "title");
        this.f70987a = str;
    }

    /* renamed from: a */
    public final String mo67378a() {
        return this.f70987a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27859d) && C41536l.m120484d(this.f70987a, ((C27859d) obj).f70987a);
    }

    public int hashCode() {
        return this.f70987a.hashCode();
    }

    public String toString() {
        String str = this.f70987a;
        return "LimitRefinanceTitleItem(title=" + str + ")";
    }
}
