package p260t6;

/* renamed from: t6.k */
public abstract class C8409k {

    /* renamed from: a */
    private static final char[] f23856a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    private static final char[] f23857b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m31555a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length + length)];
        int i = 0;
        for (byte b : bArr) {
            byte b2 = b & 255;
            int i2 = i + 1;
            char[] cArr2 = f23857b;
            cArr[i] = cArr2[b2 >>> 4];
            cArr[i2] = cArr2[b2 & 15];
            i = i2 + 1;
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public static String m31556b(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        int i = 0;
        while (i < length && (!z || i != length - 1 || (bArr[i] & 255) != 0)) {
            char[] cArr = f23856a;
            sb.append(cArr[(bArr[i] & 240) >>> 4]);
            sb.append(cArr[bArr[i] & 15]);
            i++;
        }
        return sb.toString();
    }
}
