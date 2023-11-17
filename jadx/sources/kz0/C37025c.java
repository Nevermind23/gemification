package kz0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32286a1;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import iu0.C36546y;
import iy0.C36590e;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz0.C37040h;
import m41.C37223a;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.shareddomain.model.cards.CardInsSecCardModel;
import q31.C38122f;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: kz0.c */
public final class C37025c extends C37042i {

    /* renamed from: J */
    public static final C37026a f89170J = new C37026a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private C36590e f89171G;

    /* renamed from: H */
    public C37040h.C37041a f89172H;

    /* renamed from: I */
    private final C41217g f89173I;

    /* renamed from: kz0.c$a */
    public static final class C37026a {
        private C37026a() {
        }

        public /* synthetic */ C37026a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C37025c mo89950a(List list) {
            C41536l.m120489i(list, "cards");
            C37025c cVar = new C37025c();
            cVar.setArguments(C0908e.m3336b(C41233s.m119492a("PRODUCT_ARG", list)));
            return cVar;
        }
    }

    /* renamed from: kz0.c$b */
    static final class C37027b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37025c f89174d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37027b(C37025c cVar) {
            super(1);
            this.f89174d = cVar;
        }

        /* renamed from: a */
        public final void mo89951a(List list) {
            RecyclerView recyclerView = this.f89174d.m109541g2().f88178e;
            C41536l.m120488h(list, "it");
            recyclerView.setAdapter(new C37023b(list, this.f89174d.m109542h2().mo89960ew()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89951a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: kz0.c$c */
    static final class C37028c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37025c f89175d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37028c(C37025c cVar) {
            super(1);
            this.f89175d = cVar;
        }

        /* renamed from: a */
        public final void mo89952a(C37223a aVar) {
            CardInsSecCardModel cardInsSecCardModel = (CardInsSecCardModel) aVar.mo90296a();
            if (cardInsSecCardModel != null) {
                C37025c cVar = this.f89175d;
                cVar.m109543j2(cardInsSecCardModel);
                cVar.mo4577k1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89952a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: kz0.c$d */
    static final class C37029d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f89176a;

        C37029d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f89176a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f89176a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f89176a.invoke(obj);
        }
    }

    /* renamed from: kz0.c$e */
    public static final class C37030e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f89177d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37030e(Fragment fragment) {
            super(0);
            this.f89177d = fragment;
        }

        public final Fragment invoke() {
            return this.f89177d;
        }
    }

    /* renamed from: kz0.c$f */
    public static final class C37031f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f89178d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37031f(C43064a aVar) {
            super(0);
            this.f89178d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f89178d.invoke();
        }
    }

    /* renamed from: kz0.c$g */
    public static final class C37032g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f89179d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37032g(C41217g gVar) {
            super(0);
            this.f89179d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f89179d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: kz0.c$h */
    public static final class C37033h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f89180d;

        /* renamed from: e */
        final /* synthetic */ C41217g f89181e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37033h(C43064a aVar, C41217g gVar) {
            super(0);
            this.f89180d = aVar;
            this.f89181e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f89180d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f89181e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: kz0.c$i */
    static final class C37034i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C37025c f89182d;

        /* renamed from: kz0.c$i$a */
        static final class C37035a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C37025c f89183d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C37035a(C37025c cVar) {
                super(0);
                this.f89183d = cVar;
            }

            /* renamed from: b */
            public final C37040h invoke() {
                List list;
                C37040h.C37041a i2 = this.f89183d.mo89949i2();
                Bundle arguments = this.f89183d.getArguments();
                if (arguments != null) {
                    list = arguments.getParcelableArrayList("PRODUCT_ARG");
                } else {
                    list = null;
                }
                if (list == null) {
                    list = C41341q.m119907j();
                }
                return i2.mo32789a(list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37034i(C37025c cVar) {
            super(0);
            this.f89182d = cVar;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C37035a(this.f89182d));
        }
    }

    public C37025c() {
        C37034i iVar = new C37034i(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C37031f(new C37030e(this)));
        this.f89173I = C1514j0.m5374c(this, C41520a0.m120436b(C37040h.class), new C37032g(a), new C37033h((C43064a) null, a), iVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public final C36590e m109541g2() {
        C36590e eVar = this.f89171G;
        C41536l.m120486f(eVar);
        return eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public final C37040h m109542h2() {
        return (C37040h) this.f89173I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final void m109543j2(CardInsSecCardModel cardInsSecCardModel) {
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38122f c = C38125h.m112238c(requireContext);
        long d = cardInsSecCardModel.mo55706d();
        Context requireContext2 = requireContext();
        C41536l.m120488h(requireContext2, "requireContext()");
        c.mo91624q(d, requireContext2);
    }

    private final void observeData() {
        m109542h2().mo89961fw().mo89958s().mo4819k(getViewLifecycleOwner(), new C37029d(new C37027b(this)));
        m109542h2().mo89961fw().mo89957o().mo4819k(getViewLifecycleOwner(), new C37029d(new C37028c(this)));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f89171G = C36590e.m108487d(layoutInflater, viewGroup, true);
    }

    /* renamed from: b */
    public void mo26371b() {
        super.mo26371b();
        C36546y.m108282F().mo27152s("accounts_page", "", "card_insurance_offer_close_click");
    }

    /* renamed from: i2 */
    public final C37040h.C37041a mo89949i2() {
        C37040h.C37041a aVar = this.f89172H;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f89171G = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26370a2(C32343x.m95388F("rb.card.protection.action.sheet.title", new Object[0]));
        observeData();
    }
}
