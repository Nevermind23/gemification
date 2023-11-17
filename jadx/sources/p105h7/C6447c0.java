package p105h7;

import java.io.IOException;

/* renamed from: h7.c0 */
public abstract class C6447c0 {

    /* renamed from: a */
    private static final C6447c0 f19728a = new C6443a0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b */
    private static final C6447c0 f19729b = new C6443a0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c */
    private static final C6447c0 f19730c = new C6445b0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: d */
    private static final C6447c0 f19731d = new C6445b0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* renamed from: e */
    private static final C6447c0 f19732e = new C6476z("base16()", "0123456789ABCDEF");

    C6447c0() {
    }

    /* renamed from: c */
    public static C6447c0 m25540c() {
        return f19732e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo20312a(Appendable appendable, byte[] bArr, int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo20313b(int i);

    /* renamed from: d */
    public final String mo20318d(byte[] bArr, int i, int i2) {
        C6460j.m25558e(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(mo20313b(i2));
        try {
            mo20312a(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
