package p091g6;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.C3860c;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p156l6.C6950k;
import p176n0.C7186a;

/* renamed from: g6.e */
public final class C6232e extends C7186a implements C6950k {

    /* renamed from: o */
    private final Semaphore f19261o = new Semaphore(0);

    /* renamed from: p */
    private final Set f19262p;

    public C6232e(Context context, Set set) {
        super(context);
        this.f19262p = set;
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ Object mo19849A() {
        int i = 0;
        for (C3860c k : this.f19262p) {
            if (k.mo11957k(this)) {
                i++;
            }
        }
        try {
            this.f19261o.tryAcquire(i, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo19850o() {
        this.f19261o.drainPermits();
        mo21537h();
    }

    public final void onComplete() {
        this.f19261o.release();
    }
}
