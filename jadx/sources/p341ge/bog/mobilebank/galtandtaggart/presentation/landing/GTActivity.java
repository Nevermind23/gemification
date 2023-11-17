package p341ge.bog.mobilebank.galtandtaggart.presentation.landing;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0173b;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import b41.C31128a;
import b41.C31132b;
import com.google.android.material.tabs.C5161d;
import com.google.android.material.tabs.TabLayout;
import g31.C32054a;
import g41.C32081a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import hg0.C24991g;
import ie0.C25185e;
import ie0.C25187g;
import ie0.C25189i;
import ie0.C25190j;
import iu0.C36546y;
import java.math.BigDecimal;
import jg0.C25454q;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37613p;
import of0.C26948a;
import of0.C26950b;
import of0.C26952c;
import of0.C26954d;
import of0.C26956e;
import of0.C26958f;
import of0.C26960g;
import of0.C26986t;
import of0.C26987u;
import p017b.C2106d;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.tabs.TabsView;
import p341ge.bog.mobilebank.galtandtaggart.presentation.landing.C23494d;
import p341ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction.GTIntroductionActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.C23583b;
import p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.intro.GTOnboardingIntroActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.kyc.KycRequiredActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.search.GTSymbolSearchActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.C23939a;
import p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list.C24019b;
import p380ck.C10463g;
import p420fh.C12902d;
import p420fh.C12910e;
import p748eu.C20292b;
import p758fu.C20557a;
import ue0.C28746q;
import ue1.C43064a;
import ue1.C43075l;
import ug0.C28790e;
import xe0.C29749g;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity */
public final class GTActivity extends C23496e {

    /* renamed from: M */
    public static final C23443a f61292M = new C23443a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C20292b f61293G;

    /* renamed from: H */
    private final C41217g f61294H = new C1617p0(C41520a0.m120436b(GTLandingViewModel$ViewModel.class), new C23448c0(this), new C23446b0(this), new C23451d0((C43064a) null, this));

    /* renamed from: I */
    private final C41217g f61295I = C41219i.m119470b(new C23447c(this));
    /* access modifiers changed from: private */

    /* renamed from: J */
    public ViewPager2 f61296J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public final C0173b f61297K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public final C0173b f61298L;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$a */
    public static final class C23443a {
        private C23443a() {
        }

        public /* synthetic */ C23443a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo60257a(Context context) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, GTActivity.class);
            intent.addFlags(603979776);
            intent.putExtra("KEY_PUSH_TYPE", new GTLandingViewModel$GTLandingData((String) null, (String) null, false, true, 7, (DefaultConstructorMarker) null));
            context.startActivity(intent);
        }

        /* renamed from: b */
        public final void mo60258b(Context context, String str, String str2, boolean z) {
            C41536l.m120489i(context, "context");
            context.startActivity(C37613p.m110614a(new Intent(context, GTActivity.class), C41233s.m119492a("KEY_PUSH_TYPE", new GTLandingViewModel$GTLandingData(str, str2, z, false, 8, (DefaultConstructorMarker) null))));
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$a0 */
    /* synthetic */ class C23444a0 extends C41535k implements C43064a {
        C23444a0(Object obj) {
            super(0, obj, C26986t.class, "onKycPopupDismissed", "onKycPopupDismissed()V", 0);
        }

        /* renamed from: b */
        public final void mo60259b() {
            ((C26986t) this.receiver).mo60309Ef();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo60259b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$b */
    private static final class C23445b extends FragmentStateAdapter {

        /* renamed from: l */
        private final int f61299l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23445b(int i, C1505h hVar) {
            super(hVar);
            C41536l.m120489i(hVar, "activity");
            this.f61299l = i;
        }

        public int getItemCount() {
            return this.f61299l;
        }

        /* renamed from: h */
        public Fragment mo6571h(int i) {
            if (this.f61299l != 3) {
                return C24019b.f62335j.mo61027a();
            }
            if (i == 0) {
                return C24991g.f64316j.mo63402a();
            }
            if (i != 1) {
                return C23939a.f62182j.mo60913a();
            }
            return C24019b.f62335j.mo61027a();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$b0 */
    public static final class C23446b0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61300d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23446b0(ComponentActivity componentActivity) {
            super(0);
            this.f61300d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f61300d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$c */
    static final class C23447c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTActivity f61301d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23447c(GTActivity gTActivity) {
            super(0);
            this.f61301d = gTActivity;
        }

        /* renamed from: b */
        public final C28746q invoke() {
            C28746q d = C28746q.m88110d(this.f61301d.getLayoutInflater());
            C41536l.m120488h(d, "inflate(layoutInflater)");
            return d;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$c0 */
    public static final class C23448c0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61302d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23448c0(ComponentActivity componentActivity) {
            super(0);
            this.f61302d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f61302d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$d */
    static final class C23449d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTActivity f61303d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$d$a */
        public /* synthetic */ class C23450a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f61304a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    xe0.g[] r0 = xe0.C29749g.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    xe0.g r1 = xe0.C29749g.KYC_APPROVED     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    xe0.g r1 = xe0.C29749g.KYC_DOC_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    xe0.g r1 = xe0.C29749g.f75208f     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f61304a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity.C23449d.C23450a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23449d(GTActivity gTActivity) {
            super(1);
            this.f61303d = gTActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m75922c(GTActivity gTActivity, View view) {
            C41536l.m120489i(gTActivity, "this$0");
            gTActivity.m75894b3().mo60322ww().mo60311Ft();
        }

        /* renamed from: b */
        public final void mo60261b(C29749g gVar) {
            C41536l.m120489i(gVar, "response");
            int i = C23450a.f61304a[gVar.ordinal()];
            if (i == 1) {
                InlineFeedback2 inlineFeedback2 = this.f61303d.m75893Z2().f73420l;
                C41536l.m120488h(inlineFeedback2, "binding.identomatFeedback");
                C32343x.m95455i0(inlineFeedback2);
            } else if (i == 2) {
                InlineFeedback2 inlineFeedback22 = this.f61303d.m75893Z2().f73420l;
                GTActivity gTActivity = this.f61303d;
                C41536l.m120488h(inlineFeedback22, "invoke$lambda$1");
                C32343x.m95447f1(inlineFeedback22);
                inlineFeedback22.setStatus(InlineFeedback2.C13350a.NEGATIVE);
                inlineFeedback22.setButtonVisible(true);
                inlineFeedback22.setCloseVisible(false);
                inlineFeedback22.setButtonText(C32343x.m95388F("gt.banner.kyc.doc.required.button", new Object[0]));
                inlineFeedback22.setTitle(C32343x.m95388F("gt.banner.kyc.doc.required.text", new Object[0]));
                inlineFeedback22.setOnButtonClicked(new C23491a(gTActivity));
            } else if (i == 3) {
                InlineFeedback2 inlineFeedback23 = this.f61303d.m75893Z2().f73420l;
                C41536l.m120488h(inlineFeedback23, "invoke$lambda$2");
                C32343x.m95447f1(inlineFeedback23);
                inlineFeedback23.setStatus(InlineFeedback2.C13350a.PENDING);
                inlineFeedback23.setButtonVisible(false);
                inlineFeedback23.setCloseVisible(false);
                inlineFeedback23.setTitle(C32343x.m95388F("gt.banner.kyc.doc.pending.text", new Object[0]));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60261b((C29749g) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$d0 */
    public static final class C23451d0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f61305d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f61306e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23451d0(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f61305d = aVar;
            this.f61306e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f61305d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f61306e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$e */
    static final class C23452e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTActivity f61307d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23452e(GTActivity gTActivity) {
            super(1);
            this.f61307d = gTActivity;
        }

        /* renamed from: a */
        public final void mo60262a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            KycRequiredActivity.C23611a aVar = KycRequiredActivity.f61595H;
            GTActivity gTActivity = this.f61307d;
            aVar.mo60487a(gTActivity, gTActivity.f61298L);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60262a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$f */
    static final class C23453f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTActivity f61308d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23453f(GTActivity gTActivity) {
            super(1);
            this.f61308d = gTActivity;
        }

        /* renamed from: a */
        public final void mo60263a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f61308d.m75909q3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60263a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$g */
    /* synthetic */ class C23454g extends C41535k implements C43075l {
        C23454g(Object obj) {
            super(1, obj, GTActivity.class, "showStockPage", "showStockPage(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo60264b(String str) {
            C41536l.m120489i(str, "p0");
            ((GTActivity) this.receiver).m75911s3(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60264b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$h */
    static final class C23455h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTActivity f61309d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23455h(GTActivity gTActivity) {
            super(1);
            this.f61309d = gTActivity;
        }

        /* renamed from: a */
        public final void mo60265a(C41224m mVar) {
            Button button = this.f61309d.m75893Z2().f73413e;
            C41536l.m120488h(button, "binding.buttonBuy");
            C32343x.m95483r1(button, ((Boolean) mVar.mo95678e()).booleanValue(), false, 2, (Object) null);
            Button button2 = this.f61309d.m75893Z2().f73415g;
            C41536l.m120488h(button2, "binding.buttonSell");
            C32343x.m95483r1(button2, ((Boolean) mVar.mo95680f()).booleanValue(), false, 2, (Object) null);
            this.f61309d.m75901i3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60265a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$i */
    static final class C23456i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTActivity f61310d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23456i(GTActivity gTActivity) {
            super(1);
            this.f61310d = gTActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            Button button = this.f61310d.m75893Z2().f73414f;
            C41536l.m120488h(button, "binding.buttonRegister");
            C41536l.m120488h(bool, "visible");
            C32343x.m95483r1(button, bool.booleanValue(), false, 2, (Object) null);
            this.f61310d.m75901i3();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$j */
    static final class C23457j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTActivity f61311d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23457j(GTActivity gTActivity) {
            super(1);
            this.f61311d = gTActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            LayerView layerView = this.f61311d.m75893Z2().f73424p;
            C41536l.m120488h(layerView, "binding.pendingStatusWrapper");
            C41536l.m120488h(bool, "visible");
            C32343x.m95483r1(layerView, bool.booleanValue(), false, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$k */
    static final class C23458k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTActivity f61312d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23458k(GTActivity gTActivity) {
            super(1);
            this.f61312d = gTActivity;
        }

        /* renamed from: a */
        public final void mo60268a(C31128a aVar) {
            GTActivity gTActivity = this.f61312d;
            C41536l.m120488h(aVar, "tabCount");
            gTActivity.m75900h3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60268a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$l */
    static final class C23459l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTActivity f61313d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23459l(GTActivity gTActivity) {
            super(1);
            this.f61313d = gTActivity;
        }

        /* renamed from: a */
        public final void mo60269a(Integer num) {
            ViewPager2 Q2 = this.f61313d.f61296J;
            if (Q2 == null) {
                C41536l.m120506z("viewPager");
                Q2 = null;
            }
            C41536l.m120488h(num, "it");
            Q2.setCurrentItem(num.intValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60269a((Integer) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$m */
    static final class C23460m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTActivity f61314d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23460m(GTActivity gTActivity) {
            super(1);
            this.f61314d = gTActivity;
        }

        /* renamed from: a */
        public final void mo60270a(C31128a aVar) {
            GTActivity gTActivity = this.f61314d;
            C41536l.m120488h(aVar, "result");
            gTActivity.m75899g3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60270a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$n */
    static final class C23461n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTActivity f61315d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23461n(GTActivity gTActivity) {
            super(1);
            this.f61315d = gTActivity;
        }

        /* renamed from: a */
        public final void mo60271a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            GTIntroductionActivity.C23498a aVar = GTIntroductionActivity.f61386J;
            GTActivity gTActivity = this.f61315d;
            aVar.mo60342a(gTActivity, gTActivity.f61297K);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60271a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$o */
    /* synthetic */ class C23462o extends C41535k implements C43075l {
        C23462o(Object obj) {
            super(1, obj, GTActivity.class, "checkIdentomatStatus", "checkIdentomatStatus(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo60272b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((GTActivity) this.receiver).m75892Y2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60272b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$p */
    static final class C23463p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTActivity f61316d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23463p(GTActivity gTActivity) {
            super(1);
            this.f61316d = gTActivity;
        }

        /* renamed from: a */
        public final void mo60273a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f61316d.m75910r3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60273a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$q */
    static final class C23464q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTActivity f61317d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23464q(GTActivity gTActivity) {
            super(1);
            this.f61317d = gTActivity;
        }

        /* renamed from: a */
        public final void mo60274a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f61317d.m75893Z2().f73414f.setLoading(false);
            GTOnboardingIntroActivity.f61577L.mo60478a(this.f61317d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60274a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$r */
    static final class C23465r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTActivity f61318d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23465r(GTActivity gTActivity) {
            super(1);
            this.f61318d = gTActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f61318d.m75893Z2().f73414f.setLoading(false);
            this.f61318d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$s */
    static final class C23466s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTActivity f61319d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23466s(GTActivity gTActivity) {
            super(1);
            this.f61319d = gTActivity;
        }

        /* renamed from: a */
        public final void mo60276a(C41238w wVar) {
            this.f61319d.m75893Z2().f73414f.setLoading(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60276a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$t */
    static final class C23467t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTActivity f61320d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23467t(GTActivity gTActivity) {
            super(1);
            this.f61320d = gTActivity;
        }

        /* renamed from: a */
        public final void mo60277a(Integer num) {
            this.f61320d.m75893Z2().f73425q.setEnabled(true);
            LayerView layerView = this.f61320d.m75893Z2().f73428t;
            C41536l.m120488h(layerView, "binding.tabsWrapper");
            C32343x.m95455i0(layerView);
            this.f61320d.m75893Z2().f73422n.mo53597e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60277a((Integer) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$u */
    static final class C23468u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTActivity f61321d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23468u(GTActivity gTActivity) {
            super(1);
            this.f61321d = gTActivity;
        }

        /* renamed from: a */
        public final void mo60278a(int i) {
            this.f61321d.m75893Z2().f73425q.setEnabled(false);
            this.f61321d.m75893Z2().f73425q.setRefreshing(false);
            LayerView layerView = this.f61321d.m75893Z2().f73428t;
            C41536l.m120488h(layerView, "binding.tabsWrapper");
            C32343x.m95447f1(layerView);
            this.f61321d.m75893Z2().f73422n.mo53595c();
            this.f61321d.m75907o3(i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60278a(((Number) obj).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$v */
    static final class C23469v extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTActivity f61322d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23469v(GTActivity gTActivity) {
            super(1);
            this.f61322d = gTActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f61322d.m75893Z2().f73425q.setEnabled(true);
            this.f61322d.m75893Z2().f73425q.setRefreshing(false);
            LayerView layerView = this.f61322d.m75893Z2().f73428t;
            C41536l.m120488h(layerView, "binding.tabsWrapper");
            C32343x.m95455i0(layerView);
            this.f61322d.m75893Z2().f73422n.mo53596d();
            this.f61322d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$w */
    static final class C23470w implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f61323a;

        C23470w(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f61323a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f61323a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f61323a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$x */
    static final class C23471x extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTActivity f61324d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23471x(GTActivity gTActivity) {
            super(1);
            this.f61324d = gTActivity;
        }

        /* renamed from: a */
        public final void mo60282a(boolean z) {
            if (z) {
                GTSymbolSearchActivity.C23733a.m76686b(GTSymbolSearchActivity.f61808O, this.f61324d, (C25454q) null, (BigDecimal) null, 6, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60282a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$y */
    public static final class C23472y extends ViewPager2.C1928i {

        /* renamed from: a */
        final /* synthetic */ GTActivity f61325a;

        /* renamed from: b */
        final /* synthetic */ int f61326b;

        C23472y(GTActivity gTActivity, int i) {
            this.f61325a = gTActivity;
            this.f61326b = i;
        }

        public void onPageSelected(int i) {
            boolean z;
            boolean z2;
            String str;
            Button button = this.f61325a.m75893Z2().f73413e;
            C41536l.m120488h(button, "binding.buttonBuy");
            C41224m mVar = (C41224m) this.f61325a.m75894b3().mo60326yw().mo60315Ws().mo4814f();
            if (mVar != null) {
                z = ((Boolean) mVar.mo95678e()).booleanValue();
            } else {
                z = false;
            }
            C32343x.m95483r1(button, z, false, 2, (Object) null);
            Button button2 = this.f61325a.m75893Z2().f73415g;
            C41536l.m120488h(button2, "binding.buttonSell");
            C41224m mVar2 = (C41224m) this.f61325a.m75894b3().mo60326yw().mo60315Ws().mo4814f();
            if (mVar2 != null) {
                z2 = ((Boolean) mVar2.mo95680f()).booleanValue();
            } else {
                z2 = false;
            }
            C32343x.m95483r1(button2, z2, false, 2, (Object) null);
            this.f61325a.m75901i3();
            if (this.f61326b == 1 || i == 1) {
                C32054a.C32078x xVar = C32054a.C32078x.f78919f;
                C10463g F = C36546y.m108282F();
                C41536l.m120488h(F, "getAnalytics()");
                int i2 = this.f61326b;
                if (i2 == 0 || i2 == 1) {
                    str = "non_active";
                } else {
                    str = "active";
                }
                C32081a.m94499a(xVar, F, " ", str);
            }
            super.onPageSelected(i);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity$z */
    /* synthetic */ class C23473z extends C41535k implements C43064a {
        C23473z(Object obj) {
            super(0, obj, GTLandingViewModel$ViewModel.class, "showIdentomatTypeSelectionActionsheet", "showIdentomatTypeSelectionActionsheet()V", 0);
        }

        /* renamed from: b */
        public final void mo60283b() {
            ((GTLandingViewModel$ViewModel) this.receiver).mo60311Ft();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo60283b();
            return C41238w.f97225a;
        }
    }

    public GTActivity() {
        C0173b registerForActivityResult = registerForActivityResult(new C2106d(), new C26948a(this));
        C41536l.m120488h(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.f61297K = registerForActivityResult;
        C0173b registerForActivityResult2 = registerForActivityResult(new C2106d(), new C26950b(this));
        C41536l.m120488h(registerForActivityResult2, "registerForActivityResul…ivityResult(result)\n    }");
        this.f61298L = registerForActivityResult2;
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public final void m75892Y2(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C23449d(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public final C28746q m75893Z2() {
        return (C28746q) this.f61295I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public final GTLandingViewModel$ViewModel m75894b3() {
        return (GTLandingViewModel$ViewModel) this.f61294H.getValue();
    }

    /* renamed from: c3 */
    private final void m75895c3(ActivityResult activityResult) {
        if (activityResult.mo371b() == -1) {
            C12910e.m48797o(this, C32343x.m95388F("gt.onboarding.document.resend.success.message", new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public static final void m75896d3(GTActivity gTActivity, ActivityResult activityResult) {
        C41536l.m120489i(gTActivity, "this$0");
        if (activityResult.mo371b() == -1) {
            gTActivity.m75894b3().mo60322ww().mo60321u3();
        } else {
            gTActivity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public static final void m75897e3(GTActivity gTActivity, ActivityResult activityResult) {
        C41536l.m120489i(gTActivity, "this$0");
        C41536l.m120488h(activityResult, "result");
        gTActivity.m75895c3(activityResult);
    }

    /* renamed from: f3 */
    private final void m75898f3() {
        C26987u yw = m75894b3().mo60326yw();
        yw.mo60315Ws().mo4819k(this, new C23470w(new C23455h(this)));
        yw.mo60319h8().mo4819k(this, new C23470w(new C23456i(this)));
        yw.mo60314Pm().mo4819k(this, new C23470w(new C23457j(this)));
        yw.mo60310Fk().mo4819k(this, new C23470w(new C23458k(this)));
        yw.mo60324xv().mo4819k(this, new C23470w(new C23459l(this)));
        yw.mo60308Cd().mo4819k(this, new C23470w(new C23460m(this)));
        C37224b.m109963b(yw.mo60317do(), this, new C23461n(this));
        yw.mo60313I8().mo4819k(this, new C23470w(new C23462o(this)));
        C37224b.m109963b(yw.mo60318g9(), this, new C23463p(this));
        C37224b.m109963b(yw.mo60327zv(), this, new C23452e(this));
        C37224b.m109963b(yw.mo60312He(), this, new C23453f(this));
        C37224b.m109963b(yw.mo60320pc(), this, new C23454g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public final void m75899g3(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C23464q(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C23465r(this), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C23466s(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public final void m75900h3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C23467t(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C23468u(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C23469v(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public final void m75901i3() {
        boolean z;
        C28746q Z2 = m75893Z2();
        LayerView layerView = Z2.f73416h;
        C41536l.m120488h(layerView, "buySellButtonContainer");
        if (m75893Z2().f73427s.getCurrentItem() == 0 && (Z2.f73413e.getVisibility() == 0 || Z2.f73414f.getVisibility() == 0 || Z2.f73415g.getVisibility() == 0)) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(layerView, z, false, 2, (Object) null);
    }

    /* renamed from: j3 */
    private final void m75902j3() {
        C28746q Z2 = m75893Z2();
        Z2.f73422n.mo53597e();
        LayerView layerView = Z2.f73428t;
        C41536l.m120488h(layerView, "tabsWrapper");
        C32343x.m95455i0(layerView);
        ViewPager2 viewPager2 = Z2.f73427s;
        C41536l.m120488h(viewPager2, "tabsViewPager");
        this.f61296J = viewPager2;
        Z2.f73426r.setOnFocusChangeListener(new C23471x(this));
        Z2.f73413e.setBackgroundResource(C25185e.selector_gt_buy_button);
        Z2.f73415g.setBackgroundResource(C25185e.selector_gt_sell_button);
        Z2.f73414f.setOnClickListener(new C26952c(this));
        Z2.f73413e.setOnClickListener(new C26954d(this));
        Z2.f73415g.setOnClickListener(new C26956e(this));
        Z2.f73425q.setOnRefreshListener(new C26958f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m75903k3(GTActivity gTActivity, View view) {
        C41536l.m120489i(gTActivity, "this$0");
        gTActivity.m75894b3().mo60322ww().mo60321u3();
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static final void m75904l3(GTActivity gTActivity, View view) {
        C41536l.m120489i(gTActivity, "this$0");
        GTSymbolSearchActivity.C23733a.m76686b(GTSymbolSearchActivity.f61808O, gTActivity, (C25454q) null, (BigDecimal) null, 6, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public static final void m75905m3(GTActivity gTActivity, View view) {
        C41536l.m120489i(gTActivity, "this$0");
        GTMyInvestmentsActivity.f61719J.mo60566a(gTActivity);
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public static final void m75906n3(GTActivity gTActivity) {
        C41536l.m120489i(gTActivity, "this$0");
        gTActivity.m75894b3().onRefresh(6);
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public final void m75907o3(int i) {
        C28746q Z2 = m75893Z2();
        ViewPager2 viewPager2 = this.f61296J;
        if (viewPager2 == null) {
            C41536l.m120506z("viewPager");
            viewPager2 = null;
        }
        viewPager2.setUserInputEnabled(false);
        ViewPager2 viewPager22 = this.f61296J;
        if (viewPager22 == null) {
            C41536l.m120506z("viewPager");
            viewPager22 = null;
        }
        viewPager22.setAdapter(new C23445b(i, this));
        ViewPager2 viewPager23 = this.f61296J;
        if (viewPager23 == null) {
            C41536l.m120506z("viewPager");
            viewPager23 = null;
        }
        viewPager23.mo6603h(new C23472y(this, i));
        TabsView tabsView = Z2.f73419k;
        ViewPager2 viewPager24 = this.f61296J;
        if (viewPager24 == null) {
            C41536l.m120506z("viewPager");
            viewPager24 = null;
        }
        new C5161d(tabsView, viewPager24, new C26960g(this)).mo16990a();
        LayerView layerView = Z2.f73428t;
        C41536l.m120488h(layerView, "tabsWrapper");
        boolean z = true;
        if (i <= 1) {
            z = false;
        }
        C32343x.m95483r1(layerView, z, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public static final void m75908p3(GTActivity gTActivity, TabLayout.C5153g gVar, int i) {
        String str;
        C41536l.m120489i(gTActivity, "this$0");
        C41536l.m120489i(gVar, "tab");
        if (i == 0) {
            str = gTActivity.getString(C25190j.gt_tab_title_portfolio);
        } else if (i != 1) {
            str = gTActivity.getString(C25190j.gt_tab_title_transactions);
        } else {
            str = gTActivity.getString(C25190j.gt_tab_title_watchlist);
        }
        gVar.mo16972u(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public final void m75909q3() {
        C28790e.m88255a(new C23473z(m75894b3()), new C23444a0(m75894b3().mo60322ww())).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public final void m75910r3() {
        C23583b.f61554P.mo60472a(true).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public final void m75911s3(String str) {
        GTShareDetailsActivity.f61877N.mo60709a(str, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo70996D2(bundle, m75893Z2());
        m75902j3();
        m75898f3();
        C26986t ww = m75894b3().mo60322ww();
        GTLandingViewModel$GTLandingData gTLandingViewModel$GTLandingData = (GTLandingViewModel$GTLandingData) getIntent().getParcelableExtra("KEY_PUSH_TYPE");
        if (gTLandingViewModel$GTLandingData == null) {
            gTLandingViewModel$GTLandingData = new GTLandingViewModel$GTLandingData((String) null, (String) null, false, false, 15, (DefaultConstructorMarker) null);
        }
        ww.mo60323xf(gTLandingViewModel$GTLandingData);
    }

    /* access modifiers changed from: protected */
    /* renamed from: W1 */
    public int mo40034W1() {
        return C25189i.menu_toolbar_gt_activity;
    }

    /* renamed from: a3 */
    public final C20292b mo60255a3() {
        C20292b bVar = this.f61293G;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("getAppSettingByNameUseCase");
        return null;
    }

    public void onBackPressed() {
        ViewPager2 viewPager2 = this.f61296J;
        ViewPager2 viewPager22 = null;
        if (viewPager2 == null) {
            C41536l.m120506z("viewPager");
            viewPager2 = null;
        }
        if (viewPager2.getCurrentItem() != 0) {
            ViewPager2 viewPager23 = this.f61296J;
            if (viewPager23 == null) {
                C41536l.m120506z("viewPager");
            } else {
                viewPager22 = viewPager23;
            }
            viewPager22.setCurrentItem(0);
            return;
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        ViewPager2 viewPager2;
        super.onNewIntent(intent);
        boolean z = false;
        if (intent != null) {
            z = intent.getBooleanExtra("KEY_GOTO_HISTORY", false);
        }
        if (z && (viewPager2 = this.f61296J) != null) {
            if (viewPager2 == null) {
                C41536l.m120506z("viewPager");
                viewPager2 = null;
            }
            viewPager2.setCurrentItem(2);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        C41536l.m120489i(menuItem, "item");
        C32054a.C32071q qVar = C32054a.C32071q.f78912f;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        C32081a.m94499a(qVar, F, " ", " ");
        if (menuItem.getItemId() != C25187g.f64718s2) {
            return super.onOptionsItemSelected(menuItem);
        }
        C23494d.C23495a aVar = C23494d.f61382H;
        C20557a b = mo60255a3().mo48775b("GT_MBANK_FAQ_URL");
        if (b == null || (str = b.mo49087d()) == null) {
            str = "";
        }
        aVar.mo60341a(str).mo4576A1(getSupportFragmentManager(), (String) null);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        m75893Z2().f73426r.clearFocus();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C25190j.gt_page_title_landing_page);
        C41536l.m120488h(string, "getString(R.string.gt_page_title_landing_page)");
        return string;
    }
}
