package androidx.lifecycle;

import ef1.C40814h0;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C41536l;
import me1.C41752f;

/* renamed from: androidx.lifecycle.d */
public final class C1571d implements Closeable, C40814h0 {

    /* renamed from: d */
    private final C41752f f4578d;

    public C1571d(C41752f fVar) {
        C41536l.m120489i(fVar, "context");
        this.f4578d = fVar;
    }

    /* renamed from: Q */
    public C41752f mo4808Q() {
        return this.f4578d;
    }

    public void close() {
        C40865t1.m118462d(mo4808Q(), (CancellationException) null, 1, (Object) null);
    }
}
