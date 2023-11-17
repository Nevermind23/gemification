package w40;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import androidx.core.content.C0767a;
import fe0.C20464a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10322k;
import x40.C29646a;

/* renamed from: w40.b */
public final class C29225b {

    /* renamed from: a */
    private final Context f74276a;

    /* renamed from: b */
    private final boolean f74277b;

    public C29225b(Context context, boolean z) {
        C41536l.m120489i(context, "context");
        this.f74276a = context;
        this.f74277b = z;
    }

    /* renamed from: a */
    private final C20464a m89180a(int i, boolean z) {
        LayerDrawable e = m89183e();
        Drawable findDrawableByLayerId = e.findDrawableByLayerId(C10322k.selected_date_stroke);
        C41536l.m120487g(findDrawableByLayerId, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) findDrawableByLayerId).setStroke(this.f74276a.getResources().getDimensionPixelSize(C10319h.pfm_calendar_selected_stroke_width), i);
        CalendarDay l = CalendarDay.m75256l();
        C41536l.m120488h(l, "today()");
        return new C29224a(l, e, i, z);
    }

    /* renamed from: b */
    private final C20464a m89181b(C29646a aVar) {
        Drawable drawable;
        Drawable e = C0767a.m2895e(this.f74276a, C10320i.pfm_calendar_date_drawable);
        if (e != null) {
            drawable = e.mutate();
        } else {
            drawable = null;
        }
        C41536l.m120487g(drawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(C10322k.circle);
        C41536l.m120487g(findDrawableByLayerId, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) findDrawableByLayerId).setColor(aVar.mo69564a());
        LayerDrawable e2 = m89183e();
        Drawable findDrawableByLayerId2 = e2.findDrawableByLayerId(C10322k.selected_date_stroke);
        C41536l.m120487g(findDrawableByLayerId2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) findDrawableByLayerId2).setStroke(this.f74276a.getResources().getDimensionPixelSize(C10319h.pfm_calendar_selected_stroke_width), aVar.mo69564a());
        Drawable findDrawableByLayerId3 = e2.findDrawableByLayerId(C10322k.date_color);
        C41536l.m120487g(findDrawableByLayerId3, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) findDrawableByLayerId3).setColor(aVar.mo69564a());
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (this.f74277b) {
            stateListDrawable.addState(new int[]{16842912}, e2);
            stateListDrawable.addState(new int[]{16842919}, e2);
        }
        stateListDrawable.addState(new int[0], layerDrawable);
        stateListDrawable.setExitFadeDuration(17694720);
        return new C29224a(aVar.mo69565b(), stateListDrawable, aVar.mo69566c(), false, 8, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    private final C29226c m89182d(Set set) {
        Drawable e = C0767a.m2895e(this.f74276a, C10320i.pfm_calendar_disabled_date_drawable);
        C41536l.m120486f(e);
        return new C29226c(set, e);
    }

    /* renamed from: e */
    private final LayerDrawable m89183e() {
        Drawable e = C0767a.m2895e(this.f74276a, C10320i.pfm_calendar_date_selected_drawable);
        Drawable mutate = e != null ? e.mutate() : null;
        C41536l.m120487g(mutate, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        return (LayerDrawable) mutate;
    }

    /* renamed from: c */
    public final List mo69071c(List list) {
        Object obj;
        int i;
        boolean z;
        C41536l.m120489i(list, "list");
        ArrayList arrayList = new ArrayList();
        CalendarDay l = CalendarDay.m75256l();
        C41536l.m120488h(l, "today()");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((C29646a) obj).mo69565b(), l)) {
                break;
            }
        }
        C29646a aVar = (C29646a) obj;
        if (aVar != null) {
            i = aVar.mo69564a();
        } else {
            i = C0767a.m2893c(this.f74276a, C10318g.color_accent_retail);
        }
        if (aVar == null) {
            z = true;
        } else {
            z = false;
        }
        arrayList.add(m89180a(i, z));
        ArrayList<C29646a> arrayList2 = new ArrayList<>();
        for (Object next : list) {
            if (!C41536l.m120484d(((C29646a) next).mo69565b(), l)) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C41343r.m119925u(arrayList2, 10));
        for (C29646a b : arrayList2) {
            arrayList3.add(m89181b(b));
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((C29646a) it2.next()).mo69565b());
        }
        HashSet hashSet = new HashSet(arrayList4);
        hashSet.add(l);
        arrayList.add(m89182d(hashSet));
        return arrayList;
    }
}
