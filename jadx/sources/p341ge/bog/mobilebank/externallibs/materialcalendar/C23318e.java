package p341ge.bog.mobilebank.externallibs.materialcalendar;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import ge0.C24707e;
import ge0.C24710h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p342j$.time.DayOfWeek;
import p342j$.time.LocalDate;
import p342j$.time.temporal.WeekFields;

/* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.e */
abstract class C23318e extends ViewGroup implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: d */
    private final ArrayList f61015d = new ArrayList();

    /* renamed from: e */
    private final ArrayList f61016e = new ArrayList();

    /* renamed from: f */
    private final DayOfWeek f61017f;

    /* renamed from: g */
    protected int f61018g = 4;

    /* renamed from: h */
    private MaterialCalendarView f61019h;

    /* renamed from: i */
    private CalendarDay f61020i;

    /* renamed from: j */
    private CalendarDay f61021j = null;

    /* renamed from: k */
    private CalendarDay f61022k = null;

    /* renamed from: l */
    protected boolean f61023l;

    /* renamed from: m */
    private final Collection f61024m;

    /* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.e$a */
    protected static class C23319a extends ViewGroup.MarginLayoutParams {
        public C23319a() {
            super(-2, -2);
        }
    }

    public C23318e(MaterialCalendarView materialCalendarView, CalendarDay calendarDay, DayOfWeek dayOfWeek, boolean z) {
        super(materialCalendarView.getContext());
        ArrayList arrayList = new ArrayList();
        this.f61024m = arrayList;
        this.f61019h = materialCalendarView;
        this.f61020i = calendarDay;
        this.f61017f = dayOfWeek;
        this.f61023l = z;
        setClipChildren(false);
        setClipToPadding(false);
        if (z) {
            m75372c(mo59030k());
        }
        mo59018b(arrayList, mo59030k());
    }

    /* renamed from: c */
    private void m75372c(LocalDate localDate) {
        for (int i = 0; i < 7; i++) {
            C23331n nVar = new C23331n(getContext(), localDate.getDayOfWeek());
            nVar.setImportantForAccessibility(2);
            this.f61015d.add(nVar);
            addView(nVar);
            localDate = localDate.plusDays(1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo59017a(Collection collection, LocalDate localDate) {
        C23321g gVar = new C23321g(getContext(), CalendarDay.m75254b(localDate));
        gVar.setOnClickListener(this);
        gVar.setOnLongClickListener(this);
        collection.add(gVar);
        addView(gVar, new C23319a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo59018b(Collection collection, LocalDate localDate);

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C23319a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C23319a generateDefaultLayoutParams() {
        return new C23319a();
    }

    /* renamed from: e */
    public C23319a generateLayoutParams(AttributeSet attributeSet) {
        return new C23319a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public DayOfWeek mo59022f() {
        return this.f61017f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public CalendarDay mo59023g() {
        return this.f61020i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract int mo59027h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo59028i() {
        C23322h hVar = new C23322h();
        for (C23321g gVar : this.f61024m) {
            hVar.mo59074h();
            Iterator it = this.f61016e.iterator();
            while (it.hasNext()) {
                C23324i iVar = (C23324i) it.next();
                if (iVar.f61045a.mo49008a(gVar.mo59056g())) {
                    iVar.f61046b.mo59068b(hVar);
                }
            }
            gVar.mo59054a(hVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract boolean mo59029j(CalendarDay calendarDay);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public LocalDate mo59030k() {
        boolean z = true;
        LocalDate with = mo59023g().mo58860d().mo24930a(WeekFields.m34452of(this.f61017f, 1).dayOfWeek(), 1);
        int value = mo59022f().getValue() - with.getDayOfWeek().getValue();
        if (!MaterialCalendarView.m75269M(this.f61018g) ? value <= 0 : value < 0) {
            z = false;
        }
        if (z) {
            value -= 7;
        }
        return with.plusDays((long) value);
    }

    /* renamed from: l */
    public void mo59031l(int i) {
        for (C23321g textAppearance : this.f61024m) {
            textAppearance.setTextAppearance(getContext(), i);
        }
    }

    /* renamed from: m */
    public void mo59032m(C24707e eVar) {
        for (C23321g l : this.f61024m) {
            l.mo59060l(eVar);
        }
    }

    /* renamed from: n */
    public void mo59033n(C24707e eVar) {
        for (C23321g m : this.f61024m) {
            m.mo59061m(eVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo59034o(List list) {
        this.f61016e.clear();
        if (list != null) {
            this.f61016e.addAll(list);
        }
        mo59028i();
    }

    public void onClick(View view) {
        if (view instanceof C23321g) {
            this.f61019h.mo58879D((C23321g) view);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C23318e.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C23318e.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int childCount = getChildCount();
        int i5 = width;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (C23325j.m75425a()) {
                int i9 = i5 - measuredWidth;
                childAt.layout(i9, i7, i5, i7 + measuredHeight);
                i5 = i9;
            } else {
                int i12 = measuredWidth + i6;
                childAt.layout(i6, i7, i12, i7 + measuredHeight);
                i6 = i12;
            }
            if (i8 % 7 == 6) {
                i7 += measuredHeight;
                i5 = width;
                i6 = 0;
            }
        }
    }

    public boolean onLongClick(View view) {
        if (!(view instanceof C23321g)) {
            return false;
        }
        this.f61019h.mo58880E((C23321g) view);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) == 0 || mode == 0) {
            throw new IllegalStateException("CalendarPagerView should never be left to decide it's size");
        }
        int i3 = size / 7;
        int h = size2 / mo59027h();
        setMeasuredDimension(size, size2);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            getChildAt(i4).measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(h, 1073741824));
        }
    }

    /* renamed from: p */
    public void mo59041p(CalendarDay calendarDay) {
        this.f61022k = calendarDay;
        mo59050x();
    }

    /* renamed from: q */
    public void mo59042q(CalendarDay calendarDay) {
        this.f61021j = calendarDay;
        mo59050x();
    }

    /* renamed from: r */
    public void mo59043r(Collection collection) {
        boolean z;
        for (C23321g gVar : this.f61024m) {
            CalendarDay g = gVar.mo59056g();
            if (collection == null || !collection.contains(g)) {
                z = false;
            } else {
                z = true;
            }
            gVar.setChecked(z);
        }
        postInvalidate();
    }

    /* renamed from: s */
    public void mo59044s(int i) {
        for (C23321g o : this.f61024m) {
            o.mo59062o(i);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public void mo59046t(boolean z) {
        C23318e eVar;
        for (C23321g gVar : this.f61024m) {
            if (z) {
                eVar = this;
            } else {
                eVar = null;
            }
            gVar.setOnClickListener(eVar);
            gVar.setClickable(z);
        }
    }

    /* renamed from: u */
    public void mo59047u(int i) {
        this.f61018g = i;
        mo59050x();
    }

    /* renamed from: v */
    public void mo59048v(C24710h hVar) {
        Iterator it = this.f61015d.iterator();
        while (it.hasNext()) {
            ((C23331n) it.next()).mo59087g(hVar);
        }
    }

    /* renamed from: w */
    public void mo59049w(int i) {
        Iterator it = this.f61015d.iterator();
        while (it.hasNext()) {
            ((C23331n) it.next()).setTextAppearance(getContext(), i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo59050x() {
        for (C23321g gVar : this.f61024m) {
            CalendarDay g = gVar.mo59056g();
            gVar.mo59066q(this.f61018g, g.mo58869k(this.f61021j, this.f61022k), mo59029j(g));
        }
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C23319a();
    }
}
