package p341ge.bog.mobilebank.externallibs.materialcalendar;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.C1907a;
import com.github.mikephil.charting.utils.Utils;
import fe0.C20464a;
import ge0.C24707e;
import ge0.C24709g;
import ge0.C24710h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p342j$.time.LocalDate;

/* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.d */
abstract class C23317d extends C1907a {

    /* renamed from: c */
    private final ArrayDeque f60996c;

    /* renamed from: d */
    protected final MaterialCalendarView f60997d;

    /* renamed from: e */
    private final CalendarDay f60998e;

    /* renamed from: f */
    private C24709g f60999f = C24709g.f63600a;

    /* renamed from: g */
    private Integer f61000g = null;

    /* renamed from: h */
    private Integer f61001h = null;

    /* renamed from: i */
    private Integer f61002i = null;

    /* renamed from: j */
    private int f61003j = 4;

    /* renamed from: k */
    private CalendarDay f61004k = null;

    /* renamed from: l */
    private CalendarDay f61005l = null;

    /* renamed from: m */
    private C23320f f61006m;

    /* renamed from: n */
    private List f61007n = new ArrayList();

    /* renamed from: o */
    private C24710h f61008o = C24710h.f63601a;

    /* renamed from: p */
    private C24707e f61009p;

    /* renamed from: q */
    private C24707e f61010q;

    /* renamed from: r */
    private List f61011r;

    /* renamed from: s */
    private List f61012s;

    /* renamed from: t */
    private boolean f61013t;

    /* renamed from: u */
    boolean f61014u;

    C23317d(MaterialCalendarView materialCalendarView) {
        C24707e eVar = C24707e.f63598a;
        this.f61009p = eVar;
        this.f61010q = eVar;
        this.f61011r = new ArrayList();
        this.f61012s = null;
        this.f61013t = true;
        this.f60997d = materialCalendarView;
        this.f60998e = CalendarDay.m75256l();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f60996c = arrayDeque;
        arrayDeque.iterator();
        mo59002O((CalendarDay) null, (CalendarDay) null);
    }

    /* renamed from: F */
    private void m75336F() {
        m75337W();
        Iterator it = this.f60996c.iterator();
        while (it.hasNext()) {
            ((C23318e) it.next()).mo59043r(this.f61007n);
        }
    }

    /* renamed from: W */
    private void m75337W() {
        CalendarDay calendarDay;
        int i = 0;
        while (i < this.f61007n.size()) {
            CalendarDay calendarDay2 = (CalendarDay) this.f61007n.get(i);
            CalendarDay calendarDay3 = this.f61004k;
            if ((calendarDay3 != null && calendarDay3.mo58867i(calendarDay2)) || ((calendarDay = this.f61005l) != null && calendarDay.mo58868j(calendarDay2))) {
                this.f61007n.remove(i);
                this.f60997d.mo58881F(calendarDay2);
                i--;
            }
            i++;
        }
    }

    /* renamed from: A */
    public List mo58989A() {
        return Collections.unmodifiableList(this.f61007n);
    }

    /* renamed from: B */
    public int mo58990B() {
        return this.f61003j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public int mo58991C() {
        Integer num = this.f61002i;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public abstract int mo58992D(C23318e eVar);

    /* renamed from: E */
    public void mo58993E() {
        this.f61012s = new ArrayList();
        for (C20464a aVar : this.f61011r) {
            C23322h hVar = new C23322h();
            aVar.mo49009b(hVar);
            if (hVar.mo59073g()) {
                this.f61012s.add(new C23324i(aVar, hVar));
            }
        }
        Iterator it = this.f60996c.iterator();
        while (it.hasNext()) {
            ((C23318e) it.next()).mo59034o(this.f61012s);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract boolean mo58994G(Object obj);

    /* renamed from: H */
    public C23317d mo58995H(C23317d dVar) {
        dVar.f60999f = this.f60999f;
        dVar.f61000g = this.f61000g;
        dVar.f61001h = this.f61001h;
        dVar.f61002i = this.f61002i;
        dVar.f61003j = this.f61003j;
        dVar.f61004k = this.f61004k;
        dVar.f61005l = this.f61005l;
        dVar.f61007n = this.f61007n;
        dVar.f61008o = this.f61008o;
        dVar.f61009p = this.f61009p;
        dVar.f61010q = this.f61010q;
        dVar.f61011r = this.f61011r;
        dVar.f61012s = this.f61012s;
        dVar.f61013t = this.f61013t;
        return dVar;
    }

    /* renamed from: I */
    public void mo58996I(CalendarDay calendarDay, CalendarDay calendarDay2) {
        this.f61007n.clear();
        LocalDate of = LocalDate.m34218of(calendarDay.mo58865g(), calendarDay.mo58864f(), calendarDay.mo58862e());
        LocalDate d = calendarDay2.mo58860d();
        while (true) {
            if (of.isBefore(d) || of.equals(d)) {
                this.f61007n.add(CalendarDay.m75254b(of));
                of = of.plusDays(1);
            } else {
                m75336F();
                return;
            }
        }
    }

    /* renamed from: J */
    public void mo58997J(CalendarDay calendarDay, boolean z) {
        if (z) {
            if (!this.f61007n.contains(calendarDay)) {
                this.f61007n.add(calendarDay);
                m75336F();
            }
        } else if (this.f61007n.contains(calendarDay)) {
            this.f61007n.remove(calendarDay);
            m75336F();
        }
    }

    /* renamed from: K */
    public void mo58998K(int i) {
        if (i != 0) {
            this.f61001h = Integer.valueOf(i);
            Iterator it = this.f60996c.iterator();
            while (it.hasNext()) {
                ((C23318e) it.next()).mo59031l(i);
            }
        }
    }

    /* renamed from: L */
    public void mo58999L(C24707e eVar) {
        C24707e eVar2 = this.f61010q;
        if (eVar2 == this.f61009p) {
            eVar2 = eVar;
        }
        this.f61010q = eVar2;
        this.f61009p = eVar;
        Iterator it = this.f60996c.iterator();
        while (it.hasNext()) {
            ((C23318e) it.next()).mo59032m(eVar);
        }
    }

    /* renamed from: M */
    public void mo59000M(C24707e eVar) {
        this.f61010q = eVar;
        Iterator it = this.f60996c.iterator();
        while (it.hasNext()) {
            ((C23318e) it.next()).mo59033n(eVar);
        }
    }

    /* renamed from: N */
    public void mo59001N(List list) {
        this.f61011r = list;
        mo58993E();
    }

    /* renamed from: O */
    public void mo59002O(CalendarDay calendarDay, CalendarDay calendarDay2) {
        this.f61004k = calendarDay;
        this.f61005l = calendarDay2;
        Iterator it = this.f60996c.iterator();
        while (it.hasNext()) {
            C23318e eVar = (C23318e) it.next();
            eVar.mo59042q(calendarDay);
            eVar.mo59041p(calendarDay2);
        }
        if (calendarDay == null) {
            calendarDay = CalendarDay.m75253a(this.f60998e.mo58865g() - 200, this.f60998e.mo58864f(), this.f60998e.mo58862e());
        }
        if (calendarDay2 == null) {
            calendarDay2 = CalendarDay.m75253a(this.f60998e.mo58865g() + BogInputLayout.INPUT_NORMAL_STATE, this.f60998e.mo58864f(), this.f60998e.mo58862e());
        }
        this.f61006m = mo59011u(calendarDay, calendarDay2);
        mo6561j();
        m75336F();
    }

    /* renamed from: P */
    public void mo59003P(int i) {
        this.f61000g = Integer.valueOf(i);
        Iterator it = this.f60996c.iterator();
        while (it.hasNext()) {
            ((C23318e) it.next()).mo59044s(i);
        }
    }

    /* renamed from: Q */
    public void mo59004Q(boolean z) {
        this.f61013t = z;
        Iterator it = this.f60996c.iterator();
        while (it.hasNext()) {
            ((C23318e) it.next()).mo59046t(this.f61013t);
        }
    }

    /* renamed from: R */
    public void mo59005R(int i) {
        this.f61003j = i;
        Iterator it = this.f60996c.iterator();
        while (it.hasNext()) {
            ((C23318e) it.next()).mo59047u(i);
        }
    }

    /* renamed from: S */
    public void mo59006S(boolean z) {
        this.f61014u = z;
    }

    /* renamed from: T */
    public void mo59007T(C24709g gVar) {
        if (gVar == null) {
            gVar = C24709g.f63600a;
        }
        this.f60999f = gVar;
    }

    /* renamed from: U */
    public void mo59008U(C24710h hVar) {
        this.f61008o = hVar;
        Iterator it = this.f60996c.iterator();
        while (it.hasNext()) {
            ((C23318e) it.next()).mo59048v(hVar);
        }
    }

    /* renamed from: V */
    public void mo59009V(int i) {
        if (i != 0) {
            this.f61002i = Integer.valueOf(i);
            Iterator it = this.f60996c.iterator();
            while (it.hasNext()) {
                ((C23318e) it.next()).mo59049w(i);
            }
        }
    }

    /* renamed from: a */
    public void mo4594a(ViewGroup viewGroup, int i, Object obj) {
        C23318e eVar = (C23318e) obj;
        this.f60996c.remove(eVar);
        viewGroup.removeView(eVar);
    }

    /* renamed from: d */
    public int mo6557d() {
        return this.f61006m.getCount();
    }

    /* renamed from: e */
    public int mo6558e(Object obj) {
        int D;
        if (!mo58994G(obj)) {
            return -2;
        }
        C23318e eVar = (C23318e) obj;
        if (eVar.mo59023g() != null && (D = mo58992D(eVar)) >= 0) {
            return D;
        }
        return -2;
    }

    /* renamed from: f */
    public CharSequence mo6559f(int i) {
        return this.f60999f.mo63110a(mo59015y(i));
    }

    /* renamed from: h */
    public Object mo4596h(ViewGroup viewGroup, int i) {
        C23318e v = mo59012v(i);
        v.setContentDescription(this.f60997d.getCalendarContentDescription());
        v.setAlpha(Utils.FLOAT_EPSILON);
        v.mo59046t(this.f61013t);
        v.mo59048v(this.f61008o);
        v.mo59032m(this.f61009p);
        v.mo59033n(this.f61010q);
        Integer num = this.f61000g;
        if (num != null) {
            v.mo59044s(num.intValue());
        }
        Integer num2 = this.f61001h;
        if (num2 != null) {
            v.mo59031l(num2.intValue());
        }
        Integer num3 = this.f61002i;
        if (num3 != null) {
            v.mo59049w(num3.intValue());
        }
        v.mo59047u(this.f61003j);
        v.mo59042q(this.f61004k);
        v.mo59041p(this.f61005l);
        v.mo59043r(this.f61007n);
        viewGroup.addView(v);
        this.f60996c.add(v);
        v.mo59034o(this.f61012s);
        return v;
    }

    /* renamed from: i */
    public boolean mo4597i(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: t */
    public void mo59010t() {
        this.f61007n.clear();
        m75336F();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract C23320f mo59011u(CalendarDay calendarDay, CalendarDay calendarDay2);

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract C23318e mo59012v(int i);

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int mo59013w() {
        Integer num = this.f61001h;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: x */
    public int mo59014x(CalendarDay calendarDay) {
        if (calendarDay == null) {
            return mo6557d() / 2;
        }
        CalendarDay calendarDay2 = this.f61004k;
        if (calendarDay2 != null && calendarDay.mo58868j(calendarDay2)) {
            return 0;
        }
        CalendarDay calendarDay3 = this.f61005l;
        if (calendarDay3 == null || !calendarDay.mo58867i(calendarDay3)) {
            return this.f61006m.mo59051a(calendarDay);
        }
        return mo6557d() - 1;
    }

    /* renamed from: y */
    public CalendarDay mo59015y(int i) {
        return this.f61006m.getItem(i);
    }

    /* renamed from: z */
    public C23320f mo59016z() {
        return this.f61006m;
    }
}
