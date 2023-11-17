package dagger.hilt.android.internal.managers;

import p627uf.C18154b;

/* renamed from: dagger.hilt.android.internal.managers.d */
public final class C12063d implements C18154b {

    /* renamed from: d */
    private volatile Object f35464d;

    /* renamed from: e */
    private final Object f35465e = new Object();

    /* renamed from: f */
    private final C12065f f35466f;

    public C12063d(C12065f fVar) {
        this.f35466f = fVar;
    }

    public Object generatedComponent() {
        if (this.f35464d == null) {
            synchronized (this.f35465e) {
                if (this.f35464d == null) {
                    this.f35464d = this.f35466f.get();
                }
            }
        }
        return this.f35464d;
    }
}
