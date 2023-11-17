package p096gb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p070eb.C6125a;
import p070eb.C6126b;

/* renamed from: gb.a */
public class C6404a {

    /* renamed from: a */
    private final C6125a f19654a;

    /* renamed from: b */
    private final int f19655b;

    /* renamed from: c */
    private Set f19656c;

    /* renamed from: d */
    private List f19657d;

    /* renamed from: gb.a$a */
    public interface C6405a {
        /* renamed from: b */
        C6126b mo7134b();
    }

    public C6404a(double d, double d2, double d3, double d4) {
        this(new C6125a(d, d2, d3, d4));
    }

    /* renamed from: b */
    private void m25452b(double d, double d2, C6405a aVar) {
        List list = this.f19657d;
        if (list != null) {
            C6125a aVar2 = this.f19654a;
            if (d2 < aVar2.f19064f) {
                if (d < aVar2.f19063e) {
                    ((C6404a) list.get(0)).m25452b(d, d2, aVar);
                } else {
                    ((C6404a) list.get(1)).m25452b(d, d2, aVar);
                }
            } else if (d < aVar2.f19063e) {
                ((C6404a) list.get(2)).m25452b(d, d2, aVar);
            } else {
                ((C6404a) list.get(3)).m25452b(d, d2, aVar);
            }
        } else {
            if (this.f19656c == null) {
                this.f19656c = new LinkedHashSet();
            }
            this.f19656c.add(aVar);
            if (this.f19656c.size() > 50 && this.f19655b < 40) {
                m25455g();
            }
        }
    }

    /* renamed from: c */
    private boolean m25453c(double d, double d2, C6405a aVar) {
        List list = this.f19657d;
        if (list != null) {
            C6125a aVar2 = this.f19654a;
            if (d2 < aVar2.f19064f) {
                if (d < aVar2.f19063e) {
                    return ((C6404a) list.get(0)).m25453c(d, d2, aVar);
                }
                return ((C6404a) list.get(1)).m25453c(d, d2, aVar);
            } else if (d < aVar2.f19063e) {
                return ((C6404a) list.get(2)).m25453c(d, d2, aVar);
            } else {
                return ((C6404a) list.get(3)).m25453c(d, d2, aVar);
            }
        } else {
            Set set = this.f19656c;
            if (set == null) {
                return false;
            }
            return set.remove(aVar);
        }
    }

    /* renamed from: f */
    private void m25454f(C6125a aVar, Collection collection) {
        if (this.f19654a.mo19687e(aVar)) {
            List<C6404a> list = this.f19657d;
            if (list != null) {
                for (C6404a f : list) {
                    f.m25454f(aVar, collection);
                }
            } else if (this.f19656c == null) {
            } else {
                if (aVar.mo19684b(this.f19654a)) {
                    collection.addAll(this.f19656c);
                    return;
                }
                for (C6405a aVar2 : this.f19656c) {
                    if (aVar.mo19685c(aVar2.mo7134b())) {
                        collection.add(aVar2);
                    }
                }
            }
        }
    }

    /* renamed from: g */
    private void m25455g() {
        ArrayList arrayList = new ArrayList(4);
        this.f19657d = arrayList;
        C6125a aVar = this.f19654a;
        arrayList.add(new C6404a(aVar.f19059a, aVar.f19063e, aVar.f19060b, aVar.f19064f, this.f19655b + 1));
        List list = this.f19657d;
        C6125a aVar2 = this.f19654a;
        list.add(new C6404a(aVar2.f19063e, aVar2.f19061c, aVar2.f19060b, aVar2.f19064f, this.f19655b + 1));
        List list2 = this.f19657d;
        C6125a aVar3 = this.f19654a;
        list2.add(new C6404a(aVar3.f19059a, aVar3.f19063e, aVar3.f19064f, aVar3.f19062d, this.f19655b + 1));
        List list3 = this.f19657d;
        C6125a aVar4 = this.f19654a;
        list3.add(new C6404a(aVar4.f19063e, aVar4.f19061c, aVar4.f19064f, aVar4.f19062d, this.f19655b + 1));
        Set<C6405a> set = this.f19656c;
        this.f19656c = null;
        for (C6405a aVar5 : set) {
            m25452b(aVar5.mo7134b().f19065a, aVar5.mo7134b().f19066b, aVar5);
        }
    }

    /* renamed from: a */
    public void mo20287a(C6405a aVar) {
        C6126b b = aVar.mo7134b();
        if (this.f19654a.mo19683a(b.f19065a, b.f19066b)) {
            m25452b(b.f19065a, b.f19066b, aVar);
        }
    }

    /* renamed from: d */
    public boolean mo20288d(C6405a aVar) {
        C6126b b = aVar.mo7134b();
        if (!this.f19654a.mo19683a(b.f19065a, b.f19066b)) {
            return false;
        }
        return m25453c(b.f19065a, b.f19066b, aVar);
    }

    /* renamed from: e */
    public Collection mo20289e(C6125a aVar) {
        ArrayList arrayList = new ArrayList();
        m25454f(aVar, arrayList);
        return arrayList;
    }

    public C6404a(C6125a aVar) {
        this(aVar, 0);
    }

    private C6404a(double d, double d2, double d3, double d4, int i) {
        this(new C6125a(d, d2, d3, d4), i);
    }

    private C6404a(C6125a aVar, int i) {
        this.f19657d = null;
        this.f19654a = aVar;
        this.f19655b = i;
    }
}
