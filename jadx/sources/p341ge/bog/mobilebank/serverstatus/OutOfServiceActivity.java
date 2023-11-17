package p341ge.bog.mobilebank.serverstatus;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.activity.C0152h;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0767a;
import androidx.core.view.C1200m3;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import c11.C31252a;
import c11.C31254c;
import f10.C20329a;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.serverstatus.OutOfServiceViewModel;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10328q;
import p642vh.C18368l;
import p90.C27295f1;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.serverstatus.OutOfServiceActivity */
public final class OutOfServiceActivity extends C34558a {

    /* renamed from: t */
    public static final C34544a f83486t = new C34544a((DefaultConstructorMarker) null);

    /* renamed from: q */
    private final C41217g f83487q = new C1617p0(C41520a0.m120436b(OutOfServiceViewModel.class), new C34552h(this), new C34551g(this), new C34553i((C43064a) null, this));

    /* renamed from: r */
    private final C41217g f83488r = C41219i.m119470b(new C34545b(this));

    /* renamed from: s */
    private C20329a f83489s;

    /* renamed from: ge.bog.mobilebank.serverstatus.OutOfServiceActivity$a */
    public static final class C34544a {
        private C34544a() {
        }

        public /* synthetic */ C34544a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.serverstatus.OutOfServiceActivity$b */
    static final class C34545b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OutOfServiceActivity f83490d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34545b(OutOfServiceActivity outOfServiceActivity) {
            super(0);
            this.f83490d = outOfServiceActivity;
        }

        /* renamed from: b */
        public final C27295f1 invoke() {
            return C27295f1.m84482d(this.f83490d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.serverstatus.OutOfServiceActivity$c */
    public static final class C34546c extends C0152h {
        C34546c() {
            super(true);
        }

        /* renamed from: b */
        public void mo361b() {
        }
    }

    /* renamed from: ge.bog.mobilebank.serverstatus.OutOfServiceActivity$d */
    static final class C34547d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OutOfServiceActivity f83491d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34547d(OutOfServiceActivity outOfServiceActivity) {
            super(1);
            this.f83491d = outOfServiceActivity;
        }

        /* renamed from: a */
        public final void mo84055a(C31254c cVar) {
            OutOfServiceActivity outOfServiceActivity = this.f83491d;
            C41536l.m120488h(cVar, "it");
            outOfServiceActivity.m101345f1(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84055a((C31254c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.serverstatus.OutOfServiceActivity$e */
    static final class C34548e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OutOfServiceActivity f83492d;

        /* renamed from: ge.bog.mobilebank.serverstatus.OutOfServiceActivity$e$a */
        public /* synthetic */ class C34549a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f83493a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    ge.bog.mobilebank.serverstatus.OutOfServiceViewModel$a[] r0 = p341ge.bog.mobilebank.serverstatus.OutOfServiceViewModel.C34554a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    ge.bog.mobilebank.serverstatus.OutOfServiceViewModel$a r1 = p341ge.bog.mobilebank.serverstatus.OutOfServiceViewModel.C34554a.CALL_SUPPORT     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    ge.bog.mobilebank.serverstatus.OutOfServiceViewModel$a r1 = p341ge.bog.mobilebank.serverstatus.OutOfServiceViewModel.C34554a.OPEN_PLAYSTORE_LINK     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    ge.bog.mobilebank.serverstatus.OutOfServiceViewModel$a r1 = p341ge.bog.mobilebank.serverstatus.OutOfServiceViewModel.C34554a.CLOSE_ACTIVITY     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f83493a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.serverstatus.OutOfServiceActivity.C34548e.C34549a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34548e(OutOfServiceActivity outOfServiceActivity) {
            super(1);
            this.f83492d = outOfServiceActivity;
        }

        /* renamed from: a */
        public final void mo84056a(OutOfServiceViewModel.C34554a aVar) {
            C41536l.m120489i(aVar, "it");
            int i = C34549a.f83493a[aVar.ordinal()];
            if (i == 1) {
                this.f83492d.m101337W0();
            } else if (i == 2) {
                this.f83492d.m101346g1();
            } else if (i == 3) {
                this.f83492d.finish();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84056a((OutOfServiceViewModel.C34554a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.serverstatus.OutOfServiceActivity$f */
    static final class C34550f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f83494a;

        C34550f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f83494a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f83494a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f83494a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.serverstatus.OutOfServiceActivity$g */
    public static final class C34551g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f83495d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34551g(ComponentActivity componentActivity) {
            super(0);
            this.f83495d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f83495d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.serverstatus.OutOfServiceActivity$h */
    public static final class C34552h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f83496d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34552h(ComponentActivity componentActivity) {
            super(0);
            this.f83496d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f83496d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.serverstatus.OutOfServiceActivity$i */
    public static final class C34553i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f83497d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f83498e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34553i(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f83497d = aVar;
            this.f83498e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f83497d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f83498e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W0 */
    public final void m101337W0() {
        try {
            startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:+995322444444")));
        } catch (Exception unused) {
        }
    }

    /* renamed from: X0 */
    private final C27295f1 m101338X0() {
        return (C27295f1) this.f83488r.getValue();
    }

    /* renamed from: Y0 */
    private final int m101339Y0(C31254c cVar) {
        if (cVar.mo71501b()) {
            return C10328q.common_text_call_us;
        }
        return C10328q.dialog_update;
    }

    /* renamed from: a1 */
    private final int m101340a1(C31254c cVar) {
        if (cVar.mo71501b()) {
            return C10320i.icons_48_system_warning_fill;
        }
        return C10320i.icons_48_system_retry;
    }

    /* renamed from: b1 */
    private final int m101341b1(C31254c cVar) {
        if (cVar.mo71501b()) {
            return C10318g.f28634V0;
        }
        return C10318g.f28642e1;
    }

    /* renamed from: c1 */
    private final int m101342c1(C31254c cVar) {
        if (cVar.mo71501b()) {
            return C10328q.dialog_cannot_load_app;
        }
        return C10328q.dialog_old_version;
    }

    /* renamed from: d1 */
    private final OutOfServiceViewModel m101343d1() {
        return (OutOfServiceViewModel) this.f83487q.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: e1 */
    public static final void m101344e1(OutOfServiceActivity outOfServiceActivity, View view) {
        C41536l.m120489i(outOfServiceActivity, "this$0");
        outOfServiceActivity.m101343d1().mo84059Is();
    }

    /* access modifiers changed from: private */
    /* renamed from: f1 */
    public final void m101345f1(C31254c cVar) {
        C27295f1 X0 = m101338X0();
        AppCompatImageView appCompatImageView = X0.f68694f;
        C41536l.m120488h(appCompatImageView, "dialogPicture");
        C18368l.m62746A(appCompatImageView, new Image.Resource(m101340a1(cVar), (Boolean) null, 2, (DefaultConstructorMarker) null), (C43075l) null, 2, (Object) null);
        X0.f68694f.setImageTintList(ColorStateList.valueOf(C0767a.m2893c(this, m101341b1(cVar))));
        X0.f68696h.setText(getString(m101342c1(cVar)));
        AppCompatTextView appCompatTextView = X0.f68695g;
        String a = cVar.mo71500a();
        if (a == null) {
            a = "";
        }
        appCompatTextView.setText(a);
        X0.f68693e.setButtonText(getString(m101339Y0(cVar)));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0011 */
    /* renamed from: g1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m101346g1() {
        /*
            r3 = this;
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x0011 }
            java.lang.String r2 = "market://details?id=ge.bog.mobilebank"
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x0011 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0011 }
            r3.startActivity(r1)     // Catch:{ Exception -> 0x0011 }
            goto L_0x001f
        L_0x0011:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x001f }
            java.lang.String r2 = "http://play.google.com/store/apps/details?id=ge.bog.mobilebank"
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x001f }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x001f }
            r3.startActivity(r1)     // Catch:{ Exception -> 0x001f }
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.serverstatus.OutOfServiceActivity.m101346g1():void");
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        C20329a a = C20329a.f55281b.mo48813a();
        this.f83489s = a;
        Context context2 = null;
        if (context != null) {
            if (a == null) {
                C41536l.m120506z("localeManager");
                a = null;
            }
            context2 = a.mo48810f(context);
        }
        super.attachBaseContext(context2);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C20329a aVar = this.f83489s;
        if (aVar == null) {
            C41536l.m120506z("localeManager");
            aVar = null;
        }
        aVar.mo48810f(this);
        WindowInsetsControllerCompat a = C1200m3.m4285a(getWindow(), getWindow().getDecorView());
        C41536l.m120488h(a, "getInsetsController(window, window.decorView)");
        a.mo3543e(2);
        a.mo3539a(WindowInsetsCompat.C1048m.m3910e());
        setContentView((View) m101338X0().mo3946b());
        getOnBackPressedDispatcher().mo341b(new C34546c());
        m101338X0().f68693e.setOnClickListener(new C31252a(this));
        m101343d1().getState().mo4819k(this, new C34550f(new C34547d(this)));
        C37224b.m109963b(m101343d1().mo84061kw(), this, new C34548e(this));
    }
}
