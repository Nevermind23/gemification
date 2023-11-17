package p341ge.bog.designsystem.components.chips;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.core.view.C1152f3;
import com.google.android.flexbox.FlexboxLayout;
import he1.C41217g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.chips.Chip;
import p601sg.C17779d;
import p601sg.C17787l;
import ue1.C43064a;
import ue1.C43079p;

/* renamed from: ge.bog.designsystem.components.chips.ChipGroup */
public final class ChipGroup extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f39055d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C43079p f39056e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C13230a f39057f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C13231b f39058g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f39059h;

    /* renamed from: i */
    private final C41217g f39060i;

    /* renamed from: j */
    private final C41217g f39061j;

    /* renamed from: k */
    private final C41217g f39062k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ViewGroup f39063l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f39064m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ArrayList f39065n;

    /* renamed from: o */
    private final C13235f f39066o;

    /* renamed from: ge.bog.designsystem.components.chips.ChipGroup$a */
    public interface C13230a {
        /* renamed from: a */
        void mo26511a(Chip chip, int i);
    }

    /* renamed from: ge.bog.designsystem.components.chips.ChipGroup$b */
    public interface C13231b {
        /* renamed from: a */
        void mo35193a(int i);
    }

    /* renamed from: ge.bog.designsystem.components.chips.ChipGroup$c */
    static final class C13232c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Context f39067d;

        /* renamed from: e */
        final /* synthetic */ ChipGroup f39068e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13232c(Context context, ChipGroup chipGroup) {
            super(0);
            this.f39067d = context;
            this.f39068e = chipGroup;
        }

        /* renamed from: b */
        public final FlexboxLayout invoke() {
            FlexboxLayout flexboxLayout = new FlexboxLayout(this.f39067d);
            ChipGroup chipGroup = this.f39068e;
            flexboxLayout.setLayoutParams(new FlexboxLayout.LayoutParams(-1, -2));
            flexboxLayout.setFlexWrap(1);
            if (chipGroup.f39059h) {
                flexboxLayout.setJustifyContent(2);
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
            shapeDrawable.setIntrinsicWidth(0);
            shapeDrawable.setIntrinsicHeight(flexboxLayout.getResources().getDimensionPixelSize(C17779d.f49645S1));
            shapeDrawable.getPaint().setColor(0);
            flexboxLayout.setDividerDrawableHorizontal(shapeDrawable);
            flexboxLayout.setShowDivider(2);
            return flexboxLayout;
        }
    }

    /* renamed from: ge.bog.designsystem.components.chips.ChipGroup$d */
    static final class C13233d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Context f39069d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13233d(Context context) {
            super(0);
            this.f39069d = context;
        }

        /* renamed from: b */
        public final LinearLayout invoke() {
            LinearLayout linearLayout = new LinearLayout(this.f39069d);
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            return linearLayout;
        }
    }

    /* renamed from: ge.bog.designsystem.components.chips.ChipGroup$e */
    static final class C13234e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Context f39070d;

        /* renamed from: e */
        final /* synthetic */ ChipGroup f39071e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13234e(Context context, ChipGroup chipGroup) {
            super(0);
            this.f39070d = context;
            this.f39071e = chipGroup;
        }

        /* renamed from: b */
        public final HorizontalScrollView invoke() {
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this.f39070d);
            ChipGroup chipGroup = this.f39071e;
            horizontalScrollView.setClipToPadding(false);
            horizontalScrollView.setHorizontalScrollBarEnabled(false);
            horizontalScrollView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            horizontalScrollView.addView(chipGroup.getChipLinearContainer());
            return horizontalScrollView;
        }
    }

    /* renamed from: ge.bog.designsystem.components.chips.ChipGroup$f */
    public static final class C13235f implements Chip.C13228a {

        /* renamed from: a */
        final /* synthetic */ ChipGroup f39072a;

        C13235f(ChipGroup chipGroup) {
            this.f39072a = chipGroup;
        }

        /* renamed from: a */
        public void mo35173a(Chip chip) {
            C41536l.m120489i(chip, "chip");
            this.f39072a.m49765x(chip);
            if (!this.f39072a.f39055d) {
                if (chip.getId() != this.f39072a.f39064m) {
                    chip.setActivated(true);
                    C43079p g = this.f39072a.f39056e;
                    if (g != null) {
                        g.invoke(chip, Integer.valueOf(this.f39072a.f39063l.indexOfChild(chip)));
                    }
                    ChipGroup chipGroup = this.f39072a;
                    chipGroup.mo35184p(chipGroup.f39064m);
                    this.f39072a.f39064m = chip.getId();
                }
            } else if (!this.f39072a.f39065n.contains(Integer.valueOf(this.f39072a.f39063l.indexOfChild(chip)))) {
                chip.setActivated(true);
                C43079p g2 = this.f39072a.f39056e;
                if (g2 != null) {
                    g2.invoke(chip, Integer.valueOf(this.f39072a.f39063l.indexOfChild(chip)));
                }
                this.f39072a.f39065n.add(Integer.valueOf(this.f39072a.f39063l.indexOfChild(chip)));
                List<Integer> activatedChipsIndex = this.f39072a.getActivatedChipsIndex();
                Log.d("++++++", "onChipActivated: " + activatedChipsIndex);
            } else {
                chip.setActivated(false);
                ChipGroup chipGroup2 = this.f39072a;
                chipGroup2.m49764w(chipGroup2.f39063l.indexOfChild(chip));
            }
            C13230a h = this.f39072a.f39057f;
            if (h != null) {
                h.mo26511a(chip, this.f39072a.f39063l.indexOfChild(chip));
            }
        }

        /* renamed from: b */
        public void mo35174b(Chip chip) {
            boolean z;
            C41536l.m120489i(chip, "chip");
            Iterator it = C40355o.m116850A(C1152f3.m4215b(this.f39072a.f39063l)).iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((View) it.next()).getId() == chip.getId()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                this.f39072a.mo35191u(i);
                C13231b i2 = this.f39072a.f39058g;
                if (i2 != null) {
                    i2.mo35193a(i);
                }
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    private final FlexboxLayout getChipFlexContainer() {
        return (FlexboxLayout) this.f39060i.getValue();
    }

    /* access modifiers changed from: private */
    public final LinearLayout getChipLinearContainer() {
        return (LinearLayout) this.f39061j.getValue();
    }

    private final HorizontalScrollView getHorizontalScrollContainer() {
        return (HorizontalScrollView) this.f39062k.getValue();
    }

    /* renamed from: n */
    public static /* synthetic */ void m49760n(ChipGroup chipGroup, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        chipGroup.mo35182m(i, z);
    }

    /* renamed from: r */
    private final int m49761r(Chip chip) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(C17779d.f49644Q1);
        if (!(chip.getWidth() == 0 || chip.getHeight() == 0)) {
            int scrollX = getHorizontalScrollContainer().getScrollX();
            int scrollX2 = getHorizontalScrollContainer().getScrollX() + getWidth();
            if (chip.getLeft() >= scrollX && chip.getRight() <= scrollX2) {
                return 0;
            }
            if (chip.getLeft() > scrollX2) {
                return (chip.getRight() - scrollX2) + dimensionPixelSize;
            }
            if (chip.getRight() > scrollX2) {
                return (chip.getRight() - scrollX2) + dimensionPixelSize;
            }
            if (chip.getRight() < scrollX) {
                return (chip.getLeft() - scrollX) - dimensionPixelSize;
            }
            if (chip.getLeft() < scrollX) {
                return (chip.getLeft() - scrollX) - dimensionPixelSize;
            }
        }
        return 0;
    }

    /* renamed from: s */
    private final boolean m49762s(View view) {
        return (view instanceof FlexboxLayout) || (view instanceof HorizontalScrollView);
    }

    /* renamed from: v */
    private final void m49763v(int i) {
        this.f39065n.remove(Integer.valueOf(i));
        int size = this.f39065n.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = this.f39065n.get(i2);
            C41536l.m120488h(obj, "activatedChips[i]");
            if (((Number) obj).intValue() > i) {
                ArrayList arrayList = this.f39065n;
                arrayList.set(i2, Integer.valueOf(((Integer) arrayList.get(i2)).intValue() - 1));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final void m49764w(int i) {
        this.f39065n.remove(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public final void m49765x(Chip chip) {
        if (this.f39063l instanceof LinearLayout) {
            getHorizontalScrollContainer().smoothScrollBy(m49761r(chip), 0);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C41536l.m120489i(view, "child");
        mo35183o(view);
        if (getChildCount() == 0 && m49762s(view)) {
            super.addView(view, i, layoutParams);
        }
    }

    public final int getActivatedChipId() {
        return this.f39064m;
    }

    public final List<Integer> getActivatedChipsIndex() {
        if (this.f39055d) {
            return this.f39065n;
        }
        return C41341q.m119907j();
    }

    public final int getChipCount() {
        return this.f39063l.getChildCount();
    }

    /* renamed from: m */
    public final void mo35182m(int i, boolean z) {
        View childAt = this.f39063l.getChildAt(i);
        if (!z || !(childAt instanceof Chip)) {
            if (childAt != null) {
                childAt.setActivated(true);
            }
            if (!this.f39055d) {
                this.f39064m = childAt.getId();
            } else if (!this.f39065n.contains(Integer.valueOf(this.f39063l.indexOfChild(childAt)))) {
                this.f39065n.add(Integer.valueOf(this.f39063l.indexOfChild(childAt)));
            }
        } else {
            this.f39066o.mo35173a((Chip) childAt);
        }
    }

    /* renamed from: o */
    public final void mo35183o(View view) {
        C41536l.m120489i(view, "chip");
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.getId() == -1) {
                chip.setId(View.generateViewId());
            }
            chip.setEventListener$design_system_release(this.f39066o);
            this.f39063l.addView(view);
            if (!chip.isActivated()) {
                return;
            }
            if (!this.f39055d) {
                this.f39064m = chip.getId();
                C43079p pVar = this.f39056e;
                if (pVar != null) {
                    pVar.invoke(view, Integer.valueOf(this.f39063l.indexOfChild(view)));
                }
            } else if (!this.f39065n.contains(Integer.valueOf(this.f39063l.indexOfChild(view)))) {
                this.f39065n.add(Integer.valueOf(this.f39063l.indexOfChild(view)));
            }
        }
    }

    /* renamed from: p */
    public final void mo35184p(int i) {
        Object obj;
        boolean z;
        Iterator it = C1152f3.m4215b(this.f39063l).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((View) obj).getId() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        View view = (View) obj;
        if (view != null) {
            view.setActivated(false);
        }
    }

    /* renamed from: q */
    public final void mo35185q(int i, boolean z) {
        View childAt = this.f39063l.getChildAt(i);
        if (childAt != null) {
            childAt.setActivated(false);
        }
        if (z && (childAt instanceof Chip)) {
            this.f39066o.mo35173a((Chip) childAt);
        } else if (this.f39055d) {
            m49764w(i);
        } else {
            this.f39064m = -1;
        }
    }

    public void setEnabled(boolean z) {
        float f;
        super.setEnabled(z);
        if (z) {
            f = 1.0f;
        } else {
            f = 0.6f;
        }
        setAlpha(f);
        for (View clickable : C1152f3.m4215b(this.f39063l)) {
            clickable.setClickable(z);
        }
    }

    public final void setOnChipActivatedChangedListener(C13230a aVar) {
        this.f39057f = aVar;
    }

    public final void setOnChipActivatedListener(C43079p pVar) {
        C41536l.m120489i(pVar, "onChipActivated");
        this.f39056e = pVar;
    }

    public final void setOnChipRemovedListener(C13231b bVar) {
        C41536l.m120489i(bVar, "onChipRemovedListener");
        this.f39058g = bVar;
    }

    /* renamed from: t */
    public final void mo35190t() {
        this.f39063l.removeAllViews();
        this.f39065n.clear();
        this.f39064m = -1;
    }

    /* renamed from: u */
    public final void mo35191u(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f39063l.getChildCount()) {
            z = true;
        }
        if (z) {
            this.f39063l.removeViewAt(i);
            m49763v(i);
        }
    }

    /* renamed from: y */
    public final void mo35192y(int i) {
        View childAt = this.f39063l.getChildAt(i);
        if (childAt != null) {
            m49765x((Chip) childAt);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChipGroup(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup viewGroup;
        C41536l.m120489i(context, "context");
        this.f39060i = C41219i.m119470b(new C13232c(context, this));
        this.f39061j = C41219i.m119470b(new C13233d(context));
        this.f39062k = C41219i.m119470b(new C13234e(context, this));
        setClipToPadding(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17787l.f50083Q2);
        C41536l.m120488h(obtainStyledAttributes, "context.obtainStyledAttr…s, R.styleable.ChipGroup)");
        boolean z = obtainStyledAttributes.getBoolean(C17787l.f50128T2, true);
        this.f39059h = obtainStyledAttributes.getBoolean(C17787l.f50098R2, false);
        if (z) {
            addView(getHorizontalScrollContainer());
            viewGroup = getChipLinearContainer();
        } else {
            addView(getChipFlexContainer());
            viewGroup = getChipFlexContainer();
        }
        this.f39063l = viewGroup;
        this.f39055d = obtainStyledAttributes.getBoolean(C17787l.f50113S2, false);
        obtainStyledAttributes.recycle();
        this.f39064m = -1;
        this.f39065n = new ArrayList();
        this.f39066o = new C13235f(this);
    }

    public void addView(View view) {
        C41536l.m120489i(view, "child");
        mo35183o(view);
        if (getChildCount() == 0 && m49762s(view)) {
            super.addView(view);
        }
    }

    public void addView(View view, int i) {
        C41536l.m120489i(view, "child");
        mo35183o(view);
        if (getChildCount() == 0 && m49762s(view)) {
            super.addView(view, i);
        }
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        C41536l.m120489i(view, "child");
        mo35183o(view);
        if (getChildCount() == 0 && m49762s(view)) {
            super.addView(view, layoutParams);
        }
    }
}
