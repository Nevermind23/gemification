package p579qm;

import com.salesforce.marketingcloud.C11398b;
import i31.C36345b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p537nm.C17090i0;
import p537nm.C17097n;
import p537nm.C17104u;

/* renamed from: qm.c */
public final class C17539c {

    /* renamed from: a */
    private final List f49073a;

    /* renamed from: b */
    private final List f49074b;

    /* renamed from: c */
    private final List f49075c;

    /* renamed from: d */
    private final List f49076d;

    /* renamed from: e */
    private final List f49077e;

    /* renamed from: f */
    private final C17104u f49078f;

    /* renamed from: g */
    private final List f49079g;

    /* renamed from: h */
    private final List f49080h;

    /* renamed from: i */
    private final List f49081i;

    /* renamed from: j */
    private final List f49082j;

    /* renamed from: k */
    private final List f49083k;

    /* renamed from: l */
    private final List f49084l;

    /* renamed from: m */
    private final List f49085m;

    /* renamed from: n */
    private final List f49086n;

    /* renamed from: o */
    private final List f49087o;

    /* renamed from: p */
    private final C36345b f49088p;

    /* renamed from: q */
    private final C17097n f49089q;

    /* renamed from: r */
    private final List f49090r;

    /* renamed from: s */
    private final C17090i0 f49091s;

    public C17539c(List list, List list2, List list3, List list4, List list5, C17104u uVar, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, C36345b bVar, C17097n nVar, List list15, C17090i0 i0Var) {
        List list16 = list;
        List list17 = list2;
        List list18 = list3;
        List list19 = list4;
        List list20 = list5;
        List list21 = list6;
        List list22 = list7;
        List list23 = list8;
        List list24 = list9;
        List list25 = list10;
        List list26 = list11;
        List list27 = list12;
        List list28 = list14;
        C36345b bVar2 = bVar;
        List list29 = list15;
        C41536l.m120489i(list16, "regTypes");
        C41536l.m120489i(list17, "cardAccounts");
        C41536l.m120489i(list18, "accounts");
        C41536l.m120489i(list19, "currencies");
        C41536l.m120489i(list20, "pinDeliveryTypes");
        C41536l.m120489i(list21, "cities");
        C41536l.m120489i(list22, "debitCardTypes");
        C41536l.m120489i(list23, "debitCardOrderTypes");
        C41536l.m120489i(list24, "receiveTypes");
        C41536l.m120489i(list25, "recipientTypes");
        C41536l.m120489i(list26, "deliveryAddresses");
        C41536l.m120489i(list27, "csDefaultDepartments");
        C41536l.m120489i(list28, "payrollAccounts");
        C41536l.m120489i(bVar2, "insuranceInfo");
        C41536l.m120489i(nVar, "card");
        List list30 = list15;
        C41536l.m120489i(list30, "selectorAccounts");
        this.f49073a = list16;
        this.f49074b = list17;
        this.f49075c = list18;
        this.f49076d = list19;
        this.f49077e = list20;
        this.f49078f = uVar;
        this.f49079g = list21;
        this.f49080h = list22;
        this.f49081i = list23;
        this.f49082j = list24;
        this.f49083k = list25;
        this.f49084l = list26;
        this.f49085m = list27;
        this.f49086n = list13;
        this.f49087o = list28;
        this.f49088p = bVar2;
        this.f49089q = nVar;
        this.f49090r = list30;
        this.f49091s = i0Var;
    }

    /* renamed from: b */
    public static /* synthetic */ C17539c m61073b(C17539c cVar, List list, List list2, List list3, List list4, List list5, C17104u uVar, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, C36345b bVar, C17097n nVar, List list15, C17090i0 i0Var, int i, Object obj) {
        C17539c cVar2 = cVar;
        int i2 = i;
        return cVar.mo45065a((i2 & 1) != 0 ? cVar2.f49073a : list, (i2 & 2) != 0 ? cVar2.f49074b : list2, (i2 & 4) != 0 ? cVar2.f49075c : list3, (i2 & 8) != 0 ? cVar2.f49076d : list4, (i2 & 16) != 0 ? cVar2.f49077e : list5, (i2 & 32) != 0 ? cVar2.f49078f : uVar, (i2 & 64) != 0 ? cVar2.f49079g : list6, (i2 & 128) != 0 ? cVar2.f49080h : list7, (i2 & C11398b.f33139r) != 0 ? cVar2.f49081i : list8, (i2 & C11398b.f33140s) != 0 ? cVar2.f49082j : list9, (i2 & C11398b.f33141t) != 0 ? cVar2.f49083k : list10, (i2 & C11398b.f33142u) != 0 ? cVar2.f49084l : list11, (i2 & C11398b.f33143v) != 0 ? cVar2.f49085m : list12, (i2 & 8192) != 0 ? cVar2.f49086n : list13, (i2 & 16384) != 0 ? cVar2.f49087o : list14, (i2 & 32768) != 0 ? cVar2.f49088p : bVar, (i2 & 65536) != 0 ? cVar2.f49089q : nVar, (i2 & 131072) != 0 ? cVar2.f49090r : list15, (i2 & 262144) != 0 ? cVar2.f49091s : i0Var);
    }

    /* renamed from: a */
    public final C17539c mo45065a(List list, List list2, List list3, List list4, List list5, C17104u uVar, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, C36345b bVar, C17097n nVar, List list15, C17090i0 i0Var) {
        List list16 = list;
        C41536l.m120489i(list16, "regTypes");
        C41536l.m120489i(list2, "cardAccounts");
        C41536l.m120489i(list3, "accounts");
        C41536l.m120489i(list4, "currencies");
        C41536l.m120489i(list5, "pinDeliveryTypes");
        C41536l.m120489i(list6, "cities");
        C41536l.m120489i(list7, "debitCardTypes");
        C41536l.m120489i(list8, "debitCardOrderTypes");
        C41536l.m120489i(list9, "receiveTypes");
        C41536l.m120489i(list10, "recipientTypes");
        C41536l.m120489i(list11, "deliveryAddresses");
        C41536l.m120489i(list12, "csDefaultDepartments");
        C41536l.m120489i(list14, "payrollAccounts");
        C41536l.m120489i(bVar, "insuranceInfo");
        C41536l.m120489i(nVar, "card");
        C41536l.m120489i(list15, "selectorAccounts");
        return new C17539c(list16, list2, list3, list4, list5, uVar, list6, list7, list8, list9, list10, list11, list12, list13, list14, bVar, nVar, list15, i0Var);
    }

    /* renamed from: c */
    public final List mo45066c() {
        return this.f49075c;
    }

    /* renamed from: d */
    public final C17097n mo45067d() {
        return this.f49089q;
    }

    /* renamed from: e */
    public final List mo45068e() {
        return this.f49074b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17539c)) {
            return false;
        }
        C17539c cVar = (C17539c) obj;
        return C41536l.m120484d(this.f49073a, cVar.f49073a) && C41536l.m120484d(this.f49074b, cVar.f49074b) && C41536l.m120484d(this.f49075c, cVar.f49075c) && C41536l.m120484d(this.f49076d, cVar.f49076d) && C41536l.m120484d(this.f49077e, cVar.f49077e) && C41536l.m120484d(this.f49078f, cVar.f49078f) && C41536l.m120484d(this.f49079g, cVar.f49079g) && C41536l.m120484d(this.f49080h, cVar.f49080h) && C41536l.m120484d(this.f49081i, cVar.f49081i) && C41536l.m120484d(this.f49082j, cVar.f49082j) && C41536l.m120484d(this.f49083k, cVar.f49083k) && C41536l.m120484d(this.f49084l, cVar.f49084l) && C41536l.m120484d(this.f49085m, cVar.f49085m) && C41536l.m120484d(this.f49086n, cVar.f49086n) && C41536l.m120484d(this.f49087o, cVar.f49087o) && C41536l.m120484d(this.f49088p, cVar.f49088p) && C41536l.m120484d(this.f49089q, cVar.f49089q) && C41536l.m120484d(this.f49090r, cVar.f49090r) && C41536l.m120484d(this.f49091s, cVar.f49091s);
    }

    /* renamed from: f */
    public final C17104u mo45070f() {
        return this.f49078f;
    }

    /* renamed from: g */
    public final List mo45071g() {
        return this.f49079g;
    }

    /* renamed from: h */
    public final List mo45072h() {
        return this.f49085m;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f49073a.hashCode() * 31) + this.f49074b.hashCode()) * 31) + this.f49075c.hashCode()) * 31) + this.f49076d.hashCode()) * 31) + this.f49077e.hashCode()) * 31;
        C17104u uVar = this.f49078f;
        int i = 0;
        int hashCode2 = (((((((((((((((hashCode + (uVar == null ? 0 : uVar.hashCode())) * 31) + this.f49079g.hashCode()) * 31) + this.f49080h.hashCode()) * 31) + this.f49081i.hashCode()) * 31) + this.f49082j.hashCode()) * 31) + this.f49083k.hashCode()) * 31) + this.f49084l.hashCode()) * 31) + this.f49085m.hashCode()) * 31;
        List list = this.f49086n;
        int hashCode3 = (((((((((hashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.f49087o.hashCode()) * 31) + this.f49088p.hashCode()) * 31) + this.f49089q.hashCode()) * 31) + this.f49090r.hashCode()) * 31;
        C17090i0 i0Var = this.f49091s;
        if (i0Var != null) {
            i = i0Var.hashCode();
        }
        return hashCode3 + i;
    }

    /* renamed from: i */
    public final List mo45074i() {
        return this.f49076d;
    }

    /* renamed from: j */
    public final List mo45075j() {
        return this.f49081i;
    }

    /* renamed from: k */
    public final List mo45076k() {
        return this.f49080h;
    }

    /* renamed from: l */
    public final List mo45077l() {
        return this.f49084l;
    }

    /* renamed from: m */
    public final C36345b mo45078m() {
        return this.f49088p;
    }

    /* renamed from: n */
    public final List mo45079n() {
        return this.f49087o;
    }

    /* renamed from: o */
    public final List mo45080o() {
        return this.f49086n;
    }

    /* renamed from: p */
    public final List mo45081p() {
        return this.f49077e;
    }

    /* renamed from: q */
    public final List mo45082q() {
        return this.f49082j;
    }

    /* renamed from: r */
    public final List mo45083r() {
        return this.f49083k;
    }

    /* renamed from: s */
    public final List mo45084s() {
        return this.f49073a;
    }

    /* renamed from: t */
    public final List mo45085t() {
        return this.f49090r;
    }

    public String toString() {
        List list = this.f49073a;
        List list2 = this.f49074b;
        List list3 = this.f49075c;
        List list4 = this.f49076d;
        List list5 = this.f49077e;
        C17104u uVar = this.f49078f;
        List list6 = this.f49079g;
        List list7 = this.f49080h;
        List list8 = this.f49081i;
        List list9 = this.f49082j;
        List list10 = this.f49083k;
        List list11 = this.f49084l;
        List list12 = this.f49085m;
        List list13 = this.f49086n;
        List list14 = this.f49087o;
        C36345b bVar = this.f49088p;
        C17097n nVar = this.f49089q;
        List list15 = this.f49090r;
        C17090i0 i0Var = this.f49091s;
        return "OrderDebitCardResources(regTypes=" + list + ", cardAccounts=" + list2 + ", accounts=" + list3 + ", currencies=" + list4 + ", pinDeliveryTypes=" + list5 + ", cardNickname=" + uVar + ", cities=" + list6 + ", debitCardTypes=" + list7 + ", debitCardOrderTypes=" + list8 + ", receiveTypes=" + list9 + ", recipientTypes=" + list10 + ", deliveryAddresses=" + list11 + ", csDefaultDepartments=" + list12 + ", phoneNumbers=" + list13 + ", payrollAccounts=" + list14 + ", insuranceInfo=" + bVar + ", card=" + nVar + ", selectorAccounts=" + list15 + ", scoolCardInfo=" + i0Var + ")";
    }
}
