package jg1;

import java.util.ArrayList;
import java.util.List;

/* renamed from: jg1.i */
final class C41449i {

    /* renamed from: d */
    private static final List f97559d = new ArrayList();

    /* renamed from: a */
    Object f97560a;

    /* renamed from: b */
    C41457p f97561b;

    /* renamed from: c */
    C41449i f97562c;

    private C41449i(Object obj, C41457p pVar) {
        this.f97560a = obj;
        this.f97561b = pVar;
    }

    /* renamed from: a */
    static C41449i m120266a(C41457p pVar, Object obj) {
        List list = f97559d;
        synchronized (list) {
            int size = list.size();
            if (size <= 0) {
                return new C41449i(obj, pVar);
            }
            C41449i iVar = (C41449i) list.remove(size - 1);
            iVar.f97560a = obj;
            iVar.f97561b = pVar;
            iVar.f97562c = null;
            return iVar;
        }
    }

    /* renamed from: b */
    static void m120267b(C41449i iVar) {
        iVar.f97560a = null;
        iVar.f97561b = null;
        iVar.f97562c = null;
        List list = f97559d;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(iVar);
            }
        }
    }
}
