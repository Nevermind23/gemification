package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.f */
final class C4022f implements DynamiteModule.C4014a {
    C4022f() {
    }

    /* renamed from: a */
    public final DynamiteModule.C4014a.C4016b mo12398a(Context context, String str, DynamiteModule.C4014a.C4015a aVar) {
        DynamiteModule.C4014a.C4016b bVar = new DynamiteModule.C4014a.C4016b();
        int a = aVar.mo12399a(context, str, false);
        bVar.f12844b = a;
        if (a == 0) {
            bVar.f12845c = 0;
        } else {
            bVar.f12845c = 1;
        }
        return bVar;
    }
}
