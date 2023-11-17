package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.h */
final class C4024h implements DynamiteModule.C4014a {
    C4024h() {
    }

    /* renamed from: a */
    public final DynamiteModule.C4014a.C4016b mo12398a(Context context, String str, DynamiteModule.C4014a.C4015a aVar) {
        int i;
        DynamiteModule.C4014a.C4016b bVar = new DynamiteModule.C4014a.C4016b();
        int b = aVar.mo12400b(context, str);
        bVar.f12843a = b;
        int i2 = 0;
        if (b != 0) {
            i = aVar.mo12399a(context, str, false);
            bVar.f12844b = i;
        } else {
            i = aVar.mo12399a(context, str, true);
            bVar.f12844b = i;
        }
        int i3 = bVar.f12843a;
        if (i3 != 0) {
            i2 = i3;
        } else if (i == 0) {
            bVar.f12845c = 0;
            return bVar;
        }
        if (i2 >= i) {
            bVar.f12845c = -1;
        } else {
            bVar.f12845c = 1;
        }
        return bVar;
    }
}
