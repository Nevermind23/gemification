package androidx.work;

/* renamed from: androidx.work.w */
public enum C2093w {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    /* renamed from: b */
    public boolean mo6980b() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
