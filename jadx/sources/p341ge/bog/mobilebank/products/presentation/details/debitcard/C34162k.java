package p341ge.bog.mobilebank.products.presentation.details.debitcard;

import android.os.Bundle;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import o31.C37614q;
import p341ge.bog.mobilebank.products.presentation.details.debitcard.C34093e;
import p380ck.C10464h;

/* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.k */
public abstract class C34162k {
    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final List m100541c(C34165m mVar) {
        ArrayList arrayList = new ArrayList();
        C37614q.m110615a(arrayList, mVar.mo82536p());
        C37614q.m110615a(arrayList, mVar.mo82525f());
        C37614q.m110615a(arrayList, mVar.mo82522d());
        C37614q.m110615a(arrayList, mVar.mo82532l());
        C37614q.m110615a(arrayList, mVar.mo82521c());
        C37614q.m110615a(arrayList, mVar.mo82526g());
        C37614q.m110615a(arrayList, mVar.mo82523e());
        Boolean m = mVar.mo82533m();
        Boolean bool = Boolean.TRUE;
        if (C41536l.m120484d(m, bool)) {
            arrayList.add(C34093e.C34110q.f82861a);
            arrayList.add(C34093e.C34111r.f82862a);
        } else if (C41536l.m120484d(mVar.mo82534n(), bool)) {
            arrayList.add(C34093e.C34110q.f82861a);
            arrayList.add(C34093e.C34112s.f82863a);
        } else {
            Boolean m2 = mVar.mo82533m();
            Boolean bool2 = Boolean.FALSE;
            if (C41536l.m120484d(m2, bool2) && C41536l.m120484d(mVar.mo82534n(), bool2)) {
                arrayList.add(C34093e.C34110q.f82861a);
                if (mVar.mo82531k().isEmpty()) {
                    arrayList.add(C34093e.C34099f.f82826a);
                } else {
                    arrayList.addAll(mVar.mo82531k());
                    arrayList.add(C34093e.C34096c.f82823a);
                }
            }
        }
        if (!mVar.mo82529i().isEmpty()) {
            arrayList.add(C34093e.C34104k.f82837a);
            arrayList.addAll(mVar.mo82529i());
        }
        if (!mVar.mo82530j().isEmpty()) {
            arrayList.add(C34093e.C34106m.f82842a);
            arrayList.addAll(mVar.mo82530j());
        }
        if (!mVar.mo82527h().isEmpty()) {
            arrayList.add(C34093e.C34102i.f82832a);
            arrayList.addAll(mVar.mo82527h());
        }
        if (!mVar.mo82538r().isEmpty()) {
            arrayList.add(C34093e.C34117x.f82875a);
            arrayList.addAll(mVar.mo82538r());
        }
        if (!mVar.mo82535o().isEmpty()) {
            arrayList.add(C34093e.C34113t.f82864a);
            arrayList.addAll(mVar.mo82535o());
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m100542d(String str) {
        C36546y.m108282F().mo27137H("Google_Pay", str, (String) null, (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
    }
}
