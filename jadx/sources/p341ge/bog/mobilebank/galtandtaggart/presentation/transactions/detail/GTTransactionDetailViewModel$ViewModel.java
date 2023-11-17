package p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.detail;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import he1.C41238w;
import jf0.C25433a;
import jf0.C25436d;
import jf0.C25437e;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import qg0.C27799f;
import qg0.C27800g;
import qg0.C27801h;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.detail.GTTransactionDetailViewModel$ViewModel */
public final class GTTransactionDetailViewModel$ViewModel extends C21481a implements C27799f, C27800g {

    /* renamed from: d */
    private final C25437e f62211d;

    /* renamed from: e */
    private final C25436d f62212e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C25433a f62213f;

    /* renamed from: g */
    private final C27800g f62214g = this;

    /* renamed from: h */
    private final C27799f f62215h = this;

    /* renamed from: i */
    private final C40767b f62216i;

    /* renamed from: j */
    private final C1644x f62217j;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.detail.GTTransactionDetailViewModel$ViewModel$a */
    static final class C23958a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTTransactionDetailViewModel$ViewModel f62218d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.detail.GTTransactionDetailViewModel$ViewModel$a$a */
        static final class C23959a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C23959a f62219d = new C23959a();

            C23959a() {
                super(1);
            }

            /* renamed from: a */
            public final C31128a invoke(Throwable th) {
                C41536l.m120489i(th, "error");
                return new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23958a(GTTransactionDetailViewModel$ViewModel gTTransactionDetailViewModel$ViewModel) {
            super(1);
            this.f62218d = gTTransactionDetailViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C31128a m77300c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C31128a) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "orderId");
            return this.f62218d.f62213f.mo64017a(str).mo94893M(new C31128a.C31131c(C41238w.f97225a, 0, 2, (DefaultConstructorMarker) null)).mo95075O().mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null)).mo95035t0(new C23960a(C23959a.f62219d));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GTTransactionDetailViewModel$ViewModel(C25437e eVar, C25436d dVar, C25433a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(eVar, "getTransactionWithOrderIdUseCase");
        C41536l.m120489i(dVar, "getTransactionWithFinTranIdUseCase");
        C41536l.m120489i(aVar, "cancelTransactionOrderUseCase");
        this.f62211d = eVar;
        this.f62212e = dVar;
        this.f62213f = aVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<String>()");
        this.f62216i = h1;
        this.f62217j = new C1644x();
        C40749p L0 = h1.mo94989L0(new C27801h(new C23958a(this)));
        C41536l.m120488h(L0, "cancelOrderSubject.switc…          }\n            }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(L0), mo60922H9()));
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m77292ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: gw */
    public C1644x mo60922H9() {
        return this.f62217j;
    }

    /* renamed from: hw */
    public final C27799f mo60924hw() {
        return this.f62215h;
    }

    /* renamed from: iw */
    public final C27800g mo60925iw() {
        return this.f62214g;
    }

    /* renamed from: s1 */
    public void mo60926s1(String str) {
        C41536l.m120489i(str, "orderId");
        this.f62216i.onNext(str);
    }
}
