package p156l6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.ArrayMap;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import p092g7.C6254e;
import p342j$.util.DesugarCollections;

/* renamed from: l6.s0 */
public final class C6967s0 extends Fragment implements C6942g {

    /* renamed from: g */
    private static final WeakHashMap f20841g = new WeakHashMap();

    /* renamed from: d */
    private final Map f20842d = DesugarCollections.synchronizedMap(new ArrayMap());
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f20843e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Bundle f20844f;

    /* renamed from: j1 */
    public static C6967s0 m26986j1(C1505h hVar) {
        C6967s0 s0Var;
        WeakHashMap weakHashMap = f20841g;
        WeakReference weakReference = (WeakReference) weakHashMap.get(hVar);
        if (weakReference != null && (s0Var = (C6967s0) weakReference.get()) != null) {
            return s0Var;
        }
        try {
            C6967s0 s0Var2 = (C6967s0) hVar.getSupportFragmentManager().mo4418k0("SupportLifecycleFragmentImpl");
            if (s0Var2 == null || s0Var2.isRemoving()) {
                s0Var2 = new C6967s0();
                hVar.getSupportFragmentManager().mo4428p().mo4634e(s0Var2, "SupportLifecycleFragmentImpl").mo4516j();
            }
            weakHashMap.put(hVar, new WeakReference(s0Var2));
            return s0Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    /* renamed from: D0 */
    public final /* synthetic */ Activity mo21085D0() {
        return getActivity();
    }

    /* renamed from: H */
    public final LifecycleCallback mo21086H(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f20842d.get(str));
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f20842d.values()) {
            a.mo11982a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: i */
    public final void mo21087i(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f20842d.containsKey(str)) {
            this.f20842d.put(str, lifecycleCallback);
            if (this.f20843e > 0) {
                new C6254e(Looper.getMainLooper()).post(new C6965r0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback e : this.f20842d.values()) {
            e.mo11984e(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f20843e = 1;
        this.f20844f = bundle;
        for (Map.Entry entry : this.f20842d.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo11985f(bundle2);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f20843e = 5;
        for (LifecycleCallback g : this.f20842d.values()) {
            g.mo11986g();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f20843e = 3;
        for (LifecycleCallback h : this.f20842d.values()) {
            h.mo11987h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f20842d.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo11988i(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f20843e = 2;
        for (LifecycleCallback j : this.f20842d.values()) {
            j.mo11989j();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f20843e = 4;
        for (LifecycleCallback k : this.f20842d.values()) {
            k.mo11990k();
        }
    }
}
