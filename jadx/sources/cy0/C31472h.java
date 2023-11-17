package cy0;

import cy0.C31469g;
import ey0.C31877a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import lx0.C37179d;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33697a;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33699b;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33702d;
import vx0.C39491a;
import yx0.C40087b;

/* renamed from: cy0.h */
final class C31472h implements C31469g {

    /* renamed from: l */
    private final C31877a f78044l;

    /* renamed from: m */
    private List f78045m = C41341q.m119907j();

    public C31472h(C31877a aVar) {
        C41536l.m120489i(aVar, "baseFormManager");
        this.f78044l = aVar;
    }

    /* renamed from: E */
    private final List m93493E() {
        List D = mo71886D();
        ArrayList<C33697a.C33698a> arrayList = new ArrayList<>();
        for (Object next : D) {
            if (((C33699b) ((C33697a.C33698a) next).mo80307a()).mo80328p()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (C33697a.C33698a c : arrayList) {
            arrayList2.add(c.mo80309c());
        }
        return arrayList2;
    }

    /* renamed from: C */
    public C31877a mo71866t() {
        return this.f78044l;
    }

    /* renamed from: D */
    public List mo71886D() {
        return C31469g.C31471b.m93492b(this);
    }

    /* renamed from: j */
    public String mo71879j() {
        C39491a z = mo71887z(C33702d.C33703a.PACKAGES_SELECT);
        if (z == null || !(z instanceof C40087b) || !z.mo93124i()) {
            return null;
        }
        return ((C40087b) z).mo94027G();
    }

    /* renamed from: l */
    public void mo71880l(C37179d dVar) {
        C41536l.m120489i(dVar, "debt");
        for (C39491a m : m93493E()) {
            m.mo93128m(dVar, this.f78045m, mo71866t().mo72308p());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r1 == null) goto L_0x0035;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo71881m(s31.C38424d r5) {
        /*
            r4 = this;
            java.lang.String r0 = "serviceConfigJson"
            kotlin.jvm.internal.C41536l.m120489i(r5, r0)
            java.util.List r5 = r5.mo91979a()
            if (r5 == 0) goto L_0x0035
            java.util.Iterator r5 = r5.iterator()
        L_0x000f:
            boolean r0 = r5.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r5.next()
            r2 = r0
            s31.e r2 = (s31.C38425e) r2
            java.lang.String r2 = r2.mo91988e()
            java.lang.String r3 = "X"
            boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r2, r3)
            if (r2 == 0) goto L_0x000f
            goto L_0x002b
        L_0x002a:
            r0 = r1
        L_0x002b:
            s31.e r0 = (s31.C38425e) r0
            if (r0 == 0) goto L_0x0033
            java.util.List r1 = r0.mo91985b()
        L_0x0033:
            if (r1 != 0) goto L_0x0039
        L_0x0035:
            java.util.List r1 = ie1.C41341q.m119907j()
        L_0x0039:
            r4.f78045m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cy0.C31472h.mo71881m(s31.d):void");
    }

    /* renamed from: o */
    public boolean mo71882o() {
        for (C39491a i : m93493E()) {
            if (i.mo93124i()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public void mo71883y() {
        for (C39491a aVar : m93493E()) {
            aVar.mo93131p();
            aVar.mo93137v(false);
        }
    }

    /* renamed from: z */
    public C39491a mo71887z(C33702d.C33703a aVar) {
        return C31469g.C31471b.m93491a(this, aVar);
    }
}
