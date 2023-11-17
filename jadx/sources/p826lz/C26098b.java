package p826lz;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.recyclerview.widget.LinearLayoutManager;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import java.util.ArrayList;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.ratesactionsheet.RatesActionSheetViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.model.CcyRate;
import p341ge.bog.mobilebank.model.CcyRatesWrapper;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p366bk.C10328q;
import p366bk.C10329r;
import p90.C27313h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: lz.b */
public final class C26098b extends C26097a {

    /* renamed from: J */
    public static final C26099a f66210J = new C26099a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private C27313h f66211G;

    /* renamed from: H */
    private final C41217g f66212H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public final C26108c f66213I = new C26108c();

    /* renamed from: lz.b$a */
    public static final class C26099a {
        private C26099a() {
        }

        public /* synthetic */ C26099a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C26098b mo65019a() {
            return new C26098b();
        }
    }

    /* renamed from: lz.b$b */
    static final class C26100b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26098b f66214d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26100b(C26098b bVar) {
            super(1);
            this.f66214d = bVar;
        }

        /* renamed from: a */
        public final void mo65020a(CcyRatesWrapper ccyRatesWrapper) {
            C41536l.m120489i(ccyRatesWrapper, "ratesWrapper");
            this.f66214d.m81799g2().f68842f.setVisibility(0);
            C26108c d2 = this.f66214d.f66213I;
            CcyRate[] list = ccyRatesWrapper.getList();
            C41536l.m120488h(list, "ratesWrapper.list");
            d2.mo65025h((ArrayList) C41333m.m119787N(list, new ArrayList()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo65020a((CcyRatesWrapper) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: lz.b$c */
    static final class C26101c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26098b f66215d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26101c(C26098b bVar) {
            super(1);
            this.f66215d = bVar;
        }

        /* renamed from: a */
        public final void mo65021a(boolean z) {
            if (!z) {
                this.f66215d.m81801i2();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo65021a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: lz.b$d */
    static final class C26102d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26098b f66216d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26102d(C26098b bVar) {
            super(1);
            this.f66216d = bVar;
        }

        /* renamed from: a */
        public final void mo65022a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "error");
            if (this.f66216d.getActivity() instanceof C35388f2) {
                C1505h activity = this.f66216d.getActivity();
                C41536l.m120487g(activity, "null cannot be cast to non-null type ge.bog.mobilebank.ui.activities.RootActivity");
                ((C35388f2) activity).mo52674G1(aVar);
            }
            this.f66216d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo65022a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: lz.b$e */
    public static final class C26103e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f66217d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26103e(Fragment fragment) {
            super(0);
            this.f66217d = fragment;
        }

        public final Fragment invoke() {
            return this.f66217d;
        }
    }

    /* renamed from: lz.b$f */
    public static final class C26104f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f66218d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26104f(C43064a aVar) {
            super(0);
            this.f66218d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f66218d.invoke();
        }
    }

    /* renamed from: lz.b$g */
    public static final class C26105g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f66219d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26105g(C41217g gVar) {
            super(0);
            this.f66219d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f66219d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: lz.b$h */
    public static final class C26106h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f66220d;

        /* renamed from: e */
        final /* synthetic */ C41217g f66221e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26106h(C43064a aVar, C41217g gVar) {
            super(0);
            this.f66220d = aVar;
            this.f66221e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f66220d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f66221e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: lz.b$i */
    public static final class C26107i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f66222d;

        /* renamed from: e */
        final /* synthetic */ C41217g f66223e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26107i(Fragment fragment, C41217g gVar) {
            super(0);
            this.f66222d = fragment;
            this.f66223e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f66223e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f66222d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C26098b() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C26104f(new C26103e(this)));
        this.f66212H = C1514j0.m5374c(this, C41520a0.m120436b(RatesActionSheetViewModel.class), new C26105g(a), new C26106h((C43064a) null, a), new C26107i(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public final C27313h m81799g2() {
        C27313h hVar = this.f66211G;
        C41536l.m120486f(hVar);
        return hVar;
    }

    /* renamed from: h2 */
    private final RatesActionSheetViewModel m81800h2() {
        return (RatesActionSheetViewModel) this.f66212H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public final void m81801i2() {
        m81799g2().f68841e.setVisibility(8);
    }

    private final void observeData() {
        C21484c.m69411c(m81800h2().mo53217hw(), this, new C26100b(this), new C26101c(this), new C26102d(this));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f66211G = C27313h.m84559d(layoutInflater, viewGroup, true);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo4588y1(1, C10329r.RatesActionSheetStyle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        mo26370a2(getString(C10328q.common_text_ccy_rates));
        m81799g2().f68842f.setLayoutManager(new LinearLayoutManager(requireContext()));
        m81799g2().f68842f.setAdapter(this.f66213I);
        observeData();
        m81800h2().mo53218iw();
    }
}
