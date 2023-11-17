package com.google.gson;

import com.google.gson.internal.bind.C5555b;
import java.io.IOException;
import p328ya.C9143a;
import p328ya.C9145b;
import p328ya.C9146c;

public abstract class TypeAdapter {
    /* renamed from: a */
    public final TypeAdapter mo18199a() {
        return new TypeAdapter() {
            /* renamed from: b */
            public Object mo18185b(C9143a aVar) {
                if (aVar.mo18348n0() != C9145b.NULL) {
                    return TypeAdapter.this.mo18185b(aVar);
                }
                aVar.mo18344f0();
                return null;
            }

            /* renamed from: d */
            public void mo18186d(C9146c cVar, Object obj) {
                if (obj == null) {
                    cVar.mo18359Q();
                } else {
                    TypeAdapter.this.mo18186d(cVar, obj);
                }
            }
        };
    }

    /* renamed from: b */
    public abstract Object mo18185b(C9143a aVar);

    /* renamed from: c */
    public final C5494h mo18200c(Object obj) {
        try {
            C5555b bVar = new C5555b();
            mo18186d(bVar, obj);
            return bVar.mo18358K0();
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    /* renamed from: d */
    public abstract void mo18186d(C9146c cVar, Object obj);
}
