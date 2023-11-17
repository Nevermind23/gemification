package p205p3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: p3.g */
class C7679g {

    /* renamed from: a */
    private final C7680a f22328a = new C7680a();

    /* renamed from: b */
    private final Map f22329b = new HashMap();

    /* renamed from: p3.g$a */
    private static class C7680a {

        /* renamed from: a */
        final Object f22330a;

        /* renamed from: b */
        private List f22331b;

        /* renamed from: c */
        C7680a f22332c;

        /* renamed from: d */
        C7680a f22333d;

        C7680a() {
            this((Object) null);
        }

        /* renamed from: a */
        public void mo22403a(Object obj) {
            if (this.f22331b == null) {
                this.f22331b = new ArrayList();
            }
            this.f22331b.add(obj);
        }

        /* renamed from: b */
        public Object mo22404b() {
            int c = mo22405c();
            if (c > 0) {
                return this.f22331b.remove(c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int mo22405c() {
            List list = this.f22331b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        C7680a(Object obj) {
            this.f22333d = this;
            this.f22332c = this;
            this.f22330a = obj;
        }
    }

    C7679g() {
    }

    /* renamed from: b */
    private void m29154b(C7680a aVar) {
        m29156e(aVar);
        C7680a aVar2 = this.f22328a;
        aVar.f22333d = aVar2;
        aVar.f22332c = aVar2.f22332c;
        m29157g(aVar);
    }

    /* renamed from: c */
    private void m29155c(C7680a aVar) {
        m29156e(aVar);
        C7680a aVar2 = this.f22328a;
        aVar.f22333d = aVar2.f22333d;
        aVar.f22332c = aVar2;
        m29157g(aVar);
    }

    /* renamed from: e */
    private static void m29156e(C7680a aVar) {
        C7680a aVar2 = aVar.f22333d;
        aVar2.f22332c = aVar.f22332c;
        aVar.f22332c.f22333d = aVar2;
    }

    /* renamed from: g */
    private static void m29157g(C7680a aVar) {
        aVar.f22332c.f22333d = aVar;
        aVar.f22333d.f22332c = aVar;
    }

    /* renamed from: a */
    public Object mo22399a(C7690m mVar) {
        C7680a aVar = (C7680a) this.f22329b.get(mVar);
        if (aVar == null) {
            aVar = new C7680a(mVar);
            this.f22329b.put(mVar, aVar);
        } else {
            mVar.mo22408a();
        }
        m29154b(aVar);
        return aVar.mo22404b();
    }

    /* renamed from: d */
    public void mo22400d(C7690m mVar, Object obj) {
        C7680a aVar = (C7680a) this.f22329b.get(mVar);
        if (aVar == null) {
            aVar = new C7680a(mVar);
            m29155c(aVar);
            this.f22329b.put(mVar, aVar);
        } else {
            mVar.mo22408a();
        }
        aVar.mo22403a(obj);
    }

    /* renamed from: f */
    public Object mo22401f() {
        for (C7680a aVar = this.f22328a.f22333d; !aVar.equals(this.f22328a); aVar = aVar.f22333d) {
            Object b = aVar.mo22404b();
            if (b != null) {
                return b;
            }
            m29156e(aVar);
            this.f22329b.remove(aVar.f22330a);
            ((C7690m) aVar.f22330a).mo22408a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        C7680a aVar = this.f22328a.f22332c;
        boolean z = false;
        while (!aVar.equals(this.f22328a)) {
            sb.append('{');
            sb.append(aVar.f22330a);
            sb.append(':');
            sb.append(aVar.mo22405c());
            sb.append("}, ");
            aVar = aVar.f22332c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
