package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.e */
public class C2387e {

    /* renamed from: a */
    private final Map f7577a;

    /* renamed from: com.bumptech.glide.e$a */
    static final class C2388a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Map f7578a = new HashMap();

        C2388a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C2387e mo7711b() {
            return new C2387e(this);
        }
    }

    C2387e(C2388a aVar) {
        this.f7577a = Collections.unmodifiableMap(new HashMap(aVar.f7578a));
    }

    /* renamed from: a */
    public boolean mo7710a(Class cls) {
        return this.f7577a.containsKey(cls);
    }
}
