package p020b2;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.C2320e0;
import com.airbnb.lottie.C2325h;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p033c2.C2224c;
import p048d2.C5804f;
import p048d2.C5808j;
import p294w1.C8736c;
import p294w1.C8737d;
import p294w1.C8741h;
import p331z1.C9174e;

/* renamed from: b2.w */
public abstract class C2149w {

    /* renamed from: a */
    private static final C2224c.C2225a f6324a = C2224c.C2225a.m8482a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b */
    static C2224c.C2225a f6325b = C2224c.C2225a.m8482a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c */
    private static final C2224c.C2225a f6326c = C2224c.C2225a.m8482a("list");

    /* renamed from: d */
    private static final C2224c.C2225a f6327d = C2224c.C2225a.m8482a("cm", "tm", "dr");

    /* renamed from: a */
    public static C2325h m8251a(C2224c cVar) {
        ArrayList arrayList;
        HashMap hashMap;
        C2224c cVar2 = cVar;
        float e = C5808j.m23377e();
        LongSparseArray longSparseArray = new LongSparseArray();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        SparseArrayCompat sparseArrayCompat = new SparseArrayCompat();
        C2325h hVar = new C2325h();
        cVar.mo7153n();
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (cVar.hasNext()) {
            switch (cVar2.mo7160x(f6324a)) {
                case 0:
                    HashMap hashMap5 = hashMap4;
                    ArrayList arrayList4 = arrayList3;
                    i = cVar.mo7157t();
                    continue;
                case 1:
                    HashMap hashMap6 = hashMap4;
                    ArrayList arrayList5 = arrayList3;
                    i2 = cVar.mo7157t();
                    continue;
                case 2:
                    HashMap hashMap7 = hashMap4;
                    ArrayList arrayList6 = arrayList3;
                    f = (float) cVar.mo7156s();
                    continue;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) cVar.mo7156s()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) cVar.mo7156s();
                    break;
                case 5:
                    String[] split = cVar.mo7147I0().split("\\.");
                    if (!C5808j.m23382j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        hVar.mo7542a("Lottie only supports bodymovin >= 4.4.0");
                        break;
                    }
                    break;
                case 6:
                    m8255e(cVar2, hVar, arrayList2, longSparseArray);
                    break;
                case 7:
                    m8252b(cVar2, hVar, hashMap2, hashMap3);
                    break;
                case 8:
                    m8254d(cVar2, hashMap4);
                    break;
                case 9:
                    m8253c(cVar2, hVar, sparseArrayCompat);
                    break;
                case 10:
                    m8256f(cVar2, arrayList3);
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    cVar.mo7161y();
                    cVar.mo7148N();
                    break;
            }
            hashMap = hashMap4;
            arrayList = arrayList3;
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            cVar2 = cVar;
        }
        ArrayList arrayList7 = arrayList3;
        hVar.mo7560s(new Rect(0, 0, (int) (((float) i) * e), (int) (((float) i2) * e)), f, f2, f3, arrayList2, longSparseArray, hashMap2, hashMap3, sparseArrayCompat, hashMap4, arrayList3);
        return hVar;
    }

    /* renamed from: b */
    private static void m8252b(C2224c cVar, C2325h hVar, Map map, Map map2) {
        cVar.mo7152k();
        while (cVar.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            cVar.mo7153n();
            int i = 0;
            int i2 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (cVar.hasNext()) {
                int x = cVar.mo7160x(f6325b);
                if (x == 0) {
                    str = cVar.mo7147I0();
                } else if (x == 1) {
                    cVar.mo7152k();
                    while (cVar.hasNext()) {
                        C9174e a = C2147v.m8249a(cVar, hVar);
                        longSparseArray.put(a.mo24763d(), a);
                        arrayList.add(a);
                    }
                    cVar.mo7154o();
                } else if (x == 2) {
                    i = cVar.mo7157t();
                } else if (x == 3) {
                    i2 = cVar.mo7157t();
                } else if (x == 4) {
                    str2 = cVar.mo7147I0();
                } else if (x != 5) {
                    cVar.mo7161y();
                    cVar.mo7148N();
                } else {
                    str3 = cVar.mo7147I0();
                }
            }
            cVar.mo7155q();
            if (str2 != null) {
                C2320e0 e0Var = new C2320e0(i, i2, str, str2, str3);
                map2.put(e0Var.mo7534d(), e0Var);
            } else {
                map.put(str, arrayList);
            }
        }
        cVar.mo7154o();
    }

    /* renamed from: c */
    private static void m8253c(C2224c cVar, C2325h hVar, SparseArrayCompat sparseArrayCompat) {
        cVar.mo7152k();
        while (cVar.hasNext()) {
            C8737d a = C2135m.m8218a(cVar, hVar);
            sparseArrayCompat.put(a.hashCode(), a);
        }
        cVar.mo7154o();
    }

    /* renamed from: d */
    private static void m8254d(C2224c cVar, Map map) {
        cVar.mo7153n();
        while (cVar.hasNext()) {
            if (cVar.mo7160x(f6326c) != 0) {
                cVar.mo7161y();
                cVar.mo7148N();
            } else {
                cVar.mo7152k();
                while (cVar.hasNext()) {
                    C8736c a = C2137n.m8220a(cVar);
                    map.put(a.mo24128b(), a);
                }
                cVar.mo7154o();
            }
        }
        cVar.mo7155q();
    }

    /* renamed from: e */
    private static void m8255e(C2224c cVar, C2325h hVar, List list, LongSparseArray longSparseArray) {
        cVar.mo7152k();
        int i = 0;
        while (cVar.hasNext()) {
            C9174e a = C2147v.m8249a(cVar, hVar);
            if (a.mo24765f() == C9174e.C9175a.IMAGE) {
                i++;
            }
            list.add(a);
            longSparseArray.put(a.mo24763d(), a);
            if (i > 4) {
                C5804f.m23334c("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        cVar.mo7154o();
    }

    /* renamed from: f */
    private static void m8256f(C2224c cVar, List list) {
        cVar.mo7152k();
        while (cVar.hasNext()) {
            cVar.mo7153n();
            float f = Utils.FLOAT_EPSILON;
            String str = null;
            float f2 = 0.0f;
            while (cVar.hasNext()) {
                int x = cVar.mo7160x(f6327d);
                if (x == 0) {
                    str = cVar.mo7147I0();
                } else if (x == 1) {
                    f = (float) cVar.mo7156s();
                } else if (x != 2) {
                    cVar.mo7161y();
                    cVar.mo7148N();
                } else {
                    f2 = (float) cVar.mo7156s();
                }
            }
            cVar.mo7155q();
            list.add(new C8741h(str, f, f2));
        }
        cVar.mo7154o();
    }
}
