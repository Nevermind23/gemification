package s70;

import ed1.C40762x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ky0.C37019f;
import p341ge.bog.mobilebank.eventbus.events.CreditCardsEvent;
import p341ge.bog.mobilebank.model.Client;
import p843nw.C26625h;

/* renamed from: s70.c */
public final class C28160c {

    /* renamed from: d */
    public static final C28161a f71502d = new C28161a((DefaultConstructorMarker) null);

    /* renamed from: e */
    private static final List f71503e = C41341q.m119910m("REGISTRATION_FLOW", "RESTORE_CREDENTIALS", "QR_PAY", "CCY", "DIGITAL_ONBOARDING");

    /* renamed from: a */
    private final C26625h f71504a;

    /* renamed from: b */
    private final C37019f f71505b;

    /* renamed from: c */
    private final Client f71506c;

    /* renamed from: s70.c$a */
    public static final class C28161a {
        private C28161a() {
        }

        public /* synthetic */ C28161a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C28160c(C26625h hVar, C37019f fVar, Client client) {
        C41536l.m120489i(hVar, "accountsUseCase");
        C41536l.m120489i(fVar, "getDepositsAndBonds");
        C41536l.m120489i(client, "client");
        this.f71504a = hVar;
        this.f71505b = fVar;
        this.f71506c = client;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
        if (r6.equals("CDS_ADD") == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0099, code lost:
        if (r6.equals("SWIFT") == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a2, code lost:
        if (r6.equals("UNKNOWN_DEVICE_LOGIN") == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ab, code lost:
        if (r6.equals("SADEBETO") == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b4, code lost:
        if (r6.equals("CARD_NOTIF") == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b7, code lost:
        r6 = ed1.C40762x.m118162z(java.lang.Boolean.FALSE);
        kotlin.jvm.internal.C41536l.m120488h(r6, "just(false)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c1, code lost:
        r6 = ed1.C40762x.m118162z(java.lang.Boolean.FALSE);
        kotlin.jvm.internal.C41536l.m120488h(r6, "just(false)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0033, code lost:
        if (r6.equals("CDS_OVD") == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
        if (r6.equals("CDS_CAP") == false) goto L_0x00c1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final ed1.C40762x m86604c(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = 0
            java.lang.String r2 = "just(false)"
            r3 = 1
            r4 = 0
            switch(r0) {
                case -1905417951: goto L_0x00ae;
                case -1804892723: goto L_0x00a5;
                case -732095979: goto L_0x009c;
                case 79316467: goto L_0x0093;
                case 842009631: goto L_0x007b;
                case 1029571307: goto L_0x004b;
                case 1359533780: goto L_0x0041;
                case 1359535621: goto L_0x0037;
                case 1359547792: goto L_0x002d;
                case 1429300933: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x00c1
        L_0x000e:
            java.lang.String r0 = "TCC_NOTIF"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0018
            goto L_0x00c1
        L_0x0018:
            nw.h r6 = r5.f71504a
            ed1.p r6 = p843nw.C26625h.m83089d(r6, r4, r3, r1)
            ed1.x r6 = r6.mo94996P()
            java.lang.String r0 = "accountsUseCase.get().firstOrError()"
            kotlin.jvm.internal.C41536l.m120488h(r6, r0)
            ed1.x r6 = r5.mo67674e(r6)
            goto L_0x00ca
        L_0x002d:
            java.lang.String r0 = "CDS_OVD"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x00b7
            goto L_0x00c1
        L_0x0037:
            java.lang.String r0 = "CDS_CAP"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x00b7
            goto L_0x00c1
        L_0x0041:
            java.lang.String r0 = "CDS_ADD"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x00b7
            goto L_0x00c1
        L_0x004b:
            java.lang.String r0 = "LND_AMT"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0055
            goto L_0x00c1
        L_0x0055:
            ge.bog.mobilebank.model.Client r6 = r5.f71506c
            ge.bog.mobilebank.eventbus.events.LoansEvent r6 = r6.getLoansEvent()
            if (r6 == 0) goto L_0x006d
            ge.bog.mobilebank.model.Client r6 = r5.f71506c
            ge.bog.mobilebank.eventbus.events.LoansEvent r6 = r6.getLoansEvent()
            int r6 = r6.getState()
            r0 = 20
            if (r6 == r0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r3 = r4
        L_0x006d:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            ed1.x r6 = ed1.C40762x.m118162z(r6)
            java.lang.String r0 = "just(client.loansEvent =… RootEvent.STATE_SUCCESS)"
            kotlin.jvm.internal.C41536l.m120488h(r6, r0)
            goto L_0x00ca
        L_0x007b:
            java.lang.String r0 = "CDS_AGREE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0084
            goto L_0x00c1
        L_0x0084:
            ky0.f r6 = r5.f71505b
            ed1.p r6 = ky0.C37019f.m109528b(r6, r4, r3, r1)
            ed1.x r6 = md0.C26186e.m81990h(r6)
            ed1.x r6 = r5.mo67674e(r6)
            goto L_0x00ca
        L_0x0093:
            java.lang.String r0 = "SWIFT"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x00b7
            goto L_0x00c1
        L_0x009c:
            java.lang.String r0 = "UNKNOWN_DEVICE_LOGIN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x00b7
            goto L_0x00c1
        L_0x00a5:
            java.lang.String r0 = "SADEBETO"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x00b7
            goto L_0x00c1
        L_0x00ae:
            java.lang.String r0 = "CARD_NOTIF"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x00b7
            goto L_0x00c1
        L_0x00b7:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            ed1.x r6 = ed1.C40762x.m118162z(r6)
            kotlin.jvm.internal.C41536l.m120488h(r6, r2)
            goto L_0x00ca
        L_0x00c1:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            ed1.x r6 = ed1.C40762x.m118162z(r6)
            kotlin.jvm.internal.C41536l.m120488h(r6, r2)
        L_0x00ca:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s70.C28160c.m86604c(java.lang.String):ed1.x");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final Boolean m86605f(Object obj) {
        C41536l.m120489i(obj, "it");
        return Boolean.TRUE;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final Boolean m86606g(Throwable th) {
        C41536l.m120489i(th, "it");
        return Boolean.FALSE;
    }

    /* renamed from: d */
    public final C40762x mo67673d(String str) {
        boolean z;
        if (C41358y.m119999O(f71503e, str) || C41536l.m120484d(str, "URL")) {
            C40762x z2 = C40762x.m118162z(Boolean.FALSE);
            C41536l.m120488h(z2, "{\n            Single.just(false)\n        }");
            return z2;
        }
        boolean z3 = true;
        if (this.f71506c.hasProduct("CREDITCARDACCOUNT") && this.f71506c.getCreditsEvent() != null) {
            CreditCardsEvent creditsEvent = this.f71506c.getCreditsEvent();
            if (creditsEvent == null || creditsEvent.getState() != 20) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                C40762x z4 = C40762x.m118162z(Boolean.TRUE);
                C41536l.m120488h(z4, "{\n            Single.just(true)\n        }");
                return z4;
            }
        }
        if (this.f71506c.isAuthorized()) {
            if (!(str == null || str.length() == 0)) {
                z3 = false;
            }
            if (!z3) {
                return m86604c(str);
            }
        }
        C40762x z5 = C40762x.m118162z(Boolean.FALSE);
        C41536l.m120488h(z5, "{\n            Single.just(false)\n        }");
        return z5;
    }

    /* renamed from: e */
    public final C40762x mo67674e(C40762x xVar) {
        C41536l.m120489i(xVar, "<this>");
        C40762x D = xVar.mo95062A(new C28158a()).mo95065D(new C28159b());
        C41536l.m120488h(D, "map { true }.onErrorReturn { false }");
        return D;
    }
}
