package p317y;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: y.c */
public abstract class C8988c extends C8983a {

    /* renamed from: l */
    private int f25017l;

    /* renamed from: m */
    private int f25018m;

    /* renamed from: n */
    private LayoutInflater f25019n;

    public C8988c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f25018m = i;
        this.f25017l = i;
        this.f25019n = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: g */
    public View mo24393g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f25019n.inflate(this.f25018m, viewGroup, false);
    }

    /* renamed from: h */
    public View mo2214h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f25019n.inflate(this.f25017l, viewGroup, false);
    }
}
