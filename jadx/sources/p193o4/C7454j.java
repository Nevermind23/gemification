package p193o4;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.C2626d;
import java.util.UUID;

/* renamed from: o4.j */
class C7454j {

    /* renamed from: a */
    private Long f21735a;

    /* renamed from: b */
    private Long f21736b;

    /* renamed from: c */
    private int f21737c;

    /* renamed from: d */
    private Long f21738d;

    /* renamed from: e */
    private C7456l f21739e;

    /* renamed from: f */
    private UUID f21740f;

    public C7454j(Long l, Long l2) {
        this(l, l2, UUID.randomUUID());
    }

    /* renamed from: a */
    public static void m28337a() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C2626d.m10134e()).edit();
        edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
        edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
        edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
        edit.remove("com.facebook.appevents.SessionInfo.sessionId");
        edit.apply();
        C7456l.m28353a();
    }

    /* renamed from: h */
    public static C7454j m28338h() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C2626d.m10134e());
        long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0);
        long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0);
        String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", (String) null);
        if (j == 0 || j2 == 0 || string == null) {
            return null;
        }
        C7454j jVar = new C7454j(Long.valueOf(j), Long.valueOf(j2));
        jVar.f21737c = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
        jVar.f21739e = C7456l.m28354b();
        jVar.f21738d = Long.valueOf(System.currentTimeMillis());
        jVar.f21740f = UUID.fromString(string);
        return jVar;
    }

    /* renamed from: b */
    public long mo21860b() {
        Long l = this.f21738d;
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    /* renamed from: c */
    public int mo21861c() {
        return this.f21737c;
    }

    /* renamed from: d */
    public UUID mo21862d() {
        return this.f21740f;
    }

    /* renamed from: e */
    public Long mo21863e() {
        return this.f21736b;
    }

    /* renamed from: f */
    public long mo21864f() {
        Long l;
        if (this.f21735a == null || (l = this.f21736b) == null) {
            return 0;
        }
        return l.longValue() - this.f21735a.longValue();
    }

    /* renamed from: g */
    public C7456l mo21865g() {
        return this.f21739e;
    }

    /* renamed from: i */
    public void mo21866i() {
        this.f21737c++;
    }

    /* renamed from: j */
    public void mo21867j(Long l) {
        this.f21736b = l;
    }

    /* renamed from: k */
    public void mo21868k() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C2626d.m10134e()).edit();
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", this.f21735a.longValue());
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", this.f21736b.longValue());
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f21737c);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f21740f.toString());
        edit.apply();
        C7456l lVar = this.f21739e;
        if (lVar != null) {
            lVar.mo21869c();
        }
    }

    public C7454j(Long l, Long l2, UUID uuid) {
        this.f21735a = l;
        this.f21736b = l2;
        this.f21740f = uuid;
    }
}
