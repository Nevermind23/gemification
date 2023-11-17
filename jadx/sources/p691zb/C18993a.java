package p691zb;

import java.util.List;
import p200ob.C7507a;

/* renamed from: zb.a */
abstract class C18993a {
    /* renamed from: a */
    static C7507a m64118a(List list) {
        int size = (list.size() << 1) - 1;
        if (((C18994b) list.get(list.size() - 1)).mo47035c() == null) {
            size--;
        }
        C7507a aVar = new C7507a(size * 12);
        int i = 0;
        int b = ((C18994b) list.get(0)).mo47035c().mo46849b();
        for (int i2 = 11; i2 >= 0; i2--) {
            if (((1 << i2) & b) != 0) {
                aVar.mo21965q(i);
            }
            i++;
        }
        for (int i3 = 1; i3 < list.size(); i3++) {
            C18994b bVar = (C18994b) list.get(i3);
            int b2 = bVar.mo47034b().mo46849b();
            for (int i4 = 11; i4 >= 0; i4--) {
                if (((1 << i4) & b2) != 0) {
                    aVar.mo21965q(i);
                }
                i++;
            }
            if (bVar.mo47035c() != null) {
                int b3 = bVar.mo47035c().mo46849b();
                for (int i5 = 11; i5 >= 0; i5--) {
                    if (((1 << i5) & b3) != 0) {
                        aVar.mo21965q(i);
                    }
                    i++;
                }
            }
        }
        return aVar;
    }
}
