package n40;

import java.math.BigDecimal;
import java.util.Date;
import kotlin.jvm.internal.C41536l;
import m40.C26142b;
import p969zv.C30411a;

/* renamed from: n40.a */
public final class C26369a {
    /* renamed from: a */
    public final C26142b mo65576a(C30411a aVar) {
        C41536l.m120489i(aVar, "cashFlowMonth");
        Date c = aVar.mo70755c();
        BigDecimal b = aVar.mo70754b();
        BigDecimal a = aVar.mo70753a();
        BigDecimal subtract = aVar.mo70754b().subtract(aVar.mo70753a());
        C41536l.m120488h(subtract, "this.subtract(other)");
        return new C26142b(c, b, a, subtract);
    }
}
