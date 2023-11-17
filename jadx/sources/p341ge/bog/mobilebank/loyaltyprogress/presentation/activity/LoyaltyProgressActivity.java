package p341ge.bog.mobilebank.loyaltyprogress.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import au0.C31066a;
import au0.C31068b;
import b41.C31128a;
import bu0.C31187a;
import bu0.C31188b;
import bu0.C31189c;
import bu0.C31190d;
import bu0.C31191e;
import bu0.C31192f;
import bu0.C31193g;
import bu0.C31198k;
import bu0.C31199l;
import com.google.android.material.tabs.C5161d;
import com.google.android.material.tabs.TabLayout;
import g91.C32303f;
import g91.C32319m;
import g91.C32343x;
import gu0.C36080b;
import gu0.C36081c;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import hu0.C36222c;
import iu0.C36546y;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.designsystem.components.buttonlist.ButtonListLargeView;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.tabs.TabsView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.loyaltyprogress.presentation.model.statusbenefits.StatusBenefitsUiModel;
import p341ge.bog.mobilebank.loyaltyprogress.presentation.viewmodels.LoyaltyProgressViewModel$ViewModel;
import p341ge.bog.mobilebank.model.usrinfo.UserInfoConsts;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import rt0.C38341c;
import rt0.C38343e;
import ue1.C43064a;
import ue1.C43075l;
import vt0.C39466c;

/* renamed from: ge.bog.mobilebank.loyaltyprogress.presentation.activity.LoyaltyProgressActivity */
public final class LoyaltyProgressActivity extends C33168a {

    /* renamed from: K */
    public static final C33159a f81225K = new C33159a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public PreferencesApiManager f81226G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C39466c f81227H;

    /* renamed from: I */
    private final C41217g f81228I = new C1617p0(C41520a0.m120436b(LoyaltyProgressViewModel$ViewModel.class), new C33166h(this), new C33165g(this), new C33167i((C43064a) null, this));

    /* renamed from: J */
    private final C41217g f81229J = C41219i.m119470b(C33160b.f81230d);

    /* renamed from: ge.bog.mobilebank.loyaltyprogress.presentation.activity.LoyaltyProgressActivity$a */
    public static final class C33159a {
        private C33159a() {
        }

        public /* synthetic */ C33159a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo75395a(Context context) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, LoyaltyProgressActivity.class));
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyprogress.presentation.activity.LoyaltyProgressActivity$b */
    static final class C33160b extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C33160b f81230d = new C33160b();

        C33160b() {
            super(0);
        }

        /* renamed from: b */
        public final C31199l invoke() {
            return new C31199l();
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyprogress.presentation.activity.LoyaltyProgressActivity$c */
    static final class C33161c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoyaltyProgressActivity f81231d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33161c(LoyaltyProgressActivity loyaltyProgressActivity) {
            super(1);
            this.f81231d = loyaltyProgressActivity;
        }

        /* renamed from: a */
        public final void mo75397a(C31128a aVar) {
            C39466c cVar = null;
            if (aVar instanceof C31128a.C31129a) {
                C39466c M2 = this.f81231d.f81227H;
                if (M2 == null) {
                    C41536l.m120506z("binding");
                    M2 = null;
                }
                M2.f93881s.setVisibility(8);
                C39466c M22 = this.f81231d.f81227H;
                if (M22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    cVar = M22;
                }
                cVar.f93879q.setVisibility(0);
            } else if (aVar instanceof C31128a.C31130b) {
                C39466c M23 = this.f81231d.f81227H;
                if (M23 == null) {
                    C41536l.m120506z("binding");
                    M23 = null;
                }
                M23.f93881s.setVisibility(0);
                C39466c M24 = this.f81231d.f81227H;
                if (M24 == null) {
                    C41536l.m120506z("binding");
                } else {
                    cVar = M24;
                }
                cVar.f93879q.setVisibility(8);
            } else if (aVar instanceof C31128a.C31131c) {
                C39466c M25 = this.f81231d.f81227H;
                if (M25 == null) {
                    C41536l.m120506z("binding");
                    M25 = null;
                }
                M25.f93881s.setVisibility(8);
                C31128a.C31131c cVar2 = (C31128a.C31131c) aVar;
                this.f81231d.m97800X2(((C36222c) cVar2.mo71340a()).mo88967c());
                this.f81231d.m97808f3(((C36222c) cVar2.mo71340a()).mo88967c());
                this.f81231d.m97809g3(((C36222c) cVar2.mo71340a()).mo88966b(), ((C36222c) cVar2.mo71340a()).mo88967c());
                C39466c M26 = this.f81231d.f81227H;
                if (M26 == null) {
                    C41536l.m120506z("binding");
                } else {
                    cVar = M26;
                }
                cVar.f93887y.setEnabled(true);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo75397a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyprogress.presentation.activity.LoyaltyProgressActivity$d */
    static final class C33162d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoyaltyProgressActivity f81232d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33162d(LoyaltyProgressActivity loyaltyProgressActivity) {
            super(1);
            this.f81232d = loyaltyProgressActivity;
        }

        /* renamed from: a */
        public final void mo75398a(C41224m mVar) {
            long longValue = ((Number) mVar.mo95676b()).longValue();
            C31068b.f77262E.mo71271a((List) mVar.mo95675a(), longValue).mo4576A1(this.f81232d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo75398a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyprogress.presentation.activity.LoyaltyProgressActivity$e */
    static final class C33163e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoyaltyProgressActivity f81233d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33163e(LoyaltyProgressActivity loyaltyProgressActivity) {
            super(1);
            this.f81233d = loyaltyProgressActivity;
        }

        /* renamed from: a */
        public final void mo75399a(C31128a aVar) {
            if (!(aVar instanceof C31128a.C31129a) && !(aVar instanceof C31128a.C31130b) && (aVar instanceof C31128a.C31131c)) {
                this.f81233d.m97796S2().mo6029i(C41358y.m119991B0((Collection) ((C31128a.C31131c) aVar).mo71340a()));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo75399a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyprogress.presentation.activity.LoyaltyProgressActivity$f */
    static final class C33164f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f81234a;

        C33164f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f81234a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f81234a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f81234a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyprogress.presentation.activity.LoyaltyProgressActivity$g */
    public static final class C33165g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f81235d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33165g(ComponentActivity componentActivity) {
            super(0);
            this.f81235d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f81235d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyprogress.presentation.activity.LoyaltyProgressActivity$h */
    public static final class C33166h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f81236d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33166h(ComponentActivity componentActivity) {
            super(0);
            this.f81236d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f81236d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyprogress.presentation.activity.LoyaltyProgressActivity$i */
    public static final class C33167i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f81237d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f81238e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33167i(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f81237d = aVar;
            this.f81238e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f81237d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f81238e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: Q2 */
    private final void m97794Q2() {
        m97798V2().mo75460iw().mo75464qu().mo4819k(this, new C33164f(new C33161c(this)));
        m97798V2().mo75460iw().mo75456Sj().mo4819k(this, new C33164f(new C33162d(this)));
    }

    /* renamed from: R2 */
    private final void m97795R2() {
        String d = C36546y.m108285N().mo89313K().getLoginInfo().mo90307d();
        if (!mo75394U2().getStatusesFirstVisitedUser(d).booleanValue()) {
            C39466c cVar = this.f81227H;
            C39466c cVar2 = null;
            if (cVar == null) {
                C41536l.m120506z("binding");
                cVar = null;
            }
            cVar.f93865C.mo3946b().setVisibility(0);
            C39466c cVar3 = this.f81227H;
            if (cVar3 == null) {
                C41536l.m120506z("binding");
            } else {
                cVar2 = cVar3;
            }
            cVar2.f93888z.setVisibility(8);
            m97814l3();
            mo75394U2().saveStatusesFirstVisitedUser(d);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public final C31199l m97796S2() {
        return (C31199l) this.f81229J.getValue();
    }

    /* renamed from: T2 */
    private final String m97797T2(long j, long j2) {
        String d = C32319m.m95297d(j, "dd MMM. yyyy");
        String d2 = C32319m.m95297d(j2, "dd MMM. yyyy");
        return d + ". - " + d2 + ".";
    }

    /* renamed from: V2 */
    private final LoyaltyProgressViewModel$ViewModel m97798V2() {
        return (LoyaltyProgressViewModel$ViewModel) this.f81228I.getValue();
    }

    /* renamed from: W2 */
    private final void m97799W2() {
        m97798V2().mo75460iw().mo75455Nq().mo4819k(this, new C33164f(new C33163e(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public final void m97800X2(C36080b bVar) {
        C39466c cVar = this.f81227H;
        Image.Drawable drawable = null;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        ActionSheetTitle actionSheetTitle = cVar.f93871i;
        actionSheetTitle.setTitle(C32343x.m95388F("text.pluspage.current.period.title", new Object[0]));
        actionSheetTitle.setCaption(C32343x.m95388F("text.pluspage.current.period.duration", new Object[0]) + ": " + m97797T2(bVar.mo88814l(), bVar.mo88805e()));
        C39466c cVar2 = this.f81227H;
        if (cVar2 == null) {
            C41536l.m120506z("binding");
            cVar2 = null;
        }
        ButtonListLargeView buttonListLargeView = cVar2.f93869g;
        C36081c c = bVar.mo88803c();
        if (c != null) {
            Drawable drawable2 = getDrawable(c.mo88817b());
            if (drawable2 != null) {
                C41536l.m120488h(drawable2, "getDrawable(it)");
                drawable = new Image.Drawable(drawable2, (Boolean) null, 2, (DefaultConstructorMarker) null);
            }
            buttonListLargeView.setIcon(drawable);
        }
        buttonListLargeView.setUpperText(C32343x.m95388F("text.pluspage.your.status", new Object[0]));
        buttonListLargeView.setLowerText(bVar.mo88802b());
        buttonListLargeView.setButtonText(C32343x.m95388F("text.pluspage.learn.more", new Object[0]));
        buttonListLargeView.setOnButtonClickListener(new C31190d(bVar, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public static final void m97801Y2(C36080b bVar, LoyaltyProgressActivity loyaltyProgressActivity, View view) {
        C41536l.m120489i(bVar, "$statusDetails");
        C41536l.m120489i(loyaltyProgressActivity, "this$0");
        String d = bVar.mo88804d();
        if (d != null) {
            C32303f.m95184D(d, loyaltyProgressActivity);
        }
    }

    /* renamed from: Z2 */
    private final void m97802Z2() {
        C39466c cVar = this.f81227H;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        cVar.f93878p.f68328f.mo3946b().setOnClickListener(new C31187a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public static final void m97803a3(LoyaltyProgressActivity loyaltyProgressActivity, View view) {
        C41536l.m120489i(loyaltyProgressActivity, "this$0");
        C39466c cVar = loyaltyProgressActivity.f81227H;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        cVar.f93879q.setVisibility(8);
        C21481a.onRefresh$default(loyaltyProgressActivity.m97798V2(), 0, 1, (Object) null);
    }

    /* renamed from: b3 */
    private final void m97804b3() {
        C39466c cVar = this.f81227H;
        C39466c cVar2 = null;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        cVar.f93887y.setEnabled(false);
        C39466c cVar3 = this.f81227H;
        if (cVar3 == null) {
            C41536l.m120506z("binding");
            cVar3 = null;
        }
        cVar3.f93887y.setButtonText(C32343x.m95388F("text.pluspage.button", new Object[0]));
        C39466c cVar4 = this.f81227H;
        if (cVar4 == null) {
            C41536l.m120506z("binding");
        } else {
            cVar2 = cVar4;
        }
        cVar2.f93887y.setOnClickListener(new C31188b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public static final void m97805c3(LoyaltyProgressActivity loyaltyProgressActivity, View view) {
        C41536l.m120489i(loyaltyProgressActivity, "this$0");
        loyaltyProgressActivity.m97798V2().mo75458gw().mo75457Wp();
    }

    /* renamed from: d3 */
    private final void m97806d3() {
        C39466c cVar = this.f81227H;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        cVar.f93882t.setOnClickListener(new C31191e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public static final void m97807e3(LoyaltyProgressActivity loyaltyProgressActivity, View view) {
        C41536l.m120489i(loyaltyProgressActivity, "this$0");
        C31066a.f77260C.mo71270a().mo4576A1(loyaltyProgressActivity.getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final void m97808f3(C36080b bVar) {
        C39466c cVar = this.f81227H;
        C39466c cVar2 = null;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        ActionSheetTitle actionSheetTitle = cVar.f93885w;
        actionSheetTitle.setTitle(C32343x.m95388F("text.pluspage.next.period.title", new Object[0]));
        actionSheetTitle.setCaption(C32343x.m95388F("text.pluspage.next.period.duration", new Object[0]) + ": " + m97797T2(bVar.mo88812j(), bVar.mo88807f()));
        if (bVar.mo88811i() == null) {
            C39466c cVar3 = this.f81227H;
            if (cVar3 == null) {
                C41536l.m120506z("binding");
                cVar3 = null;
            }
            cVar3.f93880r.setVisibility(0);
            C39466c cVar4 = this.f81227H;
            if (cVar4 == null) {
                C41536l.m120506z("binding");
                cVar4 = null;
            }
            cVar4.f93884v.setVisibility(8);
            C39466c cVar5 = this.f81227H;
            if (cVar5 == null) {
                C41536l.m120506z("binding");
                cVar5 = null;
            }
            cVar5.f93880r.setTitle(C32343x.m95388F("text.pluspage.collected", new Object[0]) + " " + bVar.mo88815m());
            C39466c cVar6 = this.f81227H;
            if (cVar6 == null) {
                C41536l.m120506z("binding");
            } else {
                cVar2 = cVar6;
            }
            cVar2.f93880r.setText(C32343x.m95388F("text.pluspage.gold.message", new Object[0]));
            return;
        }
        C39466c cVar7 = this.f81227H;
        if (cVar7 == null) {
            C41536l.m120506z("binding");
            cVar7 = null;
        }
        cVar7.f93880r.setVisibility(8);
        C39466c cVar8 = this.f81227H;
        if (cVar8 == null) {
            C41536l.m120506z("binding");
            cVar8 = null;
        }
        cVar8.f93884v.setVisibility(0);
        C36081c k = bVar.mo88813k();
        if (k != null) {
            int b = k.mo88817b();
            C39466c cVar9 = this.f81227H;
            if (cVar9 == null) {
                C41536l.m120506z("binding");
                cVar9 = null;
            }
            cVar9.f93877o.setImageResource(b);
        }
        int b2 = bVar.mo88811i().mo88817b();
        C39466c cVar10 = this.f81227H;
        if (cVar10 == null) {
            C41536l.m120506z("binding");
            cVar10 = null;
        }
        cVar10.f93886x.setImageResource(b2);
        C39466c cVar11 = this.f81227H;
        if (cVar11 == null) {
            C41536l.m120506z("binding");
            cVar11 = null;
        }
        cVar11.f93872j.setProgress(bVar.mo88801a());
        C39466c cVar12 = this.f81227H;
        if (cVar12 == null) {
            C41536l.m120506z("binding");
            cVar12 = null;
        }
        cVar12.f93873k.setText(C32343x.m95388F("text.pluspage.collected", new Object[0]));
        C39466c cVar13 = this.f81227H;
        if (cVar13 == null) {
            C41536l.m120506z("binding");
            cVar13 = null;
        }
        cVar13.f93876n.setText(bVar.mo88815m() + " " + C32343x.m95388F(UserInfoConsts.TEXT_PLUSPAGE_STARS, new Object[0]));
        C39466c cVar14 = this.f81227H;
        if (cVar14 == null) {
            C41536l.m120506z("binding");
            cVar14 = null;
        }
        cVar14.f93874l.setText(String.valueOf(bVar.mo88809h()));
        C39466c cVar15 = this.f81227H;
        if (cVar15 == null) {
            C41536l.m120506z("binding");
        } else {
            cVar2 = cVar15;
        }
        cVar2.f93875m.setText(bVar.mo88808g() + " " + C32343x.m95388F(UserInfoConsts.TEXT_PLUSPAGE_STATUS, new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public final void m97809g3(List list, C36080b bVar) {
        C39466c cVar = this.f81227H;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        cVar.f93868f.setAdapter(new C31198k(this, list));
        C39466c cVar2 = this.f81227H;
        if (cVar2 == null) {
            C41536l.m120506z("binding");
            cVar2 = null;
        }
        TabsView tabsView = cVar2.f93867e;
        C39466c cVar3 = this.f81227H;
        if (cVar3 == null) {
            C41536l.m120506z("binding");
            cVar3 = null;
        }
        new C5161d(tabsView, cVar3.f93868f, new C31189c(list)).mo16990a();
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C41341q.m119917t();
            }
            if (C41536l.m120484d(((StatusBenefitsUiModel) next).mo75443b(), bVar.mo88802b())) {
                C39466c cVar4 = this.f81227H;
                if (cVar4 == null) {
                    C41536l.m120506z("binding");
                    cVar4 = null;
                }
                TabsView tabsView2 = cVar4.f93867e;
                tabsView2.selectTab(tabsView2.getTabAt(i));
            }
            i = i2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public static final void m97810h3(List list, TabLayout.C5153g gVar, int i) {
        C41536l.m120489i(list, "$statusBenefitsUiModel");
        C41536l.m120489i(gVar, "tab");
        StatusBenefitsUiModel statusBenefitsUiModel = (StatusBenefitsUiModel) list.get(i);
        gVar.mo16972u(statusBenefitsUiModel.mo75443b());
        gVar.mo16970s(statusBenefitsUiModel);
    }

    /* renamed from: i3 */
    private final void m97811i3() {
        C39466c cVar = this.f81227H;
        C39466c cVar2 = null;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        cVar.f93865C.f93913i.mo1887x(C38343e.welcome_page_menu);
        C39466c cVar3 = this.f81227H;
        if (cVar3 == null) {
            C41536l.m120506z("binding");
            cVar3 = null;
        }
        cVar3.f93865C.f93913i.setOnMenuItemClickListener(new C31192f(this));
        C39466c cVar4 = this.f81227H;
        if (cVar4 == null) {
            C41536l.m120506z("binding");
        } else {
            cVar2 = cVar4;
        }
        cVar2.f93865C.f93912h.setOnClickListener(new C31193g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public static final boolean m97812j3(LoyaltyProgressActivity loyaltyProgressActivity, MenuItem menuItem) {
        C41536l.m120489i(loyaltyProgressActivity, "this$0");
        if (menuItem.getItemId() != C38341c.welcome_close) {
            return false;
        }
        loyaltyProgressActivity.m97817o3();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m97813k3(LoyaltyProgressActivity loyaltyProgressActivity, View view) {
        C41536l.m120489i(loyaltyProgressActivity, "this$0");
        loyaltyProgressActivity.m97817o3();
    }

    /* renamed from: l3 */
    private final void m97814l3() {
        m97798V2().mo75463lw();
        m97811i3();
        m97815m3();
        m97816n3();
        m97799W2();
    }

    /* renamed from: m3 */
    private final void m97815m3() {
        C39466c cVar = this.f81227H;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        cVar.f93865C.f93910f.setAdapter(m97796S2());
    }

    /* renamed from: n3 */
    private final void m97816n3() {
        C39466c cVar = this.f81227H;
        C39466c cVar2 = null;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        cVar.f93865C.f93913i.setTitle(C32343x.m95388F("pluspage.welcome.popup.header", new Object[0]));
        C39466c cVar3 = this.f81227H;
        if (cVar3 == null) {
            C41536l.m120506z("binding");
            cVar3 = null;
        }
        cVar3.f93865C.f93911g.setText(C32343x.m95388F("pluspage.welcome.popup.title", new Object[0]));
        C39466c cVar4 = this.f81227H;
        if (cVar4 == null) {
            C41536l.m120506z("binding");
        } else {
            cVar2 = cVar4;
        }
        cVar2.f93865C.f93912h.getButton().setButtonText(C32343x.m95388F("pluspage.welcome.popup.button", new Object[0]));
    }

    /* renamed from: o3 */
    private final void m97817o3() {
        C39466c cVar = this.f81227H;
        C39466c cVar2 = null;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        cVar.f93865C.mo3946b().setVisibility(8);
        C39466c cVar3 = this.f81227H;
        if (cVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            cVar2 = cVar3;
        }
        cVar2.f93888z.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C39466c d = C39466c.m114720d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f81227H = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        m97795R2();
        m97794Q2();
        m97804b3();
        m97802Z2();
        m97806d3();
        super.mo37451O1(bundle);
    }

    /* renamed from: U2 */
    public final PreferencesApiManager mo75394U2() {
        PreferencesApiManager preferencesApiManager = this.f81226G;
        if (preferencesApiManager != null) {
            return preferencesApiManager;
        }
        C41536l.m120506z("preferencesApiManager");
        return null;
    }
}
