package p472jd;

import android.content.Context;
import p458id.C15604d;

/* renamed from: jd.f */
public enum C15749f implements C15746c {
    BACK(0),
    FRONT(1);
    

    /* renamed from: d */
    private int f44664d;

    private C15749f(int i) {
        this.f44664d = i;
    }

    /* renamed from: a */
    static C15749f m56744a(Context context) {
        if (context == null) {
            return BACK;
        }
        C15749f fVar = BACK;
        if (C15604d.m56375a(context, fVar)) {
            return fVar;
        }
        C15749f fVar2 = FRONT;
        if (C15604d.m56375a(context, fVar2)) {
            return fVar2;
        }
        return fVar;
    }

    /* renamed from: b */
    static C15749f m56745b(int i) {
        for (C15749f fVar : values()) {
            if (fVar.mo43148c() == i) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo43148c() {
        return this.f44664d;
    }
}
