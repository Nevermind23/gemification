package cy0;

import cy0.C31485o;
import ey0.C31877a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import lx0.C37177b;
import p341ge.bog.mobilebank.payments.domain.model.KeyValue;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33702d;
import vx0.C39491a;
import wx0.C39711c;
import yx0.C40087b;

/* renamed from: cy0.p */
final class C31488p implements C31485o {

    /* renamed from: l */
    private final C31877a f78057l;

    public C31488p(C31877a aVar) {
        C41536l.m120489i(aVar, "baseFormManager");
        this.f78057l = aVar;
    }

    /* renamed from: C */
    private final List m93543C() {
        C37177b bVar;
        ArrayList arrayList = new ArrayList();
        for (C39491a aVar : m93544D()) {
            if (aVar != null && aVar.mo93124i()) {
                if (aVar instanceof C39711c) {
                    bVar = ((C39711c) aVar).mo93437E();
                } else if (aVar instanceof C40087b) {
                    bVar = ((C40087b) aVar).mo94026F();
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    arrayList.add(new KeyValue("commission", bVar.mo90174a().toString()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: D */
    private final List m93544D() {
        return C41341q.m119910m(mo71909z(C33702d.C33703a.AMOUNT), mo71909z(C33702d.C33703a.PACKAGES_SELECT));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0074, code lost:
        if (r1 != null) goto L_0x007b;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List m93545F() {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            vx0.a r1 = r8.m93546G()
            if (r1 == 0) goto L_0x007e
            boolean r2 = r1 instanceof xx0.C39921b
            if (r2 == 0) goto L_0x007e
            r2 = r1
            xx0.b r2 = (xx0.C39921b) r2
            java.util.List r2 = r2.mo93647D()
            if (r2 == 0) goto L_0x0077
            java.util.Iterator r2 = r2.iterator()
        L_0x001c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x003c
            java.lang.Object r3 = r2.next()
            r4 = r3
            ge.bog.mobilebank.payments.domain.model.PaymentCard r4 = (p341ge.bog.mobilebank.payments.domain.model.PaymentCard) r4
            long r4 = r4.mo80147d()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = r1.mo93122g()
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r4 == 0) goto L_0x001c
            goto L_0x003d
        L_0x003c:
            r3 = 0
        L_0x003d:
            ge.bog.mobilebank.payments.domain.model.PaymentCard r3 = (p341ge.bog.mobilebank.payments.domain.model.PaymentCard) r3
            if (r3 == 0) goto L_0x0077
            r1 = 2
            ge.bog.mobilebank.payments.domain.model.KeyValue[] r1 = new p341ge.bog.mobilebank.payments.domain.model.KeyValue[r1]
            ge.bog.mobilebank.payments.domain.model.KeyValue r2 = new ge.bog.mobilebank.payments.domain.model.KeyValue
            java.lang.String r4 = "panMD5"
            java.lang.String r5 = r3.mo80157k()
            r2.<init>(r4, r5)
            r4 = 0
            r1[r4] = r2
            ge.bog.mobilebank.payments.domain.model.KeyValue r2 = new ge.bog.mobilebank.payments.domain.model.KeyValue
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            java.lang.String r5 = "MMyy"
            r4.<init>(r5)
            java.util.Date r5 = new java.util.Date
            long r6 = r3.mo80155i()
            r5.<init>(r6)
            java.lang.String r3 = r4.format(r5)
            java.lang.String r4 = "expDate"
            r2.<init>(r4, r3)
            r3 = 1
            r1[r3] = r2
            java.util.List r1 = ie1.C41341q.m119910m(r1)
            if (r1 == 0) goto L_0x0077
            goto L_0x007b
        L_0x0077:
            java.util.List r1 = ie1.C41341q.m119907j()
        L_0x007b:
            r0.addAll(r1)
        L_0x007e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cy0.C31488p.m93545F():java.util.List");
    }

    /* renamed from: G */
    private final C39491a m93546G() {
        return mo71909z(C33702d.C33703a.CARD_CHOOSER);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        if (((p341ge.bog.mobilebank.payments.presentation.form.base.C33699b) r2.mo80307a()).mo80329q() != false) goto L_0x006f;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List m93547I() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r5.mo71908H()
            java.util.Iterator r1 = r1.iterator()
        L_0x000d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0079
            java.lang.Object r2 = r1.next()
            ge.bog.mobilebank.payments.presentation.form.base.a$a r2 = (p341ge.bog.mobilebank.payments.presentation.form.base.C33697a.C33698a) r2
            vx0.a r3 = r2.mo80309c()
            boolean r3 = r3.mo93124i()
            if (r3 != 0) goto L_0x002f
            ge.bog.mobilebank.payments.presentation.form.base.d r3 = r2.mo80307a()
            ge.bog.mobilebank.payments.presentation.form.base.b r3 = (p341ge.bog.mobilebank.payments.presentation.form.base.C33699b) r3
            boolean r3 = r3.mo80325m()
            if (r3 == 0) goto L_0x0055
        L_0x002f:
            ge.bog.mobilebank.payments.presentation.form.base.d r3 = r2.mo80307a()
            ge.bog.mobilebank.payments.presentation.form.base.b r3 = (p341ge.bog.mobilebank.payments.presentation.form.base.C33699b) r3
            s31.e r3 = r3.mo80321i()
            if (r3 == 0) goto L_0x0046
            java.lang.Boolean r3 = r3.mo91990f()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r3, r4)
            goto L_0x0047
        L_0x0046:
            r3 = 0
        L_0x0047:
            if (r3 == 0) goto L_0x0055
            ge.bog.mobilebank.payments.presentation.form.base.d r3 = r2.mo80307a()
            ge.bog.mobilebank.payments.presentation.form.base.b r3 = (p341ge.bog.mobilebank.payments.presentation.form.base.C33699b) r3
            boolean r3 = r3.mo80329q()
            if (r3 != 0) goto L_0x006f
        L_0x0055:
            ge.bog.mobilebank.payments.presentation.form.base.d r3 = r2.mo80307a()
            ge.bog.mobilebank.payments.presentation.form.base.b r3 = (p341ge.bog.mobilebank.payments.presentation.form.base.C33699b) r3
            s31.e r3 = r3.mo80321i()
            if (r3 == 0) goto L_0x0066
            java.lang.String r3 = r3.mo91988e()
            goto L_0x0067
        L_0x0066:
            r3 = 0
        L_0x0067:
            java.lang.String r4 = "X"
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r3, r4)
            if (r3 == 0) goto L_0x000d
        L_0x006f:
            java.util.List r2 = ox0.C37829b.m111235v(r2)
            if (r2 == 0) goto L_0x000d
            r0.addAll(r2)
            goto L_0x000d
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cy0.C31488p.m93547I():java.util.List");
    }

    /* renamed from: E */
    public C31877a mo71866t() {
        return this.f78057l;
    }

    /* renamed from: H */
    public List mo71908H() {
        return C31485o.C31487b.m93542b(this);
    }

    /* renamed from: q */
    public List mo71905q() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m93547I());
        arrayList.addAll(m93545F());
        arrayList.addAll(m93543C());
        return arrayList;
    }

    /* renamed from: z */
    public C39491a mo71909z(C33702d.C33703a aVar) {
        return C31485o.C31487b.m93541a(this, aVar);
    }
}
