package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;

public class AccessibilityWindowInfoCompat {

    /* renamed from: a */
    private final Object f3772a;

    /* renamed from: androidx.core.view.accessibility.AccessibilityWindowInfoCompat$a */
    private static class C1076a {
        /* renamed from: a */
        static void m4068a(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        /* renamed from: b */
        static AccessibilityWindowInfo m4069b(AccessibilityWindowInfo accessibilityWindowInfo, int i) {
            return accessibilityWindowInfo.getChild(i);
        }

        /* renamed from: c */
        static int m4070c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        /* renamed from: d */
        static int m4071d(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        /* renamed from: e */
        static int m4072e(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        /* renamed from: f */
        static AccessibilityWindowInfo m4073f(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        /* renamed from: g */
        static AccessibilityNodeInfo m4074g(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getRoot();
        }

        /* renamed from: h */
        static int m4075h(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        /* renamed from: i */
        static boolean m4076i(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        /* renamed from: j */
        static boolean m4077j(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        /* renamed from: k */
        static boolean m4078k(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        /* renamed from: l */
        static AccessibilityWindowInfo m4079l() {
            return AccessibilityWindowInfo.obtain();
        }

        /* renamed from: m */
        static AccessibilityWindowInfo m4080m(AccessibilityWindowInfo accessibilityWindowInfo) {
            return AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }
    }

    private AccessibilityWindowInfoCompat(Object obj) {
        this.f3772a = obj;
    }

    /* renamed from: i */
    private static String m4058i(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION";
    }

    /* renamed from: j */
    static AccessibilityWindowInfoCompat m4059j(Object obj) {
        if (obj != null) {
            return new AccessibilityWindowInfoCompat(obj);
        }
        return null;
    }

    /* renamed from: a */
    public void mo3655a(Rect rect) {
        C1076a.m4068a((AccessibilityWindowInfo) this.f3772a, rect);
    }

    /* renamed from: b */
    public int mo3656b() {
        return C1076a.m4070c((AccessibilityWindowInfo) this.f3772a);
    }

    /* renamed from: c */
    public int mo3657c() {
        return C1076a.m4071d((AccessibilityWindowInfo) this.f3772a);
    }

    /* renamed from: d */
    public int mo3658d() {
        return C1076a.m4072e((AccessibilityWindowInfo) this.f3772a);
    }

    /* renamed from: e */
    public AccessibilityWindowInfoCompat mo3659e() {
        return m4059j(C1076a.m4073f((AccessibilityWindowInfo) this.f3772a));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityWindowInfoCompat)) {
            return false;
        }
        AccessibilityWindowInfoCompat accessibilityWindowInfoCompat = (AccessibilityWindowInfoCompat) obj;
        Object obj2 = this.f3772a;
        if (obj2 != null) {
            return obj2.equals(accessibilityWindowInfoCompat.f3772a);
        }
        if (accessibilityWindowInfoCompat.f3772a == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int mo3661f() {
        return C1076a.m4075h((AccessibilityWindowInfo) this.f3772a);
    }

    /* renamed from: g */
    public boolean mo3662g() {
        return C1076a.m4077j((AccessibilityWindowInfo) this.f3772a);
    }

    /* renamed from: h */
    public boolean mo3663h() {
        return C1076a.m4078k((AccessibilityWindowInfo) this.f3772a);
    }

    public int hashCode() {
        Object obj = this.f3772a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        Rect rect = new Rect();
        mo3655a(rect);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=");
        sb.append(mo3657c());
        sb.append(", type=");
        sb.append(m4058i(mo3661f()));
        sb.append(", layer=");
        sb.append(mo3658d());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(mo3663h());
        sb.append(", active=");
        sb.append(mo3662g());
        sb.append(", hasParent=");
        boolean z2 = true;
        if (mo3659e() != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(", hasChildren=");
        if (mo3656b() <= 0) {
            z2 = false;
        }
        sb.append(z2);
        sb.append(']');
        return sb.toString();
    }
}
