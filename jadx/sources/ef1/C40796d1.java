package ef1;

import java.util.concurrent.CancellationException;

/* renamed from: ef1.d1 */
public abstract class C40796d1 {
    /* renamed from: a */
    public static final CancellationException m118280a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
