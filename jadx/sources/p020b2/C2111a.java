package p020b2;

import com.airbnb.lottie.C2325h;
import java.util.ArrayList;
import p033c2.C2224c;
import p048d2.C5808j;
import p061e2.C6013a;
import p307x1.C8936b;
import p307x1.C8939e;
import p307x1.C8943i;
import p307x1.C8947m;

/* renamed from: b2.a */
public abstract class C2111a {

    /* renamed from: a */
    private static final C2224c.C2225a f6263a = C2224c.C2225a.m8482a("k", "x", "y");

    /* renamed from: a */
    public static C8939e m8163a(C2224c cVar, C2325h hVar) {
        ArrayList arrayList = new ArrayList();
        if (cVar.mo7158v() == C2224c.C2226b.BEGIN_ARRAY) {
            cVar.mo7152k();
            while (cVar.hasNext()) {
                arrayList.add(C2152z.m8259a(cVar, hVar));
            }
            cVar.mo7154o();
            C2146u.m8248b(arrayList);
        } else {
            arrayList.add(new C6013a(C2143s.m8236e(cVar, C5808j.m23377e())));
        }
        return new C8939e(arrayList);
    }

    /* renamed from: b */
    static C8947m m8164b(C2224c cVar, C2325h hVar) {
        cVar.mo7153n();
        C8939e eVar = null;
        C8936b bVar = null;
        boolean z = false;
        C8936b bVar2 = null;
        while (cVar.mo7158v() != C2224c.C2226b.END_OBJECT) {
            int x = cVar.mo7160x(f6263a);
            if (x != 0) {
                if (x != 1) {
                    if (x != 2) {
                        cVar.mo7161y();
                        cVar.mo7148N();
                    } else if (cVar.mo7158v() == C2224c.C2226b.STRING) {
                        cVar.mo7148N();
                    } else {
                        bVar = C2117d.m8183e(cVar, hVar);
                    }
                } else if (cVar.mo7158v() == C2224c.C2226b.STRING) {
                    cVar.mo7148N();
                } else {
                    bVar2 = C2117d.m8183e(cVar, hVar);
                }
                z = true;
            } else {
                eVar = m8163a(cVar, hVar);
            }
        }
        cVar.mo7155q();
        if (z) {
            hVar.mo7542a("Lottie doesn't support expressions.");
        }
        if (eVar != null) {
            return eVar;
        }
        return new C8943i(bVar2, bVar);
    }
}
