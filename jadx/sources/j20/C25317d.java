package j20;

import g91.C32319m;
import i20.C25111h;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p739dv.C20105d;

/* renamed from: j20.d */
public final class C25317d {
    /* renamed from: a */
    public final C25111h mo63882a(C20105d dVar) {
        Double d;
        C41536l.m120489i(dVar, "data");
        long z = C32319m.m95319z();
        String f = dVar.mo48532f();
        String h = dVar.mo48534h();
        long g = dVar.mo48533g();
        String i = dVar.mo48536i();
        String c = dVar.mo48528c();
        Long d2 = dVar.mo48529d();
        BigDecimal a = dVar.mo48526a();
        if (a != null) {
            d = Double.valueOf(a.doubleValue());
        } else {
            d = null;
        }
        return new C25111h(f, h, g, i, c, d2, z, d, dVar.mo48527b(), dVar.mo48530e());
    }
}
