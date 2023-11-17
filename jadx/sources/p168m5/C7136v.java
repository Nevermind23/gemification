package p168m5;

import android.content.Context;
import java.io.Closeable;
import p272u5.C8587d;

/* renamed from: m5.v */
abstract class C7136v implements Closeable {

    /* renamed from: m5.v$a */
    interface C7137a {
        /* renamed from: a */
        C7136v mo21366a();

        /* renamed from: b */
        C7137a mo21367b(Context context);
    }

    C7136v() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C8587d mo21364a();

    public void close() {
        mo21364a().close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract C7135u mo21365k();
}
