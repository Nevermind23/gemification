package p341ge.bog.chat.presentation.activity;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.appcompat.app.C0218d;
import kotlin.jvm.internal.C41536l;
import p405eg.C12450f0;
import p447hg.C15506h;
import p653wf.C18570b;
import p653wf.C18574d;
import p653wf.C18584m;
import p653wf.C18591t;

/* renamed from: ge.bog.chat.presentation.activity.b */
public abstract class C13009b extends C0218d {

    /* renamed from: n */
    private C15506h f38365n;

    /* renamed from: O0 */
    private final int m49150O0(int i) {
        try {
            TypedValue typedValue = new TypedValue();
            getTheme().resolveAttribute(i, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != -1) {
                if (i2 != 0) {
                    return i2;
                }
            }
            return C18591t.ChatStyle;
        } catch (Exception unused) {
            return C18591t.ChatStyle;
        }
    }

    /* renamed from: P0 */
    public final void mo34238P0(C15506h hVar) {
        this.f38365n = hVar;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        C41536l.m120489i(context, "newBase");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            super.attachBaseContext(((C12450f0) applicationContext).mo33061e(context));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ge.bog.chat.domain.UpdateChatContextByLocale");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C18570b b = C18574d.f52090a.mo46429b();
        if (b != null) {
            b.mo46405c(this);
        }
        getTheme().applyStyle(m49150O0(C18584m.chat_style), false);
    }

    public void onUserInteraction() {
        super.onUserInteraction();
        C15506h hVar = this.f38365n;
        if (hVar != null) {
            hVar.mo42616a(getClass());
        }
    }
}
