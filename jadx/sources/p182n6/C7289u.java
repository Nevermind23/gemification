package p182n6;

import android.content.Intent;
import p156l6.C6942g;

/* renamed from: n6.u */
final class C7289u extends C7290v {

    /* renamed from: d */
    final /* synthetic */ Intent f21480d;

    /* renamed from: e */
    final /* synthetic */ C6942g f21481e;

    C7289u(Intent intent, C6942g gVar, int i) {
        this.f21480d = intent;
        this.f21481e = gVar;
    }

    /* renamed from: a */
    public final void mo21660a() {
        Intent intent = this.f21480d;
        if (intent != null) {
            this.f21481e.startActivityForResult(intent, 2);
        }
    }
}
