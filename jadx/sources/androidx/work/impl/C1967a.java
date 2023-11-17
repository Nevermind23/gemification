package androidx.work.impl;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.C41536l;

/* renamed from: androidx.work.impl.a */
public final class C1967a {

    /* renamed from: a */
    public static final C1967a f5957a = new C1967a();

    private C1967a() {
    }

    /* renamed from: a */
    public final File mo6766a(Context context) {
        C41536l.m120489i(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        C41536l.m120488h(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
