package p268u1;

import java.util.List;
import p048d2.C5807i;
import p061e2.C6013a;
import p061e2.C6015c;

/* renamed from: u1.f */
public class C8537f extends C8538g {
    public C8537f(List list) {
        super(list);
    }

    /* renamed from: p */
    public int mo23883p() {
        return mo23884q(mo23851b(), mo23853d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo23884q(C6013a aVar, float f) {
        if (aVar.f18759b == null || aVar.f18760c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C6015c cVar = this.f24231e;
        if (cVar != null) {
            Integer num = (Integer) cVar.mo19504b(aVar.f18764g, aVar.f18765h.floatValue(), (Integer) aVar.f18759b, (Integer) aVar.f18760c, f, mo23854e(), mo23855f());
            if (num != null) {
                return num.intValue();
            }
        }
        return C5807i.m23371j(aVar.mo19492h(), aVar.mo19489e(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Integer mo23857i(C6013a aVar, float f) {
        return Integer.valueOf(mo23884q(aVar, f));
    }
}
