package p341ge.bog.mobilebank.wishcampaign.presentation.viewmodel;

import af1.C40303i;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import he1.C41238w;
import j31.C36725a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import l11.C37062d;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import r91.C38318a;
import s91.C38462a;
import ue1.C43075l;
import x91.C39831a;
import y91.C40036a;
import y91.C40037b;
import y91.C40039d;
import y91.C40040e;
import z91.C40212a;
import z91.C40213b;
import z91.C40214c;
import z91.C40215d;

/* renamed from: ge.bog.mobilebank.wishcampaign.presentation.viewmodel.WishCampaignViewModel$ViewModel */
public final class WishCampaignViewModel$ViewModel extends C21481a implements C40212a, C40213b {

    /* renamed from: s */
    static final /* synthetic */ C40303i[] f86864s = {C41520a0.m120439e(new C41539o(WishCampaignViewModel$ViewModel.class, "backgroundList", "getBackgroundList()Ljava/util/List;", 0))};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C37062d f86865d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C38318a f86866e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C39831a f86867f;

    /* renamed from: g */
    private final C40212a f86868g = this;

    /* renamed from: h */
    private final C40213b f86869h = this;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C40039d f86870i;

    /* renamed from: j */
    private final C41555e f86871j;

    /* renamed from: k */
    private final C1644x f86872k;

    /* renamed from: l */
    private final C1644x f86873l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1644x f86874m;

    /* renamed from: n */
    private final C1644x f86875n;

    /* renamed from: o */
    private final C1644x f86876o;

    /* renamed from: p */
    private final C1644x f86877p;

    /* renamed from: q */
    private final C1644x f86878q;

    /* renamed from: r */
    private final C40767b f86879r;

    /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.viewmodel.WishCampaignViewModel$ViewModel$a */
    public static final class C35917a extends C41553c {

        /* renamed from: a */
        final /* synthetic */ WishCampaignViewModel$ViewModel f86880a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35917a(Object obj, WishCampaignViewModel$ViewModel wishCampaignViewModel$ViewModel) {
            super(obj);
            this.f86880a = wishCampaignViewModel$ViewModel;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            List list = (List) obj;
            this.f86880a.f86874m.mo4823o((List) obj2);
        }
    }

    /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.viewmodel.WishCampaignViewModel$ViewModel$b */
    static final class C35918b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ WishCampaignViewModel$ViewModel f86881d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35918b(WishCampaignViewModel$ViewModel wishCampaignViewModel$ViewModel) {
            super(1);
            this.f86881d = wishCampaignViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            C36725a aVar;
            Object obj;
            C41536l.m120489i(wVar, "it");
            C37062d iw = this.f86881d.f86865d;
            Iterator it = this.f86881d.m106872nw().iterator();
            while (true) {
                aVar = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C40037b) obj).mo93891d()) {
                    break;
                }
            }
            C40037b bVar = (C40037b) obj;
            if (bVar != null) {
                aVar = bVar.mo93890c();
            }
            return C31270e.m92878g(iw.mo89978b(aVar), -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.viewmodel.WishCampaignViewModel$ViewModel$c */
    static final class C35919c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ WishCampaignViewModel$ViewModel f86882d;

        /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.viewmodel.WishCampaignViewModel$ViewModel$c$a */
        /* synthetic */ class C35920a extends C41535k implements C43075l {
            C35920a(Object obj) {
                super(1, obj, C39831a.class, "transform", "transform(Lge/bog/mobilebank/wishcampaign/domain/model/WishDetails;)Lge/bog/mobilebank/wishcampaign/presentation/model/WishCampaignDataUiModel;", 0);
            }

            /* renamed from: b */
            public final C40039d invoke(C38462a aVar) {
                C41536l.m120489i(aVar, "p0");
                return ((C39831a) this.receiver).mo93528b(aVar);
            }
        }

        /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.viewmodel.WishCampaignViewModel$ViewModel$c$b */
        static final class C35921b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ WishCampaignViewModel$ViewModel f86883d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35921b(WishCampaignViewModel$ViewModel wishCampaignViewModel$ViewModel) {
                super(1);
                this.f86883d = wishCampaignViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo88218a(C40039d dVar) {
                WishCampaignViewModel$ViewModel wishCampaignViewModel$ViewModel = this.f86883d;
                C41536l.m120488h(dVar, "it");
                wishCampaignViewModel$ViewModel.f86870i = dVar;
                WishCampaignViewModel$ViewModel wishCampaignViewModel$ViewModel2 = this.f86883d;
                C40039d gw = wishCampaignViewModel$ViewModel2.f86870i;
                if (gw == null) {
                    C41536l.m120506z("data");
                    gw = null;
                }
                wishCampaignViewModel$ViewModel2.m106873qw(gw.mo93899a());
                this.f86883d.mo88207j2();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo88218a((C40039d) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35919c(WishCampaignViewModel$ViewModel wishCampaignViewModel$ViewModel) {
            super(1);
            this.f86882d = wishCampaignViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final C40039d m106894d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C40039d) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m106895e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "rc");
            C40762x m = this.f86882d.f86866e.mo91865a().mo95062A(new C35922a(new C35920a(this.f86882d.f86867f))).mo95084m(new C35923b(new C35921b(this.f86882d)));
            C41536l.m120488h(m, "private fun subscribeToI…ndToLifecycle()\n        }");
            return C31270e.m92880i(m, num.intValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WishCampaignViewModel$ViewModel(C37062d dVar, C38318a aVar, C39831a aVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(dVar, "setPreLoginBackgroundUrl");
        C41536l.m120489i(aVar, "getWishCampaignDetails");
        C41536l.m120489i(aVar2, "wishCampaignUiMapper");
        this.f86865d = dVar;
        this.f86866e = aVar;
        this.f86867f = aVar2;
        C41551a aVar3 = C41551a.f97718a;
        this.f86871j = new C35917a(C41341q.m119907j(), this);
        this.f86872k = new C1644x();
        this.f86873l = new C1644x();
        this.f86874m = new C1644x();
        this.f86875n = new C1644x();
        this.f86876o = new C1644x();
        this.f86877p = new C1644x(Boolean.FALSE);
        this.f86878q = new C1644x();
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f86879r = h1;
        m106876tw();
        m106874rw();
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public final List m106872nw() {
        return (List) this.f86871j.getValue(this, f86864s[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public final void m106873qw(List list) {
        this.f86871j.setValue(this, f86864s[0], list);
    }

    /* renamed from: rw */
    private final void m106874rw() {
        C40749p L0 = this.f86879r.mo94989L0(new C40215d(new C35918b(this)));
        C41536l.m120488h(L0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f86878q));
    }

    /* access modifiers changed from: private */
    /* renamed from: sw */
    public static final C40754t m106875sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: tw */
    private final void m106876tw() {
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C40214c(new C35919c(this)));
        C41536l.m120488h(L0, "private fun subscribeToI…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f86873l));
    }

    /* access modifiers changed from: private */
    /* renamed from: uw */
    public static final C40754t m106877uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: A8 */
    public void mo88202A8() {
        C32343x.m95472o(this.f86879r);
    }

    /* renamed from: E9 */
    public void mo88203E9() {
        C37224b.m109962a(this.f86875n);
    }

    /* renamed from: Ip */
    public void mo88204Ip() {
        C40039d dVar = this.f86870i;
        if (dVar == null) {
            C41536l.m120506z("data");
            dVar = null;
        }
        C40040e c = dVar.mo93901c();
        if (c != null) {
            C37224b.m109965d(this.f86876o, c);
        }
    }

    /* renamed from: bh */
    public LiveData mo88205bh() {
        return this.f86878q;
    }

    /* renamed from: gd */
    public void mo88206gd(C40037b bVar) {
        boolean z;
        boolean z2;
        C41536l.m120489i(bVar, "background");
        List nw = m106872nw();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(nw, 10));
        Iterator it = nw.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            C40037b bVar2 = (C40037b) it.next();
            if (!C41536l.m120484d(bVar2.mo93890c(), bVar.mo93890c()) || bVar2.mo93891d()) {
                z2 = false;
            } else {
                z2 = true;
            }
            arrayList.add(C40037b.m116007b(bVar2, (C36725a) null, z2, (String) null, false, 13, (Object) null));
        }
        m106873qw(arrayList);
        C1644x xVar = this.f86877p;
        List nw2 = m106872nw();
        if (!(nw2 instanceof Collection) || !nw2.isEmpty()) {
            Iterator it2 = nw2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((C40037b) it2.next()).mo93891d()) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        xVar.mo4823o(Boolean.valueOf(z));
    }

    /* renamed from: j2 */
    public void mo88207j2() {
        C40036a aVar;
        C1644x xVar = this.f86872k;
        C40039d dVar = this.f86870i;
        if (dVar != null) {
            if (dVar == null) {
                C41536l.m120506z("data");
                dVar = null;
            }
            if (dVar.mo93902d().mo93912c()) {
                aVar = C40036a.DARK;
            } else {
                aVar = C40036a.LIGHT;
            }
        } else {
            aVar = C40036a.LOADING;
        }
        xVar.mo4823o(aVar);
    }

    /* renamed from: lc */
    public LiveData mo88208lc() {
        return this.f86874m;
    }

    /* renamed from: nd */
    public LiveData mo88209nd() {
        return this.f86876o;
    }

    /* renamed from: ow */
    public final C40212a mo88210ow() {
        return this.f86868g;
    }

    /* renamed from: pw */
    public final C40213b mo88211pw() {
        return this.f86869h;
    }

    /* renamed from: r1 */
    public LiveData mo88212r1() {
        return this.f86873l;
    }

    /* renamed from: tg */
    public LiveData mo88213tg() {
        return this.f86875n;
    }

    /* renamed from: u1 */
    public LiveData mo88214u1() {
        return this.f86872k;
    }
}
