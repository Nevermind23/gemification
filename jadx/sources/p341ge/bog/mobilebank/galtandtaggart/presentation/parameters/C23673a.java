package p341ge.bog.mobilebank.galtandtaggart.presentation.parameters;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import g31.C32054a;
import g41.C32081a;
import gg0.C24712a;
import gg0.C24713b;
import he1.C41217g;
import ie0.C25190j;
import iu0.C36546y;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p349ah.C9860d;
import p380ck.C10463g;
import ue0.C28715c;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.a */
public final class C23673a extends C9860d {

    /* renamed from: D */
    public static final C23674a f61710D = new C23674a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C28715c f61711B;

    /* renamed from: C */
    private final C41217g f61712C = C1514j0.m5374c(this, C41520a0.m120436b(GTParametersViewModel$ViewModel.class), new C23675b(this), new C23676c((C43064a) null, this), new C23677d(this));

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.a$a */
    public static final class C23674a {
        private C23674a() {
        }

        public /* synthetic */ C23674a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C23673a mo60563a() {
            return new C23673a();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.a$b */
    public static final class C23675b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f61713d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23675b(Fragment fragment) {
            super(0);
            this.f61713d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f61713d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.a$c */
    public static final class C23676c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f61714d;

        /* renamed from: e */
        final /* synthetic */ Fragment f61715e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23676c(C43064a aVar, Fragment fragment) {
            super(0);
            this.f61714d = aVar;
            this.f61715e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f61714d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f61715e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.a$d */
    public static final class C23677d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f61716d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23677d(Fragment fragment) {
            super(0);
            this.f61716d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f61716d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: f2 */
    private final C28715c m76514f2() {
        C28715c cVar = this.f61711B;
        C41536l.m120486f(cVar);
        return cVar;
    }

    /* renamed from: g2 */
    private final GTParametersViewModel$ViewModel m76515g2() {
        return (GTParametersViewModel$ViewModel) this.f61712C.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m76516h2(C23673a aVar, View view) {
        C41536l.m120489i(aVar, "this$0");
        aVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m76517i2(C23673a aVar, View view) {
        C41536l.m120489i(aVar, "this$0");
        C32054a.C32065k kVar = C32054a.C32065k.f78906f;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        C32081a.m94499a(kVar, F, " ", " ");
        aVar.m76515g2().mo60548ow().mo60549pn();
        aVar.mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f61711B = C28715c.m87978d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f61711B = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26370a2(getString(C25190j.gt_actionsheet_title_close_account));
        m76514f2().f73147h.setText(getString(m76515g2().mo60545lw()));
        m76514f2().f73147h.setTitle(getString(m76515g2().mo60547nw()));
        m76514f2().f73144e.setOnClickListener(new C24712a(this));
        m76514f2().f73145f.setOnClickListener(new C24713b(this));
    }
}
