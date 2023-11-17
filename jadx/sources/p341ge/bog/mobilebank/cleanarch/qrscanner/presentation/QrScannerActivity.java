package p341ge.bog.mobilebank.cleanarch.qrscanner.presentation;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import com.google.zxing.C5751a;
import g70.C20767a;
import g70.C20768b;
import g91.C32330r0;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import org.parceler.C42035e;
import p163m0.C7047a;
import p174mb.C7157e;
import p341ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;
import p341ge.bog.mobilebank.p975ui.activities.NotificationListActivity;
import p341ge.bog.mobilebank.p975ui.activities.qrpay.QrPayActivity;
import p341ge.bog.mobilebank.p975ui.model.qrpay.QrPayData;
import p341ge.bog.mobilebank.services.LastKnownLocationService;
import p366bk.C10328q;
import p416fd.C12843a;
import p416fd.C12844b;
import p416fd.C12854j;
import p420fh.C12902d;
import p420fh.C12910e;
import p90.C27435u1;
import q31.C38125h;
import r90.C27950a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerActivity */
public final class QrScannerActivity extends C22533a {

    /* renamed from: O */
    public static final C22513a f59551O = new C22513a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public Client f59552G;

    /* renamed from: H */
    private final C41217g f59553H = C41219i.m119470b(new C22514b(this));

    /* renamed from: I */
    private final C41217g f59554I = new C1617p0(C41520a0.m120436b(QrScannerViewModel.class), new C22525m(this), new C22524l(this), new C22526n((C43064a) null, this));
    /* access modifiers changed from: private */

    /* renamed from: J */
    public C7157e f59555J;

    /* renamed from: K */
    private boolean f59556K;

    /* renamed from: L */
    private long f59557L;

    /* renamed from: M */
    private C32330r0 f59558M;

    /* renamed from: N */
    private final C12843a f59559N = new C22515c(this);

    /* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerActivity$a */
    public static final class C22513a {
        private C22513a() {
        }

        public /* synthetic */ C22513a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerActivity$b */
    static final class C22514b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ QrScannerActivity f59560d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22514b(QrScannerActivity qrScannerActivity) {
            super(0);
            this.f59560d = qrScannerActivity;
        }

        /* renamed from: b */
        public final C27435u1 invoke() {
            C27435u1 d = C27435u1.m85048d(this.f59560d.getLayoutInflater());
            C41536l.m120488h(d, "inflate(layoutInflater)");
            return d;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerActivity$c */
    public static final class C22515c implements C12843a {

        /* renamed from: a */
        final /* synthetic */ QrScannerActivity f59561a;

        C22515c(QrScannerActivity qrScannerActivity) {
            this.f59561a = qrScannerActivity;
        }

        /* renamed from: a */
        public void mo27407a(List list) {
            C41536l.m120489i(list, "resultPoints");
        }

        /* renamed from: b */
        public void mo27408b(C12844b bVar) {
            C41536l.m120489i(bVar, "result");
            C7157e D2 = this.f59561a.f59555J;
            if (D2 == null) {
                C41536l.m120506z("beepManager");
                D2 = null;
            }
            D2.mo21421f();
            this.f59561a.m73006M2().mo55671zw(bVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerActivity$d */
    /* synthetic */ class C22516d extends C41535k implements C43075l {
        C22516d(Object obj) {
            super(1, obj, QrScannerActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo55657b(boolean z) {
            ((QrScannerActivity) this.receiver).m73017X2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55657b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerActivity$e */
    static final class C22517e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ QrScannerActivity f59562d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22517e(QrScannerActivity qrScannerActivity) {
            super(1);
            this.f59562d = qrScannerActivity;
        }

        /* renamed from: a */
        public final void mo55658a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f59562d.m73015V2(aVar.mo53705e());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55658a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerActivity$f */
    static final class C22518f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ QrScannerActivity f59563d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22518f(QrScannerActivity qrScannerActivity) {
            super(1);
            this.f59563d = qrScannerActivity;
        }

        /* renamed from: a */
        public final void mo55659a(C41224m mVar) {
            C41536l.m120489i(mVar, "it");
            this.f59563d.m73014U2(mVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55659a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerActivity$g */
    static final class C22519g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ QrScannerActivity f59564d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22519g(QrScannerActivity qrScannerActivity) {
            super(1);
            this.f59564d = qrScannerActivity;
        }

        /* renamed from: a */
        public final void mo55660a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f59564d.m73020a3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55660a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerActivity$h */
    static final class C22520h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ QrScannerActivity f59565d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22520h(QrScannerActivity qrScannerActivity) {
            super(1);
            this.f59565d = qrScannerActivity;
        }

        /* renamed from: a */
        public final void mo55661a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f59565d.m73022c3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55661a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerActivity$i */
    static final class C22521i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ QrScannerActivity f59566d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22521i(QrScannerActivity qrScannerActivity) {
            super(1);
            this.f59566d = qrScannerActivity;
        }

        /* renamed from: a */
        public final void mo55662a(QrPayData qrPayData) {
            C41536l.m120489i(qrPayData, "qrPayData");
            QrPayActivity.m105356I2(this.f59566d, qrPayData);
            this.f59566d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55662a((QrPayData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerActivity$j */
    static final class C22522j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ QrScannerActivity f59567d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22522j(QrScannerActivity qrScannerActivity) {
            super(1);
            this.f59567d = qrScannerActivity;
        }

        /* renamed from: a */
        public final void mo55663a(Uri uri) {
            this.f59567d.startActivity(new Intent("android.intent.action.VIEW", uri));
            this.f59567d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55663a((Uri) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerActivity$k */
    static final class C22523k implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f59568a;

        C22523k(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f59568a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f59568a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f59568a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerActivity$l */
    public static final class C22524l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59569d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22524l(ComponentActivity componentActivity) {
            super(0);
            this.f59569d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f59569d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerActivity$m */
    public static final class C22525m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59570d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22525m(ComponentActivity componentActivity) {
            super(0);
            this.f59570d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f59570d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerActivity$n */
    public static final class C22526n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f59571d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f59572e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22526n(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f59571d = aVar;
            this.f59572e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f59571d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f59572e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: K2 */
    private final C27435u1 m73005K2() {
        return (C27435u1) this.f59553H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public final QrScannerViewModel m73006M2() {
        return (QrScannerViewModel) this.f59554I.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r3.equals("QR_INSTALLMENT") == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        m73008O2(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r3.equals("QR_AUTH") == false) goto L_0x0040;
     */
    /* renamed from: N2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m73007N2(java.lang.String r3, java.util.ArrayList r4) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = -1204565957(0xffffffffb833c83b, float:-4.2863405E-5)
            if (r0 == r1) goto L_0x0038
            r1 = -352139885(0xffffffffeb02c593, float:-1.5809337E26)
            if (r0 == r1) goto L_0x001d
            r1 = 1310699782(0x4e1fb106, float:6.6979469E8)
            if (r0 == r1) goto L_0x0014
            goto L_0x0040
        L_0x0014:
            java.lang.String r0 = "QR_AUTH"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0040
            goto L_0x0044
        L_0x001d:
            java.lang.String r0 = "QR_WITHDRAWAL"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0026
            goto L_0x0040
        L_0x0026:
            ge.bog.mobilebank.model.Client r3 = r2.mo55655L2()
            boolean r3 = r3.isAuthorized()
            if (r3 == 0) goto L_0x0034
            r2.m73009P2(r4)
            goto L_0x0047
        L_0x0034:
            r2.m73010Q2()
            goto L_0x0047
        L_0x0038:
            java.lang.String r0 = "QR_INSTALLMENT"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0044
        L_0x0040:
            r2.m73010Q2()
            goto L_0x0047
        L_0x0044:
            r2.m73008O2(r3, r4)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerActivity.m73007N2(java.lang.String, java.util.ArrayList):void");
    }

    /* renamed from: O2 */
    private final void m73008O2(String str, ArrayList arrayList) {
        String D1 = mo55213D1("REDIRECT_PROCESS_REF", arrayList);
        String D12 = mo55213D1("REDIRECT_PROCESS_URL", arrayList);
        String D13 = mo55213D1("QR_AUTH_TYPE", arrayList);
        if (D1 != null) {
            IdentityVerificationActivity.f56552N.mo52251a(this, D1, D12, D13, str, true);
        }
        finish();
    }

    /* renamed from: P2 */
    private final void m73009P2(ArrayList arrayList) {
        String D1;
        String D12 = mo55213D1("ed", arrayList);
        if (D12 != null && (D1 = mo55213D1("AID", arrayList)) != null) {
            C38125h.m112238c(this).mo91560L(D12, D1, this);
            finish();
        }
    }

    /* renamed from: Q2 */
    private final void m73010Q2() {
        NotificationListActivity.m104383P2(this, -1);
        finish();
    }

    /* renamed from: R2 */
    private final void m73011R2(String str, ArrayList arrayList) {
        setIntent(new Intent(this, MainActivity.class));
        getIntent().putExtra("type", str);
        getIntent().putExtra("parameters", C42035e.m122121c(arrayList));
        getIntent().putExtra("PUSH_NOTIFS_OPEN", true);
        startActivity(getIntent());
        finish();
    }

    /* renamed from: S2 */
    private final void m73012S2() {
        C21484c.m69412d(m73006M2().mo55667uw(), this, (C43075l) null, new C22516d(this), new C22517e(this), 2, (Object) null);
        C21484c.m69412d(m73006M2().mo55666pw(), this, new C22518f(this), (C43075l) null, new C22519g(this), 4, (Object) null);
        C37224b.m109963b(m73006M2().mo55669ww(), this, new C22520h(this));
        C37224b.m109963b(m73006M2().mo55668vw(), this, new C22521i(this));
        m73006M2().mo55670xw().mo4819k(this, new C22523k(new C22522j(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public static final void m73013T2(QrScannerActivity qrScannerActivity, View view) {
        C41536l.m120489i(qrScannerActivity, "this$0");
        qrScannerActivity.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public final void m73014U2(C41224m mVar) {
        if (!mo55655L2().isAuthorized()) {
            m73011R2((String) mVar.mo95678e(), (ArrayList) mVar.mo95680f());
        } else {
            m73007N2((String) mVar.mo95678e(), (ArrayList) mVar.mo95680f());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public final void m73015V2(String str) {
        String str2;
        if (str == null || (str2 = C27950a.m86287d(str, false, 2, (Object) null)) == null) {
            str2 = C32343x.m95452h0(C10328q.f28940T1, new Object[0]);
        }
        C12910e.m48790h(this, str2, (C12902d.C12905b) null, false, 6, (Object) null);
        m73005K2().f69906e.postDelayed(new C20768b(this), 5000);
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public static final void m73016W2(QrScannerActivity qrScannerActivity) {
        C41536l.m120489i(qrScannerActivity, "this$0");
        qrScannerActivity.m73021b3();
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public final void m73017X2(boolean z) {
        int i;
        FrameLayout frameLayout = m73005K2().f69908g;
        C41536l.m120488h(frameLayout, "binding.progressBar");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout.setVisibility(i);
    }

    /* renamed from: Y2 */
    private final void m73018Y2() {
        if (C32330r0.m95338m(this, "android.permission.CAMERA")) {
            m73005K2().f69906e.mo27399h();
        } else if (!this.f59556K) {
            C32330r0 r0Var = this.f59558M;
            C41536l.m120486f(r0Var);
            r0Var.mo72835v(1750);
            this.f59556K = true;
        }
    }

    /* renamed from: Z2 */
    private final void m73019Z2() {
        if (C41536l.m120484d("ge.bog.mobilebank.appshortcuts.QR_PAY", getIntent().getAction())) {
            C32343x.m95495w0(this, "quick_actions_menu", "qr_pay", "force_touch");
        }
        if (C41536l.m120484d("ACTION_OPEN_FROM_WIDGET", getIntent().getAction())) {
            C32343x.m95495w0(this, "quick_actions_menu", "qr_pay", "open_page");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public final void m73020a3() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f59557L > 7000) {
            this.f59557L = currentTimeMillis;
            String string = getString(C10328q.not_valid_qr);
            C41536l.m120488h(string, "getString(R.string.not_valid_qr)");
            C12910e.m48790h(this, string, (C12902d.C12905b) null, false, 6, (Object) null);
        }
    }

    /* renamed from: b3 */
    private final void m73021b3() {
        m73005K2().f69906e.mo27389b(this.f59559N);
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public final void m73022c3() {
        m73005K2().f69906e.getBarcodeView().mo27375N();
    }

    /* renamed from: L2 */
    public final Client mo55655L2() {
        Client client = this.f59552G;
        if (client != null) {
            return client;
        }
        C41536l.m120506z("client");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m73005K2().mo3946b());
        super.mo37451O1(bundle);
        m73012S2();
        this.f59555J = new C7157e(this);
        this.f59558M = new C32330r0((Activity) this);
        m73005K2().f69906e.getBarcodeView().setDecoderFactory(new C12854j(C41339p.m119900e(C5751a.QR_CODE)));
        m73021b3();
        startService(new Intent(this, LastKnownLocationService.class));
        m73019Z2();
        m73005K2().f69907f.setOnClickListener(new C20767a(this));
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return m73005K2().f69906e.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        m73005K2().f69906e.mo27392f();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        boolean z;
        C41536l.m120489i(strArr, "permissions");
        C41536l.m120489i(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1750) {
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if ((!z) && iArr[0] == 0) {
                m73005K2().f69906e.mo27399h();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m73018Y2();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        m73022c3();
        super.onStop();
    }
}
