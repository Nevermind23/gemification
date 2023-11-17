package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.core.util.C1004d;
import androidx.core.view.C1055a;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.C1827s;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import p009a8.C0074d;
import p009a8.C0076f;
import p009a8.C0077g;
import p009a8.C0078h;
import p009a8.C0080j;

/* renamed from: com.google.android.material.datepicker.k */
public final class C5010k<S> extends C5038r {

    /* renamed from: o */
    static final Object f15978o = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: p */
    static final Object f15979p = "NAVIGATION_PREV_TAG";

    /* renamed from: q */
    static final Object f15980q = "NAVIGATION_NEXT_TAG";

    /* renamed from: r */
    static final Object f15981r = "SELECTOR_TOGGLE_TAG";

    /* renamed from: e */
    private int f15982e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public DateSelector f15983f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public CalendarConstraints f15984g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Month f15985h;

    /* renamed from: i */
    private C5021k f15986i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C5001b f15987j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public RecyclerView f15988k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public RecyclerView f15989l;

    /* renamed from: m */
    private View f15990m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public View f15991n;

    /* renamed from: com.google.android.material.datepicker.k$a */
    class C5011a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ int f15992d;

        C5011a(int i) {
            this.f15992d = i;
        }

        public void run() {
            C5010k.this.f15989l.mo5263G1(this.f15992d);
        }
    }

    /* renamed from: com.google.android.material.datepicker.k$b */
    class C5012b extends C1055a {
        C5012b() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.mo3595a0((Object) null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.k$c */
    class C5013c extends C5039s {

        /* renamed from: L */
        final /* synthetic */ int f15995L;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5013c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f15995L = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a2 */
        public void mo5210a2(RecyclerView.C1726b0 b0Var, int[] iArr) {
            if (this.f15995L == 0) {
                iArr[0] = C5010k.this.f15989l.getWidth();
                iArr[1] = C5010k.this.f15989l.getWidth();
                return;
            }
            iArr[0] = C5010k.this.f15989l.getHeight();
            iArr[1] = C5010k.this.f15989l.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.k$d */
    class C5014d implements C5022l {
        C5014d() {
        }

        /* renamed from: a */
        public void mo16263a(long j) {
            if (C5010k.this.f15984g.mo16138h().mo16149c(j)) {
                C5010k.this.f15983f.mo16169B1(j);
                Iterator it = C5010k.this.f16076d.iterator();
                while (it.hasNext()) {
                    ((C5037q) it.next()).mo16273b(C5010k.this.f15983f.mo16178s1());
                }
                C5010k.this.f15989l.getAdapter().notifyDataSetChanged();
                if (C5010k.this.f15988k != null) {
                    C5010k.this.f15988k.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.k$e */
    class C5015e extends RecyclerView.C1746o {

        /* renamed from: a */
        private final Calendar f15998a = C5045x.m19625q();

        /* renamed from: b */
        private final Calendar f15999b = C5045x.m19625q();

        C5015e() {
        }

        /* renamed from: g */
        public void mo5617g(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
            int i;
            int i2;
            if ((recyclerView.getAdapter() instanceof C5046y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C5046y yVar = (C5046y) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C1004d dVar : C5010k.this.f15983f.mo16171M0()) {
                    Object obj = dVar.f3642a;
                    if (!(obj == null || dVar.f3643b == null)) {
                        this.f15998a.setTimeInMillis(((Long) obj).longValue());
                        this.f15999b.setTimeInMillis(((Long) dVar.f3643b).longValue());
                        int h = yVar.mo16306h(this.f15998a.get(1));
                        int h2 = yVar.mo16306h(this.f15999b.get(1));
                        View O = gridLayoutManager.mo5199O(h);
                        View O2 = gridLayoutManager.mo5199O(h2);
                        int m3 = h / gridLayoutManager.mo5173m3();
                        int m32 = h2 / gridLayoutManager.mo5173m3();
                        for (int i3 = m3; i3 <= m32; i3++) {
                            View O3 = gridLayoutManager.mo5199O(gridLayoutManager.mo5173m3() * i3);
                            if (O3 != null) {
                                int top = O3.getTop() + C5010k.this.f15987j.f15958d.mo16241c();
                                int bottom = O3.getBottom() - C5010k.this.f15987j.f15958d.mo16240b();
                                if (i3 == m3) {
                                    i = O.getLeft() + (O.getWidth() / 2);
                                } else {
                                    i = 0;
                                }
                                if (i3 == m32) {
                                    i2 = O2.getLeft() + (O2.getWidth() / 2);
                                } else {
                                    i2 = recyclerView.getWidth();
                                }
                                canvas.drawRect((float) i, (float) top, (float) i2, (float) bottom, C5010k.this.f15987j.f15962h);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.k$f */
    class C5016f extends C1055a {
        C5016f() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            String str;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (C5010k.this.f15991n.getVisibility() == 0) {
                str = C5010k.this.getString(C0080j.f326L);
            } else {
                str = C5010k.this.getString(C0080j.f324J);
            }
            accessibilityNodeInfoCompat.mo3611j0(str);
        }
    }

    /* renamed from: com.google.android.material.datepicker.k$g */
    class C5017g extends RecyclerView.C1756u {

        /* renamed from: a */
        final /* synthetic */ C5034p f16002a;

        /* renamed from: b */
        final /* synthetic */ MaterialButton f16003b;

        C5017g(C5034p pVar, MaterialButton materialButton) {
            this.f16002a = pVar;
            this.f16003b = materialButton;
        }

        /* renamed from: d */
        public void mo5739d(RecyclerView recyclerView, int i) {
            if (i == 0) {
                recyclerView.announceForAccessibility(this.f16003b.getText());
            }
        }

        /* renamed from: e */
        public void mo5740e(RecyclerView recyclerView, int i, int i2) {
            int i3;
            if (i < 0) {
                i3 = C5010k.this.mo16261z1().mo5219n2();
            } else {
                i3 = C5010k.this.mo16261z1().mo5223q2();
            }
            Month unused = C5010k.this.f15985h = this.f16002a.mo16297g(i3);
            this.f16003b.setText(this.f16002a.mo16298h(i3));
        }
    }

    /* renamed from: com.google.android.material.datepicker.k$h */
    class C5018h implements View.OnClickListener {
        C5018h() {
        }

        public void onClick(View view) {
            C5010k.this.mo16255E1();
        }
    }

    /* renamed from: com.google.android.material.datepicker.k$i */
    class C5019i implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ C5034p f16006d;

        C5019i(C5034p pVar) {
            this.f16006d = pVar;
        }

        public void onClick(View view) {
            int n2 = C5010k.this.mo16261z1().mo5219n2() + 1;
            if (n2 < C5010k.this.f15989l.getAdapter().getItemCount()) {
                C5010k.this.mo16253C1(this.f16006d.mo16297g(n2));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.k$j */
    class C5020j implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ C5034p f16008d;

        C5020j(C5034p pVar) {
            this.f16008d = pVar;
        }

        public void onClick(View view) {
            int q2 = C5010k.this.mo16261z1().mo5223q2() - 1;
            if (q2 >= 0) {
                C5010k.this.mo16253C1(this.f16008d.mo16297g(q2));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.k$k */
    enum C5021k {
        DAY,
        YEAR
    }

    /* renamed from: com.google.android.material.datepicker.k$l */
    interface C5022l {
        /* renamed from: a */
        void mo16263a(long j);
    }

    /* renamed from: A1 */
    public static C5010k m19509A1(DateSelector dateSelector, int i, CalendarConstraints calendarConstraints) {
        C5010k kVar = new C5010k();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.mo16143l());
        kVar.setArguments(bundle);
        return kVar;
    }

    /* renamed from: B1 */
    private void m19510B1(int i) {
        this.f15989l.post(new C5011a(i));
    }

    /* renamed from: q1 */
    private void m19518q1(View view, C5034p pVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C0076f.f282t);
        materialButton.setTag(f15981r);
        ViewCompat.m3619r0(materialButton, new C5016f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C0076f.f284v);
        materialButton2.setTag(f15979p);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(C0076f.f283u);
        materialButton3.setTag(f15980q);
        this.f15990m = view.findViewById(C0076f.f243D);
        this.f15991n = view.findViewById(C0076f.f287y);
        mo16254D1(C5021k.DAY);
        materialButton.setText(this.f15985h.mo16213l());
        this.f15989l.mo5363n(new C5017g(pVar, materialButton));
        materialButton.setOnClickListener(new C5018h());
        materialButton3.setOnClickListener(new C5019i(pVar));
        materialButton2.setOnClickListener(new C5020j(pVar));
    }

    /* renamed from: r1 */
    private RecyclerView.C1746o m19519r1() {
        return new C5015e();
    }

    /* renamed from: x1 */
    static int m19520x1(Context context) {
        return context.getResources().getDimensionPixelSize(C0074d.f185P);
    }

    /* renamed from: y1 */
    private static int m19521y1(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0074d.f193X) + resources.getDimensionPixelOffset(C0074d.f194Y) + resources.getDimensionPixelOffset(C0074d.f192W);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C0074d.f187R);
        int i = C5033o.f16061i;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(C0074d.f185P) * i) + ((i - 1) * resources.getDimensionPixelOffset(C0074d.f191V)) + resources.getDimensionPixelOffset(C0074d.f183N);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C1 */
    public void mo16253C1(Month month) {
        boolean z;
        C5034p pVar = (C5034p) this.f15989l.getAdapter();
        int i = pVar.mo16299i(month);
        int i2 = i - pVar.mo16299i(this.f15985h);
        boolean z2 = true;
        if (Math.abs(i2) > 3) {
            z = true;
        } else {
            z = false;
        }
        if (i2 <= 0) {
            z2 = false;
        }
        this.f15985h = month;
        if (z && z2) {
            this.f15989l.mo5425x1(i - 3);
            m19510B1(i);
        } else if (z) {
            this.f15989l.mo5425x1(i + 3);
            m19510B1(i);
        } else {
            m19510B1(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D1 */
    public void mo16254D1(C5021k kVar) {
        this.f15986i = kVar;
        if (kVar == C5021k.YEAR) {
            this.f15988k.getLayoutManager().mo5197J1(((C5046y) this.f15988k.getAdapter()).mo16306h(this.f15985h.f15927f));
            this.f15990m.setVisibility(0);
            this.f15991n.setVisibility(8);
        } else if (kVar == C5021k.DAY) {
            this.f15990m.setVisibility(8);
            this.f15991n.setVisibility(0);
            mo16253C1(this.f15985h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E1 */
    public void mo16255E1() {
        C5021k kVar = this.f15986i;
        C5021k kVar2 = C5021k.YEAR;
        if (kVar == kVar2) {
            mo16254D1(C5021k.DAY);
        } else if (kVar == C5021k.DAY) {
            mo16254D1(kVar2);
        }
    }

    /* renamed from: h1 */
    public boolean mo16256h1(C5037q qVar) {
        return super.mo16256h1(qVar);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f15982e = bundle.getInt("THEME_RES_ID_KEY");
        this.f15983f = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f15984g = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f15985h = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        C5009j jVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f15982e);
        this.f15987j = new C5001b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month m = this.f15984g.mo16144m();
        if (C5023l.m19551R1(contextThemeWrapper)) {
            i2 = C0078h.f308s;
            i = 1;
        } else {
            i2 = C0078h.f306q;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        inflate.setMinimumHeight(m19521y1(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(C0076f.f288z);
        ViewCompat.m3619r0(gridView, new C5012b());
        int j = this.f15984g.mo16141j();
        if (j <= 0) {
            jVar = new C5009j();
        }
        gridView.setAdapter(jVar);
        gridView.setNumColumns(m.f15928g);
        gridView.setEnabled(false);
        this.f15989l = (RecyclerView) inflate.findViewById(C0076f.f242C);
        this.f15989l.setLayoutManager(new C5013c(getContext(), i, false, i));
        this.f15989l.setTag(f15978o);
        C5034p pVar = new C5034p(contextThemeWrapper, this.f15983f, this.f15984g, new C5014d());
        this.f15989l.setAdapter(pVar);
        int integer = contextThemeWrapper.getResources().getInteger(C0077g.f290c);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0076f.f243D);
        this.f15988k = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f15988k.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f15988k.setAdapter(new C5046y(this));
            this.f15988k.mo5351j(m19519r1());
        }
        if (inflate.findViewById(C0076f.f282t) != null) {
            m19518q1(inflate, pVar);
        }
        if (!C5023l.m19551R1(contextThemeWrapper)) {
            new C1827s().mo6073b(this.f15989l);
        }
        this.f15989l.mo5425x1(pVar.mo16299i(this.f15985h));
        return inflate;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f15982e);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f15983f);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f15984g);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f15985h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s1 */
    public CalendarConstraints mo16257s1() {
        return this.f15984g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t1 */
    public C5001b mo16258t1() {
        return this.f15987j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u1 */
    public Month mo16259u1() {
        return this.f15985h;
    }

    /* renamed from: v1 */
    public DateSelector mo16260v1() {
        return this.f15983f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z1 */
    public LinearLayoutManager mo16261z1() {
        return (LinearLayoutManager) this.f15989l.getLayoutManager();
    }
}
