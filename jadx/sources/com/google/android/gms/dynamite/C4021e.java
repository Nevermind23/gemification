package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.e */
final class C4021e implements DynamiteModule.C4014a {
    C4021e() {
    }

    /* renamed from: a */
    public final DynamiteModule.C4014a.C4016b mo12398a(Context context, String str, DynamiteModule.C4014a.C4015a aVar) {
        DynamiteModule.C4014a.C4016b bVar = new DynamiteModule.C4014a.C4016b();
        int b = aVar.mo12400b(context, str);
        bVar.f12843a = b;
        if (b != 0) {
            bVar.f12845c = -1;
        } else {
            int a = aVar.mo12399a(context, str, true);
            bVar.f12844b = a;
            if (a != 0) {
                bVar.f12845c = 1;
            }
        }
        return bVar;
    }
}
