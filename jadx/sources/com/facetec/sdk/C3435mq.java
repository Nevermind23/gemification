package com.facetec.sdk;

import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: com.facetec.sdk.mq */
public class C3435mq implements Serializable, Comparable<C3435mq> {

    /* renamed from: a */
    public static final C3435mq f11263a = m13744d(new byte[0]);

    /* renamed from: e */
    private static char[] f11264e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    private transient String f11265b;

    /* renamed from: c */
    transient int f11266c;

    /* renamed from: d */
    final byte[] f11267d;

    C3435mq(byte[] bArr) {
        this.f11267d = bArr;
    }

    /* renamed from: b */
    public static C3435mq m13741b(String str) {
        if (str != null) {
            C3435mq mqVar = new C3435mq(str.getBytes(C3460nb.f11312a));
            mqVar.f11265b = str;
            return mqVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    /* renamed from: d */
    public static C3435mq m13744d(byte... bArr) {
        if (bArr != null) {
            return new C3435mq((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            byte[] bArr = new byte[readInt];
            int i = 0;
            while (i < readInt) {
                int read = objectInputStream.read(bArr, i, readInt - i);
                if (read != -1) {
                    i += read;
                } else {
                    throw new EOFException();
                }
            }
            C3435mq mqVar = new C3435mq(bArr);
            try {
                Field declaredField = C3435mq.class.getDeclaredField("d");
                declaredField.setAccessible(true);
                declaredField.set(this, mqVar.f11267d);
            } catch (NoSuchFieldException unused) {
                throw new AssertionError();
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            }
        } else {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(readInt)));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.f11267d.length);
        objectOutputStream.write(this.f11267d);
    }

    /* renamed from: a */
    public C3435mq mo9893a() {
        return m13745e("SHA-1");
    }

    /* renamed from: c */
    public C3435mq mo9897c() {
        return m13745e("SHA-256");
    }

    public /* synthetic */ int compareTo(Object obj) {
        C3435mq mqVar = (C3435mq) obj;
        int g = mo9906g();
        int g2 = mqVar.mo9906g();
        int min = Math.min(g, g2);
        int i = 0;
        while (i < min) {
            byte e = mo9902e(i) & 255;
            byte e2 = mqVar.mo9902e(i) & 255;
            if (e == e2) {
                i++;
            } else if (e < e2) {
                return -1;
            } else {
                return 1;
            }
        }
        if (g == g2) {
            return 0;
        }
        if (g < g2) {
            return -1;
        }
        return 1;
    }

    /* renamed from: e */
    public String mo9903e() {
        String str = this.f11265b;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f11267d, C3460nb.f11312a);
        this.f11265b = str2;
        return str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3435mq) {
            C3435mq mqVar = (C3435mq) obj;
            int g = mqVar.mo9906g();
            byte[] bArr = this.f11267d;
            if (g != bArr.length || !mqVar.mo9904e(0, bArr, 0, bArr.length)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public int mo9906g() {
        return this.f11267d.length;
    }

    /* renamed from: h */
    public C3435mq mo9907h() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f11267d;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b < 65 || b > 90) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new C3435mq(bArr2);
            }
        }
    }

    public int hashCode() {
        int i = this.f11266c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f11267d);
        this.f11266c = hashCode;
        return hashCode;
    }

    /* renamed from: j */
    public byte[] mo9909j() {
        return (byte[]) this.f11267d.clone();
    }

    public String toString() {
        if (this.f11267d.length == 0) {
            return "[size=0]";
        }
        String e = mo9903e();
        int length = e.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                i = e.length();
                break;
            } else if (i2 == 64) {
                break;
            } else {
                int codePointAt = e.codePointAt(i);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i2++;
                    i += Character.charCount(codePointAt);
                }
            }
        }
        i = -1;
        if (i != -1) {
            String replace = e.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i < e.length()) {
                StringBuilder sb = new StringBuilder("[size=");
                sb.append(this.f11267d.length);
                sb.append(" text=");
                sb.append(replace);
                sb.append("…]");
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("[text=");
            sb2.append(replace);
            sb2.append("]");
            return sb2.toString();
        } else if (this.f11267d.length <= 64) {
            StringBuilder sb3 = new StringBuilder("[hex=");
            sb3.append(mo9894b());
            sb3.append("]");
            return sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder("[size=");
            sb4.append(this.f11267d.length);
            sb4.append(" hex=");
            sb4.append(mo9898c(0, 64).mo9894b());
            sb4.append("…]");
            return sb4.toString();
        }
    }

    /* renamed from: c */
    private static int m13742c(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: ".concat(String.valueOf(c)));
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: e */
    private C3435mq m13745e(String str) {
        try {
            return m13744d(MessageDigest.getInstance(str).digest(this.f11267d));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public C3435mq mo9898c(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.f11267d;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, i, bArr2, 0, i3);
                    return new C3435mq(bArr2);
                }
            } else {
                StringBuilder sb = new StringBuilder("endIndex > length(");
                sb.append(this.f11267d.length);
                sb.append(")");
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    /* renamed from: d */
    public String mo9901d() {
        return C3433mo.m13730c(this.f11267d);
    }

    /* renamed from: d */
    public static C3435mq m13743d(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i << 1;
                bArr[i] = (byte) ((m13742c(str.charAt(i2)) << 4) + m13742c(str.charAt(i2 + 1)));
            }
            return m13744d(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
    }

    /* renamed from: b */
    public String mo9894b() {
        byte[] bArr = this.f11267d;
        char[] cArr = new char[(bArr.length << 1)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f11264e;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: e */
    public byte mo9902e(int i) {
        return this.f11267d[i];
    }

    /* renamed from: e */
    public boolean mo9904e(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f11267d;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C3460nb.m13840d(bArr2, i, bArr, i2, i3);
    }

    /* renamed from: b */
    public boolean mo9895b(int i, C3435mq mqVar, int i2, int i3) {
        return mqVar.mo9904e(0, this.f11267d, 0, i3);
    }

    /* renamed from: b */
    public final boolean mo9896b(C3435mq mqVar) {
        return mo9895b(0, mqVar, 0, mqVar.mo9906g());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9899c(C3431mm mmVar) {
        byte[] bArr = this.f11267d;
        mmVar.mo9854d(bArr, 0, bArr.length);
    }
}
