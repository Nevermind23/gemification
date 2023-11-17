package p155l5;

import android.util.SparseArray;

/* renamed from: l5.p */
public enum C6928p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: k */
    private static final SparseArray f20800k = null;

    /* renamed from: d */
    private final int f20802d;

    static {
        C6928p pVar;
        C6928p pVar2;
        C6928p pVar3;
        C6928p pVar4;
        C6928p pVar5;
        C6928p pVar6;
        SparseArray sparseArray = new SparseArray();
        f20800k = sparseArray;
        sparseArray.put(0, pVar);
        sparseArray.put(1, pVar2);
        sparseArray.put(2, pVar3);
        sparseArray.put(3, pVar4);
        sparseArray.put(4, pVar5);
        sparseArray.put(-1, pVar6);
    }

    private C6928p(int i) {
        this.f20802d = i;
    }
}
