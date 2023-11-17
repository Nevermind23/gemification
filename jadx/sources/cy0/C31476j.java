package cy0;

import cy0.C31473i;
import dy0.C31618a;
import ey0.C31877a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33697a;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33702d;
import vx0.C39491a;

/* renamed from: cy0.j */
final class C31476j implements C31473i {

    /* renamed from: l */
    private final C31877a f78048l;

    public C31476j(C31877a aVar) {
        C41536l.m120489i(aVar, "baseFormManager");
        this.f78048l = aVar;
    }

    /* renamed from: E */
    private final C39491a m93508E() {
        return mo71893z(C33702d.C33703a.TEMPLATE_LIST);
    }

    /* renamed from: F */
    private final List m93509F() {
        List<C33697a.C33698a> D = mo71892D();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(D, 10));
        for (C33697a.C33698a c : D) {
            arrayList.add(c.mo80309c());
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: ge.bog.mobilebank.payments.presentation.form.base.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo71888A(dy0.C31622e r7) {
        /*
            r6 = this;
            java.lang.String r0 = "template"
            kotlin.jvm.internal.C41536l.m120489i(r7, r0)
            java.util.List r0 = ox0.C37829b.m111226m(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x000d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r0.next()
            ge.bog.mobilebank.payments.domain.model.KeyValue r1 = (p341ge.bog.mobilebank.payments.domain.model.KeyValue) r1
            java.util.List r2 = r6.mo71892D()
            java.util.Iterator r2 = r2.iterator()
        L_0x0021:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x004a
            java.lang.Object r3 = r2.next()
            r5 = r3
            ge.bog.mobilebank.payments.presentation.form.base.a$a r5 = (p341ge.bog.mobilebank.payments.presentation.form.base.C33697a.C33698a) r5
            ge.bog.mobilebank.payments.presentation.form.base.d r5 = r5.mo80307a()
            ge.bog.mobilebank.payments.presentation.form.base.b r5 = (p341ge.bog.mobilebank.payments.presentation.form.base.C33699b) r5
            s31.e r5 = r5.mo80321i()
            if (r5 == 0) goto L_0x003f
            java.lang.String r4 = r5.mo91984a()
        L_0x003f:
            java.lang.String r5 = r1.mo80134a()
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r4 == 0) goto L_0x0021
            r4 = r3
        L_0x004a:
            ge.bog.mobilebank.payments.presentation.form.base.a$a r4 = (p341ge.bog.mobilebank.payments.presentation.form.base.C33697a.C33698a) r4
            if (r4 == 0) goto L_0x000d
            vx0.a r2 = r4.mo80309c()
            if (r2 == 0) goto L_0x000d
            java.lang.String r1 = r1.mo80135b()
            r2.mo93129n(r1, r7)
            goto L_0x000d
        L_0x005c:
            vx0.a r0 = r6.m93508E()
            if (r0 != 0) goto L_0x0063
            goto L_0x006e
        L_0x0063:
            long r1 = r7.mo72050d()
            java.lang.String r7 = java.lang.String.valueOf(r1)
            r0.mo93136u(r7)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cy0.C31476j.mo71888A(dy0.e):void");
    }

    /* renamed from: B */
    public void mo71889B(List list) {
        Object obj;
        boolean z;
        C41536l.m120489i(list, "values");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C31618a aVar = (C31618a) it.next();
            Iterator it2 = m93509F().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((C39491a) obj).mo93120e() == aVar.mo72032a()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C39491a aVar2 = (C39491a) obj;
            if (aVar2 != null) {
                aVar2.mo93137v(aVar.mo72034c());
                aVar2.mo93132q(aVar.mo72033b());
            }
        }
    }

    /* renamed from: C */
    public C31877a mo71866t() {
        return this.f78048l;
    }

    /* renamed from: D */
    public List mo71892D() {
        return C31473i.C31475b.m93507b(this);
    }

    /* renamed from: z */
    public C39491a mo71893z(C33702d.C33703a aVar) {
        return C31473i.C31475b.m93506a(this, aVar);
    }
}
