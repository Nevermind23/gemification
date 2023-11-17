package gs0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import he1.C41217g;
import he1.C41233s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.loans.presentation.model.OfferedPlanTypesUiModel;
import p725cr.C19788a;
import pr0.C37946c;
import ue1.C43064a;

/* renamed from: gs0.a */
public final class C36062a extends C19788a {

    /* renamed from: K */
    public static final C36063a f87186K = new C36063a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C37946c f87187H;

    /* renamed from: I */
    private final C41217g f87188I = C41219i.m119470b(new C36065c(this));

    /* renamed from: J */
    private final C41217g f87189J = C41219i.m119470b(new C36064b(this));

    /* renamed from: gs0.a$a */
    public static final class C36063a {
        private C36063a() {
        }

        public /* synthetic */ C36063a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C36062a mo88783a(String str, List list) {
            C41536l.m120489i(str, "title");
            C41536l.m120489i(list, "offeredPlanTypes");
            C36062a aVar = new C36062a();
            aVar.setArguments(C0908e.m3336b(C41233s.m119492a("TITLE_EXTRA", str), C41233s.m119492a("PLAN_TYPES_EXTRA", list)));
            return aVar;
        }
    }

    /* renamed from: gs0.a$b */
    static final class C36064b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36062a f87190d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36064b(C36062a aVar) {
            super(0);
            this.f87190d = aVar;
        }

        /* renamed from: b */
        public final List invoke() {
            Bundle arguments = this.f87190d.getArguments();
            ArrayList parcelableArrayList = arguments != null ? arguments.getParcelableArrayList("PLAN_TYPES_EXTRA") : null;
            return parcelableArrayList == null ? C41341q.m119907j() : parcelableArrayList;
        }
    }

    /* renamed from: gs0.a$c */
    static final class C36065c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36062a f87191d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36065c(C36062a aVar) {
            super(0);
            this.f87191d = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m107307c(C36062a aVar, OfferedPlanTypesUiModel offeredPlanTypesUiModel) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(offeredPlanTypesUiModel, "planType");
            C1533o.m5445b(aVar, "OFFERED_PLAN_TYPE_REQUEST_KEY", C0908e.m3336b(C41233s.m119492a("OFFERED_PLAN_TYPE_KEY", offeredPlanTypesUiModel)));
            aVar.mo4577k1();
        }

        /* renamed from: b */
        public final C36068d invoke() {
            return new C36068d(new C36066b(this.f87191d));
        }
    }

    /* renamed from: e2 */
    private final C37946c m107299e2() {
        C37946c cVar = this.f87187H;
        C41536l.m120486f(cVar);
        return cVar;
    }

    /* renamed from: f2 */
    private final List m107300f2() {
        return (List) this.f87189J.getValue();
    }

    /* renamed from: g2 */
    private final C36068d m107301g2() {
        return (C36068d) this.f87188I.getValue();
    }

    /* renamed from: h2 */
    private final void m107302h2() {
        m107299e2().f91095e.setAdapter(m107301g2());
        m107301g2().mo6029i(m107300f2());
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f87187H = C37946c.m111528d(getLayoutInflater(), viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f87187H = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        C41536l.m120489i(view, "view");
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("TITLE_EXTRA")) == null) {
            str = "";
        }
        mo26370a2(str);
        super.onViewCreated(view, bundle);
        m107302h2();
    }
}
