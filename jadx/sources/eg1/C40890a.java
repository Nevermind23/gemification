package eg1;

import dg1.C40672b;
import dg1.C40680d0;
import dg1.C40683e0;
import dg1.C40694p;
import dg1.C40701u;
import kotlin.jvm.internal.C41536l;

/* renamed from: eg1.a */
public abstract class C40890a {

    /* renamed from: a */
    private static final byte[] f96615a = C40680d0.m117694a("0123456789abcdef");

    /* renamed from: a */
    public static final C40672b.C40673a m118619a(C40672b bVar, C40672b.C40673a aVar) {
        boolean z;
        C41536l.m120489i(bVar, "<this>");
        C41536l.m120489i(aVar, "unsafeCursor");
        C40672b.C40673a e = C40683e0.m117732e(aVar);
        if (e.f96316d == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            e.f96316d = bVar;
            e.f96317e = true;
            return e;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    /* renamed from: b */
    public static final byte[] m118620b() {
        return f96615a;
    }

    /* renamed from: c */
    public static final boolean m118621c(C40701u uVar, int i, byte[] bArr, int i2, int i3) {
        C41536l.m120489i(uVar, "segment");
        C41536l.m120489i(bArr, "bytes");
        int i4 = uVar.f96373c;
        byte[] bArr2 = uVar.f96371a;
        while (i2 < i3) {
            if (i == i4) {
                uVar = uVar.f96376f;
                C41536l.m120486f(uVar);
                byte[] bArr3 = uVar.f96371a;
                int i5 = uVar.f96372b;
                bArr2 = bArr3;
                i = i5;
                i4 = uVar.f96373c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* renamed from: d */
    public static final String m118622d(C40672b bVar, long j) {
        C41536l.m120489i(bVar, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (bVar.mo94764t(j2) == ((byte) 13)) {
                String G0 = bVar.mo94701G0(j2);
                bVar.skip(2);
                return G0;
            }
        }
        String G02 = bVar.mo94701G0(j);
        bVar.skip(1);
        return G02;
    }

    /* renamed from: e */
    public static final int m118623e(C40672b bVar, C40694p pVar, boolean z) {
        int i;
        int i2;
        boolean z2;
        int i3;
        C40701u uVar;
        int i4;
        C40672b bVar2 = bVar;
        C41536l.m120489i(bVar2, "<this>");
        C41536l.m120489i(pVar, "options");
        C40701u uVar2 = bVar2.f96314d;
        if (uVar2 != null) {
            byte[] bArr = uVar2.f96371a;
            int i5 = uVar2.f96372b;
            int i6 = uVar2.f96373c;
            int[] l = pVar.mo94838l();
            C40701u uVar3 = uVar2;
            int i7 = -1;
            int i8 = 0;
            loop0:
            while (true) {
                int i9 = i8 + 1;
                int i12 = l[i8];
                int i13 = i9 + 1;
                int i14 = l[i9];
                if (i14 != -1) {
                    i7 = i14;
                }
                if (uVar3 == null) {
                    break;
                }
                if (i12 < 0) {
                    int i15 = i13 + (i12 * -1);
                    while (true) {
                        int i16 = i5 + 1;
                        int i17 = i13 + 1;
                        if ((bArr[i5] & 255) != l[i13]) {
                            return i7;
                        }
                        if (i17 == i15) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i16 == i6) {
                            C41536l.m120486f(uVar3);
                            C40701u uVar4 = uVar3.f96376f;
                            C41536l.m120486f(uVar4);
                            i4 = uVar4.f96372b;
                            byte[] bArr2 = uVar4.f96371a;
                            i3 = uVar4.f96373c;
                            if (uVar4 != uVar2) {
                                byte[] bArr3 = bArr2;
                                uVar = uVar4;
                                bArr = bArr3;
                            } else if (!z2) {
                                break loop0;
                            } else {
                                bArr = bArr2;
                                uVar = null;
                            }
                        } else {
                            C40701u uVar5 = uVar3;
                            i3 = i6;
                            i4 = i16;
                            uVar = uVar5;
                        }
                        if (z2) {
                            i2 = l[i17];
                            i = i4;
                            i6 = i3;
                            uVar3 = uVar;
                            break;
                        }
                        i5 = i4;
                        i6 = i3;
                        i13 = i17;
                        uVar3 = uVar;
                    }
                } else {
                    i = i5 + 1;
                    byte b = bArr[i5] & 255;
                    int i18 = i13 + i12;
                    while (i13 != i18) {
                        if (b == l[i13]) {
                            i2 = l[i13 + i12];
                            if (i == i6) {
                                uVar3 = uVar3.f96376f;
                                C41536l.m120486f(uVar3);
                                i = uVar3.f96372b;
                                bArr = uVar3.f96371a;
                                i6 = uVar3.f96373c;
                                if (uVar3 == uVar2) {
                                    uVar3 = null;
                                }
                            }
                        } else {
                            i13++;
                        }
                    }
                    return i7;
                }
                if (i2 >= 0) {
                    return i2;
                }
                i8 = -i2;
                i5 = i;
            }
            if (z) {
                return -2;
            }
            return i7;
        } else if (z) {
            return -2;
        } else {
            return -1;
        }
    }

    /* renamed from: f */
    public static /* synthetic */ int m118624f(C40672b bVar, C40694p pVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m118623e(bVar, pVar, z);
    }
}
