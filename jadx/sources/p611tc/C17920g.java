package p611tc;

import com.identomat.fragments.face_document.FaceDocumentFragment;

/* renamed from: tc.g */
public final /* synthetic */ class C17920g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f51001d;

    /* renamed from: e */
    public final /* synthetic */ FaceDocumentFragment f51002e;

    /* renamed from: f */
    public final /* synthetic */ int f51003f;

    public /* synthetic */ C17920g(String str, FaceDocumentFragment faceDocumentFragment, int i) {
        this.f51001d = str;
        this.f51002e = faceDocumentFragment;
        this.f51003f = i;
    }

    public final void run() {
        FaceDocumentFragment.m38343T1(this.f51001d, this.f51002e, this.f51003f);
    }
}
