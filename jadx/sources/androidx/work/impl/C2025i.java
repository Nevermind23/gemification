package androidx.work.impl;

import kotlin.jvm.internal.C41536l;
import p280v0.C8684b;
import p318y0.C8998i;

/* renamed from: androidx.work.impl.i */
public final class C2025i extends C8684b {

    /* renamed from: c */
    public static final C2025i f6087c = new C2025i();

    private C2025i() {
        super(1, 2);
    }

    /* renamed from: a */
    public void mo6809a(C8998i iVar) {
        C41536l.m120489i(iVar, "db");
        iVar.mo23652L("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        iVar.mo23652L("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        iVar.mo23652L("DROP TABLE IF EXISTS alarmInfo");
        iVar.mo23652L("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
