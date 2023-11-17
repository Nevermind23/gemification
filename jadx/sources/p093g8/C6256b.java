package p093g8;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.app.C0214c;
import androidx.appcompat.view.C0267d;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;
import p009a8.C0072b;
import p009a8.C0081k;
import p080f8.C6170a;
import p184n8.C7342b;
import p223q8.C7922g;
import p249s8.C8273a;

/* renamed from: g8.b */
public class C6256b extends C0214c.C0215a {

    /* renamed from: c */
    private static final int f19281c = C0072b.f141a;

    /* renamed from: d */
    private static final int f19282d = C0081k.f354b;

    /* renamed from: e */
    private static final int f19283e = C0072b.f121A;

    /* renamed from: a */
    private Drawable f19284a;

    /* renamed from: b */
    private final Rect f19285b;

    public C6256b(Context context, int i) {
        super(m24825a(context), m24827c(context, i));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i2 = f19281c;
        int i3 = f19282d;
        this.f19285b = C6257c.m24863a(context2, i2, i3);
        int c = C6170a.m24582c(context2, C0072b.f159r, getClass().getCanonicalName());
        C7922g gVar = new C7922g(context2, (AttributeSet) null, i2, i3);
        gVar.mo22934M(context2);
        gVar.mo22941X(ColorStateList.valueOf(c));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(16844145, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= Utils.FLOAT_EPSILON) {
                gVar.mo22938U(dimension);
            }
        }
        this.f19284a = gVar;
    }

    /* renamed from: a */
    private static Context m24825a(Context context) {
        int b = m24826b(context);
        Context c = C8273a.m31120c(context, (AttributeSet) null, f19281c, f19282d);
        if (b == 0) {
            return c;
        }
        return new C0267d(c, b);
    }

    /* renamed from: b */
    private static int m24826b(Context context) {
        TypedValue a = C7342b.m27997a(context, f19283e);
        if (a == null) {
            return 0;
        }
        return a.data;
    }

    /* renamed from: c */
    private static int m24827c(Context context, int i) {
        return i == 0 ? m24826b(context) : i;
    }

    /* renamed from: A */
    public C6256b setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        return (C6256b) super.setOnKeyListener(onKeyListener);
    }

    /* renamed from: B */
    public C6256b setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (C6256b) super.setPositiveButton(i, onClickListener);
    }

    /* renamed from: C */
    public C6256b setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (C6256b) super.setPositiveButton(charSequence, onClickListener);
    }

    /* renamed from: D */
    public C6256b setPositiveButtonIcon(Drawable drawable) {
        return (C6256b) super.setPositiveButtonIcon(drawable);
    }

    /* renamed from: E */
    public C6256b setSingleChoiceItems(int i, int i2, DialogInterface.OnClickListener onClickListener) {
        return (C6256b) super.setSingleChoiceItems(i, i2, onClickListener);
    }

    /* renamed from: F */
    public C6256b setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
        return (C6256b) super.setSingleChoiceItems(cursor, i, str, onClickListener);
    }

    /* renamed from: G */
    public C6256b setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        return (C6256b) super.setSingleChoiceItems(listAdapter, i, onClickListener);
    }

    /* renamed from: H */
    public C6256b setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        return (C6256b) super.setSingleChoiceItems(charSequenceArr, i, onClickListener);
    }

    /* renamed from: I */
    public C6256b setTitle(int i) {
        return (C6256b) super.setTitle(i);
    }

    /* renamed from: J */
    public C6256b setTitle(CharSequence charSequence) {
        return (C6256b) super.setTitle(charSequence);
    }

    /* renamed from: K */
    public C6256b setView(int i) {
        return (C6256b) super.setView(i);
    }

    /* renamed from: L */
    public C6256b setView(View view) {
        return (C6256b) super.setView(view);
    }

    public C0214c create() {
        C0214c create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f19284a;
        if (drawable instanceof C7922g) {
            ((C7922g) drawable).mo22940W(ViewCompat.m3628w(decorView));
        }
        window.setBackgroundDrawable(C6257c.m24864b(this.f19284a, this.f19285b));
        decorView.setOnTouchListener(new C6255a(create, this.f19285b));
        return create;
    }

    /* renamed from: d */
    public C6256b setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (C6256b) super.setAdapter(listAdapter, onClickListener);
    }

    /* renamed from: e */
    public C6256b setCancelable(boolean z) {
        return (C6256b) super.setCancelable(z);
    }

    /* renamed from: f */
    public C6256b setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
        return (C6256b) super.setCursor(cursor, onClickListener, str);
    }

    /* renamed from: g */
    public C6256b setCustomTitle(View view) {
        return (C6256b) super.setCustomTitle(view);
    }

    /* renamed from: h */
    public C6256b setIcon(int i) {
        return (C6256b) super.setIcon(i);
    }

    /* renamed from: i */
    public C6256b setIcon(Drawable drawable) {
        return (C6256b) super.setIcon(drawable);
    }

    /* renamed from: j */
    public C6256b setIconAttribute(int i) {
        return (C6256b) super.setIconAttribute(i);
    }

    /* renamed from: k */
    public C6256b setItems(int i, DialogInterface.OnClickListener onClickListener) {
        return (C6256b) super.setItems(i, onClickListener);
    }

    /* renamed from: l */
    public C6256b setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        return (C6256b) super.setItems(charSequenceArr, onClickListener);
    }

    /* renamed from: m */
    public C6256b setMessage(int i) {
        return (C6256b) super.setMessage(i);
    }

    /* renamed from: n */
    public C6256b setMessage(CharSequence charSequence) {
        return (C6256b) super.setMessage(charSequence);
    }

    /* renamed from: o */
    public C6256b setMultiChoiceItems(int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (C6256b) super.setMultiChoiceItems(i, zArr, onMultiChoiceClickListener);
    }

    /* renamed from: p */
    public C6256b setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (C6256b) super.setMultiChoiceItems(cursor, str, str2, onMultiChoiceClickListener);
    }

    /* renamed from: q */
    public C6256b setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (C6256b) super.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    /* renamed from: r */
    public C6256b setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (C6256b) super.setNegativeButton(i, onClickListener);
    }

    /* renamed from: s */
    public C6256b setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (C6256b) super.setNegativeButton(charSequence, onClickListener);
    }

    /* renamed from: t */
    public C6256b setNegativeButtonIcon(Drawable drawable) {
        return (C6256b) super.setNegativeButtonIcon(drawable);
    }

    /* renamed from: u */
    public C6256b setNeutralButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (C6256b) super.setNeutralButton(i, onClickListener);
    }

    /* renamed from: v */
    public C6256b setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (C6256b) super.setNeutralButton(charSequence, onClickListener);
    }

    /* renamed from: w */
    public C6256b setNeutralButtonIcon(Drawable drawable) {
        return (C6256b) super.setNeutralButtonIcon(drawable);
    }

    /* renamed from: x */
    public C6256b setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return (C6256b) super.setOnCancelListener(onCancelListener);
    }

    /* renamed from: y */
    public C6256b setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return (C6256b) super.setOnDismissListener(onDismissListener);
    }

    /* renamed from: z */
    public C6256b setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (C6256b) super.setOnItemSelectedListener(onItemSelectedListener);
    }
}
