package p341ge.bog.mobilebank.bnpl.presentation.offers.details;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import he1.C41233s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p536nl.C17048a;
import p687yl.C18952f;
import p701zl.C19071j;
import p725cr.C19788a;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.details.d */
public final class C13898d extends C19788a {

    /* renamed from: I */
    public static final C13899a f41239I = new C13899a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C17048a f41240H;

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.details.d$a */
    public static final class C13899a {
        private C13899a() {
        }

        public /* synthetic */ C13899a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13898d mo38320a(List list) {
            C41536l.m120489i(list, "shops");
            C13898d dVar = new C13898d();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ARGS_SHOPS", new ArrayList(list));
            dVar.setArguments(bundle);
            return dVar;
        }
    }

    /* renamed from: f2 */
    private final C17048a m51789f2() {
        C17048a aVar = this.f41240H;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* renamed from: g2 */
    private final void m51790g2() {
        mo26370a2(C32343x.m95388F("text.bnpl.merchant.address.name", new Object[0]));
        m51789f2().f47555e.setText(C32343x.m95388F("text.bnpl.merchant.address.description", new Object[0]));
    }

    /* renamed from: h2 */
    private final void m51791h2() {
        ArrayList<String> stringArrayList;
        Bundle arguments = getArguments();
        if (arguments != null && (stringArrayList = arguments.getStringArrayList("ARGS_SHOPS")) != null) {
            RecyclerView recyclerView = m51789f2().f47556f;
            C18952f fVar = new C18952f(new C19071j(this));
            fVar.mo6029i(stringArrayList);
            recyclerView.setAdapter(fVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m51792i2(C13898d dVar, int i) {
        C41536l.m120489i(dVar, "this$0");
        C1533o.m5445b(dVar, "REQUEST_KEY_SELECTED_POSITION", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_SELECTED_POSITION", Integer.valueOf(i))));
        dVar.mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f41240H = C17048a.m59893d(layoutInflater, viewGroup, true);
        m51790g2();
        m51791h2();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f41240H = null;
    }
}
