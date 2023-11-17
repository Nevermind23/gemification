package wf1;

import com.salesforce.marketingcloud.C11398b;
import dg1.C40681e;
import kotlin.jvm.internal.C41536l;
import pf1.C42197d;

/* renamed from: wf1.d */
public final class C43201d {

    /* renamed from: a */
    public static final C43201d f100800a = new C43201d();

    /* renamed from: b */
    public static final C40681e f100801b = C40681e.f96327g.mo94822c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: c */
    private static final String[] f100802c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: d */
    private static final String[] f100803d = new String[64];

    /* renamed from: e */
    private static final String[] f100804e;

    static {
        String[] strArr = new String[C11398b.f33139r];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            C41536l.m120488h(binaryString, "toBinaryString(it)");
            strArr[i2] = C40439w.m117102A(C42197d.m122554t("%8s", binaryString), ' ', '0', false, 4, (Object) null);
        }
        f100804e = strArr;
        String[] strArr2 = f100803d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        strArr2[1 | 8] = C41536l.m120497q("END_STREAM", "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i3 = 0;
        while (i3 < 3) {
            int i4 = iArr2[i3];
            i3++;
            int i5 = iArr[0];
            String[] strArr3 = f100803d;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            strArr3[i6 | 8] = strArr3[i5] + '|' + strArr3[i4] + "|PADDED";
        }
        int length = f100803d.length;
        while (i < length) {
            int i7 = i + 1;
            String[] strArr4 = f100803d;
            if (strArr4[i] == null) {
                strArr4[i] = f100804e[i];
            }
            i = i7;
        }
    }

    private C43201d() {
    }

    /* renamed from: a */
    public final String mo101763a(int i, int i2) {
        String str;
        if (i2 == 0) {
            return "";
        }
        if (!(i == 2 || i == 3)) {
            if (i == 4 || i == 6) {
                if (i2 == 1) {
                    return "ACK";
                }
                return f100804e[i2];
            } else if (!(i == 7 || i == 8)) {
                String[] strArr = f100803d;
                if (i2 < strArr.length) {
                    str = strArr[i2];
                    C41536l.m120486f(str);
                } else {
                    str = f100804e[i2];
                }
                String str2 = str;
                if (i == 5 && (i2 & 4) != 0) {
                    return C40439w.m117103B(str2, "HEADERS", "PUSH_PROMISE", false, 4, (Object) null);
                }
                if (i != 0 || (i2 & 32) == 0) {
                    return str2;
                }
                return C40439w.m117103B(str2, "PRIORITY", "COMPRESSED", false, 4, (Object) null);
            }
        }
        return f100804e[i2];
    }

    /* renamed from: b */
    public final String mo101764b(int i) {
        String[] strArr = f100802c;
        if (i < strArr.length) {
            return strArr[i];
        }
        return C42197d.m122554t("0x%02x", Integer.valueOf(i));
    }

    /* renamed from: c */
    public final String mo101765c(boolean z, int i, int i2, int i3, int i4) {
        String str;
        String b = mo101764b(i3);
        String a = mo101763a(i3, i4);
        if (z) {
            str = "<<";
        } else {
            str = ">>";
        }
        return C42197d.m122554t("%s 0x%08x %5d %-13s %s", str, Integer.valueOf(i), Integer.valueOf(i2), b, a);
    }
}
