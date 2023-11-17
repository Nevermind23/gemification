package com.facetec.sdk;

import com.salesforce.marketingcloud.C11398b;
import java.io.IOException;

/* renamed from: com.facetec.sdk.lr */
public final class C3388lr {

    /* renamed from: a */
    static final C3435mq f11174a = C3435mq.m13741b("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    private static final String[] f11175b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    private static String[] f11176c = new String[C11398b.f33139r];

    /* renamed from: e */
    private static String[] f11177e = new String[64];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f11176c;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = C3303ki.m13262d("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f11177e;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 <= 0; i3++) {
            int i4 = iArr[i3];
            StringBuilder sb = new StringBuilder();
            sb.append(f11177e[i4]);
            sb.append("|PADDED");
            f11177e[i4 | 8] = sb.toString();
        }
        String[] strArr3 = f11177e;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 <= 0; i7++) {
                int i8 = iArr[i7];
                String[] strArr4 = f11177e;
                int i9 = i8 | i6;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f11177e[i8]);
                sb2.append('|');
                sb2.append(f11177e[i6]);
                strArr4[i9] = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(f11177e[i8]);
                sb3.append('|');
                sb3.append(f11177e[i6]);
                sb3.append("|PADDED");
                f11177e[i9 | 8] = sb3.toString();
            }
        }
        while (true) {
            String[] strArr5 = f11177e;
            if (i < strArr5.length) {
                if (strArr5[i] == null) {
                    strArr5[i] = f11176c[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    private C3388lr() {
    }

    /* renamed from: a */
    static IOException m13515a(String str, Object... objArr) {
        throw new IOException(C3303ki.m13262d(str, objArr));
    }

    /* renamed from: c */
    static String m13516c(boolean z, int i, int i2, byte b, byte b2) {
        String str;
        String str2;
        String str3;
        String str4;
        String[] strArr = f11175b;
        if (b < strArr.length) {
            str = strArr[b];
        } else {
            str = C3303ki.m13262d("0x%02x", Byte.valueOf(b));
        }
        if (b2 == 0) {
            str2 = "";
        } else {
            if (!(b == 2 || b == 3)) {
                if (b == 4 || b == 6) {
                    if (b2 == 1) {
                        str2 = "ACK";
                    } else {
                        str2 = f11176c[b2];
                    }
                } else if (!(b == 7 || b == 8)) {
                    String[] strArr2 = f11177e;
                    if (b2 < strArr2.length) {
                        str4 = strArr2[b2];
                    } else {
                        str4 = f11176c[b2];
                    }
                    if (b == 5 && (b2 & 4) != 0) {
                        str2 = str4.replace("HEADERS", "PUSH_PROMISE");
                    } else if (b != 0 || (b2 & 32) == 0) {
                        str2 = str4;
                    } else {
                        str2 = str4.replace("PRIORITY", "COMPRESSED");
                    }
                }
            }
            str2 = f11176c[b2];
        }
        Object[] objArr = new Object[5];
        if (z) {
            str3 = "<<";
        } else {
            str3 = ">>";
        }
        objArr[0] = str3;
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = str;
        objArr[4] = str2;
        return C3303ki.m13262d("%s 0x%08x %5d %-13s %s", objArr);
    }

    /* renamed from: d */
    static IllegalArgumentException m13517d(String str, Object... objArr) {
        throw new IllegalArgumentException(C3303ki.m13262d(str, objArr));
    }
}
