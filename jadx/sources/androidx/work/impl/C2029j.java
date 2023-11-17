package androidx.work.impl;

import kotlin.jvm.internal.C41536l;
import p280v0.C8684b;
import p318y0.C8998i;

/* renamed from: androidx.work.impl.j */
public final class C2029j extends C8684b {

    /* renamed from: c */
    public static final C2029j f6093c = new C2029j();

    private C2029j() {
        super(3, 4);
    }

    /* renamed from: a */
    public void mo6809a(C8998i iVar) {
        C41536l.m120489i(iVar, "db");
        iVar.mo23652L("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
