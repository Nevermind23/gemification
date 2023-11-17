package p029bb;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: bb.a */
public abstract class C2200a implements C2201b {

    /* renamed from: a */
    private final ReadWriteLock f6412a = new ReentrantReadWriteLock();

    public void lock() {
        this.f6412a.writeLock().lock();
    }

    public void unlock() {
        this.f6412a.writeLock().unlock();
    }
}
