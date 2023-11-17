package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.session.C0125b;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.C0152h;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0172a;
import androidx.activity.result.C0173b;
import androidx.activity.result.IntentSenderRequest;
import androidx.core.app.C0680c1;
import androidx.core.app.C0683d1;
import androidx.core.app.C0690e1;
import androidx.core.app.C0743u;
import androidx.core.content.C0785i;
import androidx.core.content.C0786j;
import androidx.core.util.C1000a;
import androidx.core.view.C1114b0;
import androidx.core.view.C1242t0;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1606m;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p017b.C2101a;
import p085g0.C6199b;
import p098h0.C6415b;
import p342j$.util.DesugarCollections;

public abstract class FragmentManager {

    /* renamed from: S */
    private static boolean f4173S = false;

    /* renamed from: A */
    private C1519l f4174A = new C1447d();

    /* renamed from: B */
    private C1530m0 f4175B = null;

    /* renamed from: C */
    private C1530m0 f4176C = new C1448e();

    /* renamed from: D */
    private C0173b f4177D;

    /* renamed from: E */
    private C0173b f4178E;

    /* renamed from: F */
    private C0173b f4179F;

    /* renamed from: G */
    ArrayDeque f4180G = new ArrayDeque();

    /* renamed from: H */
    private boolean f4181H;

    /* renamed from: I */
    private boolean f4182I;

    /* renamed from: J */
    private boolean f4183J;

    /* renamed from: K */
    private boolean f4184K;

    /* renamed from: L */
    private boolean f4185L;

    /* renamed from: M */
    private ArrayList f4186M;

    /* renamed from: N */
    private ArrayList f4187N;

    /* renamed from: O */
    private ArrayList f4188O;

    /* renamed from: P */
    private C1544x f4189P;

    /* renamed from: Q */
    private C6415b.C6418c f4190Q;

    /* renamed from: R */
    private Runnable f4191R = new C1449f();

    /* renamed from: a */
    private final ArrayList f4192a = new ArrayList();

    /* renamed from: b */
    private boolean f4193b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1491d0 f4194c = new C1491d0();

    /* renamed from: d */
    ArrayList f4195d;

    /* renamed from: e */
    private ArrayList f4196e;

    /* renamed from: f */
    private final C1534p f4197f = new C1534p(this);

    /* renamed from: g */
    private OnBackPressedDispatcher f4198g;

    /* renamed from: h */
    private final C0152h f4199h = new C1445b(false);

    /* renamed from: i */
    private final AtomicInteger f4200i = new AtomicInteger();

    /* renamed from: j */
    private final Map f4201j = DesugarCollections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Map f4202k = DesugarCollections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Map f4203l = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: m */
    private ArrayList f4204m;

    /* renamed from: n */
    private final C1536q f4205n = new C1536q(this);

    /* renamed from: o */
    private final CopyOnWriteArrayList f4206o = new CopyOnWriteArrayList();

    /* renamed from: p */
    private final C1000a f4207p = new C1538r(this);

    /* renamed from: q */
    private final C1000a f4208q = new C1539s(this);

    /* renamed from: r */
    private final C1000a f4209r = new C1540t(this);

    /* renamed from: s */
    private final C1000a f4210s = new C1541u(this);

    /* renamed from: t */
    private final C1242t0 f4211t = new C1446c();

    /* renamed from: u */
    int f4212u = -1;

    /* renamed from: v */
    private C1529m f4213v;

    /* renamed from: w */
    private C1513j f4214w;

    /* renamed from: x */
    private Fragment f4215x;

    /* renamed from: y */
    Fragment f4216y;

    /* renamed from: z */
    private C1519l f4217z = null;

    /* renamed from: androidx.fragment.app.FragmentManager$a */
    class C1444a implements C0172a {
        C1444a() {
        }

        /* renamed from: b */
        public void mo403a(Map map) {
            int i;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((Boolean) arrayList.get(i2)).booleanValue()) {
                    i = 0;
                } else {
                    i = -1;
                }
                iArr[i2] = i;
            }
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.f4180G.pollFirst();
            if (launchedFragmentInfo == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = launchedFragmentInfo.f4222d;
            int i3 = launchedFragmentInfo.f4223e;
            Fragment i4 = FragmentManager.this.f4194c.mo4613i(str);
            if (i4 == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            i4.onRequestPermissionsResult(i3, strArr, iArr);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$b */
    class C1445b extends C0152h {
        C1445b(boolean z) {
            super(z);
        }

        /* renamed from: b */
        public void mo361b() {
            FragmentManager.this.mo4374I0();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$c */
    class C1446c implements C1242t0 {
        C1446c() {
        }

        /* renamed from: a */
        public void mo3720a(Menu menu) {
            FragmentManager.this.mo4382M(menu);
        }

        /* renamed from: b */
        public void mo3721b(Menu menu) {
            FragmentManager.this.mo4387Q(menu);
        }

        /* renamed from: c */
        public boolean mo3722c(MenuItem menuItem) {
            return FragmentManager.this.mo4380L(menuItem);
        }

        /* renamed from: d */
        public void mo3723d(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.mo4362E(menu, menuInflater);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$d */
    class C1447d extends C1519l {
        C1447d() {
        }

        /* renamed from: a */
        public Fragment mo4458a(ClassLoader classLoader, String str) {
            return FragmentManager.this.mo4449z0().mo4716b(FragmentManager.this.mo4449z0().mo4762f(), str, (Bundle) null);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$e */
    class C1448e implements C1530m0 {
        C1448e() {
        }

        /* renamed from: a */
        public C1520l0 mo4459a(ViewGroup viewGroup) {
            return new C1465b(viewGroup);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$f */
    class C1449f implements Runnable {
        C1449f() {
        }

        public void run() {
            FragmentManager.this.mo4402c0(true);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$g */
    class C1450g implements C1546y {

        /* renamed from: d */
        final /* synthetic */ Fragment f4230d;

        C1450g(Fragment fragment) {
            this.f4230d = fragment;
        }

        /* renamed from: a */
        public void mo4461a(FragmentManager fragmentManager, Fragment fragment) {
            this.f4230d.onAttachFragment(fragment);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$h */
    class C1451h implements C0172a {
        C1451h() {
        }

        /* renamed from: b */
        public void mo403a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.f4180G.pollFirst();
            if (launchedFragmentInfo == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = launchedFragmentInfo.f4222d;
            int i = launchedFragmentInfo.f4223e;
            Fragment i2 = FragmentManager.this.f4194c.mo4613i(str);
            if (i2 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i2.onActivityResult(i, activityResult.mo371b(), activityResult.mo370a());
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$i */
    class C1452i implements C0172a {
        C1452i() {
        }

        /* renamed from: b */
        public void mo403a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.f4180G.pollFirst();
            if (launchedFragmentInfo == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = launchedFragmentInfo.f4222d;
            int i = launchedFragmentInfo.f4223e;
            Fragment i2 = FragmentManager.this.f4194c.mo4613i(str);
            if (i2 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i2.onActivityResult(i, activityResult.mo371b(), activityResult.mo370a());
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$j */
    static class C1453j extends C2101a {
        C1453j() {
        }

        /* renamed from: d */
        public Intent mo4464a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a = intentSenderRequest.mo390a();
            if (!(a == null || (bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.C0171b(intentSenderRequest.mo394e()).mo401b((Intent) null).mo402c(intentSenderRequest.mo392d(), intentSenderRequest.mo391b()).mo400a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.m4954M0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        /* renamed from: e */
        public ActivityResult mo4465c(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$k */
    public static abstract class C1454k {
        /* renamed from: a */
        public void mo4468a(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: b */
        public void mo4469b(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        /* renamed from: c */
        public void mo4470c(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: d */
        public void mo4471d(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: e */
        public void mo4472e(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: f */
        public void mo4473f(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: g */
        public void mo4474g(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        /* renamed from: h */
        public void mo4475h(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: i */
        public void mo4476i(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: j */
        public void mo4477j(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: k */
        public void mo4478k(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: l */
        public void mo4479l(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: m */
        public void mo4480m(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }

        /* renamed from: n */
        public void mo4481n(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$l */
    private static class C1455l implements C1464a0 {

        /* renamed from: a */
        private final C1593j f4234a;

        /* renamed from: b */
        private final C1464a0 f4235b;

        /* renamed from: c */
        private final C1606m f4236c;

        C1455l(C1593j jVar, C1464a0 a0Var, C1606m mVar) {
            this.f4234a = jVar;
            this.f4235b = a0Var;
            this.f4236c = mVar;
        }

        /* renamed from: a */
        public void mo4482a(String str, Bundle bundle) {
            this.f4235b.mo4482a(str, bundle);
        }

        /* renamed from: b */
        public boolean mo4483b(C1593j.C1598b bVar) {
            return this.f4234a.mo4907b().mo4914b(bVar);
        }

        /* renamed from: c */
        public void mo4484c() {
            this.f4234a.mo4909d(this.f4236c);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$m */
    interface C1456m {
        /* renamed from: a */
        boolean mo4485a(ArrayList arrayList, ArrayList arrayList2);
    }

    /* renamed from: androidx.fragment.app.FragmentManager$n */
    private class C1457n implements C1456m {

        /* renamed from: a */
        final String f4237a;

        /* renamed from: b */
        final int f4238b;

        /* renamed from: c */
        final int f4239c;

        C1457n(String str, int i, int i2) {
            this.f4237a = str;
            this.f4238b = i;
            this.f4239c = i2;
        }

        /* renamed from: a */
        public boolean mo4485a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = FragmentManager.this.f4216y;
            if (fragment != null && this.f4238b < 0 && this.f4237a == null && fragment.getChildFragmentManager().mo4416j1()) {
                return false;
            }
            return FragmentManager.this.mo4423m1(arrayList, arrayList2, this.f4237a, this.f4238b, this.f4239c);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$o */
    private class C1458o implements C1456m {

        /* renamed from: a */
        private final String f4241a;

        C1458o(String str) {
            this.f4241a = str;
        }

        /* renamed from: a */
        public boolean mo4485a(ArrayList arrayList, ArrayList arrayList2) {
            return FragmentManager.this.mo4439u1(arrayList, arrayList2, this.f4241a);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$p */
    private class C1459p implements C1456m {

        /* renamed from: a */
        private final String f4243a;

        C1459p(String str) {
            this.f4243a = str;
        }

        /* renamed from: a */
        public boolean mo4485a(ArrayList arrayList, ArrayList arrayList2) {
            return FragmentManager.this.mo4450z1(arrayList, arrayList2, this.f4243a);
        }
    }

    /* renamed from: G0 */
    static Fragment m4950G0(View view) {
        Object tag = view.getTag(C6199b.f19204a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* renamed from: I1 */
    private void m4951I1(Fragment fragment) {
        ViewGroup v0 = m4991v0(fragment);
        if (v0 != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            int i = C6199b.f19206c;
            if (v0.getTag(i) == null) {
                v0.setTag(i, fragment);
            }
            ((Fragment) v0.getTag(i)).setPopDirection(fragment.getPopDirection());
        }
    }

    /* renamed from: K1 */
    private void m4952K1() {
        for (C1480b0 f1 : this.f4194c.mo4615k()) {
            mo4407f1(f1);
        }
    }

    /* renamed from: L1 */
    private void m4953L1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C1518k0("FragmentManager"));
        C1529m mVar = this.f4213v;
        if (mVar != null) {
            try {
                mVar.mo4696h("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                mo4397Y("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    /* renamed from: M0 */
    public static boolean m4954M0(int i) {
        return f4173S || Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: N */
    private void m4955N(Fragment fragment) {
        if (fragment != null && fragment.equals(mo4410h0(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    /* renamed from: N0 */
    private boolean m4956N0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.mo4430q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (mo4432r0() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (mo4390R0(r3.f4215x) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.mo365f(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.f4199h;
     */
    /* renamed from: N1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4957N1() {
        /*
            r3 = this;
            java.util.ArrayList r0 = r3.f4192a
            monitor-enter(r0)
            java.util.ArrayList r1 = r3.f4192a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.h r1 = r3.f4199h     // Catch:{ all -> 0x002a }
            r1.mo365f(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.h r0 = r3.f4199h
            int r1 = r3.mo4432r0()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.f4215x
            boolean r1 = r3.mo4390R0(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.mo365f(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.m4957N1():void");
    }

    /* renamed from: O0 */
    private boolean m4958O0() {
        Fragment fragment = this.f4215x;
        if (fragment == null) {
            return true;
        }
        if (!fragment.isAdded() || !this.f4215x.getParentFragmentManager().m4958O0()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: U */
    private void m4959U(int i) {
        try {
            this.f4193b = true;
            this.f4194c.mo4608d(i);
            mo4403c1(i, false);
            for (C1520l0 j : m4990v()) {
                j.mo4739j();
            }
            this.f4193b = false;
            mo4402c0(true);
        } catch (Throwable th) {
            this.f4193b = false;
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V0 */
    public /* synthetic */ void m4961V0(Configuration configuration) {
        if (m4958O0()) {
            mo4353B(configuration, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W0 */
    public /* synthetic */ void m4962W0(Integer num) {
        if (m4958O0() && num.intValue() == 80) {
            mo4370H(false);
        }
    }

    /* renamed from: X */
    private void m4963X() {
        if (this.f4185L) {
            this.f4185L = false;
            m4952K1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X0 */
    public /* synthetic */ void m4964X0(C0743u uVar) {
        if (m4958O0()) {
            mo4373I(uVar.mo3190a(), false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y0 */
    public /* synthetic */ void m4965Y0(C0690e1 e1Var) {
        if (m4958O0()) {
            mo4385P(e1Var.mo3131a(), false);
        }
    }

    /* renamed from: Z */
    private void m4966Z() {
        for (C1520l0 j : m4990v()) {
            j.mo4739j();
        }
    }

    /* renamed from: b0 */
    private void m4969b0(boolean z) {
        if (this.f4193b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f4213v == null) {
            if (this.f4184K) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f4213v.mo4763g().getLooper()) {
            if (!z) {
                m4985r();
            }
            if (this.f4186M == null) {
                this.f4186M = new ArrayList();
                this.f4187N = new ArrayList();
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: e0 */
    private static void m4973e0(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        while (i < i2) {
            C1463a aVar = (C1463a) arrayList.get(i);
            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                aVar.mo4526y(-1);
                aVar.mo4510E();
            } else {
                aVar.mo4526y(1);
                aVar.mo4509D();
            }
            i++;
        }
    }

    /* renamed from: f0 */
    private void m4975f0(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = ((C1463a) arrayList.get(i)).f4377r;
        ArrayList arrayList3 = this.f4188O;
        if (arrayList3 == null) {
            this.f4188O = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f4188O.addAll(this.f4194c.mo4619o());
        Fragment D0 = mo4360D0();
        boolean z2 = false;
        for (int i3 = i; i3 < i2; i3++) {
            C1463a aVar = (C1463a) arrayList.get(i3);
            if (!((Boolean) arrayList2.get(i3)).booleanValue()) {
                D0 = aVar.mo4511F(this.f4188O, D0);
            } else {
                D0 = aVar.mo4514I(this.f4188O, D0);
            }
            if (z2 || aVar.f4368i) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.f4188O.clear();
        if (!z && this.f4212u >= 1) {
            for (int i4 = i; i4 < i2; i4++) {
                Iterator it = ((C1463a) arrayList.get(i4)).f4362c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = ((C1493e0.C1494a) it.next()).f4380b;
                    if (!(fragment == null || fragment.mFragmentManager == null)) {
                        this.f4194c.mo4622r(mo4442x(fragment));
                    }
                }
            }
        }
        m4973e0(arrayList, arrayList2, i, i2);
        boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        for (int i5 = i; i5 < i2; i5++) {
            C1463a aVar2 = (C1463a) arrayList.get(i5);
            if (booleanValue) {
                for (int size = aVar2.f4362c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = ((C1493e0.C1494a) aVar2.f4362c.get(size)).f4380b;
                    if (fragment2 != null) {
                        mo4442x(fragment2).mo4564m();
                    }
                }
            } else {
                Iterator it2 = aVar2.f4362c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = ((C1493e0.C1494a) it2.next()).f4380b;
                    if (fragment3 != null) {
                        mo4442x(fragment3).mo4564m();
                    }
                }
            }
        }
        mo4403c1(this.f4212u, true);
        for (C1520l0 l0Var : m4992w(arrayList, i, i2)) {
            l0Var.mo4744r(booleanValue);
            l0Var.mo4743p();
            l0Var.mo4738g();
        }
        while (i < i2) {
            C1463a aVar3 = (C1463a) arrayList.get(i);
            if (((Boolean) arrayList2.get(i)).booleanValue() && aVar3.f4269v >= 0) {
                aVar3.f4269v = -1;
            }
            aVar3.mo4513H();
            i++;
        }
        if (z2) {
            m4988s1();
        }
    }

    /* renamed from: i0 */
    private int m4978i0(String str, int i, boolean z) {
        ArrayList arrayList = this.f4195d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str != null || i >= 0) {
            int size = this.f4195d.size() - 1;
            while (size >= 0) {
                C1463a aVar = (C1463a) this.f4195d.get(size);
                if ((str != null && str.equals(aVar.mo4512G())) || (i >= 0 && i == aVar.f4269v)) {
                    break;
                }
                size--;
            }
            if (size < 0) {
                return size;
            }
            if (z) {
                while (size > 0) {
                    C1463a aVar2 = (C1463a) this.f4195d.get(size - 1);
                    if ((str == null || !str.equals(aVar2.mo4512G())) && (i < 0 || i != aVar2.f4269v)) {
                        return size;
                    }
                    size--;
                }
                return size;
            } else if (size == this.f4195d.size() - 1) {
                return -1;
            } else {
                return size + 1;
            }
        } else if (z) {
            return 0;
        } else {
            return this.f4195d.size() - 1;
        }
    }

    /* renamed from: l1 */
    private boolean m4979l1(String str, int i, int i2) {
        mo4402c0(false);
        m4969b0(true);
        Fragment fragment = this.f4216y;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().mo4416j1()) {
            return true;
        }
        boolean m1 = mo4423m1(this.f4186M, this.f4187N, str, i, i2);
        if (m1) {
            this.f4193b = true;
            try {
                m4984q1(this.f4186M, this.f4187N);
            } finally {
                m4986s();
            }
        }
        m4957N1();
        m4963X();
        this.f4194c.mo4606b();
        return m1;
    }

    /* renamed from: m0 */
    static FragmentManager m4980m0(View view) {
        C1505h hVar;
        Fragment n0 = m4981n0(view);
        if (n0 == null) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    hVar = null;
                    break;
                } else if (context instanceof C1505h) {
                    hVar = (C1505h) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (hVar != null) {
                return hVar.getSupportFragmentManager();
            }
            throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
        } else if (n0.isAdded()) {
            return n0.getChildFragmentManager();
        } else {
            throw new IllegalStateException("The Fragment " + n0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
    }

    /* renamed from: n0 */
    private static Fragment m4981n0(View view) {
        while (view != null) {
            Fragment G0 = m4950G0(view);
            if (G0 != null) {
                return G0;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    /* renamed from: o0 */
    private void m4982o0() {
        for (C1520l0 k : m4990v()) {
            k.mo4740k();
        }
    }

    /* renamed from: p0 */
    private boolean m4983p0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f4192a) {
            if (this.f4192a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f4192a.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    z |= ((C1456m) this.f4192a.get(i)).mo4485a(arrayList, arrayList2);
                }
                return z;
            } finally {
                this.f4192a.clear();
                this.f4213v.mo4763g().removeCallbacks(this.f4191R);
            }
        }
    }

    /* renamed from: q1 */
    private void m4984q1(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!((C1463a) arrayList.get(i)).f4377r) {
                        if (i2 != i) {
                            m4975f0(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (((Boolean) arrayList2.get(i)).booleanValue()) {
                            while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C1463a) arrayList.get(i2)).f4377r) {
                                i2++;
                            }
                        }
                        m4975f0(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    m4975f0(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* renamed from: r */
    private void m4985r() {
        if (mo4394T0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: s */
    private void m4986s() {
        this.f4193b = false;
        this.f4187N.clear();
        this.f4186M.clear();
    }

    /* renamed from: s0 */
    private C1544x m4987s0(Fragment fragment) {
        return this.f4189P.mo4794iw(fragment);
    }

    /* renamed from: s1 */
    private void m4988s1() {
        ArrayList arrayList = this.f4204m;
        if (arrayList != null && arrayList.size() > 0) {
            C0125b.m366a(this.f4204m.get(0));
            throw null;
        }
    }

    /* renamed from: t */
    private void m4989t() {
        boolean z;
        C1529m mVar = this.f4213v;
        if (mVar instanceof C1638u0) {
            z = this.f4194c.mo4620p().mo4797mw();
        } else if (mVar.mo4762f() instanceof Activity) {
            z = !((Activity) this.f4213v.mo4762f()).isChangingConfigurations();
        } else {
            z = true;
        }
        if (z) {
            for (BackStackState backStackState : this.f4201j.values()) {
                for (String fw : backStackState.f4125d) {
                    this.f4194c.mo4620p().mo4791fw(fw);
                }
            }
        }
    }

    /* renamed from: v */
    private Set m4990v() {
        HashSet hashSet = new HashSet();
        for (C1480b0 k : this.f4194c.mo4615k()) {
            ViewGroup viewGroup = k.mo4563k().mContainer;
            if (viewGroup != null) {
                hashSet.add(C1520l0.m5399o(viewGroup, mo4363E0()));
            }
        }
        return hashSet;
    }

    /* renamed from: v0 */
    private ViewGroup m4991v0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f4214w.mo4328d()) {
            View c = this.f4214w.mo4327c(fragment.mContainerId);
            if (c instanceof ViewGroup) {
                return (ViewGroup) c;
            }
        }
        return null;
    }

    /* renamed from: w */
    private Set m4992w(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((C1463a) arrayList.get(i)).f4362c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((C1493e0.C1494a) it.next()).f4380b;
                if (!(fragment == null || (viewGroup = fragment.mContainer) == null)) {
                    hashSet.add(C1520l0.m5398n(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    /* renamed from: w1 */
    static int m4993w1(int i) {
        int i2 = 4097;
        if (i == 4097) {
            return 8194;
        }
        if (i != 8194) {
            i2 = 8197;
            if (i == 8197) {
                return 4100;
            }
            if (i == 4099) {
                return 4099;
            }
            if (i != 4100) {
                return 0;
            }
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo4350A() {
        this.f4182I = false;
        this.f4183J = false;
        this.f4189P.mo4800ow(false);
        m4959U(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public LayoutInflater.Factory2 mo4351A0() {
        return this.f4197f;
    }

    /* renamed from: A1 */
    public Fragment.SavedState mo4352A1(Fragment fragment) {
        C1480b0 n = this.f4194c.mo4618n(fragment.mWho);
        if (n == null || !n.mo4563k().equals(fragment)) {
            m4953L1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return n.mo4568r();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo4353B(Configuration configuration, boolean z) {
        if (z && (this.f4213v instanceof C0785i)) {
            m4953L1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f4194c.mo4619o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.mo4353B(configuration, true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B0 */
    public C1536q mo4354B0() {
        return this.f4205n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B1 */
    public void mo4355B1() {
        synchronized (this.f4192a) {
            boolean z = true;
            if (this.f4192a.size() != 1) {
                z = false;
            }
            if (z) {
                this.f4213v.mo4763g().removeCallbacks(this.f4191R);
                this.f4213v.mo4763g().post(this.f4191R);
                m4957N1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo4356C(MenuItem menuItem) {
        if (this.f4212u < 1) {
            return false;
        }
        for (Fragment fragment : this.f4194c.mo4619o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C0 */
    public Fragment mo4357C0() {
        return this.f4215x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C1 */
    public void mo4358C1(Fragment fragment, boolean z) {
        ViewGroup v0 = m4991v0(fragment);
        if (v0 != null && (v0 instanceof FragmentContainerView)) {
            ((FragmentContainerView) v0).setDrawDisappearingViewsLast(!z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo4359D() {
        this.f4182I = false;
        this.f4183J = false;
        this.f4189P.mo4800ow(false);
        m4959U(1);
    }

    /* renamed from: D0 */
    public Fragment mo4360D0() {
        return this.f4216y;
    }

    /* renamed from: D1 */
    public void mo4361D1(C1519l lVar) {
        this.f4217z = lVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo4362E(Menu menu, MenuInflater menuInflater) {
        if (this.f4212u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f4194c.mo4619o()) {
            if (fragment != null && mo4388Q0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f4196e != null) {
            for (int i = 0; i < this.f4196e.size(); i++) {
                Fragment fragment2 = (Fragment) this.f4196e.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f4196e = arrayList;
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E0 */
    public C1530m0 mo4363E0() {
        C1530m0 m0Var = this.f4175B;
        if (m0Var != null) {
            return m0Var;
        }
        Fragment fragment = this.f4215x;
        if (fragment != null) {
            return fragment.mFragmentManager.mo4363E0();
        }
        return this.f4176C;
    }

    /* renamed from: E1 */
    public final void mo4364E1(String str, Bundle bundle) {
        C1455l lVar = (C1455l) this.f4203l.get(str);
        if (lVar == null || !lVar.mo4483b(C1593j.C1598b.STARTED)) {
            this.f4202k.put(str, bundle);
        } else {
            lVar.mo4482a(str, bundle);
        }
        if (m4954M0(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo4365F() {
        this.f4184K = true;
        mo4402c0(true);
        m4966Z();
        m4989t();
        m4959U(-1);
        C1529m mVar = this.f4213v;
        if (mVar instanceof C0786j) {
            ((C0786j) mVar).removeOnTrimMemoryListener(this.f4208q);
        }
        C1529m mVar2 = this.f4213v;
        if (mVar2 instanceof C0785i) {
            ((C0785i) mVar2).removeOnConfigurationChangedListener(this.f4207p);
        }
        C1529m mVar3 = this.f4213v;
        if (mVar3 instanceof C0680c1) {
            ((C0680c1) mVar3).removeOnMultiWindowModeChangedListener(this.f4209r);
        }
        C1529m mVar4 = this.f4213v;
        if (mVar4 instanceof C0683d1) {
            ((C0683d1) mVar4).removeOnPictureInPictureModeChangedListener(this.f4210s);
        }
        C1529m mVar5 = this.f4213v;
        if (mVar5 instanceof C1114b0) {
            ((C1114b0) mVar5).removeMenuProvider(this.f4211t);
        }
        this.f4213v = null;
        this.f4214w = null;
        this.f4215x = null;
        if (this.f4198g != null) {
            this.f4199h.mo363d();
            this.f4198g = null;
        }
        C0173b bVar = this.f4177D;
        if (bVar != null) {
            bVar.mo387c();
            this.f4178E.mo387c();
            this.f4179F.mo387c();
        }
    }

    /* renamed from: F0 */
    public C6415b.C6418c mo4366F0() {
        return this.f4190Q;
    }

    /* renamed from: F1 */
    public final void mo4367F1(final String str, C1619q qVar, final C1464a0 a0Var) {
        final C1593j lifecycle = qVar.getLifecycle();
        if (lifecycle.mo4907b() != C1593j.C1598b.DESTROYED) {
            C14426 r0 = new C1606m() {
                /* renamed from: b */
                public void mo336b(C1619q qVar, C1593j.C1594a aVar) {
                    Bundle bundle;
                    if (aVar == C1593j.C1594a.ON_START && (bundle = (Bundle) FragmentManager.this.f4202k.get(str)) != null) {
                        a0Var.mo4482a(str, bundle);
                        FragmentManager.this.mo4437u(str);
                    }
                    if (aVar == C1593j.C1594a.ON_DESTROY) {
                        lifecycle.mo4909d(this);
                        FragmentManager.this.f4203l.remove(str);
                    }
                }
            };
            lifecycle.mo4906a(r0);
            C1455l lVar = (C1455l) this.f4203l.put(str, new C1455l(lifecycle, a0Var, r0));
            if (lVar != null) {
                lVar.mo4484c();
            }
            if (m4954M0(2)) {
                Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + a0Var);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo4368G() {
        m4959U(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G1 */
    public void mo4369G1(Fragment fragment, C1593j.C1598b bVar) {
        if (!fragment.equals(mo4410h0(fragment.mWho)) || !(fragment.mHost == null || fragment.mFragmentManager == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.mMaxState = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo4370H(boolean z) {
        if (z && (this.f4213v instanceof C0786j)) {
            m4953L1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f4194c.mo4619o()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.mo4370H(true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H0 */
    public C1636t0 mo4371H0(Fragment fragment) {
        return this.f4189P.mo4796lw(fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H1 */
    public void mo4372H1(Fragment fragment) {
        if (fragment == null || (fragment.equals(mo4410h0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f4216y;
            this.f4216y = fragment;
            m4955N(fragment2);
            m4955N(this.f4216y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo4373I(boolean z, boolean z2) {
        if (z2 && (this.f4213v instanceof C0680c1)) {
            m4953L1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f4194c.mo4619o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.mo4373I(z, true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I0 */
    public void mo4374I0() {
        mo4402c0(true);
        if (this.f4199h.mo362c()) {
            mo4416j1();
        } else {
            this.f4198g.mo345g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo4375J(Fragment fragment) {
        Iterator it = this.f4206o.iterator();
        while (it.hasNext()) {
            ((C1546y) it.next()).mo4461a(this, fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J0 */
    public void mo4376J0(Fragment fragment) {
        if (m4954M0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            m4951I1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J1 */
    public void mo4377J1(Fragment fragment) {
        if (m4954M0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo4378K() {
        for (Fragment fragment : this.f4194c.mo4616l()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.mo4378K();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K0 */
    public void mo4379K0(Fragment fragment) {
        if (fragment.mAdded && m4956N0(fragment)) {
            this.f4181H = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public boolean mo4380L(MenuItem menuItem) {
        if (this.f4212u < 1) {
            return false;
        }
        for (Fragment fragment : this.f4194c.mo4619o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: L0 */
    public boolean mo4381L0() {
        return this.f4184K;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo4382M(Menu menu) {
        if (this.f4212u >= 1) {
            for (Fragment fragment : this.f4194c.mo4619o()) {
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* renamed from: M1 */
    public void mo4383M1(C1454k kVar) {
        this.f4205n.mo4786p(kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo4384O() {
        m4959U(5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo4385P(boolean z, boolean z2) {
        if (z2 && (this.f4213v instanceof C0683d1)) {
            m4953L1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f4194c.mo4619o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.mo4385P(z, true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public boolean mo4386P0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public boolean mo4387Q(Menu menu) {
        boolean z = false;
        if (this.f4212u < 1) {
            return false;
        }
        for (Fragment fragment : this.f4194c.mo4619o()) {
            if (fragment != null && mo4388Q0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public boolean mo4388Q0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo4389R() {
        m4957N1();
        m4955N(this.f4216y);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R0 */
    public boolean mo4390R0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (!fragment.equals(fragmentManager.mo4360D0()) || !mo4390R0(fragmentManager.f4215x)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo4391S() {
        this.f4182I = false;
        this.f4183J = false;
        this.f4189P.mo4800ow(false);
        m4959U(7);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S0 */
    public boolean mo4392S0(int i) {
        return this.f4212u >= i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo4393T() {
        this.f4182I = false;
        this.f4183J = false;
        this.f4189P.mo4800ow(false);
        m4959U(5);
    }

    /* renamed from: T0 */
    public boolean mo4394T0() {
        return this.f4182I || this.f4183J;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo4395V() {
        this.f4183J = true;
        this.f4189P.mo4800ow(true);
        m4959U(4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo4396W() {
        m4959U(2);
    }

    /* renamed from: Y */
    public void mo4397Y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f4194c.mo4609e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f4196e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(((Fragment) this.f4196e.get(i)).toString());
            }
        }
        ArrayList arrayList2 = this.f4195d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C1463a aVar = (C1463a) this.f4195d.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.mo4507B(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f4200i.get());
        synchronized (this.f4192a) {
            int size3 = this.f4192a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println((C1456m) this.f4192a.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f4213v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f4214w);
        if (this.f4215x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f4215x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f4212u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f4182I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f4183J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f4184K);
        if (this.f4181H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f4181H);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z0 */
    public void mo4398Z0(Fragment fragment, String[] strArr, int i) {
        if (this.f4179F != null) {
            this.f4180G.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
            this.f4179F.mo404a(strArr);
            return;
        }
        this.f4213v.mo4764k(fragment, strArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void mo4399a0(C1456m mVar, boolean z) {
        if (!z) {
            if (this.f4213v != null) {
                m4985r();
            } else if (this.f4184K) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f4192a) {
            if (this.f4213v != null) {
                this.f4192a.add(mVar);
                mo4355B1();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a1 */
    public void mo4400a1(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (this.f4177D != null) {
            this.f4180G.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
            if (!(intent == null || bundle == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f4177D.mo404a(intent);
            return;
        }
        this.f4213v.mo4765m(fragment, intent, i, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b1 */
    public void mo4401b1(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        Intent intent2;
        Fragment fragment2 = fragment;
        Bundle bundle2 = bundle;
        if (this.f4178E != null) {
            if (bundle2 != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (m4954M0(2)) {
                    Log.v("FragmentManager", "ActivityOptions " + bundle2 + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle2);
            } else {
                intent2 = intent;
            }
            IntentSender intentSender2 = intentSender;
            IntentSenderRequest a = new IntentSenderRequest.C0171b(intentSender).mo401b(intent2).mo402c(i3, i2).mo400a();
            int i5 = i;
            this.f4180G.addLast(new LaunchedFragmentInfo(fragment2.mWho, i));
            if (m4954M0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
            }
            this.f4178E.mo404a(a);
            return;
        }
        IntentSender intentSender3 = intentSender;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        this.f4213v.mo4766n(fragment, intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public boolean mo4402c0(boolean z) {
        m4969b0(z);
        boolean z2 = false;
        while (m4983p0(this.f4186M, this.f4187N)) {
            z2 = true;
            this.f4193b = true;
            try {
                m4984q1(this.f4186M, this.f4187N);
            } finally {
                m4986s();
            }
        }
        m4957N1();
        m4963X();
        this.f4194c.mo4606b();
        return z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c1 */
    public void mo4403c1(int i, boolean z) {
        C1529m mVar;
        if (this.f4213v == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f4212u) {
            this.f4212u = i;
            this.f4194c.mo4624t();
            m4952K1();
            if (this.f4181H && (mVar = this.f4213v) != null && this.f4212u == 7) {
                mVar.mo4700o();
                this.f4181H = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo4404d0(C1456m mVar, boolean z) {
        if (!z || (this.f4213v != null && !this.f4184K)) {
            m4969b0(z);
            if (mVar.mo4485a(this.f4186M, this.f4187N)) {
                this.f4193b = true;
                try {
                    m4984q1(this.f4186M, this.f4187N);
                } finally {
                    m4986s();
                }
            }
            m4957N1();
            m4963X();
            this.f4194c.mo4606b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d1 */
    public void mo4405d1() {
        if (this.f4213v != null) {
            this.f4182I = false;
            this.f4183J = false;
            this.f4189P.mo4800ow(false);
            for (Fragment fragment : this.f4194c.mo4619o()) {
                if (fragment != null) {
                    fragment.noteStateNotSaved();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e1 */
    public void mo4406e1(FragmentContainerView fragmentContainerView) {
        View view;
        for (C1480b0 b0Var : this.f4194c.mo4615k()) {
            Fragment k = b0Var.mo4563k();
            if (k.mContainerId == fragmentContainerView.getId() && (view = k.mView) != null && view.getParent() == null) {
                k.mContainer = fragmentContainerView;
                b0Var.mo4554b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f1 */
    public void mo4407f1(C1480b0 b0Var) {
        Fragment k = b0Var.mo4563k();
        if (!k.mDeferStart) {
            return;
        }
        if (this.f4193b) {
            this.f4185L = true;
            return;
        }
        k.mDeferStart = false;
        b0Var.mo4564m();
    }

    /* renamed from: g0 */
    public boolean mo4408g0() {
        boolean c0 = mo4402c0(true);
        m4982o0();
        return c0;
    }

    /* renamed from: g1 */
    public void mo4409g1() {
        mo4399a0(new C1457n((String) null, -1, 0), false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public Fragment mo4410h0(String str) {
        return this.f4194c.mo4610f(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h1 */
    public void mo4411h1(int i, int i2, boolean z) {
        if (i >= 0) {
            mo4399a0(new C1457n((String) null, i, i2), z);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo4412i(C1463a aVar) {
        if (this.f4195d == null) {
            this.f4195d = new ArrayList();
        }
        this.f4195d.add(aVar);
    }

    /* renamed from: i1 */
    public void mo4413i1(String str, int i) {
        mo4399a0(new C1457n(str, -1, i), false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C1480b0 mo4414j(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            C6415b.m25483f(fragment, str);
        }
        if (m4954M0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C1480b0 x = mo4442x(fragment);
        fragment.mFragmentManager = this;
        this.f4194c.mo4622r(x);
        if (!fragment.mDetached) {
            this.f4194c.mo4605a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (m4956N0(fragment)) {
                this.f4181H = true;
            }
        }
        return x;
    }

    /* renamed from: j0 */
    public Fragment mo4415j0(int i) {
        return this.f4194c.mo4611g(i);
    }

    /* renamed from: j1 */
    public boolean mo4416j1() {
        return m4979l1((String) null, -1, 0);
    }

    /* renamed from: k */
    public void mo4417k(C1546y yVar) {
        this.f4206o.add(yVar);
    }

    /* renamed from: k0 */
    public Fragment mo4418k0(String str) {
        return this.f4194c.mo4612h(str);
    }

    /* renamed from: k1 */
    public boolean mo4419k1(int i, int i2) {
        if (i >= 0) {
            return m4979l1((String) null, i, i2);
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo4420l(Fragment fragment) {
        this.f4189P.mo4788dw(fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public Fragment mo4421l0(String str) {
        return this.f4194c.mo4613i(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo4422m() {
        return this.f4200i.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m1 */
    public boolean mo4423m1(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        boolean z;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        int i0 = m4978i0(str, i, z);
        if (i0 < 0) {
            return false;
        }
        for (int size = this.f4195d.size() - 1; size >= i0; size--) {
            arrayList.add((C1463a) this.f4195d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.activity.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: androidx.fragment.app.Fragment} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4424n(androidx.fragment.app.C1529m r4, androidx.fragment.app.C1513j r5, androidx.fragment.app.Fragment r6) {
        /*
            r3 = this;
            androidx.fragment.app.m r0 = r3.f4213v
            if (r0 != 0) goto L_0x016c
            r3.f4213v = r4
            r3.f4214w = r5
            r3.f4215x = r6
            if (r6 == 0) goto L_0x0015
            androidx.fragment.app.FragmentManager$g r5 = new androidx.fragment.app.FragmentManager$g
            r5.<init>(r6)
            r3.mo4417k(r5)
            goto L_0x001f
        L_0x0015:
            boolean r5 = r4 instanceof androidx.fragment.app.C1546y
            if (r5 == 0) goto L_0x001f
            r5 = r4
            androidx.fragment.app.y r5 = (androidx.fragment.app.C1546y) r5
            r3.mo4417k(r5)
        L_0x001f:
            androidx.fragment.app.Fragment r5 = r3.f4215x
            if (r5 == 0) goto L_0x0026
            r3.m4957N1()
        L_0x0026:
            boolean r5 = r4 instanceof androidx.activity.C0162q
            if (r5 == 0) goto L_0x003b
            r5 = r4
            androidx.activity.q r5 = (androidx.activity.C0162q) r5
            androidx.activity.OnBackPressedDispatcher r0 = r5.getOnBackPressedDispatcher()
            r3.f4198g = r0
            if (r6 == 0) goto L_0x0036
            r5 = r6
        L_0x0036:
            androidx.activity.h r1 = r3.f4199h
            r0.mo342c(r5, r1)
        L_0x003b:
            if (r6 == 0) goto L_0x0046
            androidx.fragment.app.FragmentManager r4 = r6.mFragmentManager
            androidx.fragment.app.x r4 = r4.m4987s0(r6)
            r3.f4189P = r4
            goto L_0x005f
        L_0x0046:
            boolean r5 = r4 instanceof androidx.lifecycle.C1638u0
            if (r5 == 0) goto L_0x0057
            androidx.lifecycle.u0 r4 = (androidx.lifecycle.C1638u0) r4
            androidx.lifecycle.t0 r4 = r4.getViewModelStore()
            androidx.fragment.app.x r4 = androidx.fragment.app.C1544x.m5467jw(r4)
            r3.f4189P = r4
            goto L_0x005f
        L_0x0057:
            androidx.fragment.app.x r4 = new androidx.fragment.app.x
            r5 = 0
            r4.<init>(r5)
            r3.f4189P = r4
        L_0x005f:
            androidx.fragment.app.x r4 = r3.f4189P
            boolean r5 = r3.mo4394T0()
            r4.mo4800ow(r5)
            androidx.fragment.app.d0 r4 = r3.f4194c
            androidx.fragment.app.x r5 = r3.f4189P
            r4.mo4603A(r5)
            androidx.fragment.app.m r4 = r3.f4213v
            boolean r5 = r4 instanceof p306x0.C8933d
            if (r5 == 0) goto L_0x0090
            if (r6 != 0) goto L_0x0090
            x0.d r4 = (p306x0.C8933d) r4
            androidx.savedstate.a r4 = r4.getSavedStateRegistry()
            androidx.fragment.app.v r5 = new androidx.fragment.app.v
            r5.<init>(r3)
            java.lang.String r0 = "android:support:fragments"
            r4.mo6116h(r0, r5)
            android.os.Bundle r4 = r4.mo6111b(r0)
            if (r4 == 0) goto L_0x0090
            r3.mo4440v1(r4)
        L_0x0090:
            androidx.fragment.app.m r4 = r3.f4213v
            boolean r5 = r4 instanceof androidx.activity.result.C0174c
            if (r5 == 0) goto L_0x0128
            androidx.activity.result.c r4 = (androidx.activity.result.C0174c) r4
            androidx.activity.result.ActivityResultRegistry r4 = r4.getActivityResultRegistry()
            if (r6 == 0) goto L_0x00b2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r6.mWho
            r5.append(r0)
            java.lang.String r0 = ":"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            goto L_0x00b4
        L_0x00b2:
            java.lang.String r5 = ""
        L_0x00b4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FragmentManager:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "StartActivityForResult"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            b.d r1 = new b.d
            r1.<init>()
            androidx.fragment.app.FragmentManager$h r2 = new androidx.fragment.app.FragmentManager$h
            r2.<init>()
            androidx.activity.result.b r0 = r4.mo384j(r0, r1, r2)
            r3.f4177D = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "StartIntentSenderForResult"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.fragment.app.FragmentManager$j r1 = new androidx.fragment.app.FragmentManager$j
            r1.<init>()
            androidx.fragment.app.FragmentManager$i r2 = new androidx.fragment.app.FragmentManager$i
            r2.<init>()
            androidx.activity.result.b r0 = r4.mo384j(r0, r1, r2)
            r3.f4178E = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "RequestPermissions"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            b.b r0 = new b.b
            r0.<init>()
            androidx.fragment.app.FragmentManager$a r1 = new androidx.fragment.app.FragmentManager$a
            r1.<init>()
            androidx.activity.result.b r4 = r4.mo384j(r5, r0, r1)
            r3.f4179F = r4
        L_0x0128:
            androidx.fragment.app.m r4 = r3.f4213v
            boolean r5 = r4 instanceof androidx.core.content.C0785i
            if (r5 == 0) goto L_0x0135
            androidx.core.content.i r4 = (androidx.core.content.C0785i) r4
            androidx.core.util.a r5 = r3.f4207p
            r4.addOnConfigurationChangedListener(r5)
        L_0x0135:
            androidx.fragment.app.m r4 = r3.f4213v
            boolean r5 = r4 instanceof androidx.core.content.C0786j
            if (r5 == 0) goto L_0x0142
            androidx.core.content.j r4 = (androidx.core.content.C0786j) r4
            androidx.core.util.a r5 = r3.f4208q
            r4.addOnTrimMemoryListener(r5)
        L_0x0142:
            androidx.fragment.app.m r4 = r3.f4213v
            boolean r5 = r4 instanceof androidx.core.app.C0680c1
            if (r5 == 0) goto L_0x014f
            androidx.core.app.c1 r4 = (androidx.core.app.C0680c1) r4
            androidx.core.util.a r5 = r3.f4209r
            r4.addOnMultiWindowModeChangedListener(r5)
        L_0x014f:
            androidx.fragment.app.m r4 = r3.f4213v
            boolean r5 = r4 instanceof androidx.core.app.C0683d1
            if (r5 == 0) goto L_0x015c
            androidx.core.app.d1 r4 = (androidx.core.app.C0683d1) r4
            androidx.core.util.a r5 = r3.f4210s
            r4.addOnPictureInPictureModeChangedListener(r5)
        L_0x015c:
            androidx.fragment.app.m r4 = r3.f4213v
            boolean r5 = r4 instanceof androidx.core.view.C1114b0
            if (r5 == 0) goto L_0x016b
            if (r6 != 0) goto L_0x016b
            androidx.core.view.b0 r4 = (androidx.core.view.C1114b0) r4
            androidx.core.view.t0 r5 = r3.f4211t
            r4.addMenuProvider(r5)
        L_0x016b:
            return
        L_0x016c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already attached"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.mo4424n(androidx.fragment.app.m, androidx.fragment.app.j, androidx.fragment.app.Fragment):void");
    }

    /* renamed from: n1 */
    public void mo4425n1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            m4953L1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo4426o(Fragment fragment) {
        if (m4954M0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.f4194c.mo4605a(fragment);
                if (m4954M0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (m4956N0(fragment)) {
                    this.f4181H = true;
                }
            }
        }
    }

    /* renamed from: o1 */
    public void mo4427o1(C1454k kVar, boolean z) {
        this.f4205n.mo4785o(kVar, z);
    }

    /* renamed from: p */
    public C1493e0 mo4428p() {
        return new C1463a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p1 */
    public void mo4429p1(Fragment fragment) {
        if (m4954M0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            this.f4194c.mo4625u(fragment);
            if (m4956N0(fragment)) {
                this.f4181H = true;
            }
            fragment.mRemoving = true;
            m4951I1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo4430q() {
        boolean z = false;
        for (Fragment fragment : this.f4194c.mo4616l()) {
            if (fragment != null) {
                z = m4956N0(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public List mo4431q0() {
        return this.f4194c.mo4616l();
    }

    /* renamed from: r0 */
    public int mo4432r0() {
        ArrayList arrayList = this.f4195d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r1 */
    public void mo4433r1(Fragment fragment) {
        this.f4189P.mo4798nw(fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public C1513j mo4434t0() {
        return this.f4214w;
    }

    /* renamed from: t1 */
    public void mo4435t1(String str) {
        mo4399a0(new C1458o(str), false);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f4215x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f4215x)));
            sb.append("}");
        } else {
            C1529m mVar = this.f4213v;
            if (mVar != null) {
                sb.append(mVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f4213v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public final void mo4437u(String str) {
        this.f4202k.remove(str);
        if (m4954M0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    /* renamed from: u0 */
    public Fragment mo4438u0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment h0 = mo4410h0(string);
        if (h0 == null) {
            m4953L1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return h0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u1 */
    public boolean mo4439u1(ArrayList arrayList, ArrayList arrayList2, String str) {
        BackStackState backStackState = (BackStackState) this.f4201j.remove(str);
        if (backStackState == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1463a aVar = (C1463a) it.next();
            if (aVar.f4270w) {
                Iterator it2 = aVar.f4362c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment = ((C1493e0.C1494a) it2.next()).f4380b;
                    if (fragment != null) {
                        hashMap.put(fragment.mWho, fragment);
                    }
                }
            }
        }
        Iterator it3 = backStackState.mo4141a(this, hashMap).iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it3.hasNext()) {
                    return z;
                }
                if (((C1463a) it3.next()).mo4485a(arrayList, arrayList2) || z) {
                    z = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v1 */
    public void mo4440v1(Parcelable parcelable) {
        C1480b0 b0Var;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable != null) {
            Bundle bundle3 = (Bundle) parcelable;
            for (String next : bundle3.keySet()) {
                if (next.startsWith("result_") && (bundle2 = bundle3.getBundle(next)) != null) {
                    bundle2.setClassLoader(this.f4213v.mo4762f().getClassLoader());
                    this.f4202k.put(next.substring(7), bundle2);
                }
            }
            ArrayList arrayList = new ArrayList();
            for (String next2 : bundle3.keySet()) {
                if (next2.startsWith("fragment_") && (bundle = bundle3.getBundle(next2)) != null) {
                    bundle.setClassLoader(this.f4213v.mo4762f().getClassLoader());
                    arrayList.add((FragmentState) bundle.getParcelable("state"));
                }
            }
            this.f4194c.mo4628x(arrayList);
            FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
            if (fragmentManagerState != null) {
                this.f4194c.mo4626v();
                Iterator it = fragmentManagerState.f4245d.iterator();
                while (it.hasNext()) {
                    FragmentState B = this.f4194c.mo4604B((String) it.next(), (FragmentState) null);
                    if (B != null) {
                        Fragment hw = this.f4189P.mo4793hw(B.f4254e);
                        if (hw != null) {
                            if (m4954M0(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + hw);
                            }
                            b0Var = new C1480b0(this.f4205n, this.f4194c, hw, B);
                        } else {
                            b0Var = new C1480b0(this.f4205n, this.f4194c, this.f4213v.mo4762f().getClassLoader(), mo4441w0(), B);
                        }
                        Fragment k = b0Var.mo4563k();
                        k.mFragmentManager = this;
                        if (m4954M0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + k.mWho + "): " + k);
                        }
                        b0Var.mo4566o(this.f4213v.mo4762f().getClassLoader());
                        this.f4194c.mo4622r(b0Var);
                        b0Var.mo4571u(this.f4212u);
                    }
                }
                for (Fragment fragment : this.f4189P.mo4795kw()) {
                    if (!this.f4194c.mo4607c(fragment.mWho)) {
                        if (m4954M0(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.f4245d);
                        }
                        this.f4189P.mo4798nw(fragment);
                        fragment.mFragmentManager = this;
                        C1480b0 b0Var2 = new C1480b0(this.f4205n, this.f4194c, fragment);
                        b0Var2.mo4571u(1);
                        b0Var2.mo4564m();
                        fragment.mRemoving = true;
                        b0Var2.mo4564m();
                    }
                }
                this.f4194c.mo4627w(fragmentManagerState.f4246e);
                if (fragmentManagerState.f4247f != null) {
                    this.f4195d = new ArrayList(fragmentManagerState.f4247f.length);
                    int i = 0;
                    while (true) {
                        BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f4247f;
                        if (i >= backStackRecordStateArr.length) {
                            break;
                        }
                        C1463a b = backStackRecordStateArr[i].mo4133b(this);
                        if (m4954M0(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i + " (index " + b.f4269v + "): " + b);
                            PrintWriter printWriter = new PrintWriter(new C1518k0("FragmentManager"));
                            b.mo4508C("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f4195d.add(b);
                        i++;
                    }
                } else {
                    this.f4195d = null;
                }
                this.f4200i.set(fragmentManagerState.f4248g);
                String str = fragmentManagerState.f4249h;
                if (str != null) {
                    Fragment h0 = mo4410h0(str);
                    this.f4216y = h0;
                    m4955N(h0);
                }
                ArrayList arrayList2 = fragmentManagerState.f4250i;
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        this.f4201j.put((String) arrayList2.get(i2), (BackStackState) fragmentManagerState.f4251j.get(i2));
                    }
                }
                this.f4180G = new ArrayDeque(fragmentManagerState.f4252k);
            }
        }
    }

    /* renamed from: w0 */
    public C1519l mo4441w0() {
        C1519l lVar = this.f4217z;
        if (lVar != null) {
            return lVar;
        }
        Fragment fragment = this.f4215x;
        if (fragment != null) {
            return fragment.mFragmentManager.mo4441w0();
        }
        return this.f4174A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public C1480b0 mo4442x(Fragment fragment) {
        C1480b0 n = this.f4194c.mo4618n(fragment.mWho);
        if (n != null) {
            return n;
        }
        C1480b0 b0Var = new C1480b0(this.f4205n, this.f4194c, fragment);
        b0Var.mo4566o(this.f4213v.mo4762f().getClassLoader());
        b0Var.mo4571u(this.f4212u);
        return b0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public C1491d0 mo4443x0() {
        return this.f4194c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x1 */
    public Bundle m4960U0() {
        BackStackRecordState[] backStackRecordStateArr;
        int size;
        Bundle bundle = new Bundle();
        m4982o0();
        m4966Z();
        mo4402c0(true);
        this.f4182I = true;
        this.f4189P.mo4800ow(true);
        ArrayList y = this.f4194c.mo4629y();
        ArrayList m = this.f4194c.mo4617m();
        if (!m.isEmpty()) {
            ArrayList z = this.f4194c.mo4630z();
            ArrayList arrayList = this.f4195d;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                backStackRecordStateArr = null;
            } else {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState((C1463a) this.f4195d.get(i));
                    if (m4954M0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f4195d.get(i));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f4245d = y;
            fragmentManagerState.f4246e = z;
            fragmentManagerState.f4247f = backStackRecordStateArr;
            fragmentManagerState.f4248g = this.f4200i.get();
            Fragment fragment = this.f4216y;
            if (fragment != null) {
                fragmentManagerState.f4249h = fragment.mWho;
            }
            fragmentManagerState.f4250i.addAll(this.f4201j.keySet());
            fragmentManagerState.f4251j.addAll(this.f4201j.values());
            fragmentManagerState.f4252k = new ArrayList(this.f4180G);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f4202k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f4202k.get(str));
            }
            Iterator it = m.iterator();
            while (it.hasNext()) {
                FragmentState fragmentState = (FragmentState) it.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", fragmentState);
                bundle.putBundle("fragment_" + fragmentState.f4254e, bundle2);
            }
        } else if (m4954M0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo4445y(Fragment fragment) {
        if (m4954M0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (m4954M0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.f4194c.mo4625u(fragment);
                if (m4956N0(fragment)) {
                    this.f4181H = true;
                }
                m4951I1(fragment);
            }
        }
    }

    /* renamed from: y0 */
    public List mo4446y0() {
        return this.f4194c.mo4619o();
    }

    /* renamed from: y1 */
    public void mo4447y1(String str) {
        mo4399a0(new C1459p(str), false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo4448z() {
        this.f4182I = false;
        this.f4183J = false;
        this.f4189P.mo4800ow(false);
        m4959U(4);
    }

    /* renamed from: z0 */
    public C1529m mo4449z0() {
        return this.f4213v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z1 */
    public boolean mo4450z1(ArrayList arrayList, ArrayList arrayList2, String str) {
        String str2;
        String str3;
        int i;
        String str4 = str;
        int i0 = m4978i0(str4, -1, true);
        if (i0 < 0) {
            return false;
        }
        for (int i2 = i0; i2 < this.f4195d.size(); i2++) {
            C1463a aVar = (C1463a) this.f4195d.get(i2);
            if (!aVar.f4377r) {
                m4953L1(new IllegalArgumentException("saveBackStack(\"" + str4 + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + aVar + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        for (int i3 = i0; i3 < this.f4195d.size(); i3++) {
            C1463a aVar2 = (C1463a) this.f4195d.get(i3);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            Iterator it = aVar2.f4362c.iterator();
            while (it.hasNext()) {
                C1493e0.C1494a aVar3 = (C1493e0.C1494a) it.next();
                Fragment fragment = aVar3.f4380b;
                if (fragment != null) {
                    if (!aVar3.f4381c || (i = aVar3.f4379a) == 1 || i == 2 || i == 8) {
                        hashSet.add(fragment);
                        hashSet2.add(fragment);
                    }
                    int i4 = aVar3.f4379a;
                    if (i4 == 1 || i4 == 2) {
                        hashSet3.add(fragment);
                    }
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("saveBackStack(\"");
                sb.append(str4);
                sb.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                if (hashSet2.size() == 1) {
                    str3 = " " + hashSet2.iterator().next();
                } else {
                    str3 = "s " + hashSet2;
                }
                sb.append(str3);
                sb.append(" in ");
                sb.append(aVar2);
                sb.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                m4953L1(new IllegalArgumentException(sb.toString()));
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
            if (fragment2.mRetainInstance) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("saveBackStack(\"");
                sb2.append(str4);
                sb2.append("\") must not contain retained fragments. Found ");
                if (hashSet.contains(fragment2)) {
                    str2 = "direct reference to retained ";
                } else {
                    str2 = "retained child ";
                }
                sb2.append(str2);
                sb2.append("fragment ");
                sb2.append(fragment2);
                m4953L1(new IllegalArgumentException(sb2.toString()));
            }
            for (Fragment fragment3 : fragment2.mChildFragmentManager.mo4431q0()) {
                if (fragment3 != null) {
                    arrayDeque.addLast(fragment3);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((Fragment) it2.next()).mWho);
        }
        ArrayList arrayList4 = new ArrayList(this.f4195d.size() - i0);
        for (int i5 = i0; i5 < this.f4195d.size(); i5++) {
            arrayList4.add((Object) null);
        }
        BackStackState backStackState = new BackStackState(arrayList3, arrayList4);
        for (int size = this.f4195d.size() - 1; size >= i0; size--) {
            C1463a aVar4 = (C1463a) this.f4195d.remove(size);
            C1463a aVar5 = new C1463a(aVar4);
            aVar5.mo4527z();
            arrayList4.set(size - i0, new BackStackRecordState(aVar5));
            aVar4.f4270w = true;
            arrayList.add(aVar4);
            arrayList2.add(Boolean.TRUE);
        }
        this.f4201j.put(str4, backStackState);
        return true;
    }

    @SuppressLint({"BanParcelableUsage"})
    static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new C1443a();

        /* renamed from: d */
        String f4222d;

        /* renamed from: e */
        int f4223e;

        /* renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$a */
        class C1443a implements Parcelable.Creator {
            C1443a() {
            }

            /* renamed from: a */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            /* renamed from: b */
            public LaunchedFragmentInfo[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        LaunchedFragmentInfo(String str, int i) {
            this.f4222d = str;
            this.f4223e = i;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f4222d);
            parcel.writeInt(this.f4223e);
        }

        LaunchedFragmentInfo(Parcel parcel) {
            this.f4222d = parcel.readString();
            this.f4223e = parcel.readInt();
        }
    }
}
