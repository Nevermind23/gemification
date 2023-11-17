package p326y8;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: y8.q */
abstract class C9127q {

    /* renamed from: y8.q$b */
    private static class C9129b {

        /* renamed from: a */
        private final C9104c f25314a;

        /* renamed from: b */
        private final Set f25315b = new HashSet();

        /* renamed from: c */
        private final Set f25316c = new HashSet();

        C9129b(C9104c cVar) {
            this.f25314a = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo24688a(C9129b bVar) {
            this.f25315b.add(bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo24689b(C9129b bVar) {
            this.f25316c.add(bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C9104c mo24690c() {
            return this.f25314a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Set mo24691d() {
            return this.f25315b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo24692e() {
            return this.f25315b.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo24693f() {
            return this.f25316c.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo24694g(C9129b bVar) {
            this.f25316c.remove(bVar);
        }
    }

    /* renamed from: y8.q$c */
    private static class C9130c {

        /* renamed from: a */
        private final C9102b0 f25317a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean f25318b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C9130c)) {
                return false;
            }
            C9130c cVar = (C9130c) obj;
            if (!cVar.f25317a.equals(this.f25317a) || cVar.f25318b != this.f25318b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f25317a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f25318b).hashCode();
        }

        private C9130c(C9102b0 b0Var, boolean z) {
            this.f25317a = b0Var;
            this.f25318b = z;
        }
    }

    /* renamed from: a */
    static void m33656a(List list) {
        Set<C9129b> c = m33658c(list);
        Set b = m33657b(c);
        int i = 0;
        while (!b.isEmpty()) {
            C9129b bVar = (C9129b) b.iterator().next();
            b.remove(bVar);
            i++;
            for (C9129b bVar2 : bVar.mo24691d()) {
                bVar2.mo24694g(bVar);
                if (bVar2.mo24693f()) {
                    b.add(bVar2);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (C9129b bVar3 : c) {
                if (!bVar3.mo24693f() && !bVar3.mo24692e()) {
                    arrayList.add(bVar3.mo24690c());
                }
            }
            throw new DependencyCycleException(arrayList);
        }
    }

    /* renamed from: b */
    private static Set m33657b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C9129b bVar = (C9129b) it.next();
            if (bVar.mo24693f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    private static Set m33658c(List list) {
        Set<C9129b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9104c cVar = (C9104c) it.next();
            C9129b bVar = new C9129b(cVar);
            Iterator it2 = cVar.mo24655j().iterator();
            while (true) {
                if (it2.hasNext()) {
                    C9102b0 b0Var = (C9102b0) it2.next();
                    C9130c cVar2 = new C9130c(b0Var, !cVar.mo24659p());
                    if (!hashMap.containsKey(cVar2)) {
                        hashMap.put(cVar2, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar2);
                    if (set2.isEmpty() || cVar2.f25318b) {
                        set2.add(bVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{b0Var}));
                    }
                }
            }
        }
        for (Set<C9129b> it3 : hashMap.values()) {
            for (C9129b bVar2 : it3) {
                for (C9131r rVar : bVar2.mo24690c().mo24652g()) {
                    if (rVar.mo24699e() && (set = (Set) hashMap.get(new C9130c(rVar.mo24697c(), rVar.mo24702g()))) != null) {
                        for (C9129b bVar3 : set) {
                            bVar2.mo24688a(bVar3);
                            bVar3.mo24689b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }
}
