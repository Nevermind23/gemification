package com.google.protobuf;

import com.google.protobuf.C5689i1;
import java.util.Arrays;

/* renamed from: com.google.protobuf.c1 */
public final class C5639c1 {

    /* renamed from: f */
    private static final C5639c1 f17839f = new C5639c1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f17840a;

    /* renamed from: b */
    private int[] f17841b;

    /* renamed from: c */
    private Object[] f17842c;

    /* renamed from: d */
    private int f17843d = -1;

    /* renamed from: e */
    private boolean f17844e;

    private C5639c1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f17840a = i;
        this.f17841b = iArr;
        this.f17842c = objArr;
        this.f17844e = z;
    }

    /* renamed from: b */
    private void m22475b(int i) {
        int[] iArr = this.f17841b;
        if (i > iArr.length) {
            int i2 = this.f17840a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f17841b = Arrays.copyOf(iArr, i);
            this.f17842c = Arrays.copyOf(this.f17842c, i);
        }
    }

    /* renamed from: c */
    public static C5639c1 m22476c() {
        return f17839f;
    }

    /* renamed from: f */
    private static int m22477f(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* renamed from: g */
    private static int m22478g(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    /* renamed from: j */
    static C5639c1 m22479j(C5639c1 c1Var, C5639c1 c1Var2) {
        int i = c1Var.f17840a + c1Var2.f17840a;
        int[] copyOf = Arrays.copyOf(c1Var.f17841b, i);
        System.arraycopy(c1Var2.f17841b, 0, copyOf, c1Var.f17840a, c1Var2.f17840a);
        Object[] copyOf2 = Arrays.copyOf(c1Var.f17842c, i);
        System.arraycopy(c1Var2.f17842c, 0, copyOf2, c1Var.f17840a, c1Var2.f17840a);
        return new C5639c1(i, copyOf, copyOf2, true);
    }

    /* renamed from: k */
    private static boolean m22480k(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    private static boolean m22481m(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    private static void m22482o(int i, Object obj, C5689i1 i1Var) {
        int a = C5679h1.m22752a(i);
        int b = C5679h1.m22753b(i);
        if (b == 0) {
            i1Var.mo18703z(a, ((Long) obj).longValue());
        } else if (b == 1) {
            i1Var.mo18701x(a, ((Long) obj).longValue());
        } else if (b == 2) {
            i1Var.mo18687j(a, (C5648f) obj);
        } else if (b != 3) {
            if (b == 5) {
                i1Var.mo18681d(a, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(InvalidProtocolBufferException.m22427a());
        } else if (i1Var.mo18702y() == C5689i1.C5690a.ASCENDING) {
            i1Var.mo18665C(a);
            ((C5639c1) obj).mo18570p(i1Var);
            i1Var.mo18671I(a);
        } else {
            i1Var.mo18671I(a);
            ((C5639c1) obj).mo18570p(i1Var);
            i1Var.mo18665C(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18561a() {
        if (!this.f17844e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: d */
    public int mo18562d() {
        int i;
        int i2 = this.f17843d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f17840a; i4++) {
            int i5 = this.f17841b[i4];
            int a = C5679h1.m22752a(i5);
            int b = C5679h1.m22753b(i5);
            if (b == 0) {
                i = CodedOutputStream.m22322R(a, ((Long) this.f17842c[i4]).longValue());
            } else if (b == 1) {
                i = CodedOutputStream.m22340o(a, ((Long) this.f17842c[i4]).longValue());
            } else if (b == 2) {
                i = CodedOutputStream.m22332g(a, (C5648f) this.f17842c[i4]);
            } else if (b == 3) {
                i = (CodedOutputStream.m22319O(a) * 2) + ((C5639c1) this.f17842c[i4]).mo18562d();
            } else if (b == 5) {
                i = CodedOutputStream.m22338m(a, ((Integer) this.f17842c[i4]).intValue());
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.m22427a());
            }
            i3 += i;
        }
        this.f17843d = i3;
        return i3;
    }

    /* renamed from: e */
    public int mo18563e() {
        int i = this.f17843d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17840a; i3++) {
            i2 += CodedOutputStream.m22308D(C5679h1.m22752a(this.f17841b[i3]), (C5648f) this.f17842c[i3]);
        }
        this.f17843d = i2;
        return i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5639c1)) {
            return false;
        }
        C5639c1 c1Var = (C5639c1) obj;
        int i = this.f17840a;
        if (i != c1Var.f17840a || !m22481m(this.f17841b, c1Var.f17841b, i) || !m22480k(this.f17842c, c1Var.f17842c, this.f17840a)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public void mo18565h() {
        this.f17844e = false;
    }

    public int hashCode() {
        int i = this.f17840a;
        return ((((527 + i) * 31) + m22477f(this.f17841b, i)) * 31) + m22478g(this.f17842c, this.f17840a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C5639c1 mo18567i(C5639c1 c1Var) {
        if (c1Var.equals(m22476c())) {
            return this;
        }
        mo18561a();
        int i = this.f17840a + c1Var.f17840a;
        m22475b(i);
        System.arraycopy(c1Var.f17841b, 0, this.f17841b, this.f17840a, c1Var.f17840a);
        System.arraycopy(c1Var.f17842c, 0, this.f17842c, this.f17840a, c1Var.f17840a);
        this.f17840a = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo18568l(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f17840a; i2++) {
            C5692j0.m22809d(sb, i, String.valueOf(C5679h1.m22752a(this.f17841b[i2])), this.f17842c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo18569n(C5689i1 i1Var) {
        if (i1Var.mo18702y() == C5689i1.C5690a.DESCENDING) {
            for (int i = this.f17840a - 1; i >= 0; i--) {
                i1Var.mo18680c(C5679h1.m22752a(this.f17841b[i]), this.f17842c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f17840a; i2++) {
            i1Var.mo18680c(C5679h1.m22752a(this.f17841b[i2]), this.f17842c[i2]);
        }
    }

    /* renamed from: p */
    public void mo18570p(C5689i1 i1Var) {
        if (this.f17840a != 0) {
            if (i1Var.mo18702y() == C5689i1.C5690a.ASCENDING) {
                for (int i = 0; i < this.f17840a; i++) {
                    m22482o(this.f17841b[i], this.f17842c[i], i1Var);
                }
                return;
            }
            for (int i2 = this.f17840a - 1; i2 >= 0; i2--) {
                m22482o(this.f17841b[i2], this.f17842c[i2], i1Var);
            }
        }
    }
}
