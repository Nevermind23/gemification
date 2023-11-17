package p060e1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.C0820l;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* renamed from: e1.i0 */
public abstract class C5936i0 implements Cloneable {

    /* renamed from: J */
    private static final int[] f18570J = {2, 1, 3, 4};

    /* renamed from: K */
    private static final C6011z f18571K = new C5937a();

    /* renamed from: L */
    private static ThreadLocal f18572L = new ThreadLocal();

    /* renamed from: A */
    private int f18573A = 0;

    /* renamed from: B */
    private boolean f18574B = false;

    /* renamed from: C */
    private boolean f18575C = false;

    /* renamed from: D */
    private ArrayList f18576D = null;

    /* renamed from: E */
    private ArrayList f18577E = new ArrayList();

    /* renamed from: F */
    C5963m0 f18578F;

    /* renamed from: G */
    private C5942f f18579G;

    /* renamed from: H */
    private ArrayMap f18580H;

    /* renamed from: I */
    private C6011z f18581I = f18571K;

    /* renamed from: d */
    private String f18582d = getClass().getName();

    /* renamed from: e */
    private long f18583e = -1;

    /* renamed from: f */
    long f18584f = -1;

    /* renamed from: g */
    private TimeInterpolator f18585g = null;

    /* renamed from: h */
    ArrayList f18586h = new ArrayList();

    /* renamed from: i */
    ArrayList f18587i = new ArrayList();

    /* renamed from: j */
    private ArrayList f18588j = null;

    /* renamed from: k */
    private ArrayList f18589k = null;

    /* renamed from: l */
    private ArrayList f18590l = null;

    /* renamed from: m */
    private ArrayList f18591m = null;

    /* renamed from: n */
    private ArrayList f18592n = null;

    /* renamed from: o */
    private ArrayList f18593o = null;

    /* renamed from: p */
    private ArrayList f18594p = null;

    /* renamed from: q */
    private ArrayList f18595q = null;

    /* renamed from: r */
    private ArrayList f18596r = null;

    /* renamed from: s */
    private C5992r0 f18597s = new C5992r0();

    /* renamed from: t */
    private C5992r0 f18598t = new C5992r0();

    /* renamed from: u */
    C5968n0 f18599u = null;

    /* renamed from: v */
    private int[] f18600v = f18570J;

    /* renamed from: w */
    private ArrayList f18601w;

    /* renamed from: x */
    private ArrayList f18602x;

    /* renamed from: y */
    boolean f18603y = false;

    /* renamed from: z */
    ArrayList f18604z = new ArrayList();

    /* renamed from: e1.i0$a */
    class C5937a extends C6011z {
        C5937a() {
        }

        /* renamed from: a */
        public Path mo19242a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: e1.i0$b */
    class C5938b extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ ArrayMap f18605d;

        C5938b(ArrayMap arrayMap) {
            this.f18605d = arrayMap;
        }

        public void onAnimationEnd(Animator animator) {
            this.f18605d.remove(animator);
            C5936i0.this.f18604z.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            C5936i0.this.f18604z.add(animator);
        }
    }

    /* renamed from: e1.i0$c */
    class C5939c extends AnimatorListenerAdapter {
        C5939c() {
        }

        public void onAnimationEnd(Animator animator) {
            C5936i0.this.mo19354t();
            animator.removeListener(this);
        }
    }

    /* renamed from: e1.i0$d */
    private static class C5940d {

        /* renamed from: a */
        View f18608a;

        /* renamed from: b */
        String f18609b;

        /* renamed from: c */
        C5989q0 f18610c;

        /* renamed from: d */
        C5993r1 f18611d;

        /* renamed from: e */
        C5936i0 f18612e;

        C5940d(View view, String str, C5936i0 i0Var, C5993r1 r1Var, C5989q0 q0Var) {
            this.f18608a = view;
            this.f18609b = str;
            this.f18610c = q0Var;
            this.f18611d = r1Var;
            this.f18612e = i0Var;
        }
    }

    /* renamed from: e1.i0$e */
    private static class C5941e {
        /* renamed from: a */
        static ArrayList m23859a(ArrayList arrayList, Object obj) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
            return arrayList;
        }

        /* renamed from: b */
        static ArrayList m23860b(ArrayList arrayList, Object obj) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(obj);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    /* renamed from: e1.i0$f */
    public static abstract class C5942f {
        /* renamed from: a */
        public abstract Rect mo19367a(C5936i0 i0Var);
    }

    /* renamed from: e1.i0$g */
    public interface C5943g {
        /* renamed from: a */
        void mo19292a(C5936i0 i0Var);

        /* renamed from: b */
        void mo19293b(C5936i0 i0Var);

        /* renamed from: c */
        void mo19294c(C5936i0 i0Var);

        /* renamed from: d */
        void mo19368d(C5936i0 i0Var);

        /* renamed from: e */
        void mo19295e(C5936i0 i0Var);
    }

    public C5936i0() {
    }

    /* renamed from: D */
    private ArrayList m23788D(ArrayList arrayList, Class cls, boolean z) {
        if (cls == null) {
            return arrayList;
        }
        if (z) {
            return C5941e.m23859a(arrayList, cls);
        }
        return C5941e.m23860b(arrayList, cls);
    }

    /* renamed from: E */
    private ArrayList m23789E(ArrayList arrayList, View view, boolean z) {
        if (view == null) {
            return arrayList;
        }
        if (z) {
            return C5941e.m23859a(arrayList, view);
        }
        return C5941e.m23860b(arrayList, view);
    }

    /* renamed from: O */
    private static ArrayMap m23790O() {
        ArrayMap arrayMap = (ArrayMap) f18572L.get();
        if (arrayMap != null) {
            return arrayMap;
        }
        ArrayMap arrayMap2 = new ArrayMap();
        f18572L.set(arrayMap2);
        return arrayMap2;
    }

    /* renamed from: Y */
    private static boolean m23791Y(int i) {
        return i >= 1 && i <= 4;
    }

    /* renamed from: a0 */
    private static boolean m23792a0(C5989q0 q0Var, C5989q0 q0Var2, String str) {
        Object obj = q0Var.f18718a.get(str);
        Object obj2 = q0Var2.f18718a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* renamed from: b0 */
    private void m23793b0(ArrayMap arrayMap, ArrayMap arrayMap2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) sparseArray.valueAt(i);
            if (view2 != null && mo19332Z(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i))) != null && mo19332Z(view)) {
                C5989q0 q0Var = (C5989q0) arrayMap.get(view2);
                C5989q0 q0Var2 = (C5989q0) arrayMap2.get(view);
                if (!(q0Var == null || q0Var2 == null)) {
                    this.f18601w.add(q0Var);
                    this.f18602x.add(q0Var2);
                    arrayMap.remove(view2);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    /* renamed from: c0 */
    private void m23794c0(ArrayMap arrayMap, ArrayMap arrayMap2) {
        C5989q0 q0Var;
        for (int size = arrayMap.size() - 1; size >= 0; size--) {
            View view = (View) arrayMap.keyAt(size);
            if (view != null && mo19332Z(view) && (q0Var = (C5989q0) arrayMap2.remove(view)) != null && mo19332Z(q0Var.f18719b)) {
                this.f18601w.add((C5989q0) arrayMap.removeAt(size));
                this.f18602x.add(q0Var);
            }
        }
    }

    /* renamed from: d0 */
    private void m23795d0(ArrayMap arrayMap, ArrayMap arrayMap2, LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        View view;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) longSparseArray.valueAt(i);
            if (view2 != null && mo19332Z(view2) && (view = (View) longSparseArray2.get(longSparseArray.keyAt(i))) != null && mo19332Z(view)) {
                C5989q0 q0Var = (C5989q0) arrayMap.get(view2);
                C5989q0 q0Var2 = (C5989q0) arrayMap2.get(view);
                if (!(q0Var == null || q0Var2 == null)) {
                    this.f18601w.add(q0Var);
                    this.f18602x.add(q0Var2);
                    arrayMap.remove(view2);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    /* renamed from: e0 */
    private void m23796e0(ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3, ArrayMap arrayMap4) {
        View view;
        int size = arrayMap3.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayMap3.valueAt(i);
            if (view2 != null && mo19332Z(view2) && (view = (View) arrayMap4.get(arrayMap3.keyAt(i))) != null && mo19332Z(view)) {
                C5989q0 q0Var = (C5989q0) arrayMap.get(view2);
                C5989q0 q0Var2 = (C5989q0) arrayMap2.get(view);
                if (!(q0Var == null || q0Var2 == null)) {
                    this.f18601w.add(q0Var);
                    this.f18602x.add(q0Var2);
                    arrayMap.remove(view2);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    /* renamed from: f */
    private void m23797f(ArrayMap arrayMap, ArrayMap arrayMap2) {
        for (int i = 0; i < arrayMap.size(); i++) {
            C5989q0 q0Var = (C5989q0) arrayMap.valueAt(i);
            if (mo19332Z(q0Var.f18719b)) {
                this.f18601w.add(q0Var);
                this.f18602x.add((Object) null);
            }
        }
        for (int i2 = 0; i2 < arrayMap2.size(); i2++) {
            C5989q0 q0Var2 = (C5989q0) arrayMap2.valueAt(i2);
            if (mo19332Z(q0Var2.f18719b)) {
                this.f18602x.add(q0Var2);
                this.f18601w.add((Object) null);
            }
        }
    }

    /* renamed from: g */
    private static void m23798g(C5992r0 r0Var, View view, C5989q0 q0Var) {
        r0Var.f18724a.put(view, q0Var);
        int id = view.getId();
        if (id >= 0) {
            if (r0Var.f18725b.indexOfKey(id) >= 0) {
                r0Var.f18725b.put(id, (Object) null);
            } else {
                r0Var.f18725b.put(id, view);
            }
        }
        String J = ViewCompat.m3557J(view);
        if (J != null) {
            if (r0Var.f18727d.containsKey(J)) {
                r0Var.f18727d.put(J, null);
            } else {
                r0Var.f18727d.put(J, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (r0Var.f18726c.indexOfKey(itemIdAtPosition) >= 0) {
                    View view2 = (View) r0Var.f18726c.get(itemIdAtPosition);
                    if (view2 != null) {
                        ViewCompat.m3542B0(view2, false);
                        r0Var.f18726c.put(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                ViewCompat.m3542B0(view, true);
                r0Var.f18726c.put(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: g0 */
    private void m23799g0(C5992r0 r0Var, C5992r0 r0Var2) {
        ArrayMap arrayMap = new ArrayMap((SimpleArrayMap) r0Var.f18724a);
        ArrayMap arrayMap2 = new ArrayMap((SimpleArrayMap) r0Var2.f18724a);
        int i = 0;
        while (true) {
            int[] iArr = this.f18600v;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m23794c0(arrayMap, arrayMap2);
                } else if (i2 == 2) {
                    m23796e0(arrayMap, arrayMap2, r0Var.f18727d, r0Var2.f18727d);
                } else if (i2 == 3) {
                    m23793b0(arrayMap, arrayMap2, r0Var.f18725b, r0Var2.f18725b);
                } else if (i2 == 4) {
                    m23795d0(arrayMap, arrayMap2, r0Var.f18726c, r0Var2.f18726c);
                }
                i++;
            } else {
                m23797f(arrayMap, arrayMap2);
                return;
            }
        }
    }

    /* renamed from: h */
    private static boolean m23800h(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h0 */
    private static int[] m23801h0(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i] = 3;
            } else if ("instance".equalsIgnoreCase(trim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i] = 2;
            } else if ("itemId".equalsIgnoreCase(trim)) {
                iArr[i] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[(iArr.length - 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            } else {
                throw new InflateException("Unknown match type in matchOrder: '" + trim + "'");
            }
            i++;
        }
        return iArr;
    }

    /* renamed from: l */
    private void m23802l(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList arrayList = this.f18590l;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList arrayList2 = this.f18591m;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList arrayList3 = this.f18592n;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            if (!((Class) this.f18592n.get(i)).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C5989q0 q0Var = new C5989q0(view);
                        if (z) {
                            mo16527n(q0Var);
                        } else {
                            mo16526k(q0Var);
                        }
                        q0Var.f18720c.add(this);
                        mo19345m(q0Var);
                        if (z) {
                            m23798g(this.f18597s, view, q0Var);
                        } else {
                            m23798g(this.f18598t, view, q0Var);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList arrayList4 = this.f18594p;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList arrayList5 = this.f18595q;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList arrayList6 = this.f18596r;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        if (!((Class) this.f18596r.get(i2)).isInstance(view)) {
                                            i2++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    m23802l(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: n0 */
    private void m23803n0(Animator animator, ArrayMap arrayMap) {
        if (animator != null) {
            animator.addListener(new C5938b(arrayMap));
            mo19341j(animator);
        }
    }

    /* renamed from: y */
    private ArrayList m23804y(ArrayList arrayList, int i, boolean z) {
        if (i <= 0) {
            return arrayList;
        }
        if (z) {
            return C5941e.m23859a(arrayList, Integer.valueOf(i));
        }
        return C5941e.m23860b(arrayList, Integer.valueOf(i));
    }

    /* renamed from: z */
    private static ArrayList m23805z(ArrayList arrayList, Object obj, boolean z) {
        if (obj == null) {
            return arrayList;
        }
        if (z) {
            return C5941e.m23859a(arrayList, obj);
        }
        return C5941e.m23860b(arrayList, obj);
    }

    /* renamed from: A */
    public C5936i0 mo19313A(int i, boolean z) {
        this.f18590l = m23804y(this.f18590l, i, z);
        return this;
    }

    /* renamed from: B */
    public C5936i0 mo19314B(Class cls, boolean z) {
        this.f18592n = m23788D(this.f18592n, cls, z);
        return this;
    }

    /* renamed from: C */
    public C5936i0 mo19315C(String str, boolean z) {
        this.f18593o = m23805z(this.f18593o, str, z);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo19316F(ViewGroup viewGroup) {
        ArrayMap O = m23790O();
        int size = O.size();
        if (viewGroup != null && size != 0) {
            C5993r1 d = C5887a1.m23687d(viewGroup);
            ArrayMap arrayMap = new ArrayMap((SimpleArrayMap) O);
            O.clear();
            for (int i = size - 1; i >= 0; i--) {
                C5940d dVar = (C5940d) arrayMap.valueAt(i);
                if (!(dVar.f18608a == null || d == null || !d.equals(dVar.f18611d))) {
                    ((Animator) arrayMap.keyAt(i)).end();
                }
            }
        }
    }

    /* renamed from: G */
    public long mo19317G() {
        return this.f18584f;
    }

    /* renamed from: H */
    public Rect mo19318H() {
        C5942f fVar = this.f18579G;
        if (fVar == null) {
            return null;
        }
        return fVar.mo19367a(this);
    }

    /* renamed from: I */
    public C5942f mo19319I() {
        return this.f18579G;
    }

    /* renamed from: J */
    public TimeInterpolator mo19320J() {
        return this.f18585g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public C5989q0 mo19321K(View view, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C5968n0 n0Var = this.f18599u;
        if (n0Var != null) {
            return n0Var.mo19321K(view, z);
        }
        if (z) {
            arrayList = this.f18601w;
        } else {
            arrayList = this.f18602x;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            C5989q0 q0Var = (C5989q0) arrayList.get(i);
            if (q0Var == null) {
                return null;
            }
            if (q0Var.f18719b == view) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return null;
        }
        if (z) {
            arrayList2 = this.f18602x;
        } else {
            arrayList2 = this.f18601w;
        }
        return (C5989q0) arrayList2.get(i);
    }

    /* renamed from: L */
    public String mo19322L() {
        return this.f18582d;
    }

    /* renamed from: M */
    public C6011z mo19323M() {
        return this.f18581I;
    }

    /* renamed from: N */
    public C5963m0 mo19324N() {
        return this.f18578F;
    }

    /* renamed from: P */
    public long mo19325P() {
        return this.f18583e;
    }

    /* renamed from: Q */
    public List mo19326Q() {
        return this.f18586h;
    }

    /* renamed from: S */
    public List mo19327S() {
        return this.f18588j;
    }

    /* renamed from: T */
    public List mo19328T() {
        return this.f18589k;
    }

    /* renamed from: U */
    public List mo19329U() {
        return this.f18587i;
    }

    /* renamed from: V */
    public String[] mo19264V() {
        return null;
    }

    /* renamed from: W */
    public C5989q0 mo19330W(View view, boolean z) {
        C5992r0 r0Var;
        C5968n0 n0Var = this.f18599u;
        if (n0Var != null) {
            return n0Var.mo19330W(view, z);
        }
        if (z) {
            r0Var = this.f18597s;
        } else {
            r0Var = this.f18598t;
        }
        return (C5989q0) r0Var.f18724a.get(view);
    }

    /* renamed from: X */
    public boolean mo19331X(C5989q0 q0Var, C5989q0 q0Var2) {
        if (q0Var == null || q0Var2 == null) {
            return false;
        }
        String[] V = mo19264V();
        if (V != null) {
            int length = V.length;
            int i = 0;
            while (i < length) {
                if (!m23792a0(q0Var, q0Var2, V[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String a0 : q0Var.f18718a.keySet()) {
            if (m23792a0(q0Var, q0Var2, a0)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public boolean mo19332Z(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.f18590l;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.f18591m;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f18592n;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.f18592n.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f18593o != null && ViewCompat.m3557J(view) != null && this.f18593o.contains(ViewCompat.m3557J(view))) {
            return false;
        }
        if ((this.f18586h.size() == 0 && this.f18587i.size() == 0 && (((arrayList = this.f18589k) == null || arrayList.isEmpty()) && ((arrayList2 = this.f18588j) == null || arrayList2.isEmpty()))) || this.f18586h.contains(Integer.valueOf(id)) || this.f18587i.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f18588j;
        if (arrayList6 != null && arrayList6.contains(ViewCompat.m3557J(view))) {
            return true;
        }
        if (this.f18589k != null) {
            for (int i2 = 0; i2 < this.f18589k.size(); i2++) {
                if (((Class) this.f18589k.get(i2)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public C5936i0 mo19333a(C5943g gVar) {
        if (this.f18576D == null) {
            this.f18576D = new ArrayList();
        }
        this.f18576D.add(gVar);
        return this;
    }

    /* renamed from: b */
    public C5936i0 mo19334b(int i) {
        if (i != 0) {
            this.f18586h.add(Integer.valueOf(i));
        }
        return this;
    }

    /* renamed from: c */
    public C5936i0 mo19335c(View view) {
        this.f18587i.add(view);
        return this;
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.f18604z.size() - 1; size >= 0; size--) {
            ((Animator) this.f18604z.get(size)).cancel();
        }
        ArrayList arrayList = this.f18576D;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f18576D.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((C5943g) arrayList2.get(i)).mo19292a(this);
            }
        }
    }

    /* renamed from: d */
    public C5936i0 mo19338d(Class cls) {
        if (this.f18589k == null) {
            this.f18589k = new ArrayList();
        }
        this.f18589k.add(cls);
        return this;
    }

    /* renamed from: e */
    public C5936i0 mo19339e(String str) {
        if (this.f18588j == null) {
            this.f18588j = new ArrayList();
        }
        this.f18588j.add(str);
        return this;
    }

    /* renamed from: i0 */
    public void mo19340i0(View view) {
        if (!this.f18575C) {
            for (int size = this.f18604z.size() - 1; size >= 0; size--) {
                C5885a.m23679b((Animator) this.f18604z.get(size));
            }
            ArrayList arrayList = this.f18576D;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f18576D.clone();
                int size2 = arrayList2.size();
                for (int i = 0; i < size2; i++) {
                    ((C5943g) arrayList2.get(i)).mo19295e(this);
                }
            }
            this.f18574B = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo19341j(Animator animator) {
        if (animator == null) {
            mo19354t();
            return;
        }
        if (mo19317G() >= 0) {
            animator.setDuration(mo19317G());
        }
        if (mo19325P() >= 0) {
            animator.setStartDelay(mo19325P() + animator.getStartDelay());
        }
        if (mo19320J() != null) {
            animator.setInterpolator(mo19320J());
        }
        animator.addListener(new C5939c());
        animator.start();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: e1.q0} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19342j0(android.view.ViewGroup r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f18601w = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f18602x = r0
            e1.r0 r0 = r10.f18597s
            e1.r0 r1 = r10.f18598t
            r10.m23799g0(r0, r1)
            androidx.collection.ArrayMap r0 = m23790O()
            int r1 = r0.size()
            e1.r1 r2 = p060e1.C5887a1.m23687d(r11)
            r3 = 1
            int r1 = r1 - r3
        L_0x0023:
            if (r1 < 0) goto L_0x0084
            java.lang.Object r4 = r0.keyAt(r1)
            android.animation.Animator r4 = (android.animation.Animator) r4
            if (r4 == 0) goto L_0x0081
            java.lang.Object r5 = r0.get(r4)
            e1.i0$d r5 = (p060e1.C5936i0.C5940d) r5
            if (r5 == 0) goto L_0x0081
            android.view.View r6 = r5.f18608a
            if (r6 == 0) goto L_0x0081
            e1.r1 r6 = r5.f18611d
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x0081
            e1.q0 r6 = r5.f18610c
            android.view.View r7 = r5.f18608a
            e1.q0 r8 = r10.mo19330W(r7, r3)
            e1.q0 r9 = r10.mo19321K(r7, r3)
            if (r8 != 0) goto L_0x005c
            if (r9 != 0) goto L_0x005c
            e1.r0 r9 = r10.f18598t
            androidx.collection.ArrayMap r9 = r9.f18724a
            java.lang.Object r7 = r9.get(r7)
            r9 = r7
            e1.q0 r9 = (p060e1.C5989q0) r9
        L_0x005c:
            if (r8 != 0) goto L_0x0060
            if (r9 == 0) goto L_0x006a
        L_0x0060:
            e1.i0 r5 = r5.f18612e
            boolean r5 = r5.mo19331X(r6, r9)
            if (r5 == 0) goto L_0x006a
            r5 = r3
            goto L_0x006b
        L_0x006a:
            r5 = 0
        L_0x006b:
            if (r5 == 0) goto L_0x0081
            boolean r5 = r4.isRunning()
            if (r5 != 0) goto L_0x007e
            boolean r5 = r4.isStarted()
            if (r5 == 0) goto L_0x007a
            goto L_0x007e
        L_0x007a:
            r0.remove(r4)
            goto L_0x0081
        L_0x007e:
            r4.cancel()
        L_0x0081:
            int r1 = r1 + -1
            goto L_0x0023
        L_0x0084:
            e1.r0 r6 = r10.f18597s
            e1.r0 r7 = r10.f18598t
            java.util.ArrayList r8 = r10.f18601w
            java.util.ArrayList r9 = r10.f18602x
            r4 = r10
            r5 = r11
            r4.mo19353s(r5, r6, r7, r8, r9)
            r10.mo19348o0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p060e1.C5936i0.mo19342j0(android.view.ViewGroup):void");
    }

    /* renamed from: k */
    public abstract void mo16526k(C5989q0 q0Var);

    /* renamed from: k0 */
    public C5936i0 mo19343k0(C5943g gVar) {
        ArrayList arrayList = this.f18576D;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(gVar);
        if (this.f18576D.size() == 0) {
            this.f18576D = null;
        }
        return this;
    }

    /* renamed from: l0 */
    public C5936i0 mo19344l0(View view) {
        this.f18587i.remove(view);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo19345m(C5989q0 q0Var) {
        String[] b;
        if (this.f18578F != null && !q0Var.f18718a.isEmpty() && (b = this.f18578F.mo19394b()) != null) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= b.length) {
                    z = true;
                    break;
                } else if (!q0Var.f18718a.containsKey(b[i])) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.f18578F.mo19393a(q0Var);
            }
        }
    }

    /* renamed from: m0 */
    public void mo19346m0(View view) {
        if (this.f18574B) {
            if (!this.f18575C) {
                for (int size = this.f18604z.size() - 1; size >= 0; size--) {
                    C5885a.m23680c((Animator) this.f18604z.get(size));
                }
                ArrayList arrayList = this.f18576D;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f18576D.clone();
                    int size2 = arrayList2.size();
                    for (int i = 0; i < size2; i++) {
                        ((C5943g) arrayList2.get(i)).mo19293b(this);
                    }
                }
            }
            this.f18574B = false;
        }
    }

    /* renamed from: n */
    public abstract void mo16527n(C5989q0 q0Var);

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo19347o(ViewGroup viewGroup, boolean z) {
        ArrayMap arrayMap;
        ArrayList arrayList;
        ArrayList arrayList2;
        mo19349p(z);
        if ((this.f18586h.size() > 0 || this.f18587i.size() > 0) && (((arrayList = this.f18588j) == null || arrayList.isEmpty()) && ((arrayList2 = this.f18589k) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f18586h.size(); i++) {
                View findViewById = viewGroup.findViewById(((Integer) this.f18586h.get(i)).intValue());
                if (findViewById != null) {
                    C5989q0 q0Var = new C5989q0(findViewById);
                    if (z) {
                        mo16527n(q0Var);
                    } else {
                        mo16526k(q0Var);
                    }
                    q0Var.f18720c.add(this);
                    mo19345m(q0Var);
                    if (z) {
                        m23798g(this.f18597s, findViewById, q0Var);
                    } else {
                        m23798g(this.f18598t, findViewById, q0Var);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f18587i.size(); i2++) {
                View view = (View) this.f18587i.get(i2);
                C5989q0 q0Var2 = new C5989q0(view);
                if (z) {
                    mo16527n(q0Var2);
                } else {
                    mo16526k(q0Var2);
                }
                q0Var2.f18720c.add(this);
                mo19345m(q0Var2);
                if (z) {
                    m23798g(this.f18597s, view, q0Var2);
                } else {
                    m23798g(this.f18598t, view, q0Var2);
                }
            }
        } else {
            m23802l(viewGroup, z);
        }
        if (!z && (arrayMap = this.f18580H) != null) {
            int size = arrayMap.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.f18597s.f18727d.remove((String) this.f18580H.keyAt(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.f18597s.f18727d.put((String) this.f18580H.valueAt(i4), view2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public void mo19348o0() {
        mo19362y0();
        ArrayMap O = m23790O();
        Iterator it = this.f18577E.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (O.containsKey(animator)) {
                mo19362y0();
                m23803n0(animator, O);
            }
        }
        this.f18577E.clear();
        mo19354t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo19349p(boolean z) {
        if (z) {
            this.f18597s.f18724a.clear();
            this.f18597s.f18725b.clear();
            this.f18597s.f18726c.clear();
            return;
        }
        this.f18598t.f18724a.clear();
        this.f18598t.f18725b.clear();
        this.f18598t.f18726c.clear();
    }

    /* renamed from: p0 */
    public C5936i0 mo19350p0(long j) {
        this.f18584f = j;
        return this;
    }

    /* renamed from: q */
    public C5936i0 clone() {
        try {
            C5936i0 i0Var = (C5936i0) super.clone();
            i0Var.f18577E = new ArrayList();
            i0Var.f18597s = new C5992r0();
            i0Var.f18598t = new C5992r0();
            i0Var.f18601w = null;
            i0Var.f18602x = null;
            return i0Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: r */
    public Animator mo16528r(ViewGroup viewGroup, C5989q0 q0Var, C5989q0 q0Var2) {
        return null;
    }

    /* renamed from: r0 */
    public void mo19352r0(C5942f fVar) {
        this.f18579G = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo19353s(ViewGroup viewGroup, C5992r0 r0Var, C5992r0 r0Var2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        boolean z;
        Animator r;
        View view;
        Animator animator;
        C5989q0 q0Var;
        C5989q0 q0Var2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        ArrayMap O = m23790O();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i2 = 0;
        while (i2 < size) {
            C5989q0 q0Var3 = (C5989q0) arrayList.get(i2);
            C5989q0 q0Var4 = (C5989q0) arrayList2.get(i2);
            if (q0Var3 != null && !q0Var3.f18720c.contains(this)) {
                q0Var3 = null;
            }
            if (q0Var4 != null && !q0Var4.f18720c.contains(this)) {
                q0Var4 = null;
            }
            if (!(q0Var3 == null && q0Var4 == null)) {
                if (q0Var3 == null || q0Var4 == null || mo19331X(q0Var3, q0Var4)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (r = mo16528r(viewGroup2, q0Var3, q0Var4)) != null) {
                    if (q0Var4 != null) {
                        view = q0Var4.f18719b;
                        String[] V = mo19264V();
                        if (V != null && V.length > 0) {
                            q0Var2 = new C5989q0(view);
                            Animator animator3 = r;
                            i = size;
                            C5989q0 q0Var5 = (C5989q0) r0Var2.f18724a.get(view);
                            if (q0Var5 != null) {
                                int i3 = 0;
                                while (i3 < V.length) {
                                    Map map = q0Var2.f18718a;
                                    String str = V[i3];
                                    map.put(str, q0Var5.f18718a.get(str));
                                    i3++;
                                    ArrayList arrayList3 = arrayList2;
                                    V = V;
                                }
                            }
                            int size2 = O.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size2) {
                                    animator2 = animator3;
                                    break;
                                }
                                C5940d dVar = (C5940d) O.get((Animator) O.keyAt(i4));
                                if (dVar.f18610c != null && dVar.f18608a == view && dVar.f18609b.equals(mo19322L()) && dVar.f18610c.equals(q0Var2)) {
                                    animator2 = null;
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            i = size;
                            animator2 = r;
                            q0Var2 = null;
                        }
                        animator = animator2;
                        q0Var = q0Var2;
                    } else {
                        i = size;
                        view = q0Var3.f18719b;
                        animator = r;
                        q0Var = null;
                    }
                    if (animator != null) {
                        C5963m0 m0Var = this.f18578F;
                        if (m0Var != null) {
                            long c = m0Var.mo19261c(viewGroup2, this, q0Var3, q0Var4);
                            sparseIntArray.put(this.f18577E.size(), (int) c);
                            j = Math.min(c, j);
                        }
                        O.put(animator, new C5940d(view, mo19322L(), this, C5887a1.m23687d(viewGroup), q0Var));
                        this.f18577E.add(animator);
                        j = j;
                    }
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator4 = (Animator) this.f18577E.get(sparseIntArray.keyAt(i5));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i5)) - j) + animator4.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo19354t() {
        int i = this.f18573A - 1;
        this.f18573A = i;
        if (i == 0) {
            ArrayList arrayList = this.f18576D;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f18576D.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C5943g) arrayList2.get(i2)).mo19294c(this);
                }
            }
            for (int i3 = 0; i3 < this.f18597s.f18726c.size(); i3++) {
                View view = (View) this.f18597s.f18726c.valueAt(i3);
                if (view != null) {
                    ViewCompat.m3542B0(view, false);
                }
            }
            for (int i4 = 0; i4 < this.f18598t.f18726c.size(); i4++) {
                View view2 = (View) this.f18598t.f18726c.valueAt(i4);
                if (view2 != null) {
                    ViewCompat.m3542B0(view2, false);
                }
            }
            this.f18575C = true;
        }
    }

    /* renamed from: t0 */
    public C5936i0 mo19355t0(TimeInterpolator timeInterpolator) {
        this.f18585g = timeInterpolator;
        return this;
    }

    public String toString() {
        return mo19363z0("");
    }

    /* renamed from: u */
    public C5936i0 mo19357u(View view, boolean z) {
        this.f18595q = m23789E(this.f18595q, view, z);
        return this;
    }

    /* renamed from: u0 */
    public void mo19358u0(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.f18600v = f18570J;
            return;
        }
        int i = 0;
        while (i < iArr.length) {
            if (!m23791Y(iArr[i])) {
                throw new IllegalArgumentException("matches contains invalid value");
            } else if (!m23800h(iArr, i)) {
                i++;
            } else {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.f18600v = (int[]) iArr.clone();
    }

    /* renamed from: v0 */
    public void mo19359v0(C6011z zVar) {
        if (zVar == null) {
            this.f18581I = f18571K;
        } else {
            this.f18581I = zVar;
        }
    }

    /* renamed from: w0 */
    public void mo19360w0(C5963m0 m0Var) {
        this.f18578F = m0Var;
    }

    /* renamed from: x0 */
    public C5936i0 mo19361x0(long j) {
        this.f18583e = j;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public void mo19362y0() {
        if (this.f18573A == 0) {
            ArrayList arrayList = this.f18576D;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f18576D.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C5943g) arrayList2.get(i)).mo19368d(this);
                }
            }
            this.f18575C = false;
        }
        this.f18573A++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public String mo19363z0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f18584f != -1) {
            str2 = str2 + "dur(" + this.f18584f + ") ";
        }
        if (this.f18583e != -1) {
            str2 = str2 + "dly(" + this.f18583e + ") ";
        }
        if (this.f18585g != null) {
            str2 = str2 + "interp(" + this.f18585g + ") ";
        }
        if (this.f18586h.size() <= 0 && this.f18587i.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f18586h.size() > 0) {
            for (int i = 0; i < this.f18586h.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f18586h.get(i);
            }
        }
        if (this.f18587i.size() > 0) {
            for (int i2 = 0; i2 < this.f18587i.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f18587i.get(i2);
            }
        }
        return str3 + ")";
    }

    public C5936i0(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5930h0.f18554c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long k = (long) C0820l.m3068k(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (k >= 0) {
            mo19350p0(k);
        }
        long k2 = (long) C0820l.m3068k(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (k2 > 0) {
            mo19361x0(k2);
        }
        int l = C0820l.m3069l(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (l > 0) {
            mo19355t0(AnimationUtils.loadInterpolator(context, l));
        }
        String m = C0820l.m3070m(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (m != null) {
            mo19358u0(m23801h0(m));
        }
        obtainStyledAttributes.recycle();
    }
}
