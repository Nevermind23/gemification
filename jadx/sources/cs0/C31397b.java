package cs0;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.LiveData;
import cf1.C40419j;
import g91.C32343x;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.loans.presentation.installmentStatus.C32677a;
import p341ge.bog.mobilebank.loans.presentation.installmentStatus.LoanInstallmentStatusData;
import p341ge.bog.mobilebank.loans.presentation.installmentStatus.LoanInstallmentStatusViewModel$ViewModel;
import pr0.C37944b;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: cs0.b */
public final class C31397b extends C32677a {

    /* renamed from: N */
    public static final C31398a f77944N = new C31398a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private final C41217g f77945K = C41219i.m119470b(new C31405h(this));

    /* renamed from: L */
    private C37944b f77946L;

    /* renamed from: M */
    private final C41217g f77947M;

    /* renamed from: cs0.b$a */
    public static final class C31398a {
        private C31398a() {
        }

        public /* synthetic */ C31398a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C31397b mo71770a(LoanInstallmentStatusData loanInstallmentStatusData) {
            C41536l.m120489i(loanInstallmentStatusData, "data");
            C31397b bVar = new C31397b();
            bVar.setArguments(C0908e.m3336b(C41233s.m119492a("LOAN_INSTALLMENT_STATUS_KEY", loanInstallmentStatusData)));
            return bVar;
        }
    }

    /* renamed from: cs0.b$b */
    static final class C31399b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31397b f77948d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31399b(C31397b bVar) {
            super(1);
            this.f77948d = bVar;
        }

        /* renamed from: a */
        public final void mo71771a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f77948d.m93322g2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71771a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: cs0.b$c */
    public static final class C31400c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f77949d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31400c(Fragment fragment) {
            super(0);
            this.f77949d = fragment;
        }

        public final Fragment invoke() {
            return this.f77949d;
        }
    }

    /* renamed from: cs0.b$d */
    public static final class C31401d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f77950d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31401d(C43064a aVar) {
            super(0);
            this.f77950d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f77950d.invoke();
        }
    }

    /* renamed from: cs0.b$e */
    public static final class C31402e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f77951d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31402e(C41217g gVar) {
            super(0);
            this.f77951d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f77951d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: cs0.b$f */
    public static final class C31403f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f77952d;

        /* renamed from: e */
        final /* synthetic */ C41217g f77953e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31403f(C43064a aVar, C41217g gVar) {
            super(0);
            this.f77952d = aVar;
            this.f77953e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f77952d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f77953e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: cs0.b$g */
    public static final class C31404g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f77954d;

        /* renamed from: e */
        final /* synthetic */ C41217g f77955e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31404g(Fragment fragment, C41217g gVar) {
            super(0);
            this.f77954d = fragment;
            this.f77955e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f77955e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f77954d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: cs0.b$h */
    static final class C31405h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31397b f77956d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31405h(C31397b bVar) {
            super(0);
            this.f77956d = bVar;
        }

        /* renamed from: b */
        public final LoanInstallmentStatusData invoke() {
            Parcelable parcelable = this.f77956d.requireArguments().getParcelable("LOAN_INSTALLMENT_STATUS_KEY");
            C41536l.m120486f(parcelable);
            return (LoanInstallmentStatusData) parcelable;
        }
    }

    public C31397b() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C31401d(new C31400c(this)));
        this.f77947M = C1514j0.m5374c(this, C41520a0.m120436b(LoanInstallmentStatusViewModel$ViewModel.class), new C31402e(a), new C31403f((C43064a) null, a), new C31404g(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public final void m93322g2() {
        try {
            String d = m93325j2().mo74294d();
            if (d != null) {
                String g = new C40419j("\\s").mo94490g(d, "");
                if (g != null) {
                    Intent intent = new Intent("android.intent.action.DIAL");
                    intent.setData(Uri.parse("tel:" + g));
                    startActivity(intent);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: h2 */
    private final void m93323h2() {
        m93324i2().f91091f.setTitleText(C40439w.m117103B(C32343x.m95388F(m93325j2().mo74293b(), m93325j2().mo74292a()), "<2>", " ", false, 4, (Object) null));
    }

    /* renamed from: i2 */
    private final C37944b m93324i2() {
        C37944b bVar = this.f77946L;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* renamed from: j2 */
    private final LoanInstallmentStatusData m93325j2() {
        return (LoanInstallmentStatusData) this.f77945K.getValue();
    }

    /* renamed from: k2 */
    private final LoanInstallmentStatusViewModel$ViewModel m93326k2() {
        return (LoanInstallmentStatusViewModel$ViewModel) this.f77947M.getValue();
    }

    /* renamed from: l2 */
    private final void m93327l2() {
        LiveData ew = m93326k2().mo74305ew();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(ew, viewLifecycleOwner, new C31399b(this));
    }

    /* renamed from: m2 */
    private final void m93328m2() {
        boolean z;
        C37944b i2 = m93324i2();
        m93323h2();
        Button button = i2.f91090e;
        C41536l.m120488h(button, "contactButton");
        if (m93325j2().mo74294d() != null) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(button, z, false, 2, (Object) null);
        i2.f91090e.setButtonText(m93325j2().mo74294d());
        i2.f91090e.setOnClickListener(new C31396a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m93329n2(C31397b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        bVar.m93326k2().mo74304dw();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f77946L = C37944b.m111520d(getLayoutInflater(), viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f77946L = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        mo26370a2(C32343x.m95388F("online.inst.reversal.status.action.sheet.header", new Object[0]));
        super.onViewCreated(view, bundle);
        m93328m2();
        m93327l2();
    }
}
