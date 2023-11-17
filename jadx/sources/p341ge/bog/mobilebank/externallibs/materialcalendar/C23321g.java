package p341ge.bog.mobilebank.externallibs.materialcalendar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.appcompat.widget.C0425f;
import ge0.C24707e;
import java.util.List;
import p341ge.bog.mobilebank.externallibs.materialcalendar.C23322h;

/* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.g */
class C23321g extends C0425f {

    /* renamed from: h */
    private CalendarDay f61025h;

    /* renamed from: i */
    private int f61026i = -7829368;

    /* renamed from: j */
    private final int f61027j;

    /* renamed from: k */
    private Drawable f61028k = null;

    /* renamed from: l */
    private Drawable f61029l;

    /* renamed from: m */
    private Drawable f61030m;

    /* renamed from: n */
    private C24707e f61031n;

    /* renamed from: o */
    private C24707e f61032o;

    /* renamed from: p */
    private boolean f61033p;

    /* renamed from: q */
    private boolean f61034q;

    /* renamed from: r */
    private boolean f61035r;

    /* renamed from: s */
    private int f61036s;

    /* renamed from: t */
    private final Rect f61037t;

    /* renamed from: u */
    private final Rect f61038u;

    public C23321g(Context context, CalendarDay calendarDay) {
        super(context);
        C24707e eVar = C24707e.f63598a;
        this.f61031n = eVar;
        this.f61032o = eVar;
        this.f61033p = true;
        this.f61034q = true;
        this.f61035r = false;
        this.f61036s = 4;
        this.f61037t = new Rect();
        this.f61038u = new Rect();
        this.f61027j = getResources().getInteger(17694720);
        mo59062o(this.f61026i);
        setGravity(17);
        setTextAlignment(4);
        mo59059k(calendarDay);
    }

    /* renamed from: b */
    private void m75397b(int i, int i2) {
        int min = Math.min(i2, i);
        int abs = Math.abs(i2 - i) / 2;
        if (i >= i2) {
            this.f61037t.set(abs, 0, min + abs, i2);
            this.f61038u.set(abs, 0, min + abs, i2);
            return;
        }
        this.f61037t.set(0, abs, i, min + abs);
        this.f61038u.set(0, abs, i, min + abs);
    }

    /* renamed from: c */
    private static Drawable m75398c(int i, int i2, Rect rect) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.setExitFadeDuration(i2);
        stateListDrawable.addState(new int[]{16842912}, m75399d(i));
        stateListDrawable.addState(new int[]{16842919}, m75400e(i, rect));
        stateListDrawable.addState(new int[0], m75399d(0));
        return stateListDrawable;
    }

    /* renamed from: d */
    private static Drawable m75399d(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i);
        return shapeDrawable;
    }

    /* renamed from: e */
    private static Drawable m75400e(int i, Rect rect) {
        return new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, m75399d(-1));
    }

    /* renamed from: i */
    private void m75401i() {
        Drawable drawable = this.f61029l;
        if (drawable != null) {
            setBackgroundDrawable(drawable);
            return;
        }
        Drawable c = m75398c(this.f61026i, this.f61027j, this.f61038u);
        this.f61030m = c;
        setBackgroundDrawable(c);
    }

    /* renamed from: n */
    private void m75402n() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = 0;
        if (!this.f61034q || !this.f61033p || this.f61035r) {
            z = false;
        } else {
            z = true;
        }
        if (!this.f61033p || this.f61035r) {
            z2 = false;
        } else {
            z2 = true;
        }
        super.setEnabled(z2);
        boolean M = MaterialCalendarView.m75269M(this.f61036s);
        if (MaterialCalendarView.m75270N(this.f61036s) || M) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean L = MaterialCalendarView.m75268L(this.f61036s);
        boolean z5 = this.f61034q;
        if (!z5 && M) {
            z = true;
        }
        boolean z6 = this.f61033p;
        if (!z6 && z3) {
            z |= z5;
        }
        if (this.f61035r && L) {
            if (!z5 || !z6) {
                z4 = false;
            } else {
                z4 = true;
            }
            z |= z4;
        }
        if (!z5 && z) {
            setTextColor(getTextColors().getColorForState(new int[]{-16842910}, -7829368));
        }
        if (!z) {
            i = 4;
        }
        setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo59054a(C23322h hVar) {
        this.f61035r = hVar.mo59069c();
        m75402n();
        mo59058j(hVar.mo59070d());
        mo59065p(hVar.mo59071e());
        List<C23322h.C23323a> f = hVar.mo59072f();
        if (!f.isEmpty()) {
            String h = mo59057h();
            SpannableString spannableString = new SpannableString(mo59057h());
            for (C23322h.C23323a aVar : f) {
                spannableString.setSpan(aVar.f61044a, 0, h.length(), 33);
            }
            setText(spannableString);
            return;
        }
        setText(mo59057h());
    }

    /* renamed from: f */
    public String mo59055f() {
        C24707e eVar = this.f61032o;
        if (eVar == null) {
            return this.f61031n.mo63109a(this.f61025h);
        }
        return eVar.mo63109a(this.f61025h);
    }

    /* renamed from: g */
    public CalendarDay mo59056g() {
        return this.f61025h;
    }

    /* renamed from: h */
    public String mo59057h() {
        return this.f61031n.mo63109a(this.f61025h);
    }

    /* renamed from: j */
    public void mo59058j(Drawable drawable) {
        if (drawable == null) {
            this.f61028k = null;
        } else {
            this.f61028k = drawable.getConstantState().newDrawable(getResources());
        }
        invalidate();
    }

    /* renamed from: k */
    public void mo59059k(CalendarDay calendarDay) {
        this.f61025h = calendarDay;
        setText(mo59057h());
    }

    /* renamed from: l */
    public void mo59060l(C24707e eVar) {
        Object[] objArr;
        C24707e eVar2 = this.f61032o;
        if (eVar2 == this.f61031n) {
            eVar2 = eVar;
        }
        this.f61032o = eVar2;
        if (eVar == null) {
            eVar = C24707e.f63598a;
        }
        this.f61031n = eVar;
        CharSequence text = getText();
        if (text instanceof Spanned) {
            objArr = ((Spanned) text).getSpans(0, text.length(), Object.class);
        } else {
            objArr = null;
        }
        SpannableString spannableString = new SpannableString(mo59057h());
        if (objArr != null) {
            for (Object span : objArr) {
                spannableString.setSpan(span, 0, spannableString.length(), 33);
            }
        }
        setText(spannableString);
    }

    /* renamed from: m */
    public void mo59061m(C24707e eVar) {
        if (eVar == null) {
            eVar = this.f61031n;
        }
        this.f61032o = eVar;
        setContentDescription(mo59055f());
    }

    /* renamed from: o */
    public void mo59062o(int i) {
        this.f61026i = i;
        m75401i();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Drawable drawable = this.f61028k;
        if (drawable != null) {
            drawable.setBounds(this.f61037t);
            this.f61028k.setState(getDrawableState());
            this.f61028k.draw(canvas);
        }
        this.f61030m.setBounds(this.f61038u);
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m75397b(i3 - i, i4 - i2);
        m75401i();
    }

    /* renamed from: p */
    public void mo59065p(Drawable drawable) {
        if (drawable == null) {
            this.f61029l = null;
        } else {
            this.f61029l = drawable.getConstantState().newDrawable(getResources());
        }
        m75401i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo59066q(int i, boolean z, boolean z2) {
        this.f61036s = i;
        this.f61034q = z2;
        this.f61033p = z;
        m75402n();
    }
}
