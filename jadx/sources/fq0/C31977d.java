package fq0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lq0.C37124a;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.insuranceprovider.InsuranceProviderData;
import sp0.C38482b;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: fq0.d */
public final class C31977d extends C31974a {

    /* renamed from: O */
    public static final C31978a f78761O = new C31978a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C38482b f78762K;

    /* renamed from: L */
    private final C41217g f78763L = C41219i.m119470b(new C31979b(this));

    /* renamed from: M */
    public C31995i f78764M;

    /* renamed from: N */
    private final C41217g f78765N;

    /* renamed from: fq0.d$a */
    public static final class C31978a {
        private C31978a() {
        }

        public /* synthetic */ C31978a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C31977d mo72474a(List list, C37124a aVar) {
            C41536l.m120489i(list, "providers");
            C41536l.m120489i(aVar, C11769i.C11770a.f34151n);
            C31977d dVar = new C31977d();
            dVar.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_PROVIDERS_DATA", list), C41233s.m119492a("EXTRA_KEYS", aVar)));
            return dVar;
        }
    }

    /* renamed from: fq0.d$b */
    static final class C31979b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31977d f78766d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31979b(C31977d dVar) {
            super(0);
            this.f78766d = dVar;
        }

        /* renamed from: b */
        public final C37124a invoke() {
            Serializable serializable = this.f78766d.requireArguments().getSerializable("EXTRA_KEYS");
            C41536l.m120487g(serializable, "null cannot be cast to non-null type ge.bog.mobilebank.loanactivation.presentation.activation.model.LoanType");
            return (C37124a) serializable;
        }
    }

    /* renamed from: fq0.d$c */
    /* synthetic */ class C31980c extends C41535k implements C43075l {
        C31980c(Object obj) {
            super(1, obj, C31977d.class, "setProviders", "setProviders(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo72476b(List list) {
            C41536l.m120489i(list, "p0");
            ((C31977d) this.receiver).m94402r2(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72476b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: fq0.d$d */
    /* synthetic */ class C31981d extends C41535k implements C43075l {
        C31981d(Object obj) {
            super(1, obj, C31977d.class, "onProviderCheck", "onProviderCheck(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo72477b(String str) {
            C41536l.m120489i(str, "p0");
            ((C31977d) this.receiver).m94399o2(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72477b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: fq0.d$e */
    /* synthetic */ class C31982e extends C41535k implements C43075l {
        C31982e(Object obj) {
            super(1, obj, C31977d.class, "onSaveButtonClick", "onSaveButtonClick(Lge/bog/mobilebank/loanactivation/presentation/activation/model/insuranceprovider/InsuranceProviderData;)V", 0);
        }

        /* renamed from: b */
        public final void mo72478b(InsuranceProviderData insuranceProviderData) {
            C41536l.m120489i(insuranceProviderData, "p0");
            ((C31977d) this.receiver).m94400p2(insuranceProviderData);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72478b((InsuranceProviderData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: fq0.d$f */
    static final class C31983f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f78767a;

        C31983f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f78767a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f78767a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f78767a.invoke(obj);
        }
    }

    /* renamed from: fq0.d$g */
    static final class C31984g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31977d f78768d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31984g(C31977d dVar) {
            super(1);
            this.f78768d = dVar;
        }

        /* renamed from: a */
        public final void mo72481a(String str) {
            C41536l.m120489i(str, "id");
            this.f78768d.m94398n2().mo72490dw().mo72485Kr(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72481a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: fq0.d$h */
    public static final class C31985h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f78769d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31985h(Fragment fragment) {
            super(0);
            this.f78769d = fragment;
        }

        public final Fragment invoke() {
            return this.f78769d;
        }
    }

    /* renamed from: fq0.d$i */
    public static final class C31986i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f78770d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31986i(C43064a aVar) {
            super(0);
            this.f78770d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f78770d.invoke();
        }
    }

    /* renamed from: fq0.d$j */
    public static final class C31987j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f78771d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31987j(C41217g gVar) {
            super(0);
            this.f78771d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f78771d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: fq0.d$k */
    public static final class C31988k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f78772d;

        /* renamed from: e */
        final /* synthetic */ C41217g f78773e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31988k(C43064a aVar, C41217g gVar) {
            super(0);
            this.f78772d = aVar;
            this.f78773e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f78772d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f78773e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: fq0.d$l */
    static final class C31989l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31977d f78774d;

        /* renamed from: fq0.d$l$a */
        static final class C31990a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C31977d f78775d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31990a(C31977d dVar) {
                super(0);
                this.f78775d = dVar;
            }

            /* renamed from: b */
            public final C31998l invoke() {
                C31995i l2 = this.f78775d.mo72473l2();
                ArrayList parcelableArrayList = this.f78775d.requireArguments().getParcelableArrayList("EXTRA_PROVIDERS_DATA");
                C41536l.m120486f(parcelableArrayList);
                return l2.mo32811a(parcelableArrayList);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31989l(C31977d dVar) {
            super(0);
            this.f78774d = dVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C31990a(this.f78774d));
        }
    }

    public C31977d() {
        C31989l lVar = new C31989l(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C31986i(new C31985h(this)));
        this.f78765N = C1514j0.m5374c(this, C41520a0.m120436b(C31998l.class), new C31987j(a), new C31988k((C43064a) null, a), lVar);
    }

    /* renamed from: k2 */
    private final C38482b m94396k2() {
        C38482b bVar = this.f78762K;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* renamed from: m2 */
    private final C37124a m94397m2() {
        return (C37124a) this.f78763L.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public final C31998l m94398n2() {
        return (C31998l) this.f78765N.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final void m94399o2(String str) {
        m94396k2().f92169e.setEnabled(true);
        LinearLayout linearLayout = m94396k2().f92171g;
        C41536l.m120488h(linearLayout, "binding.providerContainer");
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            C41536l.m120488h(childAt, "getChildAt(index)");
            C41536l.m120487g(childAt, "null cannot be cast to non-null type ge.bog.mobilebank.loanactivation.presentation.activation.form.actionsheet.insuranceprovider.InsuranceProviderView");
            C31994h hVar = (C31994h) childAt;
            hVar.mo72484d(C41536l.m120484d(hVar.getTag(), str));
        }
        C1533o.m5445b(this, "REQUEST_KEY_CHOSEN_PROVIDER", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_CHECKED_PROVIDER", str)));
    }

    private final void observeData() {
        C31997k ew = m94398n2().mo72491ew();
        ew.mo72489X0().mo4819k(getViewLifecycleOwner(), new C31983f(new C31980c(this)));
        LiveData R7 = ew.mo72488R7();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(R7, viewLifecycleOwner, new C31981d(this));
        LiveData G3 = ew.mo72487G3();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(G3, viewLifecycleOwner2, new C31982e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public final void m94400p2(InsuranceProviderData insuranceProviderData) {
        C1533o.m5445b(this, "REQUEST_KEY_CHOSEN_PROVIDER", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_CHOSEN_PROVIDER", insuranceProviderData)));
        mo4577k1();
    }

    /* renamed from: q2 */
    private final void m94401q2() {
        PackageManager packageManager;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C32343x.m95388F(m94397m2().mo90100j0(), new Object[0])));
        C1505h activity = getActivity();
        if (activity != null && (packageManager = activity.getPackageManager()) != null && intent.resolveActivity(packageManager) != null) {
            startActivity(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public final void m94402r2(List list) {
        Object obj;
        boolean z;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InsuranceProviderData insuranceProviderData = (InsuranceProviderData) it.next();
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            if (list.indexOf(insuranceProviderData) == list.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            C31994h hVar = new C31994h(requireContext, insuranceProviderData, z, m94397m2(), new C31984g(this), (AttributeSet) null, 0, 96, (DefaultConstructorMarker) null);
            LinearLayout linearLayout = m94396k2().f92171g;
            C41536l.m120488h(linearLayout, "binding.providerContainer");
            linearLayout.addView(hVar);
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((InsuranceProviderData) obj).mo73535f()) {
                break;
            }
        }
        InsuranceProviderData insuranceProviderData2 = (InsuranceProviderData) obj;
        if (insuranceProviderData2 != null) {
            m94398n2().mo72490dw().mo72485Kr(insuranceProviderData2.mo73529a());
        }
    }

    /* renamed from: s2 */
    private final void m94403s2() {
        mo26370a2(C32343x.m95388F(m94397m2().mo90092e0(), new Object[0]));
        Button button = m94396k2().f92169e;
        button.setButtonText(C32343x.m95388F(m94397m2().mo90094f0(), new Object[0]));
        button.setEnabled(false);
        button.setOnClickListener(new C31975b(this));
        Button button2 = m94396k2().f92170f;
        button2.setButtonText(C32343x.m95388F(m94397m2().mo90099i0(), new Object[0]));
        button2.setOnClickListener(new C31976c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public static final void m94404t2(C31977d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m94398n2().mo72490dw().mo72486X2();
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public static final void m94405u2(C31977d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m94401q2();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f78762K = C38482b.m112941d(layoutInflater, viewGroup, true);
    }

    /* renamed from: l2 */
    public final C31995i mo72473l2() {
        C31995i iVar = this.f78764M;
        if (iVar != null) {
            return iVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f78762K = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        observeData();
        m94403s2();
    }
}
