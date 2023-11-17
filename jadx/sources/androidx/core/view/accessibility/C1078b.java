package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: androidx.core.view.accessibility.b */
public abstract class C1078b {

    /* renamed from: androidx.core.view.accessibility.b$a */
    static class C1079a {
        /* renamed from: a */
        static int m4083a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        /* renamed from: b */
        static void m4084b(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: a */
    public static int m4081a(AccessibilityEvent accessibilityEvent) {
        return C1079a.m4083a(accessibilityEvent);
    }

    /* renamed from: b */
    public static void m4082b(AccessibilityEvent accessibilityEvent, int i) {
        C1079a.m4084b(accessibilityEvent, i);
    }
}
