package p342j$.util.concurrent;

/* renamed from: j$.util.concurrent.x */
final class C9411x extends ThreadLocal {
    C9411x() {
    }

    /* access modifiers changed from: protected */
    public final Object initialValue() {
        return new ThreadLocalRandom();
    }
}
