package dg1;

import eg1.C40892c;
import java.security.MessageDigest;
import kotlin.jvm.internal.C41536l;

/* renamed from: dg1.w */
public final class C40704w extends C40681e {

    /* renamed from: i */
    private final transient byte[][] f96383i;

    /* renamed from: j */
    private final transient int[] f96384j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40704w(byte[][] bArr, int[] iArr) {
        super(C40681e.f96328h.mo94805g());
        C41536l.m120489i(bArr, "segments");
        C41536l.m120489i(iArr, "directory");
        this.f96383i = bArr;
        this.f96384j = iArr;
    }

    /* renamed from: J */
    private final C40681e m117853J() {
        return new C40681e(mo94796E());
    }

    private final Object writeReplace() {
        return m117853J();
    }

    /* renamed from: D */
    public C40681e mo94795D() {
        return m117853J().mo94795D();
    }

    /* renamed from: E */
    public byte[] mo94796E() {
        byte[] bArr = new byte[mo94793B()];
        int length = mo94868I().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = mo94867H()[length + i];
            int i5 = mo94867H()[i];
            int i6 = i5 - i2;
            byte[] unused = C41331l.m119760d(mo94868I()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    /* renamed from: G */
    public void mo94798G(C40672b bVar, int i, int i2) {
        int i3;
        C41536l.m120489i(bVar, "buffer");
        int i4 = i + i2;
        int b = C40892c.m118632b(this, i);
        while (i < i4) {
            if (b == 0) {
                i3 = 0;
            } else {
                i3 = mo94867H()[b - 1];
            }
            int i5 = mo94867H()[mo94868I().length + b];
            int min = Math.min(i4, (mo94867H()[b] - i3) + i3) - i;
            int i6 = i5 + (i - i3);
            C40701u uVar = new C40701u(mo94868I()[b], i6, i6 + min, true, false);
            C40701u uVar2 = bVar.f96314d;
            if (uVar2 == null) {
                uVar.f96377g = uVar;
                uVar.f96376f = uVar;
                bVar.f96314d = uVar;
            } else {
                C41536l.m120486f(uVar2);
                C40701u uVar3 = uVar2.f96377g;
                C41536l.m120486f(uVar3);
                uVar3.mo94862c(uVar);
            }
            i += min;
            b++;
        }
        bVar.mo94706K0(bVar.mo94709M0() + ((long) i2));
    }

    /* renamed from: H */
    public final int[] mo94867H() {
        return this.f96384j;
    }

    /* renamed from: I */
    public final byte[][] mo94868I() {
        return this.f96383i;
    }

    /* renamed from: a */
    public String mo94799a() {
        return m117853J().mo94799a();
    }

    /* renamed from: c */
    public C40681e mo94801c(String str) {
        C41536l.m120489i(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = mo94868I().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = mo94867H()[length + i];
            int i4 = mo94867H()[i];
            instance.update(mo94868I()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = instance.digest();
        C41536l.m120488h(digest, "digestBytes");
        return new C40681e(digest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C40681e) {
            C40681e eVar = (C40681e) obj;
            if (eVar.mo94793B() == mo94793B() && mo94815u(0, eVar, 0, mo94793B())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int h = mo94806h();
        if (h != 0) {
            return h;
        }
        int length = mo94868I().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = mo94867H()[length + i];
            int i5 = mo94867H()[i];
            byte[] bArr = mo94868I()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        mo94817w(i2);
        return i2;
    }

    /* renamed from: l */
    public int mo94808l() {
        return mo94867H()[mo94868I().length - 1];
    }

    /* renamed from: o */
    public String mo94810o() {
        return m117853J().mo94810o();
    }

    /* renamed from: q */
    public byte[] mo94811q() {
        return mo94796E();
    }

    /* renamed from: r */
    public byte mo94812r(int i) {
        int i2;
        C40683e0.m117729b((long) mo94867H()[mo94868I().length - 1], (long) i, 1);
        int b = C40892c.m118632b(this, i);
        if (b == 0) {
            i2 = 0;
        } else {
            i2 = mo94867H()[b - 1];
        }
        return mo94868I()[b][(i - i2) + mo94867H()[mo94868I().length + b]];
    }

    public String toString() {
        return m117853J().toString();
    }

    /* renamed from: u */
    public boolean mo94815u(int i, C40681e eVar, int i2, int i3) {
        int i4;
        C41536l.m120489i(eVar, "other");
        if (i < 0 || i > mo94793B() - i3) {
            return false;
        }
        int i5 = i3 + i;
        int b = C40892c.m118632b(this, i);
        while (i < i5) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = mo94867H()[b - 1];
            }
            int i6 = mo94867H()[mo94868I().length + b];
            int min = Math.min(i5, (mo94867H()[b] - i4) + i4) - i;
            if (!eVar.mo94816v(i2, mo94868I()[b], i6 + (i - i4), min)) {
                return false;
            }
            i2 += min;
            i += min;
            b++;
        }
        return true;
    }

    /* renamed from: v */
    public boolean mo94816v(int i, byte[] bArr, int i2, int i3) {
        int i4;
        C41536l.m120489i(bArr, "other");
        if (i < 0 || i > mo94793B() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int b = C40892c.m118632b(this, i);
        while (i < i5) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = mo94867H()[b - 1];
            }
            int i6 = mo94867H()[mo94868I().length + b];
            int min = Math.min(i5, (mo94867H()[b] - i4) + i4) - i;
            if (!C40683e0.m117728a(mo94868I()[b], i6 + (i - i4), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            b++;
        }
        return true;
    }
}
