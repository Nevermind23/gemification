package se1;

import java.io.Closeable;

/* renamed from: se1.b */
public abstract class C42550b {
    /* renamed from: a */
    public static final void m123187a(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            C41211b.m119461a(th, th2);
        }
    }
}
