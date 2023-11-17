package p020b2;

import com.airbnb.lottie.C2325h;
import java.util.ArrayList;
import java.util.List;
import p033c2.C2224c;
import p061e2.C6013a;
import p268u1.C8540i;

/* renamed from: b2.u */
abstract class C2146u {

    /* renamed from: a */
    static C2224c.C2225a f6319a = C2224c.C2225a.m8482a("k");

    /* renamed from: a */
    static List m8247a(C2224c cVar, C2325h hVar, float f, C2138n0 n0Var, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (cVar.mo7158v() == C2224c.C2226b.STRING) {
            hVar.mo7542a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.mo7153n();
        while (cVar.hasNext()) {
            if (cVar.mo7160x(f6319a) != 0) {
                cVar.mo7148N();
            } else if (cVar.mo7158v() == C2224c.C2226b.BEGIN_ARRAY) {
                cVar.mo7152k();
                if (cVar.mo7158v() == C2224c.C2226b.NUMBER) {
                    arrayList.add(C2145t.m8241c(cVar, hVar, f, n0Var, false, z));
                } else {
                    while (cVar.hasNext()) {
                        arrayList.add(C2145t.m8241c(cVar, hVar, f, n0Var, true, z));
                    }
                }
                cVar.mo7154o();
            } else {
                arrayList.add(C2145t.m8241c(cVar, hVar, f, n0Var, false, z));
            }
        }
        cVar.mo7155q();
        m8248b(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static void m8248b(List list) {
        int i;
        Object obj;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C6013a aVar = (C6013a) list.get(i2);
            i2++;
            C6013a aVar2 = (C6013a) list.get(i2);
            aVar.f18765h = Float.valueOf(aVar2.f18764g);
            if (aVar.f18760c == null && (obj = aVar2.f18759b) != null) {
                aVar.f18760c = obj;
                if (aVar instanceof C8540i) {
                    ((C8540i) aVar).mo23889j();
                }
            }
        }
        C6013a aVar3 = (C6013a) list.get(i);
        if ((aVar3.f18759b == null || aVar3.f18760c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
