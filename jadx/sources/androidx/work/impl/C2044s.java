package androidx.work.impl;

import android.content.Context;
import kotlin.jvm.internal.C41536l;
import p280v0.C8684b;
import p318y0.C8998i;

/* renamed from: androidx.work.impl.s */
public final class C2044s extends C8684b {

    /* renamed from: c */
    private final Context f6157c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2044s(Context context, int i, int i2) {
        super(i, i2);
        C41536l.m120489i(context, "mContext");
        this.f6157c = context;
    }

    /* renamed from: a */
    public void mo6809a(C8998i iVar) {
        C41536l.m120489i(iVar, "db");
        if (this.f24501b >= 10) {
            iVar.mo23656Y("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            return;
        }
        this.f6157c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
    }
}
