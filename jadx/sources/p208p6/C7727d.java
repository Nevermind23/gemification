package p208p6;

import android.content.Context;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.api.C3857b;
import com.google.android.gms.common.api.internal.C3892h;
import com.google.android.gms.common.internal.TelemetryData;
import p066e7.C6040d;
import p182n6.C7272m;
import p182n6.C7274n;
import p337z7.Task;

/* renamed from: p6.d */
public final class C7727d extends C3857b implements C7272m {

    /* renamed from: k */
    private static final C3847a.C3856g f22444k;

    /* renamed from: l */
    private static final C3847a.C3848a f22445l;

    /* renamed from: m */
    private static final C3847a f22446m;

    /* renamed from: n */
    public static final /* synthetic */ int f22447n = 0;

    static {
        C3847a.C3856g gVar = new C3847a.C3856g();
        f22444k = gVar;
        C7726c cVar = new C7726c();
        f22445l = cVar;
        f22446m = new C3847a("ClientTelemetry.API", cVar, gVar);
    }

    public C7727d(Context context, C7274n nVar) {
        super(context, f22446m, (C3847a.C3851d) nVar, C3857b.C3858a.f12279c);
    }

    /* renamed from: b */
    public final Task mo21643b(TelemetryData telemetryData) {
        C3892h.C3893a a = C3892h.m14753a();
        a.mo12080d(C6040d.f18823a);
        a.mo12079c(false);
        a.mo12078b(new C7725b(telemetryData));
        return mo11935k(a.mo12077a());
    }
}
