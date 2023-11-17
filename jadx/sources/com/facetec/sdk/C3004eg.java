package com.facetec.sdk;

import java.io.IOException;

/* renamed from: com.facetec.sdk.eg */
public abstract class C3004eg<T> {
    /* renamed from: b */
    public abstract void mo8991b(C3160gb gbVar, T t);

    /* renamed from: c */
    public final C3004eg<T> mo9185c() {
        return new C3004eg<T>() {
            /* renamed from: b */
            public final void mo8991b(C3160gb gbVar, T t) {
                if (t == null) {
                    gbVar.mo9318f();
                } else {
                    C3004eg.this.mo8991b(gbVar, t);
                }
            }

            /* renamed from: d */
            public final T mo8992d(C3143fx fxVar) {
                if (fxVar.mo9292f() != C3141fv.NULL) {
                    return C3004eg.this.mo8992d(fxVar);
                }
                fxVar.mo9298l();
                return null;
            }
        };
    }

    /* renamed from: d */
    public abstract T mo8992d(C3143fx fxVar);

    /* renamed from: e */
    public final C3000ee mo9186e(T t) {
        try {
            C3080fi fiVar = new C3080fi();
            mo8991b(fiVar, t);
            return fiVar.mo9309b();
        } catch (IOException e) {
            throw new C2997eb((Throwable) e);
        }
    }
}
