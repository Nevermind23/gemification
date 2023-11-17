package p311x5;

import android.util.SparseArray;
import java.util.HashMap;
import p142k5.C6813d;

/* renamed from: x5.a */
public abstract class C8965a {

    /* renamed from: a */
    private static SparseArray f24975a = new SparseArray();

    /* renamed from: b */
    private static HashMap f24976b;

    static {
        HashMap hashMap = new HashMap();
        f24976b = hashMap;
        hashMap.put(C6813d.DEFAULT, 0);
        f24976b.put(C6813d.VERY_LOW, 1);
        f24976b.put(C6813d.HIGHEST, 2);
        for (C6813d dVar : f24976b.keySet()) {
            f24975a.append(((Integer) f24976b.get(dVar)).intValue(), dVar);
        }
    }

    /* renamed from: a */
    public static int m33237a(C6813d dVar) {
        Integer num = (Integer) f24976b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    /* renamed from: b */
    public static C6813d m33238b(int i) {
        C6813d dVar = (C6813d) f24975a.get(i);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
