package p022b4;

import java.util.ArrayList;
import java.util.List;
import p166m3.C7091k;

/* renamed from: b4.f */
public class C2161f {

    /* renamed from: a */
    private final List f6343a = new ArrayList();

    /* renamed from: b4.f$a */
    private static final class C2162a {

        /* renamed from: a */
        private final Class f6344a;

        /* renamed from: b */
        final C7091k f6345b;

        C2162a(Class cls, C7091k kVar) {
            this.f6344a = cls;
            this.f6345b = kVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo7044a(Class cls) {
            return this.f6344a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized void mo7042a(Class cls, C7091k kVar) {
        this.f6343a.add(new C2162a(cls, kVar));
    }

    /* renamed from: b */
    public synchronized C7091k mo7043b(Class cls) {
        int size = this.f6343a.size();
        for (int i = 0; i < size; i++) {
            C2162a aVar = (C2162a) this.f6343a.get(i);
            if (aVar.mo7044a(cls)) {
                return aVar.f6345b;
            }
        }
        return null;
    }
}
