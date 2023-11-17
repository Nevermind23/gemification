package p341ge.bog.mobilebank.giftcards.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import he1.C41217g;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37613p;
import oh0.C27010e;
import oh0.C27012g;
import oh0.C27014i;
import p202p0.C7556l;
import p202p0.C7589q;
import p202p0.C7594s;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p642vh.C18368l;
import th0.C28396e;
import ue1.C43064a;
import zh0.C30308a;
import zh0.C30309b;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsActivity */
public final class GiftCardsActivity extends C30772sa implements C30308a {

    /* renamed from: H */
    public static final C24064a f62414H = new C24064a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f62415F = C41219i.m119470b(new C24065b(this));

    /* renamed from: G */
    private final C41217g f62416G = C41219i.m119470b(new C24066c(this));

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsActivity$a */
    public static final class C24064a {
        private C24064a() {
        }

        public /* synthetic */ C24064a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo61584a(Context context, GiftCardsFlow giftCardsFlow) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(giftCardsFlow, "giftCardsFlow");
            context.startActivity(C37613p.m110614a(new Intent(context, GiftCardsActivity.class), C41233s.m119492a("GIFT_CARDS_FLOW_DATA", giftCardsFlow)));
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsActivity$b */
    static final class C24065b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GiftCardsActivity f62417d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24065b(GiftCardsActivity giftCardsActivity) {
            super(0);
            this.f62417d = giftCardsActivity;
        }

        /* renamed from: b */
        public final C28396e invoke() {
            return C28396e.m87105d(this.f62417d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsActivity$c */
    static final class C24066c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GiftCardsActivity f62418d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24066c(GiftCardsActivity giftCardsActivity) {
            super(0);
            this.f62418d = giftCardsActivity;
        }

        /* renamed from: b */
        public final GiftCardsFlow invoke() {
            Parcelable parcelableExtra = this.f62418d.getIntent().getParcelableExtra("GIFT_CARDS_FLOW_DATA");
            C41536l.m120486f(parcelableExtra);
            return (GiftCardsFlow) parcelableExtra;
        }
    }

    /* renamed from: F2 */
    private final C28396e m77600F2() {
        return (C28396e) this.f62415F.getValue();
    }

    /* renamed from: G2 */
    private final GiftCardsFlow m77601G2() {
        return (GiftCardsFlow) this.f62416G.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public static final void m77602H2(GiftCardsActivity giftCardsActivity, C7556l lVar, C7589q qVar, Bundle bundle) {
        boolean z;
        C41536l.m120489i(giftCardsActivity, "this$0");
        C41536l.m120489i(lVar, "<anonymous parameter 0>");
        C41536l.m120489i(qVar, "destination");
        ToolbarView toolbarView = giftCardsActivity.m77600F2().f72013g;
        if (qVar.mo22214w() != C27010e.giftCardsSuccessFragment) {
            z = true;
        } else {
            z = false;
        }
        toolbarView.setNavigationEnabled(z);
    }

    /* renamed from: M */
    public void mo61582M(int i) {
        m77600F2().f72013g.setBackgroundColor(C18368l.m62755d(this, i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m77600F2().mo3946b());
        super.mo70996D2(bundle, m77600F2());
        Fragment j0 = getSupportFragmentManager().mo4415j0(C27010e.f67825j1);
        C41536l.m120487g(j0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        C7556l k1 = ((NavHostFragment) j0).mo5009k1();
        C7594s b = k1.mo22114F().mo22243b(C27012g.gift_cards_nav_graph);
        b.mo22234T(m77601G2().mo61587a());
        k1.mo22133k0(b, C0908e.m3336b(C41233s.m119492a(getString(C27014i.gift_cards_flow_extra), m77601G2())));
        k1.mo22137p(new C30309b(this));
    }

    /* renamed from: q0 */
    public void mo61583q0(boolean z, boolean z2) {
        m77600F2().f72013g.mo37106h0(z, z2);
    }
}
