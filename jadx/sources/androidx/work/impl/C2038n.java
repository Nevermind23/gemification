package androidx.work.impl;

import kotlin.jvm.internal.C41536l;
import p280v0.C8684b;
import p318y0.C8998i;

/* renamed from: androidx.work.impl.n */
public final class C2038n extends C8684b {

    /* renamed from: c */
    public static final C2038n f6132c = new C2038n();

    private C2038n() {
        super(8, 9);
    }

    /* renamed from: a */
    public void mo6809a(C8998i iVar) {
        C41536l.m120489i(iVar, "db");
        iVar.mo23652L("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
