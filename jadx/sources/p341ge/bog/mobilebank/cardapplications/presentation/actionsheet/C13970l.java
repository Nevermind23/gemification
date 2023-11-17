package p341ge.bog.mobilebank.cardapplications.presentation.actionsheet;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cardapplications.presentation.model.ScoolCardOwnerUiModel;
import p411em.C12487d;
import p481jm.C16224e;
import p621tm.C18026q;
import p725cr.C19788a;
import ue1.C43064a;
import x00.C29606a;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.l */
public final class C13970l extends C19788a {

    /* renamed from: K */
    public static final C13971a f41359K = new C13971a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C16224e f41360H;

    /* renamed from: I */
    private final C41217g f41361I = C41219i.m119470b(C13972b.f41363d);

    /* renamed from: J */
    private final C41217g f41362J = C41219i.m119470b(new C13973c(this));

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.l$a */
    public static final class C13971a {
        private C13971a() {
        }

        public /* synthetic */ C13971a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13970l mo39065a(List list) {
            C41536l.m120489i(list, "clientChildren");
            C13970l lVar = new C13970l();
            lVar.setArguments(C0908e.m3336b(C41233s.m119492a("CLIENT_CHILDREN", list)));
            return lVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.l$b */
    static final class C13972b extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C13972b f41363d = new C13972b();

        C13972b() {
            super(0);
        }

        /* renamed from: b */
        public final C18026q invoke() {
            return new C18026q();
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.l$c */
    static final class C13973c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C13970l f41364d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13973c(C13970l lVar) {
            super(0);
            this.f41364d = lVar;
        }

        /* renamed from: b */
        public final List invoke() {
            ArrayList arrayList;
            Bundle arguments = this.f41364d.getArguments();
            if (arguments != null) {
                arrayList = arguments.getParcelableArrayList("CLIENT_CHILDREN");
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                return arrayList;
            }
            List j = C41341q.m119907j();
            this.f41364d.mo4577k1();
            return j;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.l$d */
    public static final class C13974d extends C29606a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13974d(Context context, int i) {
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
    private final C18026q m51957f2() {
        return (C18026q) this.f41361I.getValue();
    }

    /* renamed from: g2 */
    private final C16224e m51958g2() {
        C16224e eVar = this.f41360H;
        C41536l.m120486f(eVar);
        return eVar;
    }

    /* renamed from: h2 */
    private final List m51959h2() {
        return (List) this.f41362J.getValue();
    }

    /* renamed from: i2 */
    private final void m51960i2() {
        m51958g2().f45793f.setAdapter(m51957f2());
        m51957f2().mo45720n(new C13969k(this));
        m51958g2().f45793f.mo5351j(new C13974d(requireContext(), C12487d.f37172u));
        m51957f2().mo6029i(m51959h2());
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public static final void m51961j2(C13970l lVar, ScoolCardOwnerUiModel scoolCardOwnerUiModel) {
        C41536l.m120489i(lVar, "this$0");
        C41536l.m120489i(scoolCardOwnerUiModel, "it");
        C1533o.m5445b(lVar, "REQUEST_KEY_SCHOOL_CARD_OWNER", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_SCHOOL_CARD_OWNER", scoolCardOwnerUiModel)));
        lVar.mo4577k1();
    }

    /* renamed from: k2 */
    private final void m51962k2() {
        mo26370a2(C32343x.m95388F("text.card.applications.schoolcard.actionsheet.title", new Object[0]));
        m51958g2().f45792e.setText(C32343x.m95388F("text.card.applications.schoolcard.actionsheet.description", new Object[0]));
        m51960i2();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f41360H = C16224e.m57825d(layoutInflater, viewGroup, true);
        m51962k2();
    }
}
