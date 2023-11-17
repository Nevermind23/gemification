package androidx.work.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p190o1.C7362a0;
import p190o1.C7364b;
import p190o1.C7365b0;
import p190o1.C7368c;
import p190o1.C7373e;
import p190o1.C7374f;
import p190o1.C7376g;
import p190o1.C7377h;
import p190o1.C7379j;
import p190o1.C7381k;
import p190o1.C7388o;
import p190o1.C7389p;
import p190o1.C7392r;
import p190o1.C7393s;
import p190o1.C7402w;
import p190o1.C7403x;
import p267u0.C8474h;
import p267u0.C8488q;
import p267u0.C8503w;
import p267u0.C8521z;
import p280v0.C8684b;
import p293w0.C8722b;
import p293w0.C8724d;
import p318y0.C8998i;
import p318y0.C8999j;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: q */
    private volatile C7402w f5949q;

    /* renamed from: r */
    private volatile C7364b f5950r;

    /* renamed from: s */
    private volatile C7362a0 f5951s;

    /* renamed from: t */
    private volatile C7379j f5952t;

    /* renamed from: u */
    private volatile C7388o f5953u;

    /* renamed from: v */
    private volatile C7392r f5954v;

    /* renamed from: w */
    private volatile C7373e f5955w;

    /* renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    class C1966a extends C8521z.C8523b {
        C1966a(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo6759a(C8998i iVar) {
            iVar.mo23652L("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            iVar.mo23652L("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            iVar.mo23652L("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            iVar.mo23652L("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            iVar.mo23652L("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            iVar.mo23652L("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            iVar.mo23652L("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            iVar.mo23652L("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            iVar.mo23652L("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            iVar.mo23652L("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            iVar.mo23652L("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            iVar.mo23652L("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            iVar.mo23652L("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            iVar.mo23652L("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            iVar.mo23652L("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
        }

        /* renamed from: b */
        public void mo6760b(C8998i iVar) {
            iVar.mo23652L("DROP TABLE IF EXISTS `Dependency`");
            iVar.mo23652L("DROP TABLE IF EXISTS `WorkSpec`");
            iVar.mo23652L("DROP TABLE IF EXISTS `WorkTag`");
            iVar.mo23652L("DROP TABLE IF EXISTS `SystemIdInfo`");
            iVar.mo23652L("DROP TABLE IF EXISTS `WorkName`");
            iVar.mo23652L("DROP TABLE IF EXISTS `WorkProgress`");
            iVar.mo23652L("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.f24162h != null) {
                int size = WorkDatabase_Impl.this.f24162h.size();
                for (int i = 0; i < size; i++) {
                    ((C8503w.C8505b) WorkDatabase_Impl.this.f24162h.get(i)).mo23830b(iVar);
                }
            }
        }

        /* renamed from: c */
        public void mo6761c(C8998i iVar) {
            if (WorkDatabase_Impl.this.f24162h != null) {
                int size = WorkDatabase_Impl.this.f24162h.size();
                for (int i = 0; i < size; i++) {
                    ((C8503w.C8505b) WorkDatabase_Impl.this.f24162h.get(i)).mo23829a(iVar);
                }
            }
        }

        /* renamed from: d */
        public void mo6762d(C8998i iVar) {
            C8998i unused = WorkDatabase_Impl.this.f24155a = iVar;
            iVar.mo23652L("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.mo23819x(iVar);
            if (WorkDatabase_Impl.this.f24162h != null) {
                int size = WorkDatabase_Impl.this.f24162h.size();
                for (int i = 0; i < size; i++) {
                    ((C8503w.C8505b) WorkDatabase_Impl.this.f24162h.get(i)).mo6807c(iVar);
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
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new C8724d.C8725a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap.put("prerequisite_id", new C8724d.C8725a("prerequisite_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C8724d.C8728c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            hashSet.add(new C8724d.C8728c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C8724d.C8730e("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
            hashSet2.add(new C8724d.C8730e("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"ASC"})));
            C8724d dVar = new C8724d("Dependency", hashMap, hashSet, hashSet2);
            C8724d a = C8724d.m32489a(iVar2, "Dependency");
            if (!dVar.equals(a)) {
                return new C8521z.C8524c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + dVar + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(27);
            hashMap2.put("id", new C8724d.C8725a("id", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("state", new C8724d.C8725a("state", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("worker_class_name", new C8724d.C8725a("worker_class_name", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("input_merger_class_name", new C8724d.C8725a("input_merger_class_name", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("input", new C8724d.C8725a("input", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("output", new C8724d.C8725a("output", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("initial_delay", new C8724d.C8725a("initial_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("interval_duration", new C8724d.C8725a("interval_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("flex_duration", new C8724d.C8725a("flex_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_attempt_count", new C8724d.C8725a("run_attempt_count", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_policy", new C8724d.C8725a("backoff_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_delay_duration", new C8724d.C8725a("backoff_delay_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("last_enqueue_time", new C8724d.C8725a("last_enqueue_time", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("minimum_retention_duration", new C8724d.C8725a("minimum_retention_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("schedule_requested_at", new C8724d.C8725a("schedule_requested_at", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_in_foreground", new C8724d.C8725a("run_in_foreground", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("out_of_quota_policy", new C8724d.C8725a("out_of_quota_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("period_count", new C8724d.C8725a("period_count", "INTEGER", true, 0, BankApiResponse.SUCCESSFUL_RESPONSE_CODE, 1));
            hashMap2.put("generation", new C8724d.C8725a("generation", "INTEGER", true, 0, BankApiResponse.SUCCESSFUL_RESPONSE_CODE, 1));
            hashMap2.put("required_network_type", new C8724d.C8725a("required_network_type", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_charging", new C8724d.C8725a("requires_charging", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_device_idle", new C8724d.C8725a("requires_device_idle", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_battery_not_low", new C8724d.C8725a("requires_battery_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_storage_not_low", new C8724d.C8725a("requires_storage_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_content_update_delay", new C8724d.C8725a("trigger_content_update_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_max_content_delay", new C8724d.C8725a("trigger_max_content_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("content_uri_triggers", new C8724d.C8725a("content_uri_triggers", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C8724d.C8730e("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"}), Arrays.asList(new String[]{"ASC"})));
            hashSet4.add(new C8724d.C8730e("index_WorkSpec_last_enqueue_time", false, Arrays.asList(new String[]{"last_enqueue_time"}), Arrays.asList(new String[]{"ASC"})));
            C8724d dVar2 = new C8724d("WorkSpec", hashMap2, hashSet3, hashSet4);
            C8724d a2 = C8724d.m32489a(iVar2, "WorkSpec");
            if (!dVar2.equals(a2)) {
                return new C8521z.C8524c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + dVar2 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new C8724d.C8725a("tag", "TEXT", true, 1, (String) null, 1));
            hashMap3.put("work_spec_id", new C8724d.C8725a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C8724d.C8728c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C8724d.C8730e("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
            C8724d dVar3 = new C8724d("WorkTag", hashMap3, hashSet5, hashSet6);
            C8724d a3 = C8724d.m32489a(iVar2, "WorkTag");
            if (!dVar3.equals(a3)) {
                return new C8521z.C8524c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + dVar3 + "\n Found:\n" + a3);
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("work_spec_id", new C8724d.C8725a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap4.put("generation", new C8724d.C8725a("generation", "INTEGER", true, 2, BankApiResponse.SUCCESSFUL_RESPONSE_CODE, 1));
            hashMap4.put("system_id", new C8724d.C8725a("system_id", "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C8724d.C8728c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            C8724d dVar4 = new C8724d("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            C8724d a4 = C8724d.m32489a(iVar2, "SystemIdInfo");
            if (!dVar4.equals(a4)) {
                return new C8521z.C8524c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + dVar4 + "\n Found:\n" + a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new C8724d.C8725a("name", "TEXT", true, 1, (String) null, 1));
            hashMap5.put("work_spec_id", new C8724d.C8725a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C8724d.C8728c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C8724d.C8730e("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
            C8724d dVar5 = new C8724d("WorkName", hashMap5, hashSet8, hashSet9);
            C8724d a5 = C8724d.m32489a(iVar2, "WorkName");
            if (!dVar5.equals(a5)) {
                return new C8521z.C8524c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + dVar5 + "\n Found:\n" + a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new C8724d.C8725a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap6.put("progress", new C8724d.C8725a("progress", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C8724d.C8728c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            C8724d dVar6 = new C8724d("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            C8724d a6 = C8724d.m32489a(iVar2, "WorkProgress");
            if (!dVar6.equals(a6)) {
                return new C8521z.C8524c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + dVar6 + "\n Found:\n" + a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new C8724d.C8725a("key", "TEXT", true, 1, (String) null, 1));
            hashMap7.put("long_value", new C8724d.C8725a("long_value", "INTEGER", false, 0, (String) null, 1));
            C8724d dVar7 = new C8724d("Preference", hashMap7, new HashSet(0), new HashSet(0));
            C8724d a7 = C8724d.m32489a(iVar2, "Preference");
            if (dVar7.equals(a7)) {
                return new C8521z.C8524c(true, (String) null);
            }
            return new C8521z.C8524c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + dVar7 + "\n Found:\n" + a7);
        }
    }

    /* renamed from: I */
    public C7364b mo6746I() {
        C7364b bVar;
        if (this.f5950r != null) {
            return this.f5950r;
        }
        synchronized (this) {
            if (this.f5950r == null) {
                this.f5950r = new C7368c(this);
            }
            bVar = this.f5950r;
        }
        return bVar;
    }

    /* renamed from: J */
    public C7373e mo6747J() {
        C7373e eVar;
        if (this.f5955w != null) {
            return this.f5955w;
        }
        synchronized (this) {
            if (this.f5955w == null) {
                this.f5955w = new C7374f(this);
            }
            eVar = this.f5955w;
        }
        return eVar;
    }

    /* renamed from: K */
    public C7379j mo6748K() {
        C7379j jVar;
        if (this.f5952t != null) {
            return this.f5952t;
        }
        synchronized (this) {
            if (this.f5952t == null) {
                this.f5952t = new C7381k(this);
            }
            jVar = this.f5952t;
        }
        return jVar;
    }

    /* renamed from: L */
    public C7388o mo6749L() {
        C7388o oVar;
        if (this.f5953u != null) {
            return this.f5953u;
        }
        synchronized (this) {
            if (this.f5953u == null) {
                this.f5953u = new C7389p(this);
            }
            oVar = this.f5953u;
        }
        return oVar;
    }

    /* renamed from: M */
    public C7392r mo6750M() {
        C7392r rVar;
        if (this.f5954v != null) {
            return this.f5954v;
        }
        synchronized (this) {
            if (this.f5954v == null) {
                this.f5954v = new C7393s(this);
            }
            rVar = this.f5954v;
        }
        return rVar;
    }

    /* renamed from: N */
    public C7402w mo6751N() {
        C7402w wVar;
        if (this.f5949q != null) {
            return this.f5949q;
        }
        synchronized (this) {
            if (this.f5949q == null) {
                this.f5949q = new C7403x(this);
            }
            wVar = this.f5949q;
        }
        return wVar;
    }

    /* renamed from: O */
    public C7362a0 mo6752O() {
        C7362a0 a0Var;
        if (this.f5951s != null) {
            return this.f5951s;
        }
        synchronized (this) {
            if (this.f5951s == null) {
                this.f5951s = new C7365b0(this);
            }
            a0Var = this.f5951s;
        }
        return a0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C8488q mo6754g() {
        return new C8488q(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C8999j mo6755h(C8474h hVar) {
        return hVar.f24076c.mo6928a(C8999j.C9002b.m33315a(hVar.f24074a).mo24412d(hVar.f24075b).mo24411c(new C8521z(hVar, new C1966a(16), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e")).mo24410b());
    }

    /* renamed from: j */
    public List mo6756j(Map map) {
        return Arrays.asList(new C8684b[]{new C2003c0(), new C2005d0()});
    }

    /* renamed from: p */
    public Set mo6757p() {
        return new HashSet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public Map mo6758q() {
        HashMap hashMap = new HashMap();
        hashMap.put(C7402w.class, C7403x.m28184x());
        hashMap.put(C7364b.class, C7368c.m28069e());
        hashMap.put(C7362a0.class, C7365b0.m28060e());
        hashMap.put(C7379j.class, C7381k.m28108h());
        hashMap.put(C7388o.class, C7389p.m28128c());
        hashMap.put(C7392r.class, C7393s.m28139d());
        hashMap.put(C7373e.class, C7374f.m28091c());
        hashMap.put(C7376g.class, C7377h.m28097a());
        return hashMap;
    }
}
