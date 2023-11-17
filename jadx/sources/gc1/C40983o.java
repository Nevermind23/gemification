package gc1;

import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import ba1.C10145d;
import ba1.C10146d0;
import gc1.C40967f;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.sso_client.passwordrecovery.C41043s0;
import ua1.C28673q0;
import ue1.C43064a;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: gc1.o */
public final class C40983o extends Fragment {

    /* renamed from: h */
    public static final C40984a f96774h = new C40984a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C28673q0 f96775d;

    /* renamed from: e */
    private final C41217g f96776e = C41219i.m119469a(C41222k.NONE, new C40989f(this, (C41806a) null, (C43064a) null, new C40988e(this), (C43064a) null));

    /* renamed from: f */
    private final C41217g f96777f = C41219i.m119469a(C41222k.SYNCHRONIZED, new C40987d(this, (C41806a) null, (C43064a) null));

    /* renamed from: g */
    private final C41217g f96778g = C41219i.m119470b(new C40986c(this));

    /* renamed from: gc1.o$a */
    public static final class C40984a {
        private C40984a() {
        }

        public /* synthetic */ C40984a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C40983o mo95374a(C40967f fVar) {
            C41536l.m120489i(fVar, "config");
            C40983o oVar = new C40983o();
            oVar.setArguments(C0908e.m3336b(C41233s.m119492a("CONFIG_KEY", Integer.valueOf(fVar.ordinal()))));
            return oVar;
        }
    }

    /* renamed from: gc1.o$b */
    public /* synthetic */ class C40985b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f96779a;

        static {
            int[] iArr = new int[C40967f.values().length];
            iArr[C40967f.CONTACT.ordinal()] = 1;
            f96779a = iArr;
        }
    }

    /* renamed from: gc1.o$c */
    static final class C40986c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C40983o f96780d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40986c(C40983o oVar) {
            super(0);
            this.f96780d = oVar;
        }

        /* renamed from: b */
        public final C40967f invoke() {
            C40967f.C40968a aVar = C40967f.f96746d;
            Bundle arguments = this.f96780d.getArguments();
            return aVar.mo95367a(arguments != null ? arguments.getInt("CONFIG_KEY") : 0);
        }
    }

    /* renamed from: gc1.o$d */
    public static final class C40987d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f96781d;

        /* renamed from: e */
        final /* synthetic */ C41806a f96782e;

        /* renamed from: f */
        final /* synthetic */ C43064a f96783f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40987d(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f96781d = componentCallbacks;
            this.f96782e = aVar;
            this.f96783f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f96781d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f96782e, this.f96783f);
        }
    }

    /* renamed from: gc1.o$e */
    public static final class C40988e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f96784d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40988e(Fragment fragment) {
            super(0);
            this.f96784d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f96784d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f96784d.requireActivity());
        }
    }

    /* renamed from: gc1.o$f */
    public static final class C40989f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f96785d;

        /* renamed from: e */
        final /* synthetic */ C41806a f96786e;

        /* renamed from: f */
        final /* synthetic */ C43064a f96787f;

        /* renamed from: g */
        final /* synthetic */ C43064a f96788g;

        /* renamed from: h */
        final /* synthetic */ C43064a f96789h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40989f(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f96785d = fragment;
            this.f96786e = aVar;
            this.f96787f = aVar2;
            this.f96788g = aVar3;
            this.f96789h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f96785d, this.f96786e, this.f96787f, this.f96788g, C41520a0.m120436b(C41043s0.class), this.f96789h);
        }
    }

    /* renamed from: i1 */
    private final C28673q0 m118804i1() {
        C28673q0 q0Var = this.f96775d;
        C41536l.m120486f(q0Var);
        return q0Var;
    }

    /* renamed from: j1 */
    private final C10146d0.C10172e m118805j1() {
        return (C10146d0.C10172e) this.f96777f.getValue();
    }

    /* renamed from: k1 */
    private final String m118806k1(C40967f fVar) {
        if (C40985b.f96779a[fVar.ordinal()] == 1) {
            return C10145d.m37089c("text.password.recovery.contacts.conditions", m118805j1());
        }
        return C10145d.m37089c("text.password.recovery.transactions.conditions", m118805j1());
    }

    /* renamed from: l1 */
    private final C40967f m118807l1() {
        return (C40967f) this.f96778g.getValue();
    }

    /* renamed from: m1 */
    private final String m118808m1(C40967f fVar) {
        if (C40985b.f96779a[fVar.ordinal()] == 1) {
            return C10145d.m37089c("text.password.recovery.contacts.process.name", m118805j1());
        }
        return C10145d.m37089c("text.password.recovery.transactions.process.name", m118805j1());
    }

    /* renamed from: n1 */
    private final C41043s0 m118809n1() {
        return (C41043s0) this.f96776e.getValue();
    }

    /* renamed from: o1 */
    private final void m118810o1() {
        m118804i1().f72895e.setOnClickListener(new C40982n(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public static final void m118811p1(C40983o oVar, View view) {
        C41536l.m120489i(oVar, "this$0");
        oVar.m118809n1().mo95449ky();
    }

    /* renamed from: q1 */
    private final void m118812q1() {
        m118804i1().f72896f.setTitle(m118808m1(m118807l1()));
        m118804i1().f72896f.setText(m118806k1(m118807l1()));
        m118804i1().f72895e.setButtonText(C10145d.m37089c("text.password.recovery.info.page.start.button", m118805j1()));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f96775d = C28673q0.m87806d(getLayoutInflater());
        LinearLayout c = m118804i1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f96775d = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m118812q1();
        m118810o1();
    }
}
