package p341ge.bog.mobilebank.loanactivation.presentation.activation.result;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import g91.C32319m;
import g91.C32343x;
import he1.C41217g;
import he1.C41224m;
import he1.C41233s;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lq0.C37124a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.result.ActivationResultData;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import sp0.C38494m;
import tq0.C38778a;
import tq0.C38779b;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.result.ActivationResultFragment */
public final class ActivationResultFragment extends C35651n1 {

    /* renamed from: g */
    public static final C32494a f80108g = new C32494a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C38494m f80109d;

    /* renamed from: e */
    private final C41217g f80110e = C41219i.m119470b(new C32496c(this));

    /* renamed from: f */
    private final C41217g f80111f = C41219i.m119470b(new C32495b(this));

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.result.ActivationResultFragment$a */
    public static final class C32494a {
        private C32494a() {
        }

        public /* synthetic */ C32494a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Bundle mo73559a(ActivationResultData activationResultData, C37124a aVar) {
            C41536l.m120489i(activationResultData, "data");
            C41536l.m120489i(aVar, C11769i.C11770a.f34151n);
            return C0908e.m3336b(C41233s.m119492a("EXTRA_RESULT_DATA", activationResultData), C41233s.m119492a("EXTRA_KEYS", aVar));
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.result.ActivationResultFragment$b */
    static final class C32495b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ActivationResultFragment f80112d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32495b(ActivationResultFragment activationResultFragment) {
            super(0);
            this.f80112d = activationResultFragment;
        }

        /* renamed from: b */
        public final C37124a invoke() {
            Serializable serializable = this.f80112d.requireArguments().getSerializable("EXTRA_KEYS");
            C41536l.m120487g(serializable, "null cannot be cast to non-null type ge.bog.mobilebank.loanactivation.presentation.activation.model.LoanType");
            return (C37124a) serializable;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.result.ActivationResultFragment$c */
    static final class C32496c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ActivationResultFragment f80113d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32496c(ActivationResultFragment activationResultFragment) {
            super(0);
            this.f80113d = activationResultFragment;
        }

        /* renamed from: b */
        public final ActivationResultData invoke() {
            Parcelable parcelable = this.f80113d.requireArguments().getParcelable("EXTRA_RESULT_DATA");
            C41536l.m120486f(parcelable);
            return (ActivationResultData) parcelable;
        }
    }

    /* renamed from: j1 */
    private final C38494m m96080j1() {
        C38494m mVar = this.f80109d;
        C41536l.m120486f(mVar);
        return mVar;
    }

    /* renamed from: k1 */
    private final C37124a m96081k1() {
        return (C37124a) this.f80111f.getValue();
    }

    /* renamed from: l1 */
    private final ActivationResultData m96082l1() {
        return (ActivationResultData) this.f80110e.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public static final void m96083m1(ActivationResultFragment activationResultFragment, View view) {
        C41536l.m120489i(activationResultFragment, "this$0");
        activationResultFragment.m96084n1();
    }

    /* renamed from: n1 */
    private final void m96084n1() {
        Intent flags = new Intent(requireContext(), MainActivity.class).setFlags(872415232);
        C41536l.m120488h(flags, "Intent(requireContext(),…_SINGLE_TOP\n            )");
        startActivity(flags);
        C1505h activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f80109d = C38494m.m112991d(layoutInflater, viewGroup, false);
        ScrollView c = m96080j1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f80109d = null;
        C1505h activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41224m mVar;
        boolean z;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        refreshHeaderText(C32343x.m95388F(m96081k1().mo90090d0(), new Object[0]));
        m96080j1().f92241g.setTitleText(C32343x.m95388F(m96081k1().mo90081W(), new Object[0]));
        m96080j1().f92240f.setTitle(C32343x.m95388F(m96081k1().mo90082X(), new Object[0]));
        Button button = m96080j1().f92242h;
        button.setButtonText(C32343x.m95388F(m96081k1().mo90080V(), new Object[0]));
        button.setOnClickListener(new C38778a(this));
        C41224m[] mVarArr = new C41224m[5];
        mVarArr[0] = C41233s.m119492a(C32343x.m95388F(m96081k1().mo90084Z(), new Object[0]), C32343x.m95410Q(m96082l1().mo73545b(), m96082l1().mo73546d(), false, 2, (Object) null));
        mVarArr[1] = C41233s.m119492a(C32343x.m95388F(m96081k1().mo90089c0(), new Object[0]), m96082l1().mo73551g() + " " + C32343x.m95388F(m96081k1().mo90073O(), new Object[0]));
        mVarArr[2] = C41233s.m119492a(C32343x.m95388F(m96081k1().mo90087b0(), new Object[0]), String.valueOf(m96082l1().mo73550f()));
        C41224m mVar2 = null;
        if (m96082l1().mo73548e() != null) {
            String F = C32343x.m95388F(m96081k1().mo90085a0(), new Object[0]);
            Long e = m96082l1().mo73548e();
            C41536l.m120486f(e);
            mVar = C41233s.m119492a(F, C32319m.m95295b(e.longValue()));
        } else {
            mVar = null;
        }
        mVarArr[3] = mVar;
        if (m96082l1().mo73544a() != null) {
            mVar2 = C41233s.m119492a(C32343x.m95388F(m96081k1().mo90083Y(), new Object[0]), m96082l1().mo73544a());
        }
        mVarArr[4] = mVar2;
        List<C41224m> o = C41341q.m119912o(mVarArr);
        for (C41224m mVar3 : o) {
            String str = (String) mVar3.mo95675a();
            String str2 = (String) mVar3.mo95676b();
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            C41536l.m120488h(str2, C11755a.C11756a.f34100b);
            if (o.indexOf(mVar3) == o.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            C38779b bVar = new C38779b(requireContext, str, str2, z);
            LinearLayout linearLayout = m96080j1().f92239e;
            C41536l.m120488h(linearLayout, "binding.detailsContainer");
            linearLayout.addView(bVar);
        }
    }
}
