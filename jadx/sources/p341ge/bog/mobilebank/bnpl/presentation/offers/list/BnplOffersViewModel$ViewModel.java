package p341ge.bog.mobilebank.bnpl.presentation.offers.list;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40765a;
import ee1.C40767b;
import gd1.C40992a;
import hd1.C41204a;
import he1.C41238w;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p354am.C10076c;
import p354am.C10077d;
import p354am.C10078e;
import p354am.C10079f;
import p354am.C10080g;
import p578ql.C17533f;
import p791iu.C25258b;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.list.BnplOffersViewModel$ViewModel */
public final class BnplOffersViewModel$ViewModel extends C21481a implements C10076c, C10077d {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C25258b f41258d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C17533f f41259e;

    /* renamed from: f */
    private final C10076c f41260f = this;

    /* renamed from: g */
    private final C10077d f41261g = this;

    /* renamed from: h */
    private final C1644x f41262h = new C1644x();

    /* renamed from: i */
    private final C1644x f41263i = new C1644x();

    /* renamed from: j */
    private final C40767b f41264j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C40765a f41265k;

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.list.BnplOffersViewModel$ViewModel$a */
    static final class C13912a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplOffersViewModel$ViewModel f41266d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13912a(BnplOffersViewModel$ViewModel bnplOffersViewModel$ViewModel) {
            super(1);
            this.f41266d = bnplOffersViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            return C31270e.m92880i(C25258b.m80363c(this.f41266d.f41258d, false, 1, (Object) null), -1).mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null)).mo95027o0(C40992a.m118827a());
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.list.BnplOffersViewModel$ViewModel$b */
    static final class C13913b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplOffersViewModel$ViewModel f41267d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13913b(BnplOffersViewModel$ViewModel bnplOffersViewModel$ViewModel) {
            super(1);
            this.f41267d = bnplOffersViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "it");
            return C31270e.m92880i(C17533f.m61062b(this.f41267d.f41259e, (Boolean) null, str, (Long) null, 5, (Object) null), -1).mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null)).mo95027o0(C40992a.m118827a());
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.list.BnplOffersViewModel$ViewModel$c */
    static final class C13914c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplOffersViewModel$ViewModel f41268d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13914c(BnplOffersViewModel$ViewModel bnplOffersViewModel$ViewModel) {
            super(1);
            this.f41268d = bnplOffersViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo38333a(String str) {
            this.f41268d.f41265k.onNext(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38333a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BnplOffersViewModel$ViewModel(C25258b bVar, C17533f fVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getLimit");
        C41536l.m120489i(fVar, "getOffers");
        this.f41258d = bVar;
        this.f41259e = fVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<String>()");
        this.f41264j = h1;
        C40765a i1 = C40765a.m118199i1("");
        C41536l.m120488h(i1, "createDefault(\"\")");
        this.f41265k = i1;
        m51832jw();
        m51834lw();
        m51836nw();
    }

    /* renamed from: jw */
    private final void m51832jw() {
        C40749p L0 = C40749p.m118047l0(onRefresh(), onInit()).mo94989L0(new C10078e(new C13912a(this)));
        C41536l.m120488h(L0, "private fun configureLim…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f41263i));
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final C40754t m51833kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: lw */
    private final void m51834lw() {
        C40749p L0 = this.f41265k.mo94989L0(new C10080g(new C13913b(this)));
        C41536l.m120488h(L0, "private fun configureOff…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f41262h));
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final C40754t m51835mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: nw */
    private final void m51836nw() {
        this.f41264j.mo95032s(750, TimeUnit.MILLISECONDS).mo95043y().mo95027o0(C40992a.m118827a()).mo94981F0(new C10079f(new C13914c(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final void m51837ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: L1 */
    public LiveData mo26533L1() {
        return this.f41263i;
    }

    /* renamed from: Y1 */
    public void mo26532Y1(String str) {
        C41536l.m120489i(str, "searchWord");
        if (str.length() >= 2) {
            this.f41264j.onNext(str);
        } else {
            this.f41264j.onNext("");
        }
    }

    /* renamed from: pw */
    public final C10076c mo38329pw() {
        return this.f41260f;
    }

    /* renamed from: qw */
    public final C10077d mo38330qw() {
        return this.f41261g;
    }

    /* renamed from: x */
    public LiveData mo26534x() {
        return this.f41262h;
    }
}
