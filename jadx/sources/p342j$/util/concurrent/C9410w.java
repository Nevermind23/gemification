package p342j$.util.concurrent;

import java.security.PrivilegedAction;

/* renamed from: j$.util.concurrent.w */
final class C9410w implements PrivilegedAction {
    C9410w() {
    }

    public final Object run() {
        return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
    }
}
