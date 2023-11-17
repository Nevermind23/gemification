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
import p677yb.C18875e;
import p691zb.C18996d;

/* renamed from: xb.p */
public final class C18674p extends C18676r {

    /* renamed from: b */
    private static final C18676r[] f52300b = new C18676r[0];

    /* renamed from: a */
    private final C18676r[] f52301a;

    public C18674p(Map map) {
        Collection collection;
        boolean z;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(C5754d.POSSIBLE_FORMATS);
        }
        if (map == null || map.get(C5754d.ASSUME_CODE_39_CHECK_DIGIT) == null) {
            z = false;
        } else {
            z = true;
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(C5751a.EAN_13) || collection.contains(C5751a.UPC_A) || collection.contains(C5751a.EAN_8) || collection.contains(C5751a.UPC_E)) {
                arrayList.add(new C18675q(map));
            }
            if (collection.contains(C5751a.CODE_39)) {
                arrayList.add(new C18663e(z));
            }
            if (collection.contains(C5751a.CODE_93)) {
                arrayList.add(new C18665g());
            }
            if (collection.contains(C5751a.CODE_128)) {
                arrayList.add(new C18660c());
            }
            if (collection.contains(C5751a.ITF)) {
                arrayList.add(new C18672n());
            }
            if (collection.contains(C5751a.CODABAR)) {
                arrayList.add(new C18656a());
            }
            if (collection.contains(C5751a.RSS_14)) {
                arrayList.add(new C18875e());
            }
            if (collection.contains(C5751a.RSS_EXPANDED)) {
                arrayList.add(new C18996d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C18675q(map));
            arrayList.add(new C18663e());
            arrayList.add(new C18656a());
            arrayList.add(new C18665g());
            arrayList.add(new C18660c());
            arrayList.add(new C18672n());
            arrayList.add(new C18875e());
            arrayList.add(new C18996d());
        }
        this.f52301a = (C18676r[]) arrayList.toArray(f52300b);
    }

    /* renamed from: a */
    public void mo18886a() {
        for (C18676r a : this.f52301a) {
            a.mo18886a();
        }
    }

    /* renamed from: d */
    public C5764m mo46487d(int i, C7507a aVar, Map map) {
        C18676r[] rVarArr = this.f52301a;
        int i2 = 0;
        while (i2 < rVarArr.length) {
            try {
                return rVarArr[i2].mo46487d(i, aVar, map);
            } catch (ReaderException unused) {
                i2++;
            }
        }
        throw NotFoundException.m23155a();
    }
}
