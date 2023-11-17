package p278ub;

import com.github.mikephil.charting.utils.Utils;
import com.google.zxing.C5755e;
import java.util.Arrays;

/* renamed from: ub.j */
public abstract class C8676j {
    /* renamed from: a */
    public static int m32368a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (m32373f(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static String m32369b(String str, C8678l lVar, C5755e eVar, C5755e eVar2) {
        int i = 0;
        C8673g[] gVarArr = {new C8667a(), new C8669c(), new C8679m(), new C8680n(), new C8672f(), new C8668b()};
        C8674h hVar = new C8674h(str);
        hVar.mo24044n(lVar);
        hVar.mo24042l(eVar, eVar2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            hVar.mo24048r(236);
            hVar.mo24043m(2);
            hVar.f24478d += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            hVar.mo24048r(237);
            hVar.mo24043m(2);
            hVar.f24478d += 7;
        }
        while (hVar.mo24039i()) {
            gVarArr[i].mo24021a(hVar);
            if (hVar.mo24036e() >= 0) {
                i = hVar.mo24036e();
                hVar.mo24040j();
            }
        }
        int a = hVar.mo24032a();
        hVar.mo24046p();
        int a2 = hVar.mo24038g().mo24050a();
        if (!(a >= a2 || i == 0 || i == 5 || i == 4)) {
            hVar.mo24048r(254);
        }
        StringBuilder b = hVar.mo24033b();
        if (b.length() < a2) {
            b.append(129);
        }
        while (b.length() < a2) {
            b.append(m32382o(b.length() + 1));
        }
        return hVar.mo24033b().toString();
    }

    /* renamed from: c */
    private static int m32370c(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i2 = 0; i2 < 6; i2++) {
            int ceil = (int) Math.ceil((double) fArr[i2]);
            iArr[i2] = ceil;
            if (i > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i = ceil;
            }
            if (i == ceil) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    /* renamed from: d */
    private static int m32371d(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    /* renamed from: e */
    static void m32372e(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    /* renamed from: f */
    static boolean m32373f(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: g */
    static boolean m32374g(char c) {
        return c >= 128 && c <= 255;
    }

    /* renamed from: h */
    private static boolean m32375h(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* renamed from: i */
    private static boolean m32376i(char c) {
        return c >= ' ' && c <= '^';
    }

    /* renamed from: j */
    private static boolean m32377j(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    /* renamed from: k */
    private static boolean m32378k(char c) {
        if (m32380m(c) || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* renamed from: l */
    private static boolean m32379l(char c) {
        return false;
    }

    /* renamed from: m */
    private static boolean m32380m(char c) {
        return c == 13 || c == '*' || c == '>';
    }

    /* renamed from: n */
    static int m32381n(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        char c;
        CharSequence charSequence2 = charSequence;
        int i3 = i;
        if (i3 >= charSequence.length()) {
            return i2;
        }
        int i4 = 6;
        if (i2 == 0) {
            fArr = new float[]{Utils.FLOAT_EPSILON, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i2] = 0.0f;
        }
        int i5 = 0;
        while (true) {
            int i6 = i3 + i5;
            if (i6 == charSequence.length()) {
                byte[] bArr = new byte[i4];
                int[] iArr = new int[i4];
                int c2 = m32370c(fArr, iArr, Integer.MAX_VALUE, bArr);
                int d = m32371d(bArr);
                if (iArr[0] == c2) {
                    return 0;
                }
                if (d == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (d == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (d == 1 && bArr[2] > 0) {
                    return 2;
                }
                if (d != 1 || bArr[3] <= 0) {
                    return 1;
                }
                return 3;
            }
            char charAt = charSequence2.charAt(i6);
            i5++;
            if (m32373f(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (m32374g(charAt)) {
                float ceil = (float) Math.ceil((double) fArr[0]);
                fArr[0] = ceil;
                fArr[0] = ceil + 2.0f;
            } else {
                float ceil2 = (float) Math.ceil((double) fArr[0]);
                fArr[0] = ceil2;
                fArr[0] = ceil2 + 1.0f;
            }
            if (m32375h(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (m32374g(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (m32377j(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (m32374g(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (m32378k(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (m32374g(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (m32376i(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (m32374g(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (m32379l(charAt)) {
                c = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i5 >= 4) {
                int[] iArr2 = new int[i4];
                byte[] bArr2 = new byte[i4];
                m32370c(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int d2 = m32371d(bArr2);
                int i7 = iArr2[0];
                int i8 = iArr2[c];
                if (i7 < i8 && i7 < iArr2[1] && i7 < iArr2[2] && i7 < iArr2[3] && i7 < iArr2[4]) {
                    return 0;
                }
                if (i8 < i7) {
                    return 5;
                }
                byte b = bArr2[1];
                byte b2 = bArr2[2];
                byte b3 = bArr2[3];
                byte b4 = bArr2[4];
                if (b + b2 + b3 + b4 == 0) {
                    return 5;
                }
                if (d2 == 1 && b4 > 0) {
                    return 4;
                }
                if (d2 == 1 && b2 > 0) {
                    return 2;
                }
                if (d2 == 1 && b3 > 0) {
                    return 3;
                }
                int i9 = iArr2[1];
                if (i9 + 1 < i7 && i9 + 1 < i8 && i9 + 1 < iArr2[4] && i9 + 1 < iArr2[2]) {
                    int i12 = iArr2[3];
                    if (i9 < i12) {
                        return 1;
                    }
                    if (i9 == i12) {
                        int i13 = i3 + i5 + 1;
                        while (i13 < charSequence.length()) {
                            char charAt2 = charSequence2.charAt(i13);
                            if (!m32380m(charAt2)) {
                                if (!m32378k(charAt2)) {
                                    break;
                                }
                                i13++;
                            } else {
                                return 3;
                            }
                        }
                        return 1;
                    }
                }
            }
            i4 = 6;
        }
    }

    /* renamed from: o */
    private static char m32382o(int i) {
        int i2 = ((i * 149) % 253) + 1 + 129;
        if (i2 > 254) {
            i2 -= 254;
        }
        return (char) i2;
    }
}
