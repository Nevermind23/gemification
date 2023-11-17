package p175n;

import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: n.i */
public class C7183i implements Comparable {

    /* renamed from: u */
    private static int f21285u = 1;

    /* renamed from: d */
    public boolean f21286d;

    /* renamed from: e */
    private String f21287e;

    /* renamed from: f */
    public int f21288f = -1;

    /* renamed from: g */
    int f21289g = -1;

    /* renamed from: h */
    public int f21290h = 0;

    /* renamed from: i */
    public float f21291i;

    /* renamed from: j */
    public boolean f21292j = false;

    /* renamed from: k */
    float[] f21293k = new float[9];

    /* renamed from: l */
    float[] f21294l = new float[9];

    /* renamed from: m */
    C7184a f21295m;

    /* renamed from: n */
    C7171b[] f21296n = new C7171b[16];

    /* renamed from: o */
    int f21297o = 0;

    /* renamed from: p */
    public int f21298p = 0;

    /* renamed from: q */
    boolean f21299q = false;

    /* renamed from: r */
    int f21300r = -1;

    /* renamed from: s */
    float f21301s = Utils.FLOAT_EPSILON;

    /* renamed from: t */
    HashSet f21302t = null;

    /* renamed from: n.i$a */
    public enum C7184a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C7183i(C7184a aVar, String str) {
        this.f21295m = aVar;
    }

    /* renamed from: c */
    static void m27658c() {
        f21285u++;
    }

    /* renamed from: a */
    public final void mo21506a(C7171b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f21297o;
            if (i >= i2) {
                C7171b[] bVarArr = this.f21296n;
                if (i2 >= bVarArr.length) {
                    this.f21296n = (C7171b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C7171b[] bVarArr2 = this.f21296n;
                int i3 = this.f21297o;
                bVarArr2[i3] = bVar;
                this.f21297o = i3 + 1;
                return;
            } else if (this.f21296n[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public int compareTo(C7183i iVar) {
        return this.f21288f - iVar.f21288f;
    }

    /* renamed from: e */
    public final void mo21509e(C7171b bVar) {
        int i = this.f21297o;
        int i2 = 0;
        while (i2 < i) {
            if (this.f21296n[i2] == bVar) {
                while (i2 < i - 1) {
                    C7171b[] bVarArr = this.f21296n;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.f21297o--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: f */
    public void mo21510f() {
        this.f21287e = null;
        this.f21295m = C7184a.UNKNOWN;
        this.f21290h = 0;
        this.f21288f = -1;
        this.f21289g = -1;
        this.f21291i = Utils.FLOAT_EPSILON;
        this.f21292j = false;
        this.f21299q = false;
        this.f21300r = -1;
        this.f21301s = Utils.FLOAT_EPSILON;
        int i = this.f21297o;
        for (int i2 = 0; i2 < i; i2++) {
            this.f21296n[i2] = null;
        }
        this.f21297o = 0;
        this.f21298p = 0;
        this.f21286d = false;
        Arrays.fill(this.f21294l, Utils.FLOAT_EPSILON);
    }

    /* renamed from: g */
    public void mo21511g(C7174d dVar, float f) {
        this.f21291i = f;
        this.f21292j = true;
        this.f21299q = false;
        this.f21300r = -1;
        this.f21301s = Utils.FLOAT_EPSILON;
        int i = this.f21297o;
        this.f21289g = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f21296n[i2].mo21441A(dVar, this, false);
        }
        this.f21297o = 0;
    }

    /* renamed from: h */
    public void mo21512h(C7184a aVar, String str) {
        this.f21295m = aVar;
    }

    /* renamed from: j */
    public final void mo21513j(C7174d dVar, C7171b bVar) {
        int i = this.f21297o;
        for (int i2 = 0; i2 < i; i2++) {
            this.f21296n[i2].mo21442B(dVar, bVar, false);
        }
        this.f21297o = 0;
    }

    public String toString() {
        if (this.f21287e != null) {
            return "" + this.f21287e;
        }
        return "" + this.f21288f;
    }
}
