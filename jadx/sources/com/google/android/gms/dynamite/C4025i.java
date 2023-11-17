package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.i */
final class C4025i implements DynamiteModule.C4014a {
    C4025i() {
    }

    /* renamed from: a */
    public final DynamiteModule.C4014a.C4016b mo12398a(Context context, String str, DynamiteModule.C4014a.C4015a aVar) {
        DynamiteModule.C4014a.C4016b bVar = new DynamiteModule.C4014a.C4016b();
        bVar.f12843a = aVar.mo12400b(context, str);
        int a = aVar.mo12399a(context, str, true);
        bVar.f12844b = a;
        int i = bVar.f12843a;
        if (i == 0) {
            i = 0;
            if (a == 0) {
                bVar.f12845c = 0;
                return bVar;
            }
        }
        if (a >= i) {
            bVar.f12845c = 1;
        } else {
            bVar.f12845c = -1;
        }
        return bVar;
    }
}
