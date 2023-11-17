package android.support.p013v4.media.session;

import android.os.Bundle;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
class C0117x50fd9e4a extends ResultReceiver {

    /* renamed from: d */
    private WeakReference f965d;

    /* access modifiers changed from: protected */
    public void onReceiveResult(int i, Bundle bundle) {
        C0125b.m366a(this.f965d.get());
    }
}
