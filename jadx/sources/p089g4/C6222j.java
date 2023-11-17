package p089g4;

/* renamed from: g4.j */
public class C6222j {

    /* renamed from: a */
    private Class f19241a;

    /* renamed from: b */
    private Class f19242b;

    /* renamed from: c */
    private Class f19243c;

    public C6222j() {
    }

    /* renamed from: a */
    public void mo19829a(Class cls, Class cls2, Class cls3) {
        this.f19241a = cls;
        this.f19242b = cls2;
        this.f19243c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6222j jVar = (C6222j) obj;
        if (this.f19241a.equals(jVar.f19241a) && this.f19242b.equals(jVar.f19242b) && C6224l.m24735d(this.f19243c, jVar.f19243c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.f19241a.hashCode() * 31) + this.f19242b.hashCode()) * 31;
        Class cls = this.f19243c;
        if (cls != null) {
            i = cls.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f19241a + ", second=" + this.f19242b + '}';
    }

    public C6222j(Class cls, Class cls2, Class cls3) {
        mo19829a(cls, cls2, cls3);
    }
}
