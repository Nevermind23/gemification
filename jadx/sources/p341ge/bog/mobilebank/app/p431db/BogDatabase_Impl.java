package p341ge.bog.mobilebank.app.p431db;

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
import wc0.C29300a;
import wc0.C29305c;

/* renamed from: ge.bog.mobilebank.app.db.BogDatabase_Impl */
public final class BogDatabase_Impl extends BogDatabase {

    /* renamed from: r */
    private volatile C29300a f40629r;

    /* renamed from: ge.bog.mobilebank.app.db.BogDatabase_Impl$a */
    class C13581a extends C8521z.C8523b {
        C13581a(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo6759a(C8998i iVar) {
            iVar.mo23652L("CREATE TABLE IF NOT EXISTS `CommonDictionary` (`key` TEXT NOT NULL, `segment` TEXT NOT NULL, `valueEn` TEXT, `valueGe` TEXT, PRIMARY KEY(`key`))");
            iVar.mo23652L("CREATE TABLE IF NOT EXISTS `PaymentsDictionary` (`key` TEXT NOT NULL, `segment` TEXT NOT NULL, `valueEn` TEXT, `valueGe` TEXT, PRIMARY KEY(`key`))");
            iVar.mo23652L("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            iVar.mo23652L("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c3d4f88fef45b7a92d654b0cb7ebfe3a')");
        }

        /* renamed from: b */
        public void mo6760b(C8998i iVar) {
            iVar.mo23652L("DROP TABLE IF EXISTS `CommonDictionary`");
            iVar.mo23652L("DROP TABLE IF EXISTS `PaymentsDictionary`");
            if (BogDatabase_Impl.this.f24162h != null) {
                int size = BogDatabase_Impl.this.f24162h.size();
                for (int i = 0; i < size; i++) {
                    ((C8503w.C8505b) BogDatabase_Impl.this.f24162h.get(i)).mo23830b(iVar);
                }
            }
        }

        /* renamed from: c */
        public void mo6761c(C8998i iVar) {
            if (BogDatabase_Impl.this.f24162h != null) {
                int size = BogDatabase_Impl.this.f24162h.size();
                for (int i = 0; i < size; i++) {
                    ((C8503w.C8505b) BogDatabase_Impl.this.f24162h.get(i)).mo23829a(iVar);
                }
            }
        }

        /* renamed from: d */
        public void mo6762d(C8998i iVar) {
            C8998i unused = BogDatabase_Impl.this.f24155a = iVar;
            BogDatabase_Impl.this.mo23819x(iVar);
            if (BogDatabase_Impl.this.f24162h != null) {
                int size = BogDatabase_Impl.this.f24162h.size();
                for (int i = 0; i < size; i++) {
                    ((C8503w.C8505b) BogDatabase_Impl.this.f24162h.get(i)).mo6807c(iVar);
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
            C8998i iVar2 = iVar;
            HashMap hashMap = new HashMap(4);
            hashMap.put("key", new C8724d.C8725a("key", "TEXT", true, 1, (String) null, 1));
            hashMap.put("segment", new C8724d.C8725a("segment", "TEXT", true, 0, (String) null, 1));
            hashMap.put("valueEn", new C8724d.C8725a("valueEn", "TEXT", false, 0, (String) null, 1));
            hashMap.put("valueGe", new C8724d.C8725a("valueGe", "TEXT", false, 0, (String) null, 1));
            C8724d dVar = new C8724d("CommonDictionary", hashMap, new HashSet(0), new HashSet(0));
            C8724d a = C8724d.m32489a(iVar2, "CommonDictionary");
            if (!dVar.equals(a)) {
                return new C8521z.C8524c(false, "CommonDictionary(ge.bog.mobilebank.dictionary.db.entity.CommonDictionaryEntity).\n Expected:\n" + dVar + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(4);
            hashMap2.put("key", new C8724d.C8725a("key", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("segment", new C8724d.C8725a("segment", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("valueEn", new C8724d.C8725a("valueEn", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("valueGe", new C8724d.C8725a("valueGe", "TEXT", false, 0, (String) null, 1));
            C8724d dVar2 = new C8724d("PaymentsDictionary", hashMap2, new HashSet(0), new HashSet(0));
            C8724d a2 = C8724d.m32489a(iVar2, "PaymentsDictionary");
            if (dVar2.equals(a2)) {
                return new C8521z.C8524c(true, (String) null);
            }
            return new C8521z.C8524c(false, "PaymentsDictionary(ge.bog.mobilebank.dictionary.db.entity.PaymentsDictionaryEntity).\n Expected:\n" + dVar2 + "\n Found:\n" + a2);
        }
    }

    /* renamed from: H */
    public C29300a mo37174H() {
        C29300a aVar;
        if (this.f40629r != null) {
            return this.f40629r;
        }
        synchronized (this) {
            if (this.f40629r == null) {
                this.f40629r = new C29305c(this);
            }
            aVar = this.f40629r;
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C8488q mo6754g() {
        return new C8488q(this, new HashMap(0), new HashMap(0), "CommonDictionary", "PaymentsDictionary");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C8999j mo6755h(C8474h hVar) {
        return hVar.f24076c.mo6928a(C8999j.C9002b.m33315a(hVar.f24074a).mo24412d(hVar.f24075b).mo24411c(new C8521z(hVar, new C13581a(30), "c3d4f88fef45b7a92d654b0cb7ebfe3a", "d5acdb41ef38b109f1cc57fe1c36f6dc")).mo24410b());
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
        hashMap.put(C29300a.class, C29305c.m89367q());
        return hashMap;
    }
}
