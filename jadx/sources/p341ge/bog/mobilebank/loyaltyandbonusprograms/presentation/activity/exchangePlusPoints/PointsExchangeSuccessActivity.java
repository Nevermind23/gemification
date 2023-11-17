package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0767a;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import com.facebook.shimmer.ShimmerFrameLayout;
import et0.C31810m;
import et0.C31811n;
import g91.C32303f;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.ExchangePointsData;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PointsExchangeSuccessViewModel$ViewModel;
import q31.C38122f;
import q31.C38125h;
import rs0.C38334a;
import rs0.C38338e;
import ue1.C43064a;
import ue1.C43075l;
import vs0.C39448g;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.PointsExchangeSuccessActivity */
public final class PointsExchangeSuccessActivity extends C30772sa {

    /* renamed from: I */
    public static final C32926a f80795I = new C32926a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f80796F = new C1617p0(C41520a0.m120436b(PointsExchangeSuccessViewModel$ViewModel.class), new C32933h(this), new C32932g(this), new C32934i((C43064a) null, this));

    /* renamed from: G */
    private final C41217g f80797G = C41219i.m119470b(new C32929d(this));

    /* renamed from: H */
    private final C41217g f80798H = C41219i.m119470b(new C32930e(this));

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.PointsExchangeSuccessActivity$a */
    public static final class C32926a {
        private C32926a() {
        }

        public /* synthetic */ C32926a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo74809a(Context context, ExchangePointsData exchangePointsData) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(exchangePointsData, "successData");
            Intent intent = new Intent(context, PointsExchangeSuccessActivity.class);
            intent.putExtra("EXTRA_SUCCESS_DATA", exchangePointsData);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.PointsExchangeSuccessActivity$b */
    static final class C32927b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PointsExchangeSuccessActivity f80799d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32927b(PointsExchangeSuccessActivity pointsExchangeSuccessActivity) {
            super(1);
            this.f80799d = pointsExchangeSuccessActivity;
        }

        /* renamed from: a */
        public final void mo74810a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                C31128a.C31131c cVar = (C31128a.C31131c) aVar;
                this.f80799d.m97197N2((BigDecimal) ((C41224m) cVar.mo71340a()).mo95678e(), (BigDecimal) ((C41224m) cVar.mo71340a()).mo95680f());
            } else if (aVar instanceof C31128a.C31130b) {
                this.f80799d.m97202S2(true);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f80799d.m97202S2(false);
                ListItem listItem = this.f80799d.m97193K2().f93749f;
                C41536l.m120488h(listItem, "binding.availablePoints");
                C32343x.m95455i0(listItem);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74810a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.PointsExchangeSuccessActivity$c */
    static final class C32928c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PointsExchangeSuccessActivity f80800d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32928c(PointsExchangeSuccessActivity pointsExchangeSuccessActivity) {
            super(1);
            this.f80800d = pointsExchangeSuccessActivity;
        }

        /* renamed from: a */
        public final void mo74811a(boolean z) {
            int i;
            PointsExchangeSuccessActivity pointsExchangeSuccessActivity = this.f80800d;
            if (z) {
                i = C38334a.f91847b;
            } else {
                i = C38334a.f91846a;
            }
            pointsExchangeSuccessActivity.m97195M(i);
            this.f80800d.m97193K2().f93765v.mo37106h0(z, true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74811a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.PointsExchangeSuccessActivity$d */
    static final class C32929d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PointsExchangeSuccessActivity f80801d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32929d(PointsExchangeSuccessActivity pointsExchangeSuccessActivity) {
            super(0);
            this.f80801d = pointsExchangeSuccessActivity;
        }

        /* renamed from: b */
        public final C39448g invoke() {
            return C39448g.m114647d(this.f80801d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.PointsExchangeSuccessActivity$e */
    static final class C32930e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PointsExchangeSuccessActivity f80802d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32930e(PointsExchangeSuccessActivity pointsExchangeSuccessActivity) {
            super(0);
            this.f80802d = pointsExchangeSuccessActivity;
        }

        /* renamed from: b */
        public final ExchangePointsData invoke() {
            return (ExchangePointsData) this.f80802d.getIntent().getParcelableExtra("EXTRA_SUCCESS_DATA");
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.PointsExchangeSuccessActivity$f */
    static final class C32931f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f80803a;

        C32931f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f80803a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f80803a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f80803a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.PointsExchangeSuccessActivity$g */
    public static final class C32932g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f80804d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32932g(ComponentActivity componentActivity) {
            super(0);
            this.f80804d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f80804d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.PointsExchangeSuccessActivity$h */
    public static final class C32933h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f80805d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32933h(ComponentActivity componentActivity) {
            super(0);
            this.f80805d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f80805d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.PointsExchangeSuccessActivity$i */
    public static final class C32934i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80806d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f80807e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32934i(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f80806d = aVar;
            this.f80807e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f80806d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f80807e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public final C39448g m97193K2() {
        return (C39448g) this.f80797G.getValue();
    }

    /* renamed from: L2 */
    private final ExchangePointsData m97194L2() {
        return (ExchangePointsData) this.f80798H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public final void m97195M(int i) {
        m97193K2().f93765v.setBackgroundColor(C0767a.m2893c(this, i));
    }

    /* renamed from: M2 */
    private final PointsExchangeSuccessViewModel$ViewModel m97196M2() {
        return (PointsExchangeSuccessViewModel$ViewModel) this.f80796F.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public final void m97197N2(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        String str;
        C39448g K2 = m97193K2();
        m97202S2(false);
        if (bigDecimal == null && bigDecimal2 == null) {
            AppCompatTextView appCompatTextView = K2.f93754k;
            C41536l.m120488h(appCompatTextView, "points");
            C32343x.m95455i0(appCompatTextView);
            return;
        }
        AppCompatTextView appCompatTextView2 = K2.f93754k;
        String str2 = null;
        if (bigDecimal != null) {
            str = C32303f.m95206q(bigDecimal.doubleValue()) + " " + getString(C38338e.f91911l);
        } else {
            str = null;
        }
        appCompatTextView2.setText(str);
        AppCompatTextView appCompatTextView3 = K2.f93759p;
        if (bigDecimal2 != null) {
            str2 = C32343x.m95408P(bigDecimal2, "GEL");
        }
        appCompatTextView3.setText(str2);
    }

    /* renamed from: O2 */
    private final void m97198O2() {
        m97193K2().f93752i.setOnScrollChangeListener(new C31811n(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public static final void m97199P2(PointsExchangeSuccessActivity pointsExchangeSuccessActivity, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        C41536l.m120489i(pointsExchangeSuccessActivity, "this$0");
        C41536l.m120489i(nestedScrollView, "<anonymous parameter 0>");
        pointsExchangeSuccessActivity.m97196M2().mo75293jw(pointsExchangeSuccessActivity.m97193K2().f93752i.canScrollVertically(-1));
    }

    /* renamed from: Q2 */
    private final void m97200Q2() {
        String str;
        String str2;
        String str3;
        String e;
        String b;
        C39448g K2 = m97193K2();
        K2.f93753j.setTitleText(C32343x.m95388F("text.MR.to.PLUS.exchange.success.text", new Object[0]));
        K2.f93761r.setText(C32343x.m95388F("text.MR.to.PLUS.exchange.remaining.points", new Object[0]));
        K2.f93761r.setTitle(C32343x.m95388F("text.MR.to.PLUS.exchange.points.in.Gel", new Object[0]));
        K2.f93751h.setButtonText(C32343x.m95388F("text.MR.to.PLUS.exchange.go.home.button", new Object[0]));
        K2.f93750g.setTitle(C32343x.m95388F("text.MR.to.PLUS.exchange.details", new Object[0]));
        K2.f93757n.setText(C32343x.m95388F("text.MR.to.PLUS.exchange.exchanged.points", new Object[0]));
        K2.f93757n.setTitle(C32343x.m95388F("text.MR.to.PLUS.exchange.points.in.Gel", new Object[0]));
        AppCompatTextView appCompatTextView = K2.f93755l;
        ExchangePointsData L2 = m97194L2();
        String str4 = null;
        if (L2 != null) {
            str = L2.mo74978a();
        } else {
            str = null;
        }
        appCompatTextView.setText(str);
        AppCompatTextView appCompatTextView2 = K2.f93756m;
        ExchangePointsData L22 = m97194L2();
        if (L22 == null || (b = L22.mo74979b()) == null) {
            str2 = null;
        } else {
            str2 = C32343x.m95406O(b, "GEL");
        }
        appCompatTextView2.setText(str2);
        K2.f93764u.setText(C32343x.m95388F("text.MR.to.PLUS.exchange.received.points", new Object[0]));
        K2.f93764u.setTitle(C32343x.m95388F("text.MR.to.PLUS.exchange.points.in.Gel", new Object[0]));
        AppCompatTextView appCompatTextView3 = K2.f93762s;
        ExchangePointsData L23 = m97194L2();
        if (L23 != null) {
            str3 = L23.mo74980d();
        } else {
            str3 = null;
        }
        appCompatTextView3.setText(str3);
        AppCompatTextView appCompatTextView4 = K2.f93763t;
        ExchangePointsData L24 = m97194L2();
        if (!(L24 == null || (e = L24.mo74982e()) == null)) {
            str4 = C32343x.m95406O(e, "GEL");
        }
        appCompatTextView4.setText(str4);
        K2.f93751h.setOnClickListener(new C31810m(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public static final void m97201R2(PointsExchangeSuccessActivity pointsExchangeSuccessActivity, View view) {
        C41536l.m120489i(pointsExchangeSuccessActivity, "this$0");
        C38122f.C38123a.m112215k(C38125h.m112238c(pointsExchangeSuccessActivity), pointsExchangeSuccessActivity, (String) null, (Bundle) null, 6, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public final void m97202S2(boolean z) {
        C39448g K2 = m97193K2();
        ShimmerFrameLayout shimmerFrameLayout = K2.f93760q;
        C41536l.m120488h(shimmerFrameLayout, "pointsLoading");
        C32343x.m95483r1(shimmerFrameLayout, z, false, 2, (Object) null);
        ListItem listItem = K2.f93749f;
        C41536l.m120488h(listItem, "availablePoints");
        C32343x.m95483r1(listItem, !z, false, 2, (Object) null);
    }

    /* renamed from: l1 */
    private final void m97203l1() {
        PointsExchangeSuccessViewModel$ViewModel M2 = m97196M2();
        M2.mo75291hw().mo4819k(this, new C32931f(new C32927b(this)));
        C37224b.m109963b(M2.mo75292iw(), this, new C32928c(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m97193K2().mo3946b());
        super.mo37451O1(bundle);
        m97193K2().f93765v.setNavigationEnabled(false);
        m97200Q2();
        m97198O2();
        m97203l1();
    }

    public void onBackPressed() {
        C38122f.C38123a.m112215k(C38125h.m112238c(this), this, (String) null, (Bundle) null, 6, (Object) null);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("text.MR.to.PLUS.exchange.header", new Object[0]);
    }
}
