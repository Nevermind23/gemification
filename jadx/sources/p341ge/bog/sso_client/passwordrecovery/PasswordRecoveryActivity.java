package p341ge.bog.sso_client.passwordrecovery;

import ah1.C40313a;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import ba1.C10145d;
import ba1.C10146d0;
import ba1.C10205l;
import ba1.C10210o;
import ba1.C10211p;
import ba1.C10212q;
import ba1.C10214s;
import ba1.C10216u;
import ba1.C10218w;
import ba1.C10220y;
import ec1.C40724i;
import fc1.C40928o;
import gc1.C40967f;
import gc1.C40975m;
import gc1.C40983o;
import ha1.C15454a;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.onboarding.OnBoardingActivity;
import p420fh.C12902d;
import p420fh.C12910e;
import p642vh.C18368l;
import pc1.C42137p;
import ua1.C28636e;
import ub1.C39052c;
import ue1.C43064a;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: ge.bog.sso_client.passwordrecovery.PasswordRecoveryActivity */
public final class PasswordRecoveryActivity extends C15454a {

    /* renamed from: x */
    public static final C40999a f96810x = new C40999a((DefaultConstructorMarker) null);

    /* renamed from: s */
    private final C41217g f96811s = C41219i.m119470b(new C41000b(this));

    /* renamed from: t */
    private final C41217g f96812t;

    /* renamed from: u */
    private final C41217g f96813u;

    /* renamed from: v */
    private final C41217g f96814v;

    /* renamed from: w */
    private final C41217g f96815w;

    /* renamed from: ge.bog.sso_client.passwordrecovery.PasswordRecoveryActivity$PasswordRecoveryData */
    private static final class PasswordRecoveryData implements Parcelable {
        public static final Parcelable.Creator<PasswordRecoveryData> CREATOR = new C40998a();

        /* renamed from: d */
        private final String f96816d;

        /* renamed from: e */
        private final boolean f96817e;

        /* renamed from: ge.bog.sso_client.passwordrecovery.PasswordRecoveryActivity$PasswordRecoveryData$a */
        public static final class C40998a implements Parcelable.Creator {
            /* renamed from: a */
            public final PasswordRecoveryData createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new PasswordRecoveryData(parcel.readString(), parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final PasswordRecoveryData[] newArray(int i) {
                return new PasswordRecoveryData[i];
            }
        }

        public PasswordRecoveryData(String str, boolean z) {
            this.f96816d = str;
            this.f96817e = z;
        }

        /* renamed from: a */
        public final boolean mo95394a() {
            return this.f96817e;
        }

        /* renamed from: b */
        public final String mo95395b() {
            return this.f96816d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasswordRecoveryData)) {
                return false;
            }
            PasswordRecoveryData passwordRecoveryData = (PasswordRecoveryData) obj;
            return C41536l.m120484d(this.f96816d, passwordRecoveryData.f96816d) && this.f96817e == passwordRecoveryData.f96817e;
        }

        public int hashCode() {
            String str = this.f96816d;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            boolean z = this.f96817e;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            return "PasswordRecoveryData(pageName=" + this.f96816d + ", fromDeepLink=" + this.f96817e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f96816d);
            parcel.writeInt(this.f96817e ? 1 : 0);
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.PasswordRecoveryActivity$a */
    public static final class C40999a {
        private C40999a() {
        }

        public /* synthetic */ C40999a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ Intent m118883b(C40999a aVar, Context context, String str, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return aVar.mo95405a(context, str, z);
        }

        /* renamed from: a */
        public final Intent mo95405a(Context context, String str, boolean z) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, PasswordRecoveryActivity.class);
            intent.putExtra("RECOVERY_DATA", new PasswordRecoveryData(str, z));
            return intent;
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.PasswordRecoveryActivity$b */
    static final class C41000b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PasswordRecoveryActivity f96818d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41000b(PasswordRecoveryActivity passwordRecoveryActivity) {
            super(0);
            this.f96818d = passwordRecoveryActivity;
        }

        /* renamed from: b */
        public final C28636e invoke() {
            C28636e d = C28636e.m87643d(this.f96818d.getLayoutInflater());
            C41536l.m120488h(d, "inflate(layoutInflater)");
            return d;
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.PasswordRecoveryActivity$c */
    static final class C41001c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PasswordRecoveryActivity f96819d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41001c(PasswordRecoveryActivity passwordRecoveryActivity) {
            super(0);
            this.f96819d = passwordRecoveryActivity;
        }

        /* renamed from: b */
        public final PasswordRecoveryData invoke() {
            Intent intent = this.f96819d.getIntent();
            if (intent != null) {
                return (PasswordRecoveryData) intent.getParcelableExtra("RECOVERY_DATA");
            }
            return null;
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.PasswordRecoveryActivity$d */
    public static final class C41002d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f96820d;

        /* renamed from: e */
        final /* synthetic */ C41806a f96821e;

        /* renamed from: f */
        final /* synthetic */ C43064a f96822f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41002d(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f96820d = componentCallbacks;
            this.f96821e = aVar;
            this.f96822f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f96820d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f96821e, this.f96822f);
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.PasswordRecoveryActivity$e */
    public static final class C41003e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f96823d;

        /* renamed from: e */
        final /* synthetic */ C41806a f96824e;

        /* renamed from: f */
        final /* synthetic */ C43064a f96825f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41003e(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f96823d = componentCallbacks;
            this.f96824e = aVar;
            this.f96825f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f96823d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10205l.class), this.f96824e, this.f96825f);
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.PasswordRecoveryActivity$f */
    public static final class C41004f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f96826d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41004f(ComponentActivity componentActivity) {
            super(0);
            this.f96826d = componentActivity;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            ComponentActivity componentActivity = this.f96826d;
            return aVar.mo102076a(componentActivity, componentActivity);
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.PasswordRecoveryActivity$g */
    public static final class C41005g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f96827d;

        /* renamed from: e */
        final /* synthetic */ C41806a f96828e;

        /* renamed from: f */
        final /* synthetic */ C43064a f96829f;

        /* renamed from: g */
        final /* synthetic */ C43064a f96830g;

        /* renamed from: h */
        final /* synthetic */ C43064a f96831h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41005g(ComponentActivity componentActivity, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f96827d = componentActivity;
            this.f96828e = aVar;
            this.f96829f = aVar2;
            this.f96830g = aVar3;
            this.f96831h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40313a.m116748a(this.f96827d, this.f96828e, this.f96829f, this.f96830g, C41520a0.m120436b(C41043s0.class), this.f96831h);
        }
    }

    public PasswordRecoveryActivity() {
        super(0, 1, (DefaultConstructorMarker) null);
        C41222k kVar = C41222k.SYNCHRONIZED;
        this.f96812t = C41219i.m119469a(kVar, new C41002d(this, (C41806a) null, (C43064a) null));
        this.f96813u = C41219i.m119469a(C41222k.NONE, new C41005g(this, (C41806a) null, (C43064a) null, new C41004f(this), (C43064a) null));
        this.f96814v = C41219i.m119469a(kVar, new C41003e(this, (C41806a) null, (C43064a) null));
        this.f96815w = C41219i.m119470b(new C41001c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m118832A1(PasswordRecoveryActivity passwordRecoveryActivity, C41238w wVar) {
        C41536l.m120489i(passwordRecoveryActivity, "this$0");
        passwordRecoveryActivity.m118865m1();
    }

    /* renamed from: B1 */
    private final void m118833B1(Fragment fragment) {
        getSupportFragmentManager().mo4428p().mo4642u(C10210o.f28261d, C10210o.fade_out, C10210o.fade_in, C10210o.f28262e).mo4639r(m118866n1().f72711e.getId(), fragment).mo4636g(fragment.getClass().getCanonicalName()).mo4515i();
    }

    /* renamed from: C1 */
    private final void m118834C1() {
        mo42539S0(m118869q1().mo95454ox());
        m118869q1().mo95455px().mo95469a().mo95418j().mo4819k(this, new C41018g(this));
        m118869q1().mo95456qx().mo4819k(this, new C41020h(this));
        m118869q1().mo95425Lx().mo4819k(this, new C41022i(this));
        m118869q1().mo95422Cx().mo4819k(this, new C41024j(this));
        m118869q1().mo89200wb().mo4819k(this, new C41026k(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m118835D1(PasswordRecoveryActivity passwordRecoveryActivity, Boolean bool) {
        C41536l.m120489i(passwordRecoveryActivity, "this$0");
        ToolbarView toolbarView = passwordRecoveryActivity.m118866n1().f72712f;
        C41536l.m120488h(bool, "it");
        toolbarView.setNavigationEnabled(bool.booleanValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m118836E1(PasswordRecoveryActivity passwordRecoveryActivity, C41238w wVar) {
        C41536l.m120489i(passwordRecoveryActivity, "this$0");
        C13310d c = new C39052c().mo92742c(C13310d.C13312b.TITLE_ICON_SINGLE_BUTTON, passwordRecoveryActivity.getString(C10220y.recovery_finish_dialog_title), C10145d.m37089c("user.credentials.success.message", passwordRecoveryActivity.m118846Q0()), Integer.valueOf(C10214s.icons_48_system_check), Integer.valueOf(C10212q.f28272f), C10145d.m37089c("user.credentials.success.button", passwordRecoveryActivity.m118846Q0()), (String) null);
        c.mo35643V1(new C41028l(passwordRecoveryActivity, c));
        c.mo4576A1(passwordRecoveryActivity.getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m118837F1(PasswordRecoveryActivity passwordRecoveryActivity, C13310d dVar, Button button) {
        C41536l.m120489i(passwordRecoveryActivity, "this$0");
        C41536l.m120489i(dVar, "$dialog");
        C41536l.m120489i(button, "it");
        passwordRecoveryActivity.setResult(105, (Intent) null);
        dVar.mo4577k1();
        passwordRecoveryActivity.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m118838G1(PasswordRecoveryActivity passwordRecoveryActivity, Boolean bool) {
        int i;
        C41536l.m120489i(passwordRecoveryActivity, "this$0");
        C41536l.m120488h(bool, "isContacts");
        if (bool.booleanValue()) {
            i = C10220y.pass_recovery_validation_failed_contacts;
        } else {
            i = C10220y.pass_recovery_validation_failed_transactions;
        }
        passwordRecoveryActivity.m118843L1(passwordRecoveryActivity.getString(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public static final void m118839H1(PasswordRecoveryActivity passwordRecoveryActivity, C41238w wVar) {
        C41536l.m120489i(passwordRecoveryActivity, "this$0");
        passwordRecoveryActivity.m118843L1(passwordRecoveryActivity.getString(C10220y.pass_recovery_timer_expired));
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public static final void m118840I1(PasswordRecoveryActivity passwordRecoveryActivity, C35947l lVar) {
        C41536l.m120489i(passwordRecoveryActivity, "this$0");
        if (lVar instanceof C35947l.C35951d) {
            passwordRecoveryActivity.m118869q1().mo95447hy();
        } else if (lVar instanceof C35947l.C35949b) {
            passwordRecoveryActivity.m118843L1(((C35947l.C35949b) lVar).mo88517a().getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public static final boolean m118841J1(PasswordRecoveryActivity passwordRecoveryActivity, MenuItem menuItem) {
        C41536l.m120489i(passwordRecoveryActivity, "this$0");
        if (menuItem.getItemId() != C10216u.f28308V) {
            return true;
        }
        passwordRecoveryActivity.finish();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public static final void m118842K1(PasswordRecoveryActivity passwordRecoveryActivity, View view) {
        C41536l.m120489i(passwordRecoveryActivity, "this$0");
        passwordRecoveryActivity.onBackPressed();
    }

    /* renamed from: L1 */
    private final void m118843L1(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof String;
        }
        if (z) {
            String str = (String) obj;
            if (str == null) {
                str = getString(C10220y.f28366O0);
                C41536l.m120488h(str, "getString(R.string.error_data_general)");
            }
            C12910e.m48790h(this, str, (C12902d.C12905b) null, false, 6, (Object) null);
        } else if (obj instanceof Integer) {
            String string = getString(((Number) obj).intValue());
            C41536l.m120488h(string, "getString(err)");
            C12910e.m48790h(this, string, (C12902d.C12905b) null, false, 6, (Object) null);
        } else {
            String string2 = getString(C10220y.f28366O0);
            C41536l.m120488h(string2, "getString(R.string.error_data_general)");
            C12910e.m48790h(this, string2, (C12902d.C12905b) null, false, 6, (Object) null);
        }
    }

    /* renamed from: M1 */
    private final void m118844M1() {
        C13310d c = new C39052c().mo92742c(C13310d.C13312b.TITLE_ICON_SINGLE_BUTTON, getString(C10220y.pass_recovery_common), C10145d.m37089c("text.password.recovery.onboarding.info.text", m118846Q0()), Integer.valueOf(C10214s.illustration_document_scan), (Integer) null, C10145d.m37089c("text.password.recovery.info.page.start.button", m118846Q0()), (String) null);
        c.mo35643V1(new C41030m(this));
        c.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public static final void m118845N1(PasswordRecoveryActivity passwordRecoveryActivity, Button button) {
        C41536l.m120489i(passwordRecoveryActivity, "this$0");
        C41536l.m120489i(button, "it");
        passwordRecoveryActivity.m118865m1();
    }

    /* renamed from: Q0 */
    private final C10146d0.C10172e m118846Q0() {
        return (C10146d0.C10172e) this.f96812t.getValue();
    }

    /* renamed from: m1 */
    private final void m118865m1() {
        setResult(104, (Intent) null);
        PasswordRecoveryData p1 = m118868p1();
        boolean z = false;
        if (p1 != null && p1.mo95394a()) {
            z = true;
        }
        if (z) {
            startActivity(OnBoardingActivity.f87024y.mo88591a(this, true));
        }
        finish();
    }

    /* renamed from: n1 */
    private final C28636e m118866n1() {
        return (C28636e) this.f96811s.getValue();
    }

    /* renamed from: o1 */
    private final C10205l m118867o1() {
        return (C10205l) this.f96814v.getValue();
    }

    /* renamed from: p1 */
    private final PasswordRecoveryData m118868p1() {
        return (PasswordRecoveryData) this.f96815w.getValue();
    }

    /* renamed from: q1 */
    private final C41043s0 m118869q1() {
        return (C41043s0) this.f96813u.getValue();
    }

    /* renamed from: r1 */
    private final void m118870r1() {
        m118869q1().mo95455px().mo95469a().mo95411c().mo4819k(this, new C41034o(this));
        m118869q1().mo95455px().mo95469a().mo95412d().mo4819k(this, new C41036p(this));
        m118869q1().mo95455px().mo95469a().mo95415g().mo4819k(this, new C41038q(this));
        m118869q1().mo95455px().mo95469a().mo95416h().mo4819k(this, new C41040r(this));
        m118869q1().mo95455px().mo95469a().mo95413e().mo4819k(this, new C41042s(this));
        m118869q1().mo95455px().mo95469a().mo95414f().mo4819k(this, new C41065t(this));
        m118869q1().mo95455px().mo95469a().mo95419k().mo4819k(this, new C41067u(this));
        m118869q1().mo95455px().mo95469a().mo95417i().mo4819k(this, new C41069v(this));
        m118869q1().mo95437cx().mo4819k(this, new C41016f(this));
        m118869q1().mo95455px().mo95475h();
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m118871s1(PasswordRecoveryActivity passwordRecoveryActivity, C41238w wVar) {
        C41536l.m120489i(passwordRecoveryActivity, "this$0");
        passwordRecoveryActivity.m118833B1(C40724i.f96419k.mo94877a());
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m118872t1(PasswordRecoveryActivity passwordRecoveryActivity, C41238w wVar) {
        C41536l.m120489i(passwordRecoveryActivity, "this$0");
        passwordRecoveryActivity.m118833B1(C40928o.f96680g.mo95318a());
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m118873u1(PasswordRecoveryActivity passwordRecoveryActivity, C41238w wVar) {
        C41536l.m120489i(passwordRecoveryActivity, "this$0");
        passwordRecoveryActivity.m118833B1(C40975m.f96756i.mo95369a(C40967f.CONTACT));
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m118874v1(PasswordRecoveryActivity passwordRecoveryActivity, C41238w wVar) {
        C41536l.m120489i(passwordRecoveryActivity, "this$0");
        passwordRecoveryActivity.m118833B1(C40975m.f96756i.mo95369a(C40967f.TRANSACTION));
    }

    /* access modifiers changed from: private */
    /* renamed from: w1 */
    public static final void m118875w1(PasswordRecoveryActivity passwordRecoveryActivity, C41238w wVar) {
        C41536l.m120489i(passwordRecoveryActivity, "this$0");
        passwordRecoveryActivity.m118833B1(C40983o.f96774h.mo95374a(C40967f.CONTACT));
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m118876x1(PasswordRecoveryActivity passwordRecoveryActivity, C41238w wVar) {
        C41536l.m120489i(passwordRecoveryActivity, "this$0");
        passwordRecoveryActivity.m118833B1(C40983o.f96774h.mo95374a(C40967f.TRANSACTION));
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m118877y1(PasswordRecoveryActivity passwordRecoveryActivity, C41238w wVar) {
        C41536l.m120489i(passwordRecoveryActivity, "this$0");
        passwordRecoveryActivity.m118844M1();
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m118878z1(PasswordRecoveryActivity passwordRecoveryActivity, C41238w wVar) {
        C41536l.m120489i(passwordRecoveryActivity, "this$0");
        passwordRecoveryActivity.m118833B1(C42137p.f99091k.mo97634a(true));
    }

    public void onBackPressed() {
        if (m118866n1().f72712f.getNavigationEnabled()) {
            m118869q1().mo95450l();
        } else {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        String b;
        boolean z;
        super.onCreate(bundle);
        setContentView((View) m118866n1().mo3946b());
        getWindow().setStatusBarColor(C18368l.m62755d(this, C10211p.f28263a));
        m118869q1().mo95445gy(m118867o1().mo26773c(this));
        ToolbarView toolbarView = m118866n1().f72712f;
        toolbarView.mo1887x(C10218w.close_action_menu);
        toolbarView.setOnMenuItemClickListener(new C41014e(this));
        toolbarView.setNavigationOnClickListener(new C41032n(this));
        PasswordRecoveryData p1 = m118868p1();
        String str2 = null;
        if (p1 != null) {
            str = p1.mo95395b();
        } else {
            str = null;
        }
        if (str != null) {
            PasswordRecoveryData p12 = m118868p1();
            boolean z2 = false;
            if (!(p12 == null || (b = p12.mo95395b()) == null)) {
                if (b.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    z2 = true;
                }
            }
            if (z2) {
                PasswordRecoveryData p13 = m118868p1();
                if (p13 != null) {
                    str2 = p13.mo95395b();
                }
                toolbarView.setTitle(str2);
            }
        }
        m118869q1().mo89152Y4();
        m118834C1();
        m118870r1();
    }
}
