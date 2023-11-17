package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.fragment.app.d0 */
class C1491d0 {

    /* renamed from: a */
    private final ArrayList f4355a = new ArrayList();

    /* renamed from: b */
    private final HashMap f4356b = new HashMap();

    /* renamed from: c */
    private final HashMap f4357c = new HashMap();

    /* renamed from: d */
    private C1544x f4358d;

    C1491d0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo4603A(C1544x xVar) {
        this.f4358d = xVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public FragmentState mo4604B(String str, FragmentState fragmentState) {
        if (fragmentState != null) {
            return (FragmentState) this.f4357c.put(str, fragmentState);
        }
        return (FragmentState) this.f4357c.remove(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4605a(Fragment fragment) {
        if (!this.f4355a.contains(fragment)) {
            synchronized (this.f4355a) {
                this.f4355a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4606b() {
        this.f4356b.values().removeAll(Collections.singleton((Object) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4607c(String str) {
        return this.f4356b.get(str) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4608d(int i) {
        for (C1480b0 b0Var : this.f4356b.values()) {
            if (b0Var != null) {
                b0Var.mo4571u(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4609e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f4356b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C1480b0 b0Var : this.f4356b.values()) {
                printWriter.print(str);
                if (b0Var != null) {
                    Fragment k = b0Var.mo4563k();
                    printWriter.println(k);
                    k.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f4355a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(((Fragment) this.f4355a.get(i)).toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Fragment mo4610f(String str) {
        C1480b0 b0Var = (C1480b0) this.f4356b.get(str);
        if (b0Var != null) {
            return b0Var.mo4563k();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment mo4611g(int i) {
        for (int size = this.f4355a.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f4355a.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (C1480b0 b0Var : this.f4356b.values()) {
            if (b0Var != null) {
                Fragment k = b0Var.mo4563k();
                if (k.mFragmentId == i) {
                    return k;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Fragment mo4612h(String str) {
        if (str != null) {
            for (int size = this.f4355a.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f4355a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C1480b0 b0Var : this.f4356b.values()) {
            if (b0Var != null) {
                Fragment k = b0Var.mo4563k();
                if (str.equals(k.mTag)) {
                    return k;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Fragment mo4613i(String str) {
        Fragment findFragmentByWho;
        for (C1480b0 b0Var : this.f4356b.values()) {
            if (b0Var != null && (findFragmentByWho = b0Var.mo4563k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo4614j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f4355a.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = (Fragment) this.f4355a.get(i);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f4355a.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f4355a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public List mo4615k() {
        ArrayList arrayList = new ArrayList();
        for (C1480b0 b0Var : this.f4356b.values()) {
            if (b0Var != null) {
                arrayList.add(b0Var);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public List mo4616l() {
        ArrayList arrayList = new ArrayList();
        for (C1480b0 b0Var : this.f4356b.values()) {
            if (b0Var != null) {
                arrayList.add(b0Var.mo4563k());
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public ArrayList mo4617m() {
        return new ArrayList(this.f4357c.values());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C1480b0 mo4618n(String str) {
        return (C1480b0) this.f4356b.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public List mo4619o() {
        ArrayList arrayList;
        if (this.f4355a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f4355a) {
            arrayList = new ArrayList(this.f4355a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C1544x mo4620p() {
        return this.f4358d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public FragmentState mo4621q(String str) {
        return (FragmentState) this.f4357c.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo4622r(C1480b0 b0Var) {
        Fragment k = b0Var.mo4563k();
        if (!mo4607c(k.mWho)) {
            this.f4356b.put(k.mWho, b0Var);
            if (k.mRetainInstanceChangedWhileDetached) {
                if (k.mRetainInstance) {
                    this.f4358d.mo4788dw(k);
                } else {
                    this.f4358d.mo4798nw(k);
                }
                k.mRetainInstanceChangedWhileDetached = false;
            }
            if (FragmentManager.m4954M0(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + k);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo4623s(C1480b0 b0Var) {
        Fragment k = b0Var.mo4563k();
        if (k.mRetainInstance) {
            this.f4358d.mo4798nw(k);
        }
        if (((C1480b0) this.f4356b.put(k.mWho, (Object) null)) != null && FragmentManager.m4954M0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo4624t() {
        boolean z;
        Iterator it = this.f4355a.iterator();
        while (it.hasNext()) {
            C1480b0 b0Var = (C1480b0) this.f4356b.get(((Fragment) it.next()).mWho);
            if (b0Var != null) {
                b0Var.mo4564m();
            }
        }
        for (C1480b0 b0Var2 : this.f4356b.values()) {
            if (b0Var2 != null) {
                b0Var2.mo4564m();
                Fragment k = b0Var2.mo4563k();
                if (!k.mRemoving || k.isInBackStack()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (k.mBeingSaved && !this.f4357c.containsKey(k.mWho)) {
                        b0Var2.mo4569s();
                    }
                    mo4623s(b0Var2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo4625u(Fragment fragment) {
        synchronized (this.f4355a) {
            this.f4355a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo4626v() {
        this.f4356b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo4627w(List list) {
        this.f4355a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment f = mo4610f(str);
                if (f != null) {
                    if (FragmentManager.m4954M0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f);
                    }
                    mo4605a(f);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo4628x(ArrayList arrayList) {
        this.f4357c.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FragmentState fragmentState = (FragmentState) it.next();
            this.f4357c.put(fragmentState.f4254e, fragmentState);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public ArrayList mo4629y() {
        ArrayList arrayList = new ArrayList(this.f4356b.size());
        for (C1480b0 b0Var : this.f4356b.values()) {
            if (b0Var != null) {
                Fragment k = b0Var.mo4563k();
                b0Var.mo4569s();
                arrayList.add(k.mWho);
                if (FragmentManager.m4954M0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k + ": " + k.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public ArrayList mo4630z() {
        synchronized (this.f4355a) {
            if (this.f4355a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(this.f4355a.size());
            Iterator it = this.f4355a.iterator();
            while (it.hasNext()) {
                Fragment fragment = (Fragment) it.next();
                arrayList.add(fragment.mWho);
                if (FragmentManager.m4954M0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.mWho + "): " + fragment);
                }
            }
            return arrayList;
        }
    }
}
