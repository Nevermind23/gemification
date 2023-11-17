package p052d6;

import android.content.Context;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.api.C3857b;
import p337z7.Task;

/* renamed from: d6.b */
public abstract class C5840b extends C3857b {

    /* renamed from: k */
    private static final C3847a.C3856g f18360k;

    /* renamed from: l */
    private static final C3847a.C3848a f18361l;

    /* renamed from: m */
    private static final C3847a f18362m;

    static {
        C3847a.C3856g gVar = new C3847a.C3856g();
        f18360k = gVar;
        C5841c cVar = new C5841c();
        f18361l = cVar;
        f18362m = new C3847a("SmsRetriever.API", cVar, gVar);
    }

    public C5840b(Context context) {
        super(context, f18362m, (C3847a.C3851d) C3847a.C3851d.f12268T2, C3857b.C3858a.f12279c);
    }

    /* renamed from: A */
    public abstract Task mo19060A();
}
