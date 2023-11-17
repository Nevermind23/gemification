package p273u6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p182n6.C7264i;

/* renamed from: u6.c */
public class C8639c implements ThreadFactory {

    /* renamed from: d */
    private final String f24408d;

    /* renamed from: e */
    private final AtomicInteger f24409e = new AtomicInteger();

    /* renamed from: f */
    private final ThreadFactory f24410f = Executors.defaultThreadFactory();

    public C8639c(String str) {
        C7264i.m27903l(str, "Name must not be null");
        this.f24408d = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f24410f.newThread(new C8640d(runnable, 0));
        String str = this.f24408d;
        int andIncrement = this.f24409e.getAndIncrement();
        newThread.setName(str + "[" + andIncrement + "]");
        return newThread;
    }
}
