package p095ga;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.C5270e;
import com.google.firebase.perf.config.C5380a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import java.util.HashMap;
import java.util.Map;
import p134ja.C6763a;
import p134ja.C6764b;
import p199oa.C7506k;
import p212pa.C7783f;
import p327y9.C9142b;
import p339z9.C9270e;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: ga.e */
public class C6401e {

    /* renamed from: i */
    private static final C6763a f19638i = C6763a.m26371e();

    /* renamed from: a */
    private final Map f19639a = new ConcurrentHashMap();

    /* renamed from: b */
    private final C5380a f19640b;

    /* renamed from: c */
    private final C7783f f19641c;

    /* renamed from: d */
    private Boolean f19642d = null;

    /* renamed from: e */
    private final C5270e f19643e;

    /* renamed from: f */
    private final C9142b f19644f;

    /* renamed from: g */
    private final C9270e f19645g;

    /* renamed from: h */
    private final C9142b f19646h;

    C6401e(C5270e eVar, C9142b bVar, C9270e eVar2, C9142b bVar2, RemoteConfigManager remoteConfigManager, C5380a aVar, SessionManager sessionManager) {
        this.f19643e = eVar;
        this.f19644f = bVar;
        this.f19645g = eVar2;
        this.f19646h = bVar2;
        if (eVar == null) {
            this.f19642d = Boolean.FALSE;
            this.f19640b = aVar;
            this.f19641c = new C7783f(new Bundle());
            return;
        }
        C7506k.m28498k().mo21947r(eVar, eVar2, bVar2);
        Context j = eVar.mo17481j();
        C7783f a = m25444a(j);
        this.f19641c = a;
        remoteConfigManager.setFirebaseRemoteConfigProvider(bVar);
        this.f19640b = aVar;
        aVar.mo17720P(a);
        aVar.mo17719O(j);
        sessionManager.setApplicationContext(j);
        this.f19642d = aVar.mo17725j();
        C6763a aVar2 = f19638i;
        if (aVar2.mo20810h() && mo20284d()) {
            aVar2.mo20808f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", new Object[]{C6764b.m26383b(eVar.mo17483n().mo17519e(), j.getPackageName())}));
        }
    }

    /* renamed from: a */
    private static C7783f m25444a(Context context) {
        Bundle bundle;
        C7783f fVar;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            Log.d("isEnabled", "No perf enable meta data found " + e.getMessage());
            bundle = null;
        }
        if (bundle == null) {
            fVar = new C7783f();
        }
        return fVar;
    }

    /* renamed from: c */
    public static C6401e m25445c() {
        return (C6401e) C5270e.m20805l().mo17480i(C6401e.class);
    }

    /* renamed from: b */
    public Map mo20283b() {
        return new HashMap(this.f19639a);
    }

    /* renamed from: d */
    public boolean mo20284d() {
        Boolean bool = this.f19642d;
        if (bool != null) {
            return bool.booleanValue();
        }
        return C5270e.m20805l().mo17485t();
    }
}
