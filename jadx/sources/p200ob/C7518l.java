package p200ob;

import com.google.zxing.C5754d;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: ob.l */
public abstract class C7518l {

    /* renamed from: a */
    private static final String f21938a;

    /* renamed from: b */
    private static final boolean f21939b;

    static {
        boolean z;
        String name = Charset.defaultCharset().name();
        f21938a = name;
        if ("SJIS".equalsIgnoreCase(name) || "EUC_JP".equalsIgnoreCase(name)) {
            z = true;
        } else {
            z = false;
        }
        f21939b = z;
    }

    /* renamed from: a */
    public static String m28596a(byte[] bArr, Map map) {
        boolean z;
        byte[] bArr2 = bArr;
        Map map2 = map;
        if (map2 != null) {
            C5754d dVar = C5754d.CHARACTER_SET;
            if (map2.containsKey(dVar)) {
                return map2.get(dVar).toString();
            }
        }
        int length = bArr2.length;
        boolean z2 = true;
        int i = 0;
        if (bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = true;
        boolean z4 = true;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i3 < length && (z2 || z3 || z4)) {
            byte b = bArr2[i3] & 255;
            if (z4) {
                if (i4 > 0) {
                    if ((b & 128) != 0) {
                        i4--;
                    }
                } else if ((b & 128) != 0) {
                    if ((b & 64) != 0) {
                        i4++;
                        if ((b & 32) == 0) {
                            i6++;
                        } else {
                            i4++;
                            if ((b & 16) == 0) {
                                i7++;
                            } else {
                                i4++;
                                if ((b & 8) == 0) {
                                    i8++;
                                }
                            }
                        }
                    }
                }
                z4 = false;
            }
            if (z2) {
                if (b > Byte.MAX_VALUE && b < 160) {
                    z2 = false;
                } else if (b > 159 && (b < 192 || b == 215 || b == 247)) {
                    i12++;
                }
            }
            if (z3) {
                if (i5 > 0) {
                    if (b >= 64 && b != Byte.MAX_VALUE && b <= 252) {
                        i5--;
                    }
                } else if (!(b == 128 || b == 160 || b > 239)) {
                    if (b <= 160 || b >= 224) {
                        if (b > Byte.MAX_VALUE) {
                            i5++;
                            int i15 = i13 + 1;
                            if (i15 > i) {
                                i = i15;
                                i13 = i;
                            } else {
                                i13 = i15;
                            }
                        } else {
                            i13 = 0;
                        }
                        i14 = 0;
                    } else {
                        i2++;
                        int i16 = i14 + 1;
                        if (i16 > i9) {
                            i9 = i16;
                            i14 = i9;
                        } else {
                            i14 = i16;
                        }
                        i13 = 0;
                    }
                }
                z3 = false;
            }
            i3++;
            bArr2 = bArr;
        }
        if (z4 && i4 > 0) {
            z4 = false;
        }
        if (z3 && i5 > 0) {
            z3 = false;
        }
        if (z4 && (z || i6 + i7 + i8 > 0)) {
            return "UTF8";
        }
        if (z3 && (f21939b || i9 >= 3 || i >= 3)) {
            return "SJIS";
        }
        if (!z2 || !z3) {
            if (z2) {
                return "ISO8859_1";
            }
            if (z3) {
                return "SJIS";
            }
            if (z4) {
                return "UTF8";
            }
            return f21938a;
        } else if ((i9 != 2 || i2 != 2) && i12 * 10 < length) {
            return "ISO8859_1";
        } else {
            return "SJIS";
        }
    }
}
