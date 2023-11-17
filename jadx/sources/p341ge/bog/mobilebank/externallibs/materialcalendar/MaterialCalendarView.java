package p341ge.bog.mobilebank.externallibs.materialcalendar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import ee0.C20220a;
import ee0.C20221b;
import ee0.C20222c;
import ee0.C20223d;
import ee0.C20224e;
import ee0.C20225f;
import fe0.C20468e;
import fe0.C20469f;
import fe0.C20470g;
import fe0.C20471h;
import ge0.C24703a;
import ge0.C24707e;
import ge0.C24708f;
import ge0.C24709g;
import ge0.C24710h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import p342j$.time.DayOfWeek;
import p342j$.time.LocalDate;
import p342j$.time.temporal.WeekFields;

/* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.MaterialCalendarView */
public class MaterialCalendarView extends ViewGroup {

    /* renamed from: A */
    private DayOfWeek f60937A;

    /* renamed from: B */
    private boolean f60938B;

    /* renamed from: C */
    private C23312f f60939C;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C23329m f60940d;

    /* renamed from: e */
    private final TextView f60941e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ImageView f60942f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final ImageView f60943g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C23316c f60944h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C23317d f60945i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public CalendarDay f60946j;

    /* renamed from: k */
    private LinearLayout f60947k;

    /* renamed from: l */
    private C23315b f60948l;

    /* renamed from: m */
    private boolean f60949m;

    /* renamed from: n */
    private final ArrayList f60950n = new ArrayList();

    /* renamed from: o */
    private final View.OnClickListener f60951o;

    /* renamed from: p */
    private final ViewPager.C1902j f60952p;

    /* renamed from: q */
    private CalendarDay f60953q;

    /* renamed from: r */
    private CalendarDay f60954r;

    /* renamed from: s */
    private C20469f f60955s;

    /* renamed from: t */
    private C20470g f60956t;

    /* renamed from: u */
    CharSequence f60957u;

    /* renamed from: v */
    private int f60958v;

    /* renamed from: w */
    private int f60959w;

    /* renamed from: x */
    private int f60960x;

    /* renamed from: y */
    private int f60961y;

    /* renamed from: z */
    private boolean f60962z;

    /* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.MaterialCalendarView$SavedState */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C23306a();

        /* renamed from: d */
        int f60963d;

        /* renamed from: e */
        boolean f60964e;

        /* renamed from: f */
        CalendarDay f60965f;

        /* renamed from: g */
        CalendarDay f60966g;

        /* renamed from: h */
        List f60967h;

        /* renamed from: i */
        boolean f60968i;

        /* renamed from: j */
        int f60969j;

        /* renamed from: k */
        boolean f60970k;

        /* renamed from: l */
        CalendarDay f60971l;

        /* renamed from: m */
        boolean f60972m;

        /* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.MaterialCalendarView$SavedState$a */
        class C23306a implements Parcelable.Creator {
            C23306a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f60963d);
            parcel.writeByte(this.f60964e ? (byte) 1 : 0);
            parcel.writeParcelable(this.f60965f, 0);
            parcel.writeParcelable(this.f60966g, 0);
            parcel.writeTypedList(this.f60967h);
            parcel.writeInt(this.f60968i ? 1 : 0);
            parcel.writeInt(this.f60969j);
            parcel.writeInt(this.f60970k ? 1 : 0);
            parcel.writeParcelable(this.f60971l, 0);
            parcel.writeByte(this.f60972m ? (byte) 1 : 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f60963d = 4;
            this.f60964e = true;
            this.f60965f = null;
            this.f60966g = null;
            this.f60967h = new ArrayList();
            this.f60968i = true;
            this.f60969j = 1;
            this.f60970k = false;
            this.f60971l = null;
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f60963d = 4;
            boolean z = true;
            this.f60964e = true;
            this.f60965f = null;
            this.f60966g = null;
            this.f60967h = new ArrayList();
            this.f60968i = true;
            this.f60969j = 1;
            this.f60970k = false;
            this.f60971l = null;
            this.f60963d = parcel.readInt();
            this.f60964e = parcel.readByte() != 0;
            ClassLoader classLoader = CalendarDay.class.getClassLoader();
            this.f60965f = (CalendarDay) parcel.readParcelable(classLoader);
            this.f60966g = (CalendarDay) parcel.readParcelable(classLoader);
            parcel.readTypedList(this.f60967h, CalendarDay.CREATOR);
            this.f60968i = parcel.readInt() == 1;
            this.f60969j = parcel.readInt();
            this.f60970k = parcel.readInt() == 1;
            this.f60971l = (CalendarDay) parcel.readParcelable(classLoader);
            this.f60972m = parcel.readByte() == 0 ? false : z;
        }
    }

    /* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.MaterialCalendarView$a */
    class C23307a implements View.OnClickListener {
        C23307a() {
        }

        public void onClick(View view) {
            if (view == MaterialCalendarView.this.f60943g) {
                MaterialCalendarView.this.f60944h.setCurrentItem(MaterialCalendarView.this.f60944h.getCurrentItem() + 1, true);
            } else if (view == MaterialCalendarView.this.f60942f) {
                MaterialCalendarView.this.f60944h.setCurrentItem(MaterialCalendarView.this.f60944h.getCurrentItem() - 1, true);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.MaterialCalendarView$b */
    class C23308b implements ViewPager.C1902j {
        C23308b() {
        }

        /* renamed from: L */
        public void mo6548L(int i, float f, int i2) {
        }

        /* renamed from: Q */
        public void mo6549Q(int i) {
            MaterialCalendarView.this.f60940d.mo59084k(MaterialCalendarView.this.f60946j);
            MaterialCalendarView materialCalendarView = MaterialCalendarView.this;
            materialCalendarView.f60946j = materialCalendarView.f60945i.mo59015y(i);
            MaterialCalendarView.this.m75271P();
            MaterialCalendarView materialCalendarView2 = MaterialCalendarView.this;
            materialCalendarView2.mo58923r(materialCalendarView2.f60946j);
        }

        /* renamed from: l0 */
        public void mo6550l0(int i) {
        }
    }

    /* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.MaterialCalendarView$c */
    class C23309c implements ViewPager.C1903k {
        C23309c() {
        }

        /* renamed from: a */
        public void mo6551a(View view, float f) {
            view.setAlpha((float) Math.sqrt((double) (1.0f - Math.abs(f))));
        }
    }

    /* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.MaterialCalendarView$d */
    static /* synthetic */ class C23310d {

        /* renamed from: a */
        static final /* synthetic */ int[] f60976a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                ge.bog.mobilebank.externallibs.materialcalendar.b[] r0 = p341ge.bog.mobilebank.externallibs.materialcalendar.C23315b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f60976a = r0
                ge.bog.mobilebank.externallibs.materialcalendar.b r1 = p341ge.bog.mobilebank.externallibs.materialcalendar.C23315b.MONTHS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f60976a     // Catch:{ NoSuchFieldError -> 0x001d }
                ge.bog.mobilebank.externallibs.materialcalendar.b r1 = p341ge.bog.mobilebank.externallibs.materialcalendar.C23315b.WEEKS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.externallibs.materialcalendar.MaterialCalendarView.C23310d.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.MaterialCalendarView$e */
    protected static class C23311e extends ViewGroup.MarginLayoutParams {
        public C23311e(int i) {
            super(-1, i);
        }
    }

    /* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.MaterialCalendarView$f */
    public class C23312f {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C23315b f60977a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final DayOfWeek f60978b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final CalendarDay f60979c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final CalendarDay f60980d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final boolean f60981e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final boolean f60982f;

        /* renamed from: g */
        public C23313g mo58975g() {
            return new C23313g(this);
        }

        private C23312f(C23313g gVar) {
            this.f60977a = gVar.f60984a;
            this.f60978b = gVar.f60985b;
            this.f60979c = gVar.f60987d;
            this.f60980d = gVar.f60988e;
            this.f60981e = gVar.f60986c;
            this.f60982f = gVar.f60989f;
        }
    }

    /* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.MaterialCalendarView$g */
    public class C23313g {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C23315b f60984a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public DayOfWeek f60985b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f60986c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public CalendarDay f60987d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public CalendarDay f60988e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f60989f;

        /* renamed from: g */
        public void mo58976g() {
            MaterialCalendarView materialCalendarView = MaterialCalendarView.this;
            materialCalendarView.m75282p(new C23312f(this));
        }

        /* renamed from: h */
        public C23313g mo58977h(boolean z) {
            this.f60986c = z;
            return this;
        }

        /* renamed from: i */
        public C23313g mo58978i(C23315b bVar) {
            this.f60984a = bVar;
            return this;
        }

        /* renamed from: j */
        public C23313g mo58979j(DayOfWeek dayOfWeek) {
            this.f60985b = dayOfWeek;
            return this;
        }

        /* renamed from: k */
        public C23313g mo58980k(CalendarDay calendarDay) {
            this.f60988e = calendarDay;
            return this;
        }

        /* renamed from: l */
        public C23313g mo58981l(CalendarDay calendarDay) {
            this.f60987d = calendarDay;
            return this;
        }

        /* renamed from: m */
        public C23313g mo58982m(boolean z) {
            this.f60989f = z;
            return this;
        }

        public C23313g() {
            this.f60986c = false;
            this.f60987d = null;
            this.f60988e = null;
            this.f60984a = C23315b.MONTHS;
            this.f60985b = LocalDate.now().mo24930a(WeekFields.m34453of(Locale.getDefault()).dayOfWeek(), 1).getDayOfWeek();
        }

        private C23313g(C23312f fVar) {
            this.f60986c = false;
            this.f60987d = null;
            this.f60988e = null;
            this.f60984a = fVar.f60977a;
            this.f60985b = fVar.f60978b;
            this.f60987d = fVar.f60979c;
            this.f60988e = fVar.f60980d;
            this.f60986c = fVar.f60981e;
            this.f60989f = fVar.f60982f;
        }
    }

    public MaterialCalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C23307a aVar = new C23307a();
        this.f60951o = aVar;
        C23308b bVar = new C23308b();
        this.f60952p = bVar;
        this.f60953q = null;
        this.f60954r = null;
        this.f60958v = 0;
        this.f60959w = -10;
        this.f60960x = -10;
        this.f60961y = 1;
        this.f60962z = true;
        setClipToPadding(false);
        setClipChildren(false);
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C20222c.calendar_view, (ViewGroup) null, false);
        this.f60947k = (LinearLayout) inflate.findViewById(C20221b.f54925a);
        ImageView imageView = (ImageView) inflate.findViewById(C20221b.previous);
        this.f60942f = imageView;
        TextView textView = (TextView) inflate.findViewById(C20221b.month_name);
        this.f60941e = textView;
        ImageView imageView2 = (ImageView) inflate.findViewById(C20221b.next);
        this.f60943g = imageView2;
        C23316c cVar = new C23316c(getContext());
        this.f60944h = cVar;
        imageView.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        C23329m mVar = new C23329m(textView);
        this.f60940d = mVar;
        cVar.setOnPageChangeListener(bVar);
        cVar.setPageTransformer(false, new C23309c());
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C20225f.f54930B0, 0, 0);
        try {
            int integer = obtainStyledAttributes.getInteger(C20225f.f54936D0, 0);
            int integer2 = obtainStyledAttributes.getInteger(C20225f.f54942F0, -1);
            mVar.mo59083j(obtainStyledAttributes.getInteger(C20225f.f54978R0, 0));
            if (integer2 < 1 || integer2 > 7) {
                this.f60937A = WeekFields.m34453of(Locale.getDefault()).getFirstDayOfWeek();
            } else {
                this.f60937A = DayOfWeek.m34186of(integer2);
            }
            this.f60938B = obtainStyledAttributes.getBoolean(C20225f.f54966N0, true);
            mo58877B().mo58979j(this.f60937A).mo58978i(C23315b.values()[integer]).mo58982m(this.f60938B).mo58976g();
            setSelectionMode(obtainStyledAttributes.getInteger(C20225f.f54960L0, 1));
            int layoutDimension = obtainStyledAttributes.getLayoutDimension(C20225f.f54972P0, -10);
            if (layoutDimension > -10) {
                setTileSize(layoutDimension);
            }
            int layoutDimension2 = obtainStyledAttributes.getLayoutDimension(C20225f.f54975Q0, -10);
            if (layoutDimension2 > -10) {
                setTileWidth(layoutDimension2);
            }
            int layoutDimension3 = obtainStyledAttributes.getLayoutDimension(C20225f.f54969O0, -10);
            if (layoutDimension3 > -10) {
                setTileHeight(layoutDimension3);
            }
            setLeftArrow(obtainStyledAttributes.getResourceId(C20225f.f54948H0, C20220a.mcv_action_previous));
            setRightArrow(obtainStyledAttributes.getResourceId(C20225f.f54954J0, C20220a.mcv_action_next));
            setSelectionColor(obtainStyledAttributes.getColor(C20225f.f54957K0, m75285x(context)));
            CharSequence[] textArray = obtainStyledAttributes.getTextArray(C20225f.f54981S0);
            if (textArray != null) {
                setWeekDayFormatter(new C24703a(textArray));
            }
            CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(C20225f.f54951I0);
            if (textArray2 != null) {
                setTitleFormatter(new C24708f(textArray2));
            }
            setHeaderTextAppearance(obtainStyledAttributes.getResourceId(C20225f.f54945G0, C20224e.TextAppearance_MaterialCalendarWidget_Header));
            setWeekDayTextAppearance(obtainStyledAttributes.getResourceId(C20225f.f54984T0, C20224e.TextAppearance_MaterialCalendarWidget_WeekDay));
            setDateTextAppearance(obtainStyledAttributes.getResourceId(C20225f.f54939E0, C20224e.TextAppearance_MaterialCalendarWidget_Date));
            setShowOtherDates(obtainStyledAttributes.getInteger(C20225f.f54963M0, 4));
            setAllowClickDaysOutsideCurrentMonth(obtainStyledAttributes.getBoolean(C20225f.f54933C0, true));
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
        obtainStyledAttributes.recycle();
        m75267K();
        CalendarDay l = CalendarDay.m75256l();
        this.f60946j = l;
        setCurrentDate(l);
        if (isInEditMode()) {
            removeView(this.f60944h);
            C23328l lVar = new C23328l(this, this.f60946j, getFirstDayOfWeek(), true);
            lVar.mo59044s(getSelectionColor());
            lVar.mo59031l(this.f60945i.mo59013w());
            lVar.mo59049w(this.f60945i.mo58991C());
            lVar.mo59047u(getShowOtherDates());
            addView(lVar, new C23311e(this.f60948l.f60994d + 1));
        }
    }

    /* renamed from: J */
    private void m75266J(CalendarDay calendarDay, CalendarDay calendarDay2) {
        CalendarDay calendarDay3 = this.f60946j;
        this.f60945i.mo59002O(calendarDay, calendarDay2);
        this.f60946j = calendarDay3;
        if (calendarDay != null) {
            if (!calendarDay.mo58867i(calendarDay3)) {
                calendarDay = this.f60946j;
            }
            this.f60946j = calendarDay;
        }
        this.f60944h.setCurrentItem(this.f60945i.mo59014x(calendarDay3), false);
        m75271P();
    }

    /* renamed from: K */
    private void m75267K() {
        int i;
        addView(this.f60947k);
        this.f60944h.setId(C20221b.mcv_pager);
        this.f60944h.setOffscreenPageLimit(1);
        if (this.f60938B) {
            i = this.f60948l.f60994d + 1;
        } else {
            i = this.f60948l.f60994d;
        }
        addView(this.f60944h, new C23311e(i));
    }

    /* renamed from: L */
    public static boolean m75268L(int i) {
        return (i & 4) != 0;
    }

    /* renamed from: M */
    public static boolean m75269M(int i) {
        return (i & 1) != 0;
    }

    /* renamed from: N */
    public static boolean m75270N(int i) {
        return (i & 2) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m75271P() {
        this.f60940d.mo59081f(this.f60946j);
        m75284u(this.f60942f, mo58912l());
        m75284u(this.f60943g, mo58913m());
    }

    private int getWeekCountBasedOnMode() {
        C23317d dVar;
        C23316c cVar;
        C23315b bVar = this.f60948l;
        int i = bVar.f60994d;
        if (bVar.equals(C23315b.MONTHS) && this.f60949m && (dVar = this.f60945i) != null && (cVar = this.f60944h) != null) {
            LocalDate d = dVar.mo59015y(cVar.getCurrentItem()).mo58860d();
            i = d.withDayOfMonth(d.lengthOfMonth()).get(WeekFields.m34452of(this.f60937A, 1).weekOfMonth());
        }
        if (this.f60938B) {
            return i + 1;
        }
        return i;
    }

    /* renamed from: n */
    private static int m75281n(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode != 1073741824) {
            return i;
        }
        return size;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        if (r1.mo58868j(r2) == false) goto L_0x007c;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m75282p(p341ge.bog.mobilebank.externallibs.materialcalendar.MaterialCalendarView.C23312f r6) {
        /*
            r5 = this;
            ge.bog.mobilebank.externallibs.materialcalendar.d r0 = r5.f60945i
            if (r0 == 0) goto L_0x007b
            boolean r0 = r6.f60981e
            if (r0 == 0) goto L_0x007b
            ge.bog.mobilebank.externallibs.materialcalendar.d r0 = r5.f60945i
            ge.bog.mobilebank.externallibs.materialcalendar.c r1 = r5.f60944h
            int r1 = r1.getCurrentItem()
            ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay r0 = r0.mo59015y(r1)
            ge.bog.mobilebank.externallibs.materialcalendar.b r1 = r5.f60948l
            ge.bog.mobilebank.externallibs.materialcalendar.b r2 = r6.f60977a
            if (r1 == r2) goto L_0x007c
            ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay r1 = r5.getSelectedDate()
            ge.bog.mobilebank.externallibs.materialcalendar.b r2 = r5.f60948l
            ge.bog.mobilebank.externallibs.materialcalendar.b r3 = p341ge.bog.mobilebank.externallibs.materialcalendar.C23315b.MONTHS
            if (r2 != r3) goto L_0x004b
            if (r1 == 0) goto L_0x004b
            j$.time.LocalDate r2 = r0.mo58860d()
            r3 = 1
            j$.time.LocalDate r2 = r2.plusDays(r3)
            ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay r2 = p341ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay.m75254b(r2)
            boolean r3 = r1.equals(r0)
            if (r3 != 0) goto L_0x0077
            boolean r3 = r1.mo58867i(r0)
            if (r3 == 0) goto L_0x007c
            boolean r2 = r1.mo58868j(r2)
            if (r2 == 0) goto L_0x007c
            goto L_0x0077
        L_0x004b:
            ge.bog.mobilebank.externallibs.materialcalendar.b r3 = p341ge.bog.mobilebank.externallibs.materialcalendar.C23315b.WEEKS
            if (r2 != r3) goto L_0x007c
            j$.time.LocalDate r2 = r0.mo58860d()
            r3 = 6
            j$.time.LocalDate r2 = r2.plusDays(r3)
            ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay r2 = p341ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay.m75254b(r2)
            if (r1 == 0) goto L_0x0079
            boolean r3 = r1.equals(r0)
            if (r3 != 0) goto L_0x0077
            boolean r3 = r1.equals(r2)
            if (r3 != 0) goto L_0x0077
            boolean r0 = r1.mo58867i(r0)
            if (r0 == 0) goto L_0x0079
            boolean r0 = r1.mo58868j(r2)
            if (r0 == 0) goto L_0x0079
        L_0x0077:
            r0 = r1
            goto L_0x007c
        L_0x0079:
            r0 = r2
            goto L_0x007c
        L_0x007b:
            r0 = 0
        L_0x007c:
            r5.f60939C = r6
            ge.bog.mobilebank.externallibs.materialcalendar.b r1 = r6.f60977a
            r5.f60948l = r1
            j$.time.DayOfWeek r1 = r6.f60978b
            r5.f60937A = r1
            ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay r1 = r6.f60979c
            r5.f60953q = r1
            ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay r1 = r6.f60980d
            r5.f60954r = r1
            boolean r6 = r6.f60982f
            r5.f60938B = r6
            int[] r6 = p341ge.bog.mobilebank.externallibs.materialcalendar.MaterialCalendarView.C23310d.f60976a
            ge.bog.mobilebank.externallibs.materialcalendar.b r1 = r5.f60948l
            int r1 = r1.ordinal()
            r6 = r6[r1]
            r1 = 1
            if (r6 == r1) goto L_0x00ba
            r2 = 2
            if (r6 != r2) goto L_0x00b2
            ge.bog.mobilebank.externallibs.materialcalendar.o r6 = new ge.bog.mobilebank.externallibs.materialcalendar.o
            r6.<init>(r5)
            goto L_0x00bf
        L_0x00b2:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Provided display mode which is not yet implemented"
            r6.<init>(r0)
            throw r6
        L_0x00ba:
            ge.bog.mobilebank.externallibs.materialcalendar.k r6 = new ge.bog.mobilebank.externallibs.materialcalendar.k
            r6.<init>(r5)
        L_0x00bf:
            ge.bog.mobilebank.externallibs.materialcalendar.d r2 = r5.f60945i
            if (r2 != 0) goto L_0x00c6
            r5.f60945i = r6
            goto L_0x00cc
        L_0x00c6:
            ge.bog.mobilebank.externallibs.materialcalendar.d r6 = r2.mo58995H(r6)
            r5.f60945i = r6
        L_0x00cc:
            ge.bog.mobilebank.externallibs.materialcalendar.d r6 = r5.f60945i
            boolean r2 = r5.f60938B
            r6.mo59006S(r2)
            ge.bog.mobilebank.externallibs.materialcalendar.c r6 = r5.f60944h
            ge.bog.mobilebank.externallibs.materialcalendar.d r2 = r5.f60945i
            r6.setAdapter(r2)
            ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay r6 = r5.f60953q
            ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay r2 = r5.f60954r
            r5.m75266J(r6, r2)
            boolean r6 = r5.f60938B
            if (r6 == 0) goto L_0x00eb
            ge.bog.mobilebank.externallibs.materialcalendar.b r6 = r5.f60948l
            int r6 = r6.f60994d
            int r6 = r6 + r1
            goto L_0x00ef
        L_0x00eb:
            ge.bog.mobilebank.externallibs.materialcalendar.b r6 = r5.f60948l
            int r6 = r6.f60994d
        L_0x00ef:
            ge.bog.mobilebank.externallibs.materialcalendar.c r2 = r5.f60944h
            ge.bog.mobilebank.externallibs.materialcalendar.MaterialCalendarView$e r3 = new ge.bog.mobilebank.externallibs.materialcalendar.MaterialCalendarView$e
            r3.<init>(r6)
            r2.setLayoutParams(r3)
            int r6 = r5.f60961y
            if (r6 != r1) goto L_0x0117
            ge.bog.mobilebank.externallibs.materialcalendar.d r6 = r5.f60945i
            java.util.List r6 = r6.mo58989A()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0117
            ge.bog.mobilebank.externallibs.materialcalendar.d r6 = r5.f60945i
            java.util.List r6 = r6.mo58989A()
            r1 = 0
            java.lang.Object r6 = r6.get(r1)
            ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay r6 = (p341ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay) r6
            goto L_0x011b
        L_0x0117:
            ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay r6 = p341ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay.m75256l()
        L_0x011b:
            r5.setCurrentDate((p341ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay) r6)
            if (r0 == 0) goto L_0x012b
            ge.bog.mobilebank.externallibs.materialcalendar.c r6 = r5.f60944h
            ge.bog.mobilebank.externallibs.materialcalendar.d r1 = r5.f60945i
            int r0 = r1.mo59014x(r0)
            r6.setCurrentItem(r0)
        L_0x012b:
            r5.mo58876A()
            r5.m75271P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.externallibs.materialcalendar.MaterialCalendarView.m75282p(ge.bog.mobilebank.externallibs.materialcalendar.MaterialCalendarView$f):void");
    }

    /* renamed from: t */
    private int m75283t(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    /* renamed from: u */
    private static void m75284u(View view, boolean z) {
        float f;
        view.setEnabled(z);
        if (z) {
            f = 1.0f;
        } else {
            f = 0.1f;
        }
        view.setAlpha(f);
    }

    /* renamed from: x */
    private static int m75285x(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843829, typedValue, true);
        return typedValue.data;
    }

    /* renamed from: A */
    public void mo58876A() {
        this.f60945i.mo58993E();
    }

    /* renamed from: B */
    public C23313g mo58877B() {
        return new C23313g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo58878C(CalendarDay calendarDay, boolean z) {
        int i = this.f60961y;
        if (i == 2) {
            this.f60945i.mo58997J(calendarDay, z);
            mo58922q(calendarDay, z);
        } else if (i != 3) {
            this.f60945i.mo59010t();
            this.f60945i.mo58997J(calendarDay, true);
            mo58922q(calendarDay, true);
        } else {
            List A = this.f60945i.mo58989A();
            if (A.size() == 0) {
                this.f60945i.mo58997J(calendarDay, z);
                mo58922q(calendarDay, z);
            } else if (A.size() == 1) {
                CalendarDay calendarDay2 = (CalendarDay) A.get(0);
                if (calendarDay2.equals(calendarDay)) {
                    this.f60945i.mo58997J(calendarDay, z);
                    mo58922q(calendarDay, z);
                } else if (calendarDay2.mo58867i(calendarDay)) {
                    this.f60945i.mo58996I(calendarDay, calendarDay2);
                    mo58924s(this.f60945i.mo58989A());
                } else {
                    this.f60945i.mo58996I(calendarDay2, calendarDay);
                    mo58924s(this.f60945i.mo58989A());
                }
            } else {
                this.f60945i.mo59010t();
                this.f60945i.mo58997J(calendarDay, z);
                mo58922q(calendarDay, z);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo58879D(C23321g gVar) {
        CalendarDay currentDate = getCurrentDate();
        CalendarDay g = gVar.mo59056g();
        int f = currentDate.mo58864f();
        int f2 = g.mo58864f();
        if (this.f60948l == C23315b.MONTHS && this.f60962z && f != f2) {
            if (currentDate.mo58867i(g)) {
                mo58968z();
            } else if (currentDate.mo58868j(g)) {
                mo58967y();
            }
        }
        mo58878C(gVar.mo59056g(), !gVar.isChecked());
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo58880E(C23321g gVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo58881F(CalendarDay calendarDay) {
        mo58922q(calendarDay, false);
    }

    /* renamed from: G */
    public void mo58882G() {
        this.f60950n.clear();
        this.f60945i.mo59001N(this.f60950n);
    }

    /* renamed from: H */
    public void mo58883H(CalendarDay calendarDay, boolean z) {
        if (calendarDay != null) {
            this.f60944h.setCurrentItem(this.f60945i.mo59014x(calendarDay), z);
            m75271P();
        }
    }

    /* renamed from: I */
    public void mo58884I(CalendarDay calendarDay, boolean z) {
        if (calendarDay != null) {
            this.f60945i.mo58997J(calendarDay, z);
        }
    }

    /* renamed from: O */
    public C23312f mo58885O() {
        return this.f60939C;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C23311e;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public CharSequence getCalendarContentDescription() {
        CharSequence charSequence = this.f60957u;
        if (charSequence != null) {
            return charSequence;
        }
        return getContext().getString(C20223d.calendar);
    }

    public C23315b getCalendarMode() {
        return this.f60948l;
    }

    public CalendarDay getCurrentDate() {
        return this.f60945i.mo59015y(this.f60944h.getCurrentItem());
    }

    public DayOfWeek getFirstDayOfWeek() {
        return this.f60937A;
    }

    public Drawable getLeftArrow() {
        return this.f60942f.getDrawable();
    }

    public CalendarDay getMaximumDate() {
        return this.f60954r;
    }

    public CalendarDay getMinimumDate() {
        return this.f60953q;
    }

    public Drawable getRightArrow() {
        return this.f60943g.getDrawable();
    }

    public CalendarDay getSelectedDate() {
        List A = this.f60945i.mo58989A();
        if (A.isEmpty()) {
            return null;
        }
        return (CalendarDay) A.get(A.size() - 1);
    }

    public List<CalendarDay> getSelectedDates() {
        return this.f60945i.mo58989A();
    }

    public int getSelectionColor() {
        return this.f60958v;
    }

    public int getSelectionMode() {
        return this.f60961y;
    }

    public int getShowOtherDates() {
        return this.f60945i.mo58990B();
    }

    public int getTileHeight() {
        return this.f60959w;
    }

    @Deprecated
    public int getTileSize() {
        return Math.max(this.f60959w, this.f60960x);
    }

    public int getTileWidth() {
        return this.f60960x;
    }

    public int getTitleAnimationOrientation() {
        return this.f60940d.mo59082i();
    }

    public boolean getTopbarVisible() {
        return this.f60947k.getVisibility() == 0;
    }

    /* renamed from: j */
    public void mo58910j(Collection collection) {
        if (collection != null) {
            this.f60950n.addAll(collection);
            this.f60945i.mo59001N(this.f60950n);
        }
    }

    /* renamed from: k */
    public boolean mo58911k() {
        return this.f60962z;
    }

    /* renamed from: l */
    public boolean mo58912l() {
        return this.f60944h.getCurrentItem() > 0;
    }

    /* renamed from: m */
    public boolean mo58913m() {
        return this.f60944h.getCurrentItem() < this.f60945i.mo6557d() - 1;
    }

    /* renamed from: o */
    public void mo58914o() {
        List<CalendarDay> selectedDates = getSelectedDates();
        this.f60945i.mo59010t();
        for (CalendarDay q : selectedDates) {
            mo58922q(q, false);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(MaterialCalendarView.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(MaterialCalendarView.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i3 - i) - paddingLeft) - getPaddingRight();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int i6 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                int measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                childAt.layout(i6, paddingTop, measuredWidth + i6, measuredHeight);
                paddingTop = measuredHeight;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int weekCountBasedOnMode = getWeekCountBasedOnMode();
        if (getTopbarVisible()) {
            weekCountBasedOnMode++;
        }
        int i4 = paddingLeft / 7;
        int i5 = paddingTop / weekCountBasedOnMode;
        int i6 = this.f60960x;
        int i7 = -1;
        if (i6 == -10 && this.f60959w == -10) {
            if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
                if (mode2 == 1073741824) {
                    i4 = Math.min(i4, i5);
                }
            } else if (mode2 == 1073741824 || mode2 == Integer.MIN_VALUE) {
                i4 = i5;
            } else {
                i4 = -1;
                i5 = -1;
            }
            i5 = -1;
        } else {
            if (i6 > 0) {
                i4 = i6;
            }
            int i8 = this.f60959w;
            if (i8 > 0) {
                i5 = i8;
            }
            i7 = i4;
            i4 = -1;
        }
        if (i4 > 0) {
            i5 = i4;
        } else if (i4 <= 0) {
            if (i7 <= 0) {
                i3 = m75283t(44);
            } else {
                i3 = i7;
            }
            if (i5 <= 0) {
                i5 = m75283t(44);
            }
            i4 = i3;
        } else {
            i4 = i7;
        }
        int i9 = i4 * 7;
        setMeasuredDimension(m75281n(getPaddingLeft() + getPaddingRight() + i9, i), m75281n((weekCountBasedOnMode * i5) + getPaddingTop() + getPaddingBottom(), i2));
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(((C23311e) childAt.getLayoutParams()).height * i5, 1073741824));
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        mo58885O().mo58975g().mo58981l(savedState.f60965f).mo58980k(savedState.f60966g).mo58977h(savedState.f60972m).mo58976g();
        setShowOtherDates(savedState.f60963d);
        setAllowClickDaysOutsideCurrentMonth(savedState.f60964e);
        mo58914o();
        for (CalendarDay I : savedState.f60967h) {
            mo58884I(I, true);
        }
        setTopbarVisible(savedState.f60968i);
        setSelectionMode(savedState.f60969j);
        setDynamicHeightEnabled(savedState.f60970k);
        setCurrentDate(savedState.f60971l);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f60963d = getShowOtherDates();
        savedState.f60964e = mo58911k();
        savedState.f60965f = getMinimumDate();
        savedState.f60966g = getMaximumDate();
        savedState.f60967h = getSelectedDates();
        savedState.f60969j = getSelectionMode();
        savedState.f60968i = getTopbarVisible();
        savedState.f60970k = this.f60949m;
        savedState.f60971l = this.f60946j;
        savedState.f60972m = this.f60939C.f60981e;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f60944h.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo58922q(CalendarDay calendarDay, boolean z) {
        C20469f fVar = this.f60955s;
        if (fVar != null) {
            fVar.mo49010a(this, calendarDay, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo58923r(CalendarDay calendarDay) {
        C20470g gVar = this.f60956t;
        if (gVar != null) {
            gVar.mo49011a(this, calendarDay);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo58924s(List list) {
    }

    public void setAllowClickDaysOutsideCurrentMonth(boolean z) {
        this.f60962z = z;
    }

    public void setContentDescriptionArrowFuture(CharSequence charSequence) {
        this.f60943g.setContentDescription(charSequence);
    }

    public void setContentDescriptionArrowPast(CharSequence charSequence) {
        this.f60942f.setContentDescription(charSequence);
    }

    public void setContentDescriptionCalendar(CharSequence charSequence) {
        this.f60957u = charSequence;
    }

    public void setCurrentDate(LocalDate localDate) {
        setCurrentDate(CalendarDay.m75254b(localDate));
    }

    public void setDateTextAppearance(int i) {
        this.f60945i.mo58998K(i);
    }

    public void setDayFormatter(C24707e eVar) {
        C23317d dVar = this.f60945i;
        if (eVar == null) {
            eVar = C24707e.f63598a;
        }
        dVar.mo58999L(eVar);
    }

    public void setDayFormatterContentDescription(C24707e eVar) {
        this.f60945i.mo59000M(eVar);
    }

    public void setDynamicHeightEnabled(boolean z) {
        this.f60949m = z;
    }

    public void setHeaderTextAppearance(int i) {
        this.f60941e.setTextAppearance(getContext(), i);
    }

    public void setLeftArrow(int i) {
        this.f60942f.setImageResource(i);
    }

    public void setOnDateChangedListener(C20469f fVar) {
        this.f60955s = fVar;
    }

    public void setOnDateLongClickListener(C20468e eVar) {
    }

    public void setOnMonthChangedListener(C20470g gVar) {
        this.f60956t = gVar;
    }

    public void setOnRangeSelectedListener(C20471h hVar) {
    }

    public void setOnTitleClickListener(View.OnClickListener onClickListener) {
        this.f60941e.setOnClickListener(onClickListener);
    }

    public void setPagingEnabled(boolean z) {
        this.f60944h.mo58988v(z);
        m75271P();
    }

    public void setRightArrow(int i) {
        this.f60943g.setImageResource(i);
    }

    public void setSelectedDate(LocalDate localDate) {
        setSelectedDate(CalendarDay.m75254b(localDate));
    }

    public void setSelectionColor(int i) {
        if (i == 0) {
            if (isInEditMode()) {
                i = -7829368;
            } else {
                return;
            }
        }
        this.f60958v = i;
        this.f60945i.mo59003P(i);
        invalidate();
    }

    public void setSelectionMode(int i) {
        int i2 = this.f60961y;
        this.f60961y = i;
        boolean z = false;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    this.f60961y = 0;
                    if (i2 != 0) {
                        mo58914o();
                    }
                } else {
                    mo58914o();
                }
            }
        } else if ((i2 == 2 || i2 == 3) && !getSelectedDates().isEmpty()) {
            setSelectedDate(getSelectedDate());
        }
        C23317d dVar = this.f60945i;
        if (this.f60961y != 0) {
            z = true;
        }
        dVar.mo59004Q(z);
    }

    public void setShowOtherDates(int i) {
        this.f60945i.mo59005R(i);
    }

    public void setTileHeight(int i) {
        this.f60959w = i;
        requestLayout();
    }

    public void setTileHeightDp(int i) {
        setTileHeight(m75283t(i));
    }

    public void setTileSize(int i) {
        this.f60960x = i;
        this.f60959w = i;
        requestLayout();
    }

    public void setTileSizeDp(int i) {
        setTileSize(m75283t(i));
    }

    public void setTileWidth(int i) {
        this.f60960x = i;
        requestLayout();
    }

    public void setTileWidthDp(int i) {
        setTileWidth(m75283t(i));
    }

    public void setTitleAnimationOrientation(int i) {
        this.f60940d.mo59083j(i);
    }

    public void setTitleFormatter(C24709g gVar) {
        this.f60940d.mo59085l(gVar);
        this.f60945i.mo59007T(gVar);
        m75271P();
    }

    public void setTitleMonths(CharSequence[] charSequenceArr) {
        setTitleFormatter(new C24708f(charSequenceArr));
    }

    public void setTopbarVisible(boolean z) {
        int i;
        LinearLayout linearLayout = this.f60947k;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
        requestLayout();
    }

    public void setWeekDayFormatter(C24710h hVar) {
        C23317d dVar = this.f60945i;
        if (hVar == null) {
            hVar = C24710h.f63601a;
        }
        dVar.mo59008U(hVar);
    }

    public void setWeekDayLabels(CharSequence[] charSequenceArr) {
        setWeekDayFormatter(new C24703a(charSequenceArr));
    }

    public void setWeekDayTextAppearance(int i) {
        this.f60945i.mo59009V(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C23311e generateDefaultLayoutParams() {
        return new C23311e(1);
    }

    /* renamed from: w */
    public C23311e generateLayoutParams(AttributeSet attributeSet) {
        return new C23311e(1);
    }

    /* renamed from: y */
    public void mo58967y() {
        if (mo58913m()) {
            C23316c cVar = this.f60944h;
            cVar.setCurrentItem(cVar.getCurrentItem() + 1, true);
        }
    }

    /* renamed from: z */
    public void mo58968z() {
        if (mo58912l()) {
            C23316c cVar = this.f60944h;
            cVar.setCurrentItem(cVar.getCurrentItem() - 1, true);
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C23311e(1);
    }

    public void setCurrentDate(CalendarDay calendarDay) {
        mo58883H(calendarDay, true);
    }

    public void setSelectedDate(CalendarDay calendarDay) {
        mo58914o();
        if (calendarDay != null) {
            mo58884I(calendarDay, true);
        }
    }

    public void setTitleMonths(int i) {
        setTitleMonths(getResources().getTextArray(i));
    }

    public void setWeekDayLabels(int i) {
        setWeekDayLabels(getResources().getTextArray(i));
    }
}
