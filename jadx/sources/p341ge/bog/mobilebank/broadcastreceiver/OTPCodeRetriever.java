package p341ge.bog.mobilebank.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1616p;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1646z;
import androidx.lifecycle.LiveData;
import cf1.C40419j;
import gb1.C32383o;
import he1.C41238w;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p052d6.C5839a;
import p052d6.C5840b;
import p397dm.C12323a;
import p397dm.C12324b;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.broadcastreceiver.OTPCodeRetriever */
public final class OTPCodeRetriever implements C1616p {

    /* renamed from: h */
    public static final C13928a f41292h = new C13928a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final Context f41293d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C32383o f41294e;

    /* renamed from: f */
    private final C5840b f41295f;

    /* renamed from: g */
    private final C13929b f41296g;

    /* renamed from: ge.bog.mobilebank.broadcastreceiver.OTPCodeRetriever$a */
    public static final class C13928a {
        private C13928a() {
        }

        public /* synthetic */ C13928a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final OTPCodeRetriever mo38350a(Context context, C1619q qVar) {
            C41536l.m120489i(context, "context");
            return new OTPCodeRetriever(context, qVar, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.broadcastreceiver.OTPCodeRetriever$b */
    public static final class C13929b extends BroadcastReceiver {

        /* renamed from: a */
        private final Pattern f41297a = new C40419j(".*:\\s*(\\d+)").mo94493k();

        /* renamed from: b */
        final /* synthetic */ OTPCodeRetriever f41298b;

        C13929b(OTPCodeRetriever oTPCodeRetriever) {
            this.f41298b = oTPCodeRetriever;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.google.android.gms.common.api.Status} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceive(android.content.Context r3, android.content.Intent r4) {
            /*
                r2 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                java.lang.String r3 = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED"
                r0 = 0
                if (r4 == 0) goto L_0x000f
                java.lang.String r1 = r4.getAction()     // Catch:{ Exception -> 0x00a0 }
                goto L_0x0010
            L_0x000f:
                r1 = r0
            L_0x0010:
                boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r3, r1)     // Catch:{ Exception -> 0x00a0 }
                if (r3 == 0) goto L_0x0094
                android.os.Bundle r3 = r4.getExtras()     // Catch:{ Exception -> 0x00a0 }
                if (r3 == 0) goto L_0x0088
                java.lang.String r4 = "com.google.android.gms.auth.api.phone.EXTRA_STATUS"
                java.lang.Object r4 = r3.get(r4)     // Catch:{ Exception -> 0x00a0 }
                boolean r1 = r4 instanceof com.google.android.gms.common.api.Status     // Catch:{ Exception -> 0x00a0 }
                if (r1 == 0) goto L_0x0029
                r0 = r4
                com.google.android.gms.common.api.Status r0 = (com.google.android.gms.common.api.Status) r0     // Catch:{ Exception -> 0x00a0 }
            L_0x0029:
                if (r0 == 0) goto L_0x007c
                int r4 = r0.mo11911x()     // Catch:{ Exception -> 0x00a0 }
                if (r4 != 0) goto L_0x0070
                java.lang.String r4 = "com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE"
                java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x00a0 }
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x00a0 }
                java.util.regex.Pattern r4 = r2.f41297a     // Catch:{ Exception -> 0x00a0 }
                java.util.regex.Matcher r3 = r4.matcher(r3)     // Catch:{ Exception -> 0x00a0 }
                boolean r4 = r3.find()     // Catch:{ Exception -> 0x00a0 }
                if (r4 == 0) goto L_0x0064
                r4 = 1
                java.lang.String r3 = r3.group(r4)     // Catch:{ Exception -> 0x00a0 }
                if (r3 == 0) goto L_0x0058
                ge.bog.mobilebank.broadcastreceiver.OTPCodeRetriever r4 = r2.f41298b     // Catch:{ Exception -> 0x00a0 }
                gb1.o r4 = r4.f41294e     // Catch:{ Exception -> 0x00a0 }
                r4.mo4823o(r3)     // Catch:{ Exception -> 0x00a0 }
                goto L_0x00ab
            L_0x0058:
                java.lang.String r3 = "Can't get matched SMS code"
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x00a0 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00a0 }
                r4.<init>(r3)     // Catch:{ Exception -> 0x00a0 }
                throw r4     // Catch:{ Exception -> 0x00a0 }
            L_0x0064:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x00a0 }
                java.lang.String r4 = "Match for SMS code failed"
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00a0 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x00a0 }
                throw r3     // Catch:{ Exception -> 0x00a0 }
            L_0x0070:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x00a0 }
                java.lang.String r4 = "Wait on retriever result timed out"
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00a0 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x00a0 }
                throw r3     // Catch:{ Exception -> 0x00a0 }
            L_0x007c:
                java.lang.String r3 = "Required status was null"
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x00a0 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00a0 }
                r4.<init>(r3)     // Catch:{ Exception -> 0x00a0 }
                throw r4     // Catch:{ Exception -> 0x00a0 }
            L_0x0088:
                java.lang.String r3 = "Required extras was null"
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x00a0 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00a0 }
                r4.<init>(r3)     // Catch:{ Exception -> 0x00a0 }
                throw r4     // Catch:{ Exception -> 0x00a0 }
            L_0x0094:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x00a0 }
                java.lang.String r4 = "Wrong action code"
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00a0 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x00a0 }
                throw r3     // Catch:{ Exception -> 0x00a0 }
            L_0x00a0:
                ge.bog.mobilebank.broadcastreceiver.OTPCodeRetriever r3 = r2.f41298b
                gb1.o r3 = r3.f41294e
                java.lang.String r4 = ""
                r3.mo4823o(r4)
            L_0x00ab:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.broadcastreceiver.OTPCodeRetriever.C13929b.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* renamed from: ge.bog.mobilebank.broadcastreceiver.OTPCodeRetriever$c */
    static final class C13930c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13930c f41299d = new C13930c();

        C13930c() {
            super(1);
        }

        /* renamed from: a */
        public final void mo38352a(Void voidR) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38352a((Void) obj);
            return C41238w.f97225a;
        }
    }

    public /* synthetic */ OTPCodeRetriever(Context context, C1619q qVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, qVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m51876j(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m51877k(OTPCodeRetriever oTPCodeRetriever, Exception exc) {
        C41536l.m120489i(oTPCodeRetriever, "this$0");
        C41536l.m120489i(exc, "<anonymous parameter 0>");
        oTPCodeRetriever.f41294e.mo4823o("");
    }

    /* renamed from: h */
    public final LiveData mo38346h() {
        return this.f41294e;
    }

    /* renamed from: i */
    public final void mo38347i() {
        this.f41295f.mo19060A().mo24864i(new C12323a(C13930c.f41299d)).mo24861f(new C12324b(this));
    }

    @C1646z(C1593j.C1594a.ON_CREATE)
    public final void startListening() {
        try {
            this.f41293d.registerReceiver(this.f41296g, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"));
        } catch (Exception unused) {
        }
    }

    @C1646z(C1593j.C1594a.ON_DESTROY)
    public final void stopListening() {
        try {
            this.f41293d.unregisterReceiver(this.f41296g);
        } catch (Exception unused) {
        }
    }

    private OTPCodeRetriever(Context context, C1619q qVar) {
        C1593j lifecycle;
        this.f41293d = context;
        this.f41294e = new C32383o();
        C5840b a = C5839a.m23515a(context);
        C41536l.m120488h(a, "getClient(context)");
        this.f41295f = a;
        this.f41296g = new C13929b(this);
        if (qVar != null && (lifecycle = qVar.getLifecycle()) != null) {
            lifecycle.mo4906a(this);
        }
    }
}
