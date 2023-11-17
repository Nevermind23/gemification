package p297w4;

import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: w4.w */
public enum C8846w {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    

    /* renamed from: h */
    public static final EnumSet f24823h = null;

    /* renamed from: d */
    private final long f24825d;

    static {
        f24823h = EnumSet.allOf(C8846w.class);
    }

    private C8846w(long j) {
        this.f24825d = j;
    }

    /* renamed from: b */
    public static EnumSet m32935b(long j) {
        EnumSet<E> noneOf = EnumSet.noneOf(C8846w.class);
        Iterator it = f24823h.iterator();
        while (it.hasNext()) {
            C8846w wVar = (C8846w) it.next();
            if ((wVar.mo24275a() & j) != 0) {
                noneOf.add(wVar);
            }
        }
        return noneOf;
    }

    /* renamed from: a */
    public long mo24275a() {
        return this.f24825d;
    }
}
