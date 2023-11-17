package p268u1;

import java.util.List;
import p048d2.C5807i;
import p061e2.C6013a;
import p061e2.C6015c;

/* renamed from: u1.d */
public class C8535d extends C8538g {
    public C8535d(List list) {
        super(list);
    }

    /* renamed from: p */
    public float mo23879p() {
        return mo23880q(mo23851b(), mo23853d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public float mo23880q(C6013a aVar, float f) {
        if (aVar.f18759b == null || aVar.f18760c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C6015c cVar = this.f24231e;
        if (cVar != null) {
            Float f2 = (Float) cVar.mo19504b(aVar.f18764g, aVar.f18765h.floatValue(), (Float) aVar.f18759b, (Float) aVar.f18760c, f, mo23854e(), mo23855f());
            if (f2 != null) {
                return f2.floatValue();
            }
        }
        return C5807i.m23370i(aVar.mo19491g(), aVar.mo19488d(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Float mo23857i(C6013a aVar, float f) {
        return Float.valueOf(mo23880q(aVar, f));
    }
}
