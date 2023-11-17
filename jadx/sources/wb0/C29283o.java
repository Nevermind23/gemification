package wb0;

import ed1.C40734b;
import ed1.C40735b0;
import ed1.C40749p;
import ed1.C40762x;
import hd0.C24978b;
import j51.C36735g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jy0.C36845a;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ld0.C25950a;
import m51.C37228a;
import md0.C26186e;
import nd0.C26453c;
import ny0.C37500b;
import ny0.C37508i;
import od0.C26940a;
import od0.C26941b;
import oy0.C37837c;
import oy0.C37839e;
import oy0.C37841g;
import p341ge.bog.mobilebank.cleanarch.precontract.data.entity.PreContractEntity;
import p341ge.bog.mobilebank.deposits.data.entity.DepositSavingGoalPurposeWrapperEntity;
import p341ge.bog.mobilebank.deposits.data.entity.DepositsAndBondsEntity;
import p341ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakInfoEntity;
import p341ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakProcessValidationEntity;
import p341ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakValidationEntity;
import p341ge.bog.mobilebank.deposits.data.entity.depositprolongation.DepositChangeProlParametersEntity;
import p341ge.bog.mobilebank.deposits.data.entity.depositprolongation.DepositProlongationDetailsEntity;
import p341ge.bog.mobilebank.deposits.data.entity.depositprolongation.DepositProlongationPeriodEntity;
import pd0.C27503h;
import py0.C38047a;
import py0.C38048b;
import py0.C38049c;
import qy0.C38267a;
import sb0.C28187a;
import tb0.C28352a;
import ub0.C28697a;
import ub0.C28698b;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: wb0.o */
public final class C29283o implements C38267a, C26941b {

    /* renamed from: k */
    public static final C29284a f74351k = new C29284a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C28187a f74352d;

    /* renamed from: e */
    private final C36845a f74353e;

    /* renamed from: f */
    private final C36735g f74354f;

    /* renamed from: g */
    private final C28698b f74355g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C28697a f74356h;

    /* renamed from: i */
    private final /* synthetic */ C26940a f74357i = new C26940a();

    /* renamed from: j */
    private final C27503h f74358j = mo69129r4(new C27503h());

    /* renamed from: wb0.o$a */
    public static final class C29284a {
        private C29284a() {
        }

        public /* synthetic */ C29284a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: wb0.o$b */
    static final class C29285b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29283o f74359d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29285b(C29283o oVar) {
            super(1);
            this.f74359d = oVar;
        }

        /* renamed from: a */
        public final C38047a invoke(DepositChangeProlParametersEntity depositChangeProlParametersEntity) {
            C41536l.m120489i(depositChangeProlParametersEntity, "it");
            return this.f74359d.f74356h.mo68420d(depositChangeProlParametersEntity);
        }
    }

    /* renamed from: wb0.o$c */
    static final class C29286c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ long f74360d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29286c(long j) {
            super(1);
            this.f74360d = j;
        }

        /* renamed from: a */
        public final C37500b invoke(C37508i iVar) {
            Object obj;
            boolean z;
            C41536l.m120489i(iVar, "it");
            List d = iVar.mo90723d();
            long j = this.f74360d;
            Iterator it = d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C37500b) obj).mo90668d() == j) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C41536l.m120486f(obj);
            return (C37500b) obj;
        }
    }

    /* renamed from: wb0.o$d */
    static final class C29287d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29283o f74361d;

        /* renamed from: e */
        final /* synthetic */ long f74362e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29287d(C29283o oVar, long j) {
            super(1);
            this.f74361d = oVar;
            this.f74362e = j;
        }

        /* renamed from: a */
        public final C40735b0 invoke(C37500b bVar) {
            C41536l.m120489i(bVar, "it");
            return this.f74361d.f74352d.mo67691a(this.f74362e, bVar.mo90671f());
        }
    }

    /* renamed from: wb0.o$e */
    /* synthetic */ class C29288e extends C41535k implements C43075l {
        C29288e(Object obj) {
            super(1, obj, C28698b.class, "transform", "transform(Lge/bog/mobilebank/deposits/data/entity/depositbreak/DepositBreakInfoEntity;)Lge/bog/mobilebank/products/deposits/domain/model/depositbreak/DepositBreakInfo;", 0);
        }

        /* renamed from: b */
        public final C37837c invoke(DepositBreakInfoEntity depositBreakInfoEntity) {
            C41536l.m120489i(depositBreakInfoEntity, "p0");
            return ((C28698b) this.receiver).mo68429j(depositBreakInfoEntity);
        }
    }

    /* renamed from: wb0.o$f */
    /* synthetic */ class C29289f extends C41535k implements C43075l {
        C29289f(Object obj) {
            super(1, obj, C28698b.class, "transform", "transformDepLoanAgreements(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C28698b) this.receiver).mo68433o(list);
        }
    }

    /* renamed from: wb0.o$g */
    static final class C29290g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29283o f74363d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29290g(C29283o oVar) {
            super(1);
            this.f74363d = oVar;
        }

        /* renamed from: a */
        public final C25950a invoke(PreContractEntity preContractEntity) {
            C41536l.m120489i(preContractEntity, "it");
            return this.f74363d.f74356h.mo68419c(preContractEntity);
        }
    }

    /* renamed from: wb0.o$h */
    static final class C29291h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29283o f74364d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29291h(C29283o oVar) {
            super(1);
            this.f74364d = oVar;
        }

        /* renamed from: a */
        public final C38048b invoke(DepositProlongationDetailsEntity depositProlongationDetailsEntity) {
            C41536l.m120489i(depositProlongationDetailsEntity, "it");
            return this.f74364d.f74356h.mo68421e(depositProlongationDetailsEntity);
        }
    }

    /* renamed from: wb0.o$i */
    static final class C29292i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29283o f74365d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29292i(C29283o oVar) {
            super(1);
            this.f74365d = oVar;
        }

        /* renamed from: a */
        public final C38049c invoke(DepositProlongationPeriodEntity depositProlongationPeriodEntity) {
            C41536l.m120489i(depositProlongationPeriodEntity, "it");
            return this.f74365d.f74356h.mo68422f(depositProlongationPeriodEntity);
        }
    }

    /* renamed from: wb0.o$j */
    /* synthetic */ class C29293j extends C41535k implements C43075l {
        C29293j(Object obj) {
            super(1, obj, C28698b.class, "transform", "transform(Lge/bog/mobilebank/deposits/data/entity/DepositSavingGoalPurposeWrapperEntity;)Ljava/util/List;", 0);
        }

        /* renamed from: b */
        public final List invoke(DepositSavingGoalPurposeWrapperEntity depositSavingGoalPurposeWrapperEntity) {
            C41536l.m120489i(depositSavingGoalPurposeWrapperEntity, "p0");
            return ((C28698b) this.receiver).mo68423a(depositSavingGoalPurposeWrapperEntity);
        }
    }

    /* renamed from: wb0.o$k */
    /* synthetic */ class C29294k extends C41535k implements C43075l {
        C29294k(Object obj) {
            super(1, obj, C28698b.class, "transform", "transform(Lge/bog/mobilebank/deposits/data/entity/DepositsAndBondsEntity;)Lge/bog/mobilebank/products/deposits/domain/model/DepositsAndBonds;", 0);
        }

        /* renamed from: b */
        public final C37508i invoke(DepositsAndBondsEntity depositsAndBondsEntity) {
            C41536l.m120489i(depositsAndBondsEntity, "p0");
            return ((C28698b) this.receiver).mo68426f(depositsAndBondsEntity);
        }
    }

    /* renamed from: wb0.o$l */
    static final class C29295l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29283o f74366d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29295l(C29283o oVar) {
            super(1);
            this.f74366d = oVar;
        }

        /* renamed from: a */
        public final Double invoke(String str) {
            C41536l.m120489i(str, "it");
            return Double.valueOf(this.f74366d.f74356h.mo68417a(str));
        }
    }

    /* renamed from: wb0.o$m */
    static final class C29296m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29283o f74367d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29296m(C29283o oVar) {
            super(1);
            this.f74367d = oVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            return this.f74367d.f74356h.mo68418b(list);
        }
    }

    /* renamed from: wb0.o$n */
    /* synthetic */ class C29297n extends C41535k implements C43064a {
        C29297n(Object obj) {
            super(0, obj, C29283o.class, "getDepositsObservable", "getDepositsObservable()Lio/reactivex/Observable;", 0);
        }

        public final C40749p invoke() {
            return ((C29283o) this.receiver).m89278D4();
        }
    }

    /* renamed from: wb0.o$o */
    /* synthetic */ class C29298o extends C41535k implements C43075l {
        C29298o(Object obj) {
            super(1, obj, C28698b.class, "transform", "transform(Lge/bog/mobilebank/deposits/data/entity/depositbreak/DepositBreakValidationEntity;)Lge/bog/mobilebank/products/deposits/domain/model/depositbreak/DepositBreakValidation;", 0);
        }

        /* renamed from: b */
        public final C37841g invoke(DepositBreakValidationEntity depositBreakValidationEntity) {
            C41536l.m120489i(depositBreakValidationEntity, "p0");
            return ((C28698b) this.receiver).mo68430k(depositBreakValidationEntity);
        }
    }

    /* renamed from: wb0.o$p */
    static final class C29299p extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C29299p f74368d = new C29299p();

        C29299p() {
            super(1);
        }

        /* renamed from: a */
        public final C37839e invoke(DepositBreakProcessValidationEntity depositBreakProcessValidationEntity) {
            C41536l.m120489i(depositBreakProcessValidationEntity, "it");
            return new C37839e(C28352a.m86998a(depositBreakProcessValidationEntity.getStatus()));
        }
    }

    public C29283o(C28187a aVar, C36845a aVar2, C36735g gVar, C28698b bVar, C28697a aVar3) {
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(aVar2, "preferencesManager");
        C41536l.m120489i(gVar, "getLoginInfo");
        C41536l.m120489i(bVar, "mapper");
        C41536l.m120489i(aVar3, "depositProlongationMapper");
        this.f74352d = aVar;
        this.f74353e = aVar2;
        this.f74354f = gVar;
        this.f74355g = bVar;
        this.f74356h = aVar3;
    }

    /* access modifiers changed from: private */
    /* renamed from: A4 */
    public static final C38048b m89275A4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C38048b) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: B4 */
    public static final C38049c m89276B4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C38049c) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: C4 */
    public static final List m89277C4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: D4 */
    public final C40749p m89278D4() {
        C40749p k0 = this.f74352d.mo67694b().mo95026k0(new C29273e(new C29294k(this.f74355g)));
        C41536l.m120488h(k0, "service.getDepositsAndBo…  .map(mapper::transform)");
        return k0;
    }

    /* access modifiers changed from: private */
    /* renamed from: E4 */
    public static final C37508i m89279E4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C37508i) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: F4 */
    public static final Double m89280F4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Double) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: G4 */
    public static final List m89281G4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: H4 */
    private final void m89282H4(boolean z) {
        this.f74358j.mo66814o(z, new C29297n(this)).mo94979E0();
    }

    /* renamed from: I4 */
    private final boolean m89283I4(long j) {
        return j == -1 || System.currentTimeMillis() - j > 1209600000;
    }

    /* access modifiers changed from: private */
    /* renamed from: J4 */
    public static final C37841g m89284J4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C37841g) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: K4 */
    public static final C37839e m89285K4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C37839e) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: s4 */
    public static final C38047a m89303s4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C38047a) lVar.invoke(obj);
    }

    /* renamed from: u4 */
    private final long m89304u4() {
        C37228a a = this.f74354f.mo89562a();
        if (a != null) {
            return a.mo90305b();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: v4 */
    public static final C37500b m89305v4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C37500b) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: w4 */
    public static final C40735b0 m89306w4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: x4 */
    public static final C37837c m89307x4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C37837c) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: y4 */
    public static final List m89308y4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: z4 */
    public static final C25950a m89309z4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25950a) lVar.invoke(obj);
    }

    /* renamed from: B */
    public C40762x mo69108B(String str) {
        C41536l.m120489i(str, "prodType");
        C40762x A = this.f74352d.mo67685B(str).mo95062A(new C29275g(new C29293j(this.f74355g)));
        C41536l.m120488h(A, "service.getDepositPurpos…e).map(mapper::transform)");
        return A;
    }

    /* renamed from: Dh */
    public C40734b mo69109Dh(double d, String str, String str2, boolean z, boolean z2, Long l, String str3, long j, long j2, long j3, String str4, boolean z3) {
        C41536l.m120489i(str, "name");
        C41536l.m120489i(str2, "purpose");
        C41536l.m120489i(str3, "agreeType");
        C41536l.m120489i(str4, "intWithPeriodType");
        C28187a aVar = this.f74352d;
        String e = C24978b.m79846b(Boolean.valueOf(z)).mo63391e();
        C28187a aVar2 = aVar;
        C41536l.m120488h(e, "fromBoolean(copySto).value");
        String e2 = C24978b.m79846b(Boolean.valueOf(z2)).mo63391e();
        String str5 = e2;
        C41536l.m120488h(e2, "fromBoolean(copyCas).value");
        String e3 = C24978b.m79846b(Boolean.valueOf(z3)).mo63391e();
        String str6 = e3;
        C41536l.m120488h(e3, "fromBoolean(withdrawInterest).value");
        return aVar2.mo67698f(d, str, str2, e, str5, l, str3, j, j2, j3, str4, str6);
    }

    /* renamed from: E5 */
    public C40762x mo69110E5(long j, boolean z) {
        C28187a aVar = this.f74352d;
        String e = C24978b.m79846b(Boolean.valueOf(z)).mo63391e();
        C41536l.m120488h(e, "fromBoolean(withdrawInterest).value");
        C40762x A = aVar.mo67696d(j, e).mo95062A(new C29269a(new C29295l(this)));
        C41536l.m120488h(A, "override fun getProlonga…r.transform(it)\n        }");
        return A;
    }

    /* renamed from: Gb */
    public void mo69111Gb(long j) {
        this.f74353e.mo68901b(j, m89304u4());
    }

    /* renamed from: Iq */
    public C40734b mo69112Iq(long j, boolean z) {
        C28187a aVar = this.f74352d;
        String e = C24978b.m79846b(Boolean.valueOf(z)).mo63391e();
        C41536l.m120488h(e, "fromBoolean(newState).value");
        return aVar.mo67695c(j, e);
    }

    /* renamed from: J0 */
    public C40762x mo69113J0(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        C40762x A = this.f74352d.mo67686J0(hashMap).mo95062A(new C29274f(C29299p.f74368d));
        C41536l.m120488h(A, "service.validateDepositB…status.toDomainModel()) }");
        return A;
    }

    /* renamed from: J6 */
    public void mo69114J6(long j) {
        this.f74353e.mo68903d(j, m89304u4());
    }

    /* renamed from: M */
    public C40734b mo69115M(Long l) {
        return this.f74352d.mo67687M(l);
    }

    /* renamed from: M2 */
    public C40762x mo69116M2() {
        C40762x A = this.f74352d.mo67688M2().mo95062A(new C29270b(new C29289f(this.f74355g)));
        C41536l.m120488h(A, "service.getDepositLoanAg…().map(mapper::transform)");
        return A;
    }

    /* renamed from: Or */
    public boolean mo69117Or(long j) {
        return m89283I4(this.f74353e.mo68902c(j, m89304u4()));
    }

    /* renamed from: T0 */
    public C40762x mo69118T0(String str, double d, String str2, long j, String str3) {
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(str2, "ccy");
        String str4 = str3;
        C41536l.m120489i(str4, "intWithPeriodType");
        C40762x A = this.f74352d.mo67689T0(str, d, str2, j, str4).mo95062A(new C29272d(new C29292i(this)));
        C41536l.m120488h(A, "override fun getDepositP…apper.transform(it)\n    }");
        return A;
    }

    /* renamed from: U0 */
    public C40762x mo69119U0(long j) {
        C40762x A = this.f74352d.mo67690U0(j).mo95062A(new C29276h(new C29291h(this)));
        C41536l.m120488h(A, "override fun getDepositP…apper.transform(it)\n    }");
        return A;
    }

    /* renamed from: U8 */
    public C40734b mo69120U8(String str, Double d, Double d2, String str2, String str3, Long l, Long l2, long j) {
        return this.f74352d.mo67700g(str, d, d2, str2, str3, l, l2, Long.valueOf(j));
    }

    /* renamed from: Vf */
    public C40749p mo69121Vf(boolean z) {
        C40749p e = C26453c.m82747e(this.f74358j.mo66812m());
        m89282H4(z);
        return e;
    }

    /* renamed from: Yh */
    public C40762x mo69122Yh(long j) {
        C40762x A = C26186e.m81990h(C38267a.C38268a.m112505a(this, false, 1, (Object) null)).mo95062A(new C29278j(new C29286c(j))).mo95087r(new C29279k(new C29287d(this, j))).mo95062A(new C29280l(new C29288e(this.f74355g)));
        C41536l.m120488h(A, "override fun getDepositB… }.map(mapper::transform)");
        return A;
    }

    /* renamed from: a2 */
    public C40762x mo69123a2(String str, double d, String str2, long j) {
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(str2, "ccy");
        C40762x A = this.f74352d.mo67692a2(str, d, str2, j).mo95062A(new C29277i(new C29296m(this)));
        C41536l.m120488h(A, "override fun getProlonga…apper.transform(it)\n    }");
        return A;
    }

    /* renamed from: a3 */
    public C40734b mo69124a3(long j, String str) {
        C41536l.m120489i(str, "name");
        return this.f74352d.mo67693a3(j, str);
    }

    public void addStore(C27503h hVar) {
        C41536l.m120489i(hVar, "store");
        this.f74357i.addStore(hVar);
    }

    public void clean() {
        mo69133t4();
    }

    /* renamed from: f1 */
    public C40762x mo69125f1(String str, String str2, double d, String str3, long j, long j2, long j3, String str4, String str5, double d2, double d3, double d4, String str6, int i, double d5) {
        String str7 = str;
        C41536l.m120489i(str7, "depositName");
        C41536l.m120489i(str2, "purpose");
        C41536l.m120489i(str3, "ccy");
        C41536l.m120489i(str4, "withdrawalType");
        C41536l.m120489i(str5, "withdrawalTypeKey");
        C41536l.m120489i(str6, "prodType");
        C40762x A = this.f74352d.mo67699f1(str7, str2, d, str3, j, j2, j3, str4, str5, d2, d3, d4, str6, i, d5).mo95062A(new C29271c(new C29290g(this)));
        C41536l.m120488h(A, "override fun getDepositP…sform(it)\n        }\n    }");
        return A;
    }

    /* renamed from: g1 */
    public C40762x mo69126g1(double d, String str, String str2, long j, long j2, String str3) {
        C41536l.m120489i(str, "prodType");
        String str4 = str2;
        C41536l.m120489i(str4, "ccy");
        String str5 = str3;
        C41536l.m120489i(str5, "intPeriodType");
        C40762x A = this.f74352d.mo67701g1(d, str, str4, j, j2, str5).mo95062A(new C29282n(new C29285b(this)));
        C41536l.m120488h(A, "override fun changeProlo…r.transform(it)\n        }");
        return A;
    }

    /* renamed from: n1 */
    public C40734b mo69127n1(long j, long j2) {
        return this.f74352d.mo67702n1(j, j2);
    }

    /* renamed from: r3 */
    public C40762x mo69128r3(long j) {
        C40762x A = this.f74352d.mo67703r3(j).mo95062A(new C29281m(new C29298o(this.f74355g)));
        C41536l.m120488h(A, "service.validateDepositB…  .map(mapper::transform)");
        return A;
    }

    /* renamed from: r4 */
    public C27503h mo69129r4(C27503h hVar) {
        C41536l.m120489i(hVar, "<this>");
        return this.f74357i.mo66226a(hVar);
    }

    /* renamed from: r7 */
    public C40734b mo69130r7(Long l, String str, Double d, String str2, String str3, Long l2, Long l3, long j) {
        return this.f74352d.mo67697e(l, str, d, str2, str3, l2, l3, Long.valueOf(j));
    }

    public void refreshDepositsAndBonds() {
        m89282H4(true);
    }

    /* renamed from: rs */
    public boolean mo69132rs(long j) {
        return m89283I4(this.f74353e.mo68900a(j, m89304u4()));
    }

    /* renamed from: t4 */
    public void mo69133t4() {
        this.f74357i.mo66227b();
    }
}
