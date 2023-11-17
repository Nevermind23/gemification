package p109hb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.github.mikephil.charting.utils.Utils;
import com.google.maps.android.p044ui.RotationLayout;
import p340za.C9275c;
import p340za.C9276d;
import p340za.C9277e;

/* renamed from: hb.b */
public class C6492b {

    /* renamed from: a */
    private final Context f19816a;

    /* renamed from: b */
    private ViewGroup f19817b;

    /* renamed from: c */
    private RotationLayout f19818c;

    /* renamed from: d */
    private TextView f19819d;

    /* renamed from: e */
    private View f19820e;

    /* renamed from: f */
    private int f19821f;

    /* renamed from: g */
    private float f19822g = 0.5f;

    /* renamed from: h */
    private float f19823h = 1.0f;

    /* renamed from: i */
    private C6491a f19824i;

    public C6492b(Context context) {
        this.f19816a = context;
        this.f19824i = new C6491a(context);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C9276d.amu_text_bubble, (ViewGroup) null);
        this.f19817b = viewGroup;
        RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
        this.f19818c = rotationLayout;
        TextView textView = (TextView) rotationLayout.findViewById(C9275c.f25730a);
        this.f19819d = textView;
        this.f19820e = textView;
        mo20408h(1);
    }

    /* renamed from: a */
    private static int m25652a(int i) {
        if (i == 3) {
            return -3407872;
        }
        if (i == 4) {
            return -16737844;
        }
        if (i == 5) {
            return -10053376;
        }
        if (i != 6) {
            return i != 7 ? -1 : -30720;
        }
        return -6736948;
    }

    /* renamed from: b */
    private static int m25653b(int i) {
        if (i == 3 || i == 4 || i == 5 || i == 6 || i == 7) {
            return C9277e.amu_Bubble_TextAppearance_Light;
        }
        return C9277e.amu_Bubble_TextAppearance_Dark;
    }

    /* renamed from: c */
    public Bitmap mo20403c() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f19817b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = this.f19817b.getMeasuredWidth();
        int measuredHeight = this.f19817b.getMeasuredHeight();
        this.f19817b.layout(0, 0, measuredWidth, measuredHeight);
        int i = this.f19821f;
        if (i == 1 || i == 3) {
            measuredHeight = this.f19817b.getMeasuredWidth();
            measuredWidth = this.f19817b.getMeasuredHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        Canvas canvas = new Canvas(createBitmap);
        int i2 = this.f19821f;
        if (i2 == 1) {
            canvas.translate((float) measuredWidth, Utils.FLOAT_EPSILON);
            canvas.rotate(90.0f);
        } else if (i2 == 2) {
            canvas.rotate(180.0f, (float) (measuredWidth / 2), (float) (measuredHeight / 2));
        } else if (i2 == 3) {
            canvas.translate(Utils.FLOAT_EPSILON, (float) measuredHeight);
            canvas.rotate(270.0f);
        }
        this.f19817b.draw(canvas);
        return createBitmap;
    }

    /* renamed from: d */
    public Bitmap mo20404d(CharSequence charSequence) {
        TextView textView = this.f19819d;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return mo20403c();
    }

    /* renamed from: e */
    public void mo20405e(Drawable drawable) {
        this.f19817b.setBackgroundDrawable(drawable);
        if (drawable != null) {
            Rect rect = new Rect();
            drawable.getPadding(rect);
            this.f19817b.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            return;
        }
        this.f19817b.setPadding(0, 0, 0, 0);
    }

    /* renamed from: f */
    public void mo20406f(int i) {
        this.f19824i.mo20395a(i);
        mo20405e(this.f19824i);
    }

    /* renamed from: g */
    public void mo20407g(View view) {
        TextView textView;
        this.f19818c.removeAllViews();
        this.f19818c.addView(view);
        this.f19820e = view;
        View findViewById = this.f19818c.findViewById(C9275c.f25730a);
        if (findViewById instanceof TextView) {
            textView = (TextView) findViewById;
        } else {
            textView = null;
        }
        this.f19819d = textView;
    }

    /* renamed from: h */
    public void mo20408h(int i) {
        mo20406f(m25652a(i));
        mo20410j(this.f19816a, m25653b(i));
    }

    /* renamed from: i */
    public void mo20409i(int i) {
        mo20410j(this.f19816a, i);
    }

    /* renamed from: j */
    public void mo20410j(Context context, int i) {
        TextView textView = this.f19819d;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }
}
