package p317y;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p317y.C8986b;

/* renamed from: y.a */
public abstract class C8983a extends BaseAdapter implements Filterable, C8986b.C8987a {

    /* renamed from: d */
    protected boolean f25006d;

    /* renamed from: e */
    protected boolean f25007e;

    /* renamed from: f */
    protected Cursor f25008f;

    /* renamed from: g */
    protected Context f25009g;

    /* renamed from: h */
    protected int f25010h;

    /* renamed from: i */
    protected C8984a f25011i;

    /* renamed from: j */
    protected DataSetObserver f25012j;

    /* renamed from: k */
    protected C8986b f25013k;

    /* renamed from: y.a$a */
    private class C8984a extends ContentObserver {
        C8984a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C8983a.this.mo24398i();
        }
    }

    /* renamed from: y.a$b */
    private class C8985b extends DataSetObserver {
        C8985b() {
        }

        public void onChanged() {
            C8983a aVar = C8983a.this;
            aVar.f25006d = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C8983a aVar = C8983a.this;
            aVar.f25006d = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public C8983a(Context context, Cursor cursor, boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        mo24392f(context, cursor, i);
    }

    /* renamed from: a */
    public void mo2208a(Cursor cursor) {
        Cursor j = mo24399j(cursor);
        if (j != null) {
            j.close();
        }
    }

    /* renamed from: b */
    public abstract CharSequence mo2209b(Cursor cursor);

    /* renamed from: d */
    public Cursor mo24391d() {
        return this.f25008f;
    }

    /* renamed from: e */
    public abstract void mo2211e(View view, Context context, Cursor cursor);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo24392f(Context context, Cursor cursor, int i) {
        int i2;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f25007e = true;
        } else {
            this.f25007e = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f25008f = cursor;
        this.f25006d = z;
        this.f25009g = context;
        if (z) {
            i2 = cursor.getColumnIndexOrThrow("_id");
        } else {
            i2 = -1;
        }
        this.f25010h = i2;
        if ((i & 2) == 2) {
            this.f25011i = new C8984a();
            this.f25012j = new C8985b();
        } else {
            this.f25011i = null;
            this.f25012j = null;
        }
        if (z) {
            C8984a aVar = this.f25011i;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f25012j;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: g */
    public abstract View mo24393g(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f25006d || (cursor = this.f25008f) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f25006d) {
            return null;
        }
        this.f25008f.moveToPosition(i);
        if (view == null) {
            view = mo24393g(this.f25009g, this.f25008f, viewGroup);
        }
        mo2211e(view, this.f25009g, this.f25008f);
        return view;
    }

    public Filter getFilter() {
        if (this.f25013k == null) {
            this.f25013k = new C8986b(this);
        }
        return this.f25013k;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f25006d || (cursor = this.f25008f) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f25008f;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f25006d || (cursor = this.f25008f) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f25008f.getLong(this.f25010h);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f25006d) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f25008f.moveToPosition(i)) {
            if (view == null) {
                view = mo2214h(this.f25009g, this.f25008f, viewGroup);
            }
            mo2211e(view, this.f25009g, this.f25008f);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    /* renamed from: h */
    public abstract View mo2214h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo24398i() {
        Cursor cursor;
        if (this.f25007e && (cursor = this.f25008f) != null && !cursor.isClosed()) {
            this.f25006d = this.f25008f.requery();
        }
    }

    /* renamed from: j */
    public Cursor mo24399j(Cursor cursor) {
        Cursor cursor2 = this.f25008f;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C8984a aVar = this.f25011i;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f25012j;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f25008f = cursor;
        if (cursor != null) {
            C8984a aVar2 = this.f25011i;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f25012j;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f25010h = cursor.getColumnIndexOrThrow("_id");
            this.f25006d = true;
            notifyDataSetChanged();
        } else {
            this.f25010h = -1;
            this.f25006d = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
