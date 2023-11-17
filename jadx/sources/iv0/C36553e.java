package iv0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: iv0.e */
public final class C36553e {

    /* renamed from: a */
    private final C36555g f88090a;

    /* renamed from: b */
    private final C36557i f88091b;

    /* renamed from: c */
    private final List f88092c;

    public C36553e(C36555g gVar, C36557i iVar, List list) {
        C41536l.m120489i(gVar, "summary");
        C41536l.m120489i(iVar, "accountType");
        C41536l.m120489i(list, "accounts");
        this.f88090a = gVar;
        this.f88091b = iVar;
        this.f88092c = list;
    }

    /* renamed from: a */
    public final C36557i mo89349a() {
        return this.f88091b;
    }

    /* renamed from: b */
    public final List mo89350b() {
        return this.f88092c;
    }

    /* renamed from: c */
    public final C36555g mo89351c() {
        return this.f88090a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36553e)) {
            return false;
        }
        C36553e eVar = (C36553e) obj;
        return C41536l.m120484d(this.f88090a, eVar.f88090a) && this.f88091b == eVar.f88091b && C41536l.m120484d(this.f88092c, eVar.f88092c);
    }

    public int hashCode() {
        return (((this.f88090a.hashCode() * 31) + this.f88091b.hashCode()) * 31) + this.f88092c.hashCode();
    }

    public String toString() {
        C36555g gVar = this.f88090a;
        C36557i iVar = this.f88091b;
        List list = this.f88092c;
        return "OpenBankAccountModel(summary=" + gVar + ", accountType=" + iVar + ", accounts=" + list + ")";
    }
}
