package us0;

import at0.C31064a;
import bt0.C31186b;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40765a;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ld0.C25950a;
import m00.C26116a;
import p341ge.bog.mobilebank.cleanarch.precontract.data.entity.PreContractEntity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.OpenMoneyBoxResultEntity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas.CasHistoryItemEntity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas.CasServiceInfoEntity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.domain.model.piggybank.CasServiceNotFoundException;
import p342j$.util.concurrent.ConcurrentHashMap;
import p865py.C27640a;
import ss0.C38526a;
import ts0.C38793a;
import ts0.C38794b;
import ue1.C43075l;
import zs0.C40252e;
import zs0.C40253f;

/* renamed from: us0.o */
public final class C39085o implements C31186b {

    /* renamed from: d */
    private final C38526a f93227d;

    /* renamed from: e */
    private final C27640a f93228e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C38794b f93229f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C38793a f93230g;

    /* renamed from: h */
    private final C26116a f93231h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final ConcurrentHashMap f93232i = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final AtomicBoolean f93233j = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C40252e f93234k;

    /* renamed from: l */
    private C40765a f93235l;

    /* renamed from: us0.o$a */
    /* synthetic */ class C39086a extends C41535k implements C43075l {
        C39086a(Object obj) {
            super(1, obj, C27640a.class, "transform", "transform(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C27640a) this.receiver).mo67178b(list);
        }
    }

    /* renamed from: us0.o$b */
    /* synthetic */ class C39087b extends C41535k implements C43075l {
        C39087b(Object obj) {
            super(1, obj, C27640a.class, "transformDepositAccounts", "transformDepositAccounts(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C27640a) this.receiver).mo67191o(list);
        }
    }

    /* renamed from: us0.o$c */
    static final class C39088c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ long f93236d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39088c(long j) {
            super(1);
            this.f93236d = j;
        }

        /* renamed from: a */
        public final C40253f invoke(C40252e eVar) {
            Object obj;
            boolean z;
            C41536l.m120489i(eVar, "info");
            List a = eVar.mo94232a();
            long j = this.f93236d;
            Iterator it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C40253f) obj).mo94250j() == j) {
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
            C40253f fVar = (C40253f) obj;
            if (fVar != null) {
                return fVar;
            }
            throw CasServiceNotFoundException.f80606d;
        }
    }

    /* renamed from: us0.o$d */
    static final class C39089d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ long f93237d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39089d(long j) {
            super(1);
            this.f93237d = j;
        }

        /* renamed from: a */
        public final C40253f invoke(C40252e eVar) {
            Object obj;
            boolean z;
            C41536l.m120489i(eVar, "info");
            List a = eVar.mo94232a();
            long j = this.f93237d;
            Iterator it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C40253f) obj).mo94242d() == j) {
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
            C40253f fVar = (C40253f) obj;
            if (fVar != null) {
                return fVar;
            }
            throw CasServiceNotFoundException.f80606d;
        }
    }

    /* renamed from: us0.o$e */
    static final class C39090e extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C39090e f93238d = new C39090e();

        C39090e() {
            super(1);
        }

        /* renamed from: a */
        public final C40754t invoke(C40749p pVar) {
            C41536l.m120489i(pVar, "it");
            return pVar;
        }
    }

    /* renamed from: us0.o$f */
    static final class C39091f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39085o f93239d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39091f(C39085o oVar) {
            super(1);
            this.f93239d = oVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            C38793a m4 = this.f93239d.f93230g;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m4.mo92490e((CasHistoryItemEntity) it.next()));
            }
            return arrayList;
        }
    }

    /* renamed from: us0.o$g */
    /* synthetic */ class C39092g extends C41535k implements C43075l {
        C39092g(Object obj) {
            super(1, obj, C26116a.class, "transform", "transform(Lge/bog/mobilebank/cleanarch/precontract/data/entity/PreContractEntity;)Lge/bog/mobilebank/domain/precontract/model/PreContract;", 0);
        }

        /* renamed from: b */
        public final C25950a invoke(PreContractEntity preContractEntity) {
            C41536l.m120489i(preContractEntity, "p0");
            return ((C26116a) this.receiver).mo65027a(preContractEntity);
        }
    }

    /* renamed from: us0.o$h */
    /* synthetic */ class C39093h extends C41535k implements C43075l {
        C39093h(Object obj) {
            super(1, obj, C38793a.class, "transform", "transform(Lge/bog/mobilebank/loyaltyandbonusprograms/data/entity/cas/CasServiceInfoEntity;)Lge/bog/mobilebank/loyaltyandbonusprograms/domain/model/cas/CasServiceInfo;", 0);
        }

        /* renamed from: b */
        public final C40252e invoke(CasServiceInfoEntity casServiceInfoEntity) {
            C41536l.m120489i(casServiceInfoEntity, "p0");
            return ((C38793a) this.receiver).mo92492g(casServiceInfoEntity);
        }
    }

    /* renamed from: us0.o$i */
    static final class C39094i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39085o f93240d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39094i(C39085o oVar) {
            super(1);
            this.f93240d = oVar;
        }

        /* renamed from: a */
        public final void mo92765a(C40252e eVar) {
            this.f93240d.f93234k = eVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92765a((C40252e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: us0.o$j */
    static final class C39095j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39085o f93241d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39095j(C39085o oVar) {
            super(1);
            this.f93241d = oVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f93241d.f93233j.set(true);
        }
    }

    /* renamed from: us0.o$k */
    static final class C39096k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39085o f93242d;

        /* renamed from: e */
        final /* synthetic */ String f93243e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39096k(C39085o oVar, String str) {
            super(1);
            this.f93242d = oVar;
            this.f93243e = str;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            List b = this.f93242d.f93229f.mo92496b(list);
            C39085o oVar = this.f93242d;
            oVar.f93232i.put(this.f93243e, b);
            return b;
        }
    }

    /* renamed from: us0.o$l */
    /* synthetic */ class C39097l extends C41535k implements C43075l {
        C39097l(Object obj) {
            super(1, obj, C38793a.class, "transform", "transform(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C38793a) this.receiver).mo92487b(list);
        }
    }

    /* renamed from: us0.o$m */
    /* synthetic */ class C39098m extends C41535k implements C43075l {
        C39098m(Object obj) {
            super(1, obj, C38794b.class, "transform", "transform(Lge/bog/mobilebank/loyaltyandbonusprograms/data/entity/OpenMoneyBoxResultEntity;)Lge/bog/mobilebank/loyaltyandbonusprograms/domain/model/piggybank/OpenMoneyBoxResult;", 0);
        }

        /* renamed from: b */
        public final C31064a invoke(OpenMoneyBoxResultEntity openMoneyBoxResultEntity) {
            C41536l.m120489i(openMoneyBoxResultEntity, "p0");
            return ((C38794b) this.receiver).mo92495a(openMoneyBoxResultEntity);
        }
    }

    public C39085o(C38526a aVar, C27640a aVar2, C38794b bVar, C38793a aVar3, C26116a aVar4) {
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(aVar2, "bonusesMapper");
        C41536l.m120489i(bVar, "moneyBoxMapper");
        C41536l.m120489i(aVar3, "casMapper");
        C41536l.m120489i(aVar4, "preContractEntityMapper");
        this.f93227d = aVar;
        this.f93228e = aVar2;
        this.f93229f = bVar;
        this.f93230g = aVar3;
        this.f93231h = aVar4;
        C40765a i1 = C40765a.m118199i1(m114072z4());
        C41536l.m120488h(i1, "createDefault(getCasServiceInfoObservable())");
        this.f93235l = i1;
    }

    /* access modifiers changed from: private */
    /* renamed from: A4 */
    public static final C40252e m114041A4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40252e) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: B4 */
    public static final void m114042B4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: C4 */
    public static final void m114043C4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: D4 */
    public static final List m114044D4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: E4 */
    public static final List m114045E4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: F4 */
    public static final C31064a m114046F4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C31064a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: s4 */
    public static final List m114065s4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: t4 */
    public static final List m114066t4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: u4 */
    public static final C40253f m114067u4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40253f) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: v4 */
    public static final C40253f m114068v4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40253f) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: w4 */
    public static final C40754t m114069w4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: x4 */
    public static final List m114070x4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: y4 */
    public static final C25950a m114071y4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25950a) lVar.invoke(obj);
    }

    /* renamed from: z4 */
    private final C40749p m114072z4() {
        return this.f93227d.mo92102e().mo95062A(new C39073c(new C39093h(this.f93230g))).mo95084m(new C39074d(new C39094i(this))).mo95082k(new C39075e(new C39095j(this))).mo95075O().mo95021g();
    }

    /* renamed from: K */
    public C40762x mo71400K() {
        C40762x A = this.f93227d.mo92093K().mo95062A(new C39076f(new C39086a(this.f93228e)));
        C41536l.m120488h(A, "service.getAvailableCasA…bonusesMapper::transform)");
        return A;
    }

    /* renamed from: L */
    public C40762x mo71401L(Long l, String str, String str2, String str3, String str4) {
        C40762x A = this.f93227d.mo92094L(l, str, str2, str3, str4).mo95062A(new C39084n(new C39098m(this.f93229f)));
        C41536l.m120488h(A, "service.openMoneyBox(cus…oneyBoxMapper::transform)");
        return A;
    }

    /* renamed from: O */
    public C40734b mo71402O(long j, long j2, Long l) {
        return this.f93227d.mo92095O(j, j2, l);
    }

    /* renamed from: Q */
    public C40762x mo71403Q(long j) {
        C40762x A = this.f93227d.mo92096Q(j).mo95062A(new C39081k(new C39091f(this)));
        C41536l.m120488h(A, "override fun getCasHisto…p(casMapper::transform) }");
        return A;
    }

    /* renamed from: R0 */
    public C40734b mo71404R0(long j, long j2, String str, String str2) {
        C41536l.m120489i(str, "startDate");
        C41536l.m120489i(str2, "endDate");
        return this.f93227d.mo92106h(j, j2, str, str2);
    }

    /* renamed from: X1 */
    public C40734b mo71405X1(long j) {
        return this.f93227d.mo92100c(Long.valueOf(j));
    }

    /* renamed from: Y */
    public C40762x mo71406Y(long j, String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "newCas");
        C41536l.m120489i(str2, "acctKeys");
        C41536l.m120489i(str3, "amount");
        C40762x A = this.f93227d.mo92097Y(j, str, str2, str3, str4, str5).mo95062A(new C39078h(new C39092g(this.f93231h)));
        C41536l.m120488h(A, "service.getCasPreContrac…tEntityMapper::transform)");
        return A;
    }

    /* renamed from: Y1 */
    public C40762x mo71407Y1() {
        C40762x A = this.f93227d.mo92103f().mo95062A(new C39082l(new C39097l(this.f93230g)));
        C41536l.m120488h(A, "service.getCasPausePerio…map(casMapper::transform)");
        return A;
    }

    public void clean() {
        this.f93234k = null;
        this.f93233j.set(false);
        this.f93232i.clear();
        C40765a i1 = C40765a.m118199i1(m114072z4());
        C41536l.m120488h(i1, "createDefault(getCasServiceInfoObservable())");
        this.f93235l = i1;
    }

    /* renamed from: f3 */
    public C40762x mo71408f3(long j, boolean z) {
        C40762x A = mo71410k1(z).mo94996P().mo95062A(new C39080j(new C39088c(j)));
        C41536l.m120488h(A, "clientServiceId: Long,\n …tFoundException\n        }");
        return A;
    }

    /* renamed from: g0 */
    public C40734b mo71409g0(long j, String str, double d, String str2, String str3) {
        C41536l.m120489i(str, "clientServiceId");
        C41536l.m120489i(str2, "ccy");
        String str4 = str3;
        C41536l.m120489i(str4, "acctKeys");
        return this.f93227d.mo92105g0(j, str, d, str2, str4);
    }

    /* renamed from: k1 */
    public C40749p mo71410k1(boolean z) {
        if (z || this.f93234k == null || this.f93233j.compareAndSet(true, false)) {
            mo71413o2();
        }
        C40749p L0 = this.f93235l.mo94989L0(new C39072b(C39090e.f93238d));
        C41536l.m120488h(L0, "casServiceInfoSubject.switchMap { it }");
        return L0;
    }

    /* renamed from: l */
    public C40762x mo71411l() {
        C40762x A = this.f93227d.mo92109l().mo95062A(new C39077g(new C39087b(this.f93228e)));
        C41536l.m120488h(A, "service.getCasAvailableD…transformDepositAccounts)");
        return A;
    }

    /* renamed from: l2 */
    public C40762x mo71412l2(long j, boolean z) {
        C40762x A = mo71410k1(z).mo94996P().mo95062A(new C39083m(new C39089d(j)));
        C41536l.m120488h(A, "depositAgreeKey: Long,\n …tFoundException\n        }");
        return A;
    }

    /* renamed from: o2 */
    public void mo71413o2() {
        this.f93235l.onNext(m114072z4());
    }

    /* renamed from: r */
    public C40734b mo71414r(long j, String str, String str2, String str3, Long l) {
        C41536l.m120489i(str, "ccy");
        C41536l.m120489i(str2, "amount");
        C41536l.m120489i(str3, "acctKeys");
        return this.f93227d.mo92110r(j, str, str2, str3, l);
    }

    /* renamed from: x2 */
    public C40734b mo71415x2(long j, long j2) {
        return this.f93227d.mo92101d(j, j2);
    }

    /* renamed from: z3 */
    public C40762x mo71416z3(String str) {
        C40762x xVar;
        C41536l.m120489i(str, "agreeType");
        List list = (List) this.f93232i.get(str);
        if (list != null) {
            xVar = C40762x.m118162z(list);
        } else {
            xVar = null;
        }
        if (xVar != null) {
            return xVar;
        }
        C40762x A = this.f93227d.mo92104g(str).mo95062A(new C39079i(new C39096k(this, str)));
        C41536l.m120488h(A, "override fun getMoneyBox…          }\n            }");
        return A;
    }
}
