package p121ia;

import com.google.firebase.C5270e;
import com.google.firebase.perf.config.C5380a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import p327y9.C9142b;
import p339z9.C9270e;

/* renamed from: ia.a */
public class C6620a {

    /* renamed from: a */
    private final C5270e f20125a;

    /* renamed from: b */
    private final C9270e f20126b;

    /* renamed from: c */
    private final C9142b f20127c;

    /* renamed from: d */
    private final C9142b f20128d;

    public C6620a(C5270e eVar, C9270e eVar2, C9142b bVar, C9142b bVar2) {
        this.f20125a = eVar;
        this.f20126b = eVar2;
        this.f20127c = bVar;
        this.f20128d = bVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5380a mo20645a() {
        return C5380a.m21272g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5270e mo20646b() {
        return this.f20125a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C9270e mo20647c() {
        return this.f20126b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C9142b mo20648d() {
        return this.f20127c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public RemoteConfigManager mo20649e() {
        return RemoteConfigManager.getInstance();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public SessionManager mo20650f() {
        return SessionManager.getInstance();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C9142b mo20651g() {
        return this.f20128d;
    }
}
