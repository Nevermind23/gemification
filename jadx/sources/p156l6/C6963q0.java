package p156l6;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import p092g7.C6254e;
import p342j$.util.DesugarCollections;

/* renamed from: l6.q0 */
public final class C6963q0 extends Fragment implements C6942g {

    /* renamed from: g */
    private static final WeakHashMap f20833g = new WeakHashMap();

    /* renamed from: d */
    private final Map f20834d = DesugarCollections.synchronizedMap(new ArrayMap());
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f20835e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Bundle f20836f;

    /* renamed from: c */
    public static C6963q0 m26972c(Activity activity) {
        C6963q0 q0Var;
        WeakHashMap weakHashMap = f20833g;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (q0Var = (C6963q0) weakReference.get()) != null) {
            return q0Var;
        }
        try {
            C6963q0 q0Var2 = (C6963q0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (q0Var2 == null || q0Var2.isRemoving()) {
                q0Var2 = new C6963q0();
                activity.getFragmentManager().beginTransaction().add(q0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(q0Var2));
            return q0Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    /* renamed from: D0 */
    public final Activity mo21085D0() {
        return getActivity();
    }

    /* renamed from: H */
    public final LifecycleCallback mo21086H(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f20834d.get(str));
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f20834d.values()) {
            a.mo11982a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: i */
    public final void mo21087i(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f20834d.containsKey(str)) {
            this.f20834d.put(str, lifecycleCallback);
            if (this.f20835e > 0) {
                new C6254e(Looper.getMainLooper()).post(new C6961p0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback e : this.f20834d.values()) {
            e.mo11984e(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f20835e = 1;
        this.f20836f = bundle;
        for (Map.Entry entry : this.f20834d.entrySet()) {
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
        this.f20835e = 5;
        for (LifecycleCallback g : this.f20834d.values()) {
            g.mo11986g();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f20835e = 3;
        for (LifecycleCallback h : this.f20834d.values()) {
            h.mo11987h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f20834d.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo11988i(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f20835e = 2;
        for (LifecycleCallback j : this.f20834d.values()) {
            j.mo11989j();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f20835e = 4;
        for (LifecycleCallback k : this.f20834d.values()) {
            k.mo11990k();
        }
    }
}
