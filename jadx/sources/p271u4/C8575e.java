package p271u4;

import android.content.res.Resources;

/* renamed from: u4.e */
abstract class C8575e {
    /* renamed from: a */
    private static String m32061a(int i) {
        return "#" + Integer.toHexString(i);
    }

    /* renamed from: b */
    public static String m32062b(Resources resources, int i) {
        String str;
        String str2;
        if (resources == null) {
            return m32061a(i);
        }
        if (m32064d(i) != 127) {
            str2 = resources.getResourcePackageName(i);
            str = ":";
        } else {
            str2 = "";
            str = str2;
        }
        String resourceTypeName = resources.getResourceTypeName(i);
        String resourceEntryName = resources.getResourceEntryName(i);
        StringBuilder sb = new StringBuilder(str2.length() + 1 + str.length() + resourceTypeName.length() + 1 + resourceEntryName.length());
        sb.append("@");
        sb.append(str2);
        sb.append(str);
        sb.append(resourceTypeName);
        sb.append(C11110u2.f31950c);
        sb.append(resourceEntryName);
        return sb.toString();
    }

    /* renamed from: c */
    public static String m32063c(Object obj, Resources resources, int i) {
        try {
            return m32062b(resources, i);
        } catch (Resources.NotFoundException unused) {
            return m32061a(i);
        }
    }

    /* renamed from: d */
    private static int m32064d(int i) {
        return (i >>> 24) & C11051p3.f31759c;
    }
}
