package p555pc;

import p485kc.C16346d;

/* renamed from: pc.b */
public final class C17337b {

    /* renamed from: a */
    public static final C17337b f48646a = new C17337b();

    private C17337b() {
    }

    /* renamed from: a */
    public final int mo44747a(int i) {
        if (i == 0) {
            return C16346d.identomat_camera_icon;
        }
        if (i == 1) {
            return C16346d.identomat_upload_icon;
        }
        if (i != 2) {
            return 0;
        }
        return C16346d.identomat_nfc;
    }

    /* renamed from: b */
    public final String mo44748b(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "" : "NFC SCAN" : "upload_file" : "take_photo";
    }
}
