package lt0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kt0.C36990a;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusWrapperUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxDataUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxTariffUiModel;
import p961yy.C30123a;
import ys0.C40057a;
import ys0.C40058b;
import zs0.C40248a;

/* renamed from: lt0.c */
public final class C37154c {

    /* renamed from: a */
    private final C30123a f89489a;

    /* renamed from: b */
    private final C36990a f89490b;

    public C37154c(C30123a aVar, C36990a aVar2) {
        C41536l.m120489i(aVar, "bonusesUiMapper");
        C41536l.m120489i(aVar2, "casInfoMapper");
        this.f89489a = aVar;
        this.f89490b = aVar2;
    }

    /* renamed from: d */
    public static /* synthetic */ List m109819d(C37154c cVar, List list, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return cVar.mo90144c(list, str);
    }

    /* renamed from: a */
    public final MoneyBoxDataUiModel mo90142a(C40057a aVar, String str) {
        C41536l.m120489i(aVar, "data");
        BonusWrapperUiModel h = this.f89489a.mo70417h(aVar.mo93927d());
        List m = this.f89489a.mo70422m(aVar.mo93928e());
        List<C40248a> c = aVar.mo93926c();
        C36990a aVar2 = this.f89490b;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(c, 10));
        for (C40248a i : c) {
            arrayList.add(C36990a.m109494i(aVar2, i, (String) null, 2, (Object) null));
        }
        return new MoneyBoxDataUiModel(h, m, arrayList, mo90144c(aVar.mo93930f(), str));
    }

    /* renamed from: b */
    public final MoneyBoxTariffUiModel mo90143b(C40058b bVar, String str) {
        C41536l.m120489i(bVar, "tariff");
        long b = bVar.mo93934b();
        String c = bVar.mo93935c();
        double d = bVar.mo93936d();
        if (str == null) {
            str = bVar.mo93933a();
        }
        return new MoneyBoxTariffUiModel(b, c, d, str, (String) null, 16, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public final List mo90144c(List list, String str) {
        C41536l.m120489i(list, "tariffs");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo90143b((C40058b) it.next(), str));
        }
        return arrayList;
    }
}
