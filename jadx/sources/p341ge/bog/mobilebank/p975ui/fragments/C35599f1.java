package p341ge.bog.mobilebank.p975ui.fragments;

import android.os.Bundle;
import android.view.View;
import g91.C32303f;
import g91.C32335t0;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;
import r90.C27950a;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.ui.fragments.f1 */
public final class C35599f1 extends C35651n1 {

    /* renamed from: d */
    private final C41217g f86081d = C41219i.m119470b(new C35600a(this));

    /* renamed from: e */
    private final C41217g f86082e = C41219i.m119470b(new C35601b(this));

    /* renamed from: f */
    public String f86083f;

    /* renamed from: ge.bog.mobilebank.ui.fragments.f1$a */
    static final class C35600a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C35599f1 f86084d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35600a(C35599f1 f1Var) {
            super(0);
            this.f86084d = f1Var;
        }

        /* renamed from: b */
        public final BogTextView invoke() {
            return (BogTextView) this.f86084d.findView(C10322k.pension_details_description);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.f1$b */
    static final class C35601b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C35599f1 f86085d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35601b(C35599f1 f1Var) {
            super(0);
            this.f86085d = f1Var;
        }

        /* renamed from: b */
        public final BogTextView invoke() {
            return (BogTextView) this.f86085d.findView(C10322k.pension_link);
        }
    }

    /* renamed from: k1 */
    private final BogTextView m105739k1() {
        Object value = this.f86081d.getValue();
        C41536l.m120488h(value, "<get-description>(...)");
        return (BogTextView) value;
    }

    /* renamed from: l1 */
    private final BogTextView m105740l1() {
        Object value = this.f86082e.getValue();
        C41536l.m120488h(value, "<get-link>(...)");
        return (BogTextView) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public static final void m105741n1(C35599f1 f1Var, View view) {
        C41536l.m120489i(f1Var, "this$0");
        f1Var.mo86673m1();
    }

    /* renamed from: j1 */
    public final String mo86672j1() {
        String str = this.f86083f;
        if (str != null) {
            return str;
        }
        C41536l.m120506z("actualLink");
        return null;
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_pension_details;
    }

    /* renamed from: m1 */
    public final void mo86673m1() {
        C32303f.m95184D(mo86672j1(), requireActivity());
    }

    /* renamed from: o1 */
    public final void mo86674o1(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f86083f = str;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m105740l1().setText(C27950a.m86287d("link.georgian.pension.funds.website.title", false, 2, (Object) null));
        mo86674o1(C27950a.m86287d("link.georgian.pension.funds.website", false, 2, (Object) null));
        m105740l1().setTextColor(C32335t0.m95358c(getActivity()));
        m105739k1().setText(C27950a.m86287d("text.georgian.pension.funds.meaning", false, 2, (Object) null));
        findView(C10322k.pension_link).setOnClickListener(new C35596e1(this));
    }
}
