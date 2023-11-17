package p875qy;

import com.medallia.digital.mobilesdk.MedalliaDigital;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40765a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusWrapperEntity;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p865py.C27640a;
import p885ry.C28113a;
import p906ty.C28528f;
import p906ty.C28530h;
import ue1.C43075l;

/* renamed from: qy.c */
public final class C27872c implements C28113a {

    /* renamed from: d */
    private final IRetrofitService f71001d;

    /* renamed from: e */
    private final C27640a f71002e;

    /* renamed from: f */
    private C28530h f71003f;

    /* renamed from: g */
    private AtomicBoolean f71004g = new AtomicBoolean(false);

    /* renamed from: h */
    private C40765a f71005h;

    /* renamed from: qy.c$a */
    static final class C27873a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27872c f71006d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27873a(C27872c cVar) {
            super(1);
            this.f71006d = cVar;
        }

        /* renamed from: a */
        public final C28530h invoke(BonusWrapperEntity bonusWrapperEntity) {
            C41536l.m120489i(bonusWrapperEntity, "it");
            return this.f71006d.m86108f4(bonusWrapperEntity);
        }
    }

    /* renamed from: qy.c$b */
    static final class C27874b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C27874b f71007d = new C27874b();

        C27874b() {
            super(1);
        }

        /* renamed from: a */
        public final C40754t invoke(C40749p pVar) {
            C41536l.m120489i(pVar, "it");
            return pVar;
        }
    }

    public C27872c(IRetrofitService iRetrofitService, C27640a aVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "mapper");
        this.f71001d = iRetrofitService;
        this.f71002e = aVar;
        C40765a i1 = C40765a.m118199i1(m86105c4());
        C41536l.m120488h(i1, "createDefault(createBonusesObservable())");
        this.f71005h = i1;
    }

    /* renamed from: c4 */
    private final C40749p m86105c4() {
        return this.f71001d.getBonusesAndCashback("COLLECTOR_GET_BONUS_DETAILS_AND_CASHBACK").mo95062A(new C27870a(new C27873a(this))).mo95075O().mo95021g();
    }

    /* access modifiers changed from: private */
    /* renamed from: d4 */
    public static final C28530h m86106d4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C28530h) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: e4 */
    public static final C40754t m86107e4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: f4 */
    public final C28530h m86108f4(BonusWrapperEntity bonusWrapperEntity) {
        String f;
        C28530h j = this.f71002e.mo67186j(bonusWrapperEntity);
        this.f71003f = j;
        C28528f e = j.mo68239e();
        if (!(e == null || (f = e.mo68211f()) == null)) {
            MedalliaDigital.setCustomParameter("loyalty", f);
        }
        return j;
    }

    public void clean() {
        this.f71003f = null;
        this.f71004g = new AtomicBoolean(false);
        this.f71005h.onComplete();
        C40765a i1 = C40765a.m118199i1(m86105c4());
        C41536l.m120488h(i1, "createDefault(createBonusesObservable())");
        this.f71005h = i1;
    }

    /* renamed from: e3 */
    public void mo67401e3() {
        this.f71005h.onNext(m86105c4());
    }

    /* renamed from: w2 */
    public C40749p mo67402w2(boolean z) {
        if (this.f71004g.compareAndSet(true, false) || z) {
            mo67401e3();
        }
        C40749p L0 = this.f71005h.mo94989L0(new C27871b(C27874b.f71007d));
        C41536l.m120488h(L0, "bonusesSubject.switchMap { it }");
        return L0;
    }
}
