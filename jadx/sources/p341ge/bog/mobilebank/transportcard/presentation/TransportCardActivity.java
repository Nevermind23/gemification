package p341ge.bog.mobilebank.transportcard.presentation;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import c71.C31284d;
import c71.C31286f;
import g71.C32109b;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l71.C37098h;
import p202p0.C7556l;
import p202p0.C7589q;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.transportcard.presentation.TransportCardActivity */
public final class TransportCardActivity extends C30772sa {

    /* renamed from: G */
    public static final C34979a f84444G = new C34979a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f84445F = C41219i.m119470b(new C34980b(this));

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.TransportCardActivity$a */
    public static final class C34979a {
        private C34979a() {
        }

        public /* synthetic */ C34979a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo85813a(Context context, String str) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(str, "passType");
            Intent intent = new Intent(context, TransportCardActivity.class);
            intent.putExtra("PASS_TYPE_KEY", str);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.TransportCardActivity$b */
    static final class C34980b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TransportCardActivity f84446d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34980b(TransportCardActivity transportCardActivity) {
            super(0);
            this.f84446d = transportCardActivity;
        }

        /* renamed from: b */
        public final C32109b invoke() {
            return C32109b.m94569d(this.f84446d.getLayoutInflater());
        }
    }

    /* renamed from: F2 */
    private final C32109b m102850F2() {
        return (C32109b) this.f84445F.getValue();
    }

    /* renamed from: G2 */
    private final void m102851G2() {
        Fragment j0 = getSupportFragmentManager().mo4415j0(C31284d.f77700H);
        C41536l.m120487g(j0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        NavHostFragment navHostFragment = (NavHostFragment) j0;
        navHostFragment.mo5009k1().mo22133k0(navHostFragment.mo5009k1().mo22114F().mo22243b(C31286f.transport_card_nav_graph), getIntent().getExtras());
        navHostFragment.mo5009k1().mo22137p(new C37098h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public static final void m102852H2(TransportCardActivity transportCardActivity, C7556l lVar, C7589q qVar, Bundle bundle) {
        C41536l.m120489i(transportCardActivity, "this$0");
        C41536l.m120489i(lVar, "<anonymous parameter 0>");
        C41536l.m120489i(qVar, "dest");
        CharSequence x = qVar.mo22215x();
        if (x != null) {
            transportCardActivity.mo86429X1(x.toString());
        }
    }

    /* renamed from: I2 */
    public final void mo85812I2(int i) {
        m102850F2().f78968g.setBackground(getDrawable(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m102850F2().mo3946b());
        super.mo37451O1(bundle);
        m102851G2();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return "აბონიმენტის ყიდვა";
    }
}
