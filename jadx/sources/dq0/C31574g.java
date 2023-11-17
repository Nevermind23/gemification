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
import he1.C41238w;
import iq0.C36477b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lq0.C37124a;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p725cr.C19788a;
import sp0.C38486e;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: dq0.g */
public final class C31574g extends C19788a {

    /* renamed from: J */
    public static final C31575a f78149J = new C31575a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C38486e f78150H;

    /* renamed from: I */
    private final C41217g f78151I = C41219i.m119470b(new C31576b(this));

    /* renamed from: dq0.g$a */
    public static final class C31575a {
        private C31575a() {
        }

        public /* synthetic */ C31575a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C31574g mo71998a(List list, C37124a aVar) {
            C41536l.m120489i(list, "terms");
            C41536l.m120489i(aVar, C11769i.C11770a.f34151n);
            C31574g gVar = new C31574g();
            gVar.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_MONTH_LIST", new ArrayList(list)), C41233s.m119492a("EXTRA_KEYS", aVar)));
            return gVar;
        }
    }

    /* renamed from: dq0.g$b */
    static final class C31576b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31574g f78152d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31576b(C31574g gVar) {
            super(0);
            this.f78152d = gVar;
        }

        /* renamed from: b */
        public final C37124a invoke() {
            Serializable serializable = this.f78152d.requireArguments().getSerializable("EXTRA_KEYS");
            C41536l.m120487g(serializable, "null cannot be cast to non-null type ge.bog.mobilebank.loanactivation.presentation.activation.model.LoanType");
            return (C37124a) serializable;
        }
    }

    /* renamed from: dq0.g$c */
    static final class C31577c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31574g f78153d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31577c(C31574g gVar) {
            super(1);
            this.f78153d = gVar;
        }

        /* renamed from: a */
        public final void mo72000a(int i) {
            C1533o.m5445b(this.f78153d, "REQUEST_KEY_MONTH_CHOOSER", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_SELECTED_DAY_OF_MONTH", Integer.valueOf(i))));
            this.f78153d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72000a(((Number) obj).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: e2 */
    private final C38486e m93680e2() {
        C38486e eVar = this.f78150H;
        C41536l.m120486f(eVar);
        return eVar;
    }

    /* renamed from: f2 */
    private final C37124a m93681f2() {
        return (C37124a) this.f78151I.getValue();
    }

    /* renamed from: g2 */
    private final void m93682g2() {
        mo26370a2(C32343x.m95388F(m93681f2().mo90101k0(), new Object[0]));
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
    }

    /* renamed from: h2 */
    private final void m93683h2() {
        ArrayList<Integer> integerArrayList = requireArguments().getIntegerArrayList("EXTRA_MONTH_LIST");
        if (integerArrayList != null) {
            RecyclerView recyclerView = m93680e2().f92182e;
            C36477b bVar = new C36477b(m93681f2(), new C31577c(this));
            bVar.mo6029i(integerArrayList);
            recyclerView.setAdapter(bVar);
        }
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f78150H = C38486e.m112957d(layoutInflater, viewGroup, true);
        m93683h2();
        m93682g2();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f78150H = null;
    }
}
