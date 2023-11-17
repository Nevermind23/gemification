package zb1;

import ah1.C40314b;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1619q;
import ba1.C10145d;
import ba1.C10146d0;
import ba1.C10195g0;
import ba1.C10220y;
import fh1.C40951a;
import gb1.C32392v;
import gh1.C41125a;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import ib1.C36382c1;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb1.C37120b;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.sso_client.models.C35947l;
import ua1.C28689w;
import ue1.C43064a;
import ue1.C43075l;
import yg1.C43399a;

/* renamed from: zb1.c */
public final class C40231c extends Fragment {

    /* renamed from: h */
    public static final C40232a f95610h = new C40232a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f95611d = C41219i.m119469a(C41222k.NONE, new C40237f(this, (C41806a) null, (C43064a) null, new C40236e(this), (C43064a) null));

    /* renamed from: e */
    private C28689w f95612e;

    /* renamed from: f */
    private final C10146d0.C10172e f95613f = ((C10146d0.C10172e) new C40238g().mo94190b());
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C37120b f95614g;

    /* renamed from: zb1.c$a */
    public static final class C40232a {
        private C40232a() {
        }

        public /* synthetic */ C40232a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C40231c mo94184a() {
            return new C40231c();
        }
    }

    /* renamed from: zb1.c$b */
    static final class C40233b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C40231c f95615d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40233b(C40231c cVar) {
            super(1);
            this.f95615d = cVar;
        }

        /* renamed from: a */
        public final void mo94185a(C37120b bVar) {
            C41536l.m120489i(bVar, "it");
            this.f95615d.m116543s1(false, (C37120b) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo94185a((C37120b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: zb1.c$c */
    static final class C40234c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C40231c f95616d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40234c(C40231c cVar) {
            super(1);
            this.f95616d = cVar;
        }

        /* renamed from: a */
        public final void mo94186a(boolean z) {
            C40231c cVar = this.f95616d;
            cVar.m116543s1(z, cVar.f95614g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo94186a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: zb1.c$d */
    static final class C40235d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C40231c f95617d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40235d(C40231c cVar) {
            super(1);
            this.f95617d = cVar;
        }

        /* renamed from: a */
        public final void mo94187a(C35947l.C35949b bVar) {
            C41536l.m120489i(bVar, "it");
            this.f95617d.m116543s1(false, (C37120b) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo94187a((C35947l.C35949b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: zb1.c$e */
    public static final class C40236e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f95618d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40236e(Fragment fragment) {
            super(0);
            this.f95618d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f95618d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f95618d.requireActivity());
        }
    }

    /* renamed from: zb1.c$f */
    public static final class C40237f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f95619d;

        /* renamed from: e */
        final /* synthetic */ C41806a f95620e;

        /* renamed from: f */
        final /* synthetic */ C43064a f95621f;

        /* renamed from: g */
        final /* synthetic */ C43064a f95622g;

        /* renamed from: h */
        final /* synthetic */ C43064a f95623h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40237f(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f95619d = fragment;
            this.f95620e = aVar;
            this.f95621f = aVar2;
            this.f95622g = aVar3;
            this.f95623h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f95619d, this.f95620e, this.f95621f, this.f95622g, C41520a0.m120436b(C36382c1.class), this.f95623h);
        }
    }

    /* renamed from: zb1.c$g */
    public static final class C40238g implements C41125a {

        /* renamed from: a */
        private final Object f95624a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo94190b() {
            return this.f95624a;
        }
    }

    /* renamed from: l1 */
    private final void m116536l1() {
        m116541q1().f73021e.setOnClickListener(new C40229a(this));
        m116541q1().f73022f.setOnClickListener(new C40230b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public static final void m116537m1(C40231c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        C37120b bVar = C37120b.ID_CARD;
        cVar.f95614g = bVar;
        cVar.m116542r1().mo89186qy(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public static final void m116538n1(C40231c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        C37120b bVar = C37120b.PASSPORT;
        cVar.f95614g = bVar;
        cVar.m116542r1().mo89186qy(bVar);
    }

    /* renamed from: o1 */
    private final void m116539o1() {
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C32392v.m95653e(m116542r1().mo89123Ax().mo89124Br(), viewLifecycleOwner, new C40233b(this), new C40234c(this), new C40235d(this));
    }

    /* renamed from: p1 */
    private final String m116540p1(String str, int i) {
        String a;
        C10195g0 g = this.f95613f.mo26716g();
        if (g != null && (a = g.mo26763a(str, new Object[0])) != null) {
            return a;
        }
        String string = getString(i);
        C41536l.m120488h(string, "getString(resId)");
        return string;
    }

    /* renamed from: q1 */
    private final C28689w m116541q1() {
        C28689w wVar = this.f95612e;
        C41536l.m120486f(wVar);
        return wVar;
    }

    /* renamed from: r1 */
    private final C36382c1 m116542r1() {
        return (C36382c1) this.f95611d.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public final void m116543s1(boolean z, C37120b bVar) {
        boolean z2;
        Button button = m116541q1().f73022f;
        boolean z3 = false;
        if (!z || bVar != C37120b.PASSPORT) {
            z2 = false;
        } else {
            z2 = true;
        }
        button.setLoading(z2);
        Button button2 = m116541q1().f73021e;
        if (z && bVar == C37120b.ID_CARD) {
            z3 = true;
        }
        button2.setLoading(z3);
        m116541q1().f73022f.setEnabled(!z);
        m116541q1().f73021e.setEnabled(!z);
    }

    /* renamed from: t1 */
    private final void m116544t1() {
        m116541q1().f73023g.setTitle(C10145d.m37089c("text.do.choose.document.description", this.f95613f));
        m116541q1().f73021e.setButtonText(m116540p1("text.do.choose.document.id.card", C10220y.onboarding_document_id_card));
        m116541q1().f73022f.setButtonText(m116540p1("text.do.choose.document.passport", C10220y.onboarding_document_passport));
        m116536l1();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f95614g = null;
        this.f95612e = C28689w.m87874d(layoutInflater, viewGroup, false);
        m116544t1();
        m116539o1();
        ConstraintLayout c = m116541q1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f95612e = null;
    }
}
