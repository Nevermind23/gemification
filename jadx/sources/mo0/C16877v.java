package mo0;

import android.os.Bundle;
import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ao0.C10119a;
import ao0.C10124e;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import iu0.C36546y;
import java.util.List;
import ko0.C16520b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.shared.model.LifestyleOffersFilterResultData;
import p380ck.C10464h;
import ue1.C43075l;
import zn0.C19095i;

/* renamed from: mo0.v */
public final class C16877v extends C21481a implements C16873r, C16874s {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C19095i f47178d;

    /* renamed from: e */
    private final C16873r f47179e = this;

    /* renamed from: f */
    private final C16874s f47180f = this;

    /* renamed from: g */
    private final C1644x f47181g = new C1644x();

    /* renamed from: h */
    private final C1644x f47182h = new C1644x();

    /* renamed from: i */
    private final C1644x f47183i = new C1644x();

    /* renamed from: mo0.v$a */
    static final class C16878a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C16877v f47184d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16878a(C16877v vVar) {
            super(1);
            this.f47184d = vVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40749p O = this.f47184d.f47178d.mo47296d().mo95075O();
            C41536l.m120488h(O, "getLifestyleCategoriesAn…          .toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: mo0.v$b */
    static final class C16879b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C16877v f47185d;

        /* renamed from: e */
        final /* synthetic */ LifestyleOffersFilterResultData f47186e;

        /* renamed from: mo0.v$b$a */
        static final class C16880a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C16877v f47187d;

            /* renamed from: e */
            final /* synthetic */ LifestyleOffersFilterResultData f47188e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C16880a(C16877v vVar, LifestyleOffersFilterResultData lifestyleOffersFilterResultData) {
                super(1);
                this.f47187d = vVar;
                this.f47188e = lifestyleOffersFilterResultData;
            }

            /* renamed from: a */
            public final void mo44018a(C10124e eVar) {
                this.f47187d.mo44007Dm().mo4823o(new C16520b(this.f47188e));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo44018a((C10124e) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16879b(C16877v vVar, LifestyleOffersFilterResultData lifestyleOffersFilterResultData) {
            super(1);
            this.f47185d = vVar;
            this.f47186e = lifestyleOffersFilterResultData;
        }

        /* renamed from: a */
        public final void mo44017a(C31128a aVar) {
            this.f47185d.mo44008Ge().mo4823o(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C16880a(this.f47185d, this.f47186e), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo44017a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: mo0.v$c */
    public interface C16881c {
        /* renamed from: a */
        C16877v mo32568a(LifestyleOffersFilterResultData lifestyleOffersFilterResultData);
    }

    /* renamed from: mo0.v$d */
    static final class C16882d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C16882d f47189d = new C16882d();

        C16882d() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C16520b bVar) {
            return Boolean.valueOf(bVar.mo43670d());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16877v(LifestyleOffersFilterResultData lifestyleOffersFilterResultData, C19095i iVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(lifestyleOffersFilterResultData, "filterData");
        C41536l.m120489i(iVar, "getLifestyleCategoriesAndBadges");
        this.f47178d = iVar;
        C41205b F0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C16875t(new C16878a(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C16876u(new C16879b(this, lifestyleOffersFilterResultData)));
        C41536l.m120488h(F0, "merge(onInit(), onRefres…      }\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m59422fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m59423gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: nw */
    private final void m59425nw() {
        C1644x mw = mo44010x7();
        Object f = mo44007Dm().mo4814f();
        C41536l.m120486f(f);
        mw.mo4823o(C32343x.m95466m(m59426ow((C16520b) f)));
    }

    /* renamed from: ow */
    private final LifestyleOffersFilterResultData m59426ow(C16520b bVar) {
        return new LifestyleOffersFilterResultData(bVar.mo43669c(), bVar.mo43668b());
    }

    /* renamed from: Mm */
    public void mo44002Mm(C10119a aVar) {
        List list;
        C41536l.m120489i(aVar, "benefName");
        C16520b bVar = (C16520b) mo44007Dm().mo4814f();
        if (bVar != null) {
            list = bVar.mo43668b();
        } else {
            list = null;
        }
        C41536l.m120486f(list);
        if (list.contains(aVar)) {
            list.remove(aVar);
        } else {
            list.add(aVar);
        }
        mo44007Dm().mo4826r(mo44007Dm().mo4814f());
    }

    /* renamed from: Wf */
    public void mo44003Wf(long j) {
        List list;
        C16520b bVar = (C16520b) mo44007Dm().mo4814f();
        if (bVar != null) {
            list = bVar.mo43669c();
        } else {
            list = null;
        }
        C41536l.m120486f(list);
        if (list.contains(Long.valueOf(j))) {
            list.remove(Long.valueOf(j));
        } else {
            list.add(Long.valueOf(j));
        }
        mo44007Dm().mo4826r(mo44007Dm().mo4814f());
    }

    /* renamed from: eq */
    public LiveData mo44009eq() {
        return C1607m0.m5655c(mo44007Dm(), C16882d.f47189d);
    }

    /* renamed from: iw */
    public C1644x mo44008Ge() {
        return this.f47181g;
    }

    /* renamed from: jw */
    public C1644x mo44007Dm() {
        return this.f47182h;
    }

    /* renamed from: kw */
    public final C16873r mo44013kw() {
        return this.f47179e;
    }

    /* renamed from: l */
    public void mo44004l() {
        C16520b bVar = (C16520b) mo44007Dm().mo4814f();
        boolean z = false;
        if (bVar != null && !bVar.mo43670d()) {
            z = true;
        }
        if (z) {
            m59425nw();
        } else {
            mo44010x7().mo4823o(C32343x.m95466m((Object) null));
        }
    }

    /* renamed from: lw */
    public final C16874s mo44014lw() {
        return this.f47180f;
    }

    /* renamed from: mw */
    public C1644x mo44010x7() {
        return this.f47183i;
    }

    /* renamed from: n5 */
    public void mo44005n5() {
        C16520b bVar = (C16520b) mo44007Dm().mo4814f();
        if (bVar != null) {
            bVar.mo43667a();
        }
        mo44007Dm().mo4826r(mo44007Dm().mo4814f());
    }

    /* renamed from: wc */
    public void mo44006wc() {
        C36546y.m108282F().mo27137H("life_style_offers", "open_offer_filter", String.valueOf(mo44007Dm().mo4814f()), (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
        m59425nw();
    }
}
