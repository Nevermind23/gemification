package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.mikephil.charting.utils.Utils;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p188o.C7356a;
import p240s.C8090a;
import p240s.C8091b;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: androidx.constraintlayout.widget.d */
public class C0630d {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final int[] f2621f = {0, 4, 8};

    /* renamed from: g */
    private static SparseIntArray f2622g = new SparseIntArray();

    /* renamed from: h */
    private static SparseIntArray f2623h = new SparseIntArray();

    /* renamed from: a */
    public String f2624a = "";

    /* renamed from: b */
    public int f2625b = 0;

    /* renamed from: c */
    private HashMap f2626c = new HashMap();

    /* renamed from: d */
    private boolean f2627d = true;

    /* renamed from: e */
    private HashMap f2628e = new HashMap();

    /* renamed from: androidx.constraintlayout.widget.d$a */
    public static class C0631a {

        /* renamed from: a */
        int f2629a;

        /* renamed from: b */
        String f2630b;

        /* renamed from: c */
        public final C0635d f2631c = new C0635d();

        /* renamed from: d */
        public final C0634c f2632d = new C0634c();

        /* renamed from: e */
        public final C0633b f2633e = new C0633b();

        /* renamed from: f */
        public final C0636e f2634f = new C0636e();

        /* renamed from: g */
        public HashMap f2635g = new HashMap();

        /* renamed from: h */
        C0632a f2636h;

        /* renamed from: androidx.constraintlayout.widget.d$a$a */
        static class C0632a {

            /* renamed from: a */
            int[] f2637a = new int[10];

            /* renamed from: b */
            int[] f2638b = new int[10];

            /* renamed from: c */
            int f2639c = 0;

            /* renamed from: d */
            int[] f2640d = new int[10];

            /* renamed from: e */
            float[] f2641e = new float[10];

            /* renamed from: f */
            int f2642f = 0;

            /* renamed from: g */
            int[] f2643g = new int[5];

            /* renamed from: h */
            String[] f2644h = new String[5];

            /* renamed from: i */
            int f2645i = 0;

            /* renamed from: j */
            int[] f2646j = new int[4];

            /* renamed from: k */
            boolean[] f2647k = new boolean[4];

            /* renamed from: l */
            int f2648l = 0;

            C0632a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo2954a(int i, float f) {
                int i2 = this.f2642f;
                int[] iArr = this.f2640d;
                if (i2 >= iArr.length) {
                    this.f2640d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f2641e;
                    this.f2641e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f2640d;
                int i3 = this.f2642f;
                iArr2[i3] = i;
                float[] fArr2 = this.f2641e;
                this.f2642f = i3 + 1;
                fArr2[i3] = f;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public void mo2955b(int i, int i2) {
                int i3 = this.f2639c;
                int[] iArr = this.f2637a;
                if (i3 >= iArr.length) {
                    this.f2637a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f2638b;
                    this.f2638b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f2637a;
                int i4 = this.f2639c;
                iArr3[i4] = i;
                int[] iArr4 = this.f2638b;
                this.f2639c = i4 + 1;
                iArr4[i4] = i2;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public void mo2956c(int i, String str) {
                int i2 = this.f2645i;
                int[] iArr = this.f2643g;
                if (i2 >= iArr.length) {
                    this.f2643g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f2644h;
                    this.f2644h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f2643g;
                int i3 = this.f2645i;
                iArr2[i3] = i;
                String[] strArr2 = this.f2644h;
                this.f2645i = i3 + 1;
                strArr2[i3] = str;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public void mo2957d(int i, boolean z) {
                int i2 = this.f2648l;
                int[] iArr = this.f2646j;
                if (i2 >= iArr.length) {
                    this.f2646j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f2647k;
                    this.f2647k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f2646j;
                int i3 = this.f2648l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.f2647k;
                this.f2648l = i3 + 1;
                zArr2[i3] = z;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m2455d(int i, ConstraintLayout.C0620b bVar) {
            this.f2629a = i;
            C0633b bVar2 = this.f2633e;
            bVar2.f2694j = bVar.f2524e;
            bVar2.f2696k = bVar.f2526f;
            bVar2.f2698l = bVar.f2528g;
            bVar2.f2700m = bVar.f2530h;
            bVar2.f2702n = bVar.f2532i;
            bVar2.f2704o = bVar.f2534j;
            bVar2.f2706p = bVar.f2536k;
            bVar2.f2708q = bVar.f2538l;
            bVar2.f2710r = bVar.f2540m;
            bVar2.f2711s = bVar.f2542n;
            bVar2.f2712t = bVar.f2544o;
            bVar2.f2713u = bVar.f2552s;
            bVar2.f2714v = bVar.f2554t;
            bVar2.f2715w = bVar.f2556u;
            bVar2.f2716x = bVar.f2558v;
            bVar2.f2717y = bVar.f2496G;
            bVar2.f2718z = bVar.f2497H;
            bVar2.f2650A = bVar.f2498I;
            bVar2.f2651B = bVar.f2546p;
            bVar2.f2652C = bVar.f2548q;
            bVar2.f2653D = bVar.f2550r;
            bVar2.f2654E = bVar.f2513X;
            bVar2.f2655F = bVar.f2514Y;
            bVar2.f2656G = bVar.f2515Z;
            bVar2.f2690h = bVar.f2520c;
            bVar2.f2686f = bVar.f2516a;
            bVar2.f2688g = bVar.f2518b;
            bVar2.f2682d = bVar.width;
            bVar2.f2684e = bVar.height;
            bVar2.f2657H = bVar.leftMargin;
            bVar2.f2658I = bVar.rightMargin;
            bVar2.f2659J = bVar.topMargin;
            bVar2.f2660K = bVar.bottomMargin;
            bVar2.f2663N = bVar.f2493D;
            bVar2.f2671V = bVar.f2502M;
            bVar2.f2672W = bVar.f2501L;
            bVar2.f2674Y = bVar.f2504O;
            bVar2.f2673X = bVar.f2503N;
            bVar2.f2703n0 = bVar.f2517a0;
            bVar2.f2705o0 = bVar.f2519b0;
            bVar2.f2675Z = bVar.f2505P;
            bVar2.f2677a0 = bVar.f2506Q;
            bVar2.f2679b0 = bVar.f2509T;
            bVar2.f2681c0 = bVar.f2510U;
            bVar2.f2683d0 = bVar.f2507R;
            bVar2.f2685e0 = bVar.f2508S;
            bVar2.f2687f0 = bVar.f2511V;
            bVar2.f2689g0 = bVar.f2512W;
            bVar2.f2701m0 = bVar.f2521c0;
            bVar2.f2665P = bVar.f2562x;
            bVar2.f2667R = bVar.f2564z;
            bVar2.f2664O = bVar.f2560w;
            bVar2.f2666Q = bVar.f2563y;
            bVar2.f2669T = bVar.f2490A;
            bVar2.f2668S = bVar.f2491B;
            bVar2.f2670U = bVar.f2492C;
            bVar2.f2709q0 = bVar.f2523d0;
            bVar2.f2661L = bVar.getMarginEnd();
            this.f2633e.f2662M = bVar.getMarginStart();
        }

        /* renamed from: b */
        public void mo2951b(ConstraintLayout.C0620b bVar) {
            C0633b bVar2 = this.f2633e;
            bVar.f2524e = bVar2.f2694j;
            bVar.f2526f = bVar2.f2696k;
            bVar.f2528g = bVar2.f2698l;
            bVar.f2530h = bVar2.f2700m;
            bVar.f2532i = bVar2.f2702n;
            bVar.f2534j = bVar2.f2704o;
            bVar.f2536k = bVar2.f2706p;
            bVar.f2538l = bVar2.f2708q;
            bVar.f2540m = bVar2.f2710r;
            bVar.f2542n = bVar2.f2711s;
            bVar.f2544o = bVar2.f2712t;
            bVar.f2552s = bVar2.f2713u;
            bVar.f2554t = bVar2.f2714v;
            bVar.f2556u = bVar2.f2715w;
            bVar.f2558v = bVar2.f2716x;
            bVar.leftMargin = bVar2.f2657H;
            bVar.rightMargin = bVar2.f2658I;
            bVar.topMargin = bVar2.f2659J;
            bVar.bottomMargin = bVar2.f2660K;
            bVar.f2490A = bVar2.f2669T;
            bVar.f2491B = bVar2.f2668S;
            bVar.f2562x = bVar2.f2665P;
            bVar.f2564z = bVar2.f2667R;
            bVar.f2496G = bVar2.f2717y;
            bVar.f2497H = bVar2.f2718z;
            bVar.f2546p = bVar2.f2651B;
            bVar.f2548q = bVar2.f2652C;
            bVar.f2550r = bVar2.f2653D;
            bVar.f2498I = bVar2.f2650A;
            bVar.f2513X = bVar2.f2654E;
            bVar.f2514Y = bVar2.f2655F;
            bVar.f2502M = bVar2.f2671V;
            bVar.f2501L = bVar2.f2672W;
            bVar.f2504O = bVar2.f2674Y;
            bVar.f2503N = bVar2.f2673X;
            bVar.f2517a0 = bVar2.f2703n0;
            bVar.f2519b0 = bVar2.f2705o0;
            bVar.f2505P = bVar2.f2675Z;
            bVar.f2506Q = bVar2.f2677a0;
            bVar.f2509T = bVar2.f2679b0;
            bVar.f2510U = bVar2.f2681c0;
            bVar.f2507R = bVar2.f2683d0;
            bVar.f2508S = bVar2.f2685e0;
            bVar.f2511V = bVar2.f2687f0;
            bVar.f2512W = bVar2.f2689g0;
            bVar.f2515Z = bVar2.f2656G;
            bVar.f2520c = bVar2.f2690h;
            bVar.f2516a = bVar2.f2686f;
            bVar.f2518b = bVar2.f2688g;
            bVar.width = bVar2.f2682d;
            bVar.height = bVar2.f2684e;
            String str = bVar2.f2701m0;
            if (str != null) {
                bVar.f2521c0 = str;
            }
            bVar.f2523d0 = bVar2.f2709q0;
            bVar.setMarginStart(bVar2.f2662M);
            bVar.setMarginEnd(this.f2633e.f2661L);
            bVar.mo2894a();
        }

        /* renamed from: c */
        public C0631a clone() {
            C0631a aVar = new C0631a();
            aVar.f2633e.mo2958a(this.f2633e);
            aVar.f2632d.mo2960a(this.f2632d);
            aVar.f2631c.mo2962a(this.f2631c);
            aVar.f2634f.mo2964a(this.f2634f);
            aVar.f2629a = this.f2629a;
            aVar.f2636h = this.f2636h;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$b */
    public static class C0633b {

        /* renamed from: r0 */
        private static SparseIntArray f2649r0;

        /* renamed from: A */
        public String f2650A = null;

        /* renamed from: B */
        public int f2651B = -1;

        /* renamed from: C */
        public int f2652C = 0;

        /* renamed from: D */
        public float f2653D = Utils.FLOAT_EPSILON;

        /* renamed from: E */
        public int f2654E = -1;

        /* renamed from: F */
        public int f2655F = -1;

        /* renamed from: G */
        public int f2656G = -1;

        /* renamed from: H */
        public int f2657H = 0;

        /* renamed from: I */
        public int f2658I = 0;

        /* renamed from: J */
        public int f2659J = 0;

        /* renamed from: K */
        public int f2660K = 0;

        /* renamed from: L */
        public int f2661L = 0;

        /* renamed from: M */
        public int f2662M = 0;

        /* renamed from: N */
        public int f2663N = 0;

        /* renamed from: O */
        public int f2664O = Integer.MIN_VALUE;

        /* renamed from: P */
        public int f2665P = Integer.MIN_VALUE;

        /* renamed from: Q */
        public int f2666Q = Integer.MIN_VALUE;

        /* renamed from: R */
        public int f2667R = Integer.MIN_VALUE;

        /* renamed from: S */
        public int f2668S = Integer.MIN_VALUE;

        /* renamed from: T */
        public int f2669T = Integer.MIN_VALUE;

        /* renamed from: U */
        public int f2670U = Integer.MIN_VALUE;

        /* renamed from: V */
        public float f2671V = -1.0f;

        /* renamed from: W */
        public float f2672W = -1.0f;

        /* renamed from: X */
        public int f2673X = 0;

        /* renamed from: Y */
        public int f2674Y = 0;

        /* renamed from: Z */
        public int f2675Z = 0;

        /* renamed from: a */
        public boolean f2676a = false;

        /* renamed from: a0 */
        public int f2677a0 = 0;

        /* renamed from: b */
        public boolean f2678b = false;

        /* renamed from: b0 */
        public int f2679b0 = 0;

        /* renamed from: c */
        public boolean f2680c = false;

        /* renamed from: c0 */
        public int f2681c0 = 0;

        /* renamed from: d */
        public int f2682d;

        /* renamed from: d0 */
        public int f2683d0 = 0;

        /* renamed from: e */
        public int f2684e;

        /* renamed from: e0 */
        public int f2685e0 = 0;

        /* renamed from: f */
        public int f2686f = -1;

        /* renamed from: f0 */
        public float f2687f0 = 1.0f;

        /* renamed from: g */
        public int f2688g = -1;

        /* renamed from: g0 */
        public float f2689g0 = 1.0f;

        /* renamed from: h */
        public float f2690h = -1.0f;

        /* renamed from: h0 */
        public int f2691h0 = -1;

        /* renamed from: i */
        public boolean f2692i = true;

        /* renamed from: i0 */
        public int f2693i0 = 0;

        /* renamed from: j */
        public int f2694j = -1;

        /* renamed from: j0 */
        public int f2695j0 = -1;

        /* renamed from: k */
        public int f2696k = -1;

        /* renamed from: k0 */
        public int[] f2697k0;

        /* renamed from: l */
        public int f2698l = -1;

        /* renamed from: l0 */
        public String f2699l0;

        /* renamed from: m */
        public int f2700m = -1;

        /* renamed from: m0 */
        public String f2701m0;

        /* renamed from: n */
        public int f2702n = -1;

        /* renamed from: n0 */
        public boolean f2703n0 = false;

        /* renamed from: o */
        public int f2704o = -1;

        /* renamed from: o0 */
        public boolean f2705o0 = false;

        /* renamed from: p */
        public int f2706p = -1;

        /* renamed from: p0 */
        public boolean f2707p0 = true;

        /* renamed from: q */
        public int f2708q = -1;

        /* renamed from: q0 */
        public int f2709q0 = 0;

        /* renamed from: r */
        public int f2710r = -1;

        /* renamed from: s */
        public int f2711s = -1;

        /* renamed from: t */
        public int f2712t = -1;

        /* renamed from: u */
        public int f2713u = -1;

        /* renamed from: v */
        public int f2714v = -1;

        /* renamed from: w */
        public int f2715w = -1;

        /* renamed from: x */
        public int f2716x = -1;

        /* renamed from: y */
        public float f2717y = 0.5f;

        /* renamed from: z */
        public float f2718z = 0.5f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2649r0 = sparseIntArray;
            sparseIntArray.append(C0639g.f3175y5, 24);
            f2649r0.append(C0639g.f3183z5, 25);
            f2649r0.append(C0639g.f2768B5, 28);
            f2649r0.append(C0639g.f2776C5, 29);
            f2649r0.append(C0639g.f2816H5, 35);
            f2649r0.append(C0639g.f2808G5, 34);
            f2649r0.append(C0639g.f3040i5, 4);
            f2649r0.append(C0639g.f3031h5, 3);
            f2649r0.append(C0639g.f3013f5, 1);
            f2649r0.append(C0639g.f2864N5, 6);
            f2649r0.append(C0639g.f2872O5, 7);
            f2649r0.append(C0639g.f3103p5, 17);
            f2649r0.append(C0639g.f3111q5, 18);
            f2649r0.append(C0639g.f3119r5, 19);
            f2649r0.append(C0639g.f2977b5, 90);
            f2649r0.append(C0639g.f2863N4, 26);
            f2649r0.append(C0639g.f2784D5, 31);
            f2649r0.append(C0639g.f2792E5, 32);
            f2649r0.append(C0639g.f3094o5, 10);
            f2649r0.append(C0639g.f3085n5, 9);
            f2649r0.append(C0639g.f2896R5, 13);
            f2649r0.append(C0639g.f2920U5, 16);
            f2649r0.append(C0639g.f2904S5, 14);
            f2649r0.append(C0639g.f2880P5, 11);
            f2649r0.append(C0639g.f2912T5, 15);
            f2649r0.append(C0639g.f2888Q5, 12);
            f2649r0.append(C0639g.f2840K5, 38);
            f2649r0.append(C0639g.f3159w5, 37);
            f2649r0.append(C0639g.f3151v5, 39);
            f2649r0.append(C0639g.f2832J5, 40);
            f2649r0.append(C0639g.f3143u5, 20);
            f2649r0.append(C0639g.f2824I5, 36);
            f2649r0.append(C0639g.f3076m5, 5);
            f2649r0.append(C0639g.f3167x5, 91);
            f2649r0.append(C0639g.f2800F5, 91);
            f2649r0.append(C0639g.f2760A5, 91);
            f2649r0.append(C0639g.f3022g5, 91);
            f2649r0.append(C0639g.f3004e5, 91);
            f2649r0.append(C0639g.f2887Q4, 23);
            f2649r0.append(C0639g.f2903S4, 27);
            f2649r0.append(C0639g.f2919U4, 30);
            f2649r0.append(C0639g.f2927V4, 8);
            f2649r0.append(C0639g.f2895R4, 33);
            f2649r0.append(C0639g.f2911T4, 2);
            f2649r0.append(C0639g.f2871O4, 22);
            f2649r0.append(C0639g.f2879P4, 21);
            f2649r0.append(C0639g.f2848L5, 41);
            f2649r0.append(C0639g.f3127s5, 42);
            f2649r0.append(C0639g.f2995d5, 41);
            f2649r0.append(C0639g.f2986c5, 42);
            f2649r0.append(C0639g.f2928V5, 76);
            f2649r0.append(C0639g.f3049j5, 61);
            f2649r0.append(C0639g.f3067l5, 62);
            f2649r0.append(C0639g.f3058k5, 63);
            f2649r0.append(C0639g.f2856M5, 69);
            f2649r0.append(C0639g.f3135t5, 70);
            f2649r0.append(C0639g.f2959Z4, 71);
            f2649r0.append(C0639g.f2943X4, 72);
            f2649r0.append(C0639g.f2951Y4, 73);
            f2649r0.append(C0639g.f2968a5, 74);
            f2649r0.append(C0639g.f2935W4, 75);
        }

        /* renamed from: a */
        public void mo2958a(C0633b bVar) {
            this.f2676a = bVar.f2676a;
            this.f2682d = bVar.f2682d;
            this.f2678b = bVar.f2678b;
            this.f2684e = bVar.f2684e;
            this.f2686f = bVar.f2686f;
            this.f2688g = bVar.f2688g;
            this.f2690h = bVar.f2690h;
            this.f2692i = bVar.f2692i;
            this.f2694j = bVar.f2694j;
            this.f2696k = bVar.f2696k;
            this.f2698l = bVar.f2698l;
            this.f2700m = bVar.f2700m;
            this.f2702n = bVar.f2702n;
            this.f2704o = bVar.f2704o;
            this.f2706p = bVar.f2706p;
            this.f2708q = bVar.f2708q;
            this.f2710r = bVar.f2710r;
            this.f2711s = bVar.f2711s;
            this.f2712t = bVar.f2712t;
            this.f2713u = bVar.f2713u;
            this.f2714v = bVar.f2714v;
            this.f2715w = bVar.f2715w;
            this.f2716x = bVar.f2716x;
            this.f2717y = bVar.f2717y;
            this.f2718z = bVar.f2718z;
            this.f2650A = bVar.f2650A;
            this.f2651B = bVar.f2651B;
            this.f2652C = bVar.f2652C;
            this.f2653D = bVar.f2653D;
            this.f2654E = bVar.f2654E;
            this.f2655F = bVar.f2655F;
            this.f2656G = bVar.f2656G;
            this.f2657H = bVar.f2657H;
            this.f2658I = bVar.f2658I;
            this.f2659J = bVar.f2659J;
            this.f2660K = bVar.f2660K;
            this.f2661L = bVar.f2661L;
            this.f2662M = bVar.f2662M;
            this.f2663N = bVar.f2663N;
            this.f2664O = bVar.f2664O;
            this.f2665P = bVar.f2665P;
            this.f2666Q = bVar.f2666Q;
            this.f2667R = bVar.f2667R;
            this.f2668S = bVar.f2668S;
            this.f2669T = bVar.f2669T;
            this.f2670U = bVar.f2670U;
            this.f2671V = bVar.f2671V;
            this.f2672W = bVar.f2672W;
            this.f2673X = bVar.f2673X;
            this.f2674Y = bVar.f2674Y;
            this.f2675Z = bVar.f2675Z;
            this.f2677a0 = bVar.f2677a0;
            this.f2679b0 = bVar.f2679b0;
            this.f2681c0 = bVar.f2681c0;
            this.f2683d0 = bVar.f2683d0;
            this.f2685e0 = bVar.f2685e0;
            this.f2687f0 = bVar.f2687f0;
            this.f2689g0 = bVar.f2689g0;
            this.f2691h0 = bVar.f2691h0;
            this.f2693i0 = bVar.f2693i0;
            this.f2695j0 = bVar.f2695j0;
            this.f2701m0 = bVar.f2701m0;
            int[] iArr = bVar.f2697k0;
            if (iArr == null || bVar.f2699l0 != null) {
                this.f2697k0 = null;
            } else {
                this.f2697k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f2699l0 = bVar.f2699l0;
            this.f2703n0 = bVar.f2703n0;
            this.f2705o0 = bVar.f2705o0;
            this.f2707p0 = bVar.f2707p0;
            this.f2709q0 = bVar.f2709q0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2959b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0639g.f2855M4);
            this.f2678b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f2649r0.get(index);
                switch (i2) {
                    case 1:
                        this.f2710r = C0630d.m2433r(obtainStyledAttributes, index, this.f2710r);
                        break;
                    case 2:
                        this.f2660K = obtainStyledAttributes.getDimensionPixelSize(index, this.f2660K);
                        break;
                    case 3:
                        this.f2708q = C0630d.m2433r(obtainStyledAttributes, index, this.f2708q);
                        break;
                    case 4:
                        this.f2706p = C0630d.m2433r(obtainStyledAttributes, index, this.f2706p);
                        break;
                    case 5:
                        this.f2650A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f2654E = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2654E);
                        break;
                    case 7:
                        this.f2655F = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2655F);
                        break;
                    case 8:
                        this.f2661L = obtainStyledAttributes.getDimensionPixelSize(index, this.f2661L);
                        break;
                    case 9:
                        this.f2716x = C0630d.m2433r(obtainStyledAttributes, index, this.f2716x);
                        break;
                    case 10:
                        this.f2715w = C0630d.m2433r(obtainStyledAttributes, index, this.f2715w);
                        break;
                    case 11:
                        this.f2667R = obtainStyledAttributes.getDimensionPixelSize(index, this.f2667R);
                        break;
                    case 12:
                        this.f2668S = obtainStyledAttributes.getDimensionPixelSize(index, this.f2668S);
                        break;
                    case 13:
                        this.f2664O = obtainStyledAttributes.getDimensionPixelSize(index, this.f2664O);
                        break;
                    case 14:
                        this.f2666Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f2666Q);
                        break;
                    case 15:
                        this.f2669T = obtainStyledAttributes.getDimensionPixelSize(index, this.f2669T);
                        break;
                    case 16:
                        this.f2665P = obtainStyledAttributes.getDimensionPixelSize(index, this.f2665P);
                        break;
                    case 17:
                        this.f2686f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2686f);
                        break;
                    case 18:
                        this.f2688g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2688g);
                        break;
                    case 19:
                        this.f2690h = obtainStyledAttributes.getFloat(index, this.f2690h);
                        break;
                    case 20:
                        this.f2717y = obtainStyledAttributes.getFloat(index, this.f2717y);
                        break;
                    case 21:
                        this.f2684e = obtainStyledAttributes.getLayoutDimension(index, this.f2684e);
                        break;
                    case 22:
                        this.f2682d = obtainStyledAttributes.getLayoutDimension(index, this.f2682d);
                        break;
                    case 23:
                        this.f2657H = obtainStyledAttributes.getDimensionPixelSize(index, this.f2657H);
                        break;
                    case 24:
                        this.f2694j = C0630d.m2433r(obtainStyledAttributes, index, this.f2694j);
                        break;
                    case 25:
                        this.f2696k = C0630d.m2433r(obtainStyledAttributes, index, this.f2696k);
                        break;
                    case 26:
                        this.f2656G = obtainStyledAttributes.getInt(index, this.f2656G);
                        break;
                    case 27:
                        this.f2658I = obtainStyledAttributes.getDimensionPixelSize(index, this.f2658I);
                        break;
                    case 28:
                        this.f2698l = C0630d.m2433r(obtainStyledAttributes, index, this.f2698l);
                        break;
                    case 29:
                        this.f2700m = C0630d.m2433r(obtainStyledAttributes, index, this.f2700m);
                        break;
                    case 30:
                        this.f2662M = obtainStyledAttributes.getDimensionPixelSize(index, this.f2662M);
                        break;
                    case 31:
                        this.f2713u = C0630d.m2433r(obtainStyledAttributes, index, this.f2713u);
                        break;
                    case 32:
                        this.f2714v = C0630d.m2433r(obtainStyledAttributes, index, this.f2714v);
                        break;
                    case 33:
                        this.f2659J = obtainStyledAttributes.getDimensionPixelSize(index, this.f2659J);
                        break;
                    case 34:
                        this.f2704o = C0630d.m2433r(obtainStyledAttributes, index, this.f2704o);
                        break;
                    case 35:
                        this.f2702n = C0630d.m2433r(obtainStyledAttributes, index, this.f2702n);
                        break;
                    case 36:
                        this.f2718z = obtainStyledAttributes.getFloat(index, this.f2718z);
                        break;
                    case 37:
                        this.f2672W = obtainStyledAttributes.getFloat(index, this.f2672W);
                        break;
                    case 38:
                        this.f2671V = obtainStyledAttributes.getFloat(index, this.f2671V);
                        break;
                    case 39:
                        this.f2673X = obtainStyledAttributes.getInt(index, this.f2673X);
                        break;
                    case 40:
                        this.f2674Y = obtainStyledAttributes.getInt(index, this.f2674Y);
                        break;
                    case 41:
                        C0630d.m2434s(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        C0630d.m2434s(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.f2651B = C0630d.m2433r(obtainStyledAttributes, index, this.f2651B);
                                break;
                            case 62:
                                this.f2652C = obtainStyledAttributes.getDimensionPixelSize(index, this.f2652C);
                                break;
                            case 63:
                                this.f2653D = obtainStyledAttributes.getFloat(index, this.f2653D);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.f2687f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f2689g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f2691h0 = obtainStyledAttributes.getInt(index, this.f2691h0);
                                        break;
                                    case 73:
                                        this.f2693i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2693i0);
                                        break;
                                    case 74:
                                        this.f2699l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f2707p0 = obtainStyledAttributes.getBoolean(index, this.f2707p0);
                                        break;
                                    case 76:
                                        this.f2709q0 = obtainStyledAttributes.getInt(index, this.f2709q0);
                                        break;
                                    case 77:
                                        this.f2711s = C0630d.m2433r(obtainStyledAttributes, index, this.f2711s);
                                        break;
                                    case 78:
                                        this.f2712t = C0630d.m2433r(obtainStyledAttributes, index, this.f2712t);
                                        break;
                                    case 79:
                                        this.f2670U = obtainStyledAttributes.getDimensionPixelSize(index, this.f2670U);
                                        break;
                                    case 80:
                                        this.f2663N = obtainStyledAttributes.getDimensionPixelSize(index, this.f2663N);
                                        break;
                                    case 81:
                                        this.f2675Z = obtainStyledAttributes.getInt(index, this.f2675Z);
                                        break;
                                    case 82:
                                        this.f2677a0 = obtainStyledAttributes.getInt(index, this.f2677a0);
                                        break;
                                    case 83:
                                        this.f2681c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2681c0);
                                        break;
                                    case 84:
                                        this.f2679b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2679b0);
                                        break;
                                    case 85:
                                        this.f2685e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2685e0);
                                        break;
                                    case 86:
                                        this.f2683d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2683d0);
                                        break;
                                    case 87:
                                        this.f2703n0 = obtainStyledAttributes.getBoolean(index, this.f2703n0);
                                        break;
                                    case 88:
                                        this.f2705o0 = obtainStyledAttributes.getBoolean(index, this.f2705o0);
                                        break;
                                    case 89:
                                        this.f2701m0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f2692i = obtainStyledAttributes.getBoolean(index, this.f2692i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2649r0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2649r0.get(index));
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$c */
    public static class C0634c {

        /* renamed from: o */
        private static SparseIntArray f2719o;

        /* renamed from: a */
        public boolean f2720a = false;

        /* renamed from: b */
        public int f2721b = -1;

        /* renamed from: c */
        public int f2722c = 0;

        /* renamed from: d */
        public String f2723d = null;

        /* renamed from: e */
        public int f2724e = -1;

        /* renamed from: f */
        public int f2725f = 0;

        /* renamed from: g */
        public float f2726g = Float.NaN;

        /* renamed from: h */
        public int f2727h = -1;

        /* renamed from: i */
        public float f2728i = Float.NaN;

        /* renamed from: j */
        public float f2729j = Float.NaN;

        /* renamed from: k */
        public int f2730k = -1;

        /* renamed from: l */
        public String f2731l = null;

        /* renamed from: m */
        public int f2732m = -3;

        /* renamed from: n */
        public int f2733n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2719o = sparseIntArray;
            sparseIntArray.append(C0639g.f3032h6, 1);
            f2719o.append(C0639g.f3050j6, 2);
            f2719o.append(C0639g.f3086n6, 3);
            f2719o.append(C0639g.f3023g6, 4);
            f2719o.append(C0639g.f3014f6, 5);
            f2719o.append(C0639g.f3005e6, 6);
            f2719o.append(C0639g.f3041i6, 7);
            f2719o.append(C0639g.f3077m6, 8);
            f2719o.append(C0639g.f3068l6, 9);
            f2719o.append(C0639g.f3059k6, 10);
        }

        /* renamed from: a */
        public void mo2960a(C0634c cVar) {
            this.f2720a = cVar.f2720a;
            this.f2721b = cVar.f2721b;
            this.f2723d = cVar.f2723d;
            this.f2724e = cVar.f2724e;
            this.f2725f = cVar.f2725f;
            this.f2728i = cVar.f2728i;
            this.f2726g = cVar.f2726g;
            this.f2727h = cVar.f2727h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2961b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0639g.f2996d6);
            this.f2720a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f2719o.get(index)) {
                    case 1:
                        this.f2728i = obtainStyledAttributes.getFloat(index, this.f2728i);
                        break;
                    case 2:
                        this.f2724e = obtainStyledAttributes.getInt(index, this.f2724e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f2723d = C7356a.f21565c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            this.f2723d = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        this.f2725f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2721b = C0630d.m2433r(obtainStyledAttributes, index, this.f2721b);
                        break;
                    case 6:
                        this.f2722c = obtainStyledAttributes.getInteger(index, this.f2722c);
                        break;
                    case 7:
                        this.f2726g = obtainStyledAttributes.getFloat(index, this.f2726g);
                        break;
                    case 8:
                        this.f2730k = obtainStyledAttributes.getInteger(index, this.f2730k);
                        break;
                    case 9:
                        this.f2729j = obtainStyledAttributes.getFloat(index, this.f2729j);
                        break;
                    case 10:
                        int i2 = obtainStyledAttributes.peekValue(index).type;
                        if (i2 != 1) {
                            if (i2 != 3) {
                                this.f2732m = obtainStyledAttributes.getInteger(index, this.f2733n);
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                this.f2731l = string;
                                if (string.indexOf(C11110u2.f31950c) <= 0) {
                                    this.f2732m = -1;
                                    break;
                                } else {
                                    this.f2733n = obtainStyledAttributes.getResourceId(index, -1);
                                    this.f2732m = -2;
                                    break;
                                }
                            }
                        } else {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f2733n = resourceId;
                            if (resourceId == -1) {
                                break;
                            } else {
                                this.f2732m = -2;
                                break;
                            }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$d */
    public static class C0635d {

        /* renamed from: a */
        public boolean f2734a = false;

        /* renamed from: b */
        public int f2735b = 0;

        /* renamed from: c */
        public int f2736c = 0;

        /* renamed from: d */
        public float f2737d = 1.0f;

        /* renamed from: e */
        public float f2738e = Float.NaN;

        /* renamed from: a */
        public void mo2962a(C0635d dVar) {
            this.f2734a = dVar.f2734a;
            this.f2735b = dVar.f2735b;
            this.f2737d = dVar.f2737d;
            this.f2738e = dVar.f2738e;
            this.f2736c = dVar.f2736c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2963b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0639g.f3176y6);
            this.f2734a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0639g.f2761A6) {
                    this.f2737d = obtainStyledAttributes.getFloat(index, this.f2737d);
                } else if (index == C0639g.f3184z6) {
                    this.f2735b = obtainStyledAttributes.getInt(index, this.f2735b);
                    this.f2735b = C0630d.f2621f[this.f2735b];
                } else if (index == C0639g.f2777C6) {
                    this.f2736c = obtainStyledAttributes.getInt(index, this.f2736c);
                } else if (index == C0639g.f2769B6) {
                    this.f2738e = obtainStyledAttributes.getFloat(index, this.f2738e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$e */
    public static class C0636e {

        /* renamed from: o */
        private static SparseIntArray f2739o;

        /* renamed from: a */
        public boolean f2740a = false;

        /* renamed from: b */
        public float f2741b = Utils.FLOAT_EPSILON;

        /* renamed from: c */
        public float f2742c = Utils.FLOAT_EPSILON;

        /* renamed from: d */
        public float f2743d = Utils.FLOAT_EPSILON;

        /* renamed from: e */
        public float f2744e = 1.0f;

        /* renamed from: f */
        public float f2745f = 1.0f;

        /* renamed from: g */
        public float f2746g = Float.NaN;

        /* renamed from: h */
        public float f2747h = Float.NaN;

        /* renamed from: i */
        public int f2748i = -1;

        /* renamed from: j */
        public float f2749j = Utils.FLOAT_EPSILON;

        /* renamed from: k */
        public float f2750k = Utils.FLOAT_EPSILON;

        /* renamed from: l */
        public float f2751l = Utils.FLOAT_EPSILON;

        /* renamed from: m */
        public boolean f2752m = false;

        /* renamed from: n */
        public float f2753n = Utils.FLOAT_EPSILON;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2739o = sparseIntArray;
            sparseIntArray.append(C0639g.f2945X6, 1);
            f2739o.append(C0639g.f2953Y6, 2);
            f2739o.append(C0639g.f2961Z6, 3);
            f2739o.append(C0639g.f2929V6, 4);
            f2739o.append(C0639g.f2937W6, 5);
            f2739o.append(C0639g.f2897R6, 6);
            f2739o.append(C0639g.f2905S6, 7);
            f2739o.append(C0639g.f2913T6, 8);
            f2739o.append(C0639g.f2921U6, 9);
            f2739o.append(C0639g.f2970a7, 10);
            f2739o.append(C0639g.f2979b7, 11);
            f2739o.append(C0639g.f2988c7, 12);
        }

        /* renamed from: a */
        public void mo2964a(C0636e eVar) {
            this.f2740a = eVar.f2740a;
            this.f2741b = eVar.f2741b;
            this.f2742c = eVar.f2742c;
            this.f2743d = eVar.f2743d;
            this.f2744e = eVar.f2744e;
            this.f2745f = eVar.f2745f;
            this.f2746g = eVar.f2746g;
            this.f2747h = eVar.f2747h;
            this.f2748i = eVar.f2748i;
            this.f2749j = eVar.f2749j;
            this.f2750k = eVar.f2750k;
            this.f2751l = eVar.f2751l;
            this.f2752m = eVar.f2752m;
            this.f2753n = eVar.f2753n;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2965b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0639g.f2889Q6);
            this.f2740a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f2739o.get(index)) {
                    case 1:
                        this.f2741b = obtainStyledAttributes.getFloat(index, this.f2741b);
                        break;
                    case 2:
                        this.f2742c = obtainStyledAttributes.getFloat(index, this.f2742c);
                        break;
                    case 3:
                        this.f2743d = obtainStyledAttributes.getFloat(index, this.f2743d);
                        break;
                    case 4:
                        this.f2744e = obtainStyledAttributes.getFloat(index, this.f2744e);
                        break;
                    case 5:
                        this.f2745f = obtainStyledAttributes.getFloat(index, this.f2745f);
                        break;
                    case 6:
                        this.f2746g = obtainStyledAttributes.getDimension(index, this.f2746g);
                        break;
                    case 7:
                        this.f2747h = obtainStyledAttributes.getDimension(index, this.f2747h);
                        break;
                    case 8:
                        this.f2749j = obtainStyledAttributes.getDimension(index, this.f2749j);
                        break;
                    case 9:
                        this.f2750k = obtainStyledAttributes.getDimension(index, this.f2750k);
                        break;
                    case 10:
                        this.f2751l = obtainStyledAttributes.getDimension(index, this.f2751l);
                        break;
                    case 11:
                        this.f2752m = true;
                        this.f2753n = obtainStyledAttributes.getDimension(index, this.f2753n);
                        break;
                    case 12:
                        this.f2748i = C0630d.m2433r(obtainStyledAttributes, index, this.f2748i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f2622g.append(C0639g.f2755A0, 25);
        f2622g.append(C0639g.f2763B0, 26);
        f2622g.append(C0639g.f2779D0, 29);
        f2622g.append(C0639g.f2787E0, 30);
        f2622g.append(C0639g.f2835K0, 36);
        f2622g.append(C0639g.f2827J0, 35);
        f2622g.append(C0639g.f3026h0, 4);
        f2622g.append(C0639g.f3017g0, 3);
        f2622g.append(C0639g.f2981c0, 1);
        f2622g.append(C0639g.f2999e0, 91);
        f2622g.append(C0639g.f2990d0, 92);
        f2622g.append(C0639g.f2907T0, 6);
        f2622g.append(C0639g.f2915U0, 7);
        f2622g.append(C0639g.f3089o0, 17);
        f2622g.append(C0639g.f3098p0, 18);
        f2622g.append(C0639g.f3106q0, 19);
        f2622g.append(C0639g.f2946Y, 99);
        f2622g.append(C0639g.f3137u, 27);
        f2622g.append(C0639g.f2795F0, 32);
        f2622g.append(C0639g.f2803G0, 33);
        f2622g.append(C0639g.f3080n0, 10);
        f2622g.append(C0639g.f3071m0, 9);
        f2622g.append(C0639g.f2939X0, 13);
        f2622g.append(C0639g.f2964a1, 16);
        f2622g.append(C0639g.f2947Y0, 14);
        f2622g.append(C0639g.f2923V0, 11);
        f2622g.append(C0639g.f2955Z0, 15);
        f2622g.append(C0639g.f2931W0, 12);
        f2622g.append(C0639g.f2859N0, 40);
        f2622g.append(C0639g.f3170y0, 39);
        f2622g.append(C0639g.f3162x0, 41);
        f2622g.append(C0639g.f2851M0, 42);
        f2622g.append(C0639g.f3154w0, 20);
        f2622g.append(C0639g.f2843L0, 37);
        f2622g.append(C0639g.f3062l0, 5);
        f2622g.append(C0639g.f3178z0, 87);
        f2622g.append(C0639g.f2819I0, 87);
        f2622g.append(C0639g.f2771C0, 87);
        f2622g.append(C0639g.f3008f0, 87);
        f2622g.append(C0639g.f2972b0, 87);
        f2622g.append(C0639g.f3177z, 24);
        f2622g.append(C0639g.f2762B, 28);
        f2622g.append(C0639g.f2858N, 31);
        f2622g.append(C0639g.f2866O, 8);
        f2622g.append(C0639g.f2754A, 34);
        f2622g.append(C0639g.f2770C, 2);
        f2622g.append(C0639g.f3161x, 23);
        f2622g.append(C0639g.f3169y, 21);
        f2622g.append(C0639g.f2867O0, 95);
        f2622g.append(C0639g.f3114r0, 96);
        f2622g.append(C0639g.f3153w, 22);
        f2622g.append(C0639g.f2778D, 43);
        f2622g.append(C0639g.f2882Q, 44);
        f2622g.append(C0639g.f2842L, 45);
        f2622g.append(C0639g.f2850M, 46);
        f2622g.append(C0639g.f2834K, 60);
        f2622g.append(C0639g.f2818I, 47);
        f2622g.append(C0639g.f2826J, 48);
        f2622g.append(C0639g.f2786E, 49);
        f2622g.append(C0639g.f2794F, 50);
        f2622g.append(C0639g.f2802G, 51);
        f2622g.append(C0639g.f2810H, 52);
        f2622g.append(C0639g.f2874P, 53);
        f2622g.append(C0639g.f2875P0, 54);
        f2622g.append(C0639g.f3122s0, 55);
        f2622g.append(C0639g.f2883Q0, 56);
        f2622g.append(C0639g.f3130t0, 57);
        f2622g.append(C0639g.f2891R0, 58);
        f2622g.append(C0639g.f3138u0, 59);
        f2622g.append(C0639g.f3035i0, 61);
        f2622g.append(C0639g.f3053k0, 62);
        f2622g.append(C0639g.f3044j0, 63);
        f2622g.append(C0639g.f2890R, 64);
        f2622g.append(C0639g.f3054k1, 65);
        f2622g.append(C0639g.f2938X, 66);
        f2622g.append(C0639g.f3063l1, 67);
        f2622g.append(C0639g.f2991d1, 79);
        f2622g.append(C0639g.f3145v, 38);
        f2622g.append(C0639g.f2982c1, 68);
        f2622g.append(C0639g.f2899S0, 69);
        f2622g.append(C0639g.f3146v0, 70);
        f2622g.append(C0639g.f2973b1, 97);
        f2622g.append(C0639g.f2922V, 71);
        f2622g.append(C0639g.f2906T, 72);
        f2622g.append(C0639g.f2914U, 73);
        f2622g.append(C0639g.f2930W, 74);
        f2622g.append(C0639g.f2898S, 75);
        f2622g.append(C0639g.f3000e1, 76);
        f2622g.append(C0639g.f2811H0, 77);
        f2622g.append(C0639g.f3072m1, 78);
        f2622g.append(C0639g.f2963a0, 80);
        f2622g.append(C0639g.f2954Z, 81);
        f2622g.append(C0639g.f3009f1, 82);
        f2622g.append(C0639g.f3045j1, 83);
        f2622g.append(C0639g.f3036i1, 84);
        f2622g.append(C0639g.f3027h1, 85);
        f2622g.append(C0639g.f3018g1, 86);
        SparseIntArray sparseIntArray = f2623h;
        int i = C0639g.f2894R3;
        sparseIntArray.append(i, 6);
        f2623h.append(i, 7);
        f2623h.append(C0639g.f2853M2, 27);
        f2623h.append(C0639g.f2918U3, 13);
        f2623h.append(C0639g.f2942X3, 16);
        f2623h.append(C0639g.f2926V3, 14);
        f2623h.append(C0639g.f2902S3, 11);
        f2623h.append(C0639g.f2934W3, 15);
        f2623h.append(C0639g.f2910T3, 12);
        f2623h.append(C0639g.f2846L3, 40);
        f2623h.append(C0639g.f2790E3, 39);
        f2623h.append(C0639g.f2782D3, 41);
        f2623h.append(C0639g.f2838K3, 42);
        f2623h.append(C0639g.f2774C3, 20);
        f2623h.append(C0639g.f2830J3, 37);
        f2623h.append(C0639g.f3157w3, 5);
        f2623h.append(C0639g.f2798F3, 87);
        f2623h.append(C0639g.f2822I3, 87);
        f2623h.append(C0639g.f2806G3, 87);
        f2623h.append(C0639g.f3133t3, 87);
        f2623h.append(C0639g.f3125s3, 87);
        f2623h.append(C0639g.f2893R2, 24);
        f2623h.append(C0639g.f2909T2, 28);
        f2623h.append(C0639g.f3011f3, 31);
        f2623h.append(C0639g.f3020g3, 8);
        f2623h.append(C0639g.f2901S2, 34);
        f2623h.append(C0639g.f2917U2, 2);
        f2623h.append(C0639g.f2877P2, 23);
        f2623h.append(C0639g.f2885Q2, 21);
        f2623h.append(C0639g.f2854M3, 95);
        f2623h.append(C0639g.f3165x3, 96);
        f2623h.append(C0639g.f2869O2, 22);
        f2623h.append(C0639g.f2925V2, 43);
        f2623h.append(C0639g.f3038i3, 44);
        f2623h.append(C0639g.f2993d3, 45);
        f2623h.append(C0639g.f3002e3, 46);
        f2623h.append(C0639g.f2984c3, 60);
        f2623h.append(C0639g.f2966a3, 47);
        f2623h.append(C0639g.f2975b3, 48);
        f2623h.append(C0639g.f2933W2, 49);
        f2623h.append(C0639g.f2941X2, 50);
        f2623h.append(C0639g.f2949Y2, 51);
        f2623h.append(C0639g.f2957Z2, 52);
        f2623h.append(C0639g.f3029h3, 53);
        f2623h.append(C0639g.f2862N3, 54);
        f2623h.append(C0639g.f3173y3, 55);
        f2623h.append(C0639g.f2870O3, 56);
        f2623h.append(C0639g.f3181z3, 57);
        f2623h.append(C0639g.f2878P3, 58);
        f2623h.append(C0639g.f2758A3, 59);
        f2623h.append(C0639g.f3149v3, 62);
        f2623h.append(C0639g.f3141u3, 63);
        f2623h.append(C0639g.f3047j3, 64);
        f2623h.append(C0639g.f3039i4, 65);
        f2623h.append(C0639g.f3101p3, 66);
        f2623h.append(C0639g.f3048j4, 67);
        f2623h.append(C0639g.f2967a4, 79);
        f2623h.append(C0639g.f2861N2, 38);
        f2623h.append(C0639g.f2976b4, 98);
        f2623h.append(C0639g.f2958Z3, 68);
        f2623h.append(C0639g.f2886Q3, 69);
        f2623h.append(C0639g.f2766B3, 70);
        f2623h.append(C0639g.f3083n3, 71);
        f2623h.append(C0639g.f3065l3, 72);
        f2623h.append(C0639g.f3074m3, 73);
        f2623h.append(C0639g.f3092o3, 74);
        f2623h.append(C0639g.f3056k3, 75);
        f2623h.append(C0639g.f2985c4, 76);
        f2623h.append(C0639g.f2814H3, 77);
        f2623h.append(C0639g.f3057k4, 78);
        f2623h.append(C0639g.f3117r3, 80);
        f2623h.append(C0639g.f3109q3, 81);
        f2623h.append(C0639g.f2994d4, 82);
        f2623h.append(C0639g.f3030h4, 83);
        f2623h.append(C0639g.f3021g4, 84);
        f2623h.append(C0639g.f3012f4, 85);
        f2623h.append(C0639g.f3003e4, 86);
        f2623h.append(C0639g.f2950Y3, 97);
    }

    /* renamed from: m */
    private int[] m2430m(View view, String str) {
        int i;
        Object designInformation;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C0638f.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i = ((Integer) designInformation).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != split.length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    /* renamed from: n */
    private C0631a m2431n(Context context, AttributeSet attributeSet, boolean z) {
        int[] iArr;
        C0631a aVar = new C0631a();
        if (z) {
            iArr = C0639g.f2845L2;
        } else {
            iArr = C0639g.f3129t;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        m2437v(context, aVar, obtainStyledAttributes, z);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: o */
    private C0631a m2432o(int i) {
        if (!this.f2628e.containsKey(Integer.valueOf(i))) {
            this.f2628e.put(Integer.valueOf(i), new C0631a());
        }
        return (C0631a) this.f2628e.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static int m2433r(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003f  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m2434s(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) {
        /*
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            android.util.TypedValue r0 = r5.peekValue(r6)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L_0x006f
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L_0x0026
            int r5 = r5.getInt(r6, r2)
            r6 = -4
            r0 = -2
            if (r5 == r6) goto L_0x0022
            r6 = -3
            if (r5 == r6) goto L_0x0020
            if (r5 == r0) goto L_0x002a
            r6 = -1
            if (r5 == r6) goto L_0x002a
        L_0x0020:
            r5 = r2
            goto L_0x002d
        L_0x0022:
            r2 = 1
            r5 = r2
            r2 = r0
            goto L_0x002d
        L_0x0026:
            int r5 = r5.getDimensionPixelSize(r6, r2)
        L_0x002a:
            r3 = r2
            r2 = r5
            r5 = r3
        L_0x002d:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0620b
            if (r6 == 0) goto L_0x003f
            androidx.constraintlayout.widget.ConstraintLayout$b r4 = (androidx.constraintlayout.widget.ConstraintLayout.C0620b) r4
            if (r7 != 0) goto L_0x003a
            r4.width = r2
            r4.f2517a0 = r5
            goto L_0x006e
        L_0x003a:
            r4.height = r2
            r4.f2519b0 = r5
            goto L_0x006e
        L_0x003f:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.C0630d.C0633b
            if (r6 == 0) goto L_0x0051
            androidx.constraintlayout.widget.d$b r4 = (androidx.constraintlayout.widget.C0630d.C0633b) r4
            if (r7 != 0) goto L_0x004c
            r4.f2682d = r2
            r4.f2703n0 = r5
            goto L_0x006e
        L_0x004c:
            r4.f2684e = r2
            r4.f2705o0 = r5
            goto L_0x006e
        L_0x0051:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.C0630d.C0631a.C0632a
            if (r6 == 0) goto L_0x006e
            androidx.constraintlayout.widget.d$a$a r4 = (androidx.constraintlayout.widget.C0630d.C0631a.C0632a) r4
            if (r7 != 0) goto L_0x0064
            r6 = 23
            r4.mo2955b(r6, r2)
            r6 = 80
            r4.mo2957d(r6, r5)
            goto L_0x006e
        L_0x0064:
            r6 = 21
            r4.mo2955b(r6, r2)
            r6 = 81
            r4.mo2957d(r6, r5)
        L_0x006e:
            return
        L_0x006f:
            java.lang.String r5 = r5.getString(r6)
            m2435t(r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0630d.m2434s(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    /* renamed from: t */
    static void m2435t(Object obj, String str, int i) {
        if (str != null) {
            int indexOf = str.indexOf(61);
            int length = str.length();
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(indexOf + 1);
                if (substring2.length() > 0) {
                    String trim = substring.trim();
                    String trim2 = substring2.trim();
                    if ("ratio".equalsIgnoreCase(trim)) {
                        if (obj instanceof ConstraintLayout.C0620b) {
                            ConstraintLayout.C0620b bVar = (ConstraintLayout.C0620b) obj;
                            if (i == 0) {
                                bVar.width = 0;
                            } else {
                                bVar.height = 0;
                            }
                            m2436u(bVar, trim2);
                        } else if (obj instanceof C0633b) {
                            ((C0633b) obj).f2650A = trim2;
                        } else if (obj instanceof C0631a.C0632a) {
                            ((C0631a.C0632a) obj).mo2956c(5, trim2);
                        }
                    } else if ("weight".equalsIgnoreCase(trim)) {
                        try {
                            float parseFloat = Float.parseFloat(trim2);
                            if (obj instanceof ConstraintLayout.C0620b) {
                                ConstraintLayout.C0620b bVar2 = (ConstraintLayout.C0620b) obj;
                                if (i == 0) {
                                    bVar2.width = 0;
                                    bVar2.f2501L = parseFloat;
                                    return;
                                }
                                bVar2.height = 0;
                                bVar2.f2502M = parseFloat;
                            } else if (obj instanceof C0633b) {
                                C0633b bVar3 = (C0633b) obj;
                                if (i == 0) {
                                    bVar3.f2682d = 0;
                                    bVar3.f2672W = parseFloat;
                                    return;
                                }
                                bVar3.f2684e = 0;
                                bVar3.f2671V = parseFloat;
                            } else if (obj instanceof C0631a.C0632a) {
                                C0631a.C0632a aVar = (C0631a.C0632a) obj;
                                if (i == 0) {
                                    aVar.mo2955b(23, 0);
                                    aVar.mo2954a(39, parseFloat);
                                    return;
                                }
                                aVar.mo2955b(21, 0);
                                aVar.mo2954a(40, parseFloat);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(Utils.FLOAT_EPSILON, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof ConstraintLayout.C0620b) {
                            ConstraintLayout.C0620b bVar4 = (ConstraintLayout.C0620b) obj;
                            if (i == 0) {
                                bVar4.width = 0;
                                bVar4.f2511V = max;
                                bVar4.f2505P = 2;
                                return;
                            }
                            bVar4.height = 0;
                            bVar4.f2512W = max;
                            bVar4.f2506Q = 2;
                        } else if (obj instanceof C0633b) {
                            C0633b bVar5 = (C0633b) obj;
                            if (i == 0) {
                                bVar5.f2682d = 0;
                                bVar5.f2687f0 = max;
                                bVar5.f2675Z = 2;
                                return;
                            }
                            bVar5.f2684e = 0;
                            bVar5.f2689g0 = max;
                            bVar5.f2677a0 = 2;
                        } else if (obj instanceof C0631a.C0632a) {
                            C0631a.C0632a aVar2 = (C0631a.C0632a) obj;
                            if (i == 0) {
                                aVar2.mo2955b(23, 0);
                                aVar2.mo2955b(54, 2);
                                return;
                            }
                            aVar2.mo2955b(21, 0);
                            aVar2.mo2955b(55, 2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: u */
    static void m2436u(ConstraintLayout.C0620b bVar, String str) {
        float f = Float.NaN;
        int i = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase(BankApiResponse.CODE_STATUS_WARNING)) {
                    i = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i = 1;
                }
                i2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i2);
                if (substring2.length() > 0) {
                    f = Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i2, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > Utils.FLOAT_EPSILON && parseFloat2 > Utils.FLOAT_EPSILON) {
                            f = i == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        bVar.f2498I = str;
        bVar.f2499J = f;
        bVar.f2500K = i;
    }

    /* renamed from: v */
    private void m2437v(Context context, C0631a aVar, TypedArray typedArray, boolean z) {
        if (z) {
            m2438w(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (!(index == C0639g.f3145v || C0639g.f2858N == index || C0639g.f2866O == index)) {
                aVar.f2632d.f2720a = true;
                aVar.f2633e.f2678b = true;
                aVar.f2631c.f2734a = true;
                aVar.f2634f.f2740a = true;
            }
            switch (f2622g.get(index)) {
                case 1:
                    C0633b bVar = aVar.f2633e;
                    bVar.f2710r = m2433r(typedArray, index, bVar.f2710r);
                    break;
                case 2:
                    C0633b bVar2 = aVar.f2633e;
                    bVar2.f2660K = typedArray.getDimensionPixelSize(index, bVar2.f2660K);
                    break;
                case 3:
                    C0633b bVar3 = aVar.f2633e;
                    bVar3.f2708q = m2433r(typedArray, index, bVar3.f2708q);
                    break;
                case 4:
                    C0633b bVar4 = aVar.f2633e;
                    bVar4.f2706p = m2433r(typedArray, index, bVar4.f2706p);
                    break;
                case 5:
                    aVar.f2633e.f2650A = typedArray.getString(index);
                    break;
                case 6:
                    C0633b bVar5 = aVar.f2633e;
                    bVar5.f2654E = typedArray.getDimensionPixelOffset(index, bVar5.f2654E);
                    break;
                case 7:
                    C0633b bVar6 = aVar.f2633e;
                    bVar6.f2655F = typedArray.getDimensionPixelOffset(index, bVar6.f2655F);
                    break;
                case 8:
                    C0633b bVar7 = aVar.f2633e;
                    bVar7.f2661L = typedArray.getDimensionPixelSize(index, bVar7.f2661L);
                    break;
                case 9:
                    C0633b bVar8 = aVar.f2633e;
                    bVar8.f2716x = m2433r(typedArray, index, bVar8.f2716x);
                    break;
                case 10:
                    C0633b bVar9 = aVar.f2633e;
                    bVar9.f2715w = m2433r(typedArray, index, bVar9.f2715w);
                    break;
                case 11:
                    C0633b bVar10 = aVar.f2633e;
                    bVar10.f2667R = typedArray.getDimensionPixelSize(index, bVar10.f2667R);
                    break;
                case 12:
                    C0633b bVar11 = aVar.f2633e;
                    bVar11.f2668S = typedArray.getDimensionPixelSize(index, bVar11.f2668S);
                    break;
                case 13:
                    C0633b bVar12 = aVar.f2633e;
                    bVar12.f2664O = typedArray.getDimensionPixelSize(index, bVar12.f2664O);
                    break;
                case 14:
                    C0633b bVar13 = aVar.f2633e;
                    bVar13.f2666Q = typedArray.getDimensionPixelSize(index, bVar13.f2666Q);
                    break;
                case 15:
                    C0633b bVar14 = aVar.f2633e;
                    bVar14.f2669T = typedArray.getDimensionPixelSize(index, bVar14.f2669T);
                    break;
                case 16:
                    C0633b bVar15 = aVar.f2633e;
                    bVar15.f2665P = typedArray.getDimensionPixelSize(index, bVar15.f2665P);
                    break;
                case 17:
                    C0633b bVar16 = aVar.f2633e;
                    bVar16.f2686f = typedArray.getDimensionPixelOffset(index, bVar16.f2686f);
                    break;
                case 18:
                    C0633b bVar17 = aVar.f2633e;
                    bVar17.f2688g = typedArray.getDimensionPixelOffset(index, bVar17.f2688g);
                    break;
                case 19:
                    C0633b bVar18 = aVar.f2633e;
                    bVar18.f2690h = typedArray.getFloat(index, bVar18.f2690h);
                    break;
                case 20:
                    C0633b bVar19 = aVar.f2633e;
                    bVar19.f2717y = typedArray.getFloat(index, bVar19.f2717y);
                    break;
                case 21:
                    C0633b bVar20 = aVar.f2633e;
                    bVar20.f2684e = typedArray.getLayoutDimension(index, bVar20.f2684e);
                    break;
                case 22:
                    C0635d dVar = aVar.f2631c;
                    dVar.f2735b = typedArray.getInt(index, dVar.f2735b);
                    C0635d dVar2 = aVar.f2631c;
                    dVar2.f2735b = f2621f[dVar2.f2735b];
                    break;
                case 23:
                    C0633b bVar21 = aVar.f2633e;
                    bVar21.f2682d = typedArray.getLayoutDimension(index, bVar21.f2682d);
                    break;
                case 24:
                    C0633b bVar22 = aVar.f2633e;
                    bVar22.f2657H = typedArray.getDimensionPixelSize(index, bVar22.f2657H);
                    break;
                case 25:
                    C0633b bVar23 = aVar.f2633e;
                    bVar23.f2694j = m2433r(typedArray, index, bVar23.f2694j);
                    break;
                case 26:
                    C0633b bVar24 = aVar.f2633e;
                    bVar24.f2696k = m2433r(typedArray, index, bVar24.f2696k);
                    break;
                case 27:
                    C0633b bVar25 = aVar.f2633e;
                    bVar25.f2656G = typedArray.getInt(index, bVar25.f2656G);
                    break;
                case 28:
                    C0633b bVar26 = aVar.f2633e;
                    bVar26.f2658I = typedArray.getDimensionPixelSize(index, bVar26.f2658I);
                    break;
                case 29:
                    C0633b bVar27 = aVar.f2633e;
                    bVar27.f2698l = m2433r(typedArray, index, bVar27.f2698l);
                    break;
                case 30:
                    C0633b bVar28 = aVar.f2633e;
                    bVar28.f2700m = m2433r(typedArray, index, bVar28.f2700m);
                    break;
                case 31:
                    C0633b bVar29 = aVar.f2633e;
                    bVar29.f2662M = typedArray.getDimensionPixelSize(index, bVar29.f2662M);
                    break;
                case 32:
                    C0633b bVar30 = aVar.f2633e;
                    bVar30.f2713u = m2433r(typedArray, index, bVar30.f2713u);
                    break;
                case 33:
                    C0633b bVar31 = aVar.f2633e;
                    bVar31.f2714v = m2433r(typedArray, index, bVar31.f2714v);
                    break;
                case 34:
                    C0633b bVar32 = aVar.f2633e;
                    bVar32.f2659J = typedArray.getDimensionPixelSize(index, bVar32.f2659J);
                    break;
                case 35:
                    C0633b bVar33 = aVar.f2633e;
                    bVar33.f2704o = m2433r(typedArray, index, bVar33.f2704o);
                    break;
                case 36:
                    C0633b bVar34 = aVar.f2633e;
                    bVar34.f2702n = m2433r(typedArray, index, bVar34.f2702n);
                    break;
                case 37:
                    C0633b bVar35 = aVar.f2633e;
                    bVar35.f2718z = typedArray.getFloat(index, bVar35.f2718z);
                    break;
                case 38:
                    aVar.f2629a = typedArray.getResourceId(index, aVar.f2629a);
                    break;
                case 39:
                    C0633b bVar36 = aVar.f2633e;
                    bVar36.f2672W = typedArray.getFloat(index, bVar36.f2672W);
                    break;
                case 40:
                    C0633b bVar37 = aVar.f2633e;
                    bVar37.f2671V = typedArray.getFloat(index, bVar37.f2671V);
                    break;
                case 41:
                    C0633b bVar38 = aVar.f2633e;
                    bVar38.f2673X = typedArray.getInt(index, bVar38.f2673X);
                    break;
                case 42:
                    C0633b bVar39 = aVar.f2633e;
                    bVar39.f2674Y = typedArray.getInt(index, bVar39.f2674Y);
                    break;
                case 43:
                    C0635d dVar3 = aVar.f2631c;
                    dVar3.f2737d = typedArray.getFloat(index, dVar3.f2737d);
                    break;
                case 44:
                    C0636e eVar = aVar.f2634f;
                    eVar.f2752m = true;
                    eVar.f2753n = typedArray.getDimension(index, eVar.f2753n);
                    break;
                case 45:
                    C0636e eVar2 = aVar.f2634f;
                    eVar2.f2742c = typedArray.getFloat(index, eVar2.f2742c);
                    break;
                case 46:
                    C0636e eVar3 = aVar.f2634f;
                    eVar3.f2743d = typedArray.getFloat(index, eVar3.f2743d);
                    break;
                case 47:
                    C0636e eVar4 = aVar.f2634f;
                    eVar4.f2744e = typedArray.getFloat(index, eVar4.f2744e);
                    break;
                case 48:
                    C0636e eVar5 = aVar.f2634f;
                    eVar5.f2745f = typedArray.getFloat(index, eVar5.f2745f);
                    break;
                case 49:
                    C0636e eVar6 = aVar.f2634f;
                    eVar6.f2746g = typedArray.getDimension(index, eVar6.f2746g);
                    break;
                case 50:
                    C0636e eVar7 = aVar.f2634f;
                    eVar7.f2747h = typedArray.getDimension(index, eVar7.f2747h);
                    break;
                case 51:
                    C0636e eVar8 = aVar.f2634f;
                    eVar8.f2749j = typedArray.getDimension(index, eVar8.f2749j);
                    break;
                case 52:
                    C0636e eVar9 = aVar.f2634f;
                    eVar9.f2750k = typedArray.getDimension(index, eVar9.f2750k);
                    break;
                case 53:
                    C0636e eVar10 = aVar.f2634f;
                    eVar10.f2751l = typedArray.getDimension(index, eVar10.f2751l);
                    break;
                case 54:
                    C0633b bVar40 = aVar.f2633e;
                    bVar40.f2675Z = typedArray.getInt(index, bVar40.f2675Z);
                    break;
                case 55:
                    C0633b bVar41 = aVar.f2633e;
                    bVar41.f2677a0 = typedArray.getInt(index, bVar41.f2677a0);
                    break;
                case 56:
                    C0633b bVar42 = aVar.f2633e;
                    bVar42.f2679b0 = typedArray.getDimensionPixelSize(index, bVar42.f2679b0);
                    break;
                case 57:
                    C0633b bVar43 = aVar.f2633e;
                    bVar43.f2681c0 = typedArray.getDimensionPixelSize(index, bVar43.f2681c0);
                    break;
                case 58:
                    C0633b bVar44 = aVar.f2633e;
                    bVar44.f2683d0 = typedArray.getDimensionPixelSize(index, bVar44.f2683d0);
                    break;
                case 59:
                    C0633b bVar45 = aVar.f2633e;
                    bVar45.f2685e0 = typedArray.getDimensionPixelSize(index, bVar45.f2685e0);
                    break;
                case 60:
                    C0636e eVar11 = aVar.f2634f;
                    eVar11.f2741b = typedArray.getFloat(index, eVar11.f2741b);
                    break;
                case 61:
                    C0633b bVar46 = aVar.f2633e;
                    bVar46.f2651B = m2433r(typedArray, index, bVar46.f2651B);
                    break;
                case 62:
                    C0633b bVar47 = aVar.f2633e;
                    bVar47.f2652C = typedArray.getDimensionPixelSize(index, bVar47.f2652C);
                    break;
                case 63:
                    C0633b bVar48 = aVar.f2633e;
                    bVar48.f2653D = typedArray.getFloat(index, bVar48.f2653D);
                    break;
                case 64:
                    C0634c cVar = aVar.f2632d;
                    cVar.f2721b = m2433r(typedArray, index, cVar.f2721b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar.f2632d.f2723d = C7356a.f21565c[typedArray.getInteger(index, 0)];
                        break;
                    } else {
                        aVar.f2632d.f2723d = typedArray.getString(index);
                        break;
                    }
                case 66:
                    aVar.f2632d.f2725f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C0634c cVar2 = aVar.f2632d;
                    cVar2.f2728i = typedArray.getFloat(index, cVar2.f2728i);
                    break;
                case 68:
                    C0635d dVar4 = aVar.f2631c;
                    dVar4.f2738e = typedArray.getFloat(index, dVar4.f2738e);
                    break;
                case 69:
                    aVar.f2633e.f2687f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f2633e.f2689g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    C0633b bVar49 = aVar.f2633e;
                    bVar49.f2691h0 = typedArray.getInt(index, bVar49.f2691h0);
                    break;
                case 73:
                    C0633b bVar50 = aVar.f2633e;
                    bVar50.f2693i0 = typedArray.getDimensionPixelSize(index, bVar50.f2693i0);
                    break;
                case 74:
                    aVar.f2633e.f2699l0 = typedArray.getString(index);
                    break;
                case 75:
                    C0633b bVar51 = aVar.f2633e;
                    bVar51.f2707p0 = typedArray.getBoolean(index, bVar51.f2707p0);
                    break;
                case 76:
                    C0634c cVar3 = aVar.f2632d;
                    cVar3.f2724e = typedArray.getInt(index, cVar3.f2724e);
                    break;
                case 77:
                    aVar.f2633e.f2701m0 = typedArray.getString(index);
                    break;
                case 78:
                    C0635d dVar5 = aVar.f2631c;
                    dVar5.f2736c = typedArray.getInt(index, dVar5.f2736c);
                    break;
                case 79:
                    C0634c cVar4 = aVar.f2632d;
                    cVar4.f2726g = typedArray.getFloat(index, cVar4.f2726g);
                    break;
                case 80:
                    C0633b bVar52 = aVar.f2633e;
                    bVar52.f2703n0 = typedArray.getBoolean(index, bVar52.f2703n0);
                    break;
                case 81:
                    C0633b bVar53 = aVar.f2633e;
                    bVar53.f2705o0 = typedArray.getBoolean(index, bVar53.f2705o0);
                    break;
                case 82:
                    C0634c cVar5 = aVar.f2632d;
                    cVar5.f2722c = typedArray.getInteger(index, cVar5.f2722c);
                    break;
                case 83:
                    C0636e eVar12 = aVar.f2634f;
                    eVar12.f2748i = m2433r(typedArray, index, eVar12.f2748i);
                    break;
                case 84:
                    C0634c cVar6 = aVar.f2632d;
                    cVar6.f2730k = typedArray.getInteger(index, cVar6.f2730k);
                    break;
                case 85:
                    C0634c cVar7 = aVar.f2632d;
                    cVar7.f2729j = typedArray.getFloat(index, cVar7.f2729j);
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 != 1) {
                        if (i2 != 3) {
                            C0634c cVar8 = aVar.f2632d;
                            cVar8.f2732m = typedArray.getInteger(index, cVar8.f2733n);
                            break;
                        } else {
                            aVar.f2632d.f2731l = typedArray.getString(index);
                            if (aVar.f2632d.f2731l.indexOf(C11110u2.f31950c) <= 0) {
                                aVar.f2632d.f2732m = -1;
                                break;
                            } else {
                                aVar.f2632d.f2733n = typedArray.getResourceId(index, -1);
                                aVar.f2632d.f2732m = -2;
                                break;
                            }
                        }
                    } else {
                        aVar.f2632d.f2733n = typedArray.getResourceId(index, -1);
                        C0634c cVar9 = aVar.f2632d;
                        if (cVar9.f2733n == -1) {
                            break;
                        } else {
                            cVar9.f2732m = -2;
                            break;
                        }
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2622g.get(index));
                    break;
                case 91:
                    C0633b bVar54 = aVar.f2633e;
                    bVar54.f2711s = m2433r(typedArray, index, bVar54.f2711s);
                    break;
                case 92:
                    C0633b bVar55 = aVar.f2633e;
                    bVar55.f2712t = m2433r(typedArray, index, bVar55.f2712t);
                    break;
                case 93:
                    C0633b bVar56 = aVar.f2633e;
                    bVar56.f2663N = typedArray.getDimensionPixelSize(index, bVar56.f2663N);
                    break;
                case 94:
                    C0633b bVar57 = aVar.f2633e;
                    bVar57.f2670U = typedArray.getDimensionPixelSize(index, bVar57.f2670U);
                    break;
                case 95:
                    m2434s(aVar.f2633e, typedArray, index, 0);
                    break;
                case 96:
                    m2434s(aVar.f2633e, typedArray, index, 1);
                    break;
                case 97:
                    C0633b bVar58 = aVar.f2633e;
                    bVar58.f2709q0 = typedArray.getInt(index, bVar58.f2709q0);
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2622g.get(index));
                    break;
            }
        }
        C0633b bVar59 = aVar.f2633e;
        if (bVar59.f2699l0 != null) {
            bVar59.f2697k0 = null;
        }
    }

    /* renamed from: w */
    private static void m2438w(Context context, C0631a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        C0631a.C0632a aVar2 = new C0631a.C0632a();
        aVar.f2636h = aVar2;
        aVar.f2632d.f2720a = false;
        aVar.f2633e.f2678b = false;
        aVar.f2631c.f2734a = false;
        aVar.f2634f.f2740a = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (f2623h.get(index)) {
                case 2:
                    aVar2.mo2955b(2, typedArray.getDimensionPixelSize(index, aVar.f2633e.f2660K));
                    break;
                case 5:
                    aVar2.mo2956c(5, typedArray.getString(index));
                    break;
                case 6:
                    aVar2.mo2955b(6, typedArray.getDimensionPixelOffset(index, aVar.f2633e.f2654E));
                    break;
                case 7:
                    aVar2.mo2955b(7, typedArray.getDimensionPixelOffset(index, aVar.f2633e.f2655F));
                    break;
                case 8:
                    aVar2.mo2955b(8, typedArray.getDimensionPixelSize(index, aVar.f2633e.f2661L));
                    break;
                case 11:
                    aVar2.mo2955b(11, typedArray.getDimensionPixelSize(index, aVar.f2633e.f2667R));
                    break;
                case 12:
                    aVar2.mo2955b(12, typedArray.getDimensionPixelSize(index, aVar.f2633e.f2668S));
                    break;
                case 13:
                    aVar2.mo2955b(13, typedArray.getDimensionPixelSize(index, aVar.f2633e.f2664O));
                    break;
                case 14:
                    aVar2.mo2955b(14, typedArray.getDimensionPixelSize(index, aVar.f2633e.f2666Q));
                    break;
                case 15:
                    aVar2.mo2955b(15, typedArray.getDimensionPixelSize(index, aVar.f2633e.f2669T));
                    break;
                case 16:
                    aVar2.mo2955b(16, typedArray.getDimensionPixelSize(index, aVar.f2633e.f2665P));
                    break;
                case 17:
                    aVar2.mo2955b(17, typedArray.getDimensionPixelOffset(index, aVar.f2633e.f2686f));
                    break;
                case 18:
                    aVar2.mo2955b(18, typedArray.getDimensionPixelOffset(index, aVar.f2633e.f2688g));
                    break;
                case 19:
                    aVar2.mo2954a(19, typedArray.getFloat(index, aVar.f2633e.f2690h));
                    break;
                case 20:
                    aVar2.mo2954a(20, typedArray.getFloat(index, aVar.f2633e.f2717y));
                    break;
                case 21:
                    aVar2.mo2955b(21, typedArray.getLayoutDimension(index, aVar.f2633e.f2684e));
                    break;
                case 22:
                    aVar2.mo2955b(22, f2621f[typedArray.getInt(index, aVar.f2631c.f2735b)]);
                    break;
                case 23:
                    aVar2.mo2955b(23, typedArray.getLayoutDimension(index, aVar.f2633e.f2682d));
                    break;
                case 24:
                    aVar2.mo2955b(24, typedArray.getDimensionPixelSize(index, aVar.f2633e.f2657H));
                    break;
                case 27:
                    aVar2.mo2955b(27, typedArray.getInt(index, aVar.f2633e.f2656G));
                    break;
                case 28:
                    aVar2.mo2955b(28, typedArray.getDimensionPixelSize(index, aVar.f2633e.f2658I));
                    break;
                case 31:
                    aVar2.mo2955b(31, typedArray.getDimensionPixelSize(index, aVar.f2633e.f2662M));
                    break;
                case 34:
                    aVar2.mo2955b(34, typedArray.getDimensionPixelSize(index, aVar.f2633e.f2659J));
                    break;
                case 37:
                    aVar2.mo2954a(37, typedArray.getFloat(index, aVar.f2633e.f2718z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f2629a);
                    aVar.f2629a = resourceId;
                    aVar2.mo2955b(38, resourceId);
                    break;
                case 39:
                    aVar2.mo2954a(39, typedArray.getFloat(index, aVar.f2633e.f2672W));
                    break;
                case 40:
                    aVar2.mo2954a(40, typedArray.getFloat(index, aVar.f2633e.f2671V));
                    break;
                case 41:
                    aVar2.mo2955b(41, typedArray.getInt(index, aVar.f2633e.f2673X));
                    break;
                case 42:
                    aVar2.mo2955b(42, typedArray.getInt(index, aVar.f2633e.f2674Y));
                    break;
                case 43:
                    aVar2.mo2954a(43, typedArray.getFloat(index, aVar.f2631c.f2737d));
                    break;
                case 44:
                    aVar2.mo2957d(44, true);
                    aVar2.mo2954a(44, typedArray.getDimension(index, aVar.f2634f.f2753n));
                    break;
                case 45:
                    aVar2.mo2954a(45, typedArray.getFloat(index, aVar.f2634f.f2742c));
                    break;
                case 46:
                    aVar2.mo2954a(46, typedArray.getFloat(index, aVar.f2634f.f2743d));
                    break;
                case 47:
                    aVar2.mo2954a(47, typedArray.getFloat(index, aVar.f2634f.f2744e));
                    break;
                case 48:
                    aVar2.mo2954a(48, typedArray.getFloat(index, aVar.f2634f.f2745f));
                    break;
                case 49:
                    aVar2.mo2954a(49, typedArray.getDimension(index, aVar.f2634f.f2746g));
                    break;
                case 50:
                    aVar2.mo2954a(50, typedArray.getDimension(index, aVar.f2634f.f2747h));
                    break;
                case 51:
                    aVar2.mo2954a(51, typedArray.getDimension(index, aVar.f2634f.f2749j));
                    break;
                case 52:
                    aVar2.mo2954a(52, typedArray.getDimension(index, aVar.f2634f.f2750k));
                    break;
                case 53:
                    aVar2.mo2954a(53, typedArray.getDimension(index, aVar.f2634f.f2751l));
                    break;
                case 54:
                    aVar2.mo2955b(54, typedArray.getInt(index, aVar.f2633e.f2675Z));
                    break;
                case 55:
                    aVar2.mo2955b(55, typedArray.getInt(index, aVar.f2633e.f2677a0));
                    break;
                case 56:
                    aVar2.mo2955b(56, typedArray.getDimensionPixelSize(index, aVar.f2633e.f2679b0));
                    break;
                case 57:
                    aVar2.mo2955b(57, typedArray.getDimensionPixelSize(index, aVar.f2633e.f2681c0));
                    break;
                case 58:
                    aVar2.mo2955b(58, typedArray.getDimensionPixelSize(index, aVar.f2633e.f2683d0));
                    break;
                case 59:
                    aVar2.mo2955b(59, typedArray.getDimensionPixelSize(index, aVar.f2633e.f2685e0));
                    break;
                case 60:
                    aVar2.mo2954a(60, typedArray.getFloat(index, aVar.f2634f.f2741b));
                    break;
                case 62:
                    aVar2.mo2955b(62, typedArray.getDimensionPixelSize(index, aVar.f2633e.f2652C));
                    break;
                case 63:
                    aVar2.mo2954a(63, typedArray.getFloat(index, aVar.f2633e.f2653D));
                    break;
                case 64:
                    aVar2.mo2955b(64, m2433r(typedArray, index, aVar.f2632d.f2721b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar2.mo2956c(65, C7356a.f21565c[typedArray.getInteger(index, 0)]);
                        break;
                    } else {
                        aVar2.mo2956c(65, typedArray.getString(index));
                        break;
                    }
                case 66:
                    aVar2.mo2955b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    aVar2.mo2954a(67, typedArray.getFloat(index, aVar.f2632d.f2728i));
                    break;
                case 68:
                    aVar2.mo2954a(68, typedArray.getFloat(index, aVar.f2631c.f2738e));
                    break;
                case 69:
                    aVar2.mo2954a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    aVar2.mo2954a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    aVar2.mo2955b(72, typedArray.getInt(index, aVar.f2633e.f2691h0));
                    break;
                case 73:
                    aVar2.mo2955b(73, typedArray.getDimensionPixelSize(index, aVar.f2633e.f2693i0));
                    break;
                case 74:
                    aVar2.mo2956c(74, typedArray.getString(index));
                    break;
                case 75:
                    aVar2.mo2957d(75, typedArray.getBoolean(index, aVar.f2633e.f2707p0));
                    break;
                case 76:
                    aVar2.mo2955b(76, typedArray.getInt(index, aVar.f2632d.f2724e));
                    break;
                case 77:
                    aVar2.mo2956c(77, typedArray.getString(index));
                    break;
                case 78:
                    aVar2.mo2955b(78, typedArray.getInt(index, aVar.f2631c.f2736c));
                    break;
                case 79:
                    aVar2.mo2954a(79, typedArray.getFloat(index, aVar.f2632d.f2726g));
                    break;
                case 80:
                    aVar2.mo2957d(80, typedArray.getBoolean(index, aVar.f2633e.f2703n0));
                    break;
                case 81:
                    aVar2.mo2957d(81, typedArray.getBoolean(index, aVar.f2633e.f2705o0));
                    break;
                case 82:
                    aVar2.mo2955b(82, typedArray.getInteger(index, aVar.f2632d.f2722c));
                    break;
                case 83:
                    aVar2.mo2955b(83, m2433r(typedArray, index, aVar.f2634f.f2748i));
                    break;
                case 84:
                    aVar2.mo2955b(84, typedArray.getInteger(index, aVar.f2632d.f2730k));
                    break;
                case 85:
                    aVar2.mo2954a(85, typedArray.getFloat(index, aVar.f2632d.f2729j));
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 != 1) {
                        if (i2 != 3) {
                            C0634c cVar = aVar.f2632d;
                            cVar.f2732m = typedArray.getInteger(index, cVar.f2733n);
                            aVar2.mo2955b(88, aVar.f2632d.f2732m);
                            break;
                        } else {
                            aVar.f2632d.f2731l = typedArray.getString(index);
                            aVar2.mo2956c(90, aVar.f2632d.f2731l);
                            if (aVar.f2632d.f2731l.indexOf(C11110u2.f31950c) <= 0) {
                                aVar.f2632d.f2732m = -1;
                                aVar2.mo2955b(88, -1);
                                break;
                            } else {
                                aVar.f2632d.f2733n = typedArray.getResourceId(index, -1);
                                aVar2.mo2955b(89, aVar.f2632d.f2733n);
                                aVar.f2632d.f2732m = -2;
                                aVar2.mo2955b(88, -2);
                                break;
                            }
                        }
                    } else {
                        aVar.f2632d.f2733n = typedArray.getResourceId(index, -1);
                        aVar2.mo2955b(89, aVar.f2632d.f2733n);
                        C0634c cVar2 = aVar.f2632d;
                        if (cVar2.f2733n == -1) {
                            break;
                        } else {
                            cVar2.f2732m = -2;
                            aVar2.mo2955b(88, -2);
                            break;
                        }
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2622g.get(index));
                    break;
                case 93:
                    aVar2.mo2955b(93, typedArray.getDimensionPixelSize(index, aVar.f2633e.f2663N));
                    break;
                case 94:
                    aVar2.mo2955b(94, typedArray.getDimensionPixelSize(index, aVar.f2633e.f2670U));
                    break;
                case 95:
                    m2434s(aVar2, typedArray, index, 0);
                    break;
                case 96:
                    m2434s(aVar2, typedArray, index, 1);
                    break;
                case 97:
                    aVar2.mo2955b(97, typedArray.getInt(index, aVar.f2633e.f2709q0));
                    break;
                case 98:
                    if (!C8091b.f23249d) {
                        if (typedArray.peekValue(index).type != 3) {
                            aVar.f2629a = typedArray.getResourceId(index, aVar.f2629a);
                            break;
                        } else {
                            aVar.f2630b = typedArray.getString(index);
                            break;
                        }
                    } else {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f2629a);
                        aVar.f2629a = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            aVar.f2630b = typedArray.getString(index);
                            break;
                        }
                    }
                case 99:
                    aVar2.mo2957d(99, typedArray.getBoolean(index, aVar.f2633e.f2692i));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2622g.get(index));
                    break;
            }
        }
    }

    /* renamed from: z */
    private String m2439z(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    /* renamed from: c */
    public void mo2937c(ConstraintLayout constraintLayout) {
        mo2938d(constraintLayout, true);
        constraintLayout.setConstraintSet((C0630d) null);
        constraintLayout.requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2938d(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2628e.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f2628e.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + C8090a.m30629a(childAt));
            } else if (this.f2627d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f2628e.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0631a aVar = (C0631a) this.f2628e.get(Integer.valueOf(id));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            aVar.f2633e.f2695j0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.f2633e.f2691h0);
                            barrier.setMargin(aVar.f2633e.f2693i0);
                            barrier.setAllowsGoneWidget(aVar.f2633e.f2707p0);
                            C0633b bVar = aVar.f2633e;
                            int[] iArr = bVar.f2697k0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f2699l0;
                                if (str != null) {
                                    bVar.f2697k0 = m2430m(barrier, str);
                                    barrier.setReferencedIds(aVar.f2633e.f2697k0);
                                }
                            }
                        }
                        ConstraintLayout.C0620b bVar2 = (ConstraintLayout.C0620b) childAt.getLayoutParams();
                        bVar2.mo2894a();
                        aVar.mo2951b(bVar2);
                        if (z) {
                            C0623a.m2403c(childAt, aVar.f2635g);
                        }
                        childAt.setLayoutParams(bVar2);
                        C0635d dVar = aVar.f2631c;
                        if (dVar.f2736c == 0) {
                            childAt.setVisibility(dVar.f2735b);
                        }
                        childAt.setAlpha(aVar.f2631c.f2737d);
                        childAt.setRotation(aVar.f2634f.f2741b);
                        childAt.setRotationX(aVar.f2634f.f2742c);
                        childAt.setRotationY(aVar.f2634f.f2743d);
                        childAt.setScaleX(aVar.f2634f.f2744e);
                        childAt.setScaleY(aVar.f2634f.f2745f);
                        C0636e eVar = aVar.f2634f;
                        if (eVar.f2748i != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(aVar.f2634f.f2748i);
                            if (findViewById != null) {
                                float top = ((float) (findViewById.getTop() + findViewById.getBottom())) / 2.0f;
                                float left = ((float) (findViewById.getLeft() + findViewById.getRight())) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(left - ((float) childAt.getLeft()));
                                    childAt.setPivotY(top - ((float) childAt.getTop()));
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f2746g)) {
                                childAt.setPivotX(aVar.f2634f.f2746g);
                            }
                            if (!Float.isNaN(aVar.f2634f.f2747h)) {
                                childAt.setPivotY(aVar.f2634f.f2747h);
                            }
                        }
                        childAt.setTranslationX(aVar.f2634f.f2749j);
                        childAt.setTranslationY(aVar.f2634f.f2750k);
                        childAt.setTranslationZ(aVar.f2634f.f2751l);
                        C0636e eVar2 = aVar.f2634f;
                        if (eVar2.f2752m) {
                            childAt.setElevation(eVar2.f2753n);
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0631a aVar2 = (C0631a) this.f2628e.get(num);
            if (aVar2 != null) {
                if (aVar2.f2633e.f2695j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    C0633b bVar3 = aVar2.f2633e;
                    int[] iArr2 = bVar3.f2697k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f2699l0;
                        if (str2 != null) {
                            bVar3.f2697k0 = m2430m(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f2633e.f2697k0);
                        }
                    }
                    barrier2.setType(aVar2.f2633e.f2691h0);
                    barrier2.setMargin(aVar2.f2633e.f2693i0);
                    ConstraintLayout.C0620b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.mo2925o();
                    aVar2.mo2951b(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (aVar2.f2633e.f2676a) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.C0620b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.mo2951b(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof C0626b) {
                ((C0626b) childAt2).mo2899f(constraintLayout);
            }
        }
    }

    /* renamed from: e */
    public void mo2939e(int i) {
        this.f2628e.remove(Integer.valueOf(i));
    }

    /* renamed from: f */
    public void mo2940f(int i, int i2) {
        C0631a aVar;
        if (this.f2628e.containsKey(Integer.valueOf(i)) && (aVar = (C0631a) this.f2628e.get(Integer.valueOf(i))) != null) {
            switch (i2) {
                case 1:
                    C0633b bVar = aVar.f2633e;
                    bVar.f2696k = -1;
                    bVar.f2694j = -1;
                    bVar.f2657H = -1;
                    bVar.f2664O = Integer.MIN_VALUE;
                    return;
                case 2:
                    C0633b bVar2 = aVar.f2633e;
                    bVar2.f2700m = -1;
                    bVar2.f2698l = -1;
                    bVar2.f2658I = -1;
                    bVar2.f2666Q = Integer.MIN_VALUE;
                    return;
                case 3:
                    C0633b bVar3 = aVar.f2633e;
                    bVar3.f2704o = -1;
                    bVar3.f2702n = -1;
                    bVar3.f2659J = 0;
                    bVar3.f2665P = Integer.MIN_VALUE;
                    return;
                case 4:
                    C0633b bVar4 = aVar.f2633e;
                    bVar4.f2706p = -1;
                    bVar4.f2708q = -1;
                    bVar4.f2660K = 0;
                    bVar4.f2667R = Integer.MIN_VALUE;
                    return;
                case 5:
                    C0633b bVar5 = aVar.f2633e;
                    bVar5.f2710r = -1;
                    bVar5.f2711s = -1;
                    bVar5.f2712t = -1;
                    bVar5.f2663N = 0;
                    bVar5.f2670U = Integer.MIN_VALUE;
                    return;
                case 6:
                    C0633b bVar6 = aVar.f2633e;
                    bVar6.f2713u = -1;
                    bVar6.f2714v = -1;
                    bVar6.f2662M = 0;
                    bVar6.f2669T = Integer.MIN_VALUE;
                    return;
                case 7:
                    C0633b bVar7 = aVar.f2633e;
                    bVar7.f2715w = -1;
                    bVar7.f2716x = -1;
                    bVar7.f2661L = 0;
                    bVar7.f2668S = Integer.MIN_VALUE;
                    return;
                case 8:
                    C0633b bVar8 = aVar.f2633e;
                    bVar8.f2653D = -1.0f;
                    bVar8.f2652C = -1;
                    bVar8.f2651B = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    /* renamed from: g */
    public void mo2941g(Context context, int i) {
        mo2942h((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    /* renamed from: h */
    public void mo2942h(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2628e.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.C0620b bVar = (ConstraintLayout.C0620b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f2627d || id != -1) {
                if (!this.f2628e.containsKey(Integer.valueOf(id))) {
                    this.f2628e.put(Integer.valueOf(id), new C0631a());
                }
                C0631a aVar = (C0631a) this.f2628e.get(Integer.valueOf(id));
                if (aVar != null) {
                    aVar.f2635g = C0623a.m2401a(this.f2626c, childAt);
                    aVar.m2455d(id, bVar);
                    aVar.f2631c.f2735b = childAt.getVisibility();
                    aVar.f2631c.f2737d = childAt.getAlpha();
                    aVar.f2634f.f2741b = childAt.getRotation();
                    aVar.f2634f.f2742c = childAt.getRotationX();
                    aVar.f2634f.f2743d = childAt.getRotationY();
                    aVar.f2634f.f2744e = childAt.getScaleX();
                    aVar.f2634f.f2745f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == Utils.DOUBLE_EPSILON && ((double) pivotY) == Utils.DOUBLE_EPSILON)) {
                        C0636e eVar = aVar.f2634f;
                        eVar.f2746g = pivotX;
                        eVar.f2747h = pivotY;
                    }
                    aVar.f2634f.f2749j = childAt.getTranslationX();
                    aVar.f2634f.f2750k = childAt.getTranslationY();
                    aVar.f2634f.f2751l = childAt.getTranslationZ();
                    C0636e eVar2 = aVar.f2634f;
                    if (eVar2.f2752m) {
                        eVar2.f2753n = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        aVar.f2633e.f2707p0 = barrier.getAllowsGoneWidget();
                        aVar.f2633e.f2697k0 = barrier.getReferencedIds();
                        aVar.f2633e.f2691h0 = barrier.getType();
                        aVar.f2633e.f2693i0 = barrier.getMargin();
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: i */
    public void mo2943i(int i, int i2, int i3, int i4) {
        if (!this.f2628e.containsKey(Integer.valueOf(i))) {
            this.f2628e.put(Integer.valueOf(i), new C0631a());
        }
        C0631a aVar = (C0631a) this.f2628e.get(Integer.valueOf(i));
        if (aVar != null) {
            switch (i2) {
                case 1:
                    if (i4 == 1) {
                        C0633b bVar = aVar.f2633e;
                        bVar.f2694j = i3;
                        bVar.f2696k = -1;
                        return;
                    } else if (i4 == 2) {
                        C0633b bVar2 = aVar.f2633e;
                        bVar2.f2696k = i3;
                        bVar2.f2694j = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("left to " + m2439z(i4) + " undefined");
                    }
                case 2:
                    if (i4 == 1) {
                        C0633b bVar3 = aVar.f2633e;
                        bVar3.f2698l = i3;
                        bVar3.f2700m = -1;
                        return;
                    } else if (i4 == 2) {
                        C0633b bVar4 = aVar.f2633e;
                        bVar4.f2700m = i3;
                        bVar4.f2698l = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + m2439z(i4) + " undefined");
                    }
                case 3:
                    if (i4 == 3) {
                        C0633b bVar5 = aVar.f2633e;
                        bVar5.f2702n = i3;
                        bVar5.f2704o = -1;
                        bVar5.f2710r = -1;
                        bVar5.f2711s = -1;
                        bVar5.f2712t = -1;
                        return;
                    } else if (i4 == 4) {
                        C0633b bVar6 = aVar.f2633e;
                        bVar6.f2704o = i3;
                        bVar6.f2702n = -1;
                        bVar6.f2710r = -1;
                        bVar6.f2711s = -1;
                        bVar6.f2712t = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + m2439z(i4) + " undefined");
                    }
                case 4:
                    if (i4 == 4) {
                        C0633b bVar7 = aVar.f2633e;
                        bVar7.f2708q = i3;
                        bVar7.f2706p = -1;
                        bVar7.f2710r = -1;
                        bVar7.f2711s = -1;
                        bVar7.f2712t = -1;
                        return;
                    } else if (i4 == 3) {
                        C0633b bVar8 = aVar.f2633e;
                        bVar8.f2706p = i3;
                        bVar8.f2708q = -1;
                        bVar8.f2710r = -1;
                        bVar8.f2711s = -1;
                        bVar8.f2712t = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + m2439z(i4) + " undefined");
                    }
                case 5:
                    if (i4 == 5) {
                        C0633b bVar9 = aVar.f2633e;
                        bVar9.f2710r = i3;
                        bVar9.f2708q = -1;
                        bVar9.f2706p = -1;
                        bVar9.f2702n = -1;
                        bVar9.f2704o = -1;
                        return;
                    } else if (i4 == 3) {
                        C0633b bVar10 = aVar.f2633e;
                        bVar10.f2711s = i3;
                        bVar10.f2708q = -1;
                        bVar10.f2706p = -1;
                        bVar10.f2702n = -1;
                        bVar10.f2704o = -1;
                        return;
                    } else if (i4 == 4) {
                        C0633b bVar11 = aVar.f2633e;
                        bVar11.f2712t = i3;
                        bVar11.f2708q = -1;
                        bVar11.f2706p = -1;
                        bVar11.f2702n = -1;
                        bVar11.f2704o = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + m2439z(i4) + " undefined");
                    }
                case 6:
                    if (i4 == 6) {
                        C0633b bVar12 = aVar.f2633e;
                        bVar12.f2714v = i3;
                        bVar12.f2713u = -1;
                        return;
                    } else if (i4 == 7) {
                        C0633b bVar13 = aVar.f2633e;
                        bVar13.f2713u = i3;
                        bVar13.f2714v = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + m2439z(i4) + " undefined");
                    }
                case 7:
                    if (i4 == 7) {
                        C0633b bVar14 = aVar.f2633e;
                        bVar14.f2716x = i3;
                        bVar14.f2715w = -1;
                        return;
                    } else if (i4 == 6) {
                        C0633b bVar15 = aVar.f2633e;
                        bVar15.f2715w = i3;
                        bVar15.f2716x = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + m2439z(i4) + " undefined");
                    }
                default:
                    throw new IllegalArgumentException(m2439z(i2) + " to " + m2439z(i4) + " unknown");
            }
        }
    }

    /* renamed from: j */
    public void mo2944j(int i, int i2, int i3, int i4, int i5) {
        if (!this.f2628e.containsKey(Integer.valueOf(i))) {
            this.f2628e.put(Integer.valueOf(i), new C0631a());
        }
        C0631a aVar = (C0631a) this.f2628e.get(Integer.valueOf(i));
        if (aVar != null) {
            switch (i2) {
                case 1:
                    if (i4 == 1) {
                        C0633b bVar = aVar.f2633e;
                        bVar.f2694j = i3;
                        bVar.f2696k = -1;
                    } else if (i4 == 2) {
                        C0633b bVar2 = aVar.f2633e;
                        bVar2.f2696k = i3;
                        bVar2.f2694j = -1;
                    } else {
                        throw new IllegalArgumentException("Left to " + m2439z(i4) + " undefined");
                    }
                    aVar.f2633e.f2657H = i5;
                    return;
                case 2:
                    if (i4 == 1) {
                        C0633b bVar3 = aVar.f2633e;
                        bVar3.f2698l = i3;
                        bVar3.f2700m = -1;
                    } else if (i4 == 2) {
                        C0633b bVar4 = aVar.f2633e;
                        bVar4.f2700m = i3;
                        bVar4.f2698l = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + m2439z(i4) + " undefined");
                    }
                    aVar.f2633e.f2658I = i5;
                    return;
                case 3:
                    if (i4 == 3) {
                        C0633b bVar5 = aVar.f2633e;
                        bVar5.f2702n = i3;
                        bVar5.f2704o = -1;
                        bVar5.f2710r = -1;
                        bVar5.f2711s = -1;
                        bVar5.f2712t = -1;
                    } else if (i4 == 4) {
                        C0633b bVar6 = aVar.f2633e;
                        bVar6.f2704o = i3;
                        bVar6.f2702n = -1;
                        bVar6.f2710r = -1;
                        bVar6.f2711s = -1;
                        bVar6.f2712t = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + m2439z(i4) + " undefined");
                    }
                    aVar.f2633e.f2659J = i5;
                    return;
                case 4:
                    if (i4 == 4) {
                        C0633b bVar7 = aVar.f2633e;
                        bVar7.f2708q = i3;
                        bVar7.f2706p = -1;
                        bVar7.f2710r = -1;
                        bVar7.f2711s = -1;
                        bVar7.f2712t = -1;
                    } else if (i4 == 3) {
                        C0633b bVar8 = aVar.f2633e;
                        bVar8.f2706p = i3;
                        bVar8.f2708q = -1;
                        bVar8.f2710r = -1;
                        bVar8.f2711s = -1;
                        bVar8.f2712t = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + m2439z(i4) + " undefined");
                    }
                    aVar.f2633e.f2660K = i5;
                    return;
                case 5:
                    if (i4 == 5) {
                        C0633b bVar9 = aVar.f2633e;
                        bVar9.f2710r = i3;
                        bVar9.f2708q = -1;
                        bVar9.f2706p = -1;
                        bVar9.f2702n = -1;
                        bVar9.f2704o = -1;
                        return;
                    } else if (i4 == 3) {
                        C0633b bVar10 = aVar.f2633e;
                        bVar10.f2711s = i3;
                        bVar10.f2708q = -1;
                        bVar10.f2706p = -1;
                        bVar10.f2702n = -1;
                        bVar10.f2704o = -1;
                        return;
                    } else if (i4 == 4) {
                        C0633b bVar11 = aVar.f2633e;
                        bVar11.f2712t = i3;
                        bVar11.f2708q = -1;
                        bVar11.f2706p = -1;
                        bVar11.f2702n = -1;
                        bVar11.f2704o = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + m2439z(i4) + " undefined");
                    }
                case 6:
                    if (i4 == 6) {
                        C0633b bVar12 = aVar.f2633e;
                        bVar12.f2714v = i3;
                        bVar12.f2713u = -1;
                    } else if (i4 == 7) {
                        C0633b bVar13 = aVar.f2633e;
                        bVar13.f2713u = i3;
                        bVar13.f2714v = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + m2439z(i4) + " undefined");
                    }
                    aVar.f2633e.f2662M = i5;
                    return;
                case 7:
                    if (i4 == 7) {
                        C0633b bVar14 = aVar.f2633e;
                        bVar14.f2716x = i3;
                        bVar14.f2715w = -1;
                    } else if (i4 == 6) {
                        C0633b bVar15 = aVar.f2633e;
                        bVar15.f2715w = i3;
                        bVar15.f2716x = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + m2439z(i4) + " undefined");
                    }
                    aVar.f2633e.f2661L = i5;
                    return;
                default:
                    throw new IllegalArgumentException(m2439z(i2) + " to " + m2439z(i4) + " unknown");
            }
        }
    }

    /* renamed from: k */
    public void mo2945k(int i, int i2, int i3, float f) {
        C0633b bVar = m2432o(i).f2633e;
        bVar.f2651B = i2;
        bVar.f2652C = i3;
        bVar.f2653D = f;
    }

    /* renamed from: l */
    public void mo2946l(int i, boolean z) {
        m2432o(i).f2633e.f2703n0 = z;
    }

    /* renamed from: p */
    public void mo2947p(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0631a n = m2431n(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        n.f2633e.f2676a = true;
                    }
                    this.f2628e.put(Integer.valueOf(n.f2629a), n);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01cb, code lost:
        continue;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2948q(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x01da
            if (r0 == 0) goto L_0x01c8
            r4 = -1
            r5 = 3
            r6 = 2
            r7 = 0
            if (r0 == r6) goto L_0x0067
            if (r0 == r5) goto L_0x0015
            goto L_0x01cb
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r0 = r0.toLowerCase(r8)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            switch(r8) {
                case -2075718416: goto L_0x0045;
                case -190376483: goto L_0x003b;
                case 426575017: goto L_0x0031;
                case 2146106725: goto L_0x0027;
                default: goto L_0x0026;
            }     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0026:
            goto L_0x004e
        L_0x0027:
            java.lang.String r8 = "constraintset"
            boolean r0 = r0.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = r7
            goto L_0x004e
        L_0x0031:
            java.lang.String r7 = "constraintoverride"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = r6
            goto L_0x004e
        L_0x003b:
            java.lang.String r7 = "constraint"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = r3
            goto L_0x004e
        L_0x0045:
            java.lang.String r7 = "guideline"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = r5
        L_0x004e:
            if (r4 == 0) goto L_0x0066
            if (r4 == r3) goto L_0x0058
            if (r4 == r6) goto L_0x0058
            if (r4 == r5) goto L_0x0058
            goto L_0x01cb
        L_0x0058:
            java.util.HashMap r0 = r9.f2628e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r3 = r2.f2629a     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2 = r1
            goto L_0x01cb
        L_0x0066:
            return
        L_0x0067:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            switch(r8) {
                case -2025855158: goto L_0x00d0;
                case -1984451626: goto L_0x00c6;
                case -1962203927: goto L_0x00bc;
                case -1269513683: goto L_0x00b2;
                case -1238332596: goto L_0x00a8;
                case -71750448: goto L_0x009e;
                case 366511058: goto L_0x0093;
                case 1331510167: goto L_0x0089;
                case 1791837707: goto L_0x007e;
                case 1803088381: goto L_0x0074;
                default: goto L_0x0072;
            }     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0072:
            goto L_0x00d9
        L_0x0074:
            java.lang.String r5 = "Constraint"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = r7
            goto L_0x00d9
        L_0x007e:
            java.lang.String r5 = "CustomAttribute"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 8
            goto L_0x00d9
        L_0x0089:
            java.lang.String r6 = "Barrier"
            boolean r0 = r0.equals(r6)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = r5
            goto L_0x00d9
        L_0x0093:
            java.lang.String r5 = "CustomMethod"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 9
            goto L_0x00d9
        L_0x009e:
            java.lang.String r5 = "Guideline"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = r6
            goto L_0x00d9
        L_0x00a8:
            java.lang.String r5 = "Transform"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 5
            goto L_0x00d9
        L_0x00b2:
            java.lang.String r5 = "PropertySet"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 4
            goto L_0x00d9
        L_0x00bc:
            java.lang.String r5 = "ConstraintOverride"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = r3
            goto L_0x00d9
        L_0x00c6:
            java.lang.String r5 = "Motion"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 7
            goto L_0x00d9
        L_0x00d0:
            java.lang.String r5 = "Layout"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 6
        L_0x00d9:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r4) {
                case 0: goto L_0x01be;
                case 1: goto L_0x01b5;
                case 2: goto L_0x01a6;
                case 3: goto L_0x0199;
                case 4: goto L_0x0174;
                case 5: goto L_0x014e;
                case 6: goto L_0x0128;
                case 7: goto L_0x0102;
                case 8: goto L_0x00e0;
                case 9: goto L_0x00e0;
                default: goto L_0x00de;
            }
        L_0x00de:
            goto L_0x01cb
        L_0x00e0:
            if (r2 == 0) goto L_0x00e9
            java.util.HashMap r0 = r2.f2635g     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.C0623a.m2402b(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x00e9:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0102:
            if (r2 == 0) goto L_0x010f
            androidx.constraintlayout.widget.d$c r0 = r2.f2632d     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.mo2961b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x010f:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0128:
            if (r2 == 0) goto L_0x0135
            androidx.constraintlayout.widget.d$b r0 = r2.f2633e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.mo2959b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x0135:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x014e:
            if (r2 == 0) goto L_0x015b
            androidx.constraintlayout.widget.d$e r0 = r2.f2634f     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.mo2965b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x015b:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0174:
            if (r2 == 0) goto L_0x0180
            androidx.constraintlayout.widget.d$d r0 = r2.f2631c     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.mo2963b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x0180:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0199:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.d$a r0 = r9.m2431n(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.d$b r2 = r0.f2633e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f2695j0 = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01a6:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.d$a r0 = r9.m2431n(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.d$b r2 = r0.f2633e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f2676a = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f2678b = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01b5:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.d$a r0 = r9.m2431n(r10, r0, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01be:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.d$a r0 = r9.m2431n(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x01c6:
            r2 = r0
            goto L_0x01cb
        L_0x01c8:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x01cb:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x0006
        L_0x01d1:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x01da
        L_0x01d6:
            r10 = move-exception
            r10.printStackTrace()
        L_0x01da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0630d.mo2948q(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* renamed from: x */
    public void mo2949x(int i, float f) {
        m2432o(i).f2633e.f2717y = f;
    }

    /* renamed from: y */
    public void mo2950y(int i, int i2, int i3) {
        C0631a o = m2432o(i);
        switch (i2) {
            case 1:
                o.f2633e.f2657H = i3;
                return;
            case 2:
                o.f2633e.f2658I = i3;
                return;
            case 3:
                o.f2633e.f2659J = i3;
                return;
            case 4:
                o.f2633e.f2660K = i3;
                return;
            case 5:
                o.f2633e.f2663N = i3;
                return;
            case 6:
                o.f2633e.f2662M = i3;
                return;
            case 7:
                o.f2633e.f2661L = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }
}
