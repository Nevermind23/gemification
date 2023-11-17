package androidx.work.impl;

import kotlin.jvm.internal.C41536l;
import p280v0.C8684b;
import p318y0.C8998i;

/* renamed from: androidx.work.impl.g */
public final class C2021g extends C8684b {

    /* renamed from: c */
    public static final C2021g f6073c = new C2021g();

    private C2021g() {
        super(12, 13);
    }

    /* renamed from: a */
    public void mo6809a(C8998i iVar) {
        C41536l.m120489i(iVar, "db");
        iVar.mo23652L("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        iVar.mo23652L("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
