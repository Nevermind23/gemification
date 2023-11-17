package kotlinx.coroutines.scheduling;

/* renamed from: kotlinx.coroutines.scheduling.c */
public final class C41634c extends C41637f {

    /* renamed from: l */
    public static final C41634c f97867l = new C41634c();

    private C41634c() {
        super(C41643l.f97879b, C41643l.f97880c, C41643l.f97881d, "DefaultDispatcher");
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public String toString() {
        return "Dispatchers.Default";
    }
}
