package p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.changename;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import gd1.C40992a;
import hd1.C41204a;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;
import vg0.C29069d;
import vg0.C29070e;
import vg0.C29071f;
import we0.C29325c;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.changename.GTChangeWatchListNameViewModel$ViewModel */
public final class GTChangeWatchListNameViewModel$ViewModel extends C21481a implements C29069d, C29070e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C29325c f62259d;

    /* renamed from: e */
    private final C29069d f62260e = this;

    /* renamed from: f */
    private final C29070e f62261f = this;

    /* renamed from: g */
    private final C40767b f62262g;

    /* renamed from: h */
    private final C1644x f62263h;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.changename.GTChangeWatchListNameViewModel$ViewModel$a */
    static final class C23980a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTChangeWatchListNameViewModel$ViewModel f62264d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.changename.GTChangeWatchListNameViewModel$ViewModel$a$a */
        static final class C23981a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C23981a f62265d = new C23981a();

            C23981a() {
                super(1);
            }

            /* renamed from: a */
            public final C31128a invoke(Throwable th) {
                C41536l.m120489i(th, "error");
                return new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23980a(GTChangeWatchListNameViewModel$ViewModel gTChangeWatchListNameViewModel$ViewModel) {
            super(1);
            this.f62264d = gTChangeWatchListNameViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C31128a m77364c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C31128a) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            return this.f62264d.f62259d.mo69181a((BigDecimal) mVar.mo95675a(), (String) mVar.mo95676b()).mo94893M(new C31128a.C31131c(C41238w.f97225a, 0, 2, (DefaultConstructorMarker) null)).mo95075O().mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null)).mo95035t0(new C23982a(C23981a.f62265d));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GTChangeWatchListNameViewModel$ViewModel(C29325c cVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(cVar, "changeWatchListNameUseCase");
        this.f62259d = cVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Pair<BigDecimal, String>>()");
        this.f62262g = h1;
        this.f62263h = new C1644x();
        C40749p o0 = h1.mo94989L0(new C29071f(new C23980a(this))).mo95027o0(C40992a.m118827a());
        C41536l.m120488h(o0, "changeWatchListNameSubje…dSchedulers.mainThread())");
        bindToLifecycle(C31270e.m92876e(o0, mo60960l4()));
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m77356ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: gw */
    public C1644x mo60960l4() {
        return this.f62263h;
    }

    /* renamed from: hw */
    public final C29069d mo60958hw() {
        return this.f62260e;
    }

    /* renamed from: iw */
    public final C29070e mo60959iw() {
        return this.f62261f;
    }

    /* renamed from: u0 */
    public void mo60961u0(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "id");
        C41536l.m120489i(str, "name");
        this.f62262g.onNext(C41233s.m119492a(bigDecimal, str));
    }
}
