package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.internal.C3958b;
import java.util.ArrayList;
import java.util.Map;
import p156l6.C6962q;
import p182n6.C7293y;

/* renamed from: com.google.android.gms.common.api.internal.v */
final class C3931v extends C3869a0 {

    /* renamed from: e */
    private final Map f12538e;

    /* renamed from: f */
    final /* synthetic */ C3872b0 f12539f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3931v(C3872b0 b0Var, Map map) {
        super(b0Var, (C6962q) null);
        this.f12539f = b0Var;
        this.f12538e = map;
    }

    /* renamed from: a */
    public final void mo12005a() {
        C7293y yVar = new C7293y(this.f12539f.f12329d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C3847a.C3855f fVar : this.f12538e.keySet()) {
            if (!fVar.mo11925i() || ((C3925s) this.f12538e.get(fVar)).f12521c) {
                arrayList2.add(fVar);
            } else {
                arrayList.add(fVar);
            }
        }
        int i = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i2 < size) {
                i = yVar.mo21672b(this.f12539f.f12328c, (C3847a.C3855f) arrayList.get(i2));
                i2++;
                if (i != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i2 < size2) {
                i = yVar.mo21672b(this.f12539f.f12328c, (C3847a.C3855f) arrayList2.get(i2));
                i2++;
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            ConnectionResult connectionResult = new ConnectionResult(i, (PendingIntent) null);
            C3872b0 b0Var = this.f12539f;
            b0Var.f12326a.mo12105n(new C3927t(this, b0Var, connectionResult));
            return;
        }
        C3872b0 b0Var2 = this.f12539f;
        if (b0Var2.f12338m && b0Var2.f12336k != null) {
            b0Var2.f12336k.mo14999l();
        }
        for (C3847a.C3855f fVar2 : this.f12538e.keySet()) {
            C3958b.C3961c cVar = (C3958b.C3961c) this.f12538e.get(fVar2);
            if (!fVar2.mo11925i() || yVar.mo21672b(this.f12539f.f12328c, fVar2) == 0) {
                fVar2.mo11924h(cVar);
            } else {
                C3872b0 b0Var3 = this.f12539f;
                b0Var3.f12326a.mo12105n(new C3929u(this, b0Var3, cVar));
            }
        }
    }
}
