package p317y;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: y.b */
class C8986b extends Filter {

    /* renamed from: a */
    C8987a f25016a;

    /* renamed from: y.b$a */
    interface C8987a {
        /* renamed from: a */
        void mo2208a(Cursor cursor);

        /* renamed from: b */
        CharSequence mo2209b(Cursor cursor);

        /* renamed from: c */
        Cursor mo2210c(CharSequence charSequence);

        /* renamed from: d */
        Cursor mo24391d();
    }

    C8986b(C8987a aVar) {
        this.f25016a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f25016a.mo2209b((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor c = this.f25016a.mo2210c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (c != null) {
            filterResults.count = c.getCount();
            filterResults.values = c;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor d = this.f25016a.mo24391d();
        Object obj = filterResults.values;
        if (obj != null && obj != d) {
            this.f25016a.mo2208a((Cursor) obj);
        }
    }
}
