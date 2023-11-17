package gc1;

import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.C0767a;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10145d;
import ba1.C10146d0;
import ba1.C10214s;
import gc1.C40957b;
import gc1.C40967f;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.countdowntimer.CountDownTimerView;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.sso_client.passwordrecovery.C41043s0;
import ua1.C28670p0;
import ue1.C43064a;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: gc1.m */
public final class C40975m extends Fragment implements C40957b.C40960c {

    /* renamed from: i */
    public static final C40976a f96756i = new C40976a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C28670p0 f96757d;

    /* renamed from: e */
    private final C41217g f96758e = C41219i.m119469a(C41222k.SYNCHRONIZED, new C40979d(this, (C41806a) null, (C43064a) null));

    /* renamed from: f */
    private final C41217g f96759f = C41219i.m119469a(C41222k.NONE, new C40981f(this, (C41806a) null, (C43064a) null, new C40980e(this), (C43064a) null));

    /* renamed from: g */
    private final C40957b f96760g = new C40957b(this);

    /* renamed from: h */
    private final C41217g f96761h = C41219i.m119470b(new C40978c(this));

    /* renamed from: gc1.m$a */
    public static final class C40976a {
        private C40976a() {
        }

        public /* synthetic */ C40976a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C40975m mo95369a(C40967f fVar) {
            C41536l.m120489i(fVar, "config");
            C40975m mVar = new C40975m();
            mVar.setArguments(C0908e.m3336b(C41233s.m119492a("CONFIG_KEY", Integer.valueOf(fVar.ordinal()))));
            return mVar;
        }
    }

    /* renamed from: gc1.m$b */
    public /* synthetic */ class C40977b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f96762a;

        static {
            int[] iArr = new int[C40967f.values().length];
            iArr[C40967f.CONTACT.ordinal()] = 1;
            iArr[C40967f.TRANSACTION.ordinal()] = 2;
            f96762a = iArr;
        }
    }

    /* renamed from: gc1.m$c */
    static final class C40978c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C40975m f96763d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40978c(C40975m mVar) {
            super(0);
            this.f96763d = mVar;
        }

        /* renamed from: b */
        public final C40967f invoke() {
            C40967f.C40968a aVar = C40967f.f96746d;
            Bundle arguments = this.f96763d.getArguments();
            return aVar.mo95367a(arguments != null ? arguments.getInt("CONFIG_KEY") : 0);
        }
    }

    /* renamed from: gc1.m$d */
    public static final class C40979d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f96764d;

        /* renamed from: e */
        final /* synthetic */ C41806a f96765e;

        /* renamed from: f */
        final /* synthetic */ C43064a f96766f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40979d(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f96764d = componentCallbacks;
            this.f96765e = aVar;
            this.f96766f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f96764d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f96765e, this.f96766f);
        }
    }

    /* renamed from: gc1.m$e */
    public static final class C40980e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f96767d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40980e(Fragment fragment) {
            super(0);
            this.f96767d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f96767d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f96767d.requireActivity());
        }
    }

    /* renamed from: gc1.m$f */
    public static final class C40981f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f96768d;

        /* renamed from: e */
        final /* synthetic */ C41806a f96769e;

        /* renamed from: f */
        final /* synthetic */ C43064a f96770f;

        /* renamed from: g */
        final /* synthetic */ C43064a f96771g;

        /* renamed from: h */
        final /* synthetic */ C43064a f96772h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40981f(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f96768d = fragment;
            this.f96769e = aVar;
            this.f96770f = aVar2;
            this.f96771g = aVar3;
            this.f96772h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f96768d, this.f96769e, this.f96770f, this.f96771g, C41520a0.m120436b(C41043s0.class), this.f96772h);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m118779A1(C40975m mVar) {
        C41536l.m120489i(mVar, "this$0");
        mVar.m118790r1().mo95431Sx();
    }

    /* renamed from: n1 */
    private final C28670p0 m118786n1() {
        C28670p0 p0Var = this.f96757d;
        C41536l.m120486f(p0Var);
        return p0Var;
    }

    /* renamed from: o1 */
    private final C10146d0.C10172e m118787o1() {
        return (C10146d0.C10172e) this.f96758e.getValue();
    }

    private final void observeData() {
        C41043s0 r1 = m118790r1();
        int i = C40977b.f96762a[m118788p1().ordinal()];
        if (i == 1) {
            r1.mo95457sx();
        } else if (i == 2) {
            r1.mo95459xx();
        }
        r1.mo95426Mx().mo4819k(getViewLifecycleOwner(), new C40970h(this));
        r1.mo95458wx().mo4819k(getViewLifecycleOwner(), new C40971i(this));
        r1.mo95452mx().mo4819k(getViewLifecycleOwner(), new C40972j(this));
        r1.mo95423Dx().mo4819k(getViewLifecycleOwner(), new C40973k(this));
    }

    /* renamed from: p1 */
    private final C40967f m118788p1() {
        return (C40967f) this.f96761h.getValue();
    }

    /* renamed from: q1 */
    private final String m118789q1(C40967f fVar) {
        if (C40977b.f96762a[fVar.ordinal()] == 1) {
            return C10145d.m37089c("text.password.recovery.select.contacts.text", m118787o1());
        }
        return C10145d.m37089c("text.password.recovery.select.transactions.text", m118787o1());
    }

    /* renamed from: r1 */
    private final C41043s0 m118790r1() {
        return (C41043s0) this.f96759f.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m118791s1(C40975m mVar, Boolean bool) {
        C41536l.m120489i(mVar, "this$0");
        Button button = mVar.m118786n1().f72881e;
        C41536l.m120488h(bool, "isLoading");
        button.setLoading(bool.booleanValue());
        if (!bool.booleanValue()) {
            mVar.m118786n1().f72881e.setEnabled(mVar.f96760g.mo95358o());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m118792t1(C40975m mVar, List list) {
        C41536l.m120489i(mVar, "this$0");
        C40957b bVar = mVar.f96760g;
        C41536l.m120488h(list, "items");
        bVar.mo95359q(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m118793u1(C40975m mVar, Integer num) {
        C41536l.m120489i(mVar, "this$0");
        C40957b bVar = mVar.f96760g;
        C41536l.m120488h(num, "maxSelected");
        bVar.mo95360r(num.intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m118794v1(C40975m mVar, Integer num) {
        C41536l.m120489i(mVar, "this$0");
        CountDownTimerView countDownTimerView = mVar.m118786n1().f72883g;
        C41536l.m120488h(num, "time");
        countDownTimerView.setStartTimeSeconds(num.intValue());
        mVar.m118786n1().f72883g.mo35419i();
    }

    /* renamed from: x1 */
    private final void m118795x1() {
        m118786n1().f72881e.setOnClickListener(new C40974l(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m118796y1(C40975m mVar, View view) {
        C41536l.m120489i(mVar, "this$0");
        mVar.m118790r1().mo95451ly(mVar.f96760g.mo95357n());
    }

    /* renamed from: z1 */
    private final void m118797z1() {
        m118786n1().f72884h.setText(m118789q1(m118788p1()));
        RecyclerView recyclerView = m118786n1().f72882f;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.f96760g);
        Drawable e = C0767a.m2895e(recyclerView.getContext(), C10214s.f28277I);
        if (e != null) {
            recyclerView.mo5351j(new C13364a(e, true, false));
            m118786n1().f72881e.setEnabled(false);
            m118786n1().f72883g.setOnTimerExpiredListener(new C40969g(this));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: m0 */
    public void mo95362m0(boolean z) {
        m118786n1().f72881e.setEnabled(z);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f96757d = C28670p0.m87793d(getLayoutInflater());
        LinearLayout c = m118786n1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f96757d = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m118797z1();
        m118795x1();
        observeData();
    }
}
