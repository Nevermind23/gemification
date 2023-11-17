package fc1;

import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import ba1.C10205l;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.onetimepassword.OneTimePasswordView;
import p341ge.bog.sso_client.passwordrecovery.C41043s0;
import p670xi.C18766c;
import sso.type.UserContactType;
import ua1.C28665n1;
import ue1.C43064a;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: fc1.k */
public final class C40917k extends Fragment {

    /* renamed from: i */
    public static final C40918a f96659i = new C40918a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f96660d = C41219i.m119470b(new C40920c(this));

    /* renamed from: e */
    private final C41217g f96661e = C41219i.m119469a(C41222k.NONE, new C40924g(this, (C41806a) null, (C43064a) null, new C40923f(this), (C43064a) null));

    /* renamed from: f */
    private final C41217g f96662f = C41219i.m119469a(C41222k.SYNCHRONIZED, new C40922e(this, (C41806a) null, (C43064a) null));

    /* renamed from: g */
    private final C41217g f96663g = C41219i.m119470b(new C40921d(this));

    /* renamed from: h */
    private C28665n1 f96664h;

    /* renamed from: fc1.k$a */
    public static final class C40918a {
        private C40918a() {
        }

        public /* synthetic */ C40918a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C40917k mo95312a(String str) {
            C41536l.m120489i(str, "contact");
            C40917k kVar = new C40917k();
            Bundle bundle = new Bundle();
            bundle.putString("args_contact", str);
            kVar.setArguments(bundle);
            return kVar;
        }
    }

    /* renamed from: fc1.k$b */
    public /* synthetic */ class C40919b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f96665a;

        static {
            int[] iArr = new int[UserContactType.values().length];
            iArr[UserContactType.PHONE.ordinal()] = 1;
            iArr[UserContactType.MAIL.ordinal()] = 2;
            f96665a = iArr;
        }
    }

    /* renamed from: fc1.k$c */
    static final class C40920c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C40917k f96666d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40920c(C40917k kVar) {
            super(0);
            this.f96666d = kVar;
        }

        public final String invoke() {
            Bundle arguments = this.f96666d.getArguments();
            if (arguments != null) {
                return arguments.getString("args_contact");
            }
            return null;
        }
    }

    /* renamed from: fc1.k$d */
    static final class C40921d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C40917k f96667d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40921d(C40917k kVar) {
            super(0);
            this.f96667d = kVar;
        }

        /* renamed from: b */
        public final C10205l.C10206a invoke() {
            return this.f96667d.m118671p1().mo26772b(this.f96667d);
        }
    }

    /* renamed from: fc1.k$e */
    public static final class C40922e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f96668d;

        /* renamed from: e */
        final /* synthetic */ C41806a f96669e;

        /* renamed from: f */
        final /* synthetic */ C43064a f96670f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40922e(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f96668d = componentCallbacks;
            this.f96669e = aVar;
            this.f96670f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f96668d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10205l.class), this.f96669e, this.f96670f);
        }
    }

    /* renamed from: fc1.k$f */
    public static final class C40923f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f96671d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40923f(Fragment fragment) {
            super(0);
            this.f96671d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f96671d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f96671d.requireActivity());
        }
    }

    /* renamed from: fc1.k$g */
    public static final class C40924g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f96672d;

        /* renamed from: e */
        final /* synthetic */ C41806a f96673e;

        /* renamed from: f */
        final /* synthetic */ C43064a f96674f;

        /* renamed from: g */
        final /* synthetic */ C43064a f96675g;

        /* renamed from: h */
        final /* synthetic */ C43064a f96676h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40924g(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f96672d = fragment;
            this.f96673e = aVar;
            this.f96674f = aVar2;
            this.f96675g = aVar3;
            this.f96676h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f96672d, this.f96673e, this.f96674f, this.f96675g, C41520a0.m120436b(C41043s0.class), this.f96676h);
        }
    }

    /* renamed from: n1 */
    private final String m118669n1() {
        return (String) this.f96660d.getValue();
    }

    /* renamed from: o1 */
    private final C10205l.C10206a m118670o1() {
        return (C10205l.C10206a) this.f96663g.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public final C10205l m118671p1() {
        return (C10205l) this.f96662f.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m118672r1(C40917k kVar, OneTimePasswordView oneTimePasswordView, View view) {
        C41536l.m120489i(kVar, "this$0");
        C41536l.m120489i(oneTimePasswordView, "$this_apply");
        C41043s0 q1 = kVar.mo95311q1();
        String n1 = kVar.m118669n1();
        C41536l.m120486f(n1);
        C41043s0.m118945ay(q1, n1, kVar.mo95311q1().mo95440ex(), (C43064a) null, 4, (Object) null);
        oneTimePasswordView.mo36276r();
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m118673s1(C40917k kVar, View view) {
        C41536l.m120489i(kVar, "this$0");
        C28665n1 n1Var = kVar.f96664h;
        C28665n1 n1Var2 = null;
        if (n1Var == null) {
            C41536l.m120506z("binding");
            n1Var = null;
        }
        if (n1Var.f72866f.getOtpState() != C18766c.WAITING) {
            C28665n1 n1Var3 = kVar.f96664h;
            if (n1Var3 == null) {
                C41536l.m120506z("binding");
                n1Var3 = null;
            }
            if (n1Var3.f72866f.getCodeText().length() < 4) {
                C28665n1 n1Var4 = kVar.f96664h;
                if (n1Var4 == null) {
                    C41536l.m120506z("binding");
                } else {
                    n1Var2 = n1Var4;
                }
                n1Var2.f72866f.mo36272n();
                return;
            }
            C41043s0 q1 = kVar.mo95311q1();
            C28665n1 n1Var5 = kVar.f96664h;
            if (n1Var5 == null) {
                C41536l.m120506z("binding");
            } else {
                n1Var2 = n1Var5;
            }
            q1.mo95435Xw(n1Var2.f72866f.getCodeText());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m118674t1(Button button, Boolean bool) {
        C41536l.m120489i(button, "$this_apply");
        C41536l.m120488h(bool, "it");
        button.setLoading(bool.booleanValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m118675u1(C40917k kVar, C41238w wVar) {
        C41536l.m120489i(kVar, "this$0");
        C28665n1 n1Var = kVar.f96664h;
        if (n1Var == null) {
            C41536l.m120506z("binding");
            n1Var = null;
        }
        n1Var.f72866f.mo36272n();
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m118676v1(C40917k kVar, String str) {
        boolean z;
        C41536l.m120489i(kVar, "this$0");
        if (str == null || C40439w.m117118v(str)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C28665n1 n1Var = kVar.f96664h;
            if (n1Var == null) {
                C41536l.m120506z("binding");
                n1Var = null;
            }
            n1Var.f72866f.setCodeText(str);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C28665n1 d = C28665n1.m87773d(layoutInflater, viewGroup, false);
        C41536l.m120488h(d, "inflate(inflater, container, false)");
        this.f96664h = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        ConstraintLayout c = d.mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onResume() {
        super.onResume();
        C28665n1 n1Var = this.f96664h;
        if (n1Var == null) {
            C41536l.m120506z("binding");
            n1Var = null;
        }
        n1Var.f72866f.mo36273o();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: ua1.n1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C41536l.m120489i(r5, r0)
            super.onViewCreated(r5, r6)
            ua1.n1 r5 = r4.f96664h
            java.lang.String r6 = "binding"
            r0 = 0
            if (r5 != 0) goto L_0x0013
            kotlin.jvm.internal.C41536l.m120506z(r6)
            r5 = r0
        L_0x0013:
            ge.bog.designsystem.components.onetimepassword.OneTimePasswordView r5 = r5.f72866f
            ge.bog.sso_client.passwordrecovery.s0 r1 = r4.mo95311q1()
            ge.bog.sso_client.models.UserContact r1 = r1.mo95438dx()
            if (r1 == 0) goto L_0x0025
            sso.type.UserContactType r1 = r1.mo88424f()
            if (r1 != 0) goto L_0x0027
        L_0x0025:
            sso.type.UserContactType r1 = sso.type.UserContactType.PHONE
        L_0x0027:
            int[] r2 = fc1.C40917k.C40919b.f96665a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            java.lang.String r3 = ""
            if (r1 == r2) goto L_0x007b
            r2 = 2
            if (r1 == r2) goto L_0x0062
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "Unknown contact type "
            r6.append(r1)
            ge.bog.sso_client.passwordrecovery.s0 r1 = r4.mo95311q1()
            ge.bog.sso_client.models.UserContact r1 = r1.mo95438dx()
            if (r1 == 0) goto L_0x0057
            sso.type.UserContactType r1 = r1.mo88424f()
            if (r1 == 0) goto L_0x0057
            java.lang.String r0 = r1.getRawValue()
        L_0x0057:
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L_0x0062:
            ge.bog.sso_client.passwordrecovery.s0 r1 = r4.mo95311q1()
            ge.bog.sso_client.models.UserContact r1 = r1.mo95438dx()
            if (r1 == 0) goto L_0x0074
            java.lang.String r1 = r1.mo88418a()
            if (r1 != 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r3 = r1
        L_0x0074:
            r5.setEmail(r3)
            r5.mo36289t()
            goto L_0x0093
        L_0x007b:
            ge.bog.sso_client.passwordrecovery.s0 r1 = r4.mo95311q1()
            ge.bog.sso_client.models.UserContact r1 = r1.mo95438dx()
            if (r1 == 0) goto L_0x008d
            java.lang.String r1 = r1.mo88418a()
            if (r1 != 0) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            r3 = r1
        L_0x008d:
            r5.setPhoneNumber(r3)
            r5.mo36291v()
        L_0x0093:
            fc1.f r1 = new fc1.f
            r1.<init>(r4, r5)
            r5.setResendButtonClickListener(r1)
            ua1.n1 r5 = r4.f96664h
            if (r5 != 0) goto L_0x00a3
            kotlin.jvm.internal.C41536l.m120506z(r6)
            goto L_0x00a4
        L_0x00a3:
            r0 = r5
        L_0x00a4:
            ge.bog.designsystem.components.buttons.Button r5 = r0.f72865e
            fc1.g r6 = new fc1.g
            r6.<init>(r4)
            r5.setOnClickListener(r6)
            ge.bog.sso_client.passwordrecovery.s0 r6 = r4.mo95311q1()
            androidx.lifecycle.LiveData r6 = r6.mo95446hx()
            androidx.lifecycle.q r0 = r4.getViewLifecycleOwner()
            fc1.h r1 = new fc1.h
            r1.<init>(r5)
            r6.mo4819k(r0, r1)
            ge.bog.sso_client.passwordrecovery.s0 r5 = r4.mo95311q1()
            androidx.lifecycle.LiveData r5 = r5.mo95453nx()
            androidx.lifecycle.q r6 = r4.getViewLifecycleOwner()
            fc1.i r0 = new fc1.i
            r0.<init>(r4)
            r5.mo4819k(r6, r0)
            ba1.l$a r5 = r4.m118670o1()
            if (r5 == 0) goto L_0x00ee
            androidx.lifecycle.LiveData r5 = r5.mo26775b()
            if (r5 == 0) goto L_0x00ee
            androidx.lifecycle.q r6 = r4.getViewLifecycleOwner()
            fc1.j r0 = new fc1.j
            r0.<init>(r4)
            r5.mo4819k(r6, r0)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fc1.C40917k.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* renamed from: q1 */
    public final C41043s0 mo95311q1() {
        return (C41043s0) this.f96661e.getValue();
    }
}
