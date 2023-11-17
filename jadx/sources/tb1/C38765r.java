package tb1;

import ah1.C40314b;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import ib1.C36382c1;
import ib1.C36427d1;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb1.C37122d;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.onetimepassword.OneTimePasswordView;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.UserContact;
import sso.type.UserContactType;
import ua1.C28669p;
import ue1.C43064a;
import yg1.C43399a;

/* renamed from: tb1.r */
public final class C38765r extends Fragment {

    /* renamed from: i */
    public static final C38766a f92698i = new C38766a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f92699d = C41219i.m119469a(C41222k.NONE, new C38768c(this, (C41806a) null, (C43064a) null, new C38767b(this), (C43064a) null));

    /* renamed from: e */
    private C28669p f92700e;

    /* renamed from: f */
    private UserContact f92701f;

    /* renamed from: g */
    private String f92702g;

    /* renamed from: h */
    private C38738a f92703h;

    /* renamed from: tb1.r$a */
    public static final class C38766a {
        private C38766a() {
        }

        public /* synthetic */ C38766a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C38765r mo92391a() {
            return new C38765r();
        }
    }

    /* renamed from: tb1.r$b */
    public static final class C38767b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f92704d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38767b(Fragment fragment) {
            super(0);
            this.f92704d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f92704d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f92704d.requireActivity());
        }
    }

    /* renamed from: tb1.r$c */
    public static final class C38768c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f92705d;

        /* renamed from: e */
        final /* synthetic */ C41806a f92706e;

        /* renamed from: f */
        final /* synthetic */ C43064a f92707f;

        /* renamed from: g */
        final /* synthetic */ C43064a f92708g;

        /* renamed from: h */
        final /* synthetic */ C43064a f92709h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38768c(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f92705d = fragment;
            this.f92706e = aVar;
            this.f92707f = aVar2;
            this.f92708g = aVar3;
            this.f92709h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f92705d, this.f92706e, this.f92707f, this.f92708g, C41520a0.m120436b(C36382c1.class), this.f92709h);
        }
    }

    /* renamed from: n1 */
    private final void m113482n1() {
        C28669p pVar = this.f92700e;
        C28669p pVar2 = null;
        if (pVar == null) {
            C41536l.m120506z("binding");
            pVar = null;
        }
        Button button = pVar.f72877e;
        button.setOnClickListener(new C38759l(this));
        button.setLoading(true);
        C28669p pVar3 = this.f92700e;
        if (pVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            pVar2 = pVar3;
        }
        pVar2.f72878f.setOnClickListener(new C38760m(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: ua1.p} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m113483o1(tb1.C38765r r4, android.view.View r5) {
        /*
            java.lang.String r5 = "this$0"
            kotlin.jvm.internal.C41536l.m120489i(r4, r5)
            ua1.p r5 = r4.f92700e
            java.lang.String r0 = "binding"
            r1 = 0
            if (r5 != 0) goto L_0x0010
            kotlin.jvm.internal.C41536l.m120506z(r0)
            r5 = r1
        L_0x0010:
            ge.bog.designsystem.components.onetimepassword.OneTimePasswordView r5 = r5.f72879g
            xi.c r5 = r5.getOtpState()
            xi.c r2 = p670xi.C18766c.WAITING
            if (r5 == r2) goto L_0x0068
            ua1.p r5 = r4.f92700e
            if (r5 != 0) goto L_0x0022
            kotlin.jvm.internal.C41536l.m120506z(r0)
            r5 = r1
        L_0x0022:
            ge.bog.designsystem.components.onetimepassword.OneTimePasswordView r5 = r5.f72879g
            java.lang.String r5 = r5.getCodeText()
            int r5 = r5.length()
            r2 = 4
            if (r5 >= r2) goto L_0x003e
            ua1.p r4 = r4.f92700e
            if (r4 != 0) goto L_0x0037
            kotlin.jvm.internal.C41536l.m120506z(r0)
            goto L_0x0038
        L_0x0037:
            r1 = r4
        L_0x0038:
            ge.bog.designsystem.components.onetimepassword.OneTimePasswordView r4 = r1.f72879g
            r4.mo36272n()
            goto L_0x0068
        L_0x003e:
            ib1.c1 r5 = r4.m113485q1()
            ge.bog.sso_client.models.UserContact r2 = r4.f92701f
            if (r2 != 0) goto L_0x004c
            java.lang.String r2 = "userContact"
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r2 = r1
        L_0x004c:
            ua1.p r3 = r4.f92700e
            if (r3 != 0) goto L_0x0054
            kotlin.jvm.internal.C41536l.m120506z(r0)
            r3 = r1
        L_0x0054:
            ge.bog.designsystem.components.onetimepassword.OneTimePasswordView r0 = r3.f72879g
            java.lang.String r0 = r0.getCodeText()
            java.lang.String r4 = r4.f92702g
            if (r4 != 0) goto L_0x0064
            java.lang.String r4 = "operationRef"
            kotlin.jvm.internal.C41536l.m120506z(r4)
            goto L_0x0065
        L_0x0064:
            r1 = r4
        L_0x0065:
            r5.mo89170jx(r2, r0, r1)
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb1.C38765r.m113483o1(tb1.r, android.view.View):void");
    }

    private final void observeData() {
        C36427d1 Ax = m113485q1().mo89123Ax();
        Ax.mo89183qj().mo4819k(getViewLifecycleOwner(), new C38761n(this));
        Ax.mo89197vj().mo4819k(getViewLifecycleOwner(), new C38762o(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public static final void m113484p1(C38765r rVar, View view) {
        C41536l.m120489i(rVar, "this$0");
        rVar.m113485q1().mo89192tn("change_contact", new C41224m[0]);
        if (rVar.m113485q1().mo89142Px()) {
            rVar.m113485q1().mo89173lx(UserContactType.PHONE);
            C38738a aVar = rVar.f92703h;
            if (aVar != null) {
                aVar.mo92372V0();
                return;
            }
            return;
        }
        C38738a aVar2 = rVar.f92703h;
        if (aVar2 != null) {
            aVar2.mo92373g0();
        }
    }

    /* renamed from: q1 */
    private final C36382c1 m113485q1() {
        return (C36382c1) this.f92699d.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m113486r1(C38765r rVar, C35947l lVar) {
        C41536l.m120489i(rVar, "this$0");
        C28669p pVar = rVar.f92700e;
        if (pVar == null) {
            C41536l.m120506z("binding");
            pVar = null;
        }
        pVar.f72877e.setLoading(lVar instanceof C35947l.C35950c);
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public final void m113487s1(C35947l lVar) {
        C28669p pVar = this.f92700e;
        if (pVar == null) {
            C41536l.m120506z("binding");
            pVar = null;
        }
        pVar.f72877e.setLoading(lVar instanceof C35947l.C35950c);
        if (lVar instanceof C35947l.C35951d) {
            C35947l.C35951d dVar = (C35947l.C35951d) lVar;
            this.f92701f = ((C37122d) dVar.mo88520a()).mo90053a();
            this.f92702g = ((C37122d) dVar.mo88520a()).mo90054b();
            m113488t1((C37122d) dVar.mo88520a());
        }
    }

    /* renamed from: t1 */
    private final void m113488t1(C37122d dVar) {
        C28669p pVar = this.f92700e;
        UserContact userContact = null;
        if (pVar == null) {
            C41536l.m120506z("binding");
            pVar = null;
        }
        OneTimePasswordView oneTimePasswordView = pVar.f72879g;
        UserContact userContact2 = this.f92701f;
        if (userContact2 == null) {
            C41536l.m120506z("userContact");
            userContact2 = null;
        }
        String str = "";
        if (userContact2.mo88424f() == UserContactType.PHONE) {
            oneTimePasswordView.mo36291v();
            UserContact userContact3 = this.f92701f;
            if (userContact3 == null) {
                C41536l.m120506z("userContact");
            } else {
                userContact = userContact3;
            }
            String a = userContact.mo88418a();
            if (a != null) {
                str = a;
            }
            oneTimePasswordView.setPhoneNumber(str);
        } else {
            oneTimePasswordView.mo36289t();
            UserContact userContact4 = this.f92701f;
            if (userContact4 == null) {
                C41536l.m120506z("userContact");
            } else {
                userContact = userContact4;
            }
            String a2 = userContact.mo88418a();
            if (a2 != null) {
                str = a2;
            }
            oneTimePasswordView.setEmail(str);
        }
        oneTimePasswordView.setResendButtonClickListener(new C38763p(oneTimePasswordView, this));
        oneTimePasswordView.setOtpTimerFinishedListener(new C38764q(dVar, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m113489u1(OneTimePasswordView oneTimePasswordView, C38765r rVar, View view) {
        C41536l.m120489i(oneTimePasswordView, "$this_apply");
        C41536l.m120489i(rVar, "this$0");
        oneTimePasswordView.mo36276r();
        C36382c1 q1 = rVar.m113485q1();
        UserContact userContact = rVar.f92701f;
        if (userContact == null) {
            C41536l.m120506z("userContact");
            userContact = null;
        }
        q1.mo89177my(userContact, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m113490v1(C37122d dVar, C38765r rVar) {
        C41536l.m120489i(dVar, "$data");
        C41536l.m120489i(rVar, "this$0");
        if (dVar.mo90055c()) {
            rVar.m113485q1().mo89205yx().mo89135Io();
        }
    }

    /* renamed from: x1 */
    private final int m113491x1() {
        return m113485q1().mo89190sx("DO_ADD_CONTACT_FROM_CARD_FLOW_ALLOWED") ? 0 : 8;
    }

    public void onAttach(Context context) {
        C41536l.m120489i(context, "context");
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            this.f92703h = (C38743f) parentFragment;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ge.bog.sso_client.onboarding.steps.confirmphonesheet.ConfirmPhoneActionSheet");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C28669p d = C28669p.m87789d(layoutInflater, viewGroup, false);
        C41536l.m120488h(d, "inflate(inflater, container, false)");
        this.f92700e = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        ConstraintLayout c = d.mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDetach() {
        super.onDetach();
        this.f92703h = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m113482n1();
        if (m113485q1().mo89142Px()) {
            C28669p pVar = this.f92700e;
            if (pVar == null) {
                C41536l.m120506z("binding");
                pVar = null;
            }
            pVar.f72878f.setVisibility(m113491x1());
        }
        observeData();
    }
}
