package p341ge.bog.mobilebank.consumerloanapplication.presentation.activity;

import a90.C19202c;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0173b;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import c90.C19546a0;
import c90.C19626m;
import c90.C19631o0;
import c90.C19645r;
import g90.C20779a;
import g91.C32343x;
import h00.C24846c;
import h80.C24903j;
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
import o31.C37588a0;
import o90.C26887v0;
import p017b.C2106d;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.ClientIncomesInitialData;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.FormData;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.result.LimitResultActivity;
import p341ge.bog.mobilebank.model.Client;
import ue1.C43064a;
import ue1.C43075l;
import z80.C30238a0;
import z80.C30260u;
import z80.C30261v;
import z80.C30262w;
import z80.C30263x;
import z80.C30264y;
import z80.C30265z;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity */
public final class ClientIncomesActivity extends C22615d {

    /* renamed from: O */
    public static final C22592a f59691O = new C22592a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public Client f59692G;

    /* renamed from: H */
    public C26887v0.C26897d f59693H;

    /* renamed from: I */
    private final C41217g f59694I = C41219i.m119470b(new C22595d(this));

    /* renamed from: J */
    private final C41217g f59695J = C41219i.m119470b(new C22596e(this));

    /* renamed from: K */
    private final C41217g f59696K = new C1617p0(C41520a0.m120436b(C26887v0.class), new C22606o(this), new C22608q(this), new C22607p((C43064a) null, this));
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C24903j f59697L;

    /* renamed from: M */
    private final C19202c f59698M = new C19202c(new C22594c(this));
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final C0173b f59699N;

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity$a */
    public static final class C22592a {
        private C22592a() {
        }

        public /* synthetic */ C22592a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo56003a(Activity activity, ClientIncomesInitialData clientIncomesInitialData, boolean z) {
            C41536l.m120489i(activity, "activity");
            C41536l.m120489i(clientIncomesInitialData, "data");
            Intent intent = new Intent(activity, ClientIncomesActivity.class);
            intent.putExtra("DATA", clientIncomesInitialData);
            intent.putExtra("isCLA", z);
            activity.startActivity(intent);
        }

        /* renamed from: b */
        public final void mo56004b(Activity activity, String str, BigDecimal bigDecimal, String str2, String str3, boolean z) {
            Activity activity2 = activity;
            C41536l.m120489i(activity, "activity");
            mo56003a(activity, new ClientIncomesInitialData(bigDecimal, str, str2, "STF", "CNS", str3, (C24846c) null, (BigDecimal) null, 192, (DefaultConstructorMarker) null), z);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity$b */
    public /* synthetic */ class C22593b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f59700a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                c90.m[] r0 = c90.C19626m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                c90.m r1 = c90.C19626m.EDIT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                c90.m r1 = c90.C19626m.DELETE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f59700a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity.C22593b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity$c */
    static final class C22594c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClientIncomesActivity f59701d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22594c(ClientIncomesActivity clientIncomesActivity) {
            super(1);
            this.f59701d = clientIncomesActivity;
        }

        /* renamed from: a */
        public final void mo56005a(String str) {
            C41536l.m120489i(str, "localId");
            this.f59701d.m73247Y2().mo66188Aw().mo66133kj(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56005a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity$d */
    static final class C22595d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ClientIncomesActivity f59702d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22595d(ClientIncomesActivity clientIncomesActivity) {
            super(0);
            this.f59702d = clientIncomesActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getExtras();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.ClientIncomesInitialData invoke() {
            /*
                r2 = this;
                ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity r0 = r2.f59702d
                android.content.Intent r0 = r0.getIntent()
                if (r0 == 0) goto L_0x0017
                android.os.Bundle r0 = r0.getExtras()
                if (r0 == 0) goto L_0x0017
                java.lang.String r1 = "DATA"
                android.os.Parcelable r0 = r0.getParcelable(r1)
                ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.ClientIncomesInitialData r0 = (p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.ClientIncomesInitialData) r0
                goto L_0x0018
            L_0x0017:
                r0 = 0
            L_0x0018:
                kotlin.jvm.internal.C41536l.m120486f(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity.C22595d.invoke():ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.ClientIncomesInitialData");
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity$e */
    static final class C22596e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ClientIncomesActivity f59703d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22596e(ClientIncomesActivity clientIncomesActivity) {
            super(0);
            this.f59703d = clientIncomesActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getExtras();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Boolean invoke() {
            /*
                r2 = this;
                ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity r0 = r2.f59703d
                android.content.Intent r0 = r0.getIntent()
                if (r0 == 0) goto L_0x0015
                android.os.Bundle r0 = r0.getExtras()
                if (r0 == 0) goto L_0x0015
                java.lang.String r1 = "isCLA"
                boolean r0 = r0.getBoolean(r1)
                goto L_0x0016
            L_0x0015:
                r0 = 1
            L_0x0016:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity.C22596e.invoke():java.lang.Boolean");
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity$f */
    static final class C22597f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClientIncomesActivity f59704d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22597f(ClientIncomesActivity clientIncomesActivity) {
            super(1);
            this.f59704d = clientIncomesActivity;
        }

        /* renamed from: a */
        public final void mo56008a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                this.f59704d.m73253e3(true);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f59704d.m73253e3(false);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f59704d.m73253e3(false);
                C24903j M2 = this.f59704d.f59697L;
                if (M2 == null) {
                    C41536l.m120506z("binding");
                    M2 = null;
                }
                CardView cardView = M2.f63994n;
                C41536l.m120488h(cardView, "binding.retryButtonContainer");
                C32343x.m95447f1(cardView);
                this.f59704d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56008a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity$g */
    static final class C22598g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClientIncomesActivity f59705d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22598g(ClientIncomesActivity clientIncomesActivity) {
            super(1);
            this.f59705d = clientIncomesActivity;
        }

        /* renamed from: a */
        public final void mo56009a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                this.f59705d.m73254f3(true);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f59705d.m73254f3(false);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f59705d.m73254f3(false);
                this.f59705d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56009a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity$h */
    static final class C22599h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClientIncomesActivity f59706d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22599h(ClientIncomesActivity clientIncomesActivity) {
            super(1);
            this.f59706d = clientIncomesActivity;
        }

        /* renamed from: a */
        public final void mo56010a(C20779a aVar) {
            ClientIncomesActivity clientIncomesActivity = this.f59706d;
            C41536l.m120488h(aVar, "it");
            clientIncomesActivity.m73257i3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56010a((C20779a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity$i */
    static final class C22600i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClientIncomesActivity f59707d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22600i(ClientIncomesActivity clientIncomesActivity) {
            super(1);
            this.f59707d = clientIncomesActivity;
        }

        /* renamed from: a */
        public final void mo56011a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C19631o0.f53952O.mo47840a().mo4576A1(this.f59707d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56011a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity$j */
    static final class C22601j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClientIncomesActivity f59708d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22601j(ClientIncomesActivity clientIncomesActivity) {
            super(1);
            this.f59708d = clientIncomesActivity;
        }

        /* renamed from: a */
        public final void mo56012a(C41224m mVar) {
            C41536l.m120489i(mVar, "income");
            AddIncomeActivity.f59645K.mo55958a(this.f59708d, (FormData) mVar.mo95678e(), this.f59708d.f59699N, (String) mVar.mo95680f());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56012a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity$k */
    static final class C22602k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClientIncomesActivity f59709d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22602k(ClientIncomesActivity clientIncomesActivity) {
            super(1);
            this.f59709d = clientIncomesActivity;
        }

        /* renamed from: a */
        public final void mo56013a(C41224m mVar) {
            C41536l.m120489i(mVar, "income");
            C19546a0.f53849N.mo47786a((FormData) mVar.mo95678e(), (String) mVar.mo95680f()).mo4576A1(this.f59709d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56013a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity$l */
    static final class C22603l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClientIncomesActivity f59710d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22603l(ClientIncomesActivity clientIncomesActivity) {
            super(1);
            this.f59710d = clientIncomesActivity;
        }

        /* renamed from: a */
        public final void mo56014a(FormData formData) {
            C41536l.m120489i(formData, "income");
            C19645r.f53971J.mo47846a(formData).mo4576A1(this.f59710d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56014a((FormData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity$m */
    static final class C22604m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClientIncomesActivity f59711d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22604m(ClientIncomesActivity clientIncomesActivity) {
            super(1);
            this.f59711d = clientIncomesActivity;
        }

        /* renamed from: a */
        public final void mo56015a(ResultData resultData) {
            C41536l.m120489i(resultData, "it");
            this.f59711d.m73255g3(resultData);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56015a((ResultData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity$n */
    static final class C22605n implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f59712a;

        C22605n(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f59712a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f59712a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f59712a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity$o */
    public static final class C22606o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59713d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22606o(ComponentActivity componentActivity) {
            super(0);
            this.f59713d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f59713d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity$p */
    public static final class C22607p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f59714d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f59715e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22607p(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f59714d = aVar;
            this.f59715e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f59714d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f59715e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity$q */
    static final class C22608q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ClientIncomesActivity f59716d;

        /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity$q$a */
        static final class C22609a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ ClientIncomesActivity f59717d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22609a(ClientIncomesActivity clientIncomesActivity) {
                super(0);
                this.f59717d = clientIncomesActivity;
            }

            /* renamed from: b */
            public final C26887v0 invoke() {
                return this.f59717d.mo56001X2().mo32538a(this.f59717d.m73246W2(), this.f59717d.m73248Z2());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22608q(ClientIncomesActivity clientIncomesActivity) {
            super(0);
            this.f59716d = clientIncomesActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C22609a(this.f59716d));
        }
    }

    public ClientIncomesActivity() {
        C0173b registerForActivityResult = registerForActivityResult(new C2106d(), new C30260u(this));
        C41536l.m120488h(registerForActivityResult, "registerForActivityResul…ome(formData) }\n        }");
        this.f59699N = registerForActivityResult;
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public static final void m73245U2(ClientIncomesActivity clientIncomesActivity, ActivityResult activityResult) {
        FormData formData;
        C41536l.m120489i(clientIncomesActivity, "this$0");
        Intent a = activityResult.mo370a();
        if (a != null) {
            formData = (FormData) a.getParcelableExtra("RESULT_EXTRA_DATA");
        } else {
            formData = null;
        }
        clientIncomesActivity.m73247Y2().mo66188Aw().mo66130Oa(formData);
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final ClientIncomesInitialData m73246W2() {
        return (ClientIncomesInitialData) this.f59694I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public final C26887v0 m73247Y2() {
        return (C26887v0) this.f59696K.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public final boolean m73248Z2() {
        return ((Boolean) this.f59695J.getValue()).booleanValue();
    }

    /* renamed from: a3 */
    private final void m73249a3() {
        m73247Y2().mo66193Fw().mo66151qv().mo4819k(this, new C22605n(new C22597f(this)));
        m73247Y2().mo66193Fw().mo66147Na().mo4819k(this, new C22605n(new C22598g(this)));
        m73247Y2().mo66193Fw().mo66148Wc().mo4819k(this, new C22605n(new C22599h(this)));
        C37224b.m109963b(m73247Y2().mo66193Fw().mo66150hb(), this, new C22600i(this));
        C37224b.m109963b(m73247Y2().mo66193Fw().mo66146Lq(), this, new C22601j(this));
        C37224b.m109963b(m73247Y2().mo66193Fw().mo66152tr(), this, new C22602k(this));
        C37224b.m109963b(m73247Y2().mo66193Fw().mo66153wn(), this, new C22603l(this));
        C37224b.m109963b(m73247Y2().mo66193Fw().mo66149fn(), this, new C22604m(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public static final void m73250b3(ClientIncomesActivity clientIncomesActivity, String str, Bundle bundle) {
        C41536l.m120489i(clientIncomesActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        FormData formData = (FormData) bundle.getParcelable("SELECT_INCOME_TYPE_RESULT_KEY");
        if (formData != null) {
            clientIncomesActivity.m73247Y2().mo66188Aw().mo66129I4(formData);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public static final void m73251c3(ClientIncomesActivity clientIncomesActivity, String str, Bundle bundle) {
        C41536l.m120489i(clientIncomesActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        Object obj = bundle.get("ACTION_TYPE_RESULT_KEY");
        C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.consumerloanapplication.presentation.fragment.IncomeActionType");
        String string = bundle.getString("INCOME_RESULT_KEY", "-1");
        C41536l.m120488h(string, "bundle.getString(IncomeA….INCOME_RESULT_KEY, \"-1\")");
        int i = C22593b.f59700a[((C19626m) obj).ordinal()];
        if (i == 1) {
            clientIncomesActivity.m73247Y2().mo66188Aw().mo66132ie(string);
        } else if (i == 2) {
            clientIncomesActivity.m73247Y2().mo66188Aw().mo66135xa(string);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public static final void m73252d3(ClientIncomesActivity clientIncomesActivity, String str, Bundle bundle) {
        C41536l.m120489i(clientIncomesActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        FormData formData = (FormData) bundle.getParcelable("EDIT_INCOME_RESPONSE_KEY");
        if (formData != null) {
            clientIncomesActivity.m73247Y2().mo66188Aw().mo66130Oa(formData);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public final void m73253e3(boolean z) {
        C24903j jVar = this.f59697L;
        if (jVar == null) {
            C41536l.m120506z("binding");
            jVar = null;
        }
        CardView cardView = jVar.f63991k;
        C41536l.m120488h(cardView, "binding.progressBar");
        C32343x.m95483r1(cardView, z, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final void m73254f3(boolean z) {
        C24903j jVar = this.f59697L;
        if (jVar == null) {
            C41536l.m120506z("binding");
            jVar = null;
        }
        CardView cardView = jVar.f63990j;
        C41536l.m120488h(cardView, "binding.processingProgressBarContainer");
        C32343x.m95483r1(cardView, z, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public final void m73255g3(ResultData resultData) {
        LimitResultActivity.f59889L.mo56218a(this, resultData);
        finish();
    }

    /* renamed from: h3 */
    private final void m73256h3() {
        if (m73248Z2()) {
            C32343x.m95381B0(this, "applications_cl", (String) null, "cl_app_page_2_leave_page_without_sending", 2, (Object) null);
        } else {
            C32343x.m95381B0(this, "check_my_limit", (String) null, "check_my_limit_update_app", 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public final void m73257i3(C20779a aVar) {
        boolean d = aVar.mo49325d();
        C24903j jVar = this.f59697L;
        C24903j jVar2 = null;
        if (jVar == null) {
            C41536l.m120506z("binding");
            jVar = null;
        }
        PageDescriptionView pageDescriptionView = jVar.f63986f;
        C41536l.m120488h(pageDescriptionView, "binding.description");
        C32343x.m95483r1(pageDescriptionView, d, false, 2, (Object) null);
        C24903j jVar3 = this.f59697L;
        if (jVar3 == null) {
            C41536l.m120506z("binding");
            jVar3 = null;
        }
        PageDescriptionView pageDescriptionView2 = jVar3.f63987g;
        C41536l.m120488h(pageDescriptionView2, "binding.incomesEmptyDescription");
        C32343x.m95483r1(pageDescriptionView2, !d, false, 2, (Object) null);
        C24903j jVar4 = this.f59697L;
        if (jVar4 == null) {
            C41536l.m120506z("binding");
        } else {
            jVar2 = jVar4;
        }
        jVar2.f63995o.getButton().setEnabled(d);
        this.f59698M.mo6029i(C41358y.m120036z0(aVar.mo49322a()));
    }

    /* renamed from: j3 */
    private final void m73258j3() {
        C24903j jVar = this.f59697L;
        if (jVar == null) {
            C41536l.m120506z("binding");
            jVar = null;
        }
        String F = C32343x.m95388F("CLA.page.II.add.income.header", new Object[0]);
        String F2 = C32343x.m95388F("CLA.page.II.add.income.explanatory.text", new Object[0]);
        jVar.f63986f.setTitle(F);
        jVar.f63986f.setText(F2);
        jVar.f63987g.setTitle(F);
        jVar.f63987g.setText(F2);
        jVar.f63985e.setButtonText(C32343x.m95388F("CLA.page.II.add.income.button", new Object[0]));
        jVar.f63995o.getButton().setButtonText(C32343x.m95388F("CLA.page.II.add.income.send.app", new Object[0]));
        jVar.f63989i.setAdapter(this.f59698M);
        jVar.f63985e.setOnClickListener(new C30264y(this));
        jVar.f63995o.setOnClickListener(new C30265z(this));
        jVar.f63993m.mo3946b().setOnClickListener(new C30238a0(jVar, this));
        jVar.f63992l.mo84643a(mo56000V2().getUserInfo().isRBClient(), mo86422A1().mo48811h().mo90435e());
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m73259k3(ClientIncomesActivity clientIncomesActivity, View view) {
        C41536l.m120489i(clientIncomesActivity, "this$0");
        clientIncomesActivity.m73247Y2().mo66188Aw().mo66134s6();
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static final void m73260l3(ClientIncomesActivity clientIncomesActivity, View view) {
        C41536l.m120489i(clientIncomesActivity, "this$0");
        clientIncomesActivity.m73247Y2().mo66188Aw().mo66131P6();
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public static final void m73261m3(C24903j jVar, ClientIncomesActivity clientIncomesActivity, View view) {
        C41536l.m120489i(jVar, "$this_with");
        C41536l.m120489i(clientIncomesActivity, "this$0");
        CardView cardView = jVar.f63994n;
        C41536l.m120488h(cardView, "retryButtonContainer");
        C32343x.m95455i0(cardView);
        C21481a.onRefresh$default(clientIncomesActivity.m73247Y2(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C24903j d = C24903j.m79594d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f59697L = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        m73249a3();
        m73258j3();
        getSupportFragmentManager().mo4367F1("SELECT_INCOME_TYPE_REQUEST_KEY", this, new C30261v(this));
        getSupportFragmentManager().mo4367F1("ACTION_TYPE_REQUEST_KEY", this, new C30262w(this));
        getSupportFragmentManager().mo4367F1("EDIT_INCOME_REQUEST_KEY", this, new C30263x(this));
    }

    /* renamed from: V2 */
    public final Client mo56000V2() {
        Client client = this.f59692G;
        if (client != null) {
            return client;
        }
        C41536l.m120506z("client");
        return null;
    }

    /* renamed from: X2 */
    public final C26887v0.C26897d mo56001X2() {
        C26887v0.C26897d dVar = this.f59693H;
        if (dVar != null) {
            return dVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public void onBackPressed() {
        C24903j jVar = this.f59697L;
        if (jVar == null) {
            C41536l.m120506z("binding");
            jVar = null;
        }
        if (jVar.f63990j.getVisibility() != 0) {
            super.onBackPressed();
            m73256h3();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C41536l.m120489i(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("CLA.page.II.main.header", new Object[0]);
    }
}
