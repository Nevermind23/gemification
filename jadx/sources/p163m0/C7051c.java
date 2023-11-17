package p163m0;

import af1.C40296c;
import androidx.lifecycle.C1620q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import te1.C42994a;
import ue1.C43075l;

/* renamed from: m0.c */
public final class C7051c {

    /* renamed from: a */
    private final List f20989a = new ArrayList();

    /* renamed from: a */
    public final void mo21272a(C40296c cVar, C43075l lVar) {
        C41536l.m120489i(cVar, "clazz");
        C41536l.m120489i(lVar, "initializer");
        this.f20989a.add(new C7054f(C42994a.m123348a(cVar), lVar));
    }

    /* renamed from: b */
    public final C1620q0.C1624b mo21273b() {
        C7054f[] fVarArr = (C7054f[]) this.f20989a.toArray(new C7054f[0]);
        return new C7050b((C7054f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
