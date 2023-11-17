package p341ge.bog.mobilebank.cleanarch.presentation.savinggoal.p765ui;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import g91.C32297d;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.parceler.C42035e;
import p163m0.C7047a;
import p189o0.C7357a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.savinggoal.model.SavingGoalDepositModel;
import p341ge.bog.mobilebank.cleanarch.presentation.savinggoal.viewmodel.SavingGoalViewModel;
import p341ge.bog.mobilebank.model.deposits.SavingGoal;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.BaseWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.model.C35893a;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import t50.C28306a;
import t50.C28307b;
import t50.C28308c;
import t50.C28309d;
import t50.C28310e;
import t50.C28311f;
import t50.C28312g;
import t50.C28313h;
import t50.C28314i;
import t50.C28315j;
import t50.C28316k;
import t50.C28317l;
import t50.C28318m;
import t50.C28319n;
import t50.C28320o;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity */
public final class SavingGoalEditActivity extends C30772sa {

    /* renamed from: O */
    public static final C22367a f59256O = new C22367a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f59257F = C41219i.m119470b(new C22373g(this));

    /* renamed from: G */
    private final C41217g f59258G = C41219i.m119470b(new C22371e(this));

    /* renamed from: H */
    private final C41217g f59259H = C41219i.m119470b(new C22372f(this));

    /* renamed from: I */
    private final C41217g f59260I = C41219i.m119470b(new C22368b(this));

    /* renamed from: J */
    private final C41217g f59261J = C41219i.m119470b(new C22387u(this));

    /* renamed from: K */
    private final C41217g f59262K = C41219i.m119470b(new C22369c(this));

    /* renamed from: L */
    private final C41217g f59263L = C41219i.m119470b(new C22386t(this));

    /* renamed from: M */
    private final C41217g f59264M = C41219i.m119470b(new C22370d(this));

    /* renamed from: N */
    private final C41217g f59265N = new C1617p0(C41520a0.m120436b(SavingGoalViewModel.class), new C22389w(this), new C22388v(this), new C22390x((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity$a */
    public static final class C22367a {
        private C22367a() {
        }

        public /* synthetic */ C22367a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo55320a(SavingGoalDepositModel savingGoalDepositModel, Context context) {
            C41536l.m120489i(savingGoalDepositModel, "savingGoalDeposit");
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, SavingGoalEditActivity.class);
            intent.putExtra("SAVING_GOAL_DEPOSIT", C42035e.m122121c(savingGoalDepositModel));
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity$b */
    static final class C22368b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SavingGoalEditActivity f59266d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22368b(SavingGoalEditActivity savingGoalEditActivity) {
            super(0);
            this.f59266d = savingGoalEditActivity;
        }

        /* renamed from: b */
        public final TextTypeView invoke() {
            return (TextTypeView) this.f59266d.findViewById(C10322k.amountToAdd);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity$c */
    static final class C22369c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SavingGoalEditActivity f59267d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22369c(SavingGoalEditActivity savingGoalEditActivity) {
            super(0);
            this.f59267d = savingGoalEditActivity;
        }

        /* renamed from: b */
        public final View invoke() {
            return this.f59267d.findViewById(C10322k.deleteBtn);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity$d */
    static final class C22370d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SavingGoalEditActivity f59268d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22370d(SavingGoalEditActivity savingGoalEditActivity) {
            super(0);
            this.f59268d = savingGoalEditActivity;
        }

        /* renamed from: b */
        public final View invoke() {
            return this.f59268d.findViewById(C10322k.retryBtnContainer);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity$e */
    static final class C22371e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SavingGoalEditActivity f59269d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22371e(SavingGoalEditActivity savingGoalEditActivity) {
            super(0);
            this.f59269d = savingGoalEditActivity;
        }

        /* renamed from: b */
        public final TextTypeView invoke() {
            return (TextTypeView) this.f59269d.findViewById(C10322k.goalAmount);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity$f */
    static final class C22372f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SavingGoalEditActivity f59270d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22372f(SavingGoalEditActivity savingGoalEditActivity) {
            super(0);
            this.f59270d = savingGoalEditActivity;
        }

        /* renamed from: b */
        public final TextTypeView invoke() {
            return (TextTypeView) this.f59270d.findViewById(C10322k.goalEndDate);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity$g */
    static final class C22373g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SavingGoalEditActivity f59271d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22373g(SavingGoalEditActivity savingGoalEditActivity) {
            super(0);
            this.f59271d = savingGoalEditActivity;
        }

        /* renamed from: b */
        public final TextTypeView invoke() {
            return (TextTypeView) this.f59271d.findViewById(C10322k.goalName);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity$h */
    static final class C22374h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SavingGoalEditActivity f59272d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22374h(SavingGoalEditActivity savingGoalEditActivity) {
            super(1);
            this.f59272d = savingGoalEditActivity;
        }

        /* renamed from: a */
        public final void mo55327a(boolean z) {
            this.f59272d.m72535d3().mo55365uw();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55327a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity$i */
    static final class C22375i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SavingGoalEditActivity f59273d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22375i(SavingGoalEditActivity savingGoalEditActivity) {
            super(1);
            this.f59273d = savingGoalEditActivity;
        }

        /* renamed from: a */
        public final void mo55328a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f59273d.m72535d3().mo55365uw();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55328a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity$j */
    static final class C22376j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SavingGoalEditActivity f59274d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22376j(SavingGoalEditActivity savingGoalEditActivity) {
            super(1);
            this.f59274d = savingGoalEditActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m72567c(SavingGoalEditActivity savingGoalEditActivity) {
            C41536l.m120489i(savingGoalEditActivity, "this$0");
            savingGoalEditActivity.finish();
        }

        /* renamed from: b */
        public final void mo55329b(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            SavingGoalEditActivity savingGoalEditActivity = this.f59274d;
            C32297d.m95161i(savingGoalEditActivity, savingGoalEditActivity.getString(C10328q.f28956f2), C32297d.f79706b, new C22391a(this.f59274d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55329b((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity$k */
    static final class C22377k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SavingGoalEditActivity f59275d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22377k(SavingGoalEditActivity savingGoalEditActivity) {
            super(1);
            this.f59275d = savingGoalEditActivity;
        }

        /* renamed from: a */
        public final void mo55330a(boolean z) {
            this.f59275d.m72533b3().setVisibility(0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55330a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity$l */
    static final class C22378l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SavingGoalEditActivity f59276d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22378l(SavingGoalEditActivity savingGoalEditActivity) {
            super(1);
            this.f59276d = savingGoalEditActivity;
        }

        /* renamed from: a */
        public final void mo55331a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f59276d.mo52674G1(aVar);
            this.f59276d.m72533b3().setVisibility(8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55331a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity$m */
    static final class C22379m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SavingGoalEditActivity f59277d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22379m(SavingGoalEditActivity savingGoalEditActivity) {
            super(1);
            this.f59277d = savingGoalEditActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m72572c(SavingGoalEditActivity savingGoalEditActivity) {
            C41536l.m120489i(savingGoalEditActivity, "this$0");
            savingGoalEditActivity.finish();
        }

        /* renamed from: b */
        public final void mo55332b(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C7357a.m28044b(this.f59277d).mo21731d(new Intent("ge.bog.mobilebank.products.presentation.products.refresh_products"));
            SavingGoalEditActivity savingGoalEditActivity = this.f59277d;
            C32297d.m95161i(savingGoalEditActivity, savingGoalEditActivity.getString(C10328q.f28956f2), C32297d.f79706b, new C22392b(this.f59277d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55332b((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity$n */
    static final class C22380n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SavingGoalEditActivity f59278d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22380n(SavingGoalEditActivity savingGoalEditActivity) {
            super(1);
            this.f59278d = savingGoalEditActivity;
        }

        /* renamed from: a */
        public final void mo55333a(boolean z) {
            this.f59278d.m72533b3().setVisibility(0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55333a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity$o */
    static final class C22381o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SavingGoalEditActivity f59279d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22381o(SavingGoalEditActivity savingGoalEditActivity) {
            super(1);
            this.f59279d = savingGoalEditActivity;
        }

        /* renamed from: a */
        public final void mo55334a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f59279d.mo52674G1(aVar);
            this.f59279d.m72533b3().setVisibility(8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55334a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity$p */
    static final class C22382p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SavingGoalEditActivity f59280d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22382p(SavingGoalEditActivity savingGoalEditActivity) {
            super(1);
            this.f59280d = savingGoalEditActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m72577c(SavingGoalEditActivity savingGoalEditActivity) {
            C41536l.m120489i(savingGoalEditActivity, "this$0");
            savingGoalEditActivity.finish();
        }

        /* renamed from: b */
        public final void mo55335b(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C7357a.m28044b(this.f59280d).mo21731d(new Intent("ge.bog.mobilebank.products.presentation.products.refresh_products"));
            SavingGoalEditActivity savingGoalEditActivity = this.f59280d;
            C32297d.m95161i(savingGoalEditActivity, savingGoalEditActivity.getString(C10328q.f28956f2), C32297d.f79706b, new C22393c(this.f59280d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55335b((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity$q */
    static final class C22383q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SavingGoalEditActivity f59281d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22383q(SavingGoalEditActivity savingGoalEditActivity) {
            super(1);
            this.f59281d = savingGoalEditActivity;
        }

        /* renamed from: a */
        public final void mo55336a(boolean z) {
            this.f59281d.m72533b3().setVisibility(0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55336a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity$r */
    static final class C22384r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SavingGoalEditActivity f59282d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22384r(SavingGoalEditActivity savingGoalEditActivity) {
            super(1);
            this.f59282d = savingGoalEditActivity;
        }

        /* renamed from: a */
        public final void mo55337a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f59282d.mo52674G1(aVar);
            this.f59282d.m72533b3().setVisibility(8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55337a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity$s */
    static final class C22385s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SavingGoalEditActivity f59283d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22385s(SavingGoalEditActivity savingGoalEditActivity) {
            super(1);
            this.f59283d = savingGoalEditActivity;
        }

        /* renamed from: a */
        public final void mo55338a(List list) {
            C41536l.m120489i(list, "it");
            this.f59283d.m72535d3().mo55365uw();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55338a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity$t */
    static final class C22386t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SavingGoalEditActivity f59284d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22386t(SavingGoalEditActivity savingGoalEditActivity) {
            super(0);
            this.f59284d = savingGoalEditActivity;
        }

        /* renamed from: b */
        public final View invoke() {
            return this.f59284d.findViewById(C10322k.f28784Qe);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity$u */
    static final class C22387u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SavingGoalEditActivity f59285d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22387u(SavingGoalEditActivity savingGoalEditActivity) {
            super(0);
            this.f59285d = savingGoalEditActivity;
        }

        /* renamed from: b */
        public final BogButton invoke() {
            return (BogButton) this.f59285d.findViewById(C10322k.saveButton);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity$v */
    public static final class C22388v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59286d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22388v(ComponentActivity componentActivity) {
            super(0);
            this.f59286d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f59286d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity$w */
    public static final class C22389w extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59287d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22389w(ComponentActivity componentActivity) {
            super(0);
            this.f59287d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f59287d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.ui.SavingGoalEditActivity$x */
    public static final class C22390x extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f59288d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f59289e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22390x(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f59288d = aVar;
            this.f59289e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f59288d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f59289e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: V2 */
    private final TextTypeView m72527V2() {
        Object value = this.f59260I.getValue();
        C41536l.m120488h(value, "<get-amountToAdd>(...)");
        return (TextTypeView) value;
    }

    /* renamed from: W2 */
    private final View m72528W2() {
        Object value = this.f59262K.getValue();
        C41536l.m120488h(value, "<get-deleteBtn>(...)");
        return (View) value;
    }

    /* renamed from: X2 */
    private final View m72529X2() {
        Object value = this.f59264M.getValue();
        C41536l.m120488h(value, "<get-errorView>(...)");
        return (View) value;
    }

    /* renamed from: Y2 */
    private final TextTypeView m72530Y2() {
        Object value = this.f59258G.getValue();
        C41536l.m120488h(value, "<get-goalAmount>(...)");
        return (TextTypeView) value;
    }

    /* renamed from: Z2 */
    private final TextTypeView m72531Z2() {
        Object value = this.f59259H.getValue();
        C41536l.m120488h(value, "<get-goalEndDate>(...)");
        return (TextTypeView) value;
    }

    /* renamed from: a3 */
    private final TextTypeView m72532a3() {
        Object value = this.f59257F.getValue();
        C41536l.m120488h(value, "<get-goalPurpose>(...)");
        return (TextTypeView) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public final View m72533b3() {
        Object value = this.f59263L.getValue();
        C41536l.m120488h(value, "<get-progressView>(...)");
        return (View) value;
    }

    /* renamed from: c3 */
    private final BogButton m72534c3() {
        Object value = this.f59261J.getValue();
        C41536l.m120488h(value, "<get-saveButton>(...)");
        return (BogButton) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public final SavingGoalViewModel m72535d3() {
        return (SavingGoalViewModel) this.f59265N.getValue();
    }

    /* renamed from: e3 */
    private final void m72536e3() {
        m72535d3().mo55354Zw().mo4819k(this, new C28318m(this));
        m72535d3().mo55350Vw().mo4819k(this, new C28319n(this));
        m72535d3().mo55348Tw().mo4819k(this, new C28320o(this));
        m72535d3().mo55349Uw().mo4819k(this, new C28307b(this));
        m72535d3().mo55351Ww().mo4819k(this, new C28308c(this));
        m72535d3().mo55346Rw().mo4819k(this, new C28309d(this));
        m72535d3().mo55358e().mo4819k(this, new C28310e(this));
        m72535d3().mo55366x0().mo4819k(this, new C28311f(this));
        C21484c.m69411c(m72535d3().mo55347Sw(), this, new C22385s(this), new C22374h(this), new C22375i(this));
        C21484c.m69411c(m72535d3().mo55344Pw(), this, new C22376j(this), new C22377k(this), new C22378l(this));
        C21484c.m69411c(m72535d3().mo55342Kw(), this, new C22379m(this), new C22380n(this), new C22381o(this));
        C21484c.m69411c(m72535d3().mo55345Qw(), this, new C22382p(this), new C22383q(this), new C22384r(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public static final void m72537f3(SavingGoalEditActivity savingGoalEditActivity, String str) {
        C41536l.m120489i(savingGoalEditActivity, "this$0");
        savingGoalEditActivity.m72531Z2().setValueTextIgnoringEmpty(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public static final void m72538g3(SavingGoalEditActivity savingGoalEditActivity, String str) {
        C41536l.m120489i(savingGoalEditActivity, "this$0");
        savingGoalEditActivity.m72527V2().setValueTextIgnoringEmpty(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public static final void m72539h3(SavingGoalEditActivity savingGoalEditActivity, Boolean bool) {
        C41536l.m120489i(savingGoalEditActivity, "this$0");
        BogButton c3 = savingGoalEditActivity.m72534c3();
        C41536l.m120488h(bool, "enabled");
        c3.setOrange(bool.booleanValue(), bool.booleanValue(), true);
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public static final void m72540i3(SavingGoalEditActivity savingGoalEditActivity, Boolean bool) {
        int i;
        C41536l.m120489i(savingGoalEditActivity, "this$0");
        View b3 = savingGoalEditActivity.m72533b3();
        C41536l.m120488h(bool, "it");
        if (bool.booleanValue()) {
            i = 0;
        } else {
            i = 8;
        }
        b3.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public static final void m72541j3(SavingGoalEditActivity savingGoalEditActivity, C41224m mVar) {
        int i;
        C41536l.m120489i(savingGoalEditActivity, "this$0");
        View X2 = savingGoalEditActivity.m72529X2();
        if (((Boolean) mVar.mo95678e()).booleanValue()) {
            i = 0;
        } else {
            i = 8;
        }
        X2.setVisibility(i);
        if (((String) mVar.mo95680f()) != null) {
            C32297d.m95154b(savingGoalEditActivity, (String) mVar.mo95680f());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m72542k3(SavingGoalEditActivity savingGoalEditActivity, SavingGoalDepositModel savingGoalDepositModel) {
        SavingGoal savingGoal;
        int i;
        C41536l.m120489i(savingGoalEditActivity, "this$0");
        View W2 = savingGoalEditActivity.m72528W2();
        if (savingGoalDepositModel != null) {
            savingGoal = savingGoalDepositModel.mo55311i();
        } else {
            savingGoal = null;
        }
        if (savingGoal != null) {
            i = 0;
        } else {
            i = 8;
        }
        W2.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static final void m72543l3(SavingGoalEditActivity savingGoalEditActivity, String str) {
        C41536l.m120489i(savingGoalEditActivity, "this$0");
        savingGoalEditActivity.m72532a3().setValueTextIgnoringEmpty(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public static final void m72544m3(SavingGoalEditActivity savingGoalEditActivity, String str) {
        C41536l.m120489i(savingGoalEditActivity, "this$0");
        savingGoalEditActivity.m72530Y2().setValueTextIgnoringEmpty(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public static final void m72545n3(SavingGoalEditActivity savingGoalEditActivity, View view) {
        C41536l.m120489i(savingGoalEditActivity, "this$0");
        savingGoalEditActivity.m72553v3(0, savingGoalEditActivity.m72532a3());
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public static final void m72546o3(SavingGoalEditActivity savingGoalEditActivity, View view) {
        C41536l.m120489i(savingGoalEditActivity, "this$0");
        savingGoalEditActivity.m72553v3(1, savingGoalEditActivity.m72530Y2());
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public static final void m72547p3(SavingGoalEditActivity savingGoalEditActivity, View view) {
        C41536l.m120489i(savingGoalEditActivity, "this$0");
        savingGoalEditActivity.m72553v3(2, savingGoalEditActivity.m72531Z2());
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public static final void m72548q3(SavingGoalEditActivity savingGoalEditActivity, View view) {
        C41536l.m120489i(savingGoalEditActivity, "this$0");
        C35388f2.m105072l2(savingGoalEditActivity, savingGoalEditActivity.getString(C10328q.saving_goal_delete_title), savingGoalEditActivity.getString(C10328q.saving_goal_delete_text), savingGoalEditActivity.getString(C10328q.f28966r2), savingGoalEditActivity.getString(C10328q.f28928H0), new C28316k(savingGoalEditActivity), new C28317l(), true, false, (String) null, (View.OnClickListener) null, 896, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public static final void m72549r3(SavingGoalEditActivity savingGoalEditActivity, View view) {
        C41536l.m120489i(savingGoalEditActivity, "this$0");
        savingGoalEditActivity.m72535d3().mo55341Bw();
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public static final void m72550s3(View view) {
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public static final void m72551t3(SavingGoalEditActivity savingGoalEditActivity, View view) {
        C41536l.m120489i(savingGoalEditActivity, "this$0");
        savingGoalEditActivity.m72535d3().mo55343Lw();
    }

    /* renamed from: u3 */
    public static final void m72552u3(SavingGoalDepositModel savingGoalDepositModel, Context context) {
        f59256O.mo55320a(savingGoalDepositModel, context);
    }

    /* renamed from: v3 */
    private final void m72553v3(int i, View view) {
        C35893a.m106783a(this).mo88140g(m72535d3().mo55355ax()).mo88137d(AdvancedWizardActivity.class).mo88139f(new BaseWizardPlugin()).mo88141h(i).mo88136c(view).mo88142i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_saving_goal_edit;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        Object a = C42035e.m122119a(getIntent().getParcelableExtra("SAVING_GOAL_DEPOSIT"));
        C41536l.m120488h(a, "unwrap(intent.getParcela…tra(SAVING_GOAL_DEPOSIT))");
        SavingGoalViewModel d3 = m72535d3();
        String string = getString(C10328q.saving_goal_wizard_title);
        C41536l.m120488h(string, "getString(R.string.saving_goal_wizard_title)");
        d3.mo55362hx(string);
        SavingGoalViewModel d32 = m72535d3();
        String string2 = getString(C10328q.saving_goal_wizard_saving_goal);
        C41536l.m120488h(string2, "getString(R.string.saving_goal_wizard_saving_goal)");
        d32.mo55360fx(string2);
        SavingGoalViewModel d33 = m72535d3();
        String string3 = getString(C10328q.saving_goal_wizard_end_date);
        C41536l.m120488h(string3, "getString(R.string.saving_goal_wizard_end_date)");
        d33.mo55361gx(string3);
        m72535d3().mo55363jx((SavingGoalDepositModel) a);
        m72532a3().setOnClickListener(new C28306a(this));
        m72530Y2().setOnClickListener(new C28312g(this));
        if (m72535d3().mo55356bx(2)) {
            m72531Z2().setOnClickListener(new C28313h(this));
        } else {
            m72531Z2().setAlpha(0.5f);
            m72531Z2().setEditable(false);
        }
        m72528W2().setOnClickListener(new C28314i(this));
        findViewById(C10322k.f28774Ns).setOnClickListener(new C28315j(this));
        m72536e3();
        m72535d3().mo55343Lw();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 10001) {
            m72535d3().mo55357cx(intent);
        }
    }

    public final void onSaveClick(View view) {
        C41536l.m120489i(view, "v");
        if (m72534c3().isOrange()) {
            m72535d3().mo55359ex();
        }
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String str;
        if (m72535d3().mo55352Xw() != null) {
            Integer Xw = m72535d3().mo55352Xw();
            C41536l.m120486f(Xw);
            str = getString(Xw.intValue());
        } else {
            str = "";
        }
        C41536l.m120488h(str, "if (viewModel.pageNameId…} else {\n        \"\"\n    }");
        return str;
    }
}
