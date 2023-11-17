package p341ge.bog.mobilebank.openbanking.presentation.details;

import he1.C41224m;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.openbanking.presentation.details.C33425d;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.details.g */
final class C33441g {

    /* renamed from: a */
    private final C33425d.C33434i f81626a;

    /* renamed from: b */
    private final C33425d.C33426a f81627b;

    /* renamed from: c */
    private final C41224m f81628c;

    /* renamed from: d */
    private final List f81629d;

    public C33441g(C33425d.C33434i iVar, C33425d.C33426a aVar, C41224m mVar, List list) {
        C41536l.m120489i(list, "loadedOperations");
        this.f81626a = iVar;
        this.f81627b = aVar;
        this.f81628c = mVar;
        this.f81629d = list;
    }

    /* renamed from: b */
    public static /* synthetic */ C33441g m98189b(C33441g gVar, C33425d.C33434i iVar, C33425d.C33426a aVar, C41224m mVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = gVar.f81626a;
        }
        if ((i & 2) != 0) {
            aVar = gVar.f81627b;
        }
        if ((i & 4) != 0) {
            mVar = gVar.f81628c;
        }
        if ((i & 8) != 0) {
            list = gVar.f81629d;
        }
        return gVar.mo79254a(iVar, aVar, mVar, list);
    }

    /* renamed from: a */
    public final C33441g mo79254a(C33425d.C33434i iVar, C33425d.C33426a aVar, C41224m mVar, List list) {
        C41536l.m120489i(list, "loadedOperations");
        return new C33441g(iVar, aVar, mVar, list);
    }

    /* renamed from: c */
    public final C33425d.C33426a mo79255c() {
        return this.f81627b;
    }

    /* renamed from: d */
    public final C41224m mo79256d() {
        return this.f81628c;
    }

    /* renamed from: e */
    public final List mo79257e() {
        return this.f81629d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33441g)) {
            return false;
        }
        C33441g gVar = (C33441g) obj;
        return C41536l.m120484d(this.f81626a, gVar.f81626a) && C41536l.m120484d(this.f81627b, gVar.f81627b) && C41536l.m120484d(this.f81628c, gVar.f81628c) && C41536l.m120484d(this.f81629d, gVar.f81629d);
    }

    /* renamed from: f */
    public final C33425d.C33434i mo79259f() {
        return this.f81626a;
    }

    public int hashCode() {
        C33425d.C33434i iVar = this.f81626a;
        int i = 0;
        int hashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
        C33425d.C33426a aVar = this.f81627b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C41224m mVar = this.f81628c;
        if (mVar != null) {
            i = mVar.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f81629d.hashCode();
    }

    public String toString() {
        C33425d.C33434i iVar = this.f81626a;
        C33425d.C33426a aVar = this.f81627b;
        C41224m mVar = this.f81628c;
        List list = this.f81629d;
        return "ViewState(productHeader=" + iVar + ", accountNumber=" + aVar + ", lastPageResult=" + mVar + ", loadedOperations=" + list + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33441g(C33425d.C33434i iVar, C33425d.C33426a aVar, C41224m mVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : iVar, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : mVar, (i & 8) != 0 ? C41341q.m119907j() : list);
    }
}
