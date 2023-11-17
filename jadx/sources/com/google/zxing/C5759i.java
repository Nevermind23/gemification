package com.google.zxing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p122ib.C6629b;
import p239rb.C8088a;
import p291vb.C8719a;
import p358bc.C10223b;
import p429gc.C12961a;
import p663xb.C18674p;

/* renamed from: com.google.zxing.i */
public final class C5759i implements C5763l {

    /* renamed from: c */
    private static final C5763l[] f18188c = new C5763l[0];

    /* renamed from: a */
    private Map f18189a;

    /* renamed from: b */
    private C5763l[] f18190b;

    /* renamed from: d */
    private C5764m m23181d(C5753c cVar) {
        C5763l[] lVarArr = this.f18190b;
        if (lVarArr != null) {
            int length = lVarArr.length;
            int i = 0;
            while (i < length) {
                try {
                    return lVarArr[i].mo18887b(cVar, this.f18189a);
                } catch (ReaderException unused) {
                    i++;
                }
            }
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: a */
    public void mo18886a() {
        C5763l[] lVarArr = this.f18190b;
        if (lVarArr != null) {
            for (C5763l a : lVarArr) {
                a.mo18886a();
            }
        }
    }

    /* renamed from: b */
    public C5764m mo18887b(C5753c cVar, Map map) {
        mo18890f(map);
        return m23181d(cVar);
    }

    /* renamed from: c */
    public C5764m mo18888c(C5753c cVar) {
        mo18890f((Map) null);
        return m23181d(cVar);
    }

    /* renamed from: e */
    public C5764m mo18889e(C5753c cVar) {
        if (this.f18190b == null) {
            mo18890f((Map) null);
        }
        return m23181d(cVar);
    }

    /* renamed from: f */
    public void mo18890f(Map map) {
        boolean z;
        Collection collection;
        this.f18189a = map;
        boolean z2 = true;
        if (map == null || !map.containsKey(C5754d.TRY_HARDER)) {
            z = false;
        } else {
            z = true;
        }
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(C5754d.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(C5751a.UPC_A) && !collection.contains(C5751a.UPC_E) && !collection.contains(C5751a.EAN_13) && !collection.contains(C5751a.EAN_8) && !collection.contains(C5751a.CODABAR) && !collection.contains(C5751a.CODE_39) && !collection.contains(C5751a.CODE_93) && !collection.contains(C5751a.CODE_128) && !collection.contains(C5751a.ITF) && !collection.contains(C5751a.RSS_14) && !collection.contains(C5751a.RSS_EXPANDED)) {
                z2 = false;
            }
            if (z2 && !z) {
                arrayList.add(new C18674p(map));
            }
            if (collection.contains(C5751a.QR_CODE)) {
                arrayList.add(new C12961a());
            }
            if (collection.contains(C5751a.DATA_MATRIX)) {
                arrayList.add(new C8088a());
            }
            if (collection.contains(C5751a.AZTEC)) {
                arrayList.add(new C6629b());
            }
            if (collection.contains(C5751a.PDF_417)) {
                arrayList.add(new C10223b());
            }
            if (collection.contains(C5751a.MAXICODE)) {
                arrayList.add(new C8719a());
            }
            if (z2 && z) {
                arrayList.add(new C18674p(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z) {
                arrayList.add(new C18674p(map));
            }
            arrayList.add(new C12961a());
            arrayList.add(new C8088a());
            arrayList.add(new C6629b());
            arrayList.add(new C10223b());
            arrayList.add(new C8719a());
            if (z) {
                arrayList.add(new C18674p(map));
            }
        }
        this.f18190b = (C5763l[]) arrayList.toArray(f18188c);
    }
}
