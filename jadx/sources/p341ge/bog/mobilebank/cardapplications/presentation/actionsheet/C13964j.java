package p341ge.bog.mobilebank.cardapplications.presentation.actionsheet;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPayrollInfoUiModel;
import p411em.C12487d;
import p481jm.C16224e;
import p621tm.C18015l;
import p725cr.C19788a;
import ue1.C43064a;
import x00.C29606a;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.j */
public final class C13964j extends C19788a {

    /* renamed from: J */
    public static final C13965a f41353J = new C13965a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C16224e f41354H;

    /* renamed from: I */
    private final C41217g f41355I = C41219i.m119470b(new C13966b(this));

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.j$a */
    public static final class C13965a {
        private C13965a() {
        }

        public /* synthetic */ C13965a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13964j mo39059a(List list) {
            C41536l.m120489i(list, "organizations");
            C13964j jVar = new C13964j();
            jVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_ORGANIZATIONS", list.toArray(new DebitCardPayrollInfoUiModel[0]))));
            return jVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.j$b */
    static final class C13966b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C13964j f41356d;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.j$b$a */
        /* synthetic */ class C13967a implements C18015l.C18016a, C41532h {

            /* renamed from: a */
            final /* synthetic */ C13964j f41357a;

            C13967a(C13964j jVar) {
                this.f41357a = jVar;
            }

            /* renamed from: a */
            public final void mo39061a(DebitCardPayrollInfoUiModel debitCardPayrollInfoUiModel) {
                C41536l.m120489i(debitCardPayrollInfoUiModel, "p0");
                this.f41357a.m51948h2(debitCardPayrollInfoUiModel);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C18015l.C18016a) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f41357a, C13964j.class, "onOrganizationSelected", "onOrganizationSelected(Lge/bog/mobilebank/cardapplications/presentation/model/DebitCardPayrollInfoUiModel;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13966b(C13964j jVar) {
            super(0);
            this.f41356d = jVar;
        }

        /* renamed from: b */
        public final C18015l invoke() {
            return new C18015l(new C13967a(this.f41356d));
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.j$c */
    public static final class C13968c extends C29606a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13968c(Context context, int i) {
            super(context, i);
            C41536l.m120488h(context, "requireContext()");
        }

        /* renamed from: j */
        public boolean mo39050j(View view, RecyclerView recyclerView) {
            C41536l.m120489i(view, "view");
            C41536l.m120489i(recyclerView, "parent");
            int k0 = recyclerView.mo5355k0(view);
            RecyclerView.C1736h adapter = recyclerView.getAdapter();
            if (k0 == -1 || adapter == null || k0 == adapter.getItemCount() - 1) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: f2 */
    private final C18015l m51946f2() {
        return (C18015l) this.f41355I.getValue();
    }

    /* renamed from: g2 */
    private final C16224e m51947g2() {
        C16224e eVar = this.f41354H;
        C41536l.m120486f(eVar);
        return eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public final void m51948h2(DebitCardPayrollInfoUiModel debitCardPayrollInfoUiModel) {
        C1533o.m5445b(this, "REQUEST_KEY_SELECTED_ORG", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_SELECTED_ORG", debitCardPayrollInfoUiModel)));
        mo4577k1();
    }

    /* renamed from: i2 */
    private final void m51949i2() {
        List list;
        Parcelable[] parcelableArray;
        mo26370a2(C32343x.m95388F("text.card.applications.payroll.actionsheet.title", new Object[0]));
        m51947g2().f45792e.setText(C32343x.m95388F("text.card.applications.payroll.actionsheet.description", new Object[0]));
        m51947g2().f45793f.setAdapter(m51946f2());
        m51947g2().f45793f.mo5351j(new C13968c(requireContext(), C12487d.f37172u));
        Bundle arguments = getArguments();
        C41238w wVar = null;
        if (arguments == null || (parcelableArray = arguments.getParcelableArray("ARG_ORGANIZATIONS")) == null) {
            list = null;
        } else {
            list = C41333m.m119788O(parcelableArray);
        }
        if (!(list instanceof List)) {
            list = null;
        }
        if (list != null) {
            m51946f2().mo6029i(list);
            wVar = C41238w.f97225a;
        }
        if (wVar == null) {
            mo4577k1();
        }
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f41354H = C16224e.m57825d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f41354H = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m51949i2();
    }
}
