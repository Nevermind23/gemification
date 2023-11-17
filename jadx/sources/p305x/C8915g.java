package p305x;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.util.C1002c;
import androidx.core.util.C1008h;
import androidx.core.view.C1127d;
import androidx.core.view.ViewCompat;

/* renamed from: x.g */
public abstract class C8915g {

    /* renamed from: x.g$a */
    class C8916a extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ C8918c f24924a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8916a(InputConnection inputConnection, boolean z, C8918c cVar) {
            super(inputConnection, z);
            this.f24924a = cVar;
        }

        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.f24924a.mo24335a(C8925n.m33126f(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* renamed from: x.g$b */
    class C8917b extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ C8918c f24925a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8917b(InputConnection inputConnection, boolean z, C8918c cVar) {
            super(inputConnection, z);
            this.f24925a = cVar;
        }

        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (C8915g.m33117e(str, bundle, this.f24925a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* renamed from: x.g$c */
    public interface C8918c {
        /* renamed from: a */
        boolean mo24335a(C8925n nVar, int i, Bundle bundle);
    }

    /* renamed from: b */
    private static C8918c m33114b(View view) {
        C1008h.m3530g(view);
        return new C8914f(view);
    }

    /* renamed from: c */
    public static InputConnection m33115c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return m33116d(inputConnection, editorInfo, m33114b(view));
    }

    /* renamed from: d */
    public static InputConnection m33116d(InputConnection inputConnection, EditorInfo editorInfo, C8918c cVar) {
        C1002c.m3512d(inputConnection, "inputConnection must be non-null");
        C1002c.m3512d(editorInfo, "editorInfo must be non-null");
        C1002c.m3512d(cVar, "onCommitContentListener must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new C8916a(inputConnection, false, cVar);
        }
        if (C8911d.m33102a(editorInfo).length == 0) {
            return inputConnection;
        }
        return new C8917b(inputConnection, false, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x007d  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m33117e(java.lang.String r7, android.os.Bundle r8, p305x.C8915g.C8918c r9) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r1 = android.text.TextUtils.equals(r1, r7)
            if (r1 == 0) goto L_0x000e
            r7 = r0
            goto L_0x0017
        L_0x000e:
            java.lang.String r1 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r7 = android.text.TextUtils.equals(r1, r7)
            if (r7 == 0) goto L_0x0081
            r7 = 1
        L_0x0017:
            r1 = 0
            if (r7 == 0) goto L_0x001d
            java.lang.String r2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            goto L_0x001f
        L_0x001d:
            java.lang.String r2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
        L_0x001f:
            android.os.Parcelable r2 = r8.getParcelable(r2)     // Catch:{ all -> 0x0079 }
            android.os.ResultReceiver r2 = (android.os.ResultReceiver) r2     // Catch:{ all -> 0x0079 }
            if (r7 == 0) goto L_0x002a
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L_0x002c
        L_0x002a:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
        L_0x002c:
            android.os.Parcelable r3 = r8.getParcelable(r3)     // Catch:{ all -> 0x0077 }
            android.net.Uri r3 = (android.net.Uri) r3     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0037
            java.lang.String r4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L_0x0039
        L_0x0037:
            java.lang.String r4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L_0x0039:
            android.os.Parcelable r4 = r8.getParcelable(r4)     // Catch:{ all -> 0x0077 }
            android.content.ClipDescription r4 = (android.content.ClipDescription) r4     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0044
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L_0x0046
        L_0x0044:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L_0x0046:
            android.os.Parcelable r5 = r8.getParcelable(r5)     // Catch:{ all -> 0x0077 }
            android.net.Uri r5 = (android.net.Uri) r5     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0051
            java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L_0x0053
        L_0x0051:
            java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L_0x0053:
            int r6 = r8.getInt(r6)     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x005c
            java.lang.String r7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L_0x005e
        L_0x005c:
            java.lang.String r7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L_0x005e:
            android.os.Parcelable r7 = r8.getParcelable(r7)     // Catch:{ all -> 0x0077 }
            android.os.Bundle r7 = (android.os.Bundle) r7     // Catch:{ all -> 0x0077 }
            if (r3 == 0) goto L_0x0071
            if (r4 == 0) goto L_0x0071
            x.n r8 = new x.n     // Catch:{ all -> 0x0077 }
            r8.<init>(r3, r4, r5)     // Catch:{ all -> 0x0077 }
            boolean r0 = r9.mo24335a(r8, r6, r7)     // Catch:{ all -> 0x0077 }
        L_0x0071:
            if (r2 == 0) goto L_0x0076
            r2.send(r0, r1)
        L_0x0076:
            return r0
        L_0x0077:
            r7 = move-exception
            goto L_0x007b
        L_0x0079:
            r7 = move-exception
            r2 = r1
        L_0x007b:
            if (r2 == 0) goto L_0x0080
            r2.send(r0, r1)
        L_0x0080:
            throw r7
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p305x.C8915g.m33117e(java.lang.String, android.os.Bundle, x.g$c):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ boolean m33118f(View view, C8925n nVar, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                nVar.mo24341d();
                InputContentInfo a = C8913e.m33111a(nVar.mo24342e());
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", a);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        if (ViewCompat.m3599h0(view, new C1127d.C1128a(new ClipData(nVar.mo24339b(), new ClipData.Item(nVar.mo24338a())), 2).mo3683d(nVar.mo24340c()).mo3681b(bundle).mo3680a()) == null) {
            return true;
        }
        return false;
    }
}
