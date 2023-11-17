package p341ge.bog.sso_client.database;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p267u0.C8474h;
import p267u0.C8488q;
import p267u0.C8503w;
import p267u0.C8521z;
import p280v0.C8684b;
import p293w0.C8722b;
import p293w0.C8724d;
import p318y0.C8998i;
import p318y0.C8999j;
import ta1.C28346a;
import ta1.C28347b;

/* renamed from: ge.bog.sso_client.database.SsoDatabase_Impl */
public final class SsoDatabase_Impl extends SsoDatabase {

    /* renamed from: q */
    private volatile C28346a f63593q;

    /* renamed from: ge.bog.sso_client.database.SsoDatabase_Impl$a */
    class C24702a extends C8521z.C8523b {
        C24702a(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo6759a(C8998i iVar) {
            iVar.mo23652L("CREATE TABLE IF NOT EXISTS `app_settings` (`property_key` TEXT NOT NULL, `property_value` TEXT, PRIMARY KEY(`property_key`))");
            iVar.mo23652L("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            iVar.mo23652L("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'bbfffe27b80f716be45a0dac5cf1593b')");
        }

        /* renamed from: b */
        public void mo6760b(C8998i iVar) {
            iVar.mo23652L("DROP TABLE IF EXISTS `app_settings`");
            if (SsoDatabase_Impl.this.f24162h != null) {
                int size = SsoDatabase_Impl.this.f24162h.size();
                for (int i = 0; i < size; i++) {
                    ((C8503w.C8505b) SsoDatabase_Impl.this.f24162h.get(i)).mo23830b(iVar);
                }
            }
        }

        /* renamed from: c */
        public void mo6761c(C8998i iVar) {
            if (SsoDatabase_Impl.this.f24162h != null) {
                int size = SsoDatabase_Impl.this.f24162h.size();
                for (int i = 0; i < size; i++) {
                    ((C8503w.C8505b) SsoDatabase_Impl.this.f24162h.get(i)).mo23829a(iVar);
                }
            }
        }

        /* renamed from: d */
        public void mo6762d(C8998i iVar) {
            C8998i unused = SsoDatabase_Impl.this.f24155a = iVar;
            SsoDatabase_Impl.this.mo23819x(iVar);
            if (SsoDatabase_Impl.this.f24162h != null) {
                int size = SsoDatabase_Impl.this.f24162h.size();
                for (int i = 0; i < size; i++) {
                    ((C8503w.C8505b) SsoDatabase_Impl.this.f24162h.get(i)).mo6807c(iVar);
                }
            }
        }

        /* renamed from: e */
        public void mo6763e(C8998i iVar) {
        }

        /* renamed from: f */
        public void mo6764f(C8998i iVar) {
            C8722b.m32485b(iVar);
        }

        /* renamed from: g */
        public C8521z.C8524c mo6765g(C8998i iVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("property_key", new C8724d.C8725a("property_key", "TEXT", true, 1, (String) null, 1));
            hashMap.put("property_value", new C8724d.C8725a("property_value", "TEXT", false, 0, (String) null, 1));
            C8724d dVar = new C8724d("app_settings", hashMap, new HashSet(0), new HashSet(0));
            C8724d a = C8724d.m32489a(iVar, "app_settings");
            if (dVar.equals(a)) {
                return new C8521z.C8524c(true, (String) null);
            }
            return new C8521z.C8524c(false, "app_settings(ge.bog.sso_client.database.AppSettingsEntity).\n Expected:\n" + dVar + "\n Found:\n" + a);
        }
    }

    /* renamed from: H */
    public C28346a mo63107H() {
        C28346a aVar;
        if (this.f63593q != null) {
            return this.f63593q;
        }
        synchronized (this) {
            if (this.f63593q == null) {
                this.f63593q = new C28347b(this);
            }
            aVar = this.f63593q;
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C8488q mo6754g() {
        return new C8488q(this, new HashMap(0), new HashMap(0), "app_settings");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C8999j mo6755h(C8474h hVar) {
        return hVar.f24076c.mo6928a(C8999j.C9002b.m33315a(hVar.f24074a).mo24412d(hVar.f24075b).mo24411c(new C8521z(hVar, new C24702a(1), "bbfffe27b80f716be45a0dac5cf1593b", "cfd51e6f0eef2e3f949a72f5308b1712")).mo24410b());
    }

    /* renamed from: j */
    public List mo6756j(Map map) {
        return Arrays.asList(new C8684b[0]);
    }

    /* renamed from: p */
    public Set mo6757p() {
        return new HashSet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public Map mo6758q() {
        HashMap hashMap = new HashMap();
        hashMap.put(C28346a.class, C28347b.m86986g());
        return hashMap;
    }
}
