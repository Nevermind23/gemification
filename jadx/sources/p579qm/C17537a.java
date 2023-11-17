package p579qm;

import hd0.C24978b;
import he1.C41224m;
import he1.C41233s;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p537nm.C17085g0;

/* renamed from: qm.a */
public final class C17537a {

    /* renamed from: a */
    private final String f49065a;

    /* renamed from: b */
    private final C17085g0 f49066b;

    /* renamed from: c */
    private final C24978b f49067c;

    /* renamed from: d */
    private final C24978b f49068d;

    /* renamed from: e */
    private final Long f49069e;

    /* renamed from: f */
    private final String f49070f;

    public C17537a(String str, C17085g0 g0Var, C24978b bVar, C24978b bVar2, Long l, String str2) {
        C41536l.m120489i(str, "product");
        C41536l.m120489i(g0Var, "regType");
        C41536l.m120489i(bVar, "digitalCard");
        C41536l.m120489i(bVar2, "cardCloseFlag");
        C41536l.m120489i(str2, IRetrofitService.SERVICE_ID);
        this.f49065a = str;
        this.f49066b = g0Var;
        this.f49067c = bVar;
        this.f49068d = bVar2;
        this.f49069e = l;
        this.f49070f = str2;
    }

    /* renamed from: b */
    public static /* synthetic */ C17537a m61067b(C17537a aVar, String str, C17085g0 g0Var, C24978b bVar, C24978b bVar2, Long l, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f49065a;
        }
        if ((i & 2) != 0) {
            g0Var = aVar.f49066b;
        }
        C17085g0 g0Var2 = g0Var;
        if ((i & 4) != 0) {
            bVar = aVar.f49067c;
        }
        C24978b bVar3 = bVar;
        if ((i & 8) != 0) {
            bVar2 = aVar.f49068d;
        }
        C24978b bVar4 = bVar2;
        if ((i & 16) != 0) {
            l = aVar.f49069e;
        }
        Long l2 = l;
        if ((i & 32) != 0) {
            str2 = aVar.f49070f;
        }
        return aVar.mo45054a(str, g0Var2, bVar3, bVar4, l2, str2);
    }

    /* renamed from: a */
    public final C17537a mo45054a(String str, C17085g0 g0Var, C24978b bVar, C24978b bVar2, Long l, String str2) {
        C41536l.m120489i(str, "product");
        C41536l.m120489i(g0Var, "regType");
        C41536l.m120489i(bVar, "digitalCard");
        C41536l.m120489i(bVar2, "cardCloseFlag");
        C41536l.m120489i(str2, IRetrofitService.SERVICE_ID);
        return new C17537a(str, g0Var, bVar, bVar2, l, str2);
    }

    /* renamed from: c */
    public final Long mo45055c() {
        return this.f49069e;
    }

    /* renamed from: d */
    public final HashMap mo45056d() {
        long j;
        C41224m[] mVarArr = new C41224m[6];
        mVarArr[0] = C41233s.m119492a(IRetrofitService.SERVICE_ID, this.f49070f);
        mVarArr[1] = C41233s.m119492a("product", this.f49065a);
        mVarArr[2] = C41233s.m119492a("regType", this.f49066b.mo44353b());
        mVarArr[3] = C41233s.m119492a("digitalCard", this.f49067c.mo63391e());
        mVarArr[4] = C41233s.m119492a("cardCloseFlag", this.f49068d.mo63391e());
        Long l = this.f49069e;
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        mVarArr[5] = C41233s.m119492a("orgId", Long.valueOf(j));
        Map m = C41344r0.m119931m(mVarArr);
        if (this.f49069e == null) {
            m = C41344r0.m119932n(m, "orgId");
        }
        return new HashMap(m);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17537a)) {
            return false;
        }
        C17537a aVar = (C17537a) obj;
        return C41536l.m120484d(this.f49065a, aVar.f49065a) && this.f49066b == aVar.f49066b && this.f49067c == aVar.f49067c && this.f49068d == aVar.f49068d && C41536l.m120484d(this.f49069e, aVar.f49069e) && C41536l.m120484d(this.f49070f, aVar.f49070f);
    }

    public int hashCode() {
        int hashCode = ((((((this.f49065a.hashCode() * 31) + this.f49066b.hashCode()) * 31) + this.f49067c.hashCode()) * 31) + this.f49068d.hashCode()) * 31;
        Long l = this.f49069e;
        return ((hashCode + (l == null ? 0 : l.hashCode())) * 31) + this.f49070f.hashCode();
    }

    public String toString() {
        String str = this.f49065a;
        C17085g0 g0Var = this.f49066b;
        C24978b bVar = this.f49067c;
        C24978b bVar2 = this.f49068d;
        Long l = this.f49069e;
        String str2 = this.f49070f;
        return "CardFeeParams(product=" + str + ", regType=" + g0Var + ", digitalCard=" + bVar + ", cardCloseFlag=" + bVar2 + ", orgId=" + l + ", serviceId=" + str2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17537a(String str, C17085g0 g0Var, C24978b bVar, C24978b bVar2, Long l, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, g0Var, bVar, bVar2, l, (i & 32) != 0 ? "CARDS_GET_CARD_FEE" : str2);
    }
}
