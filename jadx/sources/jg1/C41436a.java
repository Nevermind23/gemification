package jg1;

/* renamed from: jg1.a */
class C41436a implements Runnable, C41451k {

    /* renamed from: d */
    private final C41450j f97506d = new C41450j();

    /* renamed from: e */
    private final C41438c f97507e;

    C41436a(C41438c cVar) {
        this.f97507e = cVar;
    }

    /* renamed from: a */
    public void mo96175a(C41457p pVar, Object obj) {
        this.f97506d.mo96197a(C41449i.m120266a(pVar, obj));
        this.f97507e.mo96178d().execute(this);
    }

    public void run() {
        C41449i b = this.f97506d.mo96198b();
        if (b != null) {
            this.f97507e.mo96181h(b);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
