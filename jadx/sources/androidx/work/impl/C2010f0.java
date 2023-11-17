package androidx.work.impl;

import android.content.Context;
import kotlin.jvm.internal.C41536l;
import p203p1.C7649m;
import p203p1.C7655s;
import p280v0.C8684b;
import p318y0.C8998i;

/* renamed from: androidx.work.impl.f0 */
public final class C2010f0 extends C8684b {

    /* renamed from: c */
    private final Context f6044c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2010f0(Context context) {
        super(9, 10);
        C41536l.m120489i(context, "context");
        this.f6044c = context;
    }

    /* renamed from: a */
    public void mo6809a(C8998i iVar) {
        C41536l.m120489i(iVar, "db");
        iVar.mo23652L("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        C7655s.m29096c(this.f6044c, iVar);
        C7649m.m29086c(this.f6044c, iVar);
    }
}
