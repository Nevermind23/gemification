package p268u1;

import java.util.List;
import p048d2.C5807i;
import p061e2.C6013a;
import p061e2.C6015c;
import p061e2.C6016d;

/* renamed from: u1.l */
public class C8543l extends C8538g {

    /* renamed from: i */
    private final C6016d f24261i = new C6016d();

    public C8543l(List list) {
        super(list);
    }

    /* renamed from: p */
    public C6016d mo23857i(C6013a aVar, float f) {
        Object obj;
        Object obj2 = aVar.f18759b;
        if (obj2 == null || (obj = aVar.f18760c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C6016d dVar = (C6016d) obj2;
        C6016d dVar2 = (C6016d) obj;
        C6015c cVar = this.f24231e;
        if (cVar != null) {
            C6016d dVar3 = (C6016d) cVar.mo19504b(aVar.f18764g, aVar.f18765h.floatValue(), dVar, dVar2, f, mo23854e(), mo23855f());
            if (dVar3 != null) {
                return dVar3;
            }
        }
        this.f24261i.mo19509d(C5807i.m23370i(dVar.mo19507b(), dVar2.mo19507b(), f), C5807i.m23370i(dVar.mo19508c(), dVar2.mo19508c(), f));
        return this.f24261i;
    }
}
