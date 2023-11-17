package p342j$.util;

import java.security.AccessController;

/* renamed from: j$.util.g0 */
abstract class C9500g0 {

    /* renamed from: a */
    static final boolean f26146a = ((Boolean) AccessController.doPrivileged(new C9419f0())).booleanValue();

    /* renamed from: a */
    static void m34857a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
