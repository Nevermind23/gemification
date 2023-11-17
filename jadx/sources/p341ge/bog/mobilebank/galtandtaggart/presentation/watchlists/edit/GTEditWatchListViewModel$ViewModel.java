package p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.edit;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import gd1.C40992a;
import hd1.C41204a;
import he1.C41238w;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;
import we0.C29333g;
import yg0.C30050g;
import yg0.C30051h;
import yg0.C30052i;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.edit.GTEditWatchListViewModel$ViewModel */
public final class GTEditWatchListViewModel$ViewModel extends C21481a implements C30050g, C30051h {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C29333g f62318d;

    /* renamed from: e */
    private final C30050g f62319e = this;

    /* renamed from: f */
    private final C30051h f62320f = this;

    /* renamed from: g */
    private final C40767b f62321g;

    /* renamed from: h */
    private final C1644x f62322h;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.edit.GTEditWatchListViewModel$ViewModel$a */
    static final class C24011a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTEditWatchListViewModel$ViewModel f62323d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.edit.GTEditWatchListViewModel$ViewModel$a$a */
        static final class C24012a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C24012a f62324d = new C24012a();

            C24012a() {
                super(1);
            }

            /* renamed from: a */
            public final C31128a invoke(Throwable th) {
                C41536l.m120489i(th, "error");
                return new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24011a(GTEditWatchListViewModel$ViewModel gTEditWatchListViewModel$ViewModel) {
            super(1);
            this.f62323d = gTEditWatchListViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C31128a m77460c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C31128a) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(BigDecimal bigDecimal) {
            C41536l.m120489i(bigDecimal, "name");
            return this.f62323d.f62318d.mo69189a(bigDecimal).mo94893M(new C31128a.C31131c(C41238w.f97225a, 0, 2, (DefaultConstructorMarker) null)).mo95075O().mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null)).mo95035t0(new C24013a(C24012a.f62324d));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GTEditWatchListViewModel$ViewModel(C29333g gVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(gVar, "deleteWatchListUseCase");
        this.f62318d = gVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<BigDecimal>()");
        this.f62321g = h1;
        this.f62322h = new C1644x();
        C40749p o0 = h1.mo94989L0(new C30052i(new C24011a(this))).mo95027o0(C40992a.m118827a());
        C41536l.m120488h(o0, "deleteWatchListSubject.s…dSchedulers.mainThread())");
        bindToLifecycle(C31270e.m92876e(o0, mo61010ra()));
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m77452ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: H */
    public void mo61006H(BigDecimal bigDecimal) {
        C41536l.m120489i(bigDecimal, "id");
        this.f62321g.onNext(bigDecimal);
    }

    /* renamed from: gw */
    public C1644x mo61010ra() {
        return this.f62322h;
    }

    /* renamed from: hw */
    public final C30050g mo61008hw() {
        return this.f62319e;
    }

    /* renamed from: iw */
    public final C30051h mo61009iw() {
        return this.f62320f;
    }
}
