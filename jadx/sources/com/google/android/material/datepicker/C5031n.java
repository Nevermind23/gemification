package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.n */
public final class C5031n<S> extends C5038r {

    /* renamed from: e */
    private int f16057e;

    /* renamed from: f */
    private DateSelector f16058f;

    /* renamed from: g */
    private CalendarConstraints f16059g;

    /* renamed from: com.google.android.material.datepicker.n$a */
    class C5032a extends C5037q {
        C5032a() {
        }

        /* renamed from: a */
        public void mo16272a() {
            Iterator it = C5031n.this.f16076d.iterator();
            while (it.hasNext()) {
                ((C5037q) it.next()).mo16272a();
            }
        }

        /* renamed from: b */
        public void mo16273b(Object obj) {
            Iterator it = C5031n.this.f16076d.iterator();
            while (it.hasNext()) {
                ((C5037q) it.next()).mo16273b(obj);
            }
        }
    }

    /* renamed from: j1 */
    static C5031n m19574j1(DateSelector dateSelector, int i, CalendarConstraints calendarConstraints) {
        C5031n nVar = new C5031n();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        nVar.setArguments(bundle);
        return nVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f16057e = bundle.getInt("THEME_RES_ID_KEY");
        this.f16058f = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f16059g = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f16058f.mo16173a1(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f16057e)), viewGroup, bundle, this.f16059g, new C5032a());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f16057e);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f16058f);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f16059g);
    }
}
