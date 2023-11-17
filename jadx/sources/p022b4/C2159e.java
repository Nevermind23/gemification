package p022b4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p166m3.C7090j;

/* renamed from: b4.e */
public class C2159e {

    /* renamed from: a */
    private final List f6338a = new ArrayList();

    /* renamed from: b */
    private final Map f6339b = new HashMap();

    /* renamed from: b4.e$a */
    private static class C2160a {

        /* renamed from: a */
        private final Class f6340a;

        /* renamed from: b */
        final Class f6341b;

        /* renamed from: c */
        final C7090j f6342c;

        public C2160a(Class cls, Class cls2, C7090j jVar) {
            this.f6340a = cls;
            this.f6341b = cls2;
            this.f6342c = jVar;
        }

        /* renamed from: a */
        public boolean mo7041a(Class cls, Class cls2) {
            if (!this.f6340a.isAssignableFrom(cls) || !cls2.isAssignableFrom(this.f6341b)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: c */
    private synchronized List m8273c(String str) {
        List list;
        if (!this.f6338a.contains(str)) {
            this.f6338a.add(str);
        }
        list = (List) this.f6339b.get(str);
        if (list == null) {
            list = new ArrayList();
            this.f6339b.put(str, list);
        }
        return list;
    }

    /* renamed from: a */
    public synchronized void mo7037a(String str, C7090j jVar, Class cls, Class cls2) {
        m8273c(str).add(new C2160a(cls, cls2, jVar));
    }

    /* renamed from: b */
    public synchronized List mo7038b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f6338a) {
            List<C2160a> list = (List) this.f6339b.get(str);
            if (list != null) {
                for (C2160a aVar : list) {
                    if (aVar.mo7041a(cls, cls2)) {
                        arrayList.add(aVar.f6342c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized List mo7039d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f6338a) {
            List<C2160a> list = (List) this.f6339b.get(str);
            if (list != null) {
                for (C2160a aVar : list) {
                    if (aVar.mo7041a(cls, cls2) && !arrayList.contains(aVar.f6341b)) {
                        arrayList.add(aVar.f6341b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized void mo7040e(List list) {
        ArrayList<String> arrayList = new ArrayList<>(this.f6338a);
        this.f6338a.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f6338a.add((String) it.next());
        }
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f6338a.add(str);
            }
        }
    }
}
