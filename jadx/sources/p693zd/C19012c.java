package p693zd;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p458id.C15600b;
import p458id.C15607g;
import p693zd.C19009a;

/* renamed from: zd.c */
public class C19012c extends FrameLayout implements C19009a {

    /* renamed from: f */
    private static final C15600b f53109f = C15600b.m56349a(C19012c.class.getSimpleName());

    /* renamed from: d */
    C19009a.C19010a f53110d = C19009a.C19010a.PREVIEW;

    /* renamed from: e */
    private boolean f53111e;

    /* renamed from: zd.c$a */
    static /* synthetic */ class C19013a {

        /* renamed from: a */
        static final /* synthetic */ int[] f53112a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                zd.a$a[] r0 = p693zd.C19009a.C19010a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f53112a = r0
                zd.a$a r1 = p693zd.C19009a.C19010a.PREVIEW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f53112a     // Catch:{ NoSuchFieldError -> 0x001d }
                zd.a$a r1 = p693zd.C19009a.C19010a.VIDEO_SNAPSHOT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f53112a     // Catch:{ NoSuchFieldError -> 0x0028 }
                zd.a$a r1 = p693zd.C19009a.C19010a.PICTURE_SNAPSHOT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p693zd.C19012c.C19013a.<clinit>():void");
        }
    }

    /* renamed from: zd.c$b */
    public static class C19014b extends FrameLayout.LayoutParams {

        /* renamed from: a */
        public boolean f53113a = false;

        /* renamed from: b */
        public boolean f53114b = false;

        /* renamed from: c */
        public boolean f53115c = false;

        public C19014b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15607g.f44368i0);
            try {
                this.f53113a = obtainStyledAttributes.getBoolean(C15607g.f44372k0, false);
                this.f53114b = obtainStyledAttributes.getBoolean(C15607g.f44370j0, false);
                this.f53115c = obtainStyledAttributes.getBoolean(C15607g.f44374l0, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo47172a(C19009a.C19010a aVar) {
            return (aVar == C19009a.C19010a.PREVIEW && this.f53113a) || (aVar == C19009a.C19010a.VIDEO_SNAPSHOT && this.f53115c) || (aVar == C19009a.C19010a.PICTURE_SNAPSHOT && this.f53114b);
        }

        public String toString() {
            return getClass().getName() + "[drawOnPreview:" + this.f53113a + ",drawOnPictureSnapshot:" + this.f53114b + ",drawOnVideoSnapshot:" + this.f53115c + "]";
        }
    }

    public C19012c(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    /* renamed from: a */
    public void mo47157a(C19009a.C19010a aVar, Canvas canvas) {
        synchronized (this) {
            this.f53110d = aVar;
            int i = C19013a.f53112a[aVar.ordinal()];
            if (i == 1) {
                super.draw(canvas);
            } else if (i == 2 || i == 3) {
                canvas.save();
                float width = ((float) canvas.getWidth()) / ((float) getWidth());
                float height = ((float) canvas.getHeight()) / ((float) getHeight());
                C15600b bVar = f53109f;
                bVar.mo42879g("draw", "target:", aVar, "canvas:", canvas.getWidth() + "x" + canvas.getHeight(), "view:", getWidth() + "x" + getHeight(), "widthScale:", Float.valueOf(width), "heightScale:", Float.valueOf(height), "hardwareCanvasMode:", Boolean.valueOf(this.f53111e));
                canvas.scale(width, height);
                dispatchDraw(canvas);
                canvas.restore();
            }
        }
    }

    /* renamed from: b */
    public boolean mo47158b(C19009a.C19010a aVar) {
        for (int i = 0; i < getChildCount(); i++) {
            if (((C19014b) getChildAt(i).getLayoutParams()).mo47172a(aVar)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo47164c(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: d */
    public C19014b generateLayoutParams(AttributeSet attributeSet) {
        return new C19014b(getContext(), attributeSet);
    }

    public void draw(Canvas canvas) {
        f53109f.mo42878c("normal draw called.");
        C19009a.C19010a aVar = C19009a.C19010a.PREVIEW;
        if (mo47158b(aVar)) {
            mo47157a(aVar, canvas);
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C19014b bVar = (C19014b) view.getLayoutParams();
        if (bVar.mo47172a(this.f53110d)) {
            f53109f.mo42879g("Performing drawing for view:", view.getClass().getSimpleName(), "target:", this.f53110d, "params:", bVar);
            return mo47164c(canvas, view, j);
        }
        f53109f.mo42879g("Skipping drawing for view:", view.getClass().getSimpleName(), "target:", this.f53110d, "params:", bVar);
        return false;
    }

    /* renamed from: e */
    public boolean mo47168e(AttributeSet attributeSet) {
        boolean z = false;
        if (attributeSet == null) {
            return false;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C15607g.f44368i0);
        if (obtainStyledAttributes.hasValue(C15607g.f44372k0) || obtainStyledAttributes.hasValue(C15607g.f44370j0) || obtainStyledAttributes.hasValue(C15607g.f44374l0)) {
            z = true;
        }
        obtainStyledAttributes.recycle();
        return z;
    }

    /* renamed from: f */
    public boolean mo47169f(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C19014b;
    }

    public boolean getHardwareCanvasEnabled() {
        return this.f53111e;
    }

    public void setHardwareCanvasEnabled(boolean z) {
        this.f53111e = z;
    }
}
