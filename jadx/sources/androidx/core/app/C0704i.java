package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.p013v4.media.session.C0125b;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import androidx.core.p016os.C0904b;
import androidx.core.view.C1272y;
import androidx.lifecycle.C1572d0;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1631s;

/* renamed from: androidx.core.app.i */
public abstract class C0704i extends Activity implements C1619q, C1272y.C1273a {
    private SimpleArrayMap<Class<? extends C0705a>, C0705a> mExtraDataMap = new SimpleArrayMap<>();
    private C1631s mLifecycleRegistry = new C1631s(this);

    /* renamed from: androidx.core.app.i$a */
    public static class C0705a {
    }

    /* renamed from: s0 */
    private static boolean m2729s0(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        String str = strArr[0];
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -645125871:
                if (str.equals("--translation")) {
                    c = 0;
                    break;
                }
                break;
            case 100470631:
                if (str.equals("--dump-dumpable")) {
                    c = 1;
                    break;
                }
                break;
            case 472614934:
                if (str.equals("--list-dumpables")) {
                    c = 2;
                    break;
                }
                break;
            case 1159329357:
                if (str.equals("--contentcapture")) {
                    c = 3;
                    break;
                }
                break;
            case 1455016274:
                if (str.equals("--autofill")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31) {
                    return true;
                }
                return false;
            case 1:
            case 2:
                return C0904b.m3331c();
            case 3:
                if (Build.VERSION.SDK_INT >= 29) {
                    return true;
                }
                return false;
            case 4:
                if (Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C1272y.m4416d(decorView, keyEvent)) {
            return C1272y.m4417e(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C1272y.m4416d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Deprecated
    public <T extends C0705a> T getExtraData(Class<T> cls) {
        C0125b.m366a(this.mExtraDataMap.get(cls));
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1572d0.m5587e(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.mo4942k(C1593j.C1598b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Deprecated
    public void putExtraData(C0705a aVar) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final boolean shouldDumpInternalState(String[] strArr) {
        return !m2729s0(strArr);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
