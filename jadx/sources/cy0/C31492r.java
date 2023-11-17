package cy0;

import cy0.C31489q;
import ey0.C31877a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import ox0.C37829b;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33697a;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33699b;
import s31.C38421a;
import s31.C38425e;

/* renamed from: cy0.r */
final class C31492r implements C31489q {

    /* renamed from: l */
    private final C31877a f78060l;

    public C31492r(C31877a aVar) {
        C41536l.m120489i(aVar, "baseFormManager");
        this.f78060l = aVar;
    }

    /* renamed from: C */
    public List mo71912C() {
        return C31489q.C31491b.m93555a(this);
    }

    /* renamed from: x */
    public List mo71910x(C38421a aVar) {
        List v;
        C41536l.m120489i(aVar, "config");
        ArrayList arrayList = new ArrayList();
        for (C33697a.C33698a aVar2 : mo71912C()) {
            C38425e i = ((C33699b) aVar2.mo80307a()).mo80321i();
            boolean z = false;
            if (i != null && C37829b.m111231r(i, aVar, true)) {
                z = true;
            }
            if (z && (v = C37829b.m111235v(aVar2)) != null) {
                arrayList.addAll(v);
            }
        }
        return arrayList;
    }

    /* renamed from: z */
    public C31877a mo71866t() {
        return this.f78060l;
    }
}
