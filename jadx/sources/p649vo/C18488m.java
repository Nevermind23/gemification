package p649vo;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: vo.m */
public final class C18488m {

    /* renamed from: a */
    private String f51958a;

    /* renamed from: b */
    private String f51959b;

    public C18488m(String str, String str2) {
        this.f51958a = str;
        this.f51959b = str2;
    }

    /* renamed from: a */
    public final String mo46270a() {
        return this.f51958a;
    }

    /* renamed from: b */
    public final String mo46271b() {
        return this.f51959b;
    }

    /* renamed from: c */
    public final void mo46272c(String str) {
        this.f51958a = str;
    }

    /* renamed from: d */
    public final void mo46273d(String str) {
        this.f51959b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18488m)) {
            return false;
        }
        C18488m mVar = (C18488m) obj;
        return C41536l.m120484d(this.f51958a, mVar.f51958a) && C41536l.m120484d(this.f51959b, mVar.f51959b);
    }

    public int hashCode() {
        String str = this.f51958a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f51959b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f51958a;
        String str2 = this.f51959b;
        return "InfoAmountViewState(amountInput=" + str + ", ccy=" + str2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18488m(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
