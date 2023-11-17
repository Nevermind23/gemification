package p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41232r;
import he1.C41233s;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;
import we0.C29323b;
import we0.C29341j0;
import xe0.C29759q;
import xe0.C29760r;
import xg0.C29767a;
import xg0.C29768b;
import xg0.C29769c;
import xg0.C29770d;
import xg0.C29771e;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchListDetailsViewModel$ViewModel */
public final class GTWatchListDetailsViewModel$ViewModel extends C21481a implements C29767a, C29768b {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C29341j0 f62274d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C29323b f62275e;

    /* renamed from: f */
    private final C29767a f62276f = this;

    /* renamed from: g */
    private final C29768b f62277g = this;

    /* renamed from: h */
    private int f62278h;

    /* renamed from: i */
    private final C40767b f62279i;

    /* renamed from: j */
    private final C1644x f62280j;

    /* renamed from: k */
    private final C40767b f62281k;

    /* renamed from: l */
    private final C1644x f62282l;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchListDetailsViewModel$ViewModel$a */
    static final class C23985a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTWatchListDetailsViewModel$ViewModel f62283d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23985a(GTWatchListDetailsViewModel$ViewModel gTWatchListDetailsViewModel$ViewModel) {
            super(1);
            this.f62283d = gTWatchListDetailsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            int intValue = ((Number) mVar.mo95676b()).intValue();
            C40749p O = this.f62283d.f62274d.mo69195a((BigDecimal) mVar.mo95675a()).mo95075O();
            C41536l.m120488h(O, "getWatchListSymbolsUseCa…          .toObservable()");
            return C31270e.m92879h(O, intValue);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchListDetailsViewModel$ViewModel$b */
    static final class C23986b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTWatchListDetailsViewModel$ViewModel f62284d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23986b(GTWatchListDetailsViewModel$ViewModel gTWatchListDetailsViewModel$ViewModel) {
            super(1);
            this.f62284d = gTWatchListDetailsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C41232r rVar) {
            C41536l.m120489i(rVar, "<name for destructuring parameter 0>");
            String str = (String) rVar.mo95688a();
            List list = (List) rVar.mo95689b();
            List list2 = (List) rVar.mo95690c();
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (!(!list2.isEmpty())) {
                list2 = null;
            }
            C40749p O = this.f62284d.f62275e.mo69179a(str, list, list2).mo94893M(C41238w.f97225a).mo95075O();
            C41536l.m120488h(O, "changeSymbolWatchListsUs…          .toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchListDetailsViewModel$ViewModel$c */
    static final class C23987c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTWatchListDetailsViewModel$ViewModel f62285d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23987c(GTWatchListDetailsViewModel$ViewModel gTWatchListDetailsViewModel$ViewModel) {
            super(1);
            this.f62285d = gTWatchListDetailsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo60985a(C31128a aVar) {
            this.f62285d.mo60974U().mo4823o(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60985a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchListDetailsViewModel$ViewModel$d */
    public /* synthetic */ class C23988d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62286a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                xe0.q[] r0 = xe0.C29759q.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xe0.q r1 = xe0.C29759q.TO_ADD     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                xe0.q r1 = xe0.C29759q.TO_REMOVE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f62286a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchListDetailsViewModel$ViewModel.C23988d.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GTWatchListDetailsViewModel$ViewModel(C29341j0 j0Var, C29323b bVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(j0Var, "getWatchListSymbolsUseCase");
        C41536l.m120489i(bVar, "changeSymbolWatchListsUseCase");
        this.f62274d = j0Var;
        this.f62275e = bVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Pair<BigDecimal, Int>>()");
        this.f62279i = h1;
        this.f62280j = new C1644x();
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<Triple<String, Li…al>, List<BigDecimal>>>()");
        this.f62281k = h12;
        this.f62282l = new C1644x();
        C40749p L0 = h1.mo94989L0(new C29769c(new C23985a(this)));
        C41536l.m120488h(L0, "symbolsSubject.switchMap…ervable(rc)\n            }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(L0), mo60978nl()));
        C40749p L02 = h12.mo94989L0(new C29770d(new C23986b(this)));
        C41536l.m120488h(L02, "changeSymbolWatchListsSu…le(RC_INIT)\n            }");
        C41205b F0 = C32343x.m95413R0(L02).mo94981F0(new C29771e(new C23987c(this)));
        C41536l.m120488h(F0, "changeSymbolWatchListsSu…lue(it)\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final C40754t m77382gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final C40754t m77383hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final void m77384iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Ai */
    public int mo60971Ai() {
        return this.f62278h;
    }

    /* renamed from: Gm */
    public void mo60972Gm(BigDecimal bigDecimal, int i) {
        C41536l.m120489i(bigDecimal, "watchListId");
        this.f62279i.onNext(C41233s.m119492a(bigDecimal, Integer.valueOf(i)));
    }

    /* renamed from: Qj */
    public void mo60973Qj(int i) {
        this.f62278h = i;
    }

    /* renamed from: a8 */
    public void mo60975a8(BigDecimal bigDecimal, String str, C29759q qVar) {
        C41536l.m120489i(bigDecimal, "watchListId");
        C41536l.m120489i(str, "symbol");
        C41536l.m120489i(qVar, "state");
        int i = C23988d.f62286a[qVar.ordinal()];
        if (i == 1) {
            this.f62281k.onNext(new C41232r(str, C41341q.m119907j(), C41339p.m119900e(bigDecimal)));
        } else if (i == 2) {
            this.f62281k.onNext(new C41232r(str, C41339p.m119900e(bigDecimal), C41341q.m119907j()));
        }
    }

    /* renamed from: lw */
    public C1644x mo60974U() {
        return this.f62282l;
    }

    /* renamed from: mw */
    public final C29767a mo60977mw() {
        return this.f62276f;
    }

    /* renamed from: nw */
    public final C29768b mo60979nw() {
        return this.f62277g;
    }

    /* renamed from: ow */
    public C1644x mo60978nl() {
        return this.f62280j;
    }

    /* renamed from: vp */
    public void mo60981vp(List list) {
        C29759q qVar;
        C41536l.m120489i(list, "symbols");
        int size = list.size();
        int Ai = mo60971Ai();
        boolean z = false;
        if (Ai >= 0 && Ai < size) {
            z = true;
        }
        if (z) {
            C29760r rVar = (C29760r) list.get(mo60971Ai());
            int i = C23988d.f62286a[rVar.mo69881e().ordinal()];
            if (i == 1) {
                qVar = C29759q.TO_REMOVE;
            } else if (i == 2) {
                qVar = C29759q.TO_ADD;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            rVar.mo69884g(qVar);
        }
    }

    /* renamed from: wv */
    public void mo60982wv(String str, List list, List list2) {
        C41536l.m120489i(str, "symbol");
        C41536l.m120489i(list, "removeWatchListIds");
        C41536l.m120489i(list2, "addedWatchListIds");
        this.f62281k.onNext(new C41232r(str, list, list2));
    }
}
