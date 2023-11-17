package com.identomat.fragments.call;

import com.identomat.fragments.call.CallFragment;
import org.webrtc.SessionDescription;

/* renamed from: com.identomat.fragments.call.a */
public final /* synthetic */ class C10544a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SessionDescription f29951d;

    /* renamed from: e */
    public final /* synthetic */ CallFragment f29952e;

    public /* synthetic */ C10544a(SessionDescription sessionDescription, CallFragment callFragment) {
        this.f29951d = sessionDescription;
        this.f29952e = callFragment;
    }

    public final void run() {
        CallFragment.C10536c.m38232c(this.f29951d, this.f29952e);
    }
}
