package zl0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoViewModel$ViewModel;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.selectinsuranceperson.InsurancePersonType;
import p349ah.C9860d;
import ue1.C43064a;
import ue1.C43075l;
import ul0.C28878e;
import y71.C40028b;
import y71.C40029c;
import y71.C40034h;
import z71.C40175b;

/* renamed from: zl0.f */
public final class C30340f extends C9860d {

    /* renamed from: E */
    public static final C30341a f76263E = new C30341a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C40175b f76264B;

    /* renamed from: C */
    private final C41217g f76265C;

    /* renamed from: D */
    private final C41217g f76266D = C41219i.m119470b(new C30342b(this));

    /* renamed from: zl0.f$a */
    public static final class C30341a {
        private C30341a() {
        }

        public /* synthetic */ C30341a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C30340f mo70669a() {
            return new C30340f();
        }
    }

    /* renamed from: zl0.f$b */
    static final class C30342b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C30340f f76267d;

        /* renamed from: zl0.f$b$a */
        /* synthetic */ class C30343a implements C30336b, C41532h {

            /* renamed from: a */
            final /* synthetic */ C30340f f76268a;

            C30343a(C30340f fVar) {
                this.f76268a = fVar;
            }

            /* renamed from: a */
            public final void mo70660a(C30337c cVar) {
                C41536l.m120489i(cVar, "p0");
                this.f76268a.m91489n2(cVar);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C30336b) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f76268a, C30340f.class, "onItemClicked", "onItemClicked(Lge/bog/mobilebank/insurance/travelinsurance/presentation/fillinfo/selectinsuranceperson/SelectInsurancePersonUIModel;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30342b(C30340f fVar) {
            super(0);
            this.f76267d = fVar;
        }

        /* renamed from: b */
        public final C30335a invoke() {
            return new C30335a(new C30343a(this.f76267d));
        }
    }

    /* renamed from: zl0.f$c */
    static final class C30344c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C30340f f76269d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30344c(C30340f fVar) {
            super(1);
            this.f76269d = fVar;
        }

        /* renamed from: a */
        public final void mo70673a(List list) {
            List e2 = this.f76269d.m91486k2();
            C30340f fVar = this.f76269d;
            C41536l.m120488h(list, "it");
            List m0 = C41358y.m120023m0(e2, fVar.m91487l2(list));
            if (m0.size() >= 8) {
                this.f76269d.m91490o2();
            }
            this.f76269d.m91484i2().mo6029i(m0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70673a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: zl0.f$d */
    static final class C30345d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f76270a;

        C30345d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f76270a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f76270a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f76270a.invoke(obj);
        }
    }

    /* renamed from: zl0.f$e */
    public static final class C30346e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f76271d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30346e(C43064a aVar) {
            super(0);
            this.f76271d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f76271d.invoke();
        }
    }

    /* renamed from: zl0.f$f */
    public static final class C30347f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f76272d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30347f(C41217g gVar) {
            super(0);
            this.f76272d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f76272d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: zl0.f$g */
    public static final class C30348g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f76273d;

        /* renamed from: e */
        final /* synthetic */ C41217g f76274e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30348g(C43064a aVar, C41217g gVar) {
            super(0);
            this.f76273d = aVar;
            this.f76274e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f76273d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f76274e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: zl0.f$h */
    public static final class C30349h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f76275d;

        /* renamed from: e */
        final /* synthetic */ C41217g f76276e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30349h(Fragment fragment, C41217g gVar) {
            super(0);
            this.f76275d = fragment;
            this.f76276e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f76276e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f76275d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: zl0.f$i */
    static final class C30350i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C30340f f76277d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30350i(C30340f fVar) {
            super(0);
            this.f76277d = fVar;
        }

        public final C1638u0 invoke() {
            Fragment requireParentFragment = this.f76277d.requireParentFragment();
            C41536l.m120488h(requireParentFragment, "requireParentFragment()");
            return requireParentFragment;
        }
    }

    public C30340f() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C30346e(new C30350i(this)));
        this.f76265C = C1514j0.m5374c(this, C41520a0.m120436b(FillInsuranceInfoViewModel$ViewModel.class), new C30347f(a), new C30348g((C43064a) null, a), new C30349h(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public final C30335a m91484i2() {
        return (C30335a) this.f76266D.getValue();
    }

    /* renamed from: j2 */
    private final C40175b m91485j2() {
        C40175b bVar = this.f76264B;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final List m91486k2() {
        InsurancePersonType[] values = InsurancePersonType.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (InsurancePersonType insurancePersonType : values) {
            arrayList.add(new C30337c(insurancePersonType, C32343x.m95388F(insurancePersonType.mo62749e(), new Object[0]), (C28878e) null, 4, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public final List m91487l2(List list) {
        C41224m mVar;
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C28878e eVar = (C28878e) it.next();
            String language = Locale.getDefault().getLanguage();
            C41536l.m120488h(language, "getDefault().language");
            Locale locale = Locale.getDefault();
            C41536l.m120488h(locale, "getDefault()");
            String lowerCase = language.toLowerCase(locale);
            C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            boolean z = false;
            C30337c cVar = null;
            boolean M = C40440x.m117139M(lowerCase, "ka", false, 2, (Object) null);
            String string = getString(C40034h.select_insured_person_prefix);
            C41536l.m120488h(string, "getString(R.string.select_insured_person_prefix)");
            String c = eVar.mo68622c();
            String str2 = "";
            if (c == null) {
                c = str2;
            }
            String e = eVar.mo68624e();
            if (e == null) {
                e = str2;
            }
            String str3 = c + " " + e;
            String b = eVar.mo68621b();
            if (b == null) {
                b = str2;
            }
            String d = eVar.mo68623d();
            if (d != null) {
                str2 = d;
            }
            String str4 = b + " " + str2;
            if (M) {
                mVar = C41233s.m119492a(str3, str4);
            } else {
                mVar = C41233s.m119492a(str4, str3);
            }
            if (!C40439w.m117118v((CharSequence) mVar.mo95678e())) {
                str = (String) mVar.mo95678e();
            } else if (!C40439w.m117118v((CharSequence) mVar.mo95680f())) {
                str = (String) mVar.mo95680f();
            } else {
                String f = eVar.mo68626f();
                if (f == null || C40439w.m117118v(f)) {
                    z = true;
                }
                if (!z) {
                    str = eVar.mo68626f();
                } else {
                    str = null;
                }
            }
            if (str != null) {
                if (!M) {
                    str = string + " " + str;
                }
                if (str != null) {
                    cVar = new C30337c(InsurancePersonType.OTHER, str, eVar);
                }
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* renamed from: m2 */
    private final FillInsuranceInfoViewModel$ViewModel m91488m2() {
        return (FillInsuranceInfoViewModel$ViewModel) this.f76265C.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public final void m91489n2(C30337c cVar) {
        mo4577k1();
        m91488m2().mo62710zw(cVar.mo70663c(), cVar.mo70661a(), cVar.mo70662b());
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final void m91490o2() {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(C40028b.select_person_action_sheet_height);
        ViewGroup.LayoutParams layoutParams = requireView().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = dimensionPixelOffset;
        }
        requireView().requestLayout();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f76264B = C40175b.m116407d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f76264B = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        mo26370a2(C32343x.m95388F("text.travel.insurance.dialog.insured.person.choice.header", new Object[0]));
        BottomSheetBehavior K1 = mo26359K1();
        if (K1 != null) {
            K1.mo15579I0(4);
        }
        m91485j2().f95454e.setAdapter(m91484i2());
        m91485j2().f95454e.mo5351j(new C13364a(C0767a.m2895e(requireContext(), C40029c.f95087e), true, false));
        m91488m2().mo62703sw().mo4819k(this, new C30345d(new C30344c(this)));
    }
}
