package p341ge.bog.mobilebank.autoliabilityinsurance.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C0173b;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.navigation.fragment.NavHostFragment;
import he1.C41217g;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import ml0.C26252e;
import o31.C37588a0;
import p001a0.C0010c;
import p163m0.C7047a;
import p202p0.C7556l;
import p202p0.C7589q;
import p241s0.C8094c;
import p241s0.C8095d;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.mobilebank.autoliabilityinsurance.domain.model.PolicyDetailsModel;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.C13592b;
import p451hk.C15525c;
import p451hk.C15526d;
import p493kk.C16452f;
import p549ok.C17261a;
import p577qk.C17518a;
import p577qk.C17519b;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.AutoLiabilityInsuranceActivity */
public final class AutoLiabilityInsuranceActivity extends C13595c {

    /* renamed from: K */
    public static final C13583a f40659K = new C13583a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private C16452f f40660G;

    /* renamed from: H */
    private C8095d f40661H;

    /* renamed from: I */
    public C13592b.C13594b f40662I;

    /* renamed from: J */
    private final C41217g f40663J = new C1617p0(C41520a0.m120436b(C13592b.class), new C13587e(this), new C13589g(this), new C13588f((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.AutoLiabilityInsuranceActivity$a */
    public static final class C13583a {
        private C13583a() {
        }

        public /* synthetic */ C13583a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo37452a(Context context, C26252e eVar, C0173b bVar) {
            PolicyDetailsModel policyDetailsModel;
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, AutoLiabilityInsuranceActivity.class);
            C41238w wVar = null;
            if (eVar != null) {
                policyDetailsModel = C17261a.m60581a(eVar);
            } else {
                policyDetailsModel = null;
            }
            intent.putExtra("EXTRA_OPEN_DETAILS", policyDetailsModel);
            if (bVar != null) {
                bVar.mo404a(intent);
                wVar = C41238w.f97225a;
            }
            if (wVar == null) {
                context.startActivity(intent);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.AutoLiabilityInsuranceActivity$b */
    static final class C13584b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C7556l f40664d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13584b(C7556l lVar) {
            super(1);
            this.f40664d = lVar;
        }

        /* renamed from: a */
        public final void mo37453a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f40664d.mo22117L(C15526d.action_insuranceInfoFragment_to_insuranceDetailsFragment);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37453a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.AutoLiabilityInsuranceActivity$c */
    static final class C13585c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AutoLiabilityInsuranceActivity f40665d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13585c(AutoLiabilityInsuranceActivity autoLiabilityInsuranceActivity) {
            super(1);
            this.f40665d = autoLiabilityInsuranceActivity;
        }

        /* renamed from: a */
        public final void mo37454a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f40665d.setResult(4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37454a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.AutoLiabilityInsuranceActivity$d */
    public static final class C13586d extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C13586d f40666d = new C13586d();

        public C13586d() {
            super(0);
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.AutoLiabilityInsuranceActivity$e */
    public static final class C13587e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f40667d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13587e(ComponentActivity componentActivity) {
            super(0);
            this.f40667d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f40667d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.AutoLiabilityInsuranceActivity$f */
    public static final class C13588f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f40668d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f40669e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13588f(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f40668d = aVar;
            this.f40669e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f40668d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f40669e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.AutoLiabilityInsuranceActivity$g */
    static final class C13589g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ AutoLiabilityInsuranceActivity f40670d;

        /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.AutoLiabilityInsuranceActivity$g$a */
        static final class C13590a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ AutoLiabilityInsuranceActivity f40671d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13590a(AutoLiabilityInsuranceActivity autoLiabilityInsuranceActivity) {
                super(0);
                this.f40671d = autoLiabilityInsuranceActivity;
            }

            /* renamed from: b */
            public final C13592b invoke() {
                return this.f40671d.mo37450F2().mo32550a((PolicyDetailsModel) this.f40671d.getIntent().getParcelableExtra("EXTRA_OPEN_DETAILS"));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13589g(AutoLiabilityInsuranceActivity autoLiabilityInsuranceActivity) {
            super(0);
            this.f40670d = autoLiabilityInsuranceActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C13590a(this.f40670d));
        }
    }

    /* renamed from: G2 */
    private final C13592b m50960G2() {
        return (C13592b) this.f40663J.getValue();
    }

    /* renamed from: H2 */
    private final void m50961H2(C7556l lVar) {
        C37224b.m109963b(m50960G2().mo37458fw(), this, new C13584b(lVar));
        C37224b.m109963b(m50960G2().mo37457ew(), this, new C13585c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public static final void m50962I2(AutoLiabilityInsuranceActivity autoLiabilityInsuranceActivity, C7556l lVar, C7589q qVar, Bundle bundle) {
        C41536l.m120489i(autoLiabilityInsuranceActivity, "this$0");
        C41536l.m120489i(lVar, "<anonymous parameter 0>");
        C41536l.m120489i(qVar, "<anonymous parameter 1>");
        ToolbarView toolbarView = autoLiabilityInsuranceActivity.f85671t;
        if (toolbarView != null) {
            toolbarView.setNavigationIcon(C15525c.f44045e);
        }
    }

    /* renamed from: F2 */
    public final C13592b.C13594b mo37450F2() {
        C13592b.C13594b bVar = this.f40662I;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C16452f d = C16452f.m58612d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f40660G = d;
        C8095d dVar = null;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        Fragment j0 = getSupportFragmentManager().mo4415j0(C15526d.f44066b1);
        C41536l.m120487g(j0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        C7556l k1 = ((NavHostFragment) j0).mo5009k1();
        C8095d a = new C8095d.C8096a(C41357x0.m119985e()).mo23273c((C0010c) null).mo23272b(new C17519b(C13586d.f40666d)).mo23271a();
        this.f40661H = a;
        if (a == null) {
            C41536l.m120506z("appBarConfiguration");
        } else {
            dVar = a;
        }
        C8094c.m30636a(this, k1, dVar);
        k1.mo22137p(new C17518a(this));
        m50961H2(k1);
    }

    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
