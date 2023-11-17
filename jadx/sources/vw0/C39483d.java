package vw0;

import android.content.Context;
import ax0.C31097c;
import com.google.gson.Gson;
import cx0.C31455b;
import ed1.C40734b;
import ed1.C40744k;
import ed1.C40748o;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.paymentconfiguration.data.source.remote.network.model.PaymentConfigApiModel;
import p341ge.bog.mobilebank.paymentconfiguration.data.source.remote.network.model.PaymentConfigApiResponse;
import p341ge.bog.mobilebank.paymentconfiguration.data.source.remote.network.model.PaymentConfigListApiResponse;
import sw0.C38565a;
import ue1.C43075l;

/* renamed from: vw0.d */
public final class C39483d implements C39486e {

    /* renamed from: a */
    private final Context f93923a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Gson f93924b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C31097c f93925c;

    /* renamed from: vw0.d$a */
    static final class C39484a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39483d f93926d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39484a(C39483d dVar) {
            super(1);
            this.f93926d = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
            se1.C42550b.m123187a(r1, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
            throw r0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p341ge.bog.mobilebank.paymentconfiguration.data.source.remote.network.model.PaymentConfigApiResponse invoke(java.io.InputStream r3) {
            /*
                r2 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                java.nio.charset.Charset r0 = cf1.C40407d.f95989b
                java.io.InputStreamReader r1 = new java.io.InputStreamReader
                r1.<init>(r3, r0)
                boolean r3 = r1 instanceof java.io.BufferedReader
                if (r3 == 0) goto L_0x0013
                java.io.BufferedReader r1 = (java.io.BufferedReader) r1
                goto L_0x001b
            L_0x0013:
                java.io.BufferedReader r3 = new java.io.BufferedReader
                r0 = 8192(0x2000, float:1.14794E-41)
                r3.<init>(r1, r0)
                r1 = r3
            L_0x001b:
                java.lang.String r3 = se1.C42557i.m123200c(r1)     // Catch:{ all -> 0x0032 }
                r0 = 0
                se1.C42550b.m123187a(r1, r0)
                vw0.d r0 = r2.f93926d
                com.google.gson.Gson r0 = r0.f93924b
                java.lang.Class<ge.bog.mobilebank.paymentconfiguration.data.source.remote.network.model.PaymentConfigApiResponse> r1 = p341ge.bog.mobilebank.paymentconfiguration.data.source.remote.network.model.PaymentConfigApiResponse.class
                java.lang.Object r3 = r0.mo18170l(r3, r1)
                ge.bog.mobilebank.paymentconfiguration.data.source.remote.network.model.PaymentConfigApiResponse r3 = (p341ge.bog.mobilebank.paymentconfiguration.data.source.remote.network.model.PaymentConfigApiResponse) r3
                return r3
            L_0x0032:
                r3 = move-exception
                throw r3     // Catch:{ all -> 0x0034 }
            L_0x0034:
                r0 = move-exception
                se1.C42550b.m123187a(r1, r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: vw0.C39483d.C39484a.invoke(java.io.InputStream):ge.bog.mobilebank.paymentconfiguration.data.source.remote.network.model.PaymentConfigApiResponse");
        }
    }

    /* renamed from: vw0.d$b */
    static final class C39485b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39483d f93927d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39485b(C39483d dVar) {
            super(1);
            this.f93927d = dVar;
        }

        /* renamed from: a */
        public final C40748o invoke(PaymentConfigApiResponse paymentConfigApiResponse) {
            List<PaymentConfigApiModel> list;
            C41536l.m120489i(paymentConfigApiResponse, "it");
            PaymentConfigListApiResponse list2 = paymentConfigApiResponse.getList();
            if (list2 != null) {
                list = list2.getMobile();
            } else {
                list = null;
            }
            if (list == null || paymentConfigApiResponse.getList().getMobile().isEmpty()) {
                return C40744k.m117998k();
            }
            return C40744k.m118000q(new C31455b(paymentConfigApiResponse.getHashCode(), this.f93927d.f93925c.mo71296c(paymentConfigApiResponse.getList().getMobile())));
        }
    }

    public C39483d(Context context, Gson gson, C31097c cVar) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(gson, "gson");
        C41536l.m120489i(cVar, "mapper");
        this.f93923a = context;
        this.f93924b = gson;
        this.f93925c = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final InputStream m114769h(C39483d dVar) {
        C41536l.m120489i(dVar, "this$0");
        return dVar.f93923a.getResources().openRawResource(C38565a.payment_configurations);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final PaymentConfigApiResponse m114770i(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (PaymentConfigApiResponse) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final C40748o m114771j(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40748o) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40744k mo93111a() {
        C40744k m = C40744k.m117999o(new C39480a(this)).mo94956r(new C39481b(new C39484a(this))).mo94953m(new C39482c(new C39485b(this)));
        C41536l.m120488h(m, "override fun getConfig()…        }\n        }\n    }");
        return m;
    }

    /* renamed from: b */
    public C40734b mo93112b(C31455b bVar) {
        C41536l.m120489i(bVar, "config");
        throw new UnsupportedOperationException("SaveConfig is not supported in DefaultDataSource");
    }
}
