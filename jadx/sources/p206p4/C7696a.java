package p206p4;

/* renamed from: p4.a */
public class C7696a {

    /* renamed from: a */
    private float[] f22366a;

    /* renamed from: b */
    private int[] f22367b;

    /* renamed from: c */
    private int f22368c;

    public C7696a(int[] iArr) {
        this.f22367b = iArr;
        int a = m29234a(iArr);
        this.f22368c = a;
        this.f22366a = new float[a];
    }

    /* renamed from: a */
    private static int m29234a(int[] iArr) {
        int i = 1;
        for (int i2 : iArr) {
            i *= i2;
        }
        return i;
    }

    /* renamed from: b */
    public float[] mo22431b() {
        return this.f22366a;
    }

    /* renamed from: c */
    public int mo22432c(int i) {
        return this.f22367b[i];
    }

    /* renamed from: d */
    public int mo22433d() {
        return this.f22367b.length;
    }

    /* renamed from: e */
    public void mo22434e(int[] iArr) {
        this.f22367b = iArr;
        int a = m29234a(iArr);
        float[] fArr = new float[a];
        System.arraycopy(this.f22366a, 0, fArr, 0, Math.min(this.f22368c, a));
        this.f22366a = fArr;
        this.f22368c = a;
    }
}
