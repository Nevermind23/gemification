package p341ge.bog.mobilebank.settings.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.core.content.C0767a;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import f11.C31909c;
import f11.C31912f;
import f11.C31914h;
import g11.C32040a;
import g11.C32041b;
import g91.C32303f;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import j11.C36695c;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel;
import p341ge.bog.mobilebank.cleanarch.settings.presentation.SecuritySettingsActivity;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.activities.DebugSettingsActivity;
import p341ge.bog.mobilebank.p975ui.activities.ManageAccountsAndCardsActivity;
import p341ge.bog.mobilebank.p975ui.activities.ManagePensionFundsActivity;
import p341ge.bog.mobilebank.p975ui.activities.SmsNotifManagerActivity;
import p341ge.bog.mobilebank.settings.SettingsViewModel$ViewModel;
import p341ge.bog.mobilebank.shared.navigation.NavigatorConstants$JuniorFlow;
import p725cr.C19788a;
import q31.C38122f;
import q31.C38125h;
import t11.C38627h;
import t11.C38628i;
import t11.C38629j;
import t11.C38630k;
import t11.C38631l;
import u11.C39005b;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity */
public final class SettingsActivity extends C34611b implements C39005b.C39006a {

    /* renamed from: N */
    public static final C34583a f83582N = new C34583a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public Client f83583G;

    /* renamed from: H */
    private final C41217g f83584H = C41219i.m119470b(new C34584b(this));

    /* renamed from: I */
    private final C41217g f83585I = new C1617p0(C41520a0.m120436b(SettingsViewModel$ViewModel.class), new C34607y(this), new C34606x(this), new C34608z((C43064a) null, this));

    /* renamed from: J */
    private final C41217g f83586J = C41219i.m119470b(new C34586d(this));

    /* renamed from: K */
    private final C41217g f83587K = C41219i.m119470b(new C34605w(this));

    /* renamed from: L */
    private final C41217g f83588L = C41219i.m119470b(new C34585c(this));

    /* renamed from: M */
    private final C41217g f83589M = C41219i.m119470b(new C34587e(this));

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$a */
    public static final class C34583a {
        private C34583a() {
        }

        public /* synthetic */ C34583a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo84107a(Context context) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, SettingsActivity.class));
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$b */
    static final class C34584b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SettingsActivity f83590d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34584b(SettingsActivity settingsActivity) {
            super(0);
            this.f83590d = settingsActivity;
        }

        /* renamed from: b */
        public final C36695c invoke() {
            return C36695c.m108826d(this.f83590d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$c */
    static final class C34585c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SettingsActivity f83591d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34585c(SettingsActivity settingsActivity) {
            super(0);
            this.f83591d = settingsActivity;
        }

        /* renamed from: b */
        public final C13364a invoke() {
            return new C13364a(C0767a.m2895e(this.f83591d, C31909c.f78658j), true, false);
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$d */
    static final class C34586d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SettingsActivity f83592d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34586d(SettingsActivity settingsActivity) {
            super(0);
            this.f83592d = settingsActivity;
        }

        /* renamed from: b */
        public final C39005b invoke() {
            return new C39005b(this.f83592d);
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$e */
    static final class C34587e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SettingsActivity f83593d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34587e(SettingsActivity settingsActivity) {
            super(0);
            this.f83593d = settingsActivity;
        }

        /* renamed from: b */
        public final C38122f invoke() {
            return C38125h.m112238c(this.f83593d);
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$f */
    static final class C34588f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SettingsActivity f83594d;

        /* renamed from: e */
        final /* synthetic */ SettingsActivity f83595e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34588f(SettingsActivity settingsActivity, SettingsActivity settingsActivity2) {
            super(1);
            this.f83594d = settingsActivity;
            this.f83595e = settingsActivity2;
        }

        /* renamed from: a */
        public final void mo84112a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f83594d.m101545s3(this.f83595e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84112a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$g */
    static final class C34589g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SettingsActivity f83596d;

        /* renamed from: e */
        final /* synthetic */ SettingsActivity f83597e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34589g(SettingsActivity settingsActivity, SettingsActivity settingsActivity2) {
            super(1);
            this.f83596d = settingsActivity;
            this.f83597e = settingsActivity2;
        }

        /* renamed from: a */
        public final void mo84113a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f83596d.m101549w3(this.f83597e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84113a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$h */
    static final class C34590h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SettingsActivity f83598d;

        /* renamed from: e */
        final /* synthetic */ SettingsActivity f83599e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34590h(SettingsActivity settingsActivity, SettingsActivity settingsActivity2) {
            super(1);
            this.f83598d = settingsActivity;
            this.f83599e = settingsActivity2;
        }

        /* renamed from: a */
        public final void mo84114a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f83598d.m101548v3(this.f83599e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84114a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$i */
    static final class C34591i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SettingsActivity f83600d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34591i(SettingsActivity settingsActivity) {
            super(1);
            this.f83600d = settingsActivity;
        }

        /* renamed from: a */
        public final void mo84115a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C35388f2.m105060c2(this.f83600d, false, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84115a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$j */
    static final class C34592j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SettingsActivity f83601d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34592j(SettingsActivity settingsActivity) {
            super(1);
            this.f83601d = settingsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "throwable");
            this.f83601d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$k */
    static final class C34593k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SettingsActivity f83602d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34593k(SettingsActivity settingsActivity) {
            super(1);
            this.f83602d = settingsActivity;
        }

        /* renamed from: a */
        public final void mo84117a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            DebugSettingsActivity.m103534o3(this.f83602d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84117a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$l */
    static final class C34594l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SettingsActivity f83603d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34594l(SettingsActivity settingsActivity) {
            super(1);
            this.f83603d = settingsActivity;
        }

        /* renamed from: a */
        public final void mo84118a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f83603d.m101543q3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84118a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$m */
    static final class C34595m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SettingsActivity f83604d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34595m(SettingsActivity settingsActivity) {
            super(1);
            this.f83604d = settingsActivity;
        }

        /* renamed from: a */
        public final void mo84119a(List list) {
            SettingsActivity settingsActivity = this.f83604d;
            C41536l.m120488h(list, "managementItems");
            settingsActivity.m101504B3(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84119a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$n */
    static final class C34596n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SettingsActivity f83605d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34596n(SettingsActivity settingsActivity) {
            super(1);
            this.f83605d = settingsActivity;
        }

        /* renamed from: a */
        public final void mo84120a(List list) {
            SettingsActivity settingsActivity = this.f83605d;
            C41536l.m120488h(list, "securityItems");
            settingsActivity.m101505C3(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84120a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$o */
    static final class C34597o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SettingsActivity f83606d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34597o(SettingsActivity settingsActivity) {
            super(1);
            this.f83606d = settingsActivity;
        }

        /* renamed from: a */
        public final void mo84121a(boolean z) {
            LayerView layerView = this.f83606d.m101526Y2().f88557p;
            C41536l.m120488h(layerView, "binding.layerSettingsManagement");
            C32343x.m95483r1(layerView, z, false, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84121a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$p */
    static final class C34598p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SettingsActivity f83607d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34598p(SettingsActivity settingsActivity) {
            super(1);
            this.f83607d = settingsActivity;
        }

        /* renamed from: a */
        public final void mo84122a(C32040a aVar) {
            ChipGroup chipGroup = this.f83607d.m101526Y2().f88555n;
            C41536l.m120488h(chipGroup, "binding.languageGroup");
            ChipGroup.m49760n(chipGroup, aVar.mo72534c(), false, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84122a((C32040a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$q */
    static final class C34599q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SettingsActivity f83608d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34599q(SettingsActivity settingsActivity) {
            super(1);
            this.f83608d = settingsActivity;
        }

        /* renamed from: a */
        public final void mo84123a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f83608d.m101542p3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84123a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$r */
    static final class C34600r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SettingsActivity f83609d;

        /* renamed from: e */
        final /* synthetic */ SettingsActivity f83610e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34600r(SettingsActivity settingsActivity, SettingsActivity settingsActivity2) {
            super(1);
            this.f83609d = settingsActivity;
            this.f83610e = settingsActivity2;
        }

        /* renamed from: a */
        public final void mo84124a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f83609d.m101550x3(this.f83610e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84124a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$s */
    static final class C34601s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SettingsActivity f83611d;

        /* renamed from: e */
        final /* synthetic */ SettingsActivity f83612e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34601s(SettingsActivity settingsActivity, SettingsActivity settingsActivity2) {
            super(1);
            this.f83611d = settingsActivity;
            this.f83612e = settingsActivity2;
        }

        /* renamed from: a */
        public final void mo84125a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f83611d.m101546t3(this.f83612e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84125a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$t */
    static final class C34602t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SettingsActivity f83613d;

        /* renamed from: e */
        final /* synthetic */ SettingsActivity f83614e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34602t(SettingsActivity settingsActivity, SettingsActivity settingsActivity2) {
            super(1);
            this.f83613d = settingsActivity;
            this.f83614e = settingsActivity2;
        }

        /* renamed from: a */
        public final void mo84126a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f83613d.m101544r3(this.f83614e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84126a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$u */
    static final class C34603u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SettingsActivity f83615d;

        /* renamed from: e */
        final /* synthetic */ SettingsActivity f83616e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34603u(SettingsActivity settingsActivity, SettingsActivity settingsActivity2) {
            super(1);
            this.f83615d = settingsActivity;
            this.f83616e = settingsActivity2;
        }

        /* renamed from: a */
        public final void mo84127a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f83615d.m101547u3(this.f83616e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84127a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$v */
    static final class C34604v implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f83617a;

        C34604v(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f83617a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f83617a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f83617a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$w */
    static final class C34605w extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SettingsActivity f83618d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34605w(SettingsActivity settingsActivity) {
            super(0);
            this.f83618d = settingsActivity;
        }

        /* renamed from: b */
        public final C39005b invoke() {
            return new C39005b(this.f83618d);
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$x */
    public static final class C34606x extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f83619d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34606x(ComponentActivity componentActivity) {
            super(0);
            this.f83619d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f83619d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$y */
    public static final class C34607y extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f83620d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34607y(ComponentActivity componentActivity) {
            super(0);
            this.f83620d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f83620d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.SettingsActivity$z */
    public static final class C34608z extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f83621d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f83622e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34608z(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f83621d = aVar;
            this.f83622e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f83621d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f83622e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public static final void m101503A3(SettingsActivity settingsActivity, View view) {
        C41536l.m120489i(settingsActivity, "this$0");
        settingsActivity.m101532f3().mo84083pw().mo72350Pf();
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public final void m101504B3(List list) {
        m101529c3().mo6029i(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public final void m101505C3(List list) {
        m101531e3().mo6029i(list);
    }

    /* renamed from: V2 */
    private final void m101523V2() {
        RecyclerView recyclerView = m101526Y2().f88559r;
        recyclerView.setLayoutManager(m101525X2());
        recyclerView.setAdapter(m101529c3());
        recyclerView.mo5351j(m101528b3());
    }

    /* renamed from: W2 */
    private final void m101524W2() {
        RecyclerView recyclerView = m101526Y2().f88560s;
        recyclerView.setLayoutManager(m101525X2());
        recyclerView.setAdapter(m101531e3());
        recyclerView.mo5351j(m101528b3());
    }

    /* renamed from: X2 */
    private final SettingsActivity$createNonScrollingLayoutManager$1 m101525X2() {
        return new SettingsActivity$createNonScrollingLayoutManager$1(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public final C36695c m101526Y2() {
        return (C36695c) this.f83584H.getValue();
    }

    /* renamed from: a3 */
    private final C19788a m101527a3() {
        C19788a aVar;
        Fragment k0 = getSupportFragmentManager().mo4418k0("FRAGMENT_TAG_DARK_MODE");
        if (k0 instanceof C19788a) {
            aVar = (C19788a) k0;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return C38125h.m112239d(this).mo91649a();
        }
        return aVar;
    }

    /* renamed from: b3 */
    private final C13364a m101528b3() {
        return (C13364a) this.f83588L.getValue();
    }

    /* renamed from: c3 */
    private final C39005b m101529c3() {
        return (C39005b) this.f83586J.getValue();
    }

    /* renamed from: d3 */
    private final C38122f m101530d3() {
        return (C38122f) this.f83589M.getValue();
    }

    /* renamed from: e3 */
    private final C39005b m101531e3() {
        return (C39005b) this.f83587K.getValue();
    }

    /* renamed from: f3 */
    private final SettingsViewModel$ViewModel m101532f3() {
        return (SettingsViewModel$ViewModel) this.f83585I.getValue();
    }

    /* renamed from: g3 */
    private final void m101533g3() {
        C36695c Y2 = m101526Y2();
        if (mo84105Z2().isAuthorized()) {
            C41536l.m120488h(Y2, "initDebugClickListeners$lambda$8");
            m101538l3(Y2);
            return;
        }
        C41536l.m120488h(Y2, "initDebugClickListeners$lambda$8");
        m101551y3(Y2);
    }

    /* renamed from: h3 */
    private final void m101534h3() {
        m101526Y2().f88555n.setOnChipActivatedChangedListener(new C38627h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public static final void m101535i3(SettingsActivity settingsActivity, Chip chip, int i) {
        C41536l.m120489i(settingsActivity, "this$0");
        C41536l.m120489i(chip, "<anonymous parameter 0>");
        settingsActivity.m101532f3().mo84083pw().mo72351Ts(i);
    }

    /* renamed from: j3 */
    private final void m101536j3() {
        C36695c Y2 = m101526Y2();
        Y2.f88562u.setText(C32343x.m95388F("text.settings.choice.language", new Object[0]));
        Y2.f88563v.setText(C32343x.m95388F("text.settings.preference.management", new Object[0]));
        Y2.f88564w.setText(C32343x.m95388F("text.settings.security.and.login", new Object[0]));
    }

    /* renamed from: k3 */
    private final void m101537k3() {
        m101532f3().mo84083pw().mo72349Di(C32343x.m95476p0(this));
    }

    /* renamed from: l3 */
    private final void m101538l3(C36695c cVar) {
        cVar.f88553l.setOnClickListener(new C38630k(this));
        cVar.f88552k.setOnClickListener(new C38631l(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public static final void m101539m3(SettingsActivity settingsActivity, View view) {
        C41536l.m120489i(settingsActivity, "this$0");
        settingsActivity.m101532f3().mo84083pw().mo72350Pf();
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public static final void m101540n3(SettingsActivity settingsActivity, View view) {
        C41536l.m120489i(settingsActivity, "this$0");
        settingsActivity.m101532f3().mo84083pw().mo72352kv();
    }

    /* renamed from: o3 */
    private final void m101541o3() {
        C31914h zw = m101532f3().mo84093zw();
        zw.mo72357Oq().mo4819k(this, new C34604v(new C34595m(this)));
        zw.mo72356Nl().mo4819k(this, new C34604v(new C34596n(this)));
        C37224b.m109963b(zw.mo72369zm(), this, new C34597o(this));
        zw.getLanguage().mo4819k(this, new C34604v(new C34598p(this)));
        C37224b.m109963b(zw.mo72368p0(), this, new C34599q(this));
        C37224b.m109963b(zw.mo72355N1(), this, new C34600r(this, this));
        C37224b.m109963b(zw.mo72365i1(), this, new C34601s(this, this));
        C37224b.m109963b(zw.mo72362Z0(), this, new C34602t(this, this));
        C37224b.m109963b(zw.mo72360U2(), this, new C34603u(this, this));
        C37224b.m109963b(zw.mo72361V1(), this, new C34588f(this, this));
        C37224b.m109963b(zw.mo72366k1(), this, new C34589g(this, this));
        C37224b.m109963b(zw.mo72363Z1(), this, new C34590h(this, this));
        C37224b.m109963b(zw.mo72358R(), this, new C34591i(this));
        C37224b.m109963b(zw.mo72354Bf(), this, new C34592j(this));
        C37224b.m109963b(zw.mo72367kg(), this, new C34593k(this));
        C37224b.m109963b(zw.mo72359S2(), this, new C34594l(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public final void m101542p3() {
        C32343x.m95495w0(this, "settings", "dark_mode", "click");
        m101527a3().mo4576A1(getSupportFragmentManager(), "FRAGMENT_TAG_DARK_MODE");
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public final void m101543q3() {
        C32343x.m95495w0(this, "settings", "interests", "click");
        m101530d3().mo91596c(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public final void m101544r3(SettingsActivity settingsActivity) {
        C32343x.m95495w0(this, "GT", "management", "click");
        m101530d3().mo91638x(settingsActivity);
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public final void m101545s3(SettingsActivity settingsActivity) {
        C32343x.m95495w0(this, "settings", "bog_scool_app", "click");
        m101530d3().mo91540B(settingsActivity, (JuniorRequestDataUiModel) null, NavigatorConstants$JuniorFlow.ACTIVATION, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public final void m101546t3(SettingsActivity settingsActivity) {
        C32343x.m95495w0(this, "settings", "accounts_and_cards", "click");
        startActivity(new Intent(settingsActivity, ManageAccountsAndCardsActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public final void m101547u3(SettingsActivity settingsActivity) {
        C32343x.m95495w0(this, "settings", "pension", "click");
        startActivity(new Intent(settingsActivity, ManagePensionFundsActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public final void m101548v3(SettingsActivity settingsActivity) {
        C32343x.m95495w0(this, "settings", "privacy_policy", "click");
        C32303f.m95183C(settingsActivity);
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public final void m101549w3(SettingsActivity settingsActivity) {
        C32343x.m95495w0(this, "settings", "sign_in_auth", "click");
        SecuritySettingsActivity.f59609G.mo55703a(settingsActivity, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public final void m101550x3(SettingsActivity settingsActivity) {
        C32343x.m95495w0(this, "settings", "sms_and_push_notifications", "click");
        startActivity(new Intent(settingsActivity, SmsNotifManagerActivity.class));
    }

    /* renamed from: y3 */
    private final void m101551y3(C36695c cVar) {
        cVar.f88551j.setOnClickListener(new C38628i(this));
        cVar.f88553l.setOnClickListener(new C38629j(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public static final void m101552z3(SettingsActivity settingsActivity, View view) {
        C41536l.m120489i(settingsActivity, "this$0");
        settingsActivity.m101532f3().mo84083pw().mo72352kv();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m101526Y2().mo3946b());
        super.mo70996D2(bundle, m101526Y2());
        m101536j3();
        m101541o3();
        m101524W2();
        m101523V2();
        m101534h3();
        m101537k3();
        m101533g3();
    }

    /* renamed from: Z2 */
    public final Client mo84105Z2() {
        Client client = this.f83583G;
        if (client != null) {
            return client;
        }
        C41536l.m120506z("client");
        return null;
    }

    /* renamed from: h */
    public void mo84106h(C32041b bVar) {
        C41536l.m120489i(bVar, "settingsItem");
        m101532f3().mo84083pw().mo72353z2(bVar);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C31912f.f78672a);
        C41536l.m120488h(string, "getString(R.string.header_text_parameters)");
        return string;
    }
}
