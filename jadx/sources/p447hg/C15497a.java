package p447hg;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import kotlin.jvm.internal.C41536l;

/* renamed from: hg.a */
public final class C15497a {
    /* renamed from: a */
    public final void mo42596a(String str, Context context, String str2, String str3) {
        C41536l.m120489i(str, "fileUrl");
        C41536l.m120489i(context, "c");
        Object systemService = context.getSystemService("download");
        if (systemService != null) {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setTitle(str2);
            request.setMimeType(str3);
            request.setNotificationVisibility(1);
            ((DownloadManager) systemService).enqueue(request);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.DownloadManager");
    }
}
