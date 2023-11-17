package pv0;

import com.github.mikephil.charting.utils.Utils;
import g91.C32299e;
import g91.C32343x;
import iv0.C36552d;
import iv0.C36553e;
import iv0.C36554f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import ov0.C37810d;

/* renamed from: pv0.a */
public final class C38024a {
    /* renamed from: b */
    private final C37810d.C37811a m111806b(C36554f fVar) {
        boolean z;
        String f = fVar.mo89361f();
        String e = fVar.mo89359e();
        if (e == null) {
            e = fVar.mo89358d();
        }
        String str = e;
        Double a = fVar.mo89355a();
        String c = fVar.mo89357c();
        List b = fVar.mo89356b();
        Map linkedHashMap = new LinkedHashMap(C43429k.m124585d(C41342q0.m119921f(C41343r.m119925u(b, 10)), 16));
        Iterator it = b.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            C36552d dVar = (C36552d) it.next();
            String b2 = dVar.mo89345a().mo89329b();
            if (dVar.mo89345a().mo89328a() > Utils.DOUBLE_EPSILON) {
                z = true;
            }
            linkedHashMap.put(b2, Boolean.valueOf(z));
        }
        if (linkedHashMap.size() > 1) {
            z = true;
        }
        if (!z) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = C41344r0.m119928j();
        }
        return new C37810d.C37811a(f, str, a, c, linkedHashMap);
    }

    /* renamed from: a */
    public final List mo91395a(String str, C36553e eVar) {
        C41536l.m120489i(str, "bankCode");
        C41536l.m120489i(eVar, "product");
        List e = C41339p.m119900e(new C37810d.C37812b(Integer.valueOf(C32299e.m95163a(str)), C32343x.m95410Q(eVar.mo89351c().mo89364a(), eVar.mo89351c().mo89365b(), false, 2, (Object) null)));
        List<C36554f> b = eVar.mo89350b();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(b, 10));
        for (C36554f b2 : b) {
            arrayList.add(m111806b(b2));
        }
        return C41358y.m120023m0(e, arrayList);
    }
}
