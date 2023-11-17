package p227r;

import java.util.ArrayList;
import java.util.List;

/* renamed from: r.f */
public class C8012f implements C8010d {

    /* renamed from: a */
    public C8010d f23098a = null;

    /* renamed from: b */
    public boolean f23099b = false;

    /* renamed from: c */
    public boolean f23100c = false;

    /* renamed from: d */
    C8026p f23101d;

    /* renamed from: e */
    C8013a f23102e = C8013a.UNKNOWN;

    /* renamed from: f */
    int f23103f;

    /* renamed from: g */
    public int f23104g;

    /* renamed from: h */
    int f23105h = 1;

    /* renamed from: i */
    C8014g f23106i = null;

    /* renamed from: j */
    public boolean f23107j = false;

    /* renamed from: k */
    List f23108k = new ArrayList();

    /* renamed from: l */
    List f23109l = new ArrayList();

    /* renamed from: r.f$a */
    enum C8013a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C8012f(C8026p pVar) {
        this.f23101d = pVar;
    }

    /* renamed from: a */
    public void mo23159a(C8010d dVar) {
        for (C8012f fVar : this.f23109l) {
            if (!fVar.f23107j) {
                return;
            }
        }
        this.f23100c = true;
        C8010d dVar2 = this.f23098a;
        if (dVar2 != null) {
            dVar2.mo23159a(this);
        }
        if (this.f23099b) {
            this.f23101d.mo23159a(this);
            return;
        }
        C8012f fVar2 = null;
        int i = 0;
        for (C8012f fVar3 : this.f23109l) {
            if (!(fVar3 instanceof C8014g)) {
                i++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i == 1 && fVar2.f23107j) {
            C8014g gVar = this.f23106i;
            if (gVar != null) {
                if (gVar.f23107j) {
                    this.f23103f = this.f23105h * gVar.f23104g;
                } else {
                    return;
                }
            }
            mo23177d(fVar2.f23104g + this.f23103f);
        }
        C8010d dVar3 = this.f23098a;
        if (dVar3 != null) {
            dVar3.mo23159a(this);
        }
    }

    /* renamed from: b */
    public void mo23175b(C8010d dVar) {
        this.f23108k.add(dVar);
        if (this.f23107j) {
            dVar.mo23159a(dVar);
        }
    }

    /* renamed from: c */
    public void mo23176c() {
        this.f23109l.clear();
        this.f23108k.clear();
        this.f23107j = false;
        this.f23104g = 0;
        this.f23100c = false;
        this.f23099b = false;
    }

    /* renamed from: d */
    public void mo23177d(int i) {
        if (!this.f23107j) {
            this.f23107j = true;
            this.f23104g = i;
            for (C8010d dVar : this.f23108k) {
                dVar.mo23159a(dVar);
            }
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f23101d.f23152b.mo22676r());
        sb.append(":");
        sb.append(this.f23102e);
        sb.append("(");
        if (this.f23107j) {
            obj = Integer.valueOf(this.f23104g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.f23109l.size());
        sb.append(":d=");
        sb.append(this.f23108k.size());
        sb.append(">");
        return sb.toString();
    }
}
