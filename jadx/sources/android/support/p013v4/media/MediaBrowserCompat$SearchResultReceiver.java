package android.support.p013v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p013v4.media.session.MediaSessionCompat;
import android.support.p013v4.p014os.ResultReceiver;
import java.util.ArrayList;

/* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
class MediaBrowserCompat$SearchResultReceiver extends ResultReceiver {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo189a(int i, Bundle bundle) {
        MediaSessionCompat.m353a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        if (parcelableArray != null) {
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
            }
        }
        throw null;
    }
}
