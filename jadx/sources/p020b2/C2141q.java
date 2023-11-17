package p020b2;

import com.airbnb.lottie.C2325h;
import java.util.ArrayList;
import java.util.Collections;
import p033c2.C2224c;
import p061e2.C6013a;
import p307x1.C8936b;
import p307x1.C8937c;
import p307x1.C8938d;
import p307x1.C8940f;
import p319y1.C9014f;
import p319y1.C9015g;
import p319y1.C9029r;

/* renamed from: b2.q */
abstract class C2141q {

    /* renamed from: a */
    private static final C2224c.C2225a f6309a = C2224c.C2225a.m8482a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    private static final C2224c.C2225a f6310b = C2224c.C2225a.m8482a("p", "k");

    /* renamed from: c */
    private static final C2224c.C2225a f6311c = C2224c.C2225a.m8482a("n", "v");

    /* renamed from: a */
    static C9014f m8229a(C2224c cVar, C2325h hVar) {
        String str;
        C8937c cVar2;
        C9015g gVar;
        C2224c cVar3 = cVar;
        C2325h hVar2 = hVar;
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        String str2 = null;
        C9015g gVar2 = null;
        C8937c cVar4 = null;
        C8940f fVar = null;
        C8940f fVar2 = null;
        C8936b bVar = null;
        C9029r.C9031b bVar2 = null;
        C9029r.C9032c cVar5 = null;
        C8936b bVar3 = null;
        boolean z = false;
        C8938d dVar = null;
        while (cVar.hasNext()) {
            switch (cVar3.mo7160x(f6309a)) {
                case 0:
                    str2 = cVar.mo7147I0();
                    continue;
                case 1:
                    str = str2;
                    cVar.mo7153n();
                    int i = -1;
                    while (cVar.hasNext()) {
                        int x = cVar3.mo7160x(f6310b);
                        if (x != 0) {
                            cVar2 = cVar4;
                            if (x != 1) {
                                cVar.mo7161y();
                                cVar.mo7148N();
                            } else {
                                cVar4 = C2117d.m8185g(cVar3, hVar2, i);
                            }
                        } else {
                            cVar2 = cVar4;
                            i = cVar.mo7157t();
                        }
                        cVar4 = cVar2;
                    }
                    C8937c cVar6 = cVar4;
                    cVar.mo7155q();
                    break;
                case 2:
                    String str3 = str2;
                    dVar = C2117d.m8186h(cVar, hVar);
                    continue;
                case 3:
                    str = str2;
                    if (cVar.mo7157t() == 1) {
                        gVar = C9015g.LINEAR;
                    } else {
                        gVar = C9015g.RADIAL;
                    }
                    gVar2 = gVar;
                    break;
                case 4:
                    String str4 = str2;
                    fVar = C2117d.m8187i(cVar, hVar);
                    continue;
                case 5:
                    String str5 = str2;
                    fVar2 = C2117d.m8187i(cVar, hVar);
                    continue;
                case 6:
                    String str6 = str2;
                    bVar = C2117d.m8183e(cVar, hVar);
                    continue;
                case 7:
                    str = str2;
                    bVar2 = C9029r.C9031b.values()[cVar.mo7157t() - 1];
                    break;
                case 8:
                    str = str2;
                    cVar5 = C9029r.C9032c.values()[cVar.mo7157t() - 1];
                    break;
                case 9:
                    str = str2;
                    f = (float) cVar.mo7156s();
                    break;
                case 10:
                    z = cVar.mo7146E0();
                    continue;
                case 11:
                    cVar.mo7152k();
                    while (cVar.hasNext()) {
                        cVar.mo7153n();
                        String str7 = null;
                        C8936b bVar4 = null;
                        while (cVar.hasNext()) {
                            int x2 = cVar3.mo7160x(f6311c);
                            if (x2 != 0) {
                                C8936b bVar5 = bVar3;
                                if (x2 != 1) {
                                    cVar.mo7161y();
                                    cVar.mo7148N();
                                } else {
                                    bVar4 = C2117d.m8183e(cVar, hVar);
                                }
                                bVar3 = bVar5;
                            } else {
                                C8936b bVar6 = bVar3;
                                str7 = cVar.mo7147I0();
                            }
                        }
                        C8936b bVar7 = bVar3;
                        cVar.mo7155q();
                        if (str7.equals("o")) {
                            bVar3 = bVar4;
                        } else {
                            if (str7.equals("d") || str7.equals("g")) {
                                hVar2.mo7563u(true);
                                arrayList.add(bVar4);
                            }
                            bVar3 = bVar7;
                        }
                    }
                    C8936b bVar8 = bVar3;
                    cVar.mo7154o();
                    if (arrayList.size() == 1) {
                        arrayList.add((C8936b) arrayList.get(0));
                    }
                    bVar3 = bVar8;
                    continue;
                default:
                    String str8 = str2;
                    cVar.mo7161y();
                    cVar.mo7148N();
                    continue;
            }
            str2 = str;
        }
        String str9 = str2;
        if (dVar == null) {
            dVar = new C8938d(Collections.singletonList(new C6013a(100)));
        }
        return new C9014f(str9, gVar2, cVar4, dVar, fVar, fVar2, bVar, bVar2, cVar5, f, arrayList, bVar3, z);
    }
}
