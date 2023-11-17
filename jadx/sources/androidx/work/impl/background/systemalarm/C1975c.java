package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.C2073m;
import androidx.work.impl.background.systemalarm.C1979g;
import java.util.ArrayList;
import java.util.List;
import p151l1.C6863c;
import p151l1.C6865e;
import p190o1.C7399v;
import p190o1.C7417y;

/* renamed from: androidx.work.impl.background.systemalarm.c */
class C1975c {

    /* renamed from: e */
    private static final String f5977e = C2073m.m8073i("ConstraintsCmdHandler");

    /* renamed from: a */
    private final Context f5978a;

    /* renamed from: b */
    private final int f5979b;

    /* renamed from: c */
    private final C1979g f5980c;

    /* renamed from: d */
    private final C6865e f5981d;

    C1975c(Context context, int i, C1979g gVar) {
        this.f5978a = context;
        this.f5979b = i;
        this.f5980c = gVar;
        this.f5981d = new C6865e(gVar.mo6791g().mo6827r(), (C6863c) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6779a() {
        List<C7399v> e = this.f5980c.mo6791g().mo6828s().mo6751N().mo21804e();
        ConstraintProxy.m7768a(this.f5978a, e);
        this.f5981d.mo20942b(e);
        ArrayList<C7399v> arrayList = new ArrayList<>(e.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (C7399v vVar : e) {
            String str = vVar.f21630a;
            if (currentTimeMillis >= vVar.mo21785c() && (!vVar.mo21790h() || this.f5981d.mo20945e(str))) {
                arrayList.add(vVar);
            }
        }
        for (C7399v vVar2 : arrayList) {
            String str2 = vVar2.f21630a;
            Intent b = C1974b.m7778b(this.f5978a, C7417y.m28225a(vVar2));
            C2073m e2 = C2073m.m8071e();
            String str3 = f5977e;
            e2.mo6959a(str3, "Creating a delay_met command for workSpec with id (" + str2 + ")");
            this.f5980c.mo6790f().mo22737a().execute(new C1979g.C1981b(this.f5980c, b, this.f5979b));
        }
        this.f5981d.mo20941a();
    }
}
