package p531ng;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: ng.b */
public final /* synthetic */ class C16922b implements Callable {

    /* renamed from: d */
    public final /* synthetic */ Context f47263d;

    /* renamed from: e */
    public final /* synthetic */ Uri f47264e;

    /* renamed from: f */
    public final /* synthetic */ C16931k f47265f;

    public /* synthetic */ C16922b(Context context, Uri uri, C16931k kVar) {
        this.f47263d = context;
        this.f47264e = uri;
        this.f47265f = kVar;
    }

    public final Object call() {
        return C16931k.m59539uw(this.f47263d, this.f47264e, this.f47265f);
    }
}
