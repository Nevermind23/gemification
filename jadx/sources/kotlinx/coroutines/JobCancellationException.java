package kotlinx.coroutines;

import ef1.C40845o1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C41536l;

public final class JobCancellationException extends CancellationException {

    /* renamed from: d */
    public final transient C40845o1 f97720d;

    public JobCancellationException(String str, Throwable th, C40845o1 o1Var) {
        super(str);
        this.f97720d = o1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!C41536l.m120484d(jobCancellationException.getMessage(), getMessage()) || !C41536l.m120484d(jobCancellationException.f97720d, this.f97720d) || !C41536l.m120484d(jobCancellationException.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        C41536l.m120486f(message);
        int hashCode = ((message.hashCode() * 31) + this.f97720d.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    public String toString() {
        return super.toString() + "; job=" + this.f97720d;
    }
}
