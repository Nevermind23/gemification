package androidx.work.impl;

import android.content.ContentValues;
import kotlin.jvm.internal.C41536l;
import p280v0.C8683a;
import p318y0.C8998i;

/* renamed from: androidx.work.impl.b */
public final class C1969b implements C8683a {
    /* renamed from: a */
    public void mo6770a(C8998i iVar) {
        C41536l.m120489i(iVar, "db");
        iVar.mo23652L("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        iVar.mo23654U0("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
