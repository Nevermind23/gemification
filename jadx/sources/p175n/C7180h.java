package p175n;

import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;
import java.util.Comparator;
import p175n.C7171b;

/* renamed from: n.h */
public class C7180h extends C7171b {

    /* renamed from: g */
    private int f21275g = 128;

    /* renamed from: h */
    private C7183i[] f21276h = new C7183i[128];

    /* renamed from: i */
    private C7183i[] f21277i = new C7183i[128];

    /* renamed from: j */
    private int f21278j = 0;

    /* renamed from: k */
    C7182b f21279k = new C7182b(this);

    /* renamed from: l */
    C7173c f21280l;

    /* renamed from: n.h$a */
    class C7181a implements Comparator {
        C7181a() {
        }

        /* renamed from: a */
        public int compare(C7183i iVar, C7183i iVar2) {
            return iVar.f21288f - iVar2.f21288f;
        }
    }

    /* renamed from: n.h$b */
    class C7182b {

        /* renamed from: a */
        C7183i f21282a;

        /* renamed from: b */
        C7180h f21283b;

        public C7182b(C7180h hVar) {
            this.f21283b = hVar;
        }

        /* renamed from: a */
        public boolean mo21500a(C7183i iVar, float f) {
            boolean z = true;
            if (this.f21282a.f21286d) {
                for (int i = 0; i < 9; i++) {
                    float[] fArr = this.f21282a.f21294l;
                    float f2 = fArr[i] + (iVar.f21294l[i] * f);
                    fArr[i] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        this.f21282a.f21294l[i] = 0.0f;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    C7180h.this.m27648G(this.f21282a);
                }
                return false;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float f3 = iVar.f21294l[i2];
                if (f3 != Utils.FLOAT_EPSILON) {
                    float f4 = f3 * f;
                    if (Math.abs(f4) < 1.0E-4f) {
                        f4 = 0.0f;
                    }
                    this.f21282a.f21294l[i2] = f4;
                } else {
                    this.f21282a.f21294l[i2] = 0.0f;
                }
            }
            return true;
        }

        /* renamed from: b */
        public void mo21501b(C7183i iVar) {
            this.f21282a = iVar;
        }

        /* renamed from: c */
        public final boolean mo21502c() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f21282a.f21294l[i];
                if (f > Utils.FLOAT_EPSILON) {
                    return false;
                }
                if (f < Utils.FLOAT_EPSILON) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final boolean mo21503d(C7183i iVar) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = iVar.f21294l[i];
                float f2 = this.f21282a.f21294l[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public void mo21504e() {
            Arrays.fill(this.f21282a.f21294l, Utils.FLOAT_EPSILON);
        }

        public String toString() {
            String str = "[ ";
            if (this.f21282a != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f21282a.f21294l[i] + " ";
                }
            }
            return str + "] " + this.f21282a;
        }
    }

    public C7180h(C7173c cVar) {
        super(cVar);
        this.f21280l = cVar;
    }

    /* renamed from: F */
    private final void m27647F(C7183i iVar) {
        int i;
        int i2 = this.f21278j + 1;
        C7183i[] iVarArr = this.f21276h;
        if (i2 > iVarArr.length) {
            C7183i[] iVarArr2 = (C7183i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f21276h = iVarArr2;
            this.f21277i = (C7183i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        C7183i[] iVarArr3 = this.f21276h;
        int i3 = this.f21278j;
        iVarArr3[i3] = iVar;
        int i4 = i3 + 1;
        this.f21278j = i4;
        if (i4 > 1 && iVarArr3[i4 - 1].f21288f > iVar.f21288f) {
            int i5 = 0;
            while (true) {
                i = this.f21278j;
                if (i5 >= i) {
                    break;
                }
                this.f21277i[i5] = this.f21276h[i5];
                i5++;
            }
            Arrays.sort(this.f21277i, 0, i, new C7181a());
            for (int i6 = 0; i6 < this.f21278j; i6++) {
                this.f21276h[i6] = this.f21277i[i6];
            }
        }
        iVar.f21286d = true;
        iVar.mo21506a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public final void m27648G(C7183i iVar) {
        int i = 0;
        while (i < this.f21278j) {
            if (this.f21276h[i] == iVar) {
                while (true) {
                    int i2 = this.f21278j;
                    if (i < i2 - 1) {
                        C7183i[] iVarArr = this.f21276h;
                        int i3 = i + 1;
                        iVarArr[i] = iVarArr[i3];
                        i = i3;
                    } else {
                        this.f21278j = i2 - 1;
                        iVar.f21286d = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    /* renamed from: B */
    public void mo21442B(C7174d dVar, C7171b bVar, boolean z) {
        C7183i iVar = bVar.f21237a;
        if (iVar != null) {
            C7171b.C7172a aVar = bVar.f21241e;
            int f = aVar.mo21434f();
            for (int i = 0; i < f; i++) {
                C7183i d = aVar.mo21432d(i);
                float h = aVar.mo21436h(i);
                this.f21279k.mo21501b(d);
                if (this.f21279k.mo21500a(iVar, h)) {
                    m27647F(d);
                }
                this.f21238b += bVar.f21238b * h;
            }
            m27648G(iVar);
        }
    }

    /* renamed from: a */
    public void mo21445a(C7183i iVar) {
        this.f21279k.mo21501b(iVar);
        this.f21279k.mo21504e();
        iVar.f21294l[iVar.f21290h] = 1.0f;
        m27647F(iVar);
    }

    /* renamed from: c */
    public C7183i mo21447c(C7174d dVar, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f21278j; i2++) {
            C7183i iVar = this.f21276h[i2];
            if (!zArr[iVar.f21288f]) {
                this.f21279k.mo21501b(iVar);
                if (i == -1) {
                    if (!this.f21279k.mo21502c()) {
                    }
                } else if (!this.f21279k.mo21503d(this.f21276h[i])) {
                }
                i = i2;
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f21276h[i];
    }

    public void clear() {
        this.f21278j = 0;
        this.f21238b = Utils.FLOAT_EPSILON;
    }

    public boolean isEmpty() {
        return this.f21278j == 0;
    }

    public String toString() {
        String str = "" + " goal -> (" + this.f21238b + ") : ";
        for (int i = 0; i < this.f21278j; i++) {
            this.f21279k.mo21501b(this.f21276h[i]);
            str = str + this.f21279k + " ";
        }
        return str;
    }
}
