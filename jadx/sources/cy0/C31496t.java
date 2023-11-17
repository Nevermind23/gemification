package cy0;

import cy0.C31493s;
import ey0.C31877a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33697a;
import vx0.C39491a;
import yx0.C40087b;

/* renamed from: cy0.t */
final class C31496t implements C31493s {

    /* renamed from: l */
    private final C31877a f78063l;

    public C31496t(C31877a aVar) {
        C41536l.m120489i(aVar, "baseFormManager");
        this.f78063l = aVar;
    }

    /* renamed from: D */
    private final List m93563D() {
        List C = mo71916C();
        ArrayList<C33697a.C33698a> arrayList = new ArrayList<>();
        for (Object next : C) {
            if (((C33697a.C33698a) next).mo80309c() instanceof C40087b) {
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
    public List mo71916C() {
        return C31493s.C31495b.m93562a(this);
    }

    /* renamed from: c */
    public void mo71914c(int i, String str) {
        C41536l.m120489i(str, "optionId");
        for (C39491a aVar : m93563D()) {
            if (aVar.mo93120e() == i) {
                aVar.mo93136u(str);
            }
        }
    }

    /* renamed from: z */
    public C31877a mo71866t() {
        return this.f78063l;
    }
}
