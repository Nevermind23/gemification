package tb1;

import ah1.C40314b;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import ba1.C10146d0;
import ba1.C10195g0;
import ba1.C10212q;
import ba1.C10214s;
import ba1.C10220y;
import fh1.C40951a;
import gh1.C41125a;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41238w;
import ib1.C36382c1;
import ib1.C36427d1;
import ib1.C36455p0;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p349ah.C9860d;
import sso.type.UserContactType;
import ua1.C28659l1;
import ue1.C43064a;
import yg1.C43399a;

/* renamed from: tb1.f */
public final class C38743f extends C9860d implements C38738a {

    /* renamed from: E */
    public static final C38744a f92655E = new C38744a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C28659l1 f92656B;

    /* renamed from: C */
    private final C41217g f92657C = C41219i.m119469a(C41222k.NONE, new C38746c(this, (C41806a) null, (C43064a) null, new C38745b(this), (C43064a) null));

    /* renamed from: D */
    private final C10146d0.C10172e f92658D = ((C10146d0.C10172e) new C38747d().mo92377b());

    /* renamed from: tb1.f$a */
    public static final class C38744a {
        private C38744a() {
        }

        public /* synthetic */ C38744a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C38743f mo92374a() {
            return new C38743f();
        }
    }

    /* renamed from: tb1.f$b */
    public static final class C38745b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f92659d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38745b(Fragment fragment) {
            super(0);
            this.f92659d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f92659d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f92659d.requireActivity());
        }
    }

    /* renamed from: tb1.f$c */
    public static final class C38746c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f92660d;

        /* renamed from: e */
        final /* synthetic */ C41806a f92661e;

        /* renamed from: f */
        final /* synthetic */ C43064a f92662f;

        /* renamed from: g */
        final /* synthetic */ C43064a f92663g;

        /* renamed from: h */
        final /* synthetic */ C43064a f92664h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38746c(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f92660d = fragment;
            this.f92661e = aVar;
            this.f92662f = aVar2;
            this.f92663g = aVar3;
            this.f92664h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f92660d, this.f92661e, this.f92662f, this.f92663g, C41520a0.m120436b(C36382c1.class), this.f92664h);
        }
    }

    /* renamed from: tb1.f$d */
    public static final class C38747d implements C41125a {

        /* renamed from: a */
        private final Object f92665a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo92377b() {
            return this.f92665a;
        }
    }

    /* renamed from: h2 */
    private final String m113435h2(String str) {
        C10195g0 g = this.f92658D.mo26716g();
        if (g != null) {
            return g.mo26763a(str, new Object[0]);
        }
        return null;
    }

    /* renamed from: i2 */
    private final C36382c1 m113436i2() {
        return (C36382c1) this.f92657C.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public static final void m113437j2(C38743f fVar, C41238w wVar) {
        C41536l.m120489i(fVar, "this$0");
        fVar.m113439l2();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m113438k2(C38743f fVar, Boolean bool) {
        C41536l.m120489i(fVar, "this$0");
        if (C41536l.m120484d(bool, Boolean.FALSE)) {
            fVar.mo4577k1();
        }
    }

    /* renamed from: l2 */
    private final void m113439l2() {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_ICON_TWO_BUTTON);
        dVar.mo35637O1(Integer.valueOf(C10214s.f28281p));
        dVar.mo35638P1(Integer.valueOf(C10212q.f28274i));
        C36455p0 p0Var = C36455p0.f87952a;
        String h2 = m113435h2("text.do.email.popup.title");
        if (h2 == null) {
            h2 = "როგორც ჩანს უცხოეთში ხარ";
        }
        dVar.mo35648c2(h2);
        String h22 = m113435h2("email.popup.message");
        if (h22 == null) {
            h22 = "შესაძლოა SMS შეტყობინება დროულად ვერ მიიღოთ. ამიტომ, შეგიძლიათ ელფოსტით გაიაროთ ვერიფიკაცია";
        }
        dVar.mo35639Q1(h22);
        String h23 = m113435h2("email.popup.button.sms");
        if (h23 == null) {
            h23 = "SMS";
        }
        dVar.mo35642U1(h23);
        String h24 = m113435h2("text.do.email.popup.button.email");
        if (h24 == null) {
            h24 = m113435h2("email.popup.button.email");
        }
        dVar.mo35646Z1(h24);
        dVar.mo35641T1(new C38741d(dVar));
        dVar.mo35645Y1(new C38742e(this, dVar));
        dVar.mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m113440m2(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m113441n2(C38743f fVar, C13310d dVar, Button button) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(button, "it");
        fVar.m113436i2().mo89173lx(UserContactType.MAIL);
        fVar.mo92372V0();
        dVar.mo4577k1();
    }

    /* renamed from: o2 */
    private final void m113442o2(Fragment fragment) {
        C1493e0 p = getChildFragmentManager().mo4428p();
        C28659l1 l1Var = this.f92656B;
        if (l1Var == null) {
            C41536l.m120506z("binding");
            l1Var = null;
        }
        p.mo4639r(l1Var.f72815e.getId(), fragment).mo4515i();
    }

    private final void observeData() {
        C36427d1 Ax = m113436i2().mo89123Ax();
        Ax.mo89147Tq().mo4819k(getViewLifecycleOwner(), new C38739b(this));
        Ax.mo89189sm().mo4819k(getViewLifecycleOwner(), new C38740c(this));
    }

    /* renamed from: A0 */
    public void mo92370A0() {
        String str;
        C1505h activity = getActivity();
        if (activity != null) {
            str = activity.getString(C10220y.onboarding_step_title_verify);
        } else {
            str = null;
        }
        mo26370a2(str);
        m113442o2(C38765r.f92698i.mo92391a());
    }

    /* renamed from: M */
    public void mo92371M() {
        String str;
        C1505h activity = getActivity();
        if (activity != null) {
            str = activity.getString(C10220y.onboarding_select_contact_types_title);
        } else {
            str = null;
        }
        mo26370a2(str);
        m113442o2(C38771u.f92712g.mo92396a());
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        C28659l1 d = C28659l1.m87747d(layoutInflater, viewGroup, true);
        C41536l.m120488h(d, "inflate(inflater, container, true)");
        this.f92656B = d;
        m113436i2().mo89192tn("is_otp_required", new C41224m[0]);
        mo92370A0();
    }

    /* renamed from: V0 */
    public void mo92372V0() {
        m113436i2().mo89162fy();
        mo4577k1();
    }

    /* renamed from: b */
    public void mo26371b() {
        m113436i2().mo89162fy();
        super.mo26371b();
    }

    /* renamed from: g0 */
    public void mo92373g0() {
        String str;
        C1505h activity = getActivity();
        if (activity != null) {
            str = activity.getString(C10220y.onboarding_select_contact_title);
        } else {
            str = null;
        }
        mo26370a2(str);
        m113442o2(C38751j.f92669i.mo92380a());
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        observeData();
    }
}
