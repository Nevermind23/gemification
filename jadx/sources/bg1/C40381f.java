package bg1;

import dg1.C40672b;
import kotlin.jvm.internal.C41536l;

/* renamed from: bg1.f */
public final class C40381f {

    /* renamed from: a */
    public static final C40381f f95933a = new C40381f();

    private C40381f() {
    }

    /* renamed from: a */
    public final String mo94436a(int i) {
        boolean z;
        if (i < 1000 || i >= 5000) {
            return C41536l.m120497q("Code must be in range [1000,5000): ", Integer.valueOf(i));
        }
        boolean z2 = true;
        if (1004 > i || i >= 1007) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (1015 > i || i >= 3000) {
                z2 = false;
            }
            if (!z2) {
                return null;
            }
        }
        return "Code " + i + " is reserved and may not be used.";
    }

    /* renamed from: b */
    public final void mo94437b(C40672b.C40673a aVar, byte[] bArr) {
        C41536l.m120489i(aVar, "cursor");
        C41536l.m120489i(bArr, "key");
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = aVar.f96320h;
            int i2 = aVar.f96321i;
            int i3 = aVar.f96322j;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
        } while (aVar.mo94778k() != -1);
    }

    /* renamed from: c */
    public final void mo94438c(int i) {
        boolean z;
        String a = mo94436a(i);
        if (a == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C41536l.m120486f(a);
            throw new IllegalArgumentException(a.toString());
        }
    }
}
