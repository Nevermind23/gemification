package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import com.google.zxing.C5766o;
import com.journeyapps.barcodescanner.C10650a;
import java.util.ArrayList;
import java.util.List;
import p174mb.C7164j;
import p174mb.C7169o;
import p416fd.C12861p;

public class ViewfinderView extends View {

    /* renamed from: q */
    protected static final int[] f30341q = {0, 64, 128, 192, C11051p3.f31759c, 192, 128, 64};

    /* renamed from: d */
    protected final Paint f30342d = new Paint(1);

    /* renamed from: e */
    protected Bitmap f30343e;

    /* renamed from: f */
    protected int f30344f;

    /* renamed from: g */
    protected final int f30345g;

    /* renamed from: h */
    protected final int f30346h;

    /* renamed from: i */
    protected final int f30347i;

    /* renamed from: j */
    protected boolean f30348j;

    /* renamed from: k */
    protected int f30349k;

    /* renamed from: l */
    protected List f30350l;

    /* renamed from: m */
    protected List f30351m;

    /* renamed from: n */
    protected C10650a f30352n;

    /* renamed from: o */
    protected Rect f30353o;

    /* renamed from: p */
    protected C12861p f30354p;

    /* renamed from: com.journeyapps.barcodescanner.ViewfinderView$a */
    class C10649a implements C10650a.C10656f {
        C10649a() {
        }

        /* renamed from: a */
        public void mo27415a() {
            ViewfinderView.this.mo27410b();
            ViewfinderView.this.invalidate();
        }

        /* renamed from: b */
        public void mo27416b() {
        }

        /* renamed from: c */
        public void mo27417c(Exception exc) {
        }

        /* renamed from: d */
        public void mo27418d() {
        }

        /* renamed from: e */
        public void mo27419e() {
        }
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C7169o.f21217n);
        this.f30344f = obtainStyledAttributes.getColor(C7169o.f21222s, resources.getColor(C7164j.zxing_viewfinder_mask));
        this.f30345g = obtainStyledAttributes.getColor(C7169o.f21219p, resources.getColor(C7164j.zxing_result_view));
        this.f30346h = obtainStyledAttributes.getColor(C7169o.f21220q, resources.getColor(C7164j.zxing_viewfinder_laser));
        this.f30347i = obtainStyledAttributes.getColor(C7169o.f21218o, resources.getColor(C7164j.zxing_possible_result_points));
        this.f30348j = obtainStyledAttributes.getBoolean(C7169o.f21221r, true);
        obtainStyledAttributes.recycle();
        this.f30349k = 0;
        this.f30350l = new ArrayList(20);
        this.f30351m = new ArrayList(20);
    }

    /* renamed from: a */
    public void mo27409a(C5766o oVar) {
        if (this.f30350l.size() < 20) {
            this.f30350l.add(oVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27410b() {
        C10650a aVar = this.f30352n;
        if (aVar != null) {
            Rect framingRect = aVar.getFramingRect();
            C12861p previewSize = this.f30352n.getPreviewSize();
            if (framingRect != null && previewSize != null) {
                this.f30353o = framingRect;
                this.f30354p = previewSize;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        C12861p pVar;
        int i;
        mo27410b();
        Rect rect = this.f30353o;
        if (rect != null && (pVar = this.f30354p) != null) {
            int width = getWidth();
            int height = getHeight();
            Paint paint = this.f30342d;
            if (this.f30343e != null) {
                i = this.f30345g;
            } else {
                i = this.f30344f;
            }
            paint.setColor(i);
            float f = (float) width;
            canvas.drawRect(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, f, (float) rect.top, this.f30342d);
            canvas.drawRect(Utils.FLOAT_EPSILON, (float) rect.top, (float) rect.left, (float) (rect.bottom + 1), this.f30342d);
            float f2 = f;
            canvas.drawRect((float) (rect.right + 1), (float) rect.top, f2, (float) (rect.bottom + 1), this.f30342d);
            canvas.drawRect(Utils.FLOAT_EPSILON, (float) (rect.bottom + 1), f2, (float) height, this.f30342d);
            if (this.f30343e != null) {
                this.f30342d.setAlpha(160);
                canvas.drawBitmap(this.f30343e, (Rect) null, rect, this.f30342d);
                return;
            }
            if (this.f30348j) {
                this.f30342d.setColor(this.f30346h);
                Paint paint2 = this.f30342d;
                int[] iArr = f30341q;
                paint2.setAlpha(iArr[this.f30349k]);
                this.f30349k = (this.f30349k + 1) % iArr.length;
                int height2 = (rect.height() / 2) + rect.top;
                canvas.drawRect((float) (rect.left + 2), (float) (height2 - 1), (float) (rect.right - 1), (float) (height2 + 2), this.f30342d);
            }
            float width2 = ((float) getWidth()) / ((float) pVar.f38002d);
            float height3 = ((float) getHeight()) / ((float) pVar.f38003e);
            if (!this.f30351m.isEmpty()) {
                this.f30342d.setAlpha(80);
                this.f30342d.setColor(this.f30347i);
                for (C5766o oVar : this.f30351m) {
                    canvas.drawCircle((float) ((int) (oVar.mo18901c() * width2)), (float) ((int) (oVar.mo18902d() * height3)), 3.0f, this.f30342d);
                }
                this.f30351m.clear();
            }
            if (!this.f30350l.isEmpty()) {
                this.f30342d.setAlpha(160);
                this.f30342d.setColor(this.f30347i);
                for (C5766o oVar2 : this.f30350l) {
                    canvas.drawCircle((float) ((int) (oVar2.mo18901c() * width2)), (float) ((int) (oVar2.mo18902d() * height3)), 6.0f, this.f30342d);
                }
                List list = this.f30350l;
                List list2 = this.f30351m;
                this.f30350l = list2;
                this.f30351m = list;
                list2.clear();
            }
            postInvalidateDelayed(80, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
        }
    }

    public void setCameraPreview(C10650a aVar) {
        this.f30352n = aVar;
        aVar.mo27428i(new C10649a());
    }

    public void setLaserVisibility(boolean z) {
        this.f30348j = z;
    }

    public void setMaskColor(int i) {
        this.f30344f = i;
    }
}
