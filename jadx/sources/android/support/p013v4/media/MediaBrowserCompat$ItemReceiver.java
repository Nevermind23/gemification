package android.support.p013v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p013v4.media.session.MediaSessionCompat;
import android.support.p013v4.p014os.ResultReceiver;

/* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
class MediaBrowserCompat$ItemReceiver extends ResultReceiver {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo189a(int i, Bundle bundle) {
        MediaSessionCompat.m353a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) parcelable;
            throw null;
        }
        throw null;
    }
}
