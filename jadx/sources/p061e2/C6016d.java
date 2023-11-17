package p061e2;

/* renamed from: e2.d */
public class C6016d {

    /* renamed from: a */
    private float f18784a;

    /* renamed from: b */
    private float f18785b;

    public C6016d(float f, float f2) {
        this.f18784a = f;
        this.f18785b = f2;
    }

    /* renamed from: a */
    public boolean mo19506a(float f, float f2) {
        return this.f18784a == f && this.f18785b == f2;
    }

    /* renamed from: b */
    public float mo19507b() {
        return this.f18784a;
    }

    /* renamed from: c */
    public float mo19508c() {
        return this.f18785b;
    }

    /* renamed from: d */
    public void mo19509d(float f, float f2) {
        this.f18784a = f;
        this.f18785b = f2;
    }

    public String toString() {
        return mo19507b() + "x" + mo19508c();
    }

    public C6016d() {
        this(1.0f, 1.0f);
    }
}
