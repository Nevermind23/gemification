package rw0;

import iu0.C36546y;
import java.util.ArrayList;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.payment.model.C33624a;
import p366bk.C10328q;
import q81.C38166c0;

/* renamed from: rw0.e */
public abstract class C38378e {
    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m112727c(C33624a.C33625a aVar, C35388f2 f2Var, int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        aVar.mo79823w(z).mo79825y();
        f2Var.finish();
    }

    /* renamed from: e */
    public static void m112729e(C35388f2 f2Var, C33624a.C33625a aVar) {
        C38166c0 c0Var = new C38166c0();
        ArrayList arrayList = new ArrayList();
        arrayList.add(f2Var.getString(C10328q.dd_periodic));
        arrayList.add(f2Var.getString(C10328q.dd_top_up));
        c0Var.mo91697C1(new C38376c(aVar, f2Var));
        c0Var.mo91700F1(f2Var.getString(C10328q.dd_payment_type));
        c0Var.mo91699E1(arrayList);
        c0Var.mo4586v1(false);
        c0Var.mo91698D1(C36546y.m108285N().getString(C10328q.f28928H0), new C38377d(f2Var));
        c0Var.mo4576A1(f2Var.getSupportFragmentManager(), "Alert");
    }
}
