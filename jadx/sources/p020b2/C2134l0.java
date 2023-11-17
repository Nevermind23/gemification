package p020b2;

import com.airbnb.lottie.C2325h;
import java.util.ArrayList;
import java.util.Collections;
import p033c2.C2224c;
import p061e2.C6013a;
import p307x1.C8935a;
import p307x1.C8936b;
import p307x1.C8938d;
import p319y1.C9029r;

/* renamed from: b2.l0 */
abstract class C2134l0 {

    /* renamed from: a */
    private static final C2224c.C2225a f6300a = C2224c.C2225a.m8482a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    private static final C2224c.C2225a f6301b = C2224c.C2225a.m8482a("n", "v");

    /* renamed from: a */
    static C9029r m8217a(C2224c cVar, C2325h hVar) {
        C2224c cVar2 = cVar;
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        boolean z = false;
        String str = null;
        C8936b bVar = null;
        C8935a aVar = null;
        C8936b bVar2 = null;
        C9029r.C9031b bVar3 = null;
        C9029r.C9032c cVar3 = null;
        C8938d dVar = null;
        while (cVar.hasNext()) {
            switch (cVar2.mo7160x(f6300a)) {
                case 0:
                    C2325h hVar2 = hVar;
                    str = cVar.mo7147I0();
                    break;
                case 1:
                    C2325h hVar3 = hVar;
                    aVar = C2117d.m8181c(cVar, hVar);
                    break;
                case 2:
                    C2325h hVar4 = hVar;
                    bVar2 = C2117d.m8183e(cVar, hVar);
                    break;
                case 3:
                    C2325h hVar5 = hVar;
                    dVar = C2117d.m8186h(cVar, hVar);
                    break;
                case 4:
                    C2325h hVar6 = hVar;
                    bVar3 = C9029r.C9031b.values()[cVar.mo7157t() - 1];
                    break;
                case 5:
                    C2325h hVar7 = hVar;
                    cVar3 = C9029r.C9032c.values()[cVar.mo7157t() - 1];
                    break;
                case 6:
                    C2325h hVar8 = hVar;
                    f = (float) cVar.mo7156s();
                    break;
                case 7:
                    C2325h hVar9 = hVar;
                    z = cVar.mo7146E0();
                    break;
                case 8:
                    cVar.mo7152k();
                    while (cVar.hasNext()) {
                        cVar.mo7153n();
                        String str2 = null;
                        C8936b bVar4 = null;
                        while (cVar.hasNext()) {
                            int x = cVar2.mo7160x(f6301b);
                            if (x == 0) {
                                str2 = cVar.mo7147I0();
                            } else if (x != 1) {
                                cVar.mo7161y();
                                cVar.mo7148N();
                            } else {
                                bVar4 = C2117d.m8183e(cVar, hVar);
                            }
                        }
                        cVar.mo7155q();
                        str2.hashCode();
                        char c = 65535;
                        switch (str2.hashCode()) {
                            case 100:
                                if (str2.equals("d")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 103:
                                if (str2.equals("g")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 111:
                                if (str2.equals("o")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                                hVar.mo7563u(true);
                                arrayList.add(bVar4);
                                break;
                            case 2:
                                C2325h hVar10 = hVar;
                                bVar = bVar4;
                                break;
                            default:
                                C2325h hVar11 = hVar;
                                break;
                        }
                    }
                    C2325h hVar12 = hVar;
                    cVar.mo7154o();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add((C8936b) arrayList.get(0));
                        break;
                    }
                default:
                    C2325h hVar13 = hVar;
                    cVar.mo7148N();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new C8938d(Collections.singletonList(new C6013a(100)));
        }
        return new C9029r(str, bVar, arrayList, aVar, dVar, bVar2, bVar3, cVar3, f, z);
    }
}
