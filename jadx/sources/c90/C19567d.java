package c90;

import a90.C19199a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C4956a;
import g91.C32343x;
import g91.C32355x0;
import h80.C24900g;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import i90.C25135a;
import i90.C25136b;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import o31.C37588a0;
import o90.C26868u;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: c90.d */
public final class C19567d extends C19589g {

    /* renamed from: P */
    public static final C19568a f53868P = new C19568a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C24900g f53869K;

    /* renamed from: L */
    public C26868u.C26870b f53870L;

    /* renamed from: M */
    private final C41217g f53871M;

    /* renamed from: N */
    private String f53872N = C32343x.m95388F("credit.application.CL.CRI.and.RS.action.sheet.header", new Object[0]);
    /* access modifiers changed from: private */

    /* renamed from: O */
    public final C19199a f53873O = new C19199a();

    /* renamed from: c90.d$a */
    public static final class C19568a {
        private C19568a() {
        }

        public /* synthetic */ C19568a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C19567d mo47801a(String str) {
            C41536l.m120489i(str, "limitType");
            C19567d dVar = new C19567d();
            Bundle bundle = new Bundle();
            bundle.putString("ARGS_LIMIT_INFO_TYPE", str);
            dVar.setArguments(bundle);
            return dVar;
        }
    }

    /* renamed from: c90.d$b */
    /* synthetic */ class C19569b extends C41535k implements C43075l {
        C19569b(Object obj) {
            super(1, obj, C19567d.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo47802b(boolean z) {
            ((C19567d) this.receiver).m65201v2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47802b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.d$c */
    static final class C19570c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19567d f53874d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19570c(C19567d dVar) {
            super(1);
            this.f53874d = dVar;
        }

        /* renamed from: a */
        public final void mo47803a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "error");
            CardView cardView = this.f53874d.m65195o2().f63940k;
            C41536l.m120488h(cardView, "binding.retryButtonContainer");
            C32343x.m95447f1(cardView);
            this.f53874d.handleError(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47803a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.d$d */
    /* synthetic */ class C19571d extends C41535k implements C43075l {
        C19571d(Object obj) {
            super(1, obj, C19567d.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo47804b(boolean z) {
            ((C19567d) this.receiver).m65201v2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47804b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.d$e */
    /* synthetic */ class C19572e extends C41535k implements C43075l {
        C19572e(Object obj) {
            super(1, obj, C19567d.class, "dismissWithResult", "dismissWithResult(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo47805b(String str) {
            C41536l.m120489i(str, "p0");
            ((C19567d) this.receiver).m65194n2(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47805b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.d$f */
    /* synthetic */ class C19573f extends C41535k implements C43075l {
        C19573f(Object obj) {
            super(1, obj, C19567d.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo47806b(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C19567d) this.receiver).handleError(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47806b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.d$g */
    static final class C19574g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19567d f53875d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19574g(C19567d dVar) {
            super(1);
            this.f53875d = dVar;
        }

        /* renamed from: a */
        public final void mo47807a(C37223a aVar) {
            Boolean bool = (Boolean) aVar.mo90296a();
            if (bool != null) {
                C19567d dVar = this.f53875d;
                dVar.m65195o2().f63936g.setEnabled(bool.booleanValue());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47807a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.d$h */
    static final class C19575h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19567d f53876d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19575h(C19567d dVar) {
            super(1);
            this.f53876d = dVar;
        }

        /* renamed from: a */
        public final void mo47808a(List list) {
            this.f53876d.f53873O.mo6029i(list);
            C19567d dVar = this.f53876d;
            C41536l.m120488h(list, "contracts");
            dVar.m65202w2(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47808a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.d$i */
    static final class C19576i implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f53877a;

        C19576i(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f53877a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f53877a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f53877a.invoke(obj);
        }
    }

    /* renamed from: c90.d$j */
    /* synthetic */ class C19577j implements CheckboxView.C13222b, C41532h {
        C19577j() {
        }

        /* renamed from: b */
        public final void mo27107a(View view, boolean z, boolean z2) {
            C41536l.m120489i(view, "p0");
            C19567d.this.m65197r2(view, z, z2);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof CheckboxView.C13222b) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return new C41535k(3, C19567d.this, C19567d.class, "onCheckBoxCheckedStateChange", "onCheckBoxCheckedStateChange(Landroid/view/View;ZZ)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: c90.d$k */
    public static final class C19578k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f53879d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19578k(Fragment fragment) {
            super(0);
            this.f53879d = fragment;
        }

        public final Fragment invoke() {
            return this.f53879d;
        }
    }

    /* renamed from: c90.d$l */
    public static final class C19579l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f53880d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19579l(C43064a aVar) {
            super(0);
            this.f53880d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f53880d.invoke();
        }
    }

    /* renamed from: c90.d$m */
    public static final class C19580m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f53881d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19580m(C41217g gVar) {
            super(0);
            this.f53881d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f53881d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: c90.d$n */
    public static final class C19581n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f53882d;

        /* renamed from: e */
        final /* synthetic */ C41217g f53883e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19581n(C43064a aVar, C41217g gVar) {
            super(0);
            this.f53882d = aVar;
            this.f53883e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f53882d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f53883e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: c90.d$o */
    static final class C19582o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19567d f53884d;

        /* renamed from: c90.d$o$a */
        static final class C19583a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C19567d f53885d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C19583a(C19567d dVar) {
                super(0);
                this.f53885d = dVar;
            }

            /* renamed from: b */
            public final C26868u invoke() {
                C26868u.C26870b p2 = this.f53885d.mo47800p2();
                String string = this.f53885d.requireArguments().getString("ARGS_LIMIT_INFO_TYPE");
                if (string == null) {
                    string = "";
                }
                return p2.mo32787a(string);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19582o(C19567d dVar) {
            super(0);
            this.f53884d = dVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C19583a(this.f53884d));
        }
    }

    public C19567d() {
        C19582o oVar = new C19582o(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C19579l(new C19578k(this)));
        this.f53871M = C1514j0.m5374c(this, C41520a0.m120436b(C26868u.class), new C19580m(a), new C19581n((C43064a) null, a), oVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public final void m65194n2(String str) {
        C1533o.m5445b(this, "ClaContractActionSheet_REQUEST_KEY", C0908e.m3336b(C41233s.m119492a("RS_ENCODED_CONTRACT", str)));
        mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final C24900g m65195o2() {
        C24900g gVar = this.f53869K;
        C41536l.m120486f(gVar);
        return gVar;
    }

    private final void observeData() {
        C21484c.m69412d(m65196q2().mo66170Cw(), this, (C43075l) null, new C19569b(this), new C19570c(this), 2, (Object) null);
        C21484c.m69411c(m65196q2().mo66169Aw(), this, new C19572e(this), new C19571d(this), new C19573f(this));
        m65196q2().mo66173Qw().mo4819k(this, new C19576i(new C19574g(this)));
        m65196q2().mo66172Q1().mo4819k(this, new C19576i(new C19575h(this)));
    }

    /* renamed from: q2 */
    private final C26868u m65196q2() {
        return (C26868u) this.f53871M.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public final void m65197r2(View view, boolean z, boolean z2) {
        C25136b bVar;
        Object tag = view.getTag();
        if (tag instanceof C25136b) {
            bVar = (C25136b) tag;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            m65196q2().mo66174Uw(bVar, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m65198s2(C19567d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m65196q2().mo66175vw();
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public static final void m65199t2(C19567d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m65196q2().mo66171Lw();
        CardView cardView = dVar.m65195o2().f63940k;
        C41536l.m120488h(cardView, "binding.retryButtonContainer");
        C32343x.m95455i0(cardView);
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public static final void m65200u2(C19567d dVar, DialogInterface dialogInterface) {
        C41536l.m120489i(dVar, "this$0");
        View requireView = dVar.requireView();
        C41536l.m120488h(requireView, "requireView()");
        ViewGroup.LayoutParams layoutParams = requireView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = dVar.getResources().getDisplayMetrics().heightPixels - C32355x0.m95522m(dVar.getContext());
            requireView.setLayoutParams(layoutParams);
            ViewParent parent = dVar.m65195o2().mo3946b().getParent();
            C41536l.m120487g(parent, "null cannot be cast to non-null type android.view.View");
            View view = (View) parent;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -1;
                view.setLayoutParams(layoutParams2);
                C41536l.m120487g(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                BottomSheetBehavior n = ((C4956a) dialogInterface).mo15614n();
                n.mo15579I0(3);
                n.mo15578H0(true);
                n.mo15596w0(false);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public final void m65201v2(boolean z) {
        m65195o2().f63937h.setVisibility(z ? 0 : 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public final void m65202w2(List list) {
        LinearLayout linearLayout = m65195o2().f63934e;
        linearLayout.removeViews(1, linearLayout.getChildCount() - 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25135a aVar = (C25135a) it.next();
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            CheckboxView checkboxView = new CheckboxView(requireContext, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
            checkboxView.setText(aVar.mo63683d());
            checkboxView.setTag(aVar.mo63684e());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(C18368l.m62762k(22), C18368l.m62762k(12), C18368l.m62762k(22), 0);
            checkboxView.setOnCheckedStateChangeListener(new C19577j());
            checkboxView.setLayoutParams(layoutParams);
            linearLayout.addView(checkboxView);
        }
    }

    /* renamed from: Q1 */
    public String mo26364Q1() {
        return this.f53872N;
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f53869K = C24900g.m79582d(layoutInflater, viewGroup, true);
        observeData();
        m65195o2().f63938i.setAdapter(this.f53873O);
        m65195o2().f63936g.setOnClickListener(new C19563b(this));
        m65195o2().f63939j.mo3946b().setOnClickListener(new C19565c(this));
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f53869K = null;
    }

    /* renamed from: p2 */
    public final C26868u.C26870b mo47800p2() {
        C26868u.C26870b bVar = this.f53870L;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        C4956a aVar;
        Dialog q1 = super.mo710q1(bundle);
        if (q1 instanceof C4956a) {
            aVar = (C4956a) q1;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.setOnShowListener(new C19545a(this));
        }
        return q1;
    }
}
