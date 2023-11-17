package p443hc;

/* renamed from: hc.f */
public enum C15476f {
    L(1),
    M(0),
    Q(3),
    H(2);
    

    /* renamed from: i */
    private static final C15476f[] f43903i = null;

    /* renamed from: d */
    private final int f43905d;

    static {
        C15476f fVar;
        C15476f fVar2;
        C15476f fVar3;
        C15476f fVar4;
        f43903i = new C15476f[]{fVar2, fVar, fVar4, fVar3};
    }

    private C15476f(int i) {
        this.f43905d = i;
    }

    /* renamed from: a */
    public static C15476f m55976a(int i) {
        if (i >= 0) {
            C15476f[] fVarArr = f43903i;
            if (i < fVarArr.length) {
                return fVarArr[i];
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public int mo42559b() {
        return this.f43905d;
    }
}
