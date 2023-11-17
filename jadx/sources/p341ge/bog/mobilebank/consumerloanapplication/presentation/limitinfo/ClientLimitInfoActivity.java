package p341ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.ComponentActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import d90.C19928a;
import d90.C19929b;
import d90.C19933f;
import d90.C19939l;
import e90.C20184a;
import fd0.C20463a;
import g91.C32343x;
import h00.C24842a;
import h80.C24907n;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.result.LimitResultActivity;
import p341ge.bog.mobilebank.model.Client;
import q31.C38122f;
import q31.C38125h;
import u70.C28605a;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity */
public final class ClientLimitInfoActivity extends C22665a {

    /* renamed from: R */
    public static final C22644a f59777R = new C22644a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public Client f59778G;

    /* renamed from: H */
    public C19933f f59779H;

    /* renamed from: I */
    private final C41217g f59780I = new C1617p0(C41520a0.m120436b(C19939l.class), new C22660p(this), new C22663s(this), new C22661q((C43064a) null, this));

    /* renamed from: J */
    private final C41217g f59781J = C41219i.m119470b(new C22645b(this));
    /* access modifiers changed from: private */

    /* renamed from: K */
    public final C20184a f59782K = new C20184a();

    /* renamed from: L */
    private final C41217g f59783L = C41219i.m119470b(new C22658n(this));

    /* renamed from: M */
    private final C41217g f59784M = C41219i.m119470b(new C22662r(this));

    /* renamed from: N */
    private final C41217g f59785N = C41219i.m119470b(new C22646c(this));

    /* renamed from: O */
    private final C41217g f59786O = C41219i.m119470b(new C22652i(this));

    /* renamed from: P */
    private final C41217g f59787P = C41219i.m119470b(new C22650g(this));

    /* renamed from: Q */
    private final C41217g f59788Q = C41219i.m119470b(new C22651h(this));

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity$a */
    public static final class C22644a {
        private C22644a() {
        }

        public /* synthetic */ C22644a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo56053a(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, String str9, Context context) {
            C41536l.m120489i(str, "appType");
            C41536l.m120489i(str2, "product");
            C41536l.m120489i(str3, "subProduct");
            C41536l.m120489i(str4, "textsLookUpValue");
            C41536l.m120489i(str5, "titleDictionaryKey");
            C41536l.m120489i(str6, "descriptionDictionaryKey");
            C41536l.m120489i(str7, "pageHeaderDictionaryKey");
            C41536l.m120489i(str8, "primaryButtonDictionaryKey");
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, ClientLimitInfoActivity.class);
            intent.putExtra("ARGS_LOOKUP_NAME", str4);
            intent.putExtra("ARGS_IMAGE_ID", i);
            intent.putExtra("ARGS_TITLE_KEY", str5);
            intent.putExtra("ARGS_DESC_KEY", str6);
            intent.putExtra("ARGS_PAGE_HEADER_KEY", str7);
            intent.putExtra("ARGS_BUTTON_KEY", str8);
            intent.putExtra("ARGS_APP_TYPE", str);
            intent.putExtra("ARGS_PRODUCT", str2);
            intent.putExtra("ARGS_SUB_PRODUCT", str3);
            intent.putExtra("ARGS_LIMIT_INFO_TYPE", str9);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity$b */
    static final class C22645b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ClientLimitInfoActivity f59789d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22645b(ClientLimitInfoActivity clientLimitInfoActivity) {
            super(0);
            this.f59789d = clientLimitInfoActivity;
        }

        /* renamed from: b */
        public final C24907n invoke() {
            C24907n d = C24907n.m79613d(this.f59789d.getLayoutInflater());
            C41536l.m120488h(d, "inflate(layoutInflater)");
            return d;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity$c */
    static final class C22646c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ClientLimitInfoActivity f59790d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22646c(ClientLimitInfoActivity clientLimitInfoActivity) {
            super(0);
            this.f59790d = clientLimitInfoActivity;
        }

        public final String invoke() {
            Intent intent = this.f59790d.getIntent();
            return C32343x.m95388F(intent != null ? intent.getStringExtra("ARGS_DESC_KEY") : null, new Object[0]);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity$d */
    static final class C22647d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClientLimitInfoActivity f59791d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22647d(ClientLimitInfoActivity clientLimitInfoActivity) {
            super(1);
            this.f59791d = clientLimitInfoActivity;
        }

        /* renamed from: a */
        public final void mo56055a(List list) {
            C41536l.m120489i(list, "lookups");
            C20184a G2 = this.f59791d.f59782K;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C32343x.m95388F(((C20463a) it.next()).mo49001a(), new Object[0]));
            }
            G2.mo6029i(arrayList);
            CardView cardView = this.f59791d.m73392N2().f64032i;
            C41536l.m120488h(cardView, "binding.progressBar");
            C32343x.m95455i0(cardView);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56055a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity$e */
    static final class C22648e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClientLimitInfoActivity f59792d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22648e(ClientLimitInfoActivity clientLimitInfoActivity) {
            super(1);
            this.f59792d = clientLimitInfoActivity;
        }

        /* renamed from: a */
        public final void mo56056a(List list) {
            CardView cardView = this.f59792d.m73392N2().f64032i;
            C41536l.m120488h(cardView, "binding.progressBar");
            C32343x.m95447f1(cardView);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56056a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity$f */
    static final class C22649f extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ ClientLimitInfoActivity f59793d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22649f(ClientLimitInfoActivity clientLimitInfoActivity) {
            super(2);
            this.f59793d = clientLimitInfoActivity;
        }

        /* renamed from: a */
        public final void mo56057a(Throwable th, List list) {
            C41536l.m120489i(th, "<anonymous parameter 0>");
            CardView cardView = this.f59793d.m73392N2().f64032i;
            C41536l.m120488h(cardView, "binding.progressBar");
            C32343x.m95455i0(cardView);
            CardView cardView2 = this.f59793d.m73392N2().f64035l;
            C41536l.m120488h(cardView2, "binding.retryButtonContainer");
            C32343x.m95447f1(cardView2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo56057a((Throwable) obj, (List) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity$g */
    static final class C22650g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ClientLimitInfoActivity f59794d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22650g(ClientLimitInfoActivity clientLimitInfoActivity) {
            super(0);
            this.f59794d = clientLimitInfoActivity;
        }

        /* renamed from: b */
        public final Integer invoke() {
            int i;
            Intent intent = this.f59794d.getIntent();
            if (intent != null) {
                i = intent.getIntExtra("ARGS_IMAGE_ID", C28605a.f72565n);
            } else {
                i = C28605a.f72565n;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity$h */
    static final class C22651h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ClientLimitInfoActivity f59795d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22651h(ClientLimitInfoActivity clientLimitInfoActivity) {
            super(0);
            this.f59795d = clientLimitInfoActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getStringExtra("ARGS_LIMIT_INFO_TYPE");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke() {
            /*
                r2 = this;
                ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity r0 = r2.f59795d
                android.content.Intent r0 = r0.getIntent()
                if (r0 == 0) goto L_0x0010
                java.lang.String r1 = "ARGS_LIMIT_INFO_TYPE"
                java.lang.String r0 = r0.getStringExtra(r1)
                if (r0 != 0) goto L_0x0012
            L_0x0010:
                java.lang.String r0 = ""
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity.C22651h.invoke():java.lang.String");
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity$i */
    static final class C22652i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ClientLimitInfoActivity f59796d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22652i(ClientLimitInfoActivity clientLimitInfoActivity) {
            super(0);
            this.f59796d = clientLimitInfoActivity;
        }

        public final String invoke() {
            Intent intent = this.f59796d.getIntent();
            return C32343x.m95388F(intent != null ? intent.getStringExtra("ARGS_BUTTON_KEY") : null, new Object[0]);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity$j */
    /* synthetic */ class C22653j extends C41535k implements C43075l {
        C22653j(Object obj) {
            super(1, obj, ClientLimitInfoActivity.class, "handleLookUpResult", "handleLookUpResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo56059b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((ClientLimitInfoActivity) this.receiver).m73400W2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56059b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity$k */
    static final class C22654k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClientLimitInfoActivity f59797d;

        /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity$k$a */
        static final class C22655a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ClientLimitInfoActivity f59798d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22655a(ClientLimitInfoActivity clientLimitInfoActivity) {
                super(1);
                this.f59798d = clientLimitInfoActivity;
            }

            /* renamed from: a */
            public final void mo56061a(String str) {
                C41536l.m120489i(str, "rsContract");
                this.f59798d.m73399V2().mo48323zw(str);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo56061a((String) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22654k(ClientLimitInfoActivity clientLimitInfoActivity) {
            super(1);
            this.f59797d = clientLimitInfoActivity;
        }

        /* renamed from: a */
        public final void mo56060a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C38122f c = C38125h.m112238c(this.f59797d);
            String I2 = this.f59797d.m73395R2();
            FragmentManager supportFragmentManager = this.f59797d.getSupportFragmentManager();
            C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
            ClientLimitInfoActivity clientLimitInfoActivity = this.f59797d;
            c.mo91549F0(I2, supportFragmentManager, clientLimitInfoActivity, new C22655a(clientLimitInfoActivity));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56060a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity$l */
    static final class C22656l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClientLimitInfoActivity f59799d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22656l(ClientLimitInfoActivity clientLimitInfoActivity) {
            super(1);
            this.f59799d = clientLimitInfoActivity;
        }

        /* renamed from: a */
        public final void mo56062a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f59799d.m73401X2();
            CardView cardView = this.f59799d.m73392N2().f64031h;
            C41536l.m120488h(cardView, "binding.processingProgressBarContainer");
            C32343x.m95447f1(cardView);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56062a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity$m */
    static final class C22657m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClientLimitInfoActivity f59800d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22657m(ClientLimitInfoActivity clientLimitInfoActivity) {
            super(1);
            this.f59800d = clientLimitInfoActivity;
        }

        /* renamed from: a */
        public final void mo56063a(ResultData resultData) {
            C41536l.m120489i(resultData, "resultData");
            if (C41536l.m120484d(this.f59800d.m73395R2(), C24842a.BNPL_LIMIT_APP.mo63277b())) {
                C38125h.m112238c(this.f59800d).mo91541B0(resultData.mo56208f(), this.f59800d);
                this.f59800d.finish();
                return;
            }
            LimitResultActivity.f59889L.mo56218a(this.f59800d, resultData);
            this.f59800d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56063a((ResultData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity$n */
    static final class C22658n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ClientLimitInfoActivity f59801d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22658n(ClientLimitInfoActivity clientLimitInfoActivity) {
            super(0);
            this.f59801d = clientLimitInfoActivity;
        }

        public final String invoke() {
            Intent intent = this.f59801d.getIntent();
            return C32343x.m95388F(intent != null ? intent.getStringExtra("ARGS_PAGE_HEADER_KEY") : null, new Object[0]);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity$o */
    static final class C22659o implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f59802a;

        C22659o(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f59802a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f59802a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f59802a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity$p */
    public static final class C22660p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59803d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22660p(ComponentActivity componentActivity) {
            super(0);
            this.f59803d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f59803d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity$q */
    public static final class C22661q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f59804d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f59805e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22661q(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f59804d = aVar;
            this.f59805e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f59804d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f59805e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity$r */
    static final class C22662r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ClientLimitInfoActivity f59806d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22662r(ClientLimitInfoActivity clientLimitInfoActivity) {
            super(0);
            this.f59806d = clientLimitInfoActivity;
        }

        public final String invoke() {
            Intent intent = this.f59806d.getIntent();
            return C32343x.m95388F(intent != null ? intent.getStringExtra("ARGS_TITLE_KEY") : null, new Object[0]);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity$s */
    static final class C22663s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ClientLimitInfoActivity f59807d;

        /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity$s$a */
        static final class C22664a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ ClientLimitInfoActivity f59808d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22664a(ClientLimitInfoActivity clientLimitInfoActivity) {
                super(0);
                this.f59808d = clientLimitInfoActivity;
            }

            /* renamed from: b */
            public final C19939l invoke() {
                C19933f M2 = this.f59808d.mo56051M2();
                String stringExtra = this.f59808d.getIntent().getStringExtra("ARGS_LOOKUP_NAME");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                String stringExtra2 = this.f59808d.getIntent().getStringExtra("ARGS_APP_TYPE");
                if (stringExtra2 == null) {
                    stringExtra2 = "";
                }
                String stringExtra3 = this.f59808d.getIntent().getStringExtra("ARGS_PRODUCT");
                if (stringExtra3 == null) {
                    stringExtra3 = "";
                }
                String stringExtra4 = this.f59808d.getIntent().getStringExtra("ARGS_SUB_PRODUCT");
                if (stringExtra4 == null) {
                    stringExtra4 = "";
                }
                String stringExtra5 = this.f59808d.getIntent().getStringExtra("ARGS_LIMIT_INFO_TYPE");
                if (stringExtra5 == null) {
                    stringExtra5 = "";
                }
                return M2.mo32542a(stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22663s(ClientLimitInfoActivity clientLimitInfoActivity) {
            super(0);
            this.f59807d = clientLimitInfoActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C22664a(this.f59807d));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public final C24907n m73392N2() {
        return (C24907n) this.f59781J.getValue();
    }

    /* renamed from: P2 */
    private final String m73393P2() {
        return (String) this.f59785N.getValue();
    }

    /* renamed from: Q2 */
    private final int m73394Q2() {
        return ((Number) this.f59787P.getValue()).intValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public final String m73395R2() {
        return (String) this.f59788Q.getValue();
    }

    /* renamed from: S2 */
    private final String m73396S2() {
        return (String) this.f59786O.getValue();
    }

    /* renamed from: T2 */
    private final String m73397T2() {
        return (String) this.f59783L.getValue();
    }

    /* renamed from: U2 */
    private final String m73398U2() {
        return (String) this.f59784M.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public final C19939l m73399V2() {
        return (C19939l) this.f59780I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final void m73400W2(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C22647d(this), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C22648e(this), 1, (Object) null);
        C31132b.m92644f(aVar, (int[]) null, new C22649f(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public final void m73401X2() {
        Object systemService = getSystemService("input_method");
        C41536l.m120487g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(m73392N2().mo3946b().getWindowToken(), 0);
    }

    /* renamed from: Y2 */
    private final void m73402Y2() {
        m73399V2().mo48318qw().mo48310S9().mo4819k(this, new C22659o(new C22653j(this)));
        C37224b.m109963b(m73399V2().mo48318qw().mo48309Md(), this, new C22654k(this));
        C37224b.m109963b(m73399V2().mo48318qw().mo48312te(), this, new C22656l(this));
        C37224b.m109963b(m73399V2().mo48318qw().mo48311j3(), this, new C22657m(this));
    }

    /* renamed from: Z2 */
    private final void m73403Z2() {
        C24907n N2 = m73392N2();
        N2.f64034k.mo3946b().setOnClickListener(new C19928a(this));
        PageDescriptionView pageDescriptionView = N2.f64030g;
        pageDescriptionView.setDrawableSrc(Integer.valueOf(m73394Q2()));
        pageDescriptionView.setTitle(m73398U2());
        pageDescriptionView.setText(m73393P2());
        Button button = N2.f64029f;
        button.setButtonText(C32343x.m95388F(m73396S2(), new Object[0]));
        button.setOnClickListener(new C19929b(this));
        m73392N2().f64033j.setAdapter(this.f59782K);
        m73392N2().f64028e.mo84643a(mo56052O2().getUserInfo().isRBClient(), mo86422A1().mo48811h().mo90435e());
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public static final void m73404a3(ClientLimitInfoActivity clientLimitInfoActivity, View view) {
        C41536l.m120489i(clientLimitInfoActivity, "this$0");
        clientLimitInfoActivity.m73399V2().onRefresh(6);
        CardView cardView = clientLimitInfoActivity.m73392N2().f64035l;
        C41536l.m120488h(cardView, "binding.retryButtonContainer");
        C32343x.m95455i0(cardView);
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public static final void m73405b3(ClientLimitInfoActivity clientLimitInfoActivity, View view) {
        C41536l.m120489i(clientLimitInfoActivity, "this$0");
        clientLimitInfoActivity.m73399V2().mo48314mw().mo48308k0();
    }

    /* renamed from: M2 */
    public final C19933f mo56051M2() {
        C19933f fVar = this.f59779H;
        if (fVar != null) {
            return fVar;
        }
        C41536l.m120506z("assistedFactory");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m73392N2().mo3946b());
        super.mo37451O1(bundle);
        m73403Z2();
        m73402Y2();
    }

    /* renamed from: O2 */
    public final Client mo56052O2() {
        Client client = this.f59778G;
        if (client != null) {
            return client;
        }
        C41536l.m120506z("client");
        return null;
    }

    public void onBackPressed() {
        if (m73392N2().f64031h.getVisibility() != 0) {
            super.onBackPressed();
        }
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return m73397T2();
    }
}
