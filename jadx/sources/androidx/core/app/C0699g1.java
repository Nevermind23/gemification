package androidx.core.app;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import java.util.ArrayList;

/* renamed from: androidx.core.app.g1 */
abstract class C0699g1 {
    /* renamed from: a */
    static String m2714a(CharSequence charSequence) {
        return Html.escapeHtml(charSequence);
    }

    /* renamed from: b */
    static void m2715b(Intent intent, ArrayList<Uri> arrayList) {
        ClipData clipData = new ClipData((CharSequence) null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), (Intent) null, arrayList.get(0)));
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            clipData.addItem(new ClipData.Item(arrayList.get(i)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }

    /* renamed from: c */
    static void m2716c(Intent intent) {
        intent.setClipData((ClipData) null);
        intent.setFlags(intent.getFlags() & -2);
    }
}
