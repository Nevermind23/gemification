package p089g4;

/* renamed from: g4.f */
public abstract class C6215f {

    /* renamed from: g4.f$a */
    class C6216a implements C6217b {

        /* renamed from: a */
        private volatile Object f19231a;

        /* renamed from: b */
        final /* synthetic */ C6217b f19232b;

        C6216a(C6217b bVar) {
            this.f19232b = bVar;
        }

        public Object get() {
            if (this.f19231a == null) {
                synchronized (this) {
                    if (this.f19231a == null) {
                        this.f19231a = C6223k.m24730d(this.f19232b.get());
                    }
                }
            }
            return this.f19231a;
        }
    }

    /* renamed from: g4.f$b */
    public interface C6217b {
        Object get();
    }

    /* renamed from: a */
    public static C6217b m24712a(C6217b bVar) {
        return new C6216a(bVar);
    }
}
