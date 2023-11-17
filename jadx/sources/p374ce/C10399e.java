package p374ce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: ce.e */
public abstract class C10399e {

    /* renamed from: ce.e$a */
    class C10400a implements C10410k {

        /* renamed from: a */
        final /* synthetic */ int f29608a;

        C10400a(int i) {
            this.f29608a = i;
        }

        /* renamed from: a */
        public boolean mo27069a(C10396b bVar) {
            return bVar.mo27062e() <= this.f29608a;
        }
    }

    /* renamed from: ce.e$b */
    class C10401b implements C10410k {

        /* renamed from: a */
        final /* synthetic */ int f29609a;

        C10401b(int i) {
            this.f29609a = i;
        }

        /* renamed from: a */
        public boolean mo27069a(C10396b bVar) {
            return bVar.mo27062e() >= this.f29609a;
        }
    }

    /* renamed from: ce.e$c */
    class C10402c implements C10410k {

        /* renamed from: a */
        final /* synthetic */ int f29610a;

        C10402c(int i) {
            this.f29610a = i;
        }

        /* renamed from: a */
        public boolean mo27069a(C10396b bVar) {
            return bVar.mo27060c() <= this.f29610a;
        }
    }

    /* renamed from: ce.e$d */
    class C10403d implements C10410k {

        /* renamed from: a */
        final /* synthetic */ int f29611a;

        C10403d(int i) {
            this.f29611a = i;
        }

        /* renamed from: a */
        public boolean mo27069a(C10396b bVar) {
            return bVar.mo27060c() >= this.f29611a;
        }
    }

    /* renamed from: ce.e$e */
    class C10404e implements C10410k {

        /* renamed from: a */
        final /* synthetic */ float f29612a;

        /* renamed from: b */
        final /* synthetic */ float f29613b;

        C10404e(float f, float f2) {
            this.f29612a = f;
            this.f29613b = f2;
        }

        /* renamed from: a */
        public boolean mo27069a(C10396b bVar) {
            float j = C10395a.m37800f(bVar.mo27062e(), bVar.mo27060c()).mo27056j();
            float f = this.f29612a;
            float f2 = this.f29613b;
            if (j < f - f2 || j > f + f2) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: ce.e$f */
    class C10405f implements C10397c {
        C10405f() {
        }

        /* renamed from: a */
        public List mo27066a(List list) {
            Collections.sort(list);
            Collections.reverse(list);
            return list;
        }
    }

    /* renamed from: ce.e$g */
    class C10406g implements C10397c {
        C10406g() {
        }

        /* renamed from: a */
        public List mo27066a(List list) {
            Collections.sort(list);
            return list;
        }
    }

    /* renamed from: ce.e$h */
    class C10407h implements C10410k {

        /* renamed from: a */
        final /* synthetic */ int f29614a;

        C10407h(int i) {
            this.f29614a = i;
        }

        /* renamed from: a */
        public boolean mo27069a(C10396b bVar) {
            return bVar.mo27060c() * bVar.mo27062e() <= this.f29614a;
        }
    }

    /* renamed from: ce.e$i */
    class C10408i implements C10410k {

        /* renamed from: a */
        final /* synthetic */ int f29615a;

        C10408i(int i) {
            this.f29615a = i;
        }

        /* renamed from: a */
        public boolean mo27069a(C10396b bVar) {
            return bVar.mo27060c() * bVar.mo27062e() >= this.f29615a;
        }
    }

    /* renamed from: ce.e$j */
    private static class C10409j implements C10397c {

        /* renamed from: a */
        private C10397c[] f29616a;

        /* synthetic */ C10409j(C10397c[] cVarArr, C10400a aVar) {
            this(cVarArr);
        }

        /* renamed from: a */
        public List mo27066a(List list) {
            for (C10397c a : this.f29616a) {
                list = a.mo27066a(list);
            }
            return list;
        }

        private C10409j(C10397c... cVarArr) {
            this.f29616a = cVarArr;
        }
    }

    /* renamed from: ce.e$k */
    public interface C10410k {
        /* renamed from: a */
        boolean mo27069a(C10396b bVar);
    }

    /* renamed from: ce.e$l */
    private static class C10411l implements C10397c {

        /* renamed from: a */
        private C10410k f29617a;

        /* synthetic */ C10411l(C10410k kVar, C10400a aVar) {
            this(kVar);
        }

        /* renamed from: a */
        public List mo27066a(List list) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C10396b bVar = (C10396b) it.next();
                if (this.f29617a.mo27069a(bVar)) {
                    arrayList.add(bVar);
                }
            }
            return arrayList;
        }

        private C10411l(C10410k kVar) {
            this.f29617a = kVar;
        }
    }

    /* renamed from: ce.e$m */
    private static class C10412m implements C10397c {

        /* renamed from: a */
        private C10397c[] f29618a;

        /* synthetic */ C10412m(C10397c[] cVarArr, C10400a aVar) {
            this(cVarArr);
        }

        /* renamed from: a */
        public List mo27066a(List list) {
            List list2 = null;
            for (C10397c a : this.f29618a) {
                list2 = a.mo27066a(list);
                if (!list2.isEmpty()) {
                    break;
                }
            }
            if (list2 == null) {
                return new ArrayList();
            }
            return list2;
        }

        private C10412m(C10397c... cVarArr) {
            this.f29618a = cVarArr;
        }
    }

    /* renamed from: a */
    public static C10397c m37814a(C10397c... cVarArr) {
        return new C10409j(cVarArr, (C10400a) null);
    }

    /* renamed from: b */
    public static C10397c m37815b(C10395a aVar, float f) {
        return m37825l(new C10404e(aVar.mo27056j(), f));
    }

    /* renamed from: c */
    public static C10397c m37816c() {
        return new C10405f();
    }

    /* renamed from: d */
    public static C10397c m37817d(int i) {
        return m37825l(new C10407h(i));
    }

    /* renamed from: e */
    public static C10397c m37818e(int i) {
        return m37825l(new C10402c(i));
    }

    /* renamed from: f */
    public static C10397c m37819f(int i) {
        return m37825l(new C10400a(i));
    }

    /* renamed from: g */
    public static C10397c m37820g(int i) {
        return m37825l(new C10408i(i));
    }

    /* renamed from: h */
    public static C10397c m37821h(int i) {
        return m37825l(new C10403d(i));
    }

    /* renamed from: i */
    public static C10397c m37822i(int i) {
        return m37825l(new C10401b(i));
    }

    /* renamed from: j */
    public static C10397c m37823j(C10397c... cVarArr) {
        return new C10412m(cVarArr, (C10400a) null);
    }

    /* renamed from: k */
    public static C10397c m37824k() {
        return new C10406g();
    }

    /* renamed from: l */
    public static C10397c m37825l(C10410k kVar) {
        return new C10411l(kVar, (C10400a) null);
    }
}
