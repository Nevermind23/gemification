package p179n3;

import android.net.Uri;

/* renamed from: n3.b */
public abstract class C7220b {
    /* renamed from: a */
    public static boolean m27784a(Uri uri) {
        return m27785b(uri) && !m27788e(uri);
    }

    /* renamed from: b */
    public static boolean m27785b(Uri uri) {
        if (uri == null || !"content".equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m27786c(Uri uri) {
        return m27785b(uri) && m27788e(uri);
    }

    /* renamed from: d */
    public static boolean m27787d(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: e */
    private static boolean m27788e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
