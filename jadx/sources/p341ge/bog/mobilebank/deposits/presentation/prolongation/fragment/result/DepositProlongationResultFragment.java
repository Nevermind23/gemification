package p341ge.bog.mobilebank.deposits.presentation.prolongation.fragment.result;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.C0767a;
import g91.C32343x;
import he1.C41217g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mc0.C26180a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.designsystem.components.pagestate.PageStateType;
import p341ge.bog.mobilebank.deposits.presentation.prolongation.fragment.result.C23292a;
import p642vh.C18358g;
import q31.C38122f;
import q31.C38125h;
import rb0.C27983b;
import rb0.C27984c;
import rb0.C27988g;
import rb0.C27989h;
import ue1.C43064a;
import xb0.C29724l;

/* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.result.DepositProlongationResultFragment */
public final class DepositProlongationResultFragment extends C23295b {

    /* renamed from: g */
    private C29724l f60908g;

    /* renamed from: h */
    private final C41217g f60909h = C41219i.m119470b(new C23290b(this));

    /* renamed from: i */
    private final C41217g f60910i = C41219i.m119470b(C23289a.f60911d);

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.result.DepositProlongationResultFragment$a */
    static final class C23289a extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C23289a f60911d = new C23289a();

        C23289a() {
            super(0);
        }

        /* renamed from: b */
        public final C23292a invoke() {
            return new C23292a();
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.result.DepositProlongationResultFragment$b */
    static final class C23290b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DepositProlongationResultFragment f60912d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23290b(DepositProlongationResultFragment depositProlongationResultFragment) {
            super(0);
            this.f60912d = depositProlongationResultFragment;
        }

        /* renamed from: b */
        public final DepositProlongationResultFragmentArgs invoke() {
            DepositProlongationResultFragmentArgs depositProlongationResultFragmentArgs;
            Bundle arguments = this.f60912d.getArguments();
            if (arguments != null && (depositProlongationResultFragmentArgs = (DepositProlongationResultFragmentArgs) arguments.getParcelable(this.f60912d.getString(C27988g.deposit_prolongation_result_fragment_args_key))) != null) {
                return depositProlongationResultFragmentArgs;
            }
            throw new NullPointerException("arguments cannot be null");
        }
    }

    /* renamed from: j1 */
    private final C23292a m75210j1() {
        return (C23292a) this.f60910i.getValue();
    }

    /* renamed from: k1 */
    private final DepositProlongationResultFragmentArgs m75211k1() {
        return (DepositProlongationResultFragmentArgs) this.f60909h.getValue();
    }

    /* renamed from: l1 */
    private final C29724l m75212l1() {
        C29724l lVar = this.f60908g;
        C41536l.m120486f(lVar);
        return lVar;
    }

    /* renamed from: m1 */
    private final List m75213m1() {
        LinkedHashMap a = m75211k1().mo58249a();
        ArrayList arrayList = new ArrayList(a.size());
        for (Map.Entry entry : a.entrySet()) {
            arrayList.add(new C23292a.C23293a((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    /* renamed from: n1 */
    private final void m75214n1() {
        C29724l l1 = m75212l1();
        l1.f75113g.setTitle(C32343x.m95388F("deposit.prolong.success.deposit.details.header", new Object[0]));
        l1.f75112f.mo5351j(new C13364a(C0767a.m2895e(requireContext(), C27984c.f71248y)));
        l1.f75112f.setAdapter(m75210j1());
        m75210j1().mo6029i(m75213m1());
    }

    /* renamed from: o1 */
    private final void m75215o1() {
        C29724l l1 = m75212l1();
        String b = m75211k1().mo58250b();
        if (b != null) {
            InlineFeedback2 inlineFeedback2 = l1.f75114h;
            C41536l.m120488h(inlineFeedback2, "inlineFeedback");
            C32343x.m95407O0(inlineFeedback2);
            l1.f75114h.setDescription(b);
        }
        Button button = l1.f75115i;
        button.setButtonText(C32343x.m95388F("deposit.prolong.success.home", new Object[0]));
        button.setOnClickListener(new C26180a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public static final void m75216p1(DepositProlongationResultFragment depositProlongationResultFragment, View view) {
        C41536l.m120489i(depositProlongationResultFragment, "this$0");
        Context requireContext = depositProlongationResultFragment.requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38122f c = C38125h.m112238c(requireContext);
        Context requireContext2 = depositProlongationResultFragment.requireContext();
        C41536l.m120488h(requireContext2, "requireContext()");
        C38122f.C38123a.m112215k(c, requireContext2, (String) null, (Bundle) null, 6, (Object) null);
    }

    /* renamed from: q1 */
    private final void m75217q1() {
        PageStateType.Success success = new PageStateType.Success(new Image.Resource(C27984c.f71238m, (Boolean) null, 2, (DefaultConstructorMarker) null), C27989h.f71309a, (Color) null, C18358g.m62729c(C27983b.f71229l), 4, (DefaultConstructorMarker) null);
        PageState pageState = m75212l1().f75116j;
        pageState.setPageStateType(success);
        pageState.setTitleText(m75211k1().mo58251d());
    }

    /* renamed from: r1 */
    private final void m75218r1() {
        m75217q1();
        m75215o1();
        m75214n1();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f60908g = C29724l.m90263d(layoutInflater, viewGroup, false);
        CoordinatorLayout c = m75212l1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f60908g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m75218r1();
    }
}
