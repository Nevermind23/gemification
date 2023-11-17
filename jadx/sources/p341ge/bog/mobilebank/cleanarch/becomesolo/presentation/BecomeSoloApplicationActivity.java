package p341ge.bog.mobilebank.cleanarch.becomesolo.presentation;

import a81.C30772sa;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import com.bumptech.glide.load.engine.GlideException;
import g91.C32314k;
import g91.C32343x;
import h10.C24850a;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.util.ArrayList;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import o00.C26656a;
import o00.C26657b;
import p00.C27113k;
import p035c4.C2255g;
import p050d4.C5825i;
import p163m0.C7047a;
import p166m3.C7079a;
import p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.model.BecomeSoloApplicationDataUiModel;
import p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel;
import p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.wizard.BecomeSoloApplicationWizardPlugin;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.model.offers.Summary;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.activities.OperationResultActivity;
import p341ge.bog.mobilebank.p975ui.model.OperationResultData;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.model.C35893a;
import p366bk.C10316e;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p642vh.C18368l;
import p837nq.C26564a;
import p837nq.C26565b;
import p837nq.C26566c;
import p837nq.C26567d;
import p837nq.C26568e;
import p837nq.C26569f;
import p837nq.C26570g;
import p837nq.C26571h;
import p837nq.C26572i;
import p847oq.C27056a;
import p847oq.C27057b;
import p847oq.C27058c;
import p90.C27379o;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloApplicationActivity */
public final class BecomeSoloApplicationActivity extends C30772sa implements C26656a, C26657b {

    /* renamed from: J */
    public static final C20819a f56085J = new C20819a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C27379o f56086F;

    /* renamed from: G */
    private final C41217g f56087G = new C1617p0(C41520a0.m120436b(BecomeSoloApplicationViewModel.class), new C20835p(this), new C20834o(this), new C20836q((C43064a) null, this));

    /* renamed from: H */
    private String f56088H;

    /* renamed from: I */
    private final C41217g f56089I = C41219i.m119470b(new C20831m(this));

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloApplicationActivity$a */
    public static final class C20819a {
        private C20819a() {
        }

        public /* synthetic */ C20819a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo49572a(C35388f2 f2Var, String str, String str2) {
            C41536l.m120489i(f2Var, "context");
            Intent intent = new Intent(f2Var, BecomeSoloApplicationActivity.class);
            intent.putExtra("BECOME_SOLO_ICON_URL", str);
            intent.putExtra("BECOME_SOLO_HEADER_TEXT", str2);
            f2Var.startActivityForResult(intent, 52052);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloApplicationActivity$b */
    /* synthetic */ class C20820b extends C41535k implements C43075l {
        C20820b(Object obj) {
            super(1, obj, BecomeSoloApplicationActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo49573b(boolean z) {
            ((BecomeSoloApplicationActivity) this.receiver).m67399n3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49573b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloApplicationActivity$c */
    /* synthetic */ class C20821c extends C41535k implements C43075l {
        C20821c(Object obj) {
            super(1, obj, BecomeSoloApplicationActivity.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo49574b(C21503d.C21504a aVar) {
            ((BecomeSoloApplicationActivity) this.receiver).mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49574b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloApplicationActivity$d */
    /* synthetic */ class C20822d extends C41535k implements C43075l {
        C20822d(Object obj) {
            super(1, obj, BecomeSoloApplicationActivity.class, "onInitialDataLoaded", "onInitialDataLoaded(Lge/bog/mobilebank/cleanarch/becomesolo/presentation/model/BecomeSoloApplicationDataUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo49575b(BecomeSoloApplicationDataUiModel becomeSoloApplicationDataUiModel) {
            C41536l.m120489i(becomeSoloApplicationDataUiModel, "p0");
            ((BecomeSoloApplicationActivity) this.receiver).m67397l3(becomeSoloApplicationDataUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49575b((BecomeSoloApplicationDataUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloApplicationActivity$e */
    /* synthetic */ class C20823e extends C41535k implements C43075l {
        C20823e(Object obj) {
            super(1, obj, BecomeSoloApplicationActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo49576b(boolean z) {
            ((BecomeSoloApplicationActivity) this.receiver).m67399n3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49576b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloApplicationActivity$f */
    /* synthetic */ class C20824f extends C41535k implements C43075l {
        C20824f(Object obj) {
            super(1, obj, BecomeSoloApplicationActivity.class, "onRetry", "onRetry(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo49577b(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((BecomeSoloApplicationActivity) this.receiver).m67401p3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49577b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloApplicationActivity$g */
    static final class C20825g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BecomeSoloApplicationActivity f56090d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20825g(BecomeSoloApplicationActivity becomeSoloApplicationActivity) {
            super(1);
            this.f56090d = becomeSoloApplicationActivity;
        }

        /* renamed from: a */
        public final void mo49578a(C37223a aVar) {
            C27058c cVar;
            BecomeSoloApplicationActivity becomeSoloApplicationActivity = this.f56090d;
            if (aVar != null && (cVar = (C27058c) aVar.mo90296a()) != null) {
                becomeSoloApplicationActivity.m67404s3(cVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49578a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloApplicationActivity$h */
    static final class C20826h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BecomeSoloApplicationActivity f56091d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20826h(BecomeSoloApplicationActivity becomeSoloApplicationActivity) {
            super(1);
            this.f56091d = becomeSoloApplicationActivity;
        }

        /* renamed from: a */
        public final void mo49579a(C37223a aVar) {
            BecomeSoloApplicationActivity becomeSoloApplicationActivity = this.f56091d;
            C27057b bVar = (C27057b) aVar.mo90296a();
            if (bVar != null) {
                becomeSoloApplicationActivity.m67398m3(bVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49579a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloApplicationActivity$i */
    /* synthetic */ class C20827i extends C41535k implements C43075l {
        C20827i(Object obj) {
            super(1, obj, BecomeSoloApplicationActivity.class, "onPreContractLoaded", "onPreContractLoaded(Lge/bog/mobilebank/cleanarch/presentation/common/model/ContractUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo49580b(C24850a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((BecomeSoloApplicationActivity) this.receiver).m67400o3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49580b((C24850a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloApplicationActivity$j */
    /* synthetic */ class C20828j extends C41535k implements C43075l {
        C20828j(Object obj) {
            super(1, obj, BecomeSoloApplicationActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo49581b(boolean z) {
            ((BecomeSoloApplicationActivity) this.receiver).m67399n3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49581b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloApplicationActivity$k */
    /* synthetic */ class C20829k extends C41535k implements C43075l {
        C20829k(Object obj) {
            super(1, obj, BecomeSoloApplicationActivity.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo49582b(C21503d.C21504a aVar) {
            ((BecomeSoloApplicationActivity) this.receiver).mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49582b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloApplicationActivity$l */
    static final class C20830l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BecomeSoloApplicationActivity f56092d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20830l(BecomeSoloApplicationActivity becomeSoloApplicationActivity) {
            super(1);
            this.f56092d = becomeSoloApplicationActivity;
        }

        /* renamed from: a */
        public final void mo49583a(Object obj) {
            C41536l.m120489i(obj, "it");
            this.f56092d.m67395k3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49583a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloApplicationActivity$m */
    static final class C20831m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BecomeSoloApplicationActivity f56093d;

        /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloApplicationActivity$m$a */
        public static final class C20832a implements C2255g {

            /* renamed from: d */
            final /* synthetic */ BecomeSoloApplicationActivity f56094d;

            C20832a(BecomeSoloApplicationActivity becomeSoloApplicationActivity) {
                this.f56094d = becomeSoloApplicationActivity;
            }

            /* renamed from: a */
            public boolean onResourceReady(Drawable drawable, Object obj, C5825i iVar, C7079a aVar, boolean z) {
                C27379o N2 = this.f56094d.f56086F;
                if (N2 == null) {
                    C41536l.m120506z("binding");
                    N2 = null;
                }
                N2.f69408k.setVisibility(0);
                return false;
            }

            public boolean onLoadFailed(GlideException glideException, Object obj, C5825i iVar, boolean z) {
                C27379o N2 = this.f56094d.f56086F;
                if (N2 == null) {
                    C41536l.m120506z("binding");
                    N2 = null;
                }
                N2.f69408k.setVisibility(8);
                return false;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20831m(BecomeSoloApplicationActivity becomeSoloApplicationActivity) {
            super(0);
            this.f56093d = becomeSoloApplicationActivity;
        }

        /* renamed from: b */
        public final C20832a invoke() {
            return new C20832a(this.f56093d);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloApplicationActivity$n */
    static final class C20833n implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f56095a;

        C20833n(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f56095a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f56095a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f56095a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloApplicationActivity$o */
    public static final class C20834o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f56096d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20834o(ComponentActivity componentActivity) {
            super(0);
            this.f56096d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f56096d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloApplicationActivity$p */
    public static final class C20835p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f56097d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20835p(ComponentActivity componentActivity) {
            super(0);
            this.f56097d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f56097d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloApplicationActivity$q */
    public static final class C20836q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f56098d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f56099e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20836q(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f56098d = aVar;
            this.f56099e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f56098d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f56099e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: V2 */
    private final void m67380V2() {
        C27379o oVar = this.f56086F;
        if (oVar == null) {
            C41536l.m120506z("binding");
            oVar = null;
        }
        oVar.f69419v.mo3946b().setOnClickListener(new C26564a(this));
        oVar.f69403f.setOnClickListener(new C26565b(this));
        oVar.f69406i.setOnClickListener(new C26566c(this));
        oVar.f69412o.setOnClickListener(new C26567d(this));
        oVar.f69409l.setOnClickListener(new C26568e(this));
        oVar.f69411n.setOnClickListener(new C26569f(this));
        oVar.f69410m.setOnClickListener(new C26570g(this));
        oVar.f69404g.setOnClickListener(new C26571h(this));
        oVar.f69413p.setOnClickListener(new C26572i(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public static final void m67381W2(BecomeSoloApplicationActivity becomeSoloApplicationActivity, View view) {
        C41536l.m120489i(becomeSoloApplicationActivity, "this$0");
        becomeSoloApplicationActivity.m67394j3().mo49614Bw();
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public static final void m67382X2(BecomeSoloApplicationActivity becomeSoloApplicationActivity, View view) {
        C41536l.m120489i(becomeSoloApplicationActivity, "this$0");
        becomeSoloApplicationActivity.m67394j3().mo49621uw(C27056a.CONTACT_NUMBER, C18368l.m62755d(becomeSoloApplicationActivity, C10316e.f28613r));
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public static final void m67383Y2(BecomeSoloApplicationActivity becomeSoloApplicationActivity, View view) {
        C41536l.m120489i(becomeSoloApplicationActivity, "this$0");
        becomeSoloApplicationActivity.m67394j3().mo49621uw(C27056a.EMAIL, C18368l.m62755d(becomeSoloApplicationActivity, C10316e.f28613r));
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public static final void m67384Z2(BecomeSoloApplicationActivity becomeSoloApplicationActivity, View view) {
        C41536l.m120489i(becomeSoloApplicationActivity, "this$0");
        becomeSoloApplicationActivity.m67394j3().mo49621uw(C27056a.WORK_PLACE, C18368l.m62755d(becomeSoloApplicationActivity, C10316e.f28613r));
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public static final void m67385a3(BecomeSoloApplicationActivity becomeSoloApplicationActivity, View view) {
        C41536l.m120489i(becomeSoloApplicationActivity, "this$0");
        becomeSoloApplicationActivity.m67394j3().mo49621uw(C27056a.MONTHLY_INCOME, C18368l.m62755d(becomeSoloApplicationActivity, C10316e.f28613r));
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public static final void m67386b3(BecomeSoloApplicationActivity becomeSoloApplicationActivity, View view) {
        C41536l.m120489i(becomeSoloApplicationActivity, "this$0");
        becomeSoloApplicationActivity.m67394j3().mo49621uw(C27056a.SOLO_LOUNGE, C18368l.m62755d(becomeSoloApplicationActivity, C10316e.f28613r));
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public static final void m67387c3(BecomeSoloApplicationActivity becomeSoloApplicationActivity, View view) {
        C41536l.m120489i(becomeSoloApplicationActivity, "this$0");
        becomeSoloApplicationActivity.m67394j3().mo49621uw(C27056a.PAYMENT_TYPE, C18368l.m62755d(becomeSoloApplicationActivity, C10316e.f28613r));
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public static final void m67388d3(BecomeSoloApplicationActivity becomeSoloApplicationActivity, View view) {
        C41536l.m120489i(becomeSoloApplicationActivity, "this$0");
        becomeSoloApplicationActivity.m67394j3().mo49621uw(C27056a.DEPOSIT_PROMPT, C18368l.m62755d(becomeSoloApplicationActivity, C10316e.f28613r));
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public static final void m67389e3(BecomeSoloApplicationActivity becomeSoloApplicationActivity, View view) {
        C41536l.m120489i(becomeSoloApplicationActivity, "this$0");
        becomeSoloApplicationActivity.m67394j3().mo49613Aw();
    }

    /* renamed from: f3 */
    private final String m67390f3(C27057b bVar) {
        if (bVar.mo66289e() == null) {
            return "";
        }
        if (C41536l.m120484d(bVar.mo66289e(), Boolean.FALSE)) {
            return C32343x.m95388F("offers.become.solo.appl.details.field.name.deposit.value2", new Object[0]);
        }
        if (bVar.mo66287c() == null) {
            return C32343x.m95388F("offers.become.solo.appl.details.field.name.deposit.value1", new Object[0]);
        }
        String F = C32343x.m95388F("offers.become.solo.appl.details.field.name.deposit.value1", new Object[0]);
        Long c = bVar.mo66287c();
        String a = C32314k.m95245a("GEL");
        return F + ", " + c + " " + a;
    }

    /* renamed from: g3 */
    private final String m67391g3(String str) {
        if (str == null) {
            return "";
        }
        String F = C32343x.m95388F(str, new Object[0]);
        String F2 = C32343x.m95388F(str + ".value", new Object[0]);
        return F + " (" + F2 + ")";
    }

    /* renamed from: h3 */
    private final C27113k m67392h3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C32343x.m95443e0(supportFragmentManager, (String) null, 1, (Object) null);
    }

    /* renamed from: i3 */
    private final C2255g m67393i3() {
        return (C2255g) this.f56089I.getValue();
    }

    /* renamed from: j3 */
    private final BecomeSoloApplicationViewModel m67394j3() {
        return (BecomeSoloApplicationViewModel) this.f56087G.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public final void m67395k3() {
        OperationResultData operationResultData = new OperationResultData();
        operationResultData.setSuccess(true);
        operationResultData.setSuccessTitle(C32343x.m95420V("offers.become.solo.appl.approved.successfully", C32343x.m95452h0(C10328q.become_solo_application_success, new Object[0]), new Object[0]));
        OperationResultActivity.m104475E2(this, operationResultData);
        setResult(-1);
        finish();
    }

    /* renamed from: l1 */
    private final void m67396l1() {
        BecomeSoloApplicationViewModel j3 = m67394j3();
        C21484c.m69411c(j3.mo49617X0(), this, new C20822d(this), new C20823e(this), new C20824f(this));
        j3.mo49620rw().mo4819k(this, new C20833n(new C20825g(this)));
        j3.mo49618f().mo4819k(this, new C20833n(new C20826h(this)));
        C21484c.m69411c(j3.mo49616Q1(), this, new C20827i(this), new C20828j(this), new C20829k(this));
        C21484c.m69411c(j3.mo49619qw(), this, new C20830l(this), new C20820b(this), new C20821c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public final void m67397l3(BecomeSoloApplicationDataUiModel becomeSoloApplicationDataUiModel) {
        C27379o oVar = this.f56086F;
        C27379o oVar2 = null;
        if (oVar == null) {
            C41536l.m120506z("binding");
            oVar = null;
        }
        oVar.f69403f.setValueText(becomeSoloApplicationDataUiModel.mo49594d());
        C27379o oVar3 = this.f56086F;
        if (oVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            oVar2 = oVar3;
        }
        oVar2.f69406i.setValueText(becomeSoloApplicationDataUiModel.mo49592a());
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public final void m67398m3(C27057b bVar) {
        String a;
        String F;
        C27379o oVar = this.f56086F;
        String str = null;
        if (oVar == null) {
            C41536l.m120506z("binding");
            oVar = null;
        }
        TextTypeView textTypeView = oVar.f69403f;
        String b = bVar.mo66286b();
        String str2 = "";
        if (b == null) {
            b = str2;
        }
        textTypeView.setValueTextIgnoringEmpty(b);
        TextTypeView textTypeView2 = oVar.f69406i;
        String d = bVar.mo66288d();
        if (d == null) {
            d = str2;
        }
        textTypeView2.setValueTextIgnoringEmpty(d);
        TextTypeView textTypeView3 = oVar.f69412o;
        String l = bVar.mo66296l();
        if (l == null) {
            l = str2;
        }
        textTypeView3.setValueTextIgnoringEmpty(l);
        oVar.f69411n.setValueTextIgnoringEmpty(bVar.mo66292h());
        oVar.f69404g.setValueText(m67390f3(bVar));
        TextTypeView textTypeView4 = oVar.f69410m;
        LookupUiModel g = bVar.mo66291g();
        if (g != null) {
            str = g.mo52391a();
        }
        textTypeView4.setValueTextIgnoringEmpty(m67391g3(str));
        TextTypeView textTypeView5 = oVar.f69409l;
        LookupUiModel f = bVar.mo66290f();
        if (!(f == null || (a = f.mo52391a()) == null || (F = C32343x.m95388F(a, new Object[0])) == null)) {
            str2 = F;
        }
        textTypeView5.setValueTextIgnoringEmpty(str2);
        oVar.f69413p.setOrange(bVar.mo66297m(), bVar.mo66297m());
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public final void m67399n3(boolean z) {
        C27379o oVar = this.f56086F;
        if (oVar == null) {
            C41536l.m120506z("binding");
            oVar = null;
        }
        FrameLayout frameLayout = oVar.f69420w;
        C41536l.m120488h(frameLayout, "binding.retryButtonContainer");
        C32343x.m95455i0(frameLayout);
        if (z) {
            mo86441o2();
        } else {
            mo86425J1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public final void m67400o3(C24850a aVar) {
        m67394j3().mo49623yw();
        C27113k.C27114a aVar2 = C27113k.f68083P;
        String a = aVar.mo63293a();
        String string = getString(C10328q.become_solo_details_title);
        C41536l.m120488h(string, "getString(R.string.become_solo_details_title)");
        C27113k c = C27113k.C27114a.m84066c(aVar2, a, false, (String) null, (ArrayList) null, (Summary) null, string, 30, (Object) null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        c.mo4576A1(supportFragmentManager, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public final void m67401p3(C21503d.C21504a aVar) {
        mo52674G1(aVar);
        C27379o oVar = this.f56086F;
        if (oVar == null) {
            C41536l.m120506z("binding");
            oVar = null;
        }
        FrameLayout frameLayout = oVar.f69420w;
        C41536l.m120488h(frameLayout, "binding.retryButtonContainer");
        C32343x.m95447f1(frameLayout);
    }

    /* renamed from: q3 */
    private final void m67402q3(Intent intent) {
        String stringExtra = intent.getStringExtra("BECOME_SOLO_ICON_URL");
        if (stringExtra != null) {
            C2394j N0 = C2379b.m9213w(this).mo7757y(stringExtra).mo7719N0(m67393i3());
            C27379o oVar = this.f56086F;
            if (oVar == null) {
                C41536l.m120506z("binding");
                oVar = null;
            }
            N0.mo7718L0(oVar.f69408k);
        }
    }

    /* renamed from: r3 */
    private final void m67403r3(C27379o oVar) {
        oVar.f69407j.setText(mo38120z1());
        oVar.f69403f.setTitleText(C32343x.m95420V("offers.become.solo.appl.details.field.name.contact.number", C32343x.m95452h0(C10328q.become_solo_contact_number, new Object[0]), new Object[0]));
        oVar.f69406i.setTitleText(C32343x.m95420V("offers.become.solo.appl.details.field.name.contact.email", C32343x.m95452h0(C10328q.become_solo_email, new Object[0]), new Object[0]));
        oVar.f69412o.setTitleText(C32343x.m95420V("offers.become.solo.appl.details.field.name.employer", C32343x.m95452h0(C10328q.become_solo_workplace, new Object[0]), new Object[0]));
        oVar.f69409l.setTitleText(C32343x.m95420V("offers.become.solo.appl.details.field.name.monthly.income", C32343x.m95452h0(C10328q.become_solo_monthly_income, new Object[0]), new Object[0]));
        oVar.f69411n.setTitleText(C32343x.m95420V("offers.become.solo.appl.details.field.name.solo.lounge", C32343x.m95452h0(C10328q.become_solo_solo_lounge, new Object[0]), new Object[0]));
        oVar.f69410m.setTitleText(C32343x.m95420V("offers.become.solo.appl.details.field.name.solo.payment.type", C32343x.m95452h0(C10328q.become_solo_payment_type, new Object[0]), new Object[0]));
        oVar.f69404g.setTitleText(C32343x.m95420V("offers.become.solo.appl.details.field.name.deposit", C32343x.m95452h0(C10328q.become_solo_deposit, new Object[0]), new Object[0]));
        oVar.f69413p.setText(C32343x.m95420V("offers.become.solo.appl.details.button.continue", C32343x.m95452h0(C10328q.button_text_continue, new Object[0]), new Object[0]));
        oVar.f69413p.setOrange(false, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public final void m67404s3(C27058c cVar) {
        C35893a.C35894a h = C35893a.m106783a(this).mo88140g(new ArrayList(cVar.mo66312c())).mo88137d(AdvancedWizardActivity.class).mo88139f(new BecomeSoloApplicationWizardPlugin(cVar.mo66310a())).mo88141h(cVar.mo66311b());
        C27379o oVar = this.f56086F;
        if (oVar == null) {
            C41536l.m120506z("binding");
            oVar = null;
        }
        h.mo88136c(oVar.mo3946b()).mo88142i();
    }

    /* renamed from: C */
    public void mo39136C() {
        m67394j3().mo49622xw();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_become_solo_application;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        C27379o a = C27379o.m84821a(findViewById(C10322k.become_solo_application_content));
        C41536l.m120488h(a, "bind(findViewById(R.id.b…olo_application_content))");
        this.f56086F = a;
        if (a == null) {
            C41536l.m120506z("binding");
            a = null;
        }
        m67403r3(a);
        Intent intent = getIntent();
        if (intent != null) {
            m67402q3(intent);
            this.f56088H = intent.getStringExtra("BECOME_SOLO_HEADER_TEXT");
        }
        m67396l1();
        m67380V2();
        m67394j3().mo49614Bw();
    }

    /* renamed from: m */
    public void mo39137m() {
        C27113k h3 = m67392h3();
        if (h3 != null) {
            h3.mo4577k1();
        }
        m67394j3().mo49615Cw();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m67394j3().mo49624zw(i, i2, intent);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String V;
        String h0 = C32343x.m95452h0(C10328q.become_a_solo_header_text, new Object[0]);
        String str = this.f56088H;
        if (str == null || (V = C32343x.m95420V(str, h0, new Object[0])) == null) {
            return h0;
        }
        return V;
    }
}
