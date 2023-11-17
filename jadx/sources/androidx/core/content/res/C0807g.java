package androidx.core.content.res;

import java.lang.reflect.Array;

/* renamed from: androidx.core.content.res.g */
abstract class C0807g {
    /* renamed from: a */
    public static int[] m3023a(int[] iArr, int i, int i2) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[m3025c(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    /* renamed from: b */
    public static Object[] m3024b(Object[] objArr, int i, Object obj) {
        if (i + 1 > objArr.length) {
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), m3025c(i));
            System.arraycopy(objArr, 0, objArr2, 0, i);
            objArr = objArr2;
        }
        objArr[i] = obj;
        return objArr;
    }

    /* renamed from: c */
    public static int m3025c(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }
}
