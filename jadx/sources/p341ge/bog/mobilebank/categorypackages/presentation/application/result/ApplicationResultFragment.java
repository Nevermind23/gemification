package p341ge.bog.mobilebank.categorypackages.presentation.application.result;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37614q;
import p341ge.bog.designsystem.components.pagestate.PageStateType;
import p341ge.bog.mobilebank.categorypackages.presentation.application.result.C14507c;
import p341ge.bog.mobilebank.categorypackages.presentation.application.result.model.ApplicationResultData;
import p413eo.C12752k;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.result.ApplicationResultFragment */
public final class ApplicationResultFragment extends C14511d {

    /* renamed from: j */
    public static final C14499a f42324j = new C14499a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C12752k f42325g;

    /* renamed from: h */
    private final C41217g f42326h = C41219i.m119470b(new C14501c(this));

    /* renamed from: i */
    private final C41217g f42327i = C41219i.m119470b(new C14500b(this));

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.result.ApplicationResultFragment$a */
    public static final class C14499a {
        private C14499a() {
        }

        public /* synthetic */ C14499a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Bundle mo40715a(ApplicationResultData applicationResultData) {
            C41536l.m120489i(applicationResultData, "resultData");
            return C0908e.m3336b(C41233s.m119492a("EXTRA_RESULT_DATA", applicationResultData));
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.result.ApplicationResultFragment$b */
    static final class C14500b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ApplicationResultFragment f42328d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14500b(ApplicationResultFragment applicationResultFragment) {
            super(0);
            this.f42328d = applicationResultFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m53607c(ApplicationResultFragment applicationResultFragment) {
            C41536l.m120489i(applicationResultFragment, "this$0");
            applicationResultFragment.requireActivity().setResult(13);
            applicationResultFragment.requireActivity().finish();
        }

        /* renamed from: b */
        public final C14503b invoke() {
            return new C14503b(new C14502a(this.f42328d));
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.result.ApplicationResultFragment$c */
    static final class C14501c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ApplicationResultFragment f42329d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14501c(ApplicationResultFragment applicationResultFragment) {
            super(0);
            this.f42329d = applicationResultFragment;
        }

        /* renamed from: b */
        public final ApplicationResultData invoke() {
            Parcelable parcelable = this.f42329d.requireArguments().getParcelable("EXTRA_RESULT_DATA");
            C41536l.m120486f(parcelable);
            return (ApplicationResultData) parcelable;
        }
    }

    /* renamed from: i1 */
    private final C14503b m53600i1() {
        return (C14503b) this.f42327i.getValue();
    }

    /* renamed from: j1 */
    private final C12752k m53601j1() {
        C12752k kVar = this.f42325g;
        C41536l.m120486f(kVar);
        return kVar;
    }

    /* renamed from: k1 */
    private final C14507c m53602k1() {
        boolean z;
        List a = m53604m1().mo40733a();
        if (a == null || a.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        List a2 = m53604m1().mo40733a();
        C41536l.m120486f(a2);
        return new C14507c.C14508a(a2);
    }

    /* renamed from: l1 */
    private final C14507c m53603l1() {
        return new C14507c.C14509b(m53604m1().mo40735d(), m53604m1().mo40737e());
    }

    /* renamed from: m1 */
    private final ApplicationResultData m53604m1() {
        return (ApplicationResultData) this.f42326h.getValue();
    }

    public String getHeaderText() {
        return C32343x.m95388F("text.packages.general.name", new Object[0]);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f42325g = C12752k.m48403d(layoutInflater, viewGroup, false);
        LinearLayout c = m53601j1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        this.f42325g = null;
        super.onDestroyView();
        C1505h activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m53601j1().f37764e.setAdapter(m53600i1());
        m53600i1().mo40720l(m53604m1().mo40735d());
        String b = m53604m1().mo40734b();
        if (m53604m1().mo40735d() instanceof PageStateType.Success) {
            str = "success";
        } else {
            str = "pending";
        }
        C32343x.m95499y0(this, "solo_packages", b, str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(m53603l1());
        C37614q.m110615a(arrayList, m53602k1());
        m53600i1().mo6029i(arrayList);
    }
}
