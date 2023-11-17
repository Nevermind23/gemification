package ec1;

import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import ba1.C10146d0;
import ba1.C10195g0;
import ba1.C10220y;
import ca1.C10379a;
import fh1.C40951a;
import gh1.C41125a;
import he1.C41217g;
import he1.C41222k;
import java.util.List;
import jb1.C36774a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p149l.C6856b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.creditcard.badge.CreditCardsBadgeView;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.sso_client.models.C35938f;
import p341ge.bog.sso_client.passwordrecovery.C41043s0;
import p420fh.C12902d;
import p601sg.C17782g;
import p603si.C17799b;
import p603si.C17809c;
import p669xh.C18763a;
import sso.type.ProcessFlow;
import ua1.C28655k0;
import ub1.C39052c;
import ue1.C43064a;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: ec1.i */
public final class C40724i extends Fragment {

    /* renamed from: k */
    public static final C40725a f96419k = new C40725a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f96420d = C41219i.m119469a(C41222k.SYNCHRONIZED, new C40729d(this, (C41806a) null, (C43064a) null));

    /* renamed from: e */
    private final C41217g f96421e = C41219i.m119470b(C40727c.f96428d);

    /* renamed from: f */
    private final C41217g f96422f = C41219i.m119470b(new C40726b(this));

    /* renamed from: g */
    private final C41217g f96423g = C41219i.m119469a(C41222k.NONE, new C40731f(this, (C41806a) null, (C43064a) null, new C40730e(this), (C43064a) null));

    /* renamed from: h */
    private C17799b f96424h;

    /* renamed from: i */
    private C17799b f96425i;

    /* renamed from: j */
    private C17799b f96426j;

    /* renamed from: ec1.i$a */
    public static final class C40725a {
        private C40725a() {
        }

        public /* synthetic */ C40725a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C40724i mo94877a() {
            return new C40724i();
        }
    }

    /* renamed from: ec1.i$b */
    static final class C40726b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C40724i f96427d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40726b(C40724i iVar) {
            super(0);
            this.f96427d = iVar;
        }

        /* renamed from: b */
        public final C28655k0 invoke() {
            C28655k0 d = C28655k0.m87728d(this.f96427d.getLayoutInflater());
            C41536l.m120488h(d, "inflate(layoutInflater)");
            return d;
        }
    }

    /* renamed from: ec1.i$c */
    static final class C40727c extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C40727c f96428d = new C40727c();

        /* renamed from: ec1.i$c$a */
        public static final class C40728a implements C41125a {

            /* renamed from: a */
            private final Object f96429a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), (C41806a) null, (C43064a) null);

            /* renamed from: a */
            public C40951a mo26679a() {
                return C41125a.C41126a.m119226a(this);
            }

            /* renamed from: b */
            public final Object mo94879b() {
                return this.f96429a;
            }
        }

        C40727c() {
            super(0);
        }

        public final String invoke() {
            return ((C10146d0.C10172e) new C40728a().mo94879b()).mo26726q().mo92939a();
        }
    }

    /* renamed from: ec1.i$d */
    public static final class C40729d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f96430d;

        /* renamed from: e */
        final /* synthetic */ C41806a f96431e;

        /* renamed from: f */
        final /* synthetic */ C43064a f96432f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40729d(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f96430d = componentCallbacks;
            this.f96431e = aVar;
            this.f96432f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f96430d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f96431e, this.f96432f);
        }
    }

    /* renamed from: ec1.i$e */
    public static final class C40730e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f96433d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40730e(Fragment fragment) {
            super(0);
            this.f96433d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f96433d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f96433d.requireActivity());
        }
    }

    /* renamed from: ec1.i$f */
    public static final class C40731f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f96434d;

        /* renamed from: e */
        final /* synthetic */ C41806a f96435e;

        /* renamed from: f */
        final /* synthetic */ C43064a f96436f;

        /* renamed from: g */
        final /* synthetic */ C43064a f96437g;

        /* renamed from: h */
        final /* synthetic */ C43064a f96438h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40731f(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f96434d = fragment;
            this.f96435e = aVar;
            this.f96436f = aVar2;
            this.f96437g = aVar3;
            this.f96438h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f96434d, this.f96435e, this.f96436f, this.f96437g, C41520a0.m120436b(C41043s0.class), this.f96438h);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m117884A1(C40724i iVar, List list) {
        String str;
        C41536l.m120489i(iVar, "this$0");
        if (!list.isEmpty()) {
            iVar.m117902s1().mo95430Qx();
        } else if (iVar.m117902s1().mo95428Ox()) {
            C39052c cVar = new C39052c();
            C13310d.C13312b bVar = C13310d.C13312b.TITLE_SINGLE_BUTTON;
            String string = iVar.getString(C10220y.onboarding_user_password_title);
            String string2 = iVar.getString(C10220y.onboarding_pass_recovery_onboarding_dialog_desc);
            Context context = iVar.getContext();
            if (context != null) {
                str = context.getString(C10220y.button_text_ok);
            } else {
                str = null;
            }
            C13310d d = cVar.mo92743d(bVar, string, string2, str);
            d.mo35643V1(new C40722g(iVar, d));
            d.mo4576A1(iVar.getChildFragmentManager(), (String) null);
        } else {
            C12902d.C12903a aVar = C12902d.f38098b;
            C1505h requireActivity = iVar.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            C12902d e = C12902d.C12903a.m48771e(aVar, requireActivity, false, 2, (Object) null);
            String string3 = iVar.getString(C10220y.onboarding_off_pass_recovery);
            C41536l.m120488h(string3, "getString(R.string.onboarding_off_pass_recovery)");
            C12902d.m48766q(e, string3, (C12902d.C12905b) null, 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public static final void m117885B1(C40724i iVar, C13310d dVar, Button button) {
        C41536l.m120489i(iVar, "this$0");
        C41536l.m120489i(dVar, "$dialog");
        C41536l.m120489i(button, "it");
        C10146d0.C10176g.m37228i(new C35938f(ProcessFlow.ADD_FINANCIAL_CONTACT, C10146d0.C10175f.m37216a()));
        C10146d0.C10176g.m37227h(C10146d0.C10175f.m37216a());
        C10146d0.C10176g.m37231l(true);
        iVar.m117902s1().mo95429Px(C36774a.NO_PHONE);
        iVar.m117902s1().mo95432Uw(true);
        dVar.mo4577k1();
    }

    /* renamed from: C1 */
    private final void m117886C1() {
        m117899p1().f72792f.setOnTextChangeListener(new C40723h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m117887D1(C40724i iVar, String str, String str2, String str3) {
        C41536l.m120489i(iVar, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(str2, "<anonymous parameter 1>");
        C41536l.m120489i(str3, "<anonymous parameter 2>");
        iVar.m117889F1();
    }

    /* renamed from: E1 */
    private final void m117888E1() {
        String a;
        C10195g0 g = m117902s1().mo95444gx().mo26716g();
        if (g != null && (a = g.mo26763a("link.terms.credential.recovery", new Object[0])) != null) {
            C6856b a2 = new C6856b.C6857a().mo20931a();
            C41536l.m120488h(a2, "Builder().build()");
            try {
                a2.mo20930a(requireContext(), Uri.parse(a));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: F1 */
    private final void m117889F1() {
        m117899p1().f72795i.setEnabled(m117890G1());
    }

    /* renamed from: G1 */
    private final boolean m117890G1() {
        boolean z;
        boolean z2;
        boolean z3;
        C28655k0 p1 = m117899p1();
        C17799b bVar = this.f96425i;
        if (bVar != null) {
            z = bVar.mo45386g(p1.f72792f.getCardNumber());
        } else {
            z = false;
        }
        C17799b bVar2 = this.f96424h;
        if (bVar2 != null) {
            z2 = bVar2.mo45386g(p1.f72792f.getCvv());
        } else {
            z2 = false;
        }
        C17799b bVar3 = this.f96426j;
        if (bVar3 != null) {
            z3 = bVar3.mo45386g(p1.f72792f.getExpireDate());
        } else {
            z3 = false;
        }
        if (!p1.f72794h.isChecked() || !z2 || !z3 || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: p1 */
    private final C28655k0 m117899p1() {
        return (C28655k0) this.f96422f.getValue();
    }

    /* renamed from: q1 */
    private final String m117900q1() {
        return (String) this.f96421e.getValue();
    }

    /* renamed from: r1 */
    private final C10146d0.C10172e m117901r1() {
        return (C10146d0.C10172e) this.f96420d.getValue();
    }

    /* renamed from: s1 */
    private final C41043s0 m117902s1() {
        return (C41043s0) this.f96423g.getValue();
    }

    /* renamed from: t1 */
    private final void m117903t1() {
        C17799b.C17801b bVar = new C17799b.C17801b(3, 5);
        String string = getString(C10220y.pass_recovery_cvv_error);
        C41536l.m120488h(string, "getString(R.string.pass_recovery_cvv_error)");
        this.f96424h = C17809c.m61562a(bVar, string);
        C17799b.C17801b bVar2 = new C17799b.C17801b(15, 25);
        String string2 = getString(C10220y.pass_recovery_card_error);
        C41536l.m120488h(string2, "getString(R.string.pass_recovery_card_error)");
        this.f96425i = C17809c.m61562a(bVar2, string2);
        C17799b.C17800a aVar = new C17799b.C17800a(5);
        String string3 = getString(C10220y.pass_recovery_date_error);
        C41536l.m120488h(string3, "getString(R.string.pass_recovery_date_error)");
        this.f96426j = C17809c.m61562a(aVar, string3);
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m117904u1(C40724i iVar) {
        C41536l.m120489i(iVar, "this$0");
        iVar.m117888E1();
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m117905v1(C40724i iVar, CompoundButton compoundButton, boolean z) {
        C41536l.m120489i(iVar, "this$0");
        iVar.m117889F1();
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m117906x1(C40724i iVar, View view) {
        C41536l.m120489i(iVar, "this$0");
        C41043s0.m118938Vw(iVar.m117902s1(), false, 1, (Object) null);
        C10379a b = iVar.m117901r1().mo26711b();
        if (b != null) {
            C10379a.C10380a.m37703a(b, "Digital Onboarding", "click_no_card_recovery", (String) null, (Bundle) null, (C10379a.C10381b) null, 28, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m117907y1(C40724i iVar, View view) {
        C41536l.m120489i(iVar, "this$0");
        if (iVar.m117890G1()) {
            iVar.m117902s1().mo95434Ww(iVar.m117899p1().f72792f.getCardNumber(), iVar.m117899p1().f72792f.getCvv(), iVar.m117899p1().f72792f.getExpireDate());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m117908z1(C40724i iVar, Boolean bool) {
        C41536l.m120489i(iVar, "this$0");
        Button button = iVar.m117899p1().f72795i;
        C41536l.m120488h(bool, "it");
        button.setLoading(bool.booleanValue());
        iVar.m117889F1();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        return m117899p1().mo3946b();
    }

    public void onViewCreated(View view, Bundle bundle) {
        CreditCardsBadgeView creditCardsBadgeView;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        CheckboxView checkboxView = m117899p1().f72794h;
        String string = getString(C10220y.pass_recovery_card_checkbox_leading_text);
        C41536l.m120488h(string, "getString(R.string.pass_…rd_checkbox_leading_text)");
        checkboxView.mo35145g(string, getString(C10220y.pass_recovery_card_checkbox_clickable_text));
        checkboxView.setTextClickListener(new C40716a(this));
        int i = 0;
        m117899p1().f72792f.setCreditCards(C41341q.m119910m(C18763a.VISA, C18763a.MASTER_CARD, C18763a.AMERICAN_EXPRESS));
        if (C41536l.m120484d(m117900q1(), "JUNIOR")) {
            View findViewById = m117899p1().f72792f.findViewById(C17782g.credit_cards);
            if (findViewById instanceof CreditCardsBadgeView) {
                creditCardsBadgeView = (CreditCardsBadgeView) findViewById;
            } else {
                creditCardsBadgeView = null;
            }
            if (creditCardsBadgeView != null) {
                creditCardsBadgeView.setCards((List<? extends C18763a>) C41341q.m119907j());
            }
        }
        m117899p1().f72794h.setOnCheckedChangeListener(new C40717b(this));
        Button button = m117899p1().f72791e;
        if (!m117902s1().mo95427Nx()) {
            i = 8;
        }
        button.setVisibility(i);
        button.setOnClickListener(new C40718c(this));
        m117899p1().f72795i.setOnClickListener(new C40719d(this));
        m117902s1().mo95426Mx().mo4819k(getViewLifecycleOwner(), new C40720e(this));
        m117902s1().mo95424Hx().mo4819k(getViewLifecycleOwner(), new C40721f(this));
        m117886C1();
        m117903t1();
        m117889F1();
    }
}
