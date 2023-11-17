package p007a6;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.api.C3860c;
import java.util.Collections;
import java.util.List;
import p091g6.C6234g;
import p182n6.C7249c;

/* renamed from: a6.e */
final class C0060e extends C3847a.C3848a {
    C0060e() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ List mo114a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        if (googleSignInOptions == null) {
            return Collections.emptyList();
        }
        return googleSignInOptions.mo11776R();
    }

    /* renamed from: c */
    public final /* synthetic */ C3847a.C3855f mo113c(Context context, Looper looper, C7249c cVar, Object obj, C3860c.C3862b bVar, C3860c.C3863c cVar2) {
        return new C6234g(context, looper, cVar, (GoogleSignInOptions) obj, bVar, cVar2);
    }
}
