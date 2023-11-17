package dg1;

import eg1.C40891b;
import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: dg1.e */
public class C40681e implements Serializable, Comparable {

    /* renamed from: g */
    public static final C40682a f96327g = new C40682a((DefaultConstructorMarker) null);

    /* renamed from: h */
    public static final C40681e f96328h = new C40681e(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: d */
    private final byte[] f96329d;

    /* renamed from: e */
    private transient int f96330e;

    /* renamed from: f */
    private transient String f96331f;

    /* renamed from: dg1.e$a */
    public static final class C40682a {
        private C40682a() {
        }

        public /* synthetic */ C40682a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: e */
        public static /* synthetic */ C40681e m117722e(C40682a aVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            return aVar.mo94823d(bArr, i, i2);
        }

        /* renamed from: a */
        public final C40681e mo94820a(String str) {
            boolean z;
            C41536l.m120489i(str, "<this>");
            int i = 0;
            if (str.length() % 2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                int i2 = length - 1;
                if (i2 >= 0) {
                    while (true) {
                        int i3 = i + 1;
                        int i4 = i * 2;
                        bArr[i] = (byte) ((C40891b.m118629e(str.charAt(i4)) << 4) + C40891b.m118629e(str.charAt(i4 + 1)));
                        if (i3 > i2) {
                            break;
                        }
                        i = i3;
                    }
                }
                return new C40681e(bArr);
            }
            throw new IllegalArgumentException(C41536l.m120497q("Unexpected hex string: ", str).toString());
        }

        /* renamed from: b */
        public final C40681e mo94821b(String str, Charset charset) {
            C41536l.m120489i(str, "<this>");
            C41536l.m120489i(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            C41536l.m120488h(bytes, "(this as java.lang.String).getBytes(charset)");
            return new C40681e(bytes);
        }

        /* renamed from: c */
        public final C40681e mo94822c(String str) {
            C41536l.m120489i(str, "<this>");
            C40681e eVar = new C40681e(C40680d0.m117694a(str));
            eVar.mo94818x(str);
            return eVar;
        }

        /* renamed from: d */
        public final C40681e mo94823d(byte[] bArr, int i, int i2) {
            C41536l.m120489i(bArr, "<this>");
            C40683e0.m117729b((long) bArr.length, (long) i, (long) i2);
            return new C40681e(C41331l.m119764h(bArr, i, i2 + i));
        }

        /* renamed from: f */
        public final C40681e mo94824f(InputStream inputStream, int i) {
            boolean z;
            C41536l.m120489i(inputStream, "<this>");
            int i2 = 0;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = new byte[i];
                while (i2 < i) {
                    int read = inputStream.read(bArr, i2, i - i2);
                    if (read != -1) {
                        i2 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new C40681e(bArr);
            }
            throw new IllegalArgumentException(C41536l.m120497q("byteCount < 0: ", Integer.valueOf(i)).toString());
        }
    }

    public C40681e(byte[] bArr) {
        C41536l.m120489i(bArr, "data");
        this.f96329d = bArr;
    }

    /* renamed from: e */
    public static final C40681e m117696e(String str) {
        return f96327g.mo94822c(str);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        C40681e f = f96327g.mo94824f(objectInputStream, objectInputStream.readInt());
        Field declaredField = C40681e.class.getDeclaredField("d");
        declaredField.setAccessible(true);
        declaredField.set(this, f.f96329d);
    }

    /* renamed from: t */
    public static final C40681e m117697t(byte[] bArr, int i, int i2) {
        return f96327g.mo94823d(bArr, i, i2);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.f96329d.length);
        objectOutputStream.write(this.f96329d);
    }

    /* renamed from: A */
    public final C40681e mo94792A() {
        return mo94801c("SHA-256");
    }

    /* renamed from: B */
    public final int mo94793B() {
        return mo94808l();
    }

    /* renamed from: C */
    public final boolean mo94794C(C40681e eVar) {
        C41536l.m120489i(eVar, "prefix");
        return mo94815u(0, eVar, 0, eVar.mo94793B());
    }

    /* renamed from: D */
    public C40681e mo94795D() {
        byte b;
        int i = 0;
        while (i < mo94805g().length) {
            byte b2 = mo94805g()[i];
            byte b3 = (byte) 65;
            if (b2 < b3 || b2 > (b = (byte) 90)) {
                i++;
            } else {
                byte[] g = mo94805g();
                byte[] copyOf = Arrays.copyOf(g, g.length);
                C41536l.m120488h(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new C40681e(copyOf);
            }
        }
        return this;
    }

    /* renamed from: E */
    public byte[] mo94796E() {
        byte[] g = mo94805g();
        byte[] copyOf = Arrays.copyOf(g, g.length);
        C41536l.m120488h(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    /* renamed from: F */
    public String mo94797F() {
        String n = mo94809n();
        if (n != null) {
            return n;
        }
        String b = C40680d0.m117695b(mo94811q());
        mo94818x(b);
        return b;
    }

    /* renamed from: G */
    public void mo94798G(C40672b bVar, int i, int i2) {
        C41536l.m120489i(bVar, "buffer");
        C40891b.m118628d(this, bVar, i, i2);
    }

    /* renamed from: a */
    public String mo94799a() {
        return C40678c0.m117674b(mo94805g(), (byte[]) null, 1, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r7 < r8) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r0 < r1) goto L_0x0030;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(dg1.C40681e r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.C41536l.m120489i(r10, r0)
            int r0 = r9.mo94793B()
            int r1 = r10.mo94793B()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0013:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002b
            byte r7 = r9.mo94804f(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.mo94804f(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0028:
            if (r7 >= r8) goto L_0x0032
            goto L_0x0030
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            if (r0 >= r1) goto L_0x0032
        L_0x0030:
            r3 = r5
            goto L_0x0033
        L_0x0032:
            r3 = r6
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dg1.C40681e.compareTo(dg1.e):int");
    }

    /* renamed from: c */
    public C40681e mo94801c(String str) {
        C41536l.m120489i(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(mo94805g(), 0, mo94793B());
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
            if (eVar.mo94793B() == mo94805g().length && eVar.mo94816v(0, mo94805g(), 0, mo94805g().length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final byte mo94804f(int i) {
        return mo94812r(i);
    }

    /* renamed from: g */
    public final byte[] mo94805g() {
        return this.f96329d;
    }

    /* renamed from: h */
    public final int mo94806h() {
        return this.f96330e;
    }

    public int hashCode() {
        int h = mo94806h();
        if (h != 0) {
            return h;
        }
        int hashCode = Arrays.hashCode(mo94805g());
        mo94817w(hashCode);
        return hashCode;
    }

    /* renamed from: l */
    public int mo94808l() {
        return mo94805g().length;
    }

    /* renamed from: n */
    public final String mo94809n() {
        return this.f96331f;
    }

    /* renamed from: o */
    public String mo94810o() {
        char[] cArr = new char[(mo94805g().length * 2)];
        byte[] g = mo94805g();
        int length = g.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = g[i];
            i++;
            int i3 = i2 + 1;
            cArr[i2] = C40891b.m118630f()[(b >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = C40891b.m118630f()[b & 15];
        }
        return C40439w.m117110n(cArr);
    }

    /* renamed from: q */
    public byte[] mo94811q() {
        return mo94805g();
    }

    /* renamed from: r */
    public byte mo94812r(int i) {
        return mo94805g()[i];
    }

    /* renamed from: s */
    public final C40681e mo94813s() {
        return mo94801c("MD5");
    }

    public String toString() {
        boolean z;
        boolean z2;
        C40681e eVar;
        String str;
        boolean z3 = true;
        if (mo94805g().length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "[size=0]";
        } else {
            int a = C40891b.m118627c(mo94805g(), 64);
            if (a != -1) {
                String F = mo94797F();
                if (F != null) {
                    String substring = F.substring(0, a);
                    C41536l.m120488h(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    String B = C40439w.m117103B(C40439w.m117103B(C40439w.m117103B(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
                    if (a < F.length()) {
                        return "[size=" + mo94805g().length + " text=" + B + "…]";
                    }
                    return "[text=" + B + ']';
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } else if (mo94805g().length <= 64) {
                str = "[hex=" + mo94810o() + ']';
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("[size=");
                sb.append(mo94805g().length);
                sb.append(" hex=");
                int d = C40683e0.m117731d(this, 64);
                if (d <= mo94805g().length) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (d + 0 < 0) {
                        z3 = false;
                    }
                    if (z3) {
                        if (d == mo94805g().length) {
                            eVar = this;
                        } else {
                            eVar = new C40681e(C41331l.m119764h(mo94805g(), 0, d));
                        }
                        sb.append(eVar.mo94810o());
                        sb.append("…]");
                        return sb.toString();
                    }
                    throw new IllegalArgumentException("endIndex < beginIndex".toString());
                }
                throw new IllegalArgumentException(("endIndex > length(" + mo94805g().length + ')').toString());
            }
        }
        return str;
    }

    /* renamed from: u */
    public boolean mo94815u(int i, C40681e eVar, int i2, int i3) {
        C41536l.m120489i(eVar, "other");
        return eVar.mo94816v(i2, mo94805g(), i, i3);
    }

    /* renamed from: v */
    public boolean mo94816v(int i, byte[] bArr, int i2, int i3) {
        C41536l.m120489i(bArr, "other");
        if (i < 0 || i > mo94805g().length - i3 || i2 < 0 || i2 > bArr.length - i3 || !C40683e0.m117728a(mo94805g(), i, bArr, i2, i3)) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public final void mo94817w(int i) {
        this.f96330e = i;
    }

    /* renamed from: x */
    public final void mo94818x(String str) {
        this.f96331f = str;
    }

    /* renamed from: y */
    public final C40681e mo94819y() {
        return mo94801c("SHA-1");
    }
}
