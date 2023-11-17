package q11;

import g11.C32041b;
import g31.C32080b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: q11.e */
public final class C38105e {

    /* renamed from: a */
    private final C32080b f91516a;

    public C38105e(C32080b bVar) {
        C41536l.m120489i(bVar, "isAuthorizedUseCase");
        this.f91516a = bVar;
    }

    /* renamed from: a */
    public final List mo91530a() {
        ArrayList arrayList = new ArrayList();
        if (this.f91516a.mo72555a()) {
            arrayList.add(new C32041b.C32050b.C32052b((List) null, 1, (DefaultConstructorMarker) null));
        }
        arrayList.add(C32041b.C32050b.C32051a.f78890e);
        return C41358y.m120036z0(arrayList);
    }
}
