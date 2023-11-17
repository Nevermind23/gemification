package kotlinx.coroutines.internal;

import ef1.C40883y1;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* renamed from: kotlinx.coroutines.internal.s */
public final class C41619s {

    /* renamed from: a */
    public static final C41619s f97827a;

    /* renamed from: b */
    private static final boolean f97828b = C41586b0.m120629e("kotlinx.coroutines.fast.service.loader", true);

    /* renamed from: c */
    public static final C40883y1 f97829c;

    static {
        C41619s sVar = new C41619s();
        f97827a = sVar;
        f97829c = sVar.m120754a();
    }

    private C41619s() {
    }

    /* renamed from: a */
    private final C40883y1 m120754a() {
        List list;
        Object obj;
        C40883y1 e;
        Class<C41618r> cls = C41618r.class;
        try {
            if (f97828b) {
                list = C41600h.f97798a.mo96375c();
            } else {
                list = C40355o.m116850A(C40349m.m116842c(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
            }
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                if (it.hasNext()) {
                    int c = ((C41618r) obj).mo95335c();
                    do {
                        Object next = it.next();
                        int c2 = ((C41618r) next).mo95335c();
                        if (c < c2) {
                            obj = next;
                            c = c2;
                        }
                    } while (it.hasNext());
                }
            }
            C41618r rVar = (C41618r) obj;
            if (rVar == null || (e = C41620t.m120759e(rVar, list)) == null) {
                return C41620t.m120756b((Throwable) null, (String) null, 3, (Object) null);
            }
            return e;
        } catch (Throwable th) {
            return C41620t.m120756b(th, (String) null, 2, (Object) null);
        }
    }
}
