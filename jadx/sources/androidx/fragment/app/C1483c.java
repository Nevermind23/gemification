package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.C0151g;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1641v0;
import androidx.lifecycle.C1643w0;
import androidx.lifecycle.C1645y;
import p306x0.C8934e;

/* renamed from: androidx.fragment.app.c */
public class C1483c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: d */
    private Handler f4325d;

    /* renamed from: e */
    private Runnable f4326e = new C1484a();

    /* renamed from: f */
    private DialogInterface.OnCancelListener f4327f = new C1485b();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public DialogInterface.OnDismissListener f4328g = new C1486c();

    /* renamed from: h */
    private int f4329h = 0;

    /* renamed from: i */
    private int f4330i = 0;

    /* renamed from: j */
    private boolean f4331j = true;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f4332k = true;

    /* renamed from: l */
    private int f4333l = -1;

    /* renamed from: m */
    private boolean f4334m;

    /* renamed from: n */
    private C1645y f4335n = new C1487d();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Dialog f4336o;

    /* renamed from: p */
    private boolean f4337p;

    /* renamed from: q */
    private boolean f4338q;

    /* renamed from: r */
    private boolean f4339r;

    /* renamed from: s */
    private boolean f4340s = false;

    /* renamed from: androidx.fragment.app.c$a */
    class C1484a implements Runnable {
        C1484a() {
        }

        public void run() {
            C1483c.this.f4328g.onDismiss(C1483c.this.f4336o);
        }
    }

    /* renamed from: androidx.fragment.app.c$b */
    class C1485b implements DialogInterface.OnCancelListener {
        C1485b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            if (C1483c.this.f4336o != null) {
                C1483c cVar = C1483c.this;
                cVar.onCancel(cVar.f4336o);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$c */
    class C1486c implements DialogInterface.OnDismissListener {
        C1486c() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (C1483c.this.f4336o != null) {
                C1483c cVar = C1483c.this;
                cVar.onDismiss(cVar.f4336o);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$d */
    class C1487d implements C1645y {
        C1487d() {
        }

        /* renamed from: a */
        public void onChanged(C1619q qVar) {
            if (qVar != null && C1483c.this.f4332k) {
                View requireView = C1483c.this.requireView();
                if (requireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (C1483c.this.f4336o != null) {
                    if (FragmentManager.m4954M0(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + C1483c.this.f4336o);
                    }
                    C1483c.this.f4336o.setContentView(requireView);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$e */
    class C1488e extends C1513j {

        /* renamed from: d */
        final /* synthetic */ C1513j f4345d;

        C1488e(C1513j jVar) {
            this.f4345d = jVar;
        }

        /* renamed from: c */
        public View mo4327c(int i) {
            if (this.f4345d.mo4328d()) {
                return this.f4345d.mo4327c(i);
            }
            return C1483c.this.mo4583r1(i);
        }

        /* renamed from: d */
        public boolean mo4328d() {
            return this.f4345d.mo4328d() || C1483c.this.mo4584s1();
        }
    }

    /* renamed from: m1 */
    private void m5213m1(boolean z, boolean z2, boolean z3) {
        if (!this.f4338q) {
            this.f4338q = true;
            this.f4339r = false;
            Dialog dialog = this.f4336o;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f4336o.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.f4325d.getLooper()) {
                        onDismiss(this.f4336o);
                    } else {
                        this.f4325d.post(this.f4326e);
                    }
                }
            }
            this.f4337p = true;
            if (this.f4333l >= 0) {
                if (z3) {
                    getParentFragmentManager().mo4419k1(this.f4333l, 1);
                } else {
                    getParentFragmentManager().mo4411h1(this.f4333l, 1, z);
                }
                this.f4333l = -1;
                return;
            }
            C1493e0 p = getParentFragmentManager().mo4428p();
            p.mo4643x(true);
            p.mo4522q(this);
            if (z3) {
                p.mo4517k();
            } else if (z) {
                p.mo4516j();
            } else {
                p.mo4515i();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: t1 */
    private void m5214t1(Bundle bundle) {
        if (this.f4332k && !this.f4340s) {
            try {
                this.f4334m = true;
                Dialog q1 = mo710q1(bundle);
                this.f4336o = q1;
                if (this.f4332k) {
                    mo711z1(q1, this.f4329h);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f4336o.setOwnerActivity((Activity) context);
                    }
                    this.f4336o.setCancelable(this.f4331j);
                    this.f4336o.setOnCancelListener(this.f4327f);
                    this.f4336o.setOnDismissListener(this.f4328g);
                    this.f4340s = true;
                } else {
                    this.f4336o = null;
                }
                this.f4334m = false;
            } catch (Throwable th) {
                this.f4334m = false;
                throw th;
            }
        }
    }

    /* renamed from: A1 */
    public void mo4576A1(FragmentManager fragmentManager, String str) {
        this.f4338q = false;
        this.f4339r = true;
        C1493e0 p = fragmentManager.mo4428p();
        p.mo4643x(true);
        p.mo4634e(this, str);
        p.mo4515i();
    }

    /* access modifiers changed from: package-private */
    public C1513j createFragmentContainer() {
        return new C1488e(super.createFragmentContainer());
    }

    /* renamed from: k1 */
    public void mo4577k1() {
        m5213m1(false, false, false);
    }

    /* renamed from: l1 */
    public void mo4578l1() {
        m5213m1(true, false, false);
    }

    /* renamed from: n1 */
    public Dialog mo4579n1() {
        return this.f4336o;
    }

    /* renamed from: o1 */
    public int mo4580o1() {
        return this.f4330i;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().mo4820l(this.f4335n);
        if (!this.f4339r) {
            this.f4338q = false;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        this.f4325d = new Handler();
        if (this.mContainerId == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f4332k = z;
        if (bundle != null) {
            this.f4329h = bundle.getInt("android:style", 0);
            this.f4330i = bundle.getInt("android:theme", 0);
            this.f4331j = bundle.getBoolean("android:cancelable", true);
            this.f4332k = bundle.getBoolean("android:showsDialog", this.f4332k);
            this.f4333l = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f4336o;
        if (dialog != null) {
            this.f4337p = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f4336o.dismiss();
            if (!this.f4338q) {
                onDismiss(this.f4336o);
            }
            this.f4336o = null;
            this.f4340s = false;
        }
    }

    public void onDetach() {
        super.onDetach();
        if (!this.f4339r && !this.f4338q) {
            this.f4338q = true;
        }
        getViewLifecycleOwnerLiveData().mo4824p(this.f4335n);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f4337p) {
            if (FragmentManager.m4954M0(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            m5213m1(true, true, false);
        }
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (!this.f4332k || this.f4334m) {
            if (FragmentManager.m4954M0(2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (!this.f4332k) {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                } else {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                }
            }
            return onGetLayoutInflater;
        }
        m5214t1(bundle);
        if (FragmentManager.m4954M0(2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f4336o;
        if (dialog != null) {
            return onGetLayoutInflater.cloneInContext(dialog.getContext());
        }
        return onGetLayoutInflater;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f4336o;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f4329h;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f4330i;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f4331j;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f4332k;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f4333l;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = this.f4336o;
        if (dialog != null) {
            this.f4337p = false;
            dialog.show();
            View decorView = this.f4336o.getWindow().getDecorView();
            C1641v0.m5722a(decorView, this);
            C1643w0.m5723a(decorView, this);
            C8934e.m33151a(decorView, this);
        }
    }

    public void onStop() {
        super.onStop();
        Dialog dialog = this.f4336o;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f4336o != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f4336o.onRestoreInstanceState(bundle2);
        }
    }

    /* renamed from: p1 */
    public boolean mo4582p1() {
        return this.f4331j;
    }

    /* access modifiers changed from: package-private */
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView == null && this.f4336o != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f4336o.onRestoreInstanceState(bundle2);
        }
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        if (FragmentManager.m4954M0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new C0151g(requireContext(), mo4580o1());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r1 */
    public View mo4583r1(int i) {
        Dialog dialog = this.f4336o;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s1 */
    public boolean mo4584s1() {
        return this.f4340s;
    }

    /* renamed from: u1 */
    public final Dialog mo4585u1() {
        Dialog n1 = mo4579n1();
        if (n1 != null) {
            return n1;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    /* renamed from: v1 */
    public void mo4586v1(boolean z) {
        this.f4331j = z;
        Dialog dialog = this.f4336o;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    /* renamed from: x1 */
    public void mo4587x1(boolean z) {
        this.f4332k = z;
    }

    /* renamed from: y1 */
    public void mo4588y1(int i, int i2) {
        if (FragmentManager.m4954M0(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i + ", " + i2);
        }
        this.f4329h = i;
        if (i == 2 || i == 3) {
            this.f4330i = 16973913;
        }
        if (i2 != 0) {
            this.f4330i = i2;
        }
    }

    /* renamed from: z1 */
    public void mo711z1(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }
}
