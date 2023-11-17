package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;
import p174mb.C7165k;
import p174mb.C7169o;
import p416fd.C12858n;
import p416fd.C12859o;
import p416fd.C12861p;
import p416fd.C12863r;
import p430gd.C12971g;
import p430gd.C12978i;
import p430gd.C12980j;
import p430gd.C12982l;
import p430gd.C12983m;
import p430gd.C12984n;
import p430gd.C12985o;
import p430gd.C12987q;

/* renamed from: com.journeyapps.barcodescanner.a */
public abstract class C10650a extends ViewGroup {
    /* access modifiers changed from: private */

    /* renamed from: D */
    public static final String f30356D = "a";

    /* renamed from: A */
    private final Handler.Callback f30357A = new C10653c();

    /* renamed from: B */
    private C12858n f30358B = new C10654d();
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final C10656f f30359C = new C10655e();

    /* renamed from: d */
    private C12971g f30360d;

    /* renamed from: e */
    private WindowManager f30361e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Handler f30362f;

    /* renamed from: g */
    private boolean f30363g = false;

    /* renamed from: h */
    private SurfaceView f30364h;

    /* renamed from: i */
    private TextureView f30365i;

    /* renamed from: j */
    private boolean f30366j = false;

    /* renamed from: k */
    private C12859o f30367k;

    /* renamed from: l */
    private int f30368l = -1;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public List f30369m = new ArrayList();

    /* renamed from: n */
    private C12983m f30370n;

    /* renamed from: o */
    private C12978i f30371o = new C12978i();

    /* renamed from: p */
    private C12861p f30372p;

    /* renamed from: q */
    private C12861p f30373q;

    /* renamed from: r */
    private Rect f30374r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C12861p f30375s;

    /* renamed from: t */
    private Rect f30376t = null;

    /* renamed from: u */
    private Rect f30377u = null;

    /* renamed from: v */
    private C12861p f30378v = null;

    /* renamed from: w */
    private double f30379w = 0.1d;

    /* renamed from: x */
    private C12987q f30380x = null;

    /* renamed from: y */
    private boolean f30381y = false;

    /* renamed from: z */
    private final SurfaceHolder.Callback f30382z = new C10652b();

    /* renamed from: com.journeyapps.barcodescanner.a$a */
    class C10651a implements TextureView.SurfaceTextureListener {
        C10651a() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C12861p unused = C10650a.this.f30375s = new C12861p(i, i2);
            C10650a.this.m38835C();
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.a$b */
    class C10652b implements SurfaceHolder.Callback {
        C10652b() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (surfaceHolder == null) {
                Log.e(C10650a.f30356D, "*** WARNING *** surfaceChanged() gave us a null surface!");
                return;
            }
            C12861p unused = C10650a.this.f30375s = new C12861p(i2, i3);
            C10650a.this.m38835C();
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C12861p unused = C10650a.this.f30375s = null;
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.a$c */
    class C10653c implements Handler.Callback {
        C10653c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == C7165k.zxing_prewiew_size_ready) {
                C10650a.this.m38849w((C12861p) message.obj);
                return true;
            } else if (i == C7165k.zxing_camera_error) {
                Exception exc = (Exception) message.obj;
                if (!C10650a.this.mo27437r()) {
                    return false;
                }
                C10650a.this.mo27378u();
                C10650a.this.f30359C.mo27417c(exc);
                return false;
            } else if (i != C7165k.zxing_camera_closed) {
                return false;
            } else {
                C10650a.this.f30359C.mo27416b();
                return false;
            }
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.a$d */
    class C10654d implements C12858n {
        C10654d() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m38864c() {
            C10650a.this.m38850z();
        }

        /* renamed from: a */
        public void mo27456a(int i) {
            C10650a.this.f30362f.postDelayed(new C10657b(this), 250);
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.a$e */
    class C10655e implements C10656f {
        C10655e() {
        }

        /* renamed from: a */
        public void mo27415a() {
            for (C10656f a : C10650a.this.f30369m) {
                a.mo27415a();
            }
        }

        /* renamed from: b */
        public void mo27416b() {
            for (C10656f b : C10650a.this.f30369m) {
                b.mo27416b();
            }
        }

        /* renamed from: c */
        public void mo27417c(Exception exc) {
            for (C10656f c : C10650a.this.f30369m) {
                c.mo27417c(exc);
            }
        }

        /* renamed from: d */
        public void mo27418d() {
            for (C10656f d : C10650a.this.f30369m) {
                d.mo27418d();
            }
        }

        /* renamed from: e */
        public void mo27419e() {
            for (C10656f e : C10650a.this.f30369m) {
                e.mo27419e();
            }
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.a$f */
    public interface C10656f {
        /* renamed from: a */
        void mo27415a();

        /* renamed from: b */
        void mo27416b();

        /* renamed from: c */
        void mo27417c(Exception exc);

        /* renamed from: d */
        void mo27418d();

        /* renamed from: e */
        void mo27419e();
    }

    public C10650a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m38848p(context, attributeSet, 0, 0);
    }

    /* renamed from: A */
    private void m38833A() {
        if (this.f30363g) {
            TextureView textureView = new TextureView(getContext());
            this.f30365i = textureView;
            textureView.setSurfaceTextureListener(m38836D());
            addView(this.f30365i);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.f30364h = surfaceView;
        surfaceView.getHolder().addCallback(this.f30382z);
        addView(this.f30364h);
    }

    /* renamed from: B */
    private void m38834B(C12980j jVar) {
        if (!this.f30366j && this.f30360d != null) {
            Log.i(f30356D, "Starting preview");
            this.f30360d.mo33741z(jVar);
            this.f30360d.mo33731B();
            this.f30366j = true;
            mo27379x();
            this.f30359C.mo27419e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m38835C() {
        Rect rect;
        C12861p pVar = this.f30375s;
        if (pVar != null && this.f30373q != null && (rect = this.f30374r) != null) {
            if (this.f30364h == null || !pVar.equals(new C12861p(rect.width(), this.f30374r.height()))) {
                TextureView textureView = this.f30365i;
                if (textureView != null && textureView.getSurfaceTexture() != null) {
                    if (this.f30373q != null) {
                        this.f30365i.setTransform(mo27430l(new C12861p(this.f30365i.getWidth(), this.f30365i.getHeight()), this.f30373q));
                    }
                    m38834B(new C12980j(this.f30365i.getSurfaceTexture()));
                    return;
                }
                return;
            }
            m38834B(new C12980j(this.f30364h.getHolder()));
        }
    }

    /* renamed from: D */
    private TextureView.SurfaceTextureListener m38836D() {
        return new C10651a();
    }

    private int getDisplayRotation() {
        return this.f30361e.getDefaultDisplay().getRotation();
    }

    /* renamed from: j */
    private void m38845j() {
        C12861p pVar;
        C12983m mVar;
        C12861p pVar2 = this.f30372p;
        if (pVar2 == null || (pVar = this.f30373q) == null || (mVar = this.f30370n) == null) {
            this.f30377u = null;
            this.f30376t = null;
            this.f30374r = null;
            throw new IllegalStateException("containerSize or previewSize is not set yet");
        }
        int i = pVar.f38002d;
        int i2 = pVar.f38003e;
        int i3 = pVar2.f38002d;
        int i4 = pVar2.f38003e;
        Rect d = mVar.mo33781d(pVar);
        if (d.width() > 0 && d.height() > 0) {
            this.f30374r = d;
            this.f30376t = mo27429k(new Rect(0, 0, i3, i4), this.f30374r);
            Rect rect = new Rect(this.f30376t);
            Rect rect2 = this.f30374r;
            rect.offset(-rect2.left, -rect2.top);
            Rect rect3 = new Rect((rect.left * i) / this.f30374r.width(), (rect.top * i2) / this.f30374r.height(), (rect.right * i) / this.f30374r.width(), (rect.bottom * i2) / this.f30374r.height());
            this.f30377u = rect3;
            if (rect3.width() <= 0 || this.f30377u.height() <= 0) {
                this.f30377u = null;
                this.f30376t = null;
                Log.w(f30356D, "Preview frame is too small");
                return;
            }
            this.f30359C.mo27415a();
        }
    }

    /* renamed from: m */
    private void m38846m(C12861p pVar) {
        this.f30372p = pVar;
        C12971g gVar = this.f30360d;
        if (gVar != null && gVar.mo33734n() == null) {
            C12983m mVar = new C12983m(getDisplayRotation(), pVar);
            this.f30370n = mVar;
            mVar.mo33782e(getPreviewScalingStrategy());
            this.f30360d.mo33739x(this.f30370n);
            this.f30360d.mo33733m();
            boolean z = this.f30381y;
            if (z) {
                this.f30360d.mo33730A(z);
            }
        }
    }

    /* renamed from: o */
    private void m38847o() {
        if (this.f30360d != null) {
            Log.w(f30356D, "initCamera called twice");
            return;
        }
        C12971g n = mo27431n();
        this.f30360d = n;
        n.mo33740y(this.f30362f);
        this.f30360d.mo33736u();
        this.f30368l = getDisplayRotation();
    }

    /* renamed from: p */
    private void m38848p(Context context, AttributeSet attributeSet, int i, int i2) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        mo27436q(attributeSet);
        this.f30361e = (WindowManager) context.getSystemService("window");
        this.f30362f = new Handler(this.f30357A);
        this.f30367k = new C12859o();
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m38849w(C12861p pVar) {
        this.f30373q = pVar;
        if (this.f30372p != null) {
            m38845j();
            requestLayout();
            m38835C();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m38850z() {
        if (mo27437r() && getDisplayRotation() != this.f30368l) {
            mo27378u();
            mo27447y();
        }
    }

    public C12971g getCameraInstance() {
        return this.f30360d;
    }

    public C12978i getCameraSettings() {
        return this.f30371o;
    }

    public Rect getFramingRect() {
        return this.f30376t;
    }

    public C12861p getFramingRectSize() {
        return this.f30378v;
    }

    public double getMarginFraction() {
        return this.f30379w;
    }

    public Rect getPreviewFramingRect() {
        return this.f30377u;
    }

    public C12987q getPreviewScalingStrategy() {
        C12987q qVar = this.f30380x;
        if (qVar != null) {
            return qVar;
        }
        if (this.f30365i != null) {
            return new C12982l();
        }
        return new C12984n();
    }

    public C12861p getPreviewSize() {
        return this.f30373q;
    }

    /* renamed from: i */
    public void mo27428i(C10656f fVar) {
        this.f30369m.add(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public Rect mo27429k(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (this.f30378v != null) {
            rect3.inset(Math.max(0, (rect3.width() - this.f30378v.f38002d) / 2), Math.max(0, (rect3.height() - this.f30378v.f38003e) / 2));
            return rect3;
        }
        int min = (int) Math.min(((double) rect3.width()) * this.f30379w, ((double) rect3.height()) * this.f30379w);
        rect3.inset(min, min);
        if (rect3.height() > rect3.width()) {
            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
        }
        return rect3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Matrix mo27430l(C12861p pVar, C12861p pVar2) {
        float f;
        float f2 = ((float) pVar.f38002d) / ((float) pVar.f38003e);
        float f3 = ((float) pVar2.f38002d) / ((float) pVar2.f38003e);
        float f4 = 1.0f;
        if (f2 < f3) {
            float f5 = f3 / f2;
            f = 1.0f;
            f4 = f5;
        } else {
            f = f2 / f3;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f4, f);
        int i = pVar.f38002d;
        int i2 = pVar.f38003e;
        matrix.postTranslate((((float) i) - (((float) i) * f4)) / 2.0f, (((float) i2) - (((float) i2) * f)) / 2.0f);
        return matrix;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C12971g mo27431n() {
        C12971g gVar = new C12971g(getContext());
        gVar.mo33738w(this.f30371o);
        return gVar;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m38833A();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m38846m(new C12861p(i3 - i, i4 - i2));
        SurfaceView surfaceView = this.f30364h;
        if (surfaceView != null) {
            Rect rect = this.f30374r;
            if (rect == null) {
                surfaceView.layout(0, 0, getWidth(), getHeight());
            } else {
                surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        } else {
            TextureView textureView = this.f30365i;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.f30381y);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo27436q(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C7169o.f21212i);
        int dimension = (int) obtainStyledAttributes.getDimension(C7169o.f21214k, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(C7169o.f21213j, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f30378v = new C12861p(dimension, dimension2);
        }
        this.f30363g = obtainStyledAttributes.getBoolean(C7169o.f21216m, true);
        int integer = obtainStyledAttributes.getInteger(C7169o.f21215l, -1);
        if (integer == 1) {
            this.f30380x = new C12982l();
        } else if (integer == 2) {
            this.f30380x = new C12984n();
        } else if (integer == 3) {
            this.f30380x = new C12985o();
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo27437r() {
        return this.f30360d != null;
    }

    /* renamed from: s */
    public boolean mo27438s() {
        C12971g gVar = this.f30360d;
        return gVar == null || gVar.mo33735p();
    }

    public void setCameraSettings(C12978i iVar) {
        this.f30371o = iVar;
    }

    public void setFramingRectSize(C12861p pVar) {
        this.f30378v = pVar;
    }

    public void setMarginFraction(double d) {
        if (d < 0.5d) {
            this.f30379w = d;
            return;
        }
        throw new IllegalArgumentException("The margin fraction must be less than 0.5");
    }

    public void setPreviewScalingStrategy(C12987q qVar) {
        this.f30380x = qVar;
    }

    public void setTorch(boolean z) {
        this.f30381y = z;
        C12971g gVar = this.f30360d;
        if (gVar != null) {
            gVar.mo33730A(z);
        }
    }

    public void setUseTextureView(boolean z) {
        this.f30363g = z;
    }

    /* renamed from: t */
    public boolean mo27445t() {
        return this.f30366j;
    }

    /* renamed from: u */
    public void mo27378u() {
        TextureView textureView;
        SurfaceView surfaceView;
        C12863r.m48677a();
        Log.d(f30356D, "pause()");
        this.f30368l = -1;
        C12971g gVar = this.f30360d;
        if (gVar != null) {
            gVar.mo33732l();
            this.f30360d = null;
            this.f30366j = false;
        } else {
            this.f30362f.sendEmptyMessage(C7165k.zxing_camera_closed);
        }
        if (this.f30375s == null && (surfaceView = this.f30364h) != null) {
            surfaceView.getHolder().removeCallback(this.f30382z);
        }
        if (this.f30375s == null && (textureView = this.f30365i) != null) {
            textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
        }
        this.f30372p = null;
        this.f30373q = null;
        this.f30377u = null;
        this.f30367k.mo33527f();
        this.f30359C.mo27418d();
    }

    /* renamed from: v */
    public void mo27446v() {
        C12971g cameraInstance = getCameraInstance();
        mo27378u();
        long nanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.mo33735p() && System.nanoTime() - nanoTime <= 2000000000) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo27379x() {
    }

    /* renamed from: y */
    public void mo27447y() {
        C12863r.m48677a();
        Log.d(f30356D, "resume()");
        m38847o();
        if (this.f30375s != null) {
            m38835C();
        } else {
            SurfaceView surfaceView = this.f30364h;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f30382z);
            } else {
                TextureView textureView = this.f30365i;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        m38836D().onSurfaceTextureAvailable(this.f30365i.getSurfaceTexture(), this.f30365i.getWidth(), this.f30365i.getHeight());
                    } else {
                        this.f30365i.setSurfaceTextureListener(m38836D());
                    }
                }
            }
        }
        requestLayout();
        this.f30367k.mo33526e(getContext(), this.f30358B);
    }
}
