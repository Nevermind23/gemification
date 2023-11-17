package p227r;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p175n.C7174d;
import p214q.C7801b;
import p214q.C7806e;
import p214q.C7809f;

/* renamed from: r.o */
public class C8024o {

    /* renamed from: g */
    static int f23136g;

    /* renamed from: a */
    ArrayList f23137a = new ArrayList();

    /* renamed from: b */
    int f23138b;

    /* renamed from: c */
    boolean f23139c = false;

    /* renamed from: d */
    int f23140d;

    /* renamed from: e */
    ArrayList f23141e = null;

    /* renamed from: f */
    private int f23142f = -1;

    /* renamed from: r.o$a */
    class C8025a {

        /* renamed from: a */
        WeakReference f23143a;

        /* renamed from: b */
        int f23144b;

        /* renamed from: c */
        int f23145c;

        /* renamed from: d */
        int f23146d;

        /* renamed from: e */
        int f23147e;

        /* renamed from: f */
        int f23148f;

        /* renamed from: g */
        int f23149g;

        public C8025a(C7806e eVar, C7174d dVar, int i) {
            this.f23143a = new WeakReference(eVar);
            this.f23144b = dVar.mo21494y(eVar.f22600O);
            this.f23145c = dVar.mo21494y(eVar.f22601P);
            this.f23146d = dVar.mo21494y(eVar.f22602Q);
            this.f23147e = dVar.mo21494y(eVar.f22603R);
            this.f23148f = dVar.mo21494y(eVar.f22604S);
            this.f23149g = i;
        }
    }

    public C8024o(int i) {
        int i2 = f23136g;
        f23136g = i2 + 1;
        this.f23138b = i2;
        this.f23140d = i;
    }

    /* renamed from: e */
    private String m30481e() {
        int i = this.f23140d;
        return i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown";
    }

    /* renamed from: j */
    private int m30482j(C7174d dVar, ArrayList arrayList, int i) {
        int y;
        int y2;
        C7809f fVar = (C7809f) ((C7806e) arrayList.get(0)).mo22605I();
        dVar.mo21475E();
        fVar.mo22554g(dVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C7806e) arrayList.get(i2)).mo22554g(dVar, false);
        }
        if (i == 0 && fVar.f22681W0 > 0) {
            C7801b.m29529b(fVar, dVar, arrayList, 0);
        }
        if (i == 1 && fVar.f22682X0 > 0) {
            C7801b.m29529b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.mo21473A();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f23141e = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f23141e.add(new C8025a((C7806e) arrayList.get(i3), dVar, i));
        }
        if (i == 0) {
            y = dVar.mo21494y(fVar.f22600O);
            y2 = dVar.mo21494y(fVar.f22602Q);
            dVar.mo21475E();
        } else {
            y = dVar.mo21494y(fVar.f22601P);
            y2 = dVar.mo21494y(fVar.f22603R);
            dVar.mo21475E();
        }
        return y2 - y;
    }

    /* renamed from: a */
    public boolean mo23185a(C7806e eVar) {
        if (this.f23137a.contains(eVar)) {
            return false;
        }
        this.f23137a.add(eVar);
        return true;
    }

    /* renamed from: b */
    public void mo23186b(ArrayList arrayList) {
        int size = this.f23137a.size();
        if (this.f23142f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C8024o oVar = (C8024o) arrayList.get(i);
                if (this.f23142f == oVar.f23138b) {
                    mo23190g(this.f23140d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: c */
    public int mo23187c() {
        return this.f23138b;
    }

    /* renamed from: d */
    public int mo23188d() {
        return this.f23140d;
    }

    /* renamed from: f */
    public int mo23189f(C7174d dVar, int i) {
        if (this.f23137a.size() == 0) {
            return 0;
        }
        return m30482j(dVar, this.f23137a, i);
    }

    /* renamed from: g */
    public void mo23190g(int i, C8024o oVar) {
        Iterator it = this.f23137a.iterator();
        while (it.hasNext()) {
            C7806e eVar = (C7806e) it.next();
            oVar.mo23185a(eVar);
            if (i == 0) {
                eVar.f22593I0 = oVar.mo23187c();
            } else {
                eVar.f22595J0 = oVar.mo23187c();
            }
        }
        this.f23142f = oVar.f23138b;
    }

    /* renamed from: h */
    public void mo23191h(boolean z) {
        this.f23139c = z;
    }

    /* renamed from: i */
    public void mo23192i(int i) {
        this.f23140d = i;
    }

    public String toString() {
        String str = m30481e() + " [" + this.f23138b + "] <";
        Iterator it = this.f23137a.iterator();
        while (it.hasNext()) {
            str = str + " " + ((C7806e) it.next()).mo22676r();
        }
        return str + " >";
    }
}
