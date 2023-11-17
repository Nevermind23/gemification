package ug1;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ug1.d */
public class C43105d implements ThreadFactory {

    /* renamed from: d */
    private final ThreadFactory f100562d = Executors.defaultThreadFactory();

    /* renamed from: e */
    private final AtomicInteger f100563e = new AtomicInteger(1);

    /* renamed from: f */
    private final String f100564f;

    public C43105d(String str) {
        this.f100564f = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f100562d.newThread(runnable);
        newThread.setName(this.f100564f + "-" + this.f100563e);
        return newThread;
    }
}
