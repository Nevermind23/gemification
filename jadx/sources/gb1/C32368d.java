package gb1;

import kotlin.jvm.internal.C41536l;

/* renamed from: gb1.d */
public abstract class C32368d {
    /* renamed from: a */
    public static final boolean m95605a(String[] strArr, int[] iArr, String str) {
        C41536l.m120489i(strArr, "permissions");
        C41536l.m120489i(iArr, "grantResults");
        C41536l.m120489i(str, "permissionName");
        int C = C41333m.m119776C(strArr, str);
        if (C == -1 || iArr[C] != 0) {
            return false;
        }
        return true;
    }
}
