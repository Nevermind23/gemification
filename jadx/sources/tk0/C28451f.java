package tk0;

import g31.C32080b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pk0.C27551a;

/* renamed from: tk0.f */
public final class C28451f {

    /* renamed from: b */
    public static final C28452a f72254b = new C28452a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C32080b f72255a;

    /* renamed from: tk0.f$a */
    public static final class C28452a {
        private C28452a() {
        }

        public /* synthetic */ C28452a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C28451f(C32080b bVar) {
        C41536l.m120489i(bVar, "isAuthorizedUseCase");
        this.f72255a = bVar;
    }

    /* renamed from: a */
    public final List mo68079a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C27551a.C27570d.C27572b.f70487h);
        if (this.f72255a.mo72555a()) {
            arrayList.addAll(0, C41339p.m119900e(C27551a.C27570d.C27571a.f70486h));
        }
        return C41358y.m120036z0(arrayList);
    }
}
