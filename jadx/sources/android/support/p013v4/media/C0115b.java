package android.support.p013v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* renamed from: android.support.v4.media.b */
abstract class C0115b {

    /* renamed from: android.support.v4.media.b$a */
    static class C0116a {
        /* renamed from: a */
        public static void m352a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: a */
    public static Uri m351a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
