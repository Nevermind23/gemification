package hw0;

import android.view.MotionEvent;
import android.view.View;
import p341ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment;

/* renamed from: hw0.f */
public final /* synthetic */ class C36248f implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ P2PSendFragment f87439d;

    public /* synthetic */ C36248f(P2PSendFragment p2PSendFragment) {
        this.f87439d = p2PSendFragment;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return P2PSendFragment.m98322K1(this.f87439d, view, motionEvent);
    }
}
