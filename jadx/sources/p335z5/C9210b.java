package p335z5;

import android.net.Uri;
import java.util.Map;

/* renamed from: z5.b */
final class C9210b extends Thread {

    /* renamed from: d */
    final /* synthetic */ Map f25637d;

    C9210b(C9208a aVar, Map map) {
        this.f25637d = map;
    }

    public final void run() {
        Map map = this.f25637d;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        C9212d.m34036a(buildUpon.build().toString());
    }
}
