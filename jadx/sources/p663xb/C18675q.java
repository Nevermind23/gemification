package p663xb;

import com.google.zxing.C5751a;
import com.google.zxing.C5754d;
import com.google.zxing.C5764m;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p200ob.C7507a;

/* renamed from: xb.q */
public final class C18675q extends C18676r {

    /* renamed from: b */
    private static final C18683y[] f52302b = new C18683y[0];

    /* renamed from: a */
    private final C18683y[] f52303a;

    public C18675q(Map map) {
        Collection collection;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(C5754d.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(C5751a.EAN_13)) {
                arrayList.add(new C18667i());
            } else if (collection.contains(C5751a.UPC_A)) {
                arrayList.add(new C18678t());
            }
            if (collection.contains(C5751a.EAN_8)) {
                arrayList.add(new C18669k());
            }
            if (collection.contains(C5751a.UPC_E)) {
                arrayList.add(new C18657a0());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C18667i());
            arrayList.add(new C18669k());
            arrayList.add(new C18657a0());
        }
        this.f52303a = (C18683y[]) arrayList.toArray(f52302b);
    }

    /* renamed from: a */
    public void mo18886a() {
        for (C18683y a : this.f52303a) {
            a.mo18886a();
        }
    }

    /* renamed from: d */
    public C5764m mo46487d(int i, C7507a aVar, Map map) {
        boolean z;
        Collection collection;
        boolean z2;
        int[] q = C18683y.m63319q(aVar);
        C18683y[] yVarArr = this.f52303a;
        int i2 = 0;
        while (i2 < yVarArr.length) {
            try {
                C5764m n = yVarArr[i2].mo46496n(i, aVar, q, map);
                if (n.mo18893b() == C5751a.EAN_13 && n.mo18897f().charAt(0) == '0') {
                    z = true;
                } else {
                    z = false;
                }
                if (map == null) {
                    collection = null;
                } else {
                    collection = (Collection) map.get(C5754d.POSSIBLE_FORMATS);
                }
                if (collection != null) {
                    if (!collection.contains(C5751a.UPC_A)) {
                        z2 = false;
                        if (z || !z2) {
                            return n;
                        }
                        C5764m mVar = new C5764m(n.mo18897f().substring(1), n.mo18894c(), n.mo18896e(), C5751a.UPC_A);
                        mVar.mo18898g(n.mo18895d());
                        return mVar;
                    }
                }
                z2 = true;
                if (z) {
                }
                return n;
            } catch (ReaderException unused) {
                i2++;
            }
        }
        throw NotFoundException.m23155a();
    }
}
