package androidx.activity;

/* renamed from: androidx.activity.b */
public final /* synthetic */ class C0146b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ComponentActivity f1031d;

    public /* synthetic */ C0146b(ComponentActivity componentActivity) {
        this.f1031d = componentActivity;
    }

    public final void run() {
        this.f1031d.invalidateMenu();
    }
}
