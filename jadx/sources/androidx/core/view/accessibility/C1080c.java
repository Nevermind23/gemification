package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager;

/* renamed from: androidx.core.view.accessibility.c */
public abstract class C1080c {

    /* renamed from: androidx.core.view.accessibility.c$a */
    static class C1081a {
        /* renamed from: a */
        static boolean m4087a(AccessibilityManager accessibilityManager, C1082b bVar) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new C1083c(bVar));
        }

        /* renamed from: b */
        static boolean m4088b(AccessibilityManager accessibilityManager, C1082b bVar) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new C1083c(bVar));
        }
    }

    /* renamed from: androidx.core.view.accessibility.c$b */
    public interface C1082b {
        void onTouchExplorationStateChanged(boolean z);
    }

    /* renamed from: androidx.core.view.accessibility.c$c */
    private static final class C1083c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a */
        final C1082b f3776a;

        C1083c(C1082b bVar) {
            this.f3776a = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1083c)) {
                return false;
            }
            return this.f3776a.equals(((C1083c) obj).f3776a);
        }

        public int hashCode() {
            return this.f3776a.hashCode();
        }

        public void onTouchExplorationStateChanged(boolean z) {
            this.f3776a.onTouchExplorationStateChanged(z);
        }
    }

    /* renamed from: a */
    public static boolean m4085a(AccessibilityManager accessibilityManager, C1082b bVar) {
        return C1081a.m4087a(accessibilityManager, bVar);
    }

    /* renamed from: b */
    public static boolean m4086b(AccessibilityManager accessibilityManager, C1082b bVar) {
        return C1081a.m4088b(accessibilityManager, bVar);
    }
}
