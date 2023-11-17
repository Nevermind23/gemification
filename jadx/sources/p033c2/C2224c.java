package p033c2;

import dg1.C40672b;
import dg1.C40677c;
import dg1.C40679d;
import dg1.C40681e;
import dg1.C40694p;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: c2.c */
public abstract class C2224c implements Closeable {

    /* renamed from: j */
    private static final String[] f6887j = new String[128];

    /* renamed from: d */
    int f6888d;

    /* renamed from: e */
    int[] f6889e = new int[32];

    /* renamed from: f */
    String[] f6890f = new String[32];

    /* renamed from: g */
    int[] f6891g = new int[32];

    /* renamed from: h */
    boolean f6892h;

    /* renamed from: i */
    boolean f6893i;

    /* renamed from: c2.c$a */
    public static final class C2225a {

        /* renamed from: a */
        final String[] f6894a;

        /* renamed from: b */
        final C40694p f6895b;

        private C2225a(String[] strArr, C40694p pVar) {
            this.f6894a = strArr;
            this.f6895b = pVar;
        }

        /* renamed from: a */
        public static C2225a m8482a(String... strArr) {
            try {
                C40681e[] eVarArr = new C40681e[strArr.length];
                C40672b bVar = new C40672b();
                for (int i = 0; i < strArr.length; i++) {
                    C2224c.m8463Q(bVar, strArr[i]);
                    bVar.readByte();
                    eVarArr[i] = bVar.mo94743n0();
                }
                return new C2225a((String[]) strArr.clone(), C40694p.m117784r(eVarArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: c2.c$b */
    public enum C2226b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f6887j[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f6887j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    C2224c() {
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public static void m8463Q(C40677c cVar, String str) {
        String str2;
        String[] strArr = f6887j;
        cVar.mo94715R0(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                cVar.mo94740l0(str, i, i2);
            }
            cVar.mo94728d0(str2);
            i = i2 + 1;
        }
        if (i < length) {
            cVar.mo94740l0(str, i, length);
        }
        cVar.mo94715R0(34);
    }

    /* renamed from: u */
    public static C2224c m8465u(C40679d dVar) {
        return new C2228e(dVar);
    }

    /* renamed from: E0 */
    public abstract boolean mo7146E0();

    /* renamed from: I0 */
    public abstract String mo7147I0();

    /* renamed from: N */
    public abstract void mo7148N();

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final C2223b mo7149R(String str) {
        throw new C2223b(str + " at path " + mo7162z());
    }

    /* renamed from: b0 */
    public abstract String mo7150b0();

    public abstract boolean hasNext();

    /* renamed from: k */
    public abstract void mo7152k();

    /* renamed from: n */
    public abstract void mo7153n();

    /* renamed from: o */
    public abstract void mo7154o();

    /* renamed from: q */
    public abstract void mo7155q();

    /* renamed from: s */
    public abstract double mo7156s();

    /* renamed from: t */
    public abstract int mo7157t();

    /* renamed from: v */
    public abstract C2226b mo7158v();

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo7159w(int i) {
        int i2 = this.f6888d;
        int[] iArr = this.f6889e;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f6889e = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f6890f;
                this.f6890f = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f6891g;
                this.f6891g = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new C2222a("Nesting too deep at " + mo7162z());
            }
        }
        int[] iArr3 = this.f6889e;
        int i3 = this.f6888d;
        this.f6888d = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: x */
    public abstract int mo7160x(C2225a aVar);

    /* renamed from: y */
    public abstract void mo7161y();

    /* renamed from: z */
    public final String mo7162z() {
        return C2227d.m8484a(this.f6888d, this.f6889e, this.f6890f, this.f6891g);
    }
}
