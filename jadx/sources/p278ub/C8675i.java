package p278ub;

import com.salesforce.marketingcloud.C11398b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView;

/* renamed from: ub.i */
public abstract class C8675i {

    /* renamed from: a */
    private static final int[] f24482a = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};

    /* renamed from: b */
    private static final int[][] f24483b = {new int[]{228, 48, 15, 111, 62}, new int[]{23, 68, 144, 134, 240, 92, 254}, new int[]{28, 24, 185, 166, 223, 248, 116, C11051p3.f31759c, 110, 61}, new int[]{175, 138, 205, 12, 194, 168, 39, 245, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, 142, 213, 97, 178, 100, 242}, new int[]{156, 97, 192, 252, 95, 9, 157, 119, 138, 45, 18, 186, 83, 185}, new int[]{83, 195, 100, 39, 188, 75, 66, 61, 241, 213, 109, 129, 94, 254, 225, 48, 90, 188}, new int[]{15, 195, 244, 9, 233, 71, 168, 2, 188, 160, 153, 145, 253, 79, 108, 82, 27, 174, 186, 172}, new int[]{52, 190, 88, 205, 109, 39, 176, 21, 155, 197, 251, 223, 155, 21, 5, 172, 254, 124, 12, 181, 184, 96, 50, 193}, new int[]{211, 231, 43, 97, 71, 96, 103, 174, 37, 151, 170, 53, 75, 34, 249, 121, 17, 138, 110, 213, 141, 136, 120, 151, 233, 168, 93, C11051p3.f31759c}, new int[]{245, C11051p3.f31760d, 242, 218, 130, 250, 162, 181, 102, 120, 84, 179, 220, 251, 80, 182, 229, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, 175, 184, 59, 25, 225, 98, 81, 112}, new int[]{77, 193, 137, 31, 19, 38, 22, 153, 247, 105, 122, 2, 245, 133, 242, 8, 175, 95, 100, 9, 167, 105, 214, 111, 57, 121, 21, 1, 253, 57, 54, 101, 248, 202, 69, 50, 150, 177, 226, 5, 9, 5}, new int[]{245, 132, 172, 223, 96, 32, 117, 22, 238, 133, 238, 231, 205, 188, 237, 87, 191, 106, 16, 147, 118, 23, 37, 90, 170, 205, 131, 88, 120, 100, 66, 138, 186, 240, 82, 44, 176, 87, 187, 147, 160, 175, 69, 213, 92, 253, 225, 19}, new int[]{175, 9, 223, 238, 12, 17, 220, 208, 100, 29, 175, 170, 230, 192, 215, 235, 150, 159, 36, 223, 38, BogInputLayout.INPUT_NORMAL_STATE, 132, 54, 228, 146, 218, 234, 117, 203, 29, 232, 144, 238, 22, 150, BogInputLayout.INPUT_ERROR_STATE, 117, 62, 207, 164, 13, 137, 245, C11051p3.f31760d, 67, 247, 28, 155, 43, 203, 107, 233, 53, 143, 46}, new int[]{242, 93, 169, 50, 144, 210, 39, 118, 202, 188, BogInputLayout.INPUT_ERROR_STATE, 189, 143, 108, 196, 37, 185, 112, 134, 230, 245, 63, 197, 190, 250, 106, 185, 221, 175, 64, 114, 71, 161, 44, 147, 6, 27, 218, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 4, 107, 232, 7, 94, 166, 224, 124, 86, 47, 11, 204}, new int[]{220, 228, 173, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, C11051p3.f31760d, 213, 136, 248, SubsamplingScaleImageView.ORIENTATION_180, 234, 197, 158, 177, 68, 122, 93, 213, 15, 160, 227, 236, 66, 139, 153, 185, 202, 167, 179, 25, 220, 232, 96, 210, 231, 136, 223, 239, 181, 241, 59, 52, 172, 25, 49, 232, 211, 189, 64, 54, 108, 153, 132, 63, 96, 103, 82, 186}};

    /* renamed from: c */
    private static final int[] f24484c = new int[C11398b.f33139r];

    /* renamed from: d */
    private static final int[] f24485d = new int[C11051p3.f31759c];

    static {
        int i = 1;
        for (int i2 = 0; i2 < 255; i2++) {
            f24485d[i2] = i;
            f24484c[i] = i2;
            i <<= 1;
            if (i >= 256) {
                i ^= BogInputLayout.INPUT_TYPE_NUM_PASSWORD;
            }
        }
    }

    /* renamed from: a */
    private static String m32366a(CharSequence charSequence, int i) {
        int i2;
        int i3;
        int i4 = 0;
        while (true) {
            int[] iArr = f24482a;
            if (i4 >= iArr.length) {
                i4 = -1;
                break;
            } else if (iArr[i4] == i) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int[] iArr2 = f24483b[i4];
            char[] cArr = new char[i];
            for (int i5 = 0; i5 < i; i5++) {
                cArr[i5] = 0;
            }
            for (int i6 = 0; i6 < charSequence.length(); i6++) {
                int i7 = i - 1;
                char charAt = cArr[i7] ^ charSequence.charAt(i6);
                while (i7 > 0) {
                    if (charAt == 0 || (i3 = iArr2[i7]) == 0) {
                        cArr[i7] = cArr[i7 - 1];
                    } else {
                        char c = cArr[i7 - 1];
                        int[] iArr3 = f24485d;
                        int[] iArr4 = f24484c;
                        cArr[i7] = (char) (iArr3[(iArr4[charAt] + iArr4[i3]) % C11051p3.f31759c] ^ c);
                    }
                    i7--;
                }
                if (charAt == 0 || (i2 = iArr2[0]) == 0) {
                    cArr[0] = 0;
                } else {
                    int[] iArr5 = f24485d;
                    int[] iArr6 = f24484c;
                    cArr[0] = (char) iArr5[(iArr6[charAt] + iArr6[i2]) % C11051p3.f31759c];
                }
            }
            char[] cArr2 = new char[i];
            for (int i8 = 0; i8 < i; i8++) {
                cArr2[i8] = cArr[(i - i8) - 1];
            }
            return String.valueOf(cArr2);
        }
        throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(i)));
    }

    /* renamed from: b */
    public static String m32367b(String str, C8677k kVar) {
        if (str.length() == kVar.mo24050a()) {
            StringBuilder sb = new StringBuilder(kVar.mo24050a() + kVar.mo24051c());
            sb.append(str);
            int f = kVar.mo24028f();
            if (f == 1) {
                sb.append(m32366a(str, kVar.mo24051c()));
            } else {
                sb.setLength(sb.capacity());
                int[] iArr = new int[f];
                int[] iArr2 = new int[f];
                int i = 0;
                while (i < f) {
                    int i2 = i + 1;
                    iArr[i] = kVar.mo24027b(i2);
                    iArr2[i] = kVar.mo24052d(i2);
                    i = i2;
                }
                for (int i3 = 0; i3 < f; i3++) {
                    StringBuilder sb2 = new StringBuilder(iArr[i3]);
                    for (int i4 = i3; i4 < kVar.mo24050a(); i4 += f) {
                        sb2.append(str.charAt(i4));
                    }
                    String a = m32366a(sb2.toString(), iArr2[i3]);
                    int i5 = 0;
                    int i6 = i3;
                    while (i6 < iArr2[i3] * f) {
                        sb.setCharAt(kVar.mo24050a() + i6, a.charAt(i5));
                        i6 += f;
                        i5++;
                    }
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
    }
}
