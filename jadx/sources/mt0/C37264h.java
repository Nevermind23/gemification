package mt0;

import at0.C31065b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kt0.C36990a;
import lt0.C37154c;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankPausePeriodUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankResourcesUiModel;
import ys0.C40059c;
import zs0.C40248a;
import zs0.C40249b;
import zs0.C40253f;
import zs0.C40255h;

/* renamed from: mt0.h */
public final class C37264h {

    /* renamed from: a */
    private final C37154c f89711a;

    /* renamed from: b */
    private final C36990a f89712b;

    public C37264h(C37154c cVar, C36990a aVar) {
        C41536l.m120489i(cVar, "moneyBoxMapper");
        C41536l.m120489i(aVar, "casMapper");
        this.f89711a = cVar;
        this.f89712b = aVar;
    }

    /* renamed from: d */
    public static /* synthetic */ C37261e m110028d(C37264h hVar, C31065b bVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return hVar.mo90381c(bVar, z);
    }

    /* renamed from: a */
    public final PiggyBankPausePeriodUiModel mo90379a(C40255h hVar) {
        C41536l.m120489i(hVar, "duration");
        return new PiggyBankPausePeriodUiModel(hVar.mo94277d(), hVar.mo94278e(), hVar.mo94276c(), hVar.mo94274a(), hVar.mo94275b());
    }

    /* renamed from: b */
    public final PiggyBankResourcesUiModel mo90380b(C40059c cVar) {
        C41536l.m120489i(cVar, "resources");
        List<C40248a> a = cVar.mo93940a();
        C36990a aVar = this.f89712b;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
        for (C40248a i : a) {
            arrayList.add(C36990a.m109494i(aVar, i, (String) null, 2, (Object) null));
        }
        return new PiggyBankResourcesUiModel(arrayList, C37154c.m109819d(this.f89711a, cVar.mo93941b(), (String) null, 2, (Object) null));
    }

    /* renamed from: c */
    public final C37261e mo90381c(C31065b bVar, boolean z) {
        List list;
        C41536l.m120489i(bVar, "resources");
        PiggyBankResourcesUiModel b = mo90380b(bVar.mo71266c());
        List<C40255h> b2 = bVar.mo71265b();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(b2, 10));
        for (C40255h a : b2) {
            arrayList.add(mo90379a(a));
        }
        if (z) {
            List a2 = bVar.mo71264a();
            ArrayList<C40253f> arrayList2 = new ArrayList<>();
            for (Object next : a2) {
                if (((C40253f) next).mo94257q()) {
                    arrayList2.add(next);
                }
            }
            list = new ArrayList(C41343r.m119925u(arrayList2, 10));
            for (C40253f bVar2 : arrayList2) {
                list.add(this.f89712b.mo89932h(new C40249b(bVar2, C41341q.m119907j(), (String) null, 4, (DefaultConstructorMarker) null)));
            }
        } else {
            list = C41341q.m119907j();
        }
        return new C37261e(b, arrayList, list);
    }
}
