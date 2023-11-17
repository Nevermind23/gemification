package androidx.work.impl;

import kotlin.jvm.internal.C41536l;
import p280v0.C8684b;
import p318y0.C8998i;

/* renamed from: androidx.work.impl.l */
public final class C2036l extends C8684b {

    /* renamed from: c */
    public static final C2036l f6130c = new C2036l();

    private C2036l() {
        super(6, 7);
    }

    /* renamed from: a */
    public void mo6809a(C8998i iVar) {
        C41536l.m120489i(iVar, "db");
        iVar.mo23652L("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
