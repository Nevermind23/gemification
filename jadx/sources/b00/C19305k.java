package b00;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p90.C27423s7;

/* renamed from: b00.k */
public final class C19305k extends C19298f {

    /* renamed from: L */
    public static final C19306a f53530L = new C19306a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C27423s7 f53531K;

    /* renamed from: b00.k$a */
    public static final class C19306a {
        private C19306a() {
        }

        public /* synthetic */ C19306a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C19305k mo47528a() {
            return new C19305k();
        }
    }

    /* renamed from: f2 */
    private final C27423s7 m64770f2() {
        C27423s7 s7Var = this.f53531K;
        C41536l.m120486f(s7Var);
        return s7Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public static final void m64771g2(BogTextView bogTextView, View view) {
        C41536l.m120489i(bogTextView, "$this_apply");
        OffersAndApplicationsActivity.C21371b bVar = OffersAndApplicationsActivity.f57206M;
        Context context = bogTextView.getContext();
        C41536l.m120488h(context, "context");
        OffersAndApplicationsActivity.C21371b.m69137b(bVar, context, false, 2, (Object) null);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f53531K = C27423s7.m85003d(layoutInflater, viewGroup, true);
        mo26370a2(C32343x.m95388F("applications.existing.app.action.sheet.header", new Object[0]));
        m64770f2().f69802f.setText(C32343x.m95388F("applications.existing.app.action.sheet.info.text", new Object[0]));
        BogTextView bogTextView = m64770f2().f69801e;
        bogTextView.setText(C32343x.m95388F("applications.existing.app.action.sheet.button", new Object[0]));
        bogTextView.setOnClickListener(new C19304j(bogTextView));
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f53531K = null;
    }
}
