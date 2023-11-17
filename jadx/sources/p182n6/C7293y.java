package p182n6;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C3941b;
import com.google.android.gms.common.api.C3847a;

/* renamed from: n6.y */
public final class C7293y {

    /* renamed from: a */
    private final SparseIntArray f21491a = new SparseIntArray();

    /* renamed from: b */
    private C3941b f21492b;

    public C7293y(C3941b bVar) {
        C7264i.m27902k(bVar);
        this.f21492b = bVar;
    }

    /* renamed from: a */
    public final int mo21671a(Context context, int i) {
        return this.f21491a.get(i, -1);
    }

    /* renamed from: b */
    public final int mo21672b(Context context, C3847a.C3855f fVar) {
        C7264i.m27902k(context);
        C7264i.m27902k(fVar);
        int i = 0;
        if (!fVar.mo11925i()) {
            return 0;
        }
        int q = fVar.mo7053q();
        int a = mo21671a(context, q);
        if (a == -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f21491a.size()) {
                    i = -1;
                    break;
                }
                int keyAt = this.f21491a.keyAt(i2);
                if (keyAt > q && this.f21491a.get(keyAt) == 0) {
                    break;
                }
                i2++;
            }
            if (i == -1) {
                a = this.f21492b.mo11873j(context, q);
            } else {
                a = i;
            }
            this.f21491a.put(q, a);
        }
        return a;
    }

    /* renamed from: c */
    public final void mo21673c() {
        this.f21491a.clear();
    }
}
