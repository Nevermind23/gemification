package p816kz;

import g91.C32289b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel;
import p777gz.C24841d;
import r90.C27950a;

/* renamed from: kz.a */
public final class C25794a {
    /* renamed from: a */
    public final MoneyTransferTypeUiModel mo64416a(C24841d dVar) {
        C41536l.m120489i(dVar, "transfer");
        return new MoneyTransferTypeUiModel(dVar.mo63271d(), C27950a.m86287d(dVar.mo63272e(), false, 2, (Object) null), C32289b0.m95091c(dVar.mo63270c()), dVar.mo63268a(), dVar.mo63274f(), dVar.mo63269b());
    }

    /* renamed from: b */
    public final List mo64417b(List list) {
        C41536l.m120489i(list, "transfers");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo64416a((C24841d) it.next()));
        }
        return arrayList;
    }
}
