package w60;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.products.cards.mcc.presentation.model.MccStateUiModel;

/* renamed from: w60.a */
public final class C29237a {

    /* renamed from: a */
    private final long f74297a;

    /* renamed from: b */
    private final String f74298b;

    /* renamed from: c */
    private final boolean f74299c;

    /* renamed from: d */
    private final boolean f74300d;

    /* renamed from: e */
    private final String f74301e;

    /* renamed from: f */
    private final String f74302f;

    /* renamed from: g */
    private final String f74303g;

    /* renamed from: h */
    private final String f74304h;

    public C29237a(long j, String str, boolean z, boolean z2, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "mccGroupCode");
        C41536l.m120489i(str2, "mccGroupNameKey");
        C41536l.m120489i(str3, "mccGroupName");
        C41536l.m120489i(str4, "mccGroupDescKey");
        C41536l.m120489i(str5, "mccGroupDesc");
        this.f74297a = j;
        this.f74298b = str;
        this.f74299c = z;
        this.f74300d = z2;
        this.f74301e = str2;
        this.f74302f = str3;
        this.f74303g = str4;
        this.f74304h = str5;
    }

    /* renamed from: a */
    public final MccStateUiModel mo69082a() {
        return new MccStateUiModel(this.f74297a, this.f74298b, this.f74299c, this.f74300d, this.f74301e, this.f74302f, this.f74303g, this.f74304h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29237a)) {
            return false;
        }
        C29237a aVar = (C29237a) obj;
        return this.f74297a == aVar.f74297a && C41536l.m120484d(this.f74298b, aVar.f74298b) && this.f74299c == aVar.f74299c && this.f74300d == aVar.f74300d && C41536l.m120484d(this.f74301e, aVar.f74301e) && C41536l.m120484d(this.f74302f, aVar.f74302f) && C41536l.m120484d(this.f74303g, aVar.f74303g) && C41536l.m120484d(this.f74304h, aVar.f74304h);
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f74297a) * 31) + this.f74298b.hashCode()) * 31;
        boolean z = this.f74299c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (a + (z ? 1 : 0)) * 31;
        boolean z3 = this.f74300d;
        if (!z3) {
            z2 = z3;
        }
        return ((((((((i + (z2 ? 1 : 0)) * 31) + this.f74301e.hashCode()) * 31) + this.f74302f.hashCode()) * 31) + this.f74303g.hashCode()) * 31) + this.f74304h.hashCode();
    }

    public String toString() {
        long j = this.f74297a;
        String str = this.f74298b;
        boolean z = this.f74299c;
        boolean z2 = this.f74300d;
        String str2 = this.f74301e;
        String str3 = this.f74302f;
        String str4 = this.f74303g;
        String str5 = this.f74304h;
        return "MccState(cardId=" + j + ", mccGroupCode=" + str + ", mccStatus=" + z + ", accessMode=" + z2 + ", mccGroupNameKey=" + str2 + ", mccGroupName=" + str3 + ", mccGroupDescKey=" + str4 + ", mccGroupDesc=" + str5 + ")";
    }
}
