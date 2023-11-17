package p341ge.bog.mobilebank.p2p.presentation.topup_webview;

import androidx.lifecycle.C1644x;
import aw0.C31088c;
import bw0.C31212e;
import c41.C31270e;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import ed1.C40749p;
import ed1.C40754t;
import hd1.C41204a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lw0.C37173a;
import lw0.C37174b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpViewModel$TopUpState;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.p2p.presentation.topup_webview.c */
public final class C33593c extends C21481a implements C37173a, C33592b {

    /* renamed from: k */
    public static final C33595b f81892k = new C33595b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C31088c f81893d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final P2PTopUpViewModel$TopUpState f81894e;

    /* renamed from: f */
    private final C37173a f81895f = this;

    /* renamed from: g */
    private final C33592b f81896g = this;

    /* renamed from: h */
    private final C1644x f81897h = new C1644x();

    /* renamed from: i */
    private final C1644x f81898i = new C1644x();

    /* renamed from: j */
    private C33597d f81899j = C33597d.NAVIGATE_TO_PREVIOUS_PAGE;

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup_webview.c$a */
    static final class C33594a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33593c f81900d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33594a(C33593c cVar) {
            super(1);
            this.f81900d = cVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            double d;
            C41536l.m120489i(num, "requestCode");
            C31088c fw = this.f81900d.f81893d;
            Long d2 = this.f81900d.f81894e.mo79545d();
            C41536l.m120486f(d2);
            long longValue = d2.longValue();
            Long a = this.f81900d.f81894e.mo79543a();
            C41536l.m120486f(a);
            long longValue2 = a.longValue();
            Double b = this.f81900d.f81894e.mo79544b();
            if (b != null) {
                d = b.doubleValue();
            } else {
                d = Utils.DOUBLE_EPSILON;
            }
            return C31270e.m92880i(fw.mo71289a(new C31212e(longValue, longValue2, d, this.f81900d.f81894e.mo79547e())), num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup_webview.c$b */
    public static final class C33595b {
        private C33595b() {
        }

        public /* synthetic */ C33595b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup_webview.c$c */
    public interface C33596c {
        /* renamed from: a */
        C33593c mo32844a(P2PTopUpViewModel$TopUpState p2PTopUpViewModel$TopUpState);
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup_webview.c$d */
    public enum C33597d {
        NAVIGATE_TO_HOME_PAGE,
        NAVIGATE_TO_PREVIOUS_PAGE
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup_webview.c$e */
    public /* synthetic */ class C33598e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f81904a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ge.bog.mobilebank.p2p.presentation.topup_webview.c$d[] r0 = p341ge.bog.mobilebank.p2p.presentation.topup_webview.C33593c.C33597d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.mobilebank.p2p.presentation.topup_webview.c$d r1 = p341ge.bog.mobilebank.p2p.presentation.topup_webview.C33593c.C33597d.NAVIGATE_TO_PREVIOUS_PAGE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.mobilebank.p2p.presentation.topup_webview.c$d r1 = p341ge.bog.mobilebank.p2p.presentation.topup_webview.C33593c.C33597d.NAVIGATE_TO_HOME_PAGE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f81904a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p2p.presentation.topup_webview.C33593c.C33598e.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33593c(C31088c cVar, P2PTopUpViewModel$TopUpState p2PTopUpViewModel$TopUpState) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(cVar, "createInComeTopUpPaymentUseCase");
        C41536l.m120489i(p2PTopUpViewModel$TopUpState, "topUpState");
        this.f81893d = cVar;
        this.f81894e = p2PTopUpViewModel$TopUpState;
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C37174b(new C33594a(this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…equestCode)\n            }");
        bindToLifecycle(C31270e.m92876e(L0, mo79591Z8()));
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m98566ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: et */
    public void mo79592et() {
        int i = C33598e.f81904a[this.f81899j.ordinal()];
        if (i == 1) {
            mo79590G8().mo4823o(C33597d.NAVIGATE_TO_PREVIOUS_PAGE);
        } else if (i == 2) {
            mo79590G8().mo4823o(C33597d.NAVIGATE_TO_HOME_PAGE);
        }
    }

    /* renamed from: hw */
    public C1644x mo79591Z8() {
        return this.f81897h;
    }

    /* renamed from: iw */
    public final C37173a mo79594iw() {
        return this.f81895f;
    }

    /* renamed from: jw */
    public C1644x mo79590G8() {
        return this.f81898i;
    }

    /* renamed from: kw */
    public final C33592b mo79596kw() {
        return this.f81896g;
    }

    /* renamed from: lw */
    public void mo79597lw(String str) {
        C33597d dVar;
        C41536l.m120489i(str, C11769i.C11770a.f34149l);
        if (C40440x.m117139M(str, "status=finally", false, 2, (Object) null)) {
            dVar = C33597d.NAVIGATE_TO_HOME_PAGE;
        } else {
            dVar = C33597d.NAVIGATE_TO_PREVIOUS_PAGE;
        }
        this.f81899j = dVar;
    }
}
