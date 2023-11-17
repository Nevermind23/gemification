package kotlinx.coroutines.internal;

import kotlin.jvm.internal.C41536l;
import me1.C41752f;

/* renamed from: kotlinx.coroutines.internal.g0 */
public final class C41599g0 implements C41752f.C41757c {

    /* renamed from: d */
    private final ThreadLocal f97797d;

    public C41599g0(ThreadLocal threadLocal) {
        this.f97797d = threadLocal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41599g0) && C41536l.m120484d(this.f97797d, ((C41599g0) obj).f97797d);
    }

    public int hashCode() {
        return this.f97797d.hashCode();
    }

    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f97797d + ')';
    }
}
