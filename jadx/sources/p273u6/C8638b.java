package p273u6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p182n6.C7264i;

/* renamed from: u6.b */
public class C8638b implements ThreadFactory {

    /* renamed from: d */
    private final String f24406d;

    /* renamed from: e */
    private final ThreadFactory f24407e = Executors.defaultThreadFactory();

    public C8638b(String str) {
        C7264i.m27903l(str, "Name must not be null");
        this.f24406d = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f24407e.newThread(new C8640d(runnable, 0));
        newThread.setName(this.f24406d);
        return newThread;
    }
}
