package p268u1;

import java.util.List;
import p061e2.C6013a;
import p319y1.C9012d;

/* renamed from: u1.e */
public class C8536e extends C8538g {

    /* renamed from: i */
    private final C9012d f24250i;

    public C8536e(List list) {
        super(list);
        int i = 0;
        C9012d dVar = (C9012d) ((C6013a) list.get(0)).f18759b;
        i = dVar != null ? dVar.mo24424e() : i;
        this.f24250i = new C9012d(new float[i], new int[i]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C9012d mo23857i(C6013a aVar, float f) {
        this.f24250i.mo24425f((C9012d) aVar.f18759b, (C9012d) aVar.f18760c, f);
        return this.f24250i;
    }
}
