package fc1;

import ah1.C40314b;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.app.C0218d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10146d0;
import he1.C41217g;
import he1.C41222k;
import java.util.Iterator;
import java.util.List;
import jb1.C36774a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.radiobutton.RadioButtonView;
import p341ge.bog.sso_client.models.C35938f;
import p341ge.bog.sso_client.models.UserContact;
import p341ge.bog.sso_client.passwordrecovery.C41043s0;
import p615tg.C17963d;
import sso.type.ProcessFlow;
import sso.type.UserContactType;
import ua1.C28626a1;
import ua1.C28658l0;
import ue1.C43064a;
import yg1.C43399a;

/* renamed from: fc1.o */
public final class C40928o extends Fragment {

    /* renamed from: g */
    public static final C40929a f96680g = new C40929a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f96681d = C41219i.m119470b(new C40934c(this));

    /* renamed from: e */
    private final C41217g f96682e = C41219i.m119469a(C41222k.NONE, new C40936e(this, (C41806a) null, (C43064a) null, new C40935d(this), (C43064a) null));

    /* renamed from: f */
    private final C40930b f96683f = new C40930b();

    /* renamed from: fc1.o$a */
    public static final class C40929a {
        private C40929a() {
        }

        public /* synthetic */ C40929a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C40928o mo95318a() {
            return new C40928o();
        }
    }

    /* renamed from: fc1.o$b */
    public final class C40930b extends C1819o {

        /* renamed from: f */
        private List f96684f = C41341q.m119907j();

        /* renamed from: g */
        private C43064a f96685g;

        /* renamed from: fc1.o$b$a */
        public final class C40931a extends RecyclerView.C1734f0 {
            /* access modifiers changed from: private */

            /* renamed from: d */
            public final C28626a1 f96687d;

            /* renamed from: e */
            final /* synthetic */ C40930b f96688e;

            /* renamed from: fc1.o$b$a$a */
            public /* synthetic */ class C40932a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f96689a;

                static {
                    int[] iArr = new int[UserContactType.values().length];
                    iArr[UserContactType.PHONE.ordinal()] = 1;
                    iArr[UserContactType.MAIL.ordinal()] = 2;
                    f96689a = iArr;
                }
            }

            /* renamed from: fc1.o$b$a$b */
            static final class C40933b extends C41537m implements C43064a {

                /* renamed from: d */
                final /* synthetic */ C40931a f96690d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C40933b(C40931a aVar) {
                    super(0);
                    this.f96690d = aVar;
                }

                public final void invoke() {
                    this.f96690d.f96687d.f72652h.setChecked(false);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C40931a(C40930b bVar, C28626a1 a1Var) {
                super(a1Var.mo3946b());
                C41536l.m120489i(a1Var, "binding");
                this.f96688e = bVar;
                this.f96687d = a1Var;
            }

            /* access modifiers changed from: private */
            /* renamed from: l */
            public static final void m118705l(C40931a aVar, View view) {
                C41536l.m120489i(aVar, "this$0");
                RadioButtonView radioButtonView = aVar.f96687d.f72652h;
                radioButtonView.setChecked(!radioButtonView.isChecked());
            }

            /* access modifiers changed from: private */
            /* renamed from: m */
            public static final void m118706m(C40928o oVar, UserContact userContact, C40930b bVar, UserContact userContact2, C40931a aVar, CompoundButton compoundButton, boolean z) {
                boolean z2;
                String str;
                C41536l.m120489i(oVar, "this$0");
                C41536l.m120489i(userContact, "$data");
                C41536l.m120489i(bVar, "this$1");
                C41536l.m120489i(userContact2, "$this_with");
                C41536l.m120489i(aVar, "this$2");
                boolean z3 = false;
                if (z) {
                    oVar.m118688n1().mo95439dy(userContact);
                    C43064a l = bVar.mo95320l();
                    if (l != null) {
                        l.invoke();
                    }
                    bVar.mo95324p(new C40933b(aVar));
                } else {
                    String a = userContact2.mo88418a();
                    if (a == null || a.length() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        String a2 = userContact2.mo88418a();
                        UserContact dx = oVar.m118688n1().mo95438dx();
                        if (dx != null) {
                            str = dx.mo88418a();
                        } else {
                            str = null;
                        }
                        if (C41536l.m120484d(a2, str)) {
                            bVar.mo95324p((C43064a) null);
                            oVar.m118688n1().mo95439dy((UserContact) null);
                        }
                    }
                }
                Button button = oVar.m118687m1().f72809e;
                if (oVar.m118688n1().mo95438dx() != null) {
                    z3 = true;
                }
                button.setEnabled(z3);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
                if (kotlin.jvm.internal.C41536l.m120484d(r3, r5) != false) goto L_0x0093;
             */
            /* renamed from: k */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final p341ge.bog.designsystem.components.radiobutton.RadioButtonView mo95325k(p341ge.bog.sso_client.models.UserContact r9) {
                /*
                    r8 = this;
                    java.lang.String r0 = "data"
                    kotlin.jvm.internal.C41536l.m120489i(r9, r0)
                    fc1.o$b r4 = r8.f96688e
                    fc1.o r2 = fc1.C40928o.this
                    sso.type.UserContactType r0 = r9.mo88424f()
                    if (r0 != 0) goto L_0x0011
                    r0 = -1
                    goto L_0x0019
                L_0x0011:
                    int[] r1 = fc1.C40928o.C40930b.C40931a.C40932a.f96689a
                    int r0 = r0.ordinal()
                    r0 = r1[r0]
                L_0x0019:
                    r1 = 1
                    if (r0 == r1) goto L_0x0025
                    r3 = 2
                    if (r0 == r3) goto L_0x0022
                    int r0 = ba1.C10214s.icons_48_security_digipass_outline
                    goto L_0x0027
                L_0x0022:
                    int r0 = ba1.C10214s.icons_48_contacts_email_close_outline
                    goto L_0x0027
                L_0x0025:
                    int r0 = ba1.C10214s.icons_48_payment_category_phone_outline
                L_0x0027:
                    ua1.a1 r3 = r8.f96687d
                    android.widget.ImageView r3 = r3.f72649e
                    android.content.Context r5 = r2.requireContext()
                    android.graphics.drawable.Drawable r0 = androidx.core.content.C0767a.m2895e(r5, r0)
                    r3.setImageDrawable(r0)
                    ua1.a1 r0 = r8.f96687d
                    ge.bog.designsystem.components.list.TwoLineTextItem r0 = r0.f72651g
                    sso.type.UserContactType r3 = r9.mo88424f()
                    r5 = 0
                    if (r3 == 0) goto L_0x004f
                    android.content.Context r6 = r2.requireContext()
                    java.lang.String r7 = "requireContext()"
                    kotlin.jvm.internal.C41536l.m120488h(r6, r7)
                    java.lang.String r3 = p341ge.bog.sso_client.models.C35966v.m107022a(r3, r6)
                    goto L_0x0050
                L_0x004f:
                    r3 = r5
                L_0x0050:
                    r0.setTitle(r3)
                    java.lang.String r3 = r9.mo88418a()
                    r0.setText(r3)
                    fc1.p r3 = new fc1.p
                    r3.<init>(r8)
                    r0.setOnClickListener(r3)
                    ua1.a1 r0 = r8.f96687d
                    ge.bog.designsystem.components.radiobutton.RadioButtonView r0 = r0.f72652h
                    java.lang.String r3 = r9.mo88418a()
                    r6 = 0
                    if (r3 == 0) goto L_0x0076
                    int r3 = r3.length()
                    if (r3 != 0) goto L_0x0074
                    goto L_0x0076
                L_0x0074:
                    r3 = r6
                    goto L_0x0077
                L_0x0076:
                    r3 = r1
                L_0x0077:
                    if (r3 != 0) goto L_0x0092
                    java.lang.String r3 = r9.mo88418a()
                    ge.bog.sso_client.passwordrecovery.s0 r7 = r2.m118688n1()
                    ge.bog.sso_client.models.UserContact r7 = r7.mo95438dx()
                    if (r7 == 0) goto L_0x008b
                    java.lang.String r5 = r7.mo88418a()
                L_0x008b:
                    boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r3, r5)
                    if (r3 == 0) goto L_0x0092
                    goto L_0x0093
                L_0x0092:
                    r1 = r6
                L_0x0093:
                    r0.setChecked(r1)
                    fc1.q r7 = new fc1.q
                    r1 = r7
                    r3 = r9
                    r5 = r9
                    r6 = r8
                    r1.<init>(r2, r3, r4, r5, r6)
                    r0.setOnCheckedChangeListener(r7)
                    java.lang.String r9 = "with(data) {\n           …          }\n            }"
                    kotlin.jvm.internal.C41536l.m120488h(r0, r9)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: fc1.C40928o.C40930b.C40931a.mo95325k(ge.bog.sso_client.models.UserContact):ge.bog.designsystem.components.radiobutton.RadioButtonView");
            }
        }

        public C40930b() {
            super(C17963d.f51158a.mo45633d());
        }

        public int getItemCount() {
            return this.f96684f.size();
        }

        /* renamed from: k */
        public final List mo95319k() {
            return this.f96684f;
        }

        /* renamed from: l */
        public final C43064a mo95320l() {
            return this.f96685g;
        }

        /* renamed from: m */
        public void onBindViewHolder(C40931a aVar, int i) {
            C41536l.m120489i(aVar, "holder");
            aVar.mo95325k((UserContact) this.f96684f.get(i));
        }

        /* renamed from: n */
        public C40931a onCreateViewHolder(ViewGroup viewGroup, int i) {
            C41536l.m120489i(viewGroup, "parent");
            C28626a1 d = C28626a1.m87600d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …, false\n                )");
            return new C40931a(this, d);
        }

        /* renamed from: o */
        public final void mo95323o(List list) {
            C41536l.m120489i(list, "data");
            this.f96684f = list;
            notifyDataSetChanged();
        }

        /* renamed from: p */
        public final void mo95324p(C43064a aVar) {
            this.f96685g = aVar;
        }
    }

    /* renamed from: fc1.o$c */
    static final class C40934c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C40928o f96691d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40934c(C40928o oVar) {
            super(0);
            this.f96691d = oVar;
        }

        /* renamed from: b */
        public final C28658l0 invoke() {
            C28658l0 d = C28658l0.m87742d(this.f96691d.getLayoutInflater());
            C41536l.m120488h(d, "inflate(layoutInflater)");
            return d;
        }
    }

    /* renamed from: fc1.o$d */
    public static final class C40935d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f96692d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40935d(Fragment fragment) {
            super(0);
            this.f96692d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f96692d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f96692d.requireActivity());
        }
    }

    /* renamed from: fc1.o$e */
    public static final class C40936e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f96693d;

        /* renamed from: e */
        final /* synthetic */ C41806a f96694e;

        /* renamed from: f */
        final /* synthetic */ C43064a f96695f;

        /* renamed from: g */
        final /* synthetic */ C43064a f96696g;

        /* renamed from: h */
        final /* synthetic */ C43064a f96697h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40936e(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f96693d = fragment;
            this.f96694e = aVar;
            this.f96695f = aVar2;
            this.f96696g = aVar3;
            this.f96697h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f96693d, this.f96694e, this.f96695f, this.f96696g, C41520a0.m120436b(C41043s0.class), this.f96697h);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public final C28658l0 m118687m1() {
        return (C28658l0) this.f96681d.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public final C41043s0 m118688n1() {
        return (C41043s0) this.f96682e.getValue();
    }

    /* renamed from: o1 */
    private final void m118689o1() {
        C10146d0.C10176g.m37228i(new C35938f(ProcessFlow.ADD_FINANCIAL_CONTACT, C10146d0.C10175f.m37216a()));
        C10146d0.C10176g.m37227h(C10146d0.C10175f.m37216a());
        C10146d0.C10176g.m37231l(true);
        m118688n1().mo95432Uw(true);
    }

    /* renamed from: p1 */
    private final void m118690p1() {
        m118688n1().mo95424Hx().mo4819k(getViewLifecycleOwner(), new C40927n(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m118691q1(C40928o oVar, List list) {
        C41536l.m120489i(oVar, "this$0");
        C40930b bVar = oVar.f96683f;
        C41536l.m120488h(list, "it");
        bVar.mo95323o(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m118692r1(C40928o oVar, View view) {
        C41536l.m120489i(oVar, "this$0");
        if (oVar.m118688n1().mo95438dx() != null) {
            oVar.m118694t1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m118693s1(C40928o oVar, View view) {
        C41536l.m120489i(oVar, "this$0");
        oVar.m118688n1().mo95429Px(C36774a.ADD_PHONE);
        oVar.m118689o1();
    }

    /* renamed from: t1 */
    private final void m118694t1() {
        UserContactType userContactType;
        UserContactType userContactType2;
        Object obj;
        Object obj2;
        boolean z;
        boolean z2;
        m118688n1().mo95443fy(false);
        C41043s0 n1 = m118688n1();
        UserContact dx = m118688n1().mo95438dx();
        if (dx == null || (userContactType = dx.mo88424f()) == null) {
            userContactType = UserContactType.UNKNOWN__;
        }
        n1.mo95441ey(userContactType);
        UserContact dx2 = m118688n1().mo95438dx();
        if (dx2 != null) {
            userContactType2 = dx2.mo88424f();
        } else {
            userContactType2 = null;
        }
        if (userContactType2 == UserContactType.DIGIPASS) {
            m118688n1().mo95443fy(true);
            Iterator it = this.f96683f.mo95319k().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((UserContact) obj).mo88424f() == UserContactType.PHONE) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            UserContact userContact = (UserContact) obj;
            if (userContact == null) {
                Iterator it2 = this.f96683f.mo95319k().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (((UserContact) obj2).mo88424f() == UserContactType.MAIL) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                userContact = (UserContact) obj2;
            }
            if (userContact != null) {
                m118688n1().mo95439dy(userContact);
            }
        }
        C40898b a = C40898b.f96623F.mo95298a();
        C1505h activity = getActivity();
        if (activity != null) {
            a.mo4576A1(((C0218d) activity).getSupportFragmentManager(), (String) null);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        ConstraintLayout c = m118687m1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onResume() {
        this.f96683f.mo95324p((C43064a) null);
        m118688n1().mo95433Vx();
        super.onResume();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C41536l.m120489i(r5, r0)
            super.onViewCreated(r5, r6)
            ge.bog.sso_client.passwordrecovery.s0 r5 = r4.m118688n1()
            r6 = 0
            r5.mo95439dy(r6)
            ua1.l0 r5 = r4.m118687m1()
            ge.bog.designsystem.components.buttons.Button r5 = r5.f72809e
            ge.bog.sso_client.passwordrecovery.s0 r6 = r4.m118688n1()
            ge.bog.sso_client.models.UserContact r6 = r6.mo95438dx()
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x0037
            ge.bog.sso_client.passwordrecovery.s0 r6 = r4.m118688n1()
            ge.bog.sso_client.models.UserContact r6 = r6.mo95438dx()
            kotlin.jvm.internal.C41536l.m120486f(r6)
            sso.type.UserContactType r6 = r6.mo88424f()
            sso.type.UserContactType r2 = sso.type.UserContactType.DIGIPASS
            if (r6 == r2) goto L_0x0037
            r6 = r0
            goto L_0x0038
        L_0x0037:
            r6 = r1
        L_0x0038:
            r5.setEnabled(r6)
            fc1.l r6 = new fc1.l
            r6.<init>(r4)
            r5.setOnClickListener(r6)
            ua1.l0 r5 = r4.m118687m1()
            androidx.recyclerview.widget.RecyclerView r5 = r5.f72811g
            androidx.recyclerview.widget.LinearLayoutManager r6 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r5.getContext()
            r6.<init>(r2)
            r5.setLayoutManager(r6)
            fc1.o$b r6 = r4.f96683f
            r5.setAdapter(r6)
            ge.bog.designsystem.components.list.a r6 = new ge.bog.designsystem.components.list.a
            android.content.Context r2 = r5.getContext()
            int r3 = ba1.C10214s.f28277I
            android.graphics.drawable.Drawable r2 = androidx.core.content.C0767a.m2895e(r2, r3)
            if (r2 == 0) goto L_0x00c0
            r6.<init>(r2, r0, r1)
            r5.mo5351j(r6)
            ge.bog.sso_client.passwordrecovery.s0 r5 = r4.m118688n1()
            androidx.lifecycle.LiveData r5 = r5.mo95424Hx()
            java.lang.Object r5 = r5.mo4814f()
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L_0x0086
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r0 = r1
        L_0x0086:
            if (r0 != 0) goto L_0x009e
            fc1.o$b r5 = r4.f96683f
            ge.bog.sso_client.passwordrecovery.s0 r6 = r4.m118688n1()
            androidx.lifecycle.LiveData r6 = r6.mo95424Hx()
            java.lang.Object r6 = r6.mo4814f()
            kotlin.jvm.internal.C41536l.m120486f(r6)
            java.util.List r6 = (java.util.List) r6
            r5.mo95323o(r6)
        L_0x009e:
            ua1.l0 r5 = r4.m118687m1()
            ge.bog.designsystem.components.buttons.Button r5 = r5.f72810f
            ge.bog.sso_client.passwordrecovery.s0 r6 = r4.m118688n1()
            boolean r6 = r6.mo95428Ox()
            if (r6 == 0) goto L_0x00af
            goto L_0x00b1
        L_0x00af:
            r1 = 8
        L_0x00b1:
            r5.setVisibility(r1)
            fc1.m r6 = new fc1.m
            r6.<init>(r4)
            r5.setOnClickListener(r6)
            r4.m118690p1()
            return
        L_0x00c0:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Required value was null."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fc1.C40928o.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
