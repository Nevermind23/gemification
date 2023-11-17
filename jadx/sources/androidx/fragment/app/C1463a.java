package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1593j;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a */
final class C1463a extends C1493e0 implements FragmentManager.C1456m {

    /* renamed from: t */
    final FragmentManager f4267t;

    /* renamed from: u */
    boolean f4268u;

    /* renamed from: v */
    int f4269v;

    /* renamed from: w */
    boolean f4270w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1463a(FragmentManager fragmentManager) {
        super(fragmentManager.mo4441w0(), fragmentManager.mo4449z0() != null ? fragmentManager.mo4449z0().mo4762f().getClassLoader() : null);
        this.f4269v = -1;
        this.f4270w = false;
        this.f4267t = fragmentManager;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public int mo4506A(boolean z) {
        if (!this.f4268u) {
            if (FragmentManager.m4954M0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C1518k0("FragmentManager"));
                mo4507B("  ", printWriter);
                printWriter.close();
            }
            this.f4268u = true;
            if (this.f4368i) {
                this.f4269v = this.f4267t.mo4422m();
            } else {
                this.f4269v = -1;
            }
            this.f4267t.mo4399a0(this, z);
            return this.f4269v;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: B */
    public void mo4507B(String str, PrintWriter printWriter) {
        mo4508C(str, printWriter, true);
    }

    /* renamed from: C */
    public void mo4508C(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f4370k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f4269v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f4268u);
            if (this.f4367h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f4367h));
            }
            if (!(this.f4363d == 0 && this.f4364e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4363d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4364e));
            }
            if (!(this.f4365f == 0 && this.f4366g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4365f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4366g));
            }
            if (!(this.f4371l == 0 && this.f4372m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4371l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f4372m);
            }
            if (!(this.f4373n == 0 && this.f4374o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4373n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f4374o);
            }
        }
        if (!this.f4362c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f4362c.size();
            for (int i = 0; i < size; i++) {
                C1493e0.C1494a aVar = (C1493e0.C1494a) this.f4362c.get(i);
                switch (aVar.f4379a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f4379a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f4380b);
                if (z) {
                    if (!(aVar.f4382d == 0 && aVar.f4383e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f4382d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f4383e));
                    }
                    if (aVar.f4384f != 0 || aVar.f4385g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f4384f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f4385g));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo4509D() {
        int size = this.f4362c.size();
        for (int i = 0; i < size; i++) {
            C1493e0.C1494a aVar = (C1493e0.C1494a) this.f4362c.get(i);
            Fragment fragment = aVar.f4380b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f4270w;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f4367h);
                fragment.setSharedElementNames(this.f4375p, this.f4376q);
            }
            switch (aVar.f4379a) {
                case 1:
                    fragment.setAnimations(aVar.f4382d, aVar.f4383e, aVar.f4384f, aVar.f4385g);
                    this.f4267t.mo4358C1(fragment, false);
                    this.f4267t.mo4414j(fragment);
                    break;
                case 3:
                    fragment.setAnimations(aVar.f4382d, aVar.f4383e, aVar.f4384f, aVar.f4385g);
                    this.f4267t.mo4429p1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f4382d, aVar.f4383e, aVar.f4384f, aVar.f4385g);
                    this.f4267t.mo4376J0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f4382d, aVar.f4383e, aVar.f4384f, aVar.f4385g);
                    this.f4267t.mo4358C1(fragment, false);
                    this.f4267t.mo4377J1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f4382d, aVar.f4383e, aVar.f4384f, aVar.f4385g);
                    this.f4267t.mo4445y(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f4382d, aVar.f4383e, aVar.f4384f, aVar.f4385g);
                    this.f4267t.mo4358C1(fragment, false);
                    this.f4267t.mo4426o(fragment);
                    break;
                case 8:
                    this.f4267t.mo4372H1(fragment);
                    break;
                case 9:
                    this.f4267t.mo4372H1((Fragment) null);
                    break;
                case 10:
                    this.f4267t.mo4369G1(fragment, aVar.f4387i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f4379a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo4510E() {
        for (int size = this.f4362c.size() - 1; size >= 0; size--) {
            C1493e0.C1494a aVar = (C1493e0.C1494a) this.f4362c.get(size);
            Fragment fragment = aVar.f4380b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f4270w;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.m4993w1(this.f4367h));
                fragment.setSharedElementNames(this.f4376q, this.f4375p);
            }
            switch (aVar.f4379a) {
                case 1:
                    fragment.setAnimations(aVar.f4382d, aVar.f4383e, aVar.f4384f, aVar.f4385g);
                    this.f4267t.mo4358C1(fragment, true);
                    this.f4267t.mo4429p1(fragment);
                    break;
                case 3:
                    fragment.setAnimations(aVar.f4382d, aVar.f4383e, aVar.f4384f, aVar.f4385g);
                    this.f4267t.mo4414j(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f4382d, aVar.f4383e, aVar.f4384f, aVar.f4385g);
                    this.f4267t.mo4377J1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f4382d, aVar.f4383e, aVar.f4384f, aVar.f4385g);
                    this.f4267t.mo4358C1(fragment, true);
                    this.f4267t.mo4376J0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f4382d, aVar.f4383e, aVar.f4384f, aVar.f4385g);
                    this.f4267t.mo4426o(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f4382d, aVar.f4383e, aVar.f4384f, aVar.f4385g);
                    this.f4267t.mo4358C1(fragment, true);
                    this.f4267t.mo4445y(fragment);
                    break;
                case 8:
                    this.f4267t.mo4372H1((Fragment) null);
                    break;
                case 9:
                    this.f4267t.mo4372H1(fragment);
                    break;
                case 10:
                    this.f4267t.mo4369G1(fragment, aVar.f4386h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f4379a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public Fragment mo4511F(ArrayList arrayList, Fragment fragment) {
        ArrayList arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f4362c.size()) {
            C1493e0.C1494a aVar = (C1493e0.C1494a) this.f4362c.get(i);
            int i2 = aVar.f4379a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f4380b;
                    int i3 = fragment3.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = (Fragment) arrayList2.get(size);
                        if (fragment4.mContainerId == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f4362c.add(i, new C1493e0.C1494a(9, fragment4, true));
                                    i++;
                                    fragment2 = null;
                                }
                                C1493e0.C1494a aVar2 = new C1493e0.C1494a(3, fragment4, true);
                                aVar2.f4382d = aVar.f4382d;
                                aVar2.f4384f = aVar.f4384f;
                                aVar2.f4383e = aVar.f4383e;
                                aVar2.f4385g = aVar.f4385g;
                                this.f4362c.add(i, aVar2);
                                arrayList2.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f4362c.remove(i);
                        i--;
                    } else {
                        aVar.f4379a = 1;
                        aVar.f4381c = true;
                        arrayList2.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.f4380b);
                    Fragment fragment5 = aVar.f4380b;
                    if (fragment5 == fragment2) {
                        this.f4362c.add(i, new C1493e0.C1494a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f4362c.add(i, new C1493e0.C1494a(9, fragment2, true));
                        aVar.f4381c = true;
                        i++;
                        fragment2 = aVar.f4380b;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.f4380b);
            i++;
        }
        return fragment2;
    }

    /* renamed from: G */
    public String mo4512G() {
        return this.f4370k;
    }

    /* renamed from: H */
    public void mo4513H() {
        if (this.f4378s != null) {
            for (int i = 0; i < this.f4378s.size(); i++) {
                ((Runnable) this.f4378s.get(i)).run();
            }
            this.f4378s = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public Fragment mo4514I(ArrayList arrayList, Fragment fragment) {
        for (int size = this.f4362c.size() - 1; size >= 0; size--) {
            C1493e0.C1494a aVar = (C1493e0.C1494a) this.f4362c.get(size);
            int i = aVar.f4379a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f4380b;
                            break;
                        case 10:
                            aVar.f4387i = aVar.f4386h;
                            break;
                    }
                }
                arrayList.add(aVar.f4380b);
            }
            arrayList.remove(aVar.f4380b);
        }
        return fragment;
    }

    /* renamed from: a */
    public boolean mo4485a(ArrayList arrayList, ArrayList arrayList2) {
        if (FragmentManager.m4954M0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f4368i) {
            return true;
        }
        this.f4267t.mo4412i(this);
        return true;
    }

    /* renamed from: i */
    public int mo4515i() {
        return mo4506A(false);
    }

    /* renamed from: j */
    public int mo4516j() {
        return mo4506A(true);
    }

    /* renamed from: k */
    public void mo4517k() {
        mo4638n();
        this.f4267t.mo4404d0(this, false);
    }

    /* renamed from: l */
    public void mo4518l() {
        mo4638n();
        this.f4267t.mo4404d0(this, true);
    }

    /* renamed from: m */
    public C1493e0 mo4519m(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f4267t) {
            return super.mo4519m(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo4520o(int i, Fragment fragment, String str, int i2) {
        super.mo4520o(i, fragment, str, i2);
        fragment.mFragmentManager = this.f4267t;
    }

    /* renamed from: p */
    public boolean mo4521p() {
        return this.f4362c.isEmpty();
    }

    /* renamed from: q */
    public C1493e0 mo4522q(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f4267t) {
            return super.mo4522q(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f4269v >= 0) {
            sb.append(" #");
            sb.append(this.f4269v);
        }
        if (this.f4370k != null) {
            sb.append(" ");
            sb.append(this.f4370k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: v */
    public C1493e0 mo4524v(Fragment fragment, C1593j.C1598b bVar) {
        if (fragment.mFragmentManager != this.f4267t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f4267t);
        } else if (bVar == C1593j.C1598b.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        } else if (bVar != C1593j.C1598b.DESTROYED) {
            return super.mo4524v(fragment, bVar);
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    /* renamed from: w */
    public C1493e0 mo4525w(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.f4267t) {
            return super.mo4525w(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo4526y(int i) {
        if (this.f4368i) {
            if (FragmentManager.m4954M0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f4362c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1493e0.C1494a aVar = (C1493e0.C1494a) this.f4362c.get(i2);
                Fragment fragment = aVar.f4380b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.m4954M0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f4380b + " to " + aVar.f4380b.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo4527z() {
        int size = this.f4362c.size() - 1;
        while (size >= 0) {
            C1493e0.C1494a aVar = (C1493e0.C1494a) this.f4362c.get(size);
            if (aVar.f4381c) {
                if (aVar.f4379a == 8) {
                    aVar.f4381c = false;
                    this.f4362c.remove(size - 1);
                    size--;
                } else {
                    int i = aVar.f4380b.mContainerId;
                    aVar.f4379a = 2;
                    aVar.f4381c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        C1493e0.C1494a aVar2 = (C1493e0.C1494a) this.f4362c.get(i2);
                        if (aVar2.f4381c && aVar2.f4380b.mContainerId == i) {
                            this.f4362c.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1463a(C1463a aVar) {
        super(aVar.f4267t.mo4441w0(), aVar.f4267t.mo4449z0() != null ? aVar.f4267t.mo4449z0().mo4762f().getClassLoader() : null, aVar);
        this.f4269v = -1;
        this.f4270w = false;
        this.f4267t = aVar.f4267t;
        this.f4268u = aVar.f4268u;
        this.f4269v = aVar.f4269v;
        this.f4270w = aVar.f4270w;
    }
}
