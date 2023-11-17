package fc1;

import ah1.C40314b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import ba1.C10220y;
import fc1.C40904e;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.sso_client.models.UserContact;
import p341ge.bog.sso_client.passwordrecovery.C41043s0;
import p349ah.C9860d;
import sso.type.UserContactType;
import ua1.C28659l1;
import ue1.C43064a;
import yg1.C43399a;

/* renamed from: fc1.b */
public final class C40898b extends C9860d implements C40904e.C40906b {

    /* renamed from: F */
    public static final C40899a f96623F = new C40899a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private final C40904e f96624B = C40904e.f96637h.mo95303a();

    /* renamed from: C */
    private final C41217g f96625C = C41219i.m119469a(C41222k.NONE, new C40901c(this, (C41806a) null, (C43064a) null, new C40900b(this), (C43064a) null));

    /* renamed from: D */
    private C40917k f96626D;

    /* renamed from: E */
    private C28659l1 f96627E;

    /* renamed from: fc1.b$a */
    public static final class C40899a {
        private C40899a() {
        }

        public /* synthetic */ C40899a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C40898b mo95298a() {
            return new C40898b();
        }
    }

    /* renamed from: fc1.b$b */
    public static final class C40900b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f96628d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40900b(Fragment fragment) {
            super(0);
            this.f96628d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f96628d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f96628d.requireActivity());
        }
    }

    /* renamed from: fc1.b$c */
    public static final class C40901c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f96629d;

        /* renamed from: e */
        final /* synthetic */ C41806a f96630e;

        /* renamed from: f */
        final /* synthetic */ C43064a f96631f;

        /* renamed from: g */
        final /* synthetic */ C43064a f96632g;

        /* renamed from: h */
        final /* synthetic */ C43064a f96633h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40901c(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f96629d = fragment;
            this.f96630e = aVar;
            this.f96631f = aVar2;
            this.f96632g = aVar3;
            this.f96633h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f96629d, this.f96630e, this.f96631f, this.f96632g, C41520a0.m120436b(C41043s0.class), this.f96633h);
        }
    }

    /* renamed from: e2 */
    private final C41043s0 m118642e2() {
        return (C41043s0) this.f96625C.getValue();
    }

    /* renamed from: f2 */
    private final void m118643f2(Fragment fragment) {
        C1493e0 p = getChildFragmentManager().mo4428p();
        C28659l1 l1Var = this.f96627E;
        if (l1Var == null) {
            C41536l.m120506z("binding");
            l1Var = null;
        }
        p.mo4639r(l1Var.f72815e.getId(), fragment).mo4515i();
    }

    /* renamed from: g2 */
    private final void m118644g2(String str) {
        C40917k a = C40917k.f96659i.mo95312a(str);
        this.f96626D = a;
        if (a == null) {
            C41536l.m120506z("secondFragment");
            a = null;
        }
        m118643f2(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m118645h2(C40898b bVar, C41238w wVar) {
        C41536l.m120489i(bVar, "this$0");
        bVar.mo4577k1();
    }

    private final void observeData() {
        m118642e2().mo95442fx().mo4819k(getViewLifecycleOwner(), new C40897a(this));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        UserContactType userContactType;
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        C28659l1 d = C28659l1.m87747d(layoutInflater, viewGroup, true);
        C41536l.m120488h(d, "inflate(inflater, container, true)");
        this.f96627E = d;
        UserContact dx = m118642e2().mo95438dx();
        String str = null;
        if (dx != null) {
            userContactType = dx.mo88424f();
        } else {
            userContactType = null;
        }
        if (userContactType == UserContactType.PHONE) {
            C1505h activity = getActivity();
            if (activity != null) {
                str = activity.getString(C10220y.pass_recovery_phone_confirm_title);
            }
        } else {
            C1505h activity2 = getActivity();
            if (activity2 != null) {
                str = activity2.getString(C10220y.pass_recovery_mail_confirm_title);
            }
        }
        mo26370a2(str);
        observeData();
        m118643f2(this.f96624B);
    }

    /* renamed from: a */
    public void mo95297a(String str) {
        C41536l.m120489i(str, "contact");
        m118644g2(str);
    }
}
