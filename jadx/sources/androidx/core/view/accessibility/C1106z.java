package androidx.core.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: androidx.core.view.accessibility.z */
public abstract class C1106z {

    /* renamed from: androidx.core.view.accessibility.z$a */
    static class C1107a {
        /* renamed from: a */
        static int m4114a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        /* renamed from: b */
        static int m4115b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        /* renamed from: c */
        static void m4116c(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollX(i);
        }

        /* renamed from: d */
        static void m4117d(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    /* renamed from: androidx.core.view.accessibility.z$b */
    static class C1108b {
        /* renamed from: a */
        static void m4118a(AccessibilityRecord accessibilityRecord, View view, int i) {
            accessibilityRecord.setSource(view, i);
        }
    }

    /* renamed from: a */
    public static void m4111a(AccessibilityRecord accessibilityRecord, int i) {
        C1107a.m4116c(accessibilityRecord, i);
    }

    /* renamed from: b */
    public static void m4112b(AccessibilityRecord accessibilityRecord, int i) {
        C1107a.m4117d(accessibilityRecord, i);
    }

    /* renamed from: c */
    public static void m4113c(AccessibilityRecord accessibilityRecord, View view, int i) {
        C1108b.m4118a(accessibilityRecord, view, i);
    }
}
