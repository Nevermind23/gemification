package p341ge.bog.mobilebank.p975ui.fragments;

import a91.C30901l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import c91.C31310i;
import g91.C32343x;
import he1.C41217g;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogEditText;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10324m;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.ui.fragments.r1 */
public final class C35664r1<T extends AdvancedWizardActivity> extends C31310i<T> {
    /* access modifiers changed from: private */

    /* renamed from: x */
    public List f86219x;

    /* renamed from: y */
    private final C41217g f86220y = C41219i.m119470b(new C35665a(this));

    /* renamed from: ge.bog.mobilebank.ui.fragments.r1$a */
    static final class C35665a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C35664r1 f86221d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35665a(C35664r1 r1Var) {
            super(0);
            this.f86221d = r1Var;
        }

        /* renamed from: b */
        public final C30901l invoke() {
            return new C30901l(this.f86221d.f86219x, this.f86221d.f77729v, this.f86221d);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.r1$b */
    static final class C35666b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C35664r1 f86222d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35666b(C35664r1 r1Var) {
            super(1);
            this.f86222d = r1Var;
        }

        /* renamed from: a */
        public final void mo86756a(String str) {
            boolean z;
            ArrayList arrayList;
            C41536l.m120489i(str, "text");
            C35664r1 r1Var = this.f86222d;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                List C1 = this.f86222d.mo71621C1();
                C41536l.m120488h(C1, "selectorOptions");
                arrayList = new ArrayList();
                for (Object next : C1) {
                    String str2 = (String) next;
                    C41536l.m120488h(str2, "it");
                    String lowerCase = str2.toLowerCase();
                    C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase()");
                    String lowerCase2 = str.toLowerCase();
                    C41536l.m120488h(lowerCase2, "this as java.lang.String).toLowerCase()");
                    if (C40440x.m117139M(lowerCase, lowerCase2, false, 2, (Object) null)) {
                        arrayList.add(next);
                    }
                }
            } else {
                List<String> C12 = this.f86222d.mo71621C1();
                C41536l.m120488h(C12, "selectorOptions");
                arrayList = new ArrayList(C41343r.m119925u(C12, 10));
                for (String add : C12) {
                    arrayList.add(add);
                }
            }
            r1Var.f86219x = arrayList;
            this.f86222d.m105907m2().mo71117q(this.f86222d.f86219x);
            this.f86222d.m105907m2().notifyDataSetChanged();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86756a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public final C30901l m105907m2() {
        return (C30901l) this.f86220y.getValue();
    }

    /* renamed from: n2 */
    private final BogInputLayout m105908n2() {
        View inflate = getLayoutInflater().inflate(C10324m.selector_fragment_input_layout, (ViewGroup) null, false);
        C41536l.m120487g(inflate, "null cannot be cast to non-null type ge.bog.mobilebank.ui.views.widgets.BogInputLayout");
        return (BogInputLayout) inflate;
    }

    /* renamed from: Z0 */
    public void mo48298Z0(int i) {
        int size = mo71621C1().size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            List list = this.f86219x;
            C41536l.m120486f(list);
            if (C41536l.m120484d(list.get(i), mo71621C1().get(i2))) {
                mo71717U1(String.valueOf(i2));
                break;
            }
            i2++;
        }
        if (!(mo71707D1() == null || mo71621C1() == null)) {
            WizardObject D1 = mo71707D1();
            C41536l.m120486f(D1);
            D1.setVisibleInput((String) mo71621C1().get(i));
        }
        this.f77883f.mo87965p3(true);
        this.f77742w.mo87835L3(mo71734s1());
    }

    /* access modifiers changed from: protected */
    /* renamed from: f2 */
    public RecyclerView.C1736h mo67193f2() {
        List<String> C1 = mo71621C1();
        C41536l.m120488h(C1, "selectorOptions");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(C1, 10));
        for (String add : C1) {
            arrayList.add(add);
        }
        this.f86219x = arrayList;
        m105907m2().mo71118r(mo71707D1().isSelectByString());
        return m105907m2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h2 */
    public void mo71550h2() {
        super.mo71550h2();
        this.f77890m.setVisibility(8);
        if (this.f77892o.getChildCount() == 2) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int i = C10319h.payment_wizard_left_margin;
            layoutParams.leftMargin = C32343x.m95422W(i);
            layoutParams.rightMargin = C32343x.m95422W(i);
            layoutParams.topMargin = C32343x.m95394I(10);
            BogInputLayout n2 = m105908n2();
            this.f77892o.addView(n2, 0, layoutParams);
            n2.hideUnderHint();
            n2.setRightDrawable(C10320i.ic_action_search);
            BogEditText editText = n2.getEditText();
            C41536l.m120488h(editText, "searchInputLayout.editText");
            C32343x.m95457j(editText, new C35666b(this));
        }
    }

    public void onAttach(Context context) {
        C41536l.m120489i(context, "context");
        super.onAttach(context);
        this.f77742w.setTitle(mo71707D1().getInputTitle());
    }
}
