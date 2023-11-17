package p393di;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: di.b */
public final class C12131b {

    /* renamed from: a */
    private final String f35636a;

    /* renamed from: b */
    private final String f35637b;

    /* renamed from: c */
    private final C12130a f35638c;

    /* renamed from: d */
    private final int f35639d;

    /* renamed from: e */
    private final List f35640e;

    /* renamed from: f */
    private final C12131b f35641f;

    /* renamed from: g */
    private final String f35642g;

    public C12131b(String str, String str2, C12130a aVar, int i, List list, C12131b bVar, String str3) {
        C41536l.m120489i(aVar, "amount");
        C41536l.m120489i(list, "segments");
        this.f35636a = str;
        this.f35637b = str2;
        this.f35638c = aVar;
        this.f35639d = i;
        this.f35640e = list;
        this.f35641f = bVar;
        this.f35642g = str3;
    }

    /* renamed from: a */
    public final C12130a mo32332a() {
        return this.f35638c;
    }

    /* renamed from: b */
    public final int mo32333b() {
        return this.f35639d;
    }

    /* renamed from: c */
    public final String mo32334c() {
        return this.f35642g;
    }

    /* renamed from: d */
    public final String mo32335d() {
        return this.f35636a;
    }

    /* renamed from: e */
    public final List mo32336e() {
        return this.f35640e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12131b)) {
            return false;
        }
        C12131b bVar = (C12131b) obj;
        return C41536l.m120484d(this.f35636a, bVar.f35636a) && C41536l.m120484d(this.f35637b, bVar.f35637b) && C41536l.m120484d(this.f35638c, bVar.f35638c) && this.f35639d == bVar.f35639d && C41536l.m120484d(this.f35640e, bVar.f35640e) && C41536l.m120484d(this.f35641f, bVar.f35641f) && C41536l.m120484d(this.f35642g, bVar.f35642g);
    }

    /* renamed from: f */
    public final String mo32338f() {
        return this.f35637b;
    }

    public int hashCode() {
        String str = this.f35636a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f35637b;
        int hashCode2 = (((((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f35638c.hashCode()) * 31) + this.f35639d) * 31) + this.f35640e.hashCode()) * 31;
        C12131b bVar = this.f35641f;
        int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str3 = this.f35642g;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.f35636a;
        String str2 = this.f35637b;
        C12130a aVar = this.f35638c;
        int i = this.f35639d;
        List list = this.f35640e;
        C12131b bVar = this.f35641f;
        String str3 = this.f35642g;
        return "DrilldownData(id=" + str + ", title=" + str2 + ", amount=" + aVar + ", colorResId=" + i + ", segments=" + list + ", parent=" + bVar + ", description=" + str3 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12131b(String str, String str2, C12130a aVar, int i, List list, C12131b bVar, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, aVar, i, list, (i2 & 32) != 0 ? null : bVar, (i2 & 64) != 0 ? null : str3);
    }
}
