package dq0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import androidx.recyclerview.widget.RecyclerView;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import iq0.C36481c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lq0.C37124a;
import p725cr.C19788a;
import sp0.C38485d;
import ue1.C43064a;

/* renamed from: dq0.f */
public final class C31571f extends C19788a {

    /* renamed from: J */
    public static final C31572a f78145J = new C31572a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C38485d f78146H;

    /* renamed from: I */
    private final C41217g f78147I = C41219i.m119470b(new C31573b(this));

    /* renamed from: dq0.f$a */
    public static final class C31572a {
        private C31572a() {
        }

        public /* synthetic */ C31572a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C31571f mo71996a(List list, C37124a aVar) {
            C41536l.m120489i(list, "terms");
            C41536l.m120489i(aVar, C11769i.C11770a.f34151n);
            C31571f fVar = new C31571f();
            fVar.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_PAY_DAYS", new ArrayList(list)), C41233s.m119492a("EXTRA_KEYS", aVar)));
            return fVar;
        }
    }

    /* renamed from: dq0.f$b */
    static final class C31573b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31571f f78148d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31573b(C31571f fVar) {
            super(0);
            this.f78148d = fVar;
        }

        /* renamed from: b */
        public final C37124a invoke() {
            Serializable serializable = this.f78148d.requireArguments().getSerializable("EXTRA_KEYS");
            C41536l.m120487g(serializable, "null cannot be cast to non-null type ge.bog.mobilebank.loanactivation.presentation.activation.model.LoanType");
            return (C37124a) serializable;
        }
    }

    /* renamed from: f2 */
    private final C38485d m93672f2() {
        C38485d dVar = this.f78146H;
        C41536l.m120486f(dVar);
        return dVar;
    }

    /* renamed from: g2 */
    private final C37124a m93673g2() {
        return (C37124a) this.f78147I.getValue();
    }

    /* renamed from: h2 */
    private final void m93674h2() {
        mo26370a2(C32343x.m95388F(m93673g2().mo90104m0(), new Object[0]));
        m93672f2().f92179e.setText(C32343x.m95388F(m93673g2().mo90103l0(), new Object[0]));
    }

    /* renamed from: i2 */
    private final void m93675i2() {
        ArrayList<Integer> integerArrayList = requireArguments().getIntegerArrayList("EXTRA_PAY_DAYS");
        if (integerArrayList != null) {
            RecyclerView recyclerView = m93672f2().f92180f;
            C36481c cVar = new C36481c(new C31570e(this));
            cVar.mo6029i(integerArrayList);
            recyclerView.setAdapter(cVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public static final void m93676j2(C31571f fVar, int i) {
        C41536l.m120489i(fVar, "this$0");
        C1533o.m5445b(fVar, "REQUEST_KEY_SELECTED_POSITION", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_SELECTED_POSITION", Integer.valueOf(i))));
        fVar.mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f78146H = C38485d.m112953d(layoutInflater, viewGroup, true);
        m93675i2();
        m93674h2();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f78146H = null;
    }
}
